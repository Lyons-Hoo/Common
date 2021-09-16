package com.common.core.ui.fragment;

import java.lang.System;

/**
 * Describe: 抽象出来的含有子碎片的碎片
 * Created by lyons on 19-8-4
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0006H\u0004J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0006H\u0004J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0006H\u0004J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u0012\u0010\u0017\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0016J\b\u0010\u001b\u001a\u00020\u0013H\u0014J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0006H\u0004R\u0012\u0010\u0005\u001a\u00020\u0006X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001d"}, d2 = {"Lcom/common/core/ui/fragment/HasChildFragment;", "DataBinding", "Landroidx/databinding/ViewDataBinding;", "Lcom/common/core/ui/fragment/BasicFragment;", "()V", "mFragmentContainerResId", "", "getMFragmentContainerResId", "()I", "mFragmentControlProxy", "Lcom/common/core/ui/fragment/HasFragmentControllerProxy;", "mFragments", "", "Landroidx/fragment/app/Fragment;", "getMFragments", "()Ljava/util/List;", "getFragmentByIndex", "index", "hideOf", "", "hideOtherAndShowOfByIndex", "show", "initFragmentControlProxy", "onContentReady", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "showDefaultFragment", "showOf", "core_debug"})
public abstract class HasChildFragment<DataBinding extends androidx.databinding.ViewDataBinding> extends com.common.core.ui.fragment.BasicFragment<DataBinding> {
    private com.common.core.ui.fragment.HasFragmentControllerProxy mFragmentControlProxy;
    
    protected abstract int getMFragmentContainerResId();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<androidx.fragment.app.Fragment> getMFragments();
    
    @java.lang.Override()
    public void onContentReady(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initFragmentControlProxy() {
    }
    
    /**
     * 设置默认的碎片
     */
    protected void showDefaultFragment() {
    }
    
    @org.jetbrains.annotations.NotNull()
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
    
    protected final void hideOf(int index) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public HasChildFragment() {
        super();
    }
}