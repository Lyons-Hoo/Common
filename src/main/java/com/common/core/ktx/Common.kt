package com.common.core.ktx

import com.common.core.basic.BasicApp

/**
 * Describe: 通用的扩展函数
 * Created by lyons on 2021/03/02.
 */
inline val Int.dp : Int
    get() = (this * BasicApp.applicationContext.resources.displayMetrics.density + 0.5f).toInt()

inline val Float.dp : Float
    get() = this * BasicApp.applicationContext.resources.displayMetrics.density + 0.5f

/**
 * 安全的字符串转整型
 */
const val FORMAT_FAILED_RESULT = -1
fun String.safeToInt() : Int {
    var result = FORMAT_FAILED_RESULT
    try {
        result = if(this.indexOf(".") != -1) { // 说明是小数
            this.toDouble().toInt()
        } else this.toInt()
    } catch (e: NumberFormatException) {}
    return result
}
fun String.safeToLong() : Long {
    var result = FORMAT_FAILED_RESULT * 1L
    try {
        result = if(this.indexOf(".") != -1) { // 说明是小数
            this.toDouble().toLong()
        } else this.toLong()
    } catch (e: NumberFormatException) {}
    return result
}
fun String.safeToDouble() : Double {
    var result = FORMAT_FAILED_RESULT * 1.0
    try { result = this.toDouble() }
    catch (e: NumberFormatException) {}
    return result
}

fun Boolean.toInt() : Int {
    return if(this) 1 else 0
}