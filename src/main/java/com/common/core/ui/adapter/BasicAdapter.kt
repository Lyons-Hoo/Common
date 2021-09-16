package com.common.core.ui.adapter

import android.content.res.Resources
import android.graphics.drawable.Drawable
import androidx.annotation.*
import androidx.core.content.res.ResourcesCompat
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseViewHolder

/**
 * Describe: 适配器基类
 * Created by Lyons-Hoo on 2020/05/26.
 */
abstract class BasicAdapter<Item>(@LayoutRes itemId : Int, data : MutableList<Item>) : BaseQuickAdapter<Item, BaseViewHolder>(itemId, data)
{


    protected var mSelectedPosition = -1 // 记录当前选中tab

    val selectedPosition : Int
        get() = this.mSelectedPosition

    fun select(position : Int) {
        if(position != mSelectedPosition) {
            val oldSelectedPosition = mSelectedPosition
            mSelectedPosition = position
            notifyItemChanged(oldSelectedPosition)
            notifyItemChanged(position)
        }
    }

    protected fun getString(@StringRes id : Int) : CharSequence = this.context.getString(id)

    protected fun getString(@StringRes id : Int, data : String) : CharSequence = this.context.getString(id, data)

    protected fun getColor(@ColorRes id : Int) : Int = resources().getColor(id)

    protected fun getDimensionPx(@DimenRes id : Int) : Int = resources().getDimensionPixelSize(id)

    protected fun getDrawable(@DrawableRes id : Int) : Drawable? = ResourcesCompat.getDrawable(resources(), id, null)

    protected fun getDimensionPixelSize(@DimenRes id : Int) : Int = resources().getDimensionPixelSize(id)

    protected fun resources(): Resources = this.context.resources
}