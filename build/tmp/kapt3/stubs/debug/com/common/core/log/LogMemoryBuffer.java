package com.common.core.log;

import java.lang.System;

/**
 * Describe: cache the the runtime log when need
 * Created by lyons on 20-4-20
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0006J\b\u0010\u0015\u001a\u00020\u0007H\u0002J\u0006\u0010\u0016\u001a\u00020\u0006J\u0006\u0010\u0017\u001a\u00020\u0006J\u0006\u0010\u0018\u001a\u00020\u0019R\u0012\u0010\t\u001a\u00060\nj\u0002`\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/common/core/log/LogMemoryBuffer;", "", "maxSize", "", "outOfCacheMemoryAction", "Lkotlin/Function1;", "", "", "(ILkotlin/jvm/functions/Function1;)V", "cache", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "dateTimeFormatter", "Ljava/text/SimpleDateFormat;", "getDateTimeFormatter", "()Ljava/text/SimpleDateFormat;", "dateTimeFormatter$delegate", "Lkotlin/Lazy;", "tag", "cacheLog", "log", "checkOutOfCacheMemory", "dump", "dumpCachedSize", "hasCache", "", "core_debug"})
public final class LogMemoryBuffer {
    private final java.lang.String tag = "MemoryLogCache";
    private final java.lang.StringBuilder cache = null;
    private final kotlin.Lazy dateTimeFormatter$delegate = null;
    private final int maxSize = 0;
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> outOfCacheMemoryAction = null;
    
    private final java.text.SimpleDateFormat getDateTimeFormatter() {
        return null;
    }
    
    public final synchronized void cacheLog(@org.jetbrains.annotations.NotNull()
    java.lang.String log) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final synchronized java.lang.String dump() {
        return null;
    }
    
    public final synchronized boolean hasCache() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final synchronized java.lang.String dumpCachedSize() {
        return null;
    }
    
    /**
     * @param outOfCacheMemoryAction must handle the outOfCacheMemory event,
     * because the MemoryLogCache default action will clear memory cache when out of
     */
    private final void checkOutOfCacheMemory() {
    }
    
    public LogMemoryBuffer(int maxSize, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> outOfCacheMemoryAction) {
        super();
    }
}