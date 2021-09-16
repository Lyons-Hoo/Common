package com.common.core.ktx

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.text.TextUtils

/**
 * Describe:
 * Created by lyons on 2021/08/20.
 */

/**
 * 打开本地页面
 * @param activityName 本地页面名称
 * @return 是否打开成功
 */
fun Context?.openNativePage(activityName: String) : Boolean {
    this?.let { return openNativePage(activityName, null) }
    return false
}

const val PARAMS = "params" // 传递参数
fun Context.openNativePage(
    activityName: String,
    params: HashMap<String, String>?,
    needNewTask: Boolean = this !is Activity
) : Boolean {
    if (!TextUtils.isEmpty(activityName)) {
        val activityIntegralPath = getIntegralActivityPath(activityName)
        if (!TextUtils.isEmpty(activityIntegralPath)) {
            val intent = try { Intent(this, Class.forName(activityIntegralPath))
            }
            catch (ignored: ClassNotFoundException) { null }
            intent?.let {
                if (null != params) intent.putExtra(PARAMS, params)
                if (needNewTask) intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(intent)
                return true
            }
        }
    }
    return false
}

/**
 * activity完全限定名
 */
fun Context.getIntegralActivityPath(activityName: String) : String {
    val packageInfo = try { this.packageManager.getPackageInfo(
        this.packageName,
        PackageManager.GET_ACTIVITIES
    ) }
    catch (ignored: PackageManager.NameNotFoundException) { null }
    packageInfo?.activities?.let { activities ->
        for (activity in activities) {
            if (activity.name.contains(activityName)) { // activity 不能有重名的，否则可能打开的不是目标页面
                return activity.name
            }
        }
    }
    return ""
}

/**
 * 打开手机上安装的其他app
 * @param packageName 目标应用包名
 */
fun Context?.lunchApp(packageName: String) : Boolean {
    this?.let {
        if(packageName.isNotEmpty()) {
            try {
                this.packageManager.getLaunchIntentForPackage(packageName)?.let {
                    startActivity(it)
                    return true
                }
            } catch (e: Exception) {
                // 高版本系统上，打开未在安装包上申明的包名可能会抛异常
            }
        }
    }
    return false
}

inline fun <reified TargetActivity> Context?.startActivity(data: Bundle? = null) : Boolean {
    this?.let {
        val intent = Intent(it, TargetActivity::class.java)
        data?.let { intent.putExtras(data) }
        if(it !is Activity) intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
        return true
    }
    return false
}

inline fun <reified TargetActivity> Activity.startActivity(data: Bundle? = null) {
    val intent = Intent(this, TargetActivity::class.java)
    data?.let { intent.putExtras(data) }
    this.startActivity(intent)
}

inline fun <reified TargetActivity> Activity.startActivityAndFinishSelf(data: Bundle? = null) {
    startActivity<TargetActivity>(data)
    finish()
}

inline fun <reified TargetActivity> Activity.startActivityForResult(requestCode: Int, data: Bundle? = null) {
    val intent = Intent(this, TargetActivity::class.java)
    data?.let { intent.putExtras(data) }
    this.startActivityForResult(intent, requestCode)
}