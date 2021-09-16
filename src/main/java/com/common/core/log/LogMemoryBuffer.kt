package com.common.core.log

import java.text.SimpleDateFormat
import java.util.*

/**
 * Describe: cache the the runtime log when need
 * Created by lyons on 20-4-20
 */
class LogMemoryBuffer(private val maxSize : Int = 1024 * 1024 * 1 /*the default max cache size is 1MB*/,
                      private val outOfCacheMemoryAction : (String) -> Unit) {

    private val tag = "MemoryLogCache"

    private val cache = StringBuilder() // runtime log cacher, not to use StringBuffer
    private val dateTimeFormatter by lazy { SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()) }

    @Synchronized fun cacheLog(log : String) {
        if(log.isNotEmpty()) {
            RTLogger.d(this.tag, "-> cache log to memory")
            this.cache.append("\n${this.dateTimeFormatter.format(Date())} : $log")
            checkOutOfCacheMemory()
        }
    }

    @Synchronized fun dump() : String {
        val cachedLog = this.cache.toString()
        this.cache.clear()
        return cachedLog
    }

    @Synchronized fun hasCache() = this.cache.isNotEmpty()

    @Synchronized fun dumpCachedSize() = "${this.cache.length * 2 / 1024}kb"

    /**
     * @param outOfCacheMemoryAction must handle the outOfCacheMemory event,
     * because the MemoryLogCache default action will clear memory cache when out of
     */
    private fun checkOutOfCacheMemory() {
        if(this.cache.length * 2 >= this.maxSize) {
            RTLogger.d(this.tag, "the log memory cache will be out of memory")
            this.outOfCacheMemoryAction(this.dump())
        }
    }
}