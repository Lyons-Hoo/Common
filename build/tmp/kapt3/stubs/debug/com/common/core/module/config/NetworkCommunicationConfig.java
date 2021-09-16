package com.common.core.module.config;

import java.lang.System;

/**
 * Describe: 网络通信配置文件，统一管理接口通信所需要的相关配置
 * Created by lyons on 2020/12/03.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\u0018\u00002\u00020\u0001:\u0001\'BQ\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u000fR&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017\u00a8\u0006("}, d2 = {"Lcom/common/core/module/config/NetworkCommunicationConfig;", "", "connectTimeoutSeconds", "", "readTimeoutSeconds", "writeTimeoutSeconds", "interceptors", "", "Lokhttp3/Interceptor;", "domain", "", "commonRequestParams", "", "isDebug", "", "(JJJLjava/util/List;Ljava/lang/String;Ljava/util/Map;Z)V", "getCommonRequestParams", "()Ljava/util/Map;", "setCommonRequestParams", "(Ljava/util/Map;)V", "getConnectTimeoutSeconds", "()J", "setConnectTimeoutSeconds", "(J)V", "getDomain", "()Ljava/lang/String;", "setDomain", "(Ljava/lang/String;)V", "getInterceptors", "()Ljava/util/List;", "setInterceptors", "(Ljava/util/List;)V", "()Z", "setDebug", "(Z)V", "getReadTimeoutSeconds", "setReadTimeoutSeconds", "getWriteTimeoutSeconds", "setWriteTimeoutSeconds", "Configure", "core_debug"})
public final class NetworkCommunicationConfig {
    private long connectTimeoutSeconds;
    private long readTimeoutSeconds;
    private long writeTimeoutSeconds;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<? extends okhttp3.Interceptor> interceptors;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String domain;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.String, java.lang.String> commonRequestParams;
    private boolean isDebug;
    
    public final long getConnectTimeoutSeconds() {
        return 0L;
    }
    
    public final void setConnectTimeoutSeconds(long p0) {
    }
    
    public final long getReadTimeoutSeconds() {
        return 0L;
    }
    
    public final void setReadTimeoutSeconds(long p0) {
    }
    
    public final long getWriteTimeoutSeconds() {
        return 0L;
    }
    
    public final void setWriteTimeoutSeconds(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<okhttp3.Interceptor> getInterceptors() {
        return null;
    }
    
    public final void setInterceptors(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends okhttp3.Interceptor> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDomain() {
        return null;
    }
    
    public final void setDomain(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.String> getCommonRequestParams() {
        return null;
    }
    
    public final void setCommonRequestParams(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.String> p0) {
    }
    
    public final boolean isDebug() {
        return false;
    }
    
    public final void setDebug(boolean p0) {
    }
    
    private NetworkCommunicationConfig(long connectTimeoutSeconds, long readTimeoutSeconds, long writeTimeoutSeconds, java.util.List<? extends okhttp3.Interceptor> interceptors, java.lang.String domain, java.util.Map<java.lang.String, java.lang.String> commonRequestParams, boolean isDebug) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010$\u001a\u00020%R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000e\u00a8\u0006&"}, d2 = {"Lcom/common/core/module/config/NetworkCommunicationConfig$Configure;", "", "()V", "commonRequestParams", "", "", "getCommonRequestParams", "()Ljava/util/Map;", "communicationTimeoutSeconds", "", "connectTimeoutSeconds", "getConnectTimeoutSeconds", "()J", "setConnectTimeoutSeconds", "(J)V", "domain", "getDomain", "()Ljava/lang/String;", "setDomain", "(Ljava/lang/String;)V", "interceptors", "", "Lokhttp3/Interceptor;", "getInterceptors", "()Ljava/util/List;", "isDebug", "", "()Z", "setDebug", "(Z)V", "readTimeoutSeconds", "getReadTimeoutSeconds", "setReadTimeoutSeconds", "writeTimeoutSeconds", "getWriteTimeoutSeconds", "setWriteTimeoutSeconds", "config", "Lcom/common/core/module/config/NetworkCommunicationConfig;", "core_debug"})
    public static final class Configure {
        private final long communicationTimeoutSeconds = 15L;
        private long connectTimeoutSeconds;
        private long readTimeoutSeconds;
        private long writeTimeoutSeconds;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<okhttp3.Interceptor> interceptors = null;
        @org.jetbrains.annotations.NotNull()
        private java.lang.String domain = "";
        @org.jetbrains.annotations.NotNull()
        private final java.util.Map<java.lang.String, java.lang.String> commonRequestParams = null;
        private boolean isDebug = false;
        
        public final long getConnectTimeoutSeconds() {
            return 0L;
        }
        
        public final void setConnectTimeoutSeconds(long p0) {
        }
        
        public final long getReadTimeoutSeconds() {
            return 0L;
        }
        
        public final void setReadTimeoutSeconds(long p0) {
        }
        
        public final long getWriteTimeoutSeconds() {
            return 0L;
        }
        
        public final void setWriteTimeoutSeconds(long p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<okhttp3.Interceptor> getInterceptors() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDomain() {
            return null;
        }
        
        public final void setDomain(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.Map<java.lang.String, java.lang.String> getCommonRequestParams() {
            return null;
        }
        
        public final boolean isDebug() {
            return false;
        }
        
        public final void setDebug(boolean p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.common.core.module.config.NetworkCommunicationConfig config() {
            return null;
        }
        
        public Configure() {
            super();
        }
    }
}