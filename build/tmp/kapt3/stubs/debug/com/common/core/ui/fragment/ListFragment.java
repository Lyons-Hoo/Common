package com.common.core.ui.fragment;

import java.lang.System;

/**
 * Created by Lyons-Hoo on 2020/05/14.
 * Describe: 抽象出来的列表碎片
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\'\u001a\u00020(H\u0014J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\bH$J\b\u0010*\u001a\u00020(H\u0004J\b\u0010+\u001a\u00020(H\u0004J\u0012\u0010,\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0010\u0010/\u001a\u00020(2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020(2\u0006\u00100\u001a\u000201H\u0016J\b\u00103\u001a\u00020(H\u0004R!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000e8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0012X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00188DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001c8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020 8\u0014X\u0095D\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010#\u001a\u0004\u0018\u00010$8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010&\u00a8\u00064"}, d2 = {"Lcom/common/core/ui/fragment/ListFragment;", "ItemData", "Lcom/common/core/ui/fragment/BasicFragment;", "Lcom/common/core/databinding/FragmentListBinding;", "Lcom/scwang/smartrefresh/layout/listener/OnRefreshListener;", "Lcom/scwang/smartrefresh/layout/listener/OnLoadMoreListener;", "()V", "mAdapter", "Lcom/common/core/ui/adapter/BasicAdapter;", "getMAdapter", "()Lcom/common/core/ui/adapter/BasicAdapter;", "mAdapter$delegate", "Lkotlin/Lazy;", "mDataContainer", "Landroidx/recyclerview/widget/RecyclerView;", "getMDataContainer", "()Landroidx/recyclerview/widget/RecyclerView;", "mEnableLoadMore", "", "getMEnableLoadMore", "()Z", "mEnableRefresh", "getMEnableRefresh", "mRefreshFooter", "Lcom/scwang/smartrefresh/layout/footer/ClassicsFooter;", "getMRefreshFooter", "()Lcom/scwang/smartrefresh/layout/footer/ClassicsFooter;", "mRefreshHeader", "Lcom/scwang/smartrefresh/header/MaterialHeader;", "getMRefreshHeader", "()Lcom/scwang/smartrefresh/header/MaterialHeader;", "mRefreshHeaderColor", "", "getMRefreshHeaderColor", "()I", "mRefreshLayout", "Lcom/scwang/smartrefresh/layout/SmartRefreshLayout;", "getMRefreshLayout", "()Lcom/scwang/smartrefresh/layout/SmartRefreshLayout;", "configListContainer", "", "createAdapter", "disableLoadMore", "disableRefresh", "onContentReady", "savedInstanceState", "Landroid/os/Bundle;", "onLoadMore", "refreshLayout", "Lcom/scwang/smartrefresh/layout/api/RefreshLayout;", "onRefresh", "stopRefreshAndLoadMore", "core_debug"})
public abstract class ListFragment<ItemData extends java.lang.Object> extends com.common.core.ui.fragment.BasicFragment<com.common.core.databinding.FragmentListBinding> implements com.scwang.smartrefresh.layout.listener.OnRefreshListener, com.scwang.smartrefresh.layout.listener.OnLoadMoreListener {
    private final boolean mEnableRefresh = true;
    private final boolean mEnableLoadMore = true;
    @androidx.annotation.ColorInt()
    private final int mRefreshHeaderColor = android.graphics.Color.DKGRAY;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mAdapter$delegate = null;
    
    protected boolean getMEnableRefresh() {
        return false;
    }
    
    protected boolean getMEnableLoadMore() {
        return false;
    }
    
    protected int getMRefreshHeaderColor() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final com.scwang.smartrefresh.layout.SmartRefreshLayout getMRefreshLayout() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final com.scwang.smartrefresh.header.MaterialHeader getMRefreshHeader() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final com.scwang.smartrefresh.layout.footer.ClassicsFooter getMRefreshFooter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final androidx.recyclerview.widget.RecyclerView getMDataContainer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.common.core.ui.adapter.BasicAdapter<ItemData> getMAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onContentReady(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    protected void configListContainer() {
    }
    
    protected final void disableRefresh() {
    }
    
    protected final void disableLoadMore() {
    }
    
    protected final void stopRefreshAndLoadMore() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract com.common.core.ui.adapter.BasicAdapter<ItemData> createAdapter();
    
    @java.lang.Override()
    public void onRefresh(@org.jetbrains.annotations.NotNull()
    com.scwang.smartrefresh.layout.api.RefreshLayout refreshLayout) {
    }
    
    @java.lang.Override()
    public void onLoadMore(@org.jetbrains.annotations.NotNull()
    com.scwang.smartrefresh.layout.api.RefreshLayout refreshLayout) {
    }
    
    public ListFragment() {
        super();
    }
}