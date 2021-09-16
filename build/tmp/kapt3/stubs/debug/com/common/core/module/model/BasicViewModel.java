package com.common.core.module.model;

import java.lang.System;

/**
 * Describe:
 * Created by lyons on 2020/12/07.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005\u00a2\u0006\u0002\u0010\u0002JC\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\'\u0010\u0010\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0011\u00a2\u0006\u0002\b\u0016H\u0004\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u0019\"\u0004\b\u0000\u0010\u001aH\u0004J\b\u0010\u001b\u001a\u00020\u0014H\u0004J\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u001a0\u001d\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u0002H\u001a0\u001dR\u0014\u0010\u0003\u001a\u00020\u0004X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/common/core/module/model/BasicViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "remoteDataSource", "Lcom/common/core/module/datasource/RemoteDataSource;", "getRemoteDataSource", "()Lcom/common/core/module/datasource/RemoteDataSource;", "requestState", "Landroidx/lifecycle/MutableLiveData;", "", "getRequestState", "()Landroidx/lifecycle/MutableLiveData;", "launch", "Lkotlinx/coroutines/Job;", "isNotifyRequestState", "", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "liveData", "Lcom/common/core/module/model/NotifyRequestFinishLiveData;", "Data", "notifyRequestStart", "showMsgWhenRequestFailed", "Lcom/common/core/module/model/RequestResponse;", "Companion", "core_debug"})
public class BasicViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> requestState = null;
    @org.jetbrains.annotations.NotNull()
    private final com.common.core.module.datasource.RemoteDataSource remoteDataSource = null;
    public static final int REQUEST_STATE_START = 0;
    public static final int REQUEST_STATE_FINISHED = 1;
    @org.jetbrains.annotations.NotNull()
    public static final com.common.core.module.model.BasicViewModel.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getRequestState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected com.common.core.module.datasource.RemoteDataSource getRemoteDataSource() {
        return null;
    }
    
    protected final void notifyRequestStart() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final <Data extends java.lang.Object>com.common.core.module.model.NotifyRequestFinishLiveData<Data> liveData() {
        return null;
    }
    
    /**
     * 默认从主线程启动协程
     */
    @org.jetbrains.annotations.NotNull()
    protected final kotlinx.coroutines.Job launch(boolean isNotifyRequestState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> block) {
        return null;
    }
    
    /**
     * 请求失败时显示错误信息（其实不合理，ui相关的不应该出现在viewModel中）
     */
    @org.jetbrains.annotations.NotNull()
    public final <Data extends java.lang.Object>com.common.core.module.model.RequestResponse<Data> showMsgWhenRequestFailed(@org.jetbrains.annotations.NotNull()
    com.common.core.module.model.RequestResponse<Data> $this$showMsgWhenRequestFailed) {
        return null;
    }
    
    public BasicViewModel() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/common/core/module/model/BasicViewModel$Companion;", "", "()V", "REQUEST_STATE_FINISHED", "", "REQUEST_STATE_START", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}