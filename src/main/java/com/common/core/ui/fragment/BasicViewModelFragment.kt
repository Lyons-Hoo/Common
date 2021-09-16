package com.common.core.ui.fragment

import android.os.Bundle
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import com.common.core.module.model.BasicViewModel
import java.lang.reflect.ParameterizedType

/**
 * Describe: 扩展了ViewModel相关函数的碎片
 * Created by lyons on 2021/09/16.
 */
abstract class BasicViewModelFragment<DataBinding : ViewDataBinding, ViewModel : BasicViewModel> : BasicFragment<DataBinding>()
{

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        if(!this.mIsCalled) observeViewModels()
        super.onActivityCreated(savedInstanceState)
    }

    @Suppress("UNCHECKED_CAST")
    protected val mViewModel : ViewModel by lazy {
        val type = this.javaClass.genericSuperclass as ParameterizedType
        val clazz = type.actualTypeArguments[1] as Class<ViewModel>
        val viewModel = ViewModelProvider(this).get(clazz)
        observeRequestState(viewModel)
        viewModel
    }

    inline fun <reified ViewModel : BasicViewModel> lazyViewModel() : Lazy<ViewModel> {
        return lazy {
            val viewModel = ViewModelProvider(this).get(ViewModel::class.java)
            observeRequestState(viewModel)
            viewModel
        }
    }

    fun <ViewModel : BasicViewModel> observeRequestState(viewModel : ViewModel) {
        viewModel.requestState.observe {
            when(it) {
                BasicViewModel.REQUEST_STATE_START -> showLoading()
                BasicViewModel.REQUEST_STATE_FINISHED -> dismissLoading()
            }
        }
    }

    protected open fun showLoading() {}
    protected open fun dismissLoading() {}

    protected open fun observeViewModels() {}
}