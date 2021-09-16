package com.common.core.module.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.common.core.module.datasource.RemoteDataSource
import com.common.core.utils.Toast1
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

/**
 * Describe:
 * Created by lyons on 2020/12/07.
 */
open class BasicViewModel : ViewModel() {

    val requestState : MutableLiveData<Int> = MutableLiveData() // 请求状态，主要是用来通知显示隐藏loading的

    protected open val remoteDataSource : RemoteDataSource = RemoteDataSource()

    protected fun notifyRequestStart() { this.requestState.value = REQUEST_STATE_START }

    protected fun <Data> liveData() = NotifyRequestFinishLiveData<Data>(this.requestState)

    /**
     * 默认从主线程启动协程
     */
    protected fun launch(isNotifyRequestState : Boolean = true, block: suspend CoroutineScope.() -> Unit) : Job {
        if(isNotifyRequestState) notifyRequestStart()
        return this.viewModelScope.launch(context = Dispatchers.Main, block = block)
    }

    /**
     * 请求失败时显示错误信息（其实不合理，ui相关的不应该出现在viewModel中）
     */
    fun <Data> RequestResponse<Data>.showMsgWhenRequestFailed() = this.also {
        if(!this.isSucceed) {
            Toast1.show(this.errorMessage)
            requestState.value = REQUEST_STATE_FINISHED // 请求失败了直接关闭弹窗
        }
    }

    companion object {
        const val REQUEST_STATE_START = 0
        const val REQUEST_STATE_FINISHED = 1
    }
}