package com.common.core.log;

import java.lang.System;

/**
 * Describe: 处理本地磁盘缓存日志
 * Created by lyons on 20-4-20
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/common/core/log/DiskCacheLogger;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "charset", "Ljava/nio/charset/Charset;", "tag", "", "read", "write", "", "log", "core_debug"})
public final class DiskCacheLogger {
    private final java.lang.String tag = "DiskCacheLogger";
    private final java.nio.charset.Charset charset = null;
    private final android.content.Context context = null;
    
    public final boolean write(@org.jetbrains.annotations.NotNull()
    java.lang.String log) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String read() {
        return null;
    }
    
    public DiskCacheLogger(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}