package com.common.core.log;

import java.lang.System;

/**
 * Describe:the runtime logger
 * Created by lyons on 19-7-30
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020%H\u0002J\"\u0010)\u001a\u00020\'2\u0006\u0010$\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010*\u001a\u00020\u0013J*\u0010+\u001a\u00020\'2\u0006\u0010$\u001a\u00020%2\u0006\u0010,\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010-\u001a\u00020\u0013J\u001c\u0010.\u001a\u00020\'2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0012\u00103\u001a\u00020\'2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0012\u00104\u001a\u00020\'2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0012\u00105\u001a\u00020\'2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u001c\u00106\u001a\u00020\'2\b\u0010/\u001a\u0004\u0018\u0001002\b\u00107\u001a\u0004\u0018\u000102H\u0016J\u0012\u00108\u001a\u00020\'2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0012\u00109\u001a\u00020\'2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u000e\u0010:\u001a\u00020\'2\u0006\u0010;\u001a\u00020<J\b\u0010=\u001a\u00020\'H\u0002J\u000e\u0010>\u001a\u00020\'2\u0006\u0010;\u001a\u00020<R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R!\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\u0012\n\u0004\b\n\u0010\u000b\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\tR#\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b!\u0010\u000b\u001a\u0004\b\u001f\u0010 R\u000e\u0010\"\u001a\u00020#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006?"}, d2 = {"Lcom/common/core/log/RTLogger;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "()V", "applicationContext", "Landroid/content/Context;", "cacheTask", "Ljava/lang/Runnable;", "getCacheTask$annotations", "getCacheTask", "()Ljava/lang/Runnable;", "cacheTask$delegate", "Lkotlin/Lazy;", "cacheThread", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "getCacheThread", "()Ljava/util/concurrent/ExecutorService;", "cacheThread$delegate", "debugAble", "", "getDebugAble", "()Z", "setDebugAble", "(Z)V", "diskCacheLogger", "Lcom/common/core/log/DiskCacheLogger;", "getDiskCacheLogger", "()Lcom/common/core/log/DiskCacheLogger;", "diskCacheLogger$delegate", "memoryLogCache", "Lcom/common/core/log/LogMemoryBuffer;", "getMemoryLogCache", "()Lcom/common/core/log/LogMemoryBuffer;", "memoryLogCache$delegate", "runningActivityCount", "", "tag", "", "cacheLog", "", "log", "d", "needCacheDisk", "e", "funcName", "isNeedCacheDisk", "onActivityCreated", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "setup", "context", "Landroid/app/Application;", "submitWriteLogToDiskTask", "uninstall", "core_debug"})
public final class RTLogger implements android.app.Application.ActivityLifecycleCallbacks {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String tag = "RTLogger";
    private static boolean debugAble = true;
    private static android.content.Context applicationContext;
    private static final kotlin.Lazy diskCacheLogger$delegate = null;
    private static final kotlin.Lazy memoryLogCache$delegate = null;
    private static final kotlin.Lazy cacheThread$delegate = null;
    private static final kotlin.Lazy cacheTask$delegate = null;
    private static int runningActivityCount = 0;
    @org.jetbrains.annotations.NotNull()
    public static final com.common.core.log.RTLogger INSTANCE = null;
    
    public final boolean getDebugAble() {
        return false;
    }
    
    public final void setDebugAble(boolean p0) {
    }
    
    public final void d(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.Nullable()
    java.lang.String log, boolean needCacheDisk) {
    }
    
    public final void e(@org.jetbrains.annotations.NotNull()
    java.lang.String tag, @org.jetbrains.annotations.NotNull()
    java.lang.String funcName, @org.jetbrains.annotations.Nullable()
    java.lang.String log, boolean isNeedCacheDisk) {
    }
    
    public final void setup(@org.jetbrains.annotations.NotNull()
    android.app.Application context) {
    }
    
    public final void uninstall(@org.jetbrains.annotations.NotNull()
    android.app.Application context) {
    }
    
    private final com.common.core.log.DiskCacheLogger getDiskCacheLogger() {
        return null;
    }
    
    private final com.common.core.log.LogMemoryBuffer getMemoryLogCache() {
        return null;
    }
    
    private final java.util.concurrent.ExecutorService getCacheThread() {
        return null;
    }
    
    @kotlin.Suppress(names = {"ControlFlowWithEmptyBody"})
    @java.lang.Deprecated()
    private static void getCacheTask$annotations() {
    }
    
    private final java.lang.Runnable getCacheTask() {
        return null;
    }
    
    private final void cacheLog(java.lang.String log) {
    }
    
    private final void submitWriteLogToDiskTask() {
    }
    
    @java.lang.Override()
    public void onActivityPaused(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityResumed(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityStarted(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityDestroyed(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivitySaveInstanceState(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onActivityStopped(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private RTLogger() {
        super();
    }
}