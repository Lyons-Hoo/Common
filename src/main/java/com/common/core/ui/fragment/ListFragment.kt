package com.common.core.ui.fragment

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.annotation.ColorInt
import androidx.recyclerview.widget.RecyclerView
import com.common.core.R
import com.common.core.databinding.FragmentListBinding
import com.common.core.ui.adapter.BasicAdapter
import com.common.core.ui.ktx.verticalLayout
import com.scwang.smartrefresh.header.MaterialHeader
import com.scwang.smartrefresh.layout.SmartRefreshLayout
import com.scwang.smartrefresh.layout.api.RefreshLayout
import com.scwang.smartrefresh.layout.footer.ClassicsFooter
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener
import com.scwang.smartrefresh.layout.listener.OnRefreshListener

/**
 * Created by Lyons-Hoo on 2020/05/14.
 * Describe: 抽象出来的列表碎片
 */
abstract class ListFragment<ItemData> : BasicFragment<FragmentListBinding>(), OnRefreshListener, OnLoadMoreListener {

    protected open val mEnableRefresh = true
    protected open val mEnableLoadMore = true
    @ColorInt
    protected open val mRefreshHeaderColor = Color.DKGRAY

    protected val mRefreshLayout : SmartRefreshLayout?
        get() = this.mViewBinding?.srlContainer

    protected val mRefreshHeader : MaterialHeader?
        get() = this.mViewBinding?.rfHeader

    protected val mRefreshFooter : ClassicsFooter?
        get() = this.mViewBinding?.rfFooter

    protected val mDataContainer : RecyclerView?
        get() = this.mViewBinding?.rvData

    protected val mAdapter : BasicAdapter<ItemData> by lazy { createAdapter() }

    override fun onContentReady(savedInstanceState: Bundle?) {

        // -0xff6634, -0xbbbc, -0x996700, -0x559934, -0x7800
        this.mRefreshHeader?.setColorSchemeColors(this.mRefreshHeaderColor)

        if(this.mEnableRefresh) {
            this.mRefreshLayout?.setEnableRefresh(true)
            this.mRefreshLayout?.setOnRefreshListener(this)
        } else disableRefresh()

        if(this.mEnableLoadMore) {
            this.mRefreshLayout?.setEnableLoadMore(true)
            this.mRefreshLayout?.setOnLoadMoreListener(this)
            this.mRefreshLayout?.setEnableAutoLoadMore(false)
        } else disableLoadMore()

        configListContainer()
    }

    protected open fun configListContainer() {
        this.mDataContainer?.let {
            this.mAdapter.recyclerView = it.verticalLayout() // RecyclerView has no LayoutManager Exception
            this.mAdapter.setEmptyView(R.layout.layout_list_empty_data_default)
            it.adapter = this.mAdapter
        }
    }

    protected fun disableRefresh() {
        this.mRefreshLayout?.setEnableRefresh(false)
        this.mRefreshLayout?.setOnRefreshListener(null)
    }

    protected fun disableLoadMore() {
        this.mRefreshLayout?.setEnableLoadMore(false)
        this.mRefreshLayout?.setOnLoadMoreListener(null)
        this.mRefreshFooter?.visibility = View.GONE
    }

    protected fun stopRefreshAndLoadMore() {
        this.mRefreshLayout?.finishLoadMore()
        this.mRefreshLayout?.finishRefresh()
    }

    protected abstract fun createAdapter() : BasicAdapter<ItemData>

    override fun onRefresh(refreshLayout: RefreshLayout) {
    }

    override fun onLoadMore(refreshLayout: RefreshLayout) {
    }
}