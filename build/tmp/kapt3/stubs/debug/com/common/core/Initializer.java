package com.common.core;

import java.lang.System;

/**
 * Describe: 初始化器，基于androidx的startUp
 * Created by Lyons on 2019/12/12
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\t0\bH\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u00a8\u0006\u000b"}, d2 = {"Lcom/common/core/Initializer;", "Landroidx/startup/Initializer;", "", "()V", "create", "context", "Landroid/content/Context;", "dependencies", "", "Ljava/lang/Class;", "installX5Chrome", "core_debug"})
public final class Initializer implements androidx.startup.Initializer<kotlin.Unit> {
    
    @java.lang.Override()
    public void create(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    /**
     * 腾讯X5浏览器
     */
    private final void installX5Chrome(android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
        return null;
    }
    
    public Initializer() {
        super();
    }
}