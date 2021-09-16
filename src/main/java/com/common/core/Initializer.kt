package com.common.core

import android.app.Application
import android.content.Context
import androidx.startup.Initializer
import com.common.core.cache.sp.SimpleLocalCache
import com.common.core.log.RTLogger
import com.common.core.utils.Toast1
import com.common.core.utils.channel.ChanelUtil
import com.tencent.smtt.export.external.TbsCoreSettings
import com.tencent.smtt.sdk.QbSdk
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

/**
 *  Describe: 初始化器，基于androidx的startUp
 *  Created by Lyons on 2019/12/12
 */
class Initializer : Initializer<Unit> {

    override fun create(context: Context) {
        GlobalScope.launch { // 在后台初始化，目前不确定启动协程的是否时间小于以下代码初始化的时间
            val applicationContext = context.applicationContext
            RTLogger.setup(applicationContext as Application)
            Toast1.setup(applicationContext)
            SimpleLocalCache.setup(applicationContext)
            ChanelUtil.applicationContext = applicationContext // 需要在 SimpleLocalCache 装载以后，因为里面用到了
            installX5Chrome(applicationContext)
        }
    }

    /**
     * 腾讯X5浏览器
     */
    private fun installX5Chrome(context: Context) {
        val map = HashMap<String, Any>()
        map[TbsCoreSettings.TBS_SETTINGS_USE_SPEEDY_CLASSLOADER] = true
        QbSdk.initTbsSettings(map)
        QbSdk.initX5Environment(context, null)
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return mutableListOf()
    }
}