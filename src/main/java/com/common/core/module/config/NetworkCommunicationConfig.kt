package com.common.core.module.config

import okhttp3.Interceptor

/**
 * Describe: 网络通信配置文件，统一管理接口通信所需要的相关配置
 * Created by lyons on 2020/12/03.
 */
class NetworkCommunicationConfig private constructor(
    var connectTimeoutSeconds : Long,
    var readTimeoutSeconds : Long,
    var writeTimeoutSeconds : Long,
    var interceptors : List<Interceptor>,
    var domain : String,
    var commonRequestParams : Map<String, String>,
    var isDebug : Boolean
) {

    class Configure {
        private val communicationTimeoutSeconds = 15L // 默认通信超时 时长/s
        var connectTimeoutSeconds = this.communicationTimeoutSeconds // 连接超时 时长
        var readTimeoutSeconds = this.communicationTimeoutSeconds // 读 超时 时长
        var writeTimeoutSeconds = this.communicationTimeoutSeconds // 写 超时 时长
        val interceptors = mutableListOf<Interceptor>() // 拦截器
        var domain = "" // 域名
        val commonRequestParams : MutableMap<String, String> = mutableMapOf() // 公共请求参数
        var isDebug = false // 调试模式

        fun config() : NetworkCommunicationConfig {
            if(this.domain.isEmpty()) throw IllegalArgumentException("you must config the domain!")
            return NetworkCommunicationConfig(
                this.connectTimeoutSeconds,
                this.readTimeoutSeconds,
                this.writeTimeoutSeconds,
                this.interceptors,
                this.domain,
                this.commonRequestParams,
                this.isDebug
            )
        }
    }
}