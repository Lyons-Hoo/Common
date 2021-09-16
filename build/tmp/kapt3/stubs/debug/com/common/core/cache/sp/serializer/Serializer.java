package com.common.core.cache.sp.serializer;

import java.lang.System;

/**
 * Describe: json数据解析器
 * Created by lyons on 19-7-31
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0004H&\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\bH&J,\u0010\t\u001a\n\u0012\u0004\u0012\u0002H\u0004\u0018\u00010\b\"\u0004\b\u0000\u0010\u00042\u0006\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00040\fH&J+\u0010\r\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u00042\u0006\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00040\fH&\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/common/core/cache/sp/serializer/Serializer;", "", "toJsonString", "", "O", "obj", "(Ljava/lang/Object;)Ljava/lang/String;", "objs", "", "toList", "jsonString", "clazz", "Ljava/lang/Class;", "toObj", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "core_debug"})
public abstract interface Serializer {
    
    @org.jetbrains.annotations.Nullable()
    public abstract <O extends java.lang.Object>java.lang.String toJsonString(O obj);
    
    @org.jetbrains.annotations.Nullable()
    public abstract <O extends java.lang.Object>java.lang.String toJsonString(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends O> objs);
    
    @org.jetbrains.annotations.Nullable()
    public abstract <O extends java.lang.Object>O toObj(@org.jetbrains.annotations.NotNull()
    java.lang.String jsonString, @org.jetbrains.annotations.NotNull()
    java.lang.Class<O> clazz);
    
    @org.jetbrains.annotations.Nullable()
    public abstract <O extends java.lang.Object>java.util.List<O> toList(@org.jetbrains.annotations.NotNull()
    java.lang.String jsonString, @org.jetbrains.annotations.NotNull()
    java.lang.Class<O> clazz);
}