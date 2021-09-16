package com.common.core.ui.activity

import android.content.res.Resources
import android.os.Bundle
import android.os.Looper
import android.text.TextUtils
import android.view.LayoutInflater
import android.widget.Toast
import androidx.annotation.StringRes
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.common.core.utils.Toast1
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import me.jessyan.autosize.AutoSizeCompat
import java.lang.reflect.ParameterizedType

/**
 * Describe: 活动基类
 * Created by lyons on 19-7-30
 */
abstract class BasicActivity<DataBinding : ViewDataBinding> : FragmentActivity() {

    @Suppress("UNCHECKED_CAST")
    protected val mViewBinding : DataBinding by lazy {
        val type = this.javaClass.genericSuperclass as ParameterizedType
        val clazz = type.actualTypeArguments[0] as Class<DataBinding>
        val method = clazz.getMethod("inflate", LayoutInflater::class.java)
        val dataBinding = method.invoke(null, this.layoutInflater) as DataBinding
        dataBinding.lifecycleOwner = this
        dataBinding
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(this.mViewBinding.root)
        observeEvents()
        onContentReady(savedInstanceState)
    }

    abstract fun onContentReady(savedInstanceState: Bundle?)

    fun toast(msg: String, duration: Int = Toast.LENGTH_SHORT) {
        if(!TextUtils.isEmpty(msg)) {
            Toast1.show(msg, duration == Toast.LENGTH_LONG)
        }
    }

    fun toast(@StringRes msgRes: Int, duration: Int = Toast.LENGTH_SHORT) {
        toast(getString(msgRes), duration)
    }

    /*
     * 处理AutoSize可能在某些设备上适配异常
     * @see https://github.com/JessYanCoding/AndroidAutoSize/issues/13
     */
    private var mAutoSizeJob : Job? = null
    override fun getResources(): Resources {
        val resources = super.getResources()
        if (Looper.myLooper() == Looper.getMainLooper()) {
            AutoSizeCompat.autoConvertDensityOfGlobal(resources)
        } else {
            cancelAutoSizeJob()
            this.mAutoSizeJob = GlobalScope.launch(Dispatchers.Main) {
                // 需要切换到主线程进行调用，否则可能导致"Not in applications main thread"异常
                AutoSizeCompat.autoConvertDensityOfGlobal(resources)
            }
        }
        return resources
    }

    private fun cancelAutoSizeJob() {
        this.mAutoSizeJob?.cancel()
        this.mAutoSizeJob = null
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        // activity重建时直接清除掉碎片缓存。下面注释的代码也是一样的思路，只不过是在重建时清除。解决的都是同一个问题，下面的麻烦一下。
        outState.remove("androidx.lifecycle.BundlableSavedStateRegistry.key")
    }

    /**
     * 清除重复的fragment
     * @see androidx.fragment.app.FragmentActivity.onCreate
     * @see androidx.fragment.app.FragmentManagerImpl.restoreAllState
     *
     * throw new IllegalStateException("Fragment already added");
     * @see androidx.fragment.app.FragmentStore.addFragment
     */
//    private fun deduplicationFragmentsIfNeed(savedInstanceState: Bundle?) {
//        savedInstanceState?.let {
//            val fragmentManager = this.supportFragmentManager
//            savedInstanceState.getParcelable<Parcelable>("androidx.lifecycle.BundlableSavedStateRegistry.key")?.let { p ->
//                var active: SparseArray<*>? = null
//                var added: IntArray? = null
//                val fragmentManagerClass: Class<*> = fragmentManager.javaClass
//                try {
//                    val activeFragments = fragmentManagerClass.getDeclaredField("mActive")
//                    activeFragments.isAccessible = true
//                    active = activeFragments[fragmentManager] as SparseArray<*> // fragments cache
//                    val fragmentManagerState: Class<*> = p.javaClass // androidx.fragment.app.FragmentStore
//                    val addedFragmentKeys = fragmentManagerState.getDeclaredField("mAdded")
//                    addedFragmentKeys.isAccessible = true
//                    added = addedFragmentKeys[p] as IntArray
//                } catch (e: NoSuchFieldException) {
//                    e("deduplicationFragmentsIfNeed", e.message)
//                } catch (e: SecurityException) {
//                    e("deduplicationFragmentsIfNeed", e.message)
//                } catch (e: IllegalArgumentException) {
//                    e("deduplicationFragmentsIfNeed", e.message)
//                } catch (e: IllegalAccessException) {
//                    e( "deduplicationFragmentsIfNeed", e.message)
//                }
//                if (null != active && null != added) {
//                    val tryAddFragments = HashSet<Fragment>(added.size)
//                    for (key in added) {
//                        val o = active[key]
//                        if (o is Fragment) {
//                            if (!tryAddFragments.add(o)) { // 说明已经有了
//                                active.remove(key) // 从fragmentManager的缓存中移除
//                            }
//                        }
//                    }
//                    tryAddFragments.clear()
//                }
//            }
//        }
//    }
//
//    private fun e(function : String, log : String?) = RTLogger.e(this.mTag, function, log)

    protected fun <Data> MutableLiveData<Data>.observe(observer: Observer<Data>) = observe(
        this@BasicActivity,
        observer
    )

    protected open fun observeEvents() {}

    override fun onDestroy() {
       cancelAutoSizeJob()
        super.onDestroy()
    }
}