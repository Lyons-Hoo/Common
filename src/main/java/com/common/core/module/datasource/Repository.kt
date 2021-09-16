package com.common.core.module.datasource

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

/**
 * Describe: 数据仓库
 * Created by lyons on 2020/12/07.
 */
open class Repository {

    protected val tag by lazy { this.javaClass.simpleName }

    suspend fun <T> withContextInIO(action: suspend CoroutineScope.() -> T) = withContext(Dispatchers.IO, action)
}