package com.common.core.ui.fragment;

import java.lang.System;

/**
 * Describe: 辅助控制带有碎片的活动/碎片
 * Created by lyons on 19-8-4
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\bJ\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u0013J\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\bJ\u000e\u0010 \u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\bJ\u001e\u0010!\u001a\u00020\u001c*\u00020\u000f2\b\b\u0001\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0004H\u0002R\u0011\u0010\n\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0015\u0010\u000e\u001a\u00020\u000f8\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\u00020\u0013*\u00020\u00048\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0015\u001a\u00020\u0016*\u00020\u00048\u00c2\u0002X\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u00a8\u0006$"}, d2 = {"Lcom/common/core/ui/fragment/HasFragmentControllerProxy;", "", "mFragments", "", "Landroidx/fragment/app/Fragment;", "mFragmentManager1", "Landroidx/fragment/app/FragmentManager;", "mFragmentContainerResId", "", "(Ljava/util/List;Landroidx/fragment/app/FragmentManager;I)V", "currentShow", "getCurrentShow", "()Landroidx/fragment/app/Fragment;", "currentShowIndex", "transaction", "Landroidx/fragment/app/FragmentTransaction;", "getTransaction", "()Landroidx/fragment/app/FragmentTransaction;", "isRealAdded", "", "(Landroidx/fragment/app/Fragment;)Z", "tag1", "", "getTag1", "(Landroidx/fragment/app/Fragment;)Ljava/lang/String;", "getFragmentByIndex", "index", "hideOf", "", "force", "hideOtherAndShowOfByIndex", "show", "showOf", "safeAdd", "containerResId", "f", "core_debug"})
public final class HasFragmentControllerProxy {
    private int currentShowIndex = 0;
    private final java.util.List<androidx.fragment.app.Fragment> mFragments = null;
    private final androidx.fragment.app.FragmentManager mFragmentManager1 = null;
    private final int mFragmentContainerResId = 0;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.Fragment getCurrentShow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.Fragment getFragmentByIndex(int index) {
        return null;
    }
    
    public final void showOf(int index) {
    }
    
    private final boolean isRealAdded(androidx.fragment.app.Fragment $this$isRealAdded) {
        return false;
    }
    
    private final java.lang.String getTag1(androidx.fragment.app.Fragment $this$tag1) {
        return null;
    }
    
    private final void safeAdd(androidx.fragment.app.FragmentTransaction $this$safeAdd, @androidx.annotation.IdRes()
    int containerResId, androidx.fragment.app.Fragment f) {
    }
    
    /**
     * 根据下标显示并隐藏所有其他
     */
    public final void hideOtherAndShowOfByIndex(int show) {
    }
    
    public final void hideOf(int index, boolean force) {
    }
    
    private final androidx.fragment.app.FragmentTransaction getTransaction() {
        return null;
    }
    
    public HasFragmentControllerProxy(@org.jetbrains.annotations.NotNull()
    java.util.List<androidx.fragment.app.Fragment> mFragments, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager mFragmentManager1, int mFragmentContainerResId) {
        super();
    }
}