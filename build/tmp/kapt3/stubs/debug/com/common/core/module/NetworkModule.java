package com.common.core.module;

import java.lang.System;

/**
 * Describe: 网络模块，使用时需要创建自己项目的Module
 * Created by lyons on 2020/12/03.
 */
@dagger.hilt.InstallIn(value = {dagger.hilt.android.components.ApplicationComponent.class})
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J(\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\"\u0010\u0016\u001a\u00020\u0017*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J \u0010\u001a\u001a\u00020\u001b*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0018\u001a\u00020\u001bH\u0002R%\u0010\u0003\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00058\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u001c"}, d2 = {"Lcom/common/core/module/NetworkModule;", "", "()V", "interceptor", "Lokhttp3/Interceptor;", "", "", "getInterceptor", "(Ljava/util/Map;)Lokhttp3/Interceptor;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "config", "Lcom/common/core/module/config/NetworkCommunicationConfig;", "provideRetrofit", "Lretrofit2/Retrofit;", "client", "addGetQueryParams", "", "Lokhttp3/HttpUrl$Builder;", "requestBuilder", "Lokhttp3/Request$Builder;", "commonRequestParams", "newFormBody", "Lokhttp3/FormBody;", "oldBody", "Lokhttp3/RequestBody;", "newMultipartBody", "Lokhttp3/MultipartBody;", "core_debug"})
@dagger.Module()
public final class NetworkModule {
    
    /**
     * OkHttp provider
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull()
    com.common.core.module.config.NetworkCommunicationConfig config) {
        return null;
    }
    
    private final okhttp3.Interceptor getInterceptor(java.util.Map<java.lang.String, java.lang.String> $this$interceptor) {
        return null;
    }
    
    /**
     * 多媒体类型的body（文件上传）
     */
    private final okhttp3.MultipartBody newMultipartBody(java.util.Map<java.lang.String, java.lang.String> $this$newMultipartBody, okhttp3.MultipartBody oldBody) {
        return null;
    }
    
    private final void addGetQueryParams(okhttp3.HttpUrl.Builder $this$addGetQueryParams, okhttp3.Request.Builder requestBuilder, java.util.Map<java.lang.String, java.lang.String> commonRequestParams) {
    }
    
    /**
     * 普通的POST请求
     */
    private final okhttp3.FormBody newFormBody(java.util.Map<java.lang.String, java.lang.String> $this$newFormBody, okhttp3.RequestBody oldBody) {
        return null;
    }
    
    /**
     * Retrofit provider
     */
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient client, @org.jetbrains.annotations.NotNull()
    com.common.core.module.config.NetworkCommunicationConfig config) {
        return null;
    }
    
    public NetworkModule() {
        super();
    }
}