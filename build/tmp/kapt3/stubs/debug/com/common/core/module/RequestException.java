package com.common.core.module;

import java.lang.System;

/**
 * Describe: 描述网络通信请求异常
 * Created by lyons on 19-7-31
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/common/core/module/RequestException;", "Ljava/lang/RuntimeException;", "errorMsg", "", "errorCode", "", "(Ljava/lang/String;I)V", "getErrorCode", "core_debug"})
public class RequestException extends java.lang.RuntimeException {
    private final int errorCode = 0;
    
    public final int getErrorCode() {
        return 0;
    }
    
    public RequestException(@org.jetbrains.annotations.NotNull()
    java.lang.String errorMsg, int errorCode) {
        super();
    }
}