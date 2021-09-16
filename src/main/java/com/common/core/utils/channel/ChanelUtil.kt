package com.common.core.utils.channel

import android.content.Context
import com.common.core.cache.sp.SimpleLocalCache

/**
 * author : Song Jian
 * date   : 2020/7/26
 * desc   :
 */
object ChanelUtil {
    const val default = "default"
    private var mChanel: String = ""
    var applicationContext: Context? = null

    fun getChanel(): String {
        if (mChanel.isEmpty()) {
            mChanel = SimpleLocalCache.instance().cachedChannelNumber
        }
        if (mChanel.isEmpty()) {
            this.applicationContext?.let {
                mChanel = MetaDataUtil.readUmengChannel(it)
            }
            if (mChanel.isEmpty()) {
                mChanel = default
            } else {
                SimpleLocalCache.instance().cacheChannelNumber(mChanel)
            }
        }
        return mChanel
    }
}