package com.common.core.log

import android.app.Activity
import android.app.Application
import android.content.Context
import android.os.Bundle
import java.util.concurrent.Executors

/**
 * Describe:the runtime logger
 * Created by lyons on 19-7-30
 */
object RTLogger : Application.ActivityLifecycleCallbacks {

    const val tag = "RTLogger"

    var debugAble = true

    fun d(tag : String, log : String?, needCacheDisk : Boolean = false) {
        val realLog = "$tag -> [$log]"
        if(this.debugAble) android.util.Log.d(this.tag, realLog)
        if(needCacheDisk) cacheLog(realLog)
    }

    fun e(tag : String, funcName : String, log : String?, isNeedCacheDisk : Boolean = false) {
        val realLog = "$tag -> [$funcName HasError: $log]"
        if(this.debugAble) android.util.Log.e(this.tag, realLog)
        if(isNeedCacheDisk) cacheLog(realLog)
    }

    private lateinit var applicationContext: Context
    fun setup(context: Application) {
        this.applicationContext = context.applicationContext
        context.registerActivityLifecycleCallbacks(this)
    }

    fun uninstall(context: Application) {
        context.unregisterActivityLifecycleCallbacks(this)
    }

    private val diskCacheLogger by lazy { DiskCacheLogger(this.applicationContext) }
    // submit the write log task when the log cache out of memory
    private val memoryLogCache by lazy { LogMemoryBuffer { submitWriteLogToDiskTask() } }

    private val cacheThread by lazy { Executors.newSingleThreadExecutor() }

    @Suppress("ControlFlowWithEmptyBody")
    private val cacheTask by lazy {
        Runnable {
            val memoryCacheLog = this.memoryLogCache.dump()
            // loop write log when write failed
            if(memoryCacheLog.isNotEmpty()) {
                while (!this.diskCacheLogger.write(memoryCacheLog)) {
                }
            }
        }
    }

    private fun cacheLog(log : String) {
        d(this.tag, "-> cache log to memory, memory cached size: ${ this.memoryLogCache.dumpCachedSize() }")
        this.cacheThread.submit { this.memoryLogCache.cacheLog(log) }
    }

    private fun submitWriteLogToDiskTask() {
        d(this.tag, "-> submit the write log task")
        this.cacheThread.submit(this.cacheTask)
    }

    //------------------------------touch activity lifecycle---------------------------------

    private var runningActivityCount = 0

    override fun onActivityPaused(activity: Activity?) {}

    override fun onActivityResumed(activity: Activity?) {}

    override fun onActivityStarted(activity: Activity?) {
        this.runningActivityCount++
    }

    override fun onActivityDestroyed(activity: Activity?) {}

    override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {}

    override fun onActivityStopped(activity: Activity?) {
        this.runningActivityCount--
        if(this.runningActivityCount == 0) { // no activity is running
            d(this.tag, "application run in background now")
            submitWriteLogToDiskTask() // log cache write to disk when application run in background every time
        }
    }

    override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {}
}