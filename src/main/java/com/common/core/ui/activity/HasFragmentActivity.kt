package com.common.core.ui.activity

import android.os.Bundle
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.common.core.ui.fragment.HasFragmentControllerProxy

/**
 * Describe: 抽象出来的含有碎片的活动
 * Created by lyons on 19-8-4
 */
abstract class HasFragmentActivity<DataBinding : ViewDataBinding> : BasicActivity<DataBinding>() {

    protected abstract val mFragmentContainerResId : Int // 默认碎片的容器ID

    abstract val mFragments : MutableList<Fragment> // 统一管理碎片, 由子类提供具体的碎片

    private val mFragmentControlProxy by lazy {
        HasFragmentControllerProxy(
            this.mFragments,
            this.supportFragmentManager,
            this.mFragmentContainerResId
        )
    }

    override fun onContentReady(savedInstanceState: Bundle?) {
        showDefaultFragment()
    }

    val currentShow : Fragment
        get() = this.mFragmentControlProxy.currentShow

    /**
     * 设置默认的碎片
     */
    protected open fun showDefaultFragment() = showOf(0) // 默认显示第一个碎片

    protected fun getFragmentByIndex(index: Int): Fragment? = this.mFragmentControlProxy.getFragmentByIndex(index)

    protected fun showOf(index: Int) = this.mFragmentControlProxy.showOf(index)

    /**
     * 根据下标显示并隐藏所有其他
     */
    protected fun hideOtherAndShowOfByIndex(show: Int) = this.mFragmentControlProxy.hideOtherAndShowOfByIndex(show)


    protected fun hideOf(index: Int, force : Boolean = false) = this.mFragmentControlProxy.hideOf(index, force)
}