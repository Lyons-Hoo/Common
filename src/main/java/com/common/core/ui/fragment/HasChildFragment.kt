package com.common.core.ui.fragment

import android.os.Bundle
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

/**
 * Describe: 抽象出来的含有子碎片的碎片
 * Created by lyons on 19-8-4
 */
abstract class HasChildFragment<DataBinding : ViewDataBinding> : BasicFragment<DataBinding>() {

    protected abstract val mFragmentContainerResId : Int // 默认碎片的容器ID

    abstract val mFragments : MutableList<Fragment> // 统一管理碎片, 由子类提供具体的碎片

    private lateinit var mFragmentControlProxy : HasFragmentControllerProxy

    override fun onContentReady(savedInstanceState: Bundle?) {
        initFragmentControlProxy()
        showDefaultFragment()
    }

    private fun initFragmentControlProxy() {
        this.mFragmentControlProxy = HasFragmentControllerProxy(
            this.mFragments,
            this.childFragmentManager,
            this.mFragmentContainerResId
        )
    }

    /**
     * 设置默认的碎片
     */
    protected open fun showDefaultFragment() = showOf(0) // 默认显示第一个碎片

    protected fun getFragmentByIndex(index: Int): Fragment = this.mFragmentControlProxy.getFragmentByIndex(index)

    protected fun showOf(index: Int) = this.mFragmentControlProxy.showOf(index)

    /**
     * 根据下标显示并隐藏所有其他
     */
    protected fun hideOtherAndShowOfByIndex(show: Int) = this.mFragmentControlProxy.hideOtherAndShowOfByIndex(show)


    protected fun hideOf(index: Int) = this.mFragmentControlProxy.hideOf(index)

    override fun onDestroy() {
        super.onDestroy()
    }
}
