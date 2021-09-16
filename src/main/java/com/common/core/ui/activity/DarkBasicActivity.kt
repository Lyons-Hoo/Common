package com.common.core.ui.activity

import android.os.Bundle
import androidx.databinding.ViewDataBinding
import com.gyf.immersionbar.ImmersionBar

/**
 * Describe: 暗色
 * Created by lyons on 2021/04/27.
 */
abstract class DarkBasicActivity<DataBinding : ViewDataBinding> : BasicActivity<DataBinding>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        ImmersionBar.with(this).statusBarDarkFont(false).init()
        super.onCreate(savedInstanceState)
    }
}