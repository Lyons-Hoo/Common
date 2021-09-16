package com.common.core.module.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u001c\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\bH\u00c6\u0003J>\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001\u00a2\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\u00182\b\u0010#\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010$\u001a\u00020\bH\u00d6\u0001J\t\u0010%\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u0003\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0017\u001a\u00020\u00188\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016\u00a8\u0006&"}, d2 = {"Lcom/common/core/module/model/RequestResponse;", "D", "", "data", "errorMessage", "", "message", "errorCode", "", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;I)V", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getErrorCode", "()I", "setErrorCode", "(I)V", "getErrorMessage", "()Ljava/lang/String;", "setErrorMessage", "(Ljava/lang/String;)V", "isSucceed", "", "()Z", "getMessage", "setMessage", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;I)Lcom/common/core/module/model/RequestResponse;", "equals", "other", "hashCode", "toString", "core_debug"})
public final class RequestResponse<D extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable()
    private D data;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String errorMessage;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String message;
    private int errorCode;
    
    public final boolean isSucceed() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final D getData() {
        return null;
    }
    
    public final void setData(@org.jetbrains.annotations.Nullable()
    D p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getErrorMessage() {
        return null;
    }
    
    public final void setErrorMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getErrorCode() {
        return 0;
    }
    
    public final void setErrorCode(int p0) {
    }
    
    public RequestResponse(@org.jetbrains.annotations.Nullable()
    D data, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String message, int errorCode) {
        super();
    }
    
    public RequestResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final D component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final int component4() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.common.core.module.model.RequestResponse<D> copy(@org.jetbrains.annotations.Nullable()
    D data, @org.jetbrains.annotations.NotNull()
    java.lang.String errorMessage, @org.jetbrains.annotations.NotNull()
    java.lang.String message, int errorCode) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}