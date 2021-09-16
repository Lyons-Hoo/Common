package com.common.core.module.datasource

import com.common.core.module.ktx.parse2List1
import com.common.core.module.ktx.parse2Object
import com.common.core.module.model.BasicResponse
import com.common.core.module.model.DefaultResponse
import com.common.core.module.model.RequestResponse
import kotlinx.coroutines.delay
import org.json.JSONException
import org.json.JSONObject
import retrofit2.HttpException
import java.net.SocketException
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import java.net.UnknownServiceException
import javax.net.ssl.SSLException
import javax.net.ssl.SSLHandshakeException

/**
 * Describe: 远程数据源基类
 * Created by lyons on 2020/12/08.
 */
open class RemoteDataSource(val successCode : Int = 200/*默认请求成功code码*/) : Repository() {

    /**
     * 发起请求，第一层
     */
    suspend inline fun request(crossinline action: suspend () -> String) : RequestResponse<String> {
        val response = RequestResponse("")
        try { response.data = action() }
        catch (e : Exception) {
            response.errorMessage = e.errorMessage
        }
        return response
    }

    /**
     * 请求并将响应结果解析成指定对象类型，第二层
     */
    suspend inline fun <reified Data> requestAndParse2Obj(crossinline action: suspend () -> String) : RequestResponse<Data>
    {
        return withContextInIO { // 整个请求+解析数据过程，运行在IO协程中
            val requestResponse = RequestResponse<Data>() // 用来包装最后的响应结果，因为需要返回结果统一
            val response = request(action) // 请求结果
            // 赋值给最终的响应结果
            requestResponse.errorCode = response.errorCode
            requestResponse.errorMessage = response.errorMessage

            response.data?.let {
                if(it.isNotEmpty()) {
                    val basicResponse = it.basicResponse // 转换成基本响应结构体
                    if(basicResponse.c == successCode) { // 业务请求成功
                        requestResponse.data = basicResponse.d.parse2Object<Data>() // 拿到解析后的实体
                        requestResponse.message = basicResponse.m // 业务提示信息
                    } else { // 请求 业务失败，将错误码以及信息绑定到响应中
                        requestResponse.errorCode = basicResponse.c
                        requestResponse.errorMessage = basicResponse.m // 业务错误信息
                    }
                }
            }
            requestResponse
        }
    }

    /**
     * 请求并将响应结果解析成指定对象类型的集合，第二层
     */
    suspend inline fun <reified Data> requestAndParse2List(crossinline action : suspend () -> String) : RequestResponse<MutableList<Data>>
    {
        return withContextInIO { // 整个请求+解析数据过程，运行在IO协程中
            val requestResponse = RequestResponse<MutableList<Data>>() // 用来包装最后的响应结果，因为需要返回结果统一
            val response = request(action) // 请求结果
            // 赋值给最终的响应结果
            requestResponse.errorCode = response.errorCode
            requestResponse.errorMessage = response.errorMessage

            response.data?.let {
                if(it.isNotEmpty()) {
                    val basicResponse = it.basicResponse // 转换成基本响应结构体
                    if(basicResponse.c == successCode) { // 业务请求成功
                        requestResponse.message = basicResponse.m // 业务提示信息
                        requestResponse.data = basicResponse.d.parse2List1() // 拿到解析后的实体
                    } else { // 请求 业务失败，将错误码以及信息绑定到响应中
                        requestResponse.errorCode = basicResponse.c
                        requestResponse.errorMessage = basicResponse.m // 业务错误信息
                    }
                }
            }
            requestResponse
        }
    }

    /**
     * 不能添加访问修饰符，也就是说必须是public的，否则会报什么无法进入的异常
     * 猜测原因是：访问这个扩展字段是在一个block里
     */
    open val String.basicResponse : BasicResponse
        get() {
            val basicResponse = DefaultResponse()
            if(this.isNotEmpty()) {
                val jsonObject: JSONObject? = try { JSONObject(this) }
                catch (e: JSONException) { null }
                jsonObject?.let {
                    basicResponse.code = jsonObject.optInt("code")
                    basicResponse.message = jsonObject.optString("message")
                    basicResponse.data = jsonObject.optString("data")
                }
            }
            return basicResponse
        }

    /**
     * 是否是网络异常
     */
    fun Exception.isNetworkException() : Boolean {
        return (
                this is SocketException ||
                        this is SocketTimeoutException ||
                        this is SSLException ||
                        this is SSLHandshakeException ||
                        this is UnknownHostException ||
                        this is UnknownServiceException
                )
    }

    open val Exception.errorMessage : String
        get() {
            return when {
                this.isNetworkException() -> "当前网络环境不太稳定哦！"
                this is HttpException -> if(this.code() > 499) "服务器又开小差啦~" else this.message()
                else -> this.message ?: "发生了一些未知错误!"
            }
        }
}