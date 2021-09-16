package com.common.core.ui.dialog

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.text.TextUtils
import android.view.*
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.common.core.R
import com.common.core.ktx.startActivity
import com.common.core.ktx.startActivityForResult
import com.common.core.log.RTLogger
import com.common.core.module.model.BasicViewModel
import com.common.core.ui.ktx.onClick
import com.common.core.utils.Toast1
import java.lang.reflect.ParameterizedType

/**
 * Describe:dialog基类, 基于fragment，相对减少内存泄漏的风险
 * Created by lyons on 20-4-15
 */
abstract class BasicDialog<DataBinding : ViewDataBinding> : DialogFragment() {

    protected open val mFullScreen = true // 是否全屏
    protected open val mTransparent = false // 是否背景透明
    protected open val mCanceledOnTouchOutside = true // 是否点击外部关闭
    protected open val mCancelAble = true // 是否点击back关闭

    protected var mViewBinding : DataBinding? = null

    @Suppress("UNCHECKED_CAST")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        if(this.mFullScreen) configDialog()

        if(this.mTransparent) setStyle(STYLE_NO_TITLE, R.style.Dialog_Transparent)

        if(null == this.mViewBinding) {
            val type = this.javaClass.genericSuperclass as ParameterizedType
            val clazz = type.actualTypeArguments[0] as Class<DataBinding>
            val method = clazz.getMethod("inflate", LayoutInflater::class.java, ViewGroup::class.java, Boolean::class.java)
            this.mViewBinding = method.invoke(null, inflater, container, false) as DataBinding
            this.mViewBinding?.lifecycleOwner = this
        }

        if(this.mCanceledOnTouchOutside) {
            this.mViewBinding?.root?.onClick { dismiss()}
        }

        return this.mViewBinding?.root
    }

    /**
     * 强制在宿主创建完毕后进行操作
     */
    abstract fun onContentReady(savedInstanceState: Bundle?)

    protected var mIsCalled = false
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if(!this.mIsCalled) {
            this.mIsCalled = true
            observeEvents()
            onContentReady(savedInstanceState)
        }
    }

    private fun configDialog() {
        this.dialog?.window?.let {
            it.decorView.setPadding(0, 0, 0, 0)
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                it.statusBarColor = Color.TRANSPARENT
            }
            val lp = it.attributes
            lp.width = WindowManager.LayoutParams.MATCH_PARENT
            lp.height = WindowManager.LayoutParams.MATCH_PARENT

            if(this.mTransparent) {
                lp.dimAmount = 0f
                lp.flags = lp.flags or WindowManager.LayoutParams.FLAG_DIM_BEHIND
            }

            it.attributes = lp
            it.setGravity(Gravity.BOTTOM)
            it.decorView.setBackgroundColor(Color.TRANSPARENT) // 不设置会不全屏....
        }
        this.dialog?.setCanceledOnTouchOutside(this.mCanceledOnTouchOutside)
        isCancelable = this.mCancelAble
    }

    fun toast(msg : String, duration : Int = Toast.LENGTH_SHORT) {
        if(!TextUtils.isEmpty(msg)) {
            Toast1.show(msg, duration == Toast.LENGTH_LONG)
        }
    }

    fun toast(@StringRes msgRes : Int, duration : Int = Toast.LENGTH_SHORT) {
        toast(getString(msgRes), duration)
    }

    inline fun <reified Activity> startActivity(data : Bundle? = null) {
        this.context?.startActivity<Activity>(data)
    }

    inline fun <reified Activity> startActivityAndDismissSelf(data: Bundle? = null) {
        startActivity<Activity>(data)
        dismiss()
    }

    inline fun <reified Activity> startActivityForResult(requestCode : Int, data : Bundle? = null) {
        this.activity?.startActivityForResult<Activity>(requestCode, data)
    }

    protected fun <Data> MutableLiveData<Data>.observe(observer : Observer<Data>) = observe(this@BasicDialog, observer)

    protected open fun observeEvents() {}

    fun show(fragmentManager: FragmentManager) {
        try { super.show(fragmentManager, this.javaClass.simpleName) }
        // java.lang.IllegalStateException: Can not perform this action after onSaveInstanceState
        catch (e: IllegalStateException) {
            RTLogger.e("BasicDialog", "show", e.localizedMessage ?: "unknown error happened")
            dismiss()
        }
    }

    override fun dismiss() {
        super.dismissAllowingStateLoss()
    }

    override fun onDestroyView() {
        this.mViewBinding = null
        super.onDestroyView()
    }
}