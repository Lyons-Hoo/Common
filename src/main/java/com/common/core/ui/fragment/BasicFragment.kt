package com.common.core.ui.fragment

import android.app.Activity
import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.common.core.ktx.startActivity
import com.common.core.ktx.startActivityForResult
import com.common.core.utils.Toast1
import java.lang.reflect.ParameterizedType

/**
 * Describe: 碎片基类, 所有在碎片中访问view的代码，都应该使用 空安全 的访问方式：?.
 * Created by lyons on 20-4-15
 */
abstract class BasicFragment<DataBinding : ViewDataBinding> : Fragment() {

    protected var mViewBinding : DataBinding? = null

    @Suppress("UNCHECKED_CAST")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if(null == this.mViewBinding) {
            val type = this.javaClass.genericSuperclass as ParameterizedType
            val clazz = type.actualTypeArguments[0] as Class<DataBinding>
            val method = clazz.getMethod("inflate", LayoutInflater::class.java, ViewGroup::class.java, Boolean::class.java)
            this.mViewBinding = method.invoke(null, inflater, container, false) as DataBinding
            this.mViewBinding?.lifecycleOwner = this
        }
        return this.mViewBinding?.root
    }

    protected var mHost : Activity? = null
    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
        this.mHost = activity
    }

    protected var mIsCalled = false
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if(!this.mIsCalled) {
            this.mIsCalled = true
            observeEvents()
            onContentReady(savedInstanceState)
        }
    }

    override fun onDetach() {
        this.mHost = null
        super.onDetach()
    }

    override fun onDestroyView() {
        this.mViewBinding = null
        super.onDestroyView()
    }

    /**
     * 强制在宿主创建完毕后进行操作
     */
    abstract fun onContentReady(savedInstanceState: Bundle?)

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

    inline fun <reified Activity> startActivityAndFinishHost(data: Bundle? = null) {
        startActivity<Activity>(data)
        this.activity?.finish()
    }

    inline fun <reified Activity> startActivityForResult(requestCode : Int, data : Bundle? = null) {
        this.activity?.startActivityForResult<Activity>(requestCode, data)
    }

    protected fun <Data> MutableLiveData<Data>.observe(observer : Observer<Data>) = observe(this@BasicFragment, observer)

    protected open fun observeEvents() {}

    /**
     * [@Link https://stackoverflow.com/questions/8748064/starting-activity-from-fragment-causes-nullpointerexception]
     */
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        this.userVisibleHint = true
    }
}