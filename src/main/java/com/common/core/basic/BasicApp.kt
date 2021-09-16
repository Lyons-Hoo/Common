package com.common.core.basic

import android.app.Application
import android.content.Context
import android.os.Build
import android.webkit.WebView
import androidx.multidex.MultiDexApplication

/**
 * Describe: Application基类，主要是为了避免一些bug
 * Created by lyons on 2020/09/14.
 */
open class BasicApp : MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()
        BasicApp.applicationContext = this
        setWebViewPath()
    }

    /**
     * Android 9.0及以上版本中，关于多进程问题对于WebView的影响
     * "Android P 以及之后版本不支持同时从多个进程使用具有相同数据目录的WebView"
     */
    protected fun setWebViewPath() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            val processName = Application.getProcessName()
            if (this.packageName != processName) { // 判断不等于默认进程名称
                try { WebView.setDataDirectorySuffix(processName) }
                catch (e : Exception) {}
            }
        }
    }

    companion object {
        lateinit var applicationContext : Context
    }
}