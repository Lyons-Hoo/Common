package com.common.core.module

import android.text.TextUtils
import com.common.core.module.config.NetworkCommunicationConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.*
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

/**
 * Describe: 网络模块，使用时需要创建自己项目的Module
 * Created by lyons on 2020/12/03.
 */
@Module
@InstallIn(ApplicationComponent::class) // 绑定到应用的生命周期上，这样的话，对象的生命周期就是跟随应用的生命周期
class NetworkModule {

    /**
     * OkHttp provider
     */
    @Singleton
    @Provides
    fun provideOkHttpClient(config : NetworkCommunicationConfig) : OkHttpClient {
        val okHttpBuilder = OkHttpClient.Builder()
            .connectTimeout(config.connectTimeoutSeconds, TimeUnit.SECONDS)
            .readTimeout(config.readTimeoutSeconds, TimeUnit.SECONDS)
            .writeTimeout(config.writeTimeoutSeconds, TimeUnit.SECONDS)

        // 添加网络通信日志拦截器
        okHttpBuilder.addNetworkInterceptor(
            HttpLoggingInterceptor().setLevel(
                if (config.isDebug) HttpLoggingInterceptor.Level.BODY
                else HttpLoggingInterceptor.Level.NONE
            )
        )

        // 添加公共参数拦截器
        if(config.commonRequestParams.isNotEmpty()) {
            okHttpBuilder.addInterceptor(config.commonRequestParams.interceptor)
        }

        // 添加其他拦截器
        if(config.interceptors.isNotEmpty()) {
            config.interceptors.forEach {
                okHttpBuilder.addInterceptor(it)
            }
        }
        return okHttpBuilder.build()
    }

    /**
     * 请求拦截器，主要是为了添加公共参数
     */
    private inline val Map<String, String>.interceptor : Interceptor
        get() = Interceptor.invoke { chain ->
            val request = chain.request()
            val newBuilder = request.newBuilder()

            if(TextUtils.equals(request.method, "POST")) { // POST请求
                val requestBody = request.body
                newBuilder.method(
                    request.method,
                    if(requestBody is MultipartBody) newMultipartBody(requestBody)
                    else newFormBody(requestBody)
                )
            } else { // GET请求
                request.url.newBuilder().addGetQueryParams(newBuilder, this@interceptor)
            }
            chain.proceed(newBuilder.build())
        }

    /**
     * 多媒体类型的body（文件上传）
     */
    private fun Map<String, String>.newMultipartBody(oldBody : MultipartBody) : MultipartBody {
        val multipartBodyBuilder = MultipartBody.Builder()
        multipartBodyBuilder.setType("multipart/form-data".toMediaType())
        for(i in 0 until oldBody.size) {
            multipartBodyBuilder.addPart(oldBody.part(i))
        }
        // 添加公共参数
        forEach {
            multipartBodyBuilder.addFormDataPart(it.key, it.value)
        }
        return multipartBodyBuilder.build()
    }

    private fun HttpUrl.Builder.addGetQueryParams(
        requestBuilder : Request.Builder,
        commonRequestParams : Map<String, String>)
    {
        if(commonRequestParams.isNotEmpty()) {
            commonRequestParams.forEach {
                addQueryParameter(it.key, it.value)
            }
        }
        requestBuilder.url(build())
    }

    /**
     * 普通的POST请求
     */
    private fun Map<String, String>.newFormBody(oldBody : RequestBody?) : FormBody {
        val formBodyBuilder = FormBody.Builder()
        if(oldBody is FormBody) {
            // 复制已经添加的参数
            for(i in 0 until oldBody.size) {
                formBodyBuilder.add(oldBody.name(i), oldBody.value(i))
            }
        }
        // 添加公共参数
        if(isNotEmpty()) {
            forEach {
                formBodyBuilder.add(it.key, it.value)
            }
        }
        return formBodyBuilder.build()
    }

    /**
     * Retrofit provider
     */
    @Singleton
    @Provides
    fun provideRetrofit(client : OkHttpClient, config : NetworkCommunicationConfig) : Retrofit {
        return Retrofit.Builder()
            .client(client)
            .baseUrl(config.domain)
            .addConverterFactory(ScalarsConverterFactory.create()) // 服务器端有接口不规范则无法直接使用GsonConverter
            .build()
    }
}