package com.common.core.module

import java.lang.RuntimeException

/**
 * Describe: 描述网络通信请求异常
 * Created by lyons on 19-7-31
 */
open class RequestException(
    errorMsg : String,
    private val errorCode : Int = -1
) : RuntimeException(errorMsg)
{
    fun getErrorCode() : Int = this.errorCode
}