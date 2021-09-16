package com.common.core.cache.sp;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

import com.common.core.cache.sp.serializer.Serializer;

import java.util.List;

/**
 * Describe:提供基础数据类型的健壮存储/读取服务
 * Created by Lyons on 2018/11/7
 */
public final class SpCache {

    private final SharedPreferences spCache;
    private final Serializer serializer;

    SpCache(Context applicationContext, String cacheName, Serializer serializer) {
        this.spCache = applicationContext.getSharedPreferences(cacheName, Context.MODE_PRIVATE);
        this.serializer = serializer;
    }

    public <O> SpCache putObject(String key, O obj) {
        final String jsonS = this.serializer.toJsonString(obj);
        if(!TextUtils.isEmpty(jsonS)) this.putString(key, jsonS);
        return this;
    }

    public <O> O getObject(String key, Class<O> clazz) {
        O object = null;
        final String objectS = this.getString(key);
        if(!TextUtils.isEmpty(objectS))
            object = this.serializer.toObj(objectS, clazz);
        return object;
    }

    public <O> SpCache putList(String key, List<O> list) {
        final String jsonS = this.serializer.toJsonString(list);
        if(!TextUtils.isEmpty(jsonS)) this.putString(key, jsonS);
        return this;
    }

    public <O> List<O> getList(String key, Class<O> clazz) {
        List<O> oList = null;
        final String objectS = this.getString(key);
        if(!TextUtils.isEmpty(objectS))
            oList = this.serializer.toList(objectS, clazz);
        return oList;
    }

    public SpCache putBoolean(String key, boolean value) {
        this.spCache.edit().putBoolean(key, value).apply();
        return this;
    }

    public boolean getBoolean(String key) { return this.spCache.getBoolean(key, false); }

    public boolean getBoolean(String key, boolean defVal) { return this.spCache.getBoolean(key, defVal); }

    public SpCache putInt(String key, int value) {
        this.spCache.edit().putInt(key, value).apply();
        return this;
    }

    public int getInt(String key, int defaultValue) { return this.spCache.getInt(key, defaultValue); }

    public int getInt(String key) { return this.getInt(key, -1); }

    public SpCache putString(String key, String value) {
        this.spCache.edit().putString(key, value).apply();
        return this;
    }

    public String getString(String key) { return this.getString(key, ""); }

    public String getString(String key, String defaultValue) { return this.spCache.getString(key, defaultValue); }

    public SpCache putLong(String key, long value) {
        this.spCache.edit().putLong(key, value).apply();
        return this;
    }

    public long getLong(String key, long defaultValue) { return this.spCache.getLong(key, defaultValue); }

    public long getLong(String key) { return this.getLong(key, -1); }

    public SpCache putFloat(String key, float value) {
        this.spCache.edit().putFloat(key, value).apply();
        return this;
    }

    public float getFloat(String key, float defaultValue) { return this.spCache.getFloat(key, defaultValue); }

    public float getFloat(String key) { return this.getFloat(key, -1); }

    public SpCache remove(String key) {
        this.spCache.edit().remove(key).apply();
        return this;
    }

    public void clear() {
        this.spCache.edit().clear().apply();
    }
}
