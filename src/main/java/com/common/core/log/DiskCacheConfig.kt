package com.common.core.log

import android.content.Context
import java.io.File
import java.util.*

/**
 * Describe: 管理本地磁盘缓存
 * Created by lyons on 20-4-20
 */
object DiskCacheConfig {

    private const val CACHE_FOLDER_LOG = "runtime_log"

    /**
     * 本地缓存的log日志
     */
    fun logLocalPath(context : Context) : File {
        val externalCacheRootPath = context.externalCacheDir

        val cacheLogRootPath = File(externalCacheRootPath, CACHE_FOLDER_LOG)
        try { if(!cacheLogRootPath.exists()) cacheLogRootPath.mkdirs() }
        catch(e : Exception) {}

        cacheLogRootPath.listFiles()?.forEach { logFile ->
            val createTimeS = logFile.name.split("-")[0]
            var createTime = 0L
            try { createTime = createTimeS.toLong() }
            catch (e : NumberFormatException) {}
            if(createTime > 0 && isTodayDate(createTime))
                return logFile
        }
        return createNewLogFile(cacheLogRootPath)
    }

    private fun createNewLogFile(cacheLogRootPath : File) : File {
        val cacheLogFileName = "${System.currentTimeMillis()}-${RandomStringProvider().provide()}.log"
        val cacheLogFile = File(cacheLogRootPath, cacheLogFileName)
        try { if(!cacheLogFile.exists()) cacheLogFile.createNewFile() }
        catch (e : Exception) {}
        return cacheLogFile
    }

    private fun isTodayDate(dateTimeMills : Long) : Boolean {
        with(Calendar.getInstance()) {
            this.timeInMillis = dateTimeMills
            val year = this.get(Calendar.YEAR)
            val month = this.get(Calendar.MONTH)
            val day = this.get(Calendar.DAY_OF_MONTH)

            this.timeInMillis = System.currentTimeMillis()
            val currentYear = this.get(Calendar.YEAR)
            val currentMonth = this.get(Calendar.MONTH)
            val currentDay = this.get(Calendar.DAY_OF_MONTH)
            return year == currentYear && month == currentMonth && day == currentDay
        }
    }
}