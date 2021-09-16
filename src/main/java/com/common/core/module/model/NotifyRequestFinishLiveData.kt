package com.common.core.module.model

import androidx.lifecycle.MutableLiveData

/**
 * Describe: 请求结束会发通知
 * Created by lyons on 2021/05/08.
 */
class NotifyRequestFinishLiveData<Data>(private val requestStateLiveData: MutableLiveData<Int>) : MutableLiveData<Data>() {

    override fun setValue(value: Data) {
        super.setValue(value)
        requestStateLiveData.value = BasicViewModel.REQUEST_STATE_FINISHED
    }

    override fun postValue(value: Data) {
        super.postValue(value)
        requestStateLiveData.postValue(BasicViewModel.REQUEST_STATE_FINISHED)
    }
}