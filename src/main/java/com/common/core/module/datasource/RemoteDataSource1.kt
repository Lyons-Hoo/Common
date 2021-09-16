package com.common.core.module.datasource

import com.common.core.module.model.BasicResponse
import com.common.core.module.model.DefaultResponse
import org.json.JSONException
import org.json.JSONObject

/**
 * Describe:
 * Created by lyons on 2021/05/08.
 */
open class RemoteDataSource1(successCode1 : Int = 200/*默认请求成功code码*/) : RemoteDataSource(successCode1) {

    override val String.basicResponse: BasicResponse
        get() {
            val basicResponse = DefaultResponse()
            if(this.isNotEmpty()) {
                val jsonObject: JSONObject? = try { JSONObject(this) }
                catch (e: JSONException) { null }
                jsonObject?.let {
                    basicResponse.code = jsonObject.optInt("code")
                    basicResponse.message = jsonObject.optString("msg")
                    basicResponse.data = jsonObject.optString("data")
                }
            }
            return basicResponse
        }
}