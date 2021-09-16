package com.common.core.ui.activity;

import java.lang.System;

/**
 * Describe: 带有ViewModel的活动基类
 * Created by lyons on 2021/09/16.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00030\u000e\"\n\b\u0002\u0010\u0003\u0018\u0001*\u00020\u0004H\u0086\bJ\u001d\u0010\u000f\u001a\u00020\u0010\"\b\b\u0002\u0010\u0003*\u00020\u00042\u0006\u0010\u0011\u001a\u0002H\u0003\u00a2\u0006\u0002\u0010\u0012R!\u0010\u0007\u001a\u00028\u00018DX\u0084\u0084\u0002\u00a2\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/common/core/ui/activity/BasicViewModelActivity;", "DataBinding", "Landroidx/databinding/ViewDataBinding;", "ViewModel", "Lcom/common/core/module/model/BasicViewModel;", "Lcom/common/core/ui/activity/BasicActivity;", "()V", "mViewModel", "getMViewModel$annotations", "getMViewModel", "()Lcom/common/core/module/model/BasicViewModel;", "mViewModel$delegate", "Lkotlin/Lazy;", "lazyViewModel", "Lkotlin/Lazy;", "observeRequestState", "", "viewModel", "(Lcom/common/core/module/model/BasicViewModel;)V", "core_debug"})
public abstract class BasicViewModelActivity<DataBinding extends androidx.databinding.ViewDataBinding, ViewModel extends com.common.core.module.model.BasicViewModel> extends com.common.core.ui.activity.BasicActivity<DataBinding> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mViewModel$delegate = null;
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Deprecated()
    protected static void getMViewModel$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final ViewModel getMViewModel() {
        return null;
    }
    
    public final <ViewModel extends com.common.core.module.model.BasicViewModel>void observeRequestState(@org.jetbrains.annotations.NotNull()
    ViewModel viewModel) {
    }
    
    public BasicViewModelActivity() {
        super();
    }
}