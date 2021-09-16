package com.common.core.module.ktx

import com.common.core.log.RTLogger
import com.google.gson.JsonSyntaxException
import com.hjq.gson.factory.GsonFactory
import org.json.JSONArray
import org.json.JSONException

/**
 * Describe: 数据解析器
 * Created by lyons on 2020/12/08.
 */

const val TAG = "DataParser"

inline fun <reified Entity> String.parse2Object() : Entity?
{
    var entity: Entity? = null
    if (this.isNotEmpty()) {
        try { entity = GsonFactory.getSingletonGson().fromJson(this, Entity::class.java) }
//        val typeToken = object : TypeToken<Entity>(){}.type
//        try { entity = GsonFactory.getSingletonGson().fromJson(this, typeToken) }
        catch (e : Exception) {
            RTLogger.e(TAG, "parse2Object", e.message)
        }
    }
    return entity
}

/**
 * Gson容易出一些异常（java.lang.AssertionError: illegal type variable reference），try不住
 */
inline fun <reified Entity> String.parse2List() : MutableList<Entity>
{
    val entityList: MutableList<Entity> = mutableListOf()
    if (this.isNotEmpty()) {
        try {
//            val typeToken = object : TypeToken<ArrayList<Entity>>(){}.type
//            entityList.addAll(Gson().fromJson(this, typeToken))
            entityList.addAll(GsonFactory.getSingletonGson().fromJson<MutableList<Entity>>(this, ArrayList::class.java))
        } catch (e : Exception) {
            RTLogger.e(TAG, "parse2List", e.message)
        }
    }
    return entityList
}

inline fun <reified Entity> String.parse2List1() : MutableList<Entity>
{
    val entityList: MutableList<Entity> = mutableListOf()
    if (this.isNotEmpty()) {
        var jsonArray: JSONArray? = null
        try { jsonArray = JSONArray(this) }
        catch (ignored: JSONException) {}
        jsonArray?.let {
            val gson = GsonFactory.getSingletonGson()
            for (i in 0 until it.length()) {
                var entity: Entity? = null
                try { entity = gson.fromJson(it.optString(i), Entity::class.java) }
                catch (e : Exception) {
                    RTLogger.e(TAG, "parse2List1", e.message)
                }
                entity?.let { entityList.add(entity) }
            }
        }
    }
    return entityList
}