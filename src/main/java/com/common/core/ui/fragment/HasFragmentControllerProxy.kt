package com.common.core.ui.fragment

import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.common.core.log.RTLogger

/**
 * Describe: 辅助控制带有碎片的活动/碎片
 * Created by lyons on 19-8-4
 */
class HasFragmentControllerProxy(
    private val mFragments : MutableList<Fragment>, /* 统一管理碎片, 由子类提供具体的碎片 */
    private val mFragmentManager1: FragmentManager, /* 碎片事务 */
    private val mFragmentContainerResId : Int /* 碎片的容器ID */
) {

    private var currentShowIndex = 0

    val currentShow : Fragment
        get() = this.getFragmentByIndex(this.currentShowIndex)

    fun getFragmentByIndex(index: Int): Fragment {
        var index1 = index
        if (index1 < 0) index1 = 0
        else if (index1 > this.mFragments.size - 1)
            index1 = this.mFragments.size - 1
        return this.mFragments[index1]
    }

    fun showOf(index: Int) {
        val fragment = getFragmentByIndex(index)
        val transaction = this.transaction
        this.currentShowIndex = index
        if (fragment.isRealAdded) {
            transaction.show(fragment)
        } else {
            transaction.safeAdd(this.mFragmentContainerResId, fragment)
        }
        transaction.commitNowAllowingStateLoss()
    }

    private inline val Fragment.isRealAdded : Boolean
        get() {
            val isAdded = mFragmentManager1.fragments.contains(this)
            val isInCache = mFragmentManager1.findFragmentByTag(this.tag1) != null
            return isAdded || isInCache // 不在fragmentManager的缓存中，才认为处于没有添加状态
        }
    private inline val Fragment.tag1 : String
        get() = "${this.javaClass.simpleName}@${hashCode()}"

    private fun FragmentTransaction.safeAdd(@IdRes containerResId : Int, f : Fragment) {
        try { this.add(containerResId, f, f.tag1) }
        catch (e : IllegalStateException) {
            RTLogger.e(this.javaClass.simpleName, "safeAdd", e.localizedMessage ?: "unknown error")
        }
    }

    /**
     * 根据下标显示并隐藏所有其他
     */
    fun hideOtherAndShowOfByIndex(show: Int) {
        for (i in this.mFragments.indices) {
            if (i == show) this.showOf(i)
            else this.hideOf(i)
        }
    }

    fun hideOf(index: Int, force : Boolean = false) {
        val fragment = getFragmentByIndex(index)
        if (force || fragment.isAdded)
            this.transaction
                .hide(fragment)
                .commitNowAllowingStateLoss()
    }

    private inline val transaction : FragmentTransaction
        get() = this.mFragmentManager1.beginTransaction()
}