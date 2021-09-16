package com.common.core.module.datasource;

import java.lang.System;

/**
 * Describe: 远程数据源基类
 * Created by lyons on 2020/12/08.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J7\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00122\u001e\b\u0004\u0010\u0013\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014H\u0086H\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017JE\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001a0\u00190\u0012\"\u0006\b\u0000\u0010\u001a\u0018\u00012\u001e\b\u0004\u0010\u0013\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014H\u0086H\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J?\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0012\"\u0006\b\u0000\u0010\u001a\u0018\u00012\u001e\b\u0004\u0010\u0013\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0014H\u0086H\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u000e\u0010\u001c\u001a\u00020\u001d*\u00060\rj\u0002`\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\b*\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u00020\t*\u00060\rj\u0002`\u000e8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/common/core/module/datasource/RemoteDataSource;", "Lcom/common/core/module/datasource/Repository;", "successCode", "", "(I)V", "getSuccessCode", "()I", "basicResponse", "Lcom/common/core/module/model/BasicResponse;", "", "getBasicResponse", "(Ljava/lang/String;)Lcom/common/core/module/model/BasicResponse;", "errorMessage", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getErrorMessage", "(Ljava/lang/Exception;)Ljava/lang/String;", "request", "Lcom/common/core/module/model/RequestResponse;", "action", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestAndParse2List", "", "Data", "requestAndParse2Obj", "isNetworkException", "", "core_debug"})
public class RemoteDataSource extends com.common.core.module.datasource.Repository {
    private final int successCode = 0;
    
    /**
     * 发起请求，第一层
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object request(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.lang.String>, ? extends java.lang.Object> action, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.common.core.module.model.RequestResponse<java.lang.String>> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.common.core.module.model.BasicResponse getBasicResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$basicResponse) {
        return null;
    }
    
    /**
     * 是否是网络异常
     */
    public final boolean isNetworkException(@org.jetbrains.annotations.NotNull()
    java.lang.Exception $this$isNetworkException) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.Exception $this$errorMessage) {
        return null;
    }
    
    public final int getSuccessCode() {
        return 0;
    }
    
    public RemoteDataSource(int successCode) {
        super();
    }
    
    public RemoteDataSource() {
        super();
    }
}