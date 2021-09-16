package com.common.core.ui.adapter;

import java.lang.System;

/**
 * Describe: 适配器基类
 * Created by Lyons-Hoo on 2020/05/26.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00030\u0002B\u001d\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u00a2\u0006\u0002\u0010\bJ\u0012\u0010\u0010\u001a\u00020\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u0004J\u0012\u0010\u0012\u001a\u00020\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u0004J\u0012\u0010\u0013\u001a\u00020\u00052\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u0004J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u0004J\u0012\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0011\u001a\u00020\u0005H\u0004J\u001a\u0010\u0016\u001a\u00020\u00172\b\b\u0001\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0018H\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0004J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005R\u001a\u0010\t\u001a\u00020\u0005X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lcom/common/core/ui/adapter/BasicAdapter;", "Item", "Lcom/chad/library/adapter/base/BaseQuickAdapter;", "Lcom/chad/library/adapter/base/viewholder/BaseViewHolder;", "itemId", "", "data", "", "(ILjava/util/List;)V", "mSelectedPosition", "getMSelectedPosition", "()I", "setMSelectedPosition", "(I)V", "selectedPosition", "getSelectedPosition", "getColor", "id", "getDimensionPixelSize", "getDimensionPx", "getDrawable", "Landroid/graphics/drawable/Drawable;", "getString", "", "", "resources", "Landroid/content/res/Resources;", "select", "", "position", "core_debug"})
public abstract class BasicAdapter<Item extends java.lang.Object> extends com.chad.library.adapter.base.BaseQuickAdapter<Item, com.chad.library.adapter.base.viewholder.BaseViewHolder> {
    private int mSelectedPosition = -1;
    
    protected final int getMSelectedPosition() {
        return 0;
    }
    
    protected final void setMSelectedPosition(int p0) {
    }
    
    public final int getSelectedPosition() {
        return 0;
    }
    
    public final void select(int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.CharSequence getString(@androidx.annotation.StringRes()
    int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.CharSequence getString(@androidx.annotation.StringRes()
    int id, @org.jetbrains.annotations.NotNull()
    java.lang.String data) {
        return null;
    }
    
    protected final int getColor(@androidx.annotation.ColorRes()
    int id) {
        return 0;
    }
    
    protected final int getDimensionPx(@androidx.annotation.DimenRes()
    int id) {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final android.graphics.drawable.Drawable getDrawable(@androidx.annotation.DrawableRes()
    int id) {
        return null;
    }
    
    protected final int getDimensionPixelSize(@androidx.annotation.DimenRes()
    int id) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final android.content.res.Resources resources() {
        return null;
    }
    
    public BasicAdapter(@androidx.annotation.LayoutRes()
    int itemId, @org.jetbrains.annotations.NotNull()
    java.util.List<Item> data) {
        super(0, null);
    }
}