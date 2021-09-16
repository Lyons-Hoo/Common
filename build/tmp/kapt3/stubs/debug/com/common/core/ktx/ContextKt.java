package com.common.core.ktx;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0001\u001aD\u0010\b\u001a\u00020\u0006*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012&\u0010\t\u001a\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nj\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0006\u001a\u0014\u0010\b\u001a\u00020\u0006*\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0001\u001a!\u0010\r\u001a\u00020\u000e\"\u0006\b\u0000\u0010\u000f\u0018\u0001*\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0086\b\u001a#\u0010\r\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u000f\u0018\u0001*\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0086\b\u001a!\u0010\u0013\u001a\u00020\u000e\"\u0006\b\u0000\u0010\u000f\u0018\u0001*\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0086\b\u001a)\u0010\u0014\u001a\u00020\u000e\"\u0006\b\u0000\u0010\u000f\u0018\u0001*\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0086\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"PARAMS", "", "getIntegralActivityPath", "Landroid/content/Context;", "activityName", "lunchApp", "", "packageName", "openNativePage", "params", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "needNewTask", "startActivity", "", "TargetActivity", "Landroid/app/Activity;", "data", "Landroid/os/Bundle;", "startActivityAndFinishSelf", "startActivityForResult", "requestCode", "", "core_debug"})
public final class ContextKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PARAMS = "params";
    
    /**
     * 打开本地页面
     * @param activityName 本地页面名称
     * @return 是否打开成功
     */
    public static final boolean openNativePage(@org.jetbrains.annotations.Nullable()
    android.content.Context $this$openNativePage, @org.jetbrains.annotations.NotNull()
    java.lang.String activityName) {
        return false;
    }
    
    public static final boolean openNativePage(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$openNativePage, @org.jetbrains.annotations.NotNull()
    java.lang.String activityName, @org.jetbrains.annotations.Nullable()
    java.util.HashMap<java.lang.String, java.lang.String> params, boolean needNewTask) {
        return false;
    }
    
    /**
     * activity完全限定名
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getIntegralActivityPath(@org.jetbrains.annotations.NotNull()
    android.content.Context $this$getIntegralActivityPath, @org.jetbrains.annotations.NotNull()
    java.lang.String activityName) {
        return null;
    }
    
    /**
     * 打开手机上安装的其他app
     * @param packageName 目标应用包名
     */
    public static final boolean lunchApp(@org.jetbrains.annotations.Nullable()
    android.content.Context $this$lunchApp, @org.jetbrains.annotations.NotNull()
    java.lang.String packageName) {
        return false;
    }
}