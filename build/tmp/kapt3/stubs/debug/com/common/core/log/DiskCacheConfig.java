package com.common.core.log;

import java.lang.System;

/**
 * Describe: 管理本地磁盘缓存
 * Created by lyons on 20-4-20
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/common/core/log/DiskCacheConfig;", "", "()V", "CACHE_FOLDER_LOG", "", "createNewLogFile", "Ljava/io/File;", "cacheLogRootPath", "isTodayDate", "", "dateTimeMills", "", "logLocalPath", "context", "Landroid/content/Context;", "core_debug"})
public final class DiskCacheConfig {
    private static final java.lang.String CACHE_FOLDER_LOG = "runtime_log";
    @org.jetbrains.annotations.NotNull()
    public static final com.common.core.log.DiskCacheConfig INSTANCE = null;
    
    /**
     * 本地缓存的log日志
     */
    @org.jetbrains.annotations.NotNull()
    public final java.io.File logLocalPath(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    private final java.io.File createNewLogFile(java.io.File cacheLogRootPath) {
        return null;
    }
    
    private final boolean isTodayDate(long dateTimeMills) {
        return false;
    }
    
    private DiskCacheConfig() {
        super();
    }
}