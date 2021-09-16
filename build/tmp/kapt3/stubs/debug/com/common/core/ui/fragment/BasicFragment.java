package com.common.core.ui.fragment;

import java.lang.System;

/**
 * Describe: 碎片基类, 所有在碎片中访问view的代码，都应该使用 空安全 的访问方式：?.
 * Created by lyons on 20-4-15
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\u001b\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0016\"\n\b\u0001\u0010\u0017\u0018\u0001*\u00020\u0018H\u0086\bJ\b\u0010\u0019\u001a\u00020\u0014H\u0014J\u001d\u0010\u001a\u001a\u00020\u0014\"\b\b\u0001\u0010\u0017*\u00020\u00182\u0006\u0010\u001b\u001a\u0002H\u0017\u00a2\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0014H\u0014J\u0012\u0010\u001e\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0006H\u0016J\u0012\u0010#\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010 H&J&\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010*\u001a\u00020\u0014H\u0016J\b\u0010+\u001a\u00020\u0014H\u0016J\u0010\u0010,\u001a\u00020\u00142\u0006\u0010-\u001a\u00020 H\u0016J\b\u0010.\u001a\u00020\u0014H\u0014J\u001d\u0010/\u001a\u00020\u0014\"\u0006\b\u0001\u00100\u0018\u00012\n\b\u0002\u00101\u001a\u0004\u0018\u00010 H\u0086\bJ\u001d\u00102\u001a\u00020\u0014\"\u0006\b\u0001\u00100\u0018\u00012\n\b\u0002\u00101\u001a\u0004\u0018\u00010 H\u0086\bJ%\u00103\u001a\u00020\u0014\"\u0006\b\u0001\u00100\u0018\u00012\u0006\u00104\u001a\u0002052\n\b\u0002\u00101\u001a\u0004\u0018\u00010 H\u0086\bJ\u001a\u00106\u001a\u00020\u00142\b\b\u0001\u00107\u001a\u0002052\b\b\u0002\u00108\u001a\u000205J\u0018\u00106\u001a\u00020\u00142\u0006\u00109\u001a\u00020:2\b\b\u0002\u00108\u001a\u000205J&\u0010;\u001a\u00020\u0014\"\u0004\b\u0001\u0010<*\b\u0012\u0004\u0012\u0002H<0=2\f\u0010>\u001a\b\u0012\u0004\u0012\u0002H<0?H\u0004R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0004\u0018\u00018\u0000X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006@"}, d2 = {"Lcom/common/core/ui/fragment/BasicFragment;", "DataBinding", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/Fragment;", "()V", "mHost", "Landroid/app/Activity;", "getMHost", "()Landroid/app/Activity;", "setMHost", "(Landroid/app/Activity;)V", "mIsCalled", "", "mViewBinding", "getMViewBinding", "()Landroidx/databinding/ViewDataBinding;", "setMViewBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "dismissLoading", "", "lazyViewModel", "Lkotlin/Lazy;", "ViewModel", "Lcom/common/core/module/model/BasicViewModel;", "observeEvents", "observeRequestState", "viewModel", "(Lcom/common/core/module/model/BasicViewModel;)V", "observeViewModels", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "activity", "onContentReady", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onDetach", "onSaveInstanceState", "outState", "showLoading", "startActivity", "Activity", "data", "startActivityAndFinishHost", "startActivityForResult", "requestCode", "", "toast", "msgRes", "duration", "msg", "", "observe", "Data", "Landroidx/lifecycle/MutableLiveData;", "observer", "Landroidx/lifecycle/Observer;", "core_debug"})
public abstract class BasicFragment<DataBinding extends androidx.databinding.ViewDataBinding> extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private DataBinding mViewBinding;
    @org.jetbrains.annotations.Nullable()
    private android.app.Activity mHost;
    private boolean mIsCalled = false;
    
    @org.jetbrains.annotations.Nullable()
    protected final DataBinding getMViewBinding() {
        return null;
    }
    
    protected final void setMViewBinding(@org.jetbrains.annotations.Nullable()
    DataBinding p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final android.app.Activity getMHost() {
        return null;
    }
    
    protected final void setMHost(@org.jetbrains.annotations.Nullable()
    android.app.Activity p0) {
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    /**
     * 强制在宿主创建完毕后进行操作
     */
    public abstract void onContentReady(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState);
    
    public final void toast(@org.jetbrains.annotations.NotNull()
    java.lang.String msg, int duration) {
    }
    
    public final void toast(@androidx.annotation.StringRes()
    int msgRes, int duration) {
    }
    
    public final <ViewModel extends com.common.core.module.model.BasicViewModel>void observeRequestState(@org.jetbrains.annotations.NotNull()
    ViewModel viewModel) {
    }
    
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
    
    /**
     * [@Link https://stackoverflow.com/questions/8748064/starting-activity-from-fragment-causes-nullpointerexception]
     */
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    public BasicFragment() {
        super();
    }
}