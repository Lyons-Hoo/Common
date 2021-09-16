package com.common.core.ui.dialog;

import java.lang.System;

/**
 * Describe:dialog基类, 基于fragment，相对减少内存泄漏的风险
 * Created by lyons on 20-4-15
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u0019\u001a\u00020\u0017H\u0014J.\u0010\u001a\u001a\u00020\u0017\"\n\b\u0001\u0010\u001b\u0018\u0001*\u00020\u001c2\u0014\b\u0004\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u0002H\u001b\u0012\u0004\u0012\u00020\u00170\u001eH\u0086\b\u00f8\u0001\u0000J\u001b\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H!0 \"\n\b\u0001\u0010!\u0018\u0001*\u00020\"H\u0086\bJ\b\u0010#\u001a\u00020\u0017H\u0014J\u001d\u0010$\u001a\u00020\u0017\"\b\b\u0001\u0010!*\u00020\"2\u0006\u0010%\u001a\u0002H!\u00a2\u0006\u0002\u0010&J\b\u0010\'\u001a\u00020\u0017H\u0014J\u0012\u0010(\u001a\u00020\u00172\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0012\u0010+\u001a\u00020\u00172\b\u0010)\u001a\u0004\u0018\u00010*H&J&\u0010,\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u0001012\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u00102\u001a\u00020\u0017H\u0016J\u000e\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u000205J\b\u00106\u001a\u00020\u0017H\u0014J\u001d\u00107\u001a\u00020\u0017\"\u0006\b\u0001\u0010\u001b\u0018\u00012\n\b\u0002\u00108\u001a\u0004\u0018\u00010*H\u0086\bJ\u001d\u00109\u001a\u00020\u0017\"\u0006\b\u0001\u0010\u001b\u0018\u00012\n\b\u0002\u00108\u001a\u0004\u0018\u00010*H\u0086\bJ%\u0010:\u001a\u00020\u0017\"\u0006\b\u0001\u0010\u001b\u0018\u00012\u0006\u0010;\u001a\u00020<2\n\b\u0002\u00108\u001a\u0004\u0018\u00010*H\u0086\bJ\u001a\u0010=\u001a\u00020\u00172\b\b\u0001\u0010>\u001a\u00020<2\b\b\u0002\u0010?\u001a\u00020<J\u0018\u0010=\u001a\u00020\u00172\u0006\u0010@\u001a\u00020A2\b\b\u0002\u0010?\u001a\u00020<J&\u0010B\u001a\u00020\u0017\"\u0004\b\u0001\u0010C*\b\u0012\u0004\u0012\u0002HC0D2\f\u0010E\u001a\b\u0012\u0004\u0012\u0002HC0FH\u0004R\u0014\u0010\u0005\u001a\u00020\u0006X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u0006X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u000e\u0010\r\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u0006X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\bR\u001e\u0010\u0010\u001a\u0004\u0018\u00018\u0000X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006G"}, d2 = {"Lcom/common/core/ui/dialog/BasicDialog;", "DataBinding", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/DialogFragment;", "()V", "mCancelAble", "", "getMCancelAble", "()Z", "mCanceledOnTouchOutside", "getMCanceledOnTouchOutside", "mFullScreen", "getMFullScreen", "mIsCalled", "mTransparent", "getMTransparent", "mViewBinding", "getMViewBinding", "()Landroidx/databinding/ViewDataBinding;", "setMViewBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "configDialog", "", "dismiss", "dismissLoading", "doInHost", "Activity", "Landroidx/fragment/app/FragmentActivity;", "action", "Lkotlin/Function1;", "lazyViewModel", "Lkotlin/Lazy;", "ViewModel", "Lcom/common/core/module/model/BasicViewModel;", "observeEvents", "observeRequestState", "viewModel", "(Lcom/common/core/module/model/BasicViewModel;)V", "observeViewModels", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onContentReady", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "show", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "showLoading", "startActivity", "data", "startActivityAndDismissSelf", "startActivityForResult", "requestCode", "", "toast", "msgRes", "duration", "msg", "", "observe", "Data", "Landroidx/lifecycle/MutableLiveData;", "observer", "Landroidx/lifecycle/Observer;", "core_debug"})
public abstract class BasicDialog<DataBinding extends androidx.databinding.ViewDataBinding> extends androidx.fragment.app.DialogFragment {
    private final boolean mFullScreen = true;
    private final boolean mTransparent = false;
    private final boolean mCanceledOnTouchOutside = true;
    private final boolean mCancelAble = true;
    @org.jetbrains.annotations.Nullable()
    private DataBinding mViewBinding;
    private boolean mIsCalled = false;
    
    protected boolean getMFullScreen() {
        return false;
    }
    
    protected boolean getMTransparent() {
        return false;
    }
    
    protected boolean getMCanceledOnTouchOutside() {
        return false;
    }
    
    protected boolean getMCancelAble() {
        return false;
    }
    
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
    
    /**
     * 强制在宿主创建完毕后进行操作
     */
    public abstract void onContentReady(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState);
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void configDialog() {
    }
    
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
    
    public final void show(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager) {
    }
    
    @java.lang.Override()
    public void dismiss() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    public BasicDialog() {
        super();
    }
}