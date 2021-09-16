package com.common.core.module.model;

import java.lang.System;

/**
 * Describe: 请求结束会发通知
 * Created by lyons on 2021/05/08.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0002\u00a2\u0006\u0002\u0010\u0005J\u0015\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00028\u0000H\u0016\u00a2\u0006\u0002\u0010\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/common/core/module/model/NotifyRequestFinishLiveData;", "Data", "Landroidx/lifecycle/MutableLiveData;", "requestStateLiveData", "", "(Landroidx/lifecycle/MutableLiveData;)V", "postValue", "", "value", "(Ljava/lang/Object;)V", "setValue", "core_debug"})
public final class NotifyRequestFinishLiveData<Data extends java.lang.Object> extends androidx.lifecycle.MutableLiveData<Data> {
    private final androidx.lifecycle.MutableLiveData<java.lang.Integer> requestStateLiveData = null;
    
    @java.lang.Override()
    public void setValue(Data value) {
    }
    
    @java.lang.Override()
    public void postValue(Data value) {
    }
    
    public NotifyRequestFinishLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> requestStateLiveData) {
        super(null);
    }
}