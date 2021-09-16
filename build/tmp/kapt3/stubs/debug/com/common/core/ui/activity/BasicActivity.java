package com.common.core.ui.activity;

import java.lang.System;

/**
 * Describe: 活动基类
 * Created by lyons on 19-7-30
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0014J\b\u0010\u0013\u001a\u00020\u000eH\u0014J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H&J\u0012\u0010\u0017\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0018\u001a\u00020\u000eH\u0014J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0016H\u0014J\b\u0010\u001b\u001a\u00020\u000eH\u0014J\u001a\u0010\u001c\u001a\u00020\u000e2\b\b\u0001\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001eJ\u0018\u0010\u001c\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010\u001f\u001a\u00020\u001eJ&\u0010\"\u001a\u00020\u000e\"\u0004\b\u0001\u0010#*\b\u0012\u0004\u0012\u0002H#0$2\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H#0&H\u0004R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u0010\u0007\u001a\u00028\u00008DX\u0084\u0084\u0002\u00a2\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\n\u00a8\u0006\'"}, d2 = {"Lcom/common/core/ui/activity/BasicActivity;", "DataBinding", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/FragmentActivity;", "()V", "mAutoSizeJob", "Lkotlinx/coroutines/Job;", "mViewBinding", "getMViewBinding$annotations", "getMViewBinding", "()Landroidx/databinding/ViewDataBinding;", "mViewBinding$delegate", "Lkotlin/Lazy;", "cancelAutoSizeJob", "", "dismissLoading", "getResources", "Landroid/content/res/Resources;", "observeEvents", "observeViewModels", "onContentReady", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "onDestroy", "onSaveInstanceState", "outState", "showLoading", "toast", "msgRes", "", "duration", "msg", "", "observe", "Data", "Landroidx/lifecycle/MutableLiveData;", "observer", "Landroidx/lifecycle/Observer;", "core_debug"})
public abstract class BasicActivity<DataBinding extends androidx.databinding.ViewDataBinding> extends androidx.fragment.app.FragmentActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mViewBinding$delegate = null;
    private kotlinx.coroutines.Job mAutoSizeJob;
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Deprecated()
    protected static void getMViewBinding$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final DataBinding getMViewBinding() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public abstract void onContentReady(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState);
    
    public final void toast(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, int duration) {
    }
    
    public final void toast(@androidx.annotation.StringRes()
    int msgRes, int duration) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.content.res.Resources getResources() {
        return null;
    }
    
    private final void cancelAutoSizeJob() {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    /**
     * 清除重复的fragment
     * @see androidx.fragment.app.FragmentActivity.onCreate
     * @see androidx.fragment.app.FragmentManagerImpl.restoreAllState
     *
     * throw new IllegalStateException("Fragment already added");
     * @see androidx.fragment.app.FragmentStore.addFragment
     */
    protected void showLoading() {
    }
    
    protected void dismissLoading() {
    }
    
    protected final <Data extends java.lang.Object>void observe(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<Data> $this$observe, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<Data> observer) {
    }
    
    protected void observeEvents() {
    }
    
    protected void observeViewModels() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public BasicActivity() {
        super();
    }
}