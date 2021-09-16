package com.common.core.log

import java.util.*
import kotlin.collections.ArrayList

/**
 *  Describe: 提供随机字符串
 *  Created by Lyons on 2019/11/5
 */
class RandomStringProvider {

    private val randomStringBounds by lazy {
        val bounds = ArrayList<Char>()
        bounds.addAll(('a'..'z'))
        bounds.addAll(('A'..'Z'))
        bounds
    }

    /**
     * 默认随机6-10位
     */
    fun provide(from : Int = 6, to : Int = 10): String {
        val random = Random()
        val randomStringLength = random.nextInt(to - from + 1) + from

        val randomChars = CharArray(randomStringLength)

        for(i in 0 until randomStringLength) {
            val randomIndex = random.nextInt(this.randomStringBounds.size)
            randomChars[i] = this.randomStringBounds[randomIndex]
        }
        return String(randomChars)
    }
}