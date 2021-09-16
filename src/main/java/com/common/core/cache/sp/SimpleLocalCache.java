package com.common.core.cache.sp;

import android.annotation.SuppressLint;
import android.content.Context;

import com.common.core.cache.sp.serializer.GsonSerializer;
import com.common.core.cache.sp.serializer.Serializer;

import org.jetbrains.annotations.NotNull;

/**
 * Describe: 统一管理SharedPreferences缓存
 * Created by lyons on 2018/7/26
 */
public class SimpleLocalCache {

    @SuppressLint("StaticFieldLeak")
    private static SimpleLocalCache INSTANCE;

    private final Context applicationContext;
    private final SpCache defaultCache;

    private SimpleLocalCache(@NotNull Context applicationContext) {
        this.applicationContext = applicationContext;
        this.defaultCache = new SpCache(this.applicationContext, getDefaultCacheTag(), new GsonSerializer());
    }

    public SpCache getDefaultCache() {
        return defaultCache;
    }

    public static SimpleLocalCache instance() {
        return SimpleLocalCache.INSTANCE;
    }

    /**
     * 初始化缓存区
     */
    public static synchronized void setup(Context applicationContext) throws NullPointerException {
        if(null == applicationContext) throw new NullPointerException("can not install by an empty Context reference!");
        else {
            if (null == SimpleLocalCache.INSTANCE) { // 保证单例的安全性
                SimpleLocalCache.INSTANCE = new SimpleLocalCache(applicationContext);
            }
        }
    }

    /**
     * 默认截取包名中的项目名
     */
    private String getDefaultCacheTag() {
        final String[] packageInfo = this.applicationContext.getPackageName().split("\\.");
        return packageInfo[packageInfo.length < 1 ? 0 : packageInfo.length - 1] + "_default_cache";
    }

    /**
     * 创建一个新的Sp缓存文件
     */
    public SpCache newCache(String cacheTag) { return newCache(cacheTag, new GsonSerializer()); }

    public SpCache newCache(String cacheTag, Serializer serializer) { return new SpCache(this.applicationContext, cacheTag, serializer); }

    /**
     * 根据Tag获取一个已经存在的SP缓存（只是为了语义化方法名称）
     */
    public SpCache getExistCache(String cacheTag) { return newCache(cacheTag); }

    /**
     * 缓存设备渠道号
     */
    public void cacheChannelNumber(String channelNumber) {
        this.defaultCache.putString("channel", channelNumber);
    }

    public String getCachedChannelNumber() {
        return this.defaultCache.getString("channel");
    }
}