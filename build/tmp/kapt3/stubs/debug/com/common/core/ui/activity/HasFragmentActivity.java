package com.common.core.ui.activity;

import java.lang.System;

/**
 * Describe: 抽象出来的含有碎片的活动
 * Created by lyons on 19-8-4
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\nH\u0004J\u001a\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0004J\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\nH\u0004J\u0012\u0010\u001f\u001a\u00020\u001a2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u001aH\u0014J\u0010\u0010#\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\nH\u0004R\u0011\u0010\u0005\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006$"}, d2 = {"Lcom/common/core/ui/activity/HasFragmentActivity;", "DataBinding", "Landroidx/databinding/ViewDataBinding;", "Lcom/common/core/ui/activity/BasicActivity;", "()V", "currentShow", "Landroidx/fragment/app/Fragment;", "getCurrentShow", "()Landroidx/fragment/app/Fragment;", "mFragmentContainerResId", "", "getMFragmentContainerResId", "()I", "mFragmentControlProxy", "Lcom/common/core/ui/fragment/HasFragmentControllerProxy;", "getMFragmentControlProxy", "()Lcom/common/core/ui/fragment/HasFragmentControllerProxy;", "mFragmentControlProxy$delegate", "Lkotlin/Lazy;", "mFragments", "", "getMFragments", "()Ljava/util/List;", "getFragmentByIndex", "index", "hideOf", "", "force", "", "hideOtherAndShowOfByIndex", "show", "onContentReady", "savedInstanceState", "Landroid/os/Bundle;", "showDefaultFragment", "showOf", "core_debug"})
public abstract class HasFragmentActivity<DataBinding extends androidx.databinding.ViewDataBinding> extends com.common.core.ui.activity.BasicActivity<DataBinding> {
    private final kotlin.Lazy mFragmentControlProxy$delegate = null;
    
    protected abstract int getMFragmentContainerResId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<androidx.fragment.app.Fragment> getMFragments();
    
    private final com.common.core.ui.fragment.HasFragmentControllerProxy getMFragmentControlProxy() {
        return null;
    }
    
    @java.lang.Override()
    public void onContentReady(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.Fragment getCurrentShow() {
        return null;
    }
    
    /**
     * 设置默认的碎片
     */
    protected void showDefaultFragment() {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final androidx.fragment.app.Fragment getFragmentByIndex(int index) {
        return null;
    }
    
    protected final void showOf(int index) {
    }
    
    /**
     * 根据下标显示并隐藏所有其他
     */
    protected final void hideOtherAndShowOfByIndex(int show) {
    }
    
    protected final void hideOf(int index, boolean force) {
    }
    
    public HasFragmentActivity() {
        super();
    }
}