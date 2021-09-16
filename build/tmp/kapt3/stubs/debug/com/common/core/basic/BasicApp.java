package com.common.core.basic;

import java.lang.System;

/**
 * Describe: Application基类，主要是为了避免一些bug
 * Created by lyons on 2020/09/14.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0004\u00a8\u0006\u0007"}, d2 = {"Lcom/common/core/basic/BasicApp;", "Landroidx/multidex/MultiDexApplication;", "()V", "onCreate", "", "setWebViewPath", "Companion", "core_debug"})
public class BasicApp extends androidx.multidex.MultiDexApplication {
    public static android.content.Context applicationContext;
    @org.jetbrains.annotations.NotNull()
    public static final com.common.core.basic.BasicApp.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    /**
     * Android 9.0及以上版本中，关于多进程问题对于WebView的影响
     * "Android P 以及之后版本不支持同时从多个进程使用具有相同数据目录的WebView"
     */
    protected final void setWebViewPath() {
    }
    
    public BasicApp() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/common/core/basic/BasicApp$Companion;", "", "()V", "applicationContext", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "setApplicationContext", "(Landroid/content/Context;)V", "core_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Context getApplicationContext() {
            return null;
        }
        
        public final void setApplicationContext(@org.jetbrains.annotations.NotNull()
        android.content.Context p0) {
        }
        
        private Companion() {
            super();
        }
    }
}