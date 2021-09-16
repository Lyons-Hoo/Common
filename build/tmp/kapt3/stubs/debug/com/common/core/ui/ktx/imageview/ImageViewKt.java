package com.common.core.ui.ktx.imageview;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0006\u0010\u0000\u001a\u00020\u0001\u001a\u0006\u0010\u0002\u001a\u00020\u0001\u001a0\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0014\b\u0006\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086\b\u00f8\u0001\u0000\u001a.\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0014\b\u0006\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086\b\u00f8\u0001\u0000\u001a.\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\f2\u0014\b\u0006\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086\b\u00f8\u0001\u0000\u001a0\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0014\b\u0006\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086\b\u00f8\u0001\u0000\u001a.\u0010\u000f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0014\b\u0006\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086\b\u00f8\u0001\u0000\u001a.\u0010\u0010\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\f2\u0014\b\u0006\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086\b\u00f8\u0001\u0000\u001aB\u0010\u0011\u001a\u00020\u0004*\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0014\b\u0006\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086\b\u00f8\u0001\u0000\u001a@\u0010\u0011\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0014\b\u0006\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086\b\u00f8\u0001\u0000\u001a@\u0010\u0015\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00142\u0014\b\u0006\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bH\u0086\b\u00f8\u0001\u0000\u001a8\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00180\u0017\"\u0004\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u0002H\u00180\u00172\u0014\b\u0004\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u0002H\u0018\u0012\u0004\u0012\u00020\n0\bH\u0086\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u001a"}, d2 = {"cropCircleOptions", "Lcom/bumptech/glide/request/RequestOptions;", "defaultOptions", "loadCircleLocalImage", "Landroid/widget/ImageView;", "imgRes", "", "loadSuccessAction", "Lkotlin/Function1;", "Landroid/graphics/drawable/Drawable;", "", "absPath", "", "loadCircleRemoteImage", "url", "loadLocalImage", "loadRemoteImage", "loadRoundLocalImage", "radius", "centerCrop", "", "loadRoundRemoteImage", "onLoadSuccess", "Lcom/bumptech/glide/RequestBuilder;", "T", "action", "core_debug"})
public final class ImageViewKt {
    
    /**
     * Describe: ImageView的扩展函数
     * Created by Lyons-Hoo on 2020/06/03.
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.widget.ImageView loadRemoteImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadRemoteImage, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> loadSuccessAction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.widget.ImageView loadLocalImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadLocalImage, @androidx.annotation.DrawableRes()
    int imgRes, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> loadSuccessAction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.widget.ImageView loadLocalImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadLocalImage, @org.jetbrains.annotations.NotNull()
    java.lang.String absPath, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> loadSuccessAction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.widget.ImageView loadCircleRemoteImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadCircleRemoteImage, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> loadSuccessAction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.widget.ImageView loadCircleLocalImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadCircleLocalImage, @androidx.annotation.DrawableRes()
    int imgRes, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> loadSuccessAction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.widget.ImageView loadCircleLocalImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadCircleLocalImage, @org.jetbrains.annotations.NotNull()
    java.lang.String absPath, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> loadSuccessAction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.widget.ImageView loadRoundRemoteImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadRoundRemoteImage, @org.jetbrains.annotations.NotNull()
    java.lang.String url, int radius, boolean centerCrop, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> loadSuccessAction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.widget.ImageView loadRoundLocalImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadRoundLocalImage, @androidx.annotation.DrawableRes()
    int imgRes, int radius, boolean centerCrop, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> loadSuccessAction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.widget.ImageView loadRoundLocalImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$loadRoundLocalImage, @org.jetbrains.annotations.NotNull()
    java.lang.String absPath, int radius, boolean centerCrop, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.graphics.drawable.Drawable, kotlin.Unit> loadSuccessAction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.bumptech.glide.request.RequestOptions defaultOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final com.bumptech.glide.request.RequestOptions cropCircleOptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>com.bumptech.glide.RequestBuilder<T> onLoadSuccess(@org.jetbrains.annotations.NotNull()
    com.bumptech.glide.RequestBuilder<T> $this$onLoadSuccess, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> action) {
        return null;
    }
}