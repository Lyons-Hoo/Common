package com.common.core.module.model;

import java.lang.System;

/**
 * Describe:服务器api响应实体基类
 * Created by lyons on 20-4-15
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u00020\u0004X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u00020\nX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00020\nX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000e\u00a8\u0006\u0012"}, d2 = {"Lcom/common/core/module/model/BasicResponse;", "", "()V", "c", "", "getC", "()I", "setC", "(I)V", "d", "", "getD", "()Ljava/lang/String;", "setD", "(Ljava/lang/String;)V", "m", "getM", "setM", "core_debug"})
public abstract class BasicResponse {
    
    public abstract int getC();
    
    public abstract void setC(int p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getM();
    
    public abstract void setM(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getD();
    
    public abstract void setD(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    public BasicResponse() {
        super();
    }
}