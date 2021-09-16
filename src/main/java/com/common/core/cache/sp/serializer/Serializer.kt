package com.common.core.cache.sp.serializer

/**
 * Describe: json数据解析器
 * Created by lyons on 19-7-31
 */
interface Serializer {

    fun <O> toJsonString(obj : O) : String?

    fun <O> toJsonString(objs : List<O>) : String?

    fun <O> toObj(jsonString : String, clazz: Class<O>) : O?

    fun <O> toList(jsonString : String, clazz: Class<O>) : (List<O>)?
}