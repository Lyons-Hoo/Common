package com.common.core.module.model

/**
 * Describe:服务器api响应实体基类
 * Created by lyons on 20-4-15
 */

/*基础响应数据结构，data部分都按照字符串处理*/
abstract class BasicResponse {
    abstract var c : Int // code
    abstract var m : String // message
    abstract var d : String // data
}

/*默认的一种字段结构*/
data class DefaultResponse(
    var code : Int = -1,
    var message : String = "",
    var data : String = ""
) : BasicResponse() {
    override var c: Int
        get() = this.code
        set(value) { this.code = value }
    override var m: String
        get() = this.message
        set(value) { this.message = value }
    override var d: String
        get() = this.data
        set(value) { this.data = value }

}

/*将请求成功/失败包装成一个数据结构*/
data class RequestResponse<D>(
    var data : D? = null, /*数据*/
    var errorMessage : String = "", /*错误信息*/
    var message : String = "", /*提示信息*/
    var errorCode : Int = -1 /*错误码*/
) {
    inline val isSucceed : Boolean
        get() = this.errorCode == -1 && errorMessage.isEmpty()
}