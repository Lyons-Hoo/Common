package com.common.core.log

import android.content.Context
import java.io.IOException
import java.io.RandomAccessFile
import java.nio.channels.FileChannel
import java.nio.channels.FileLock

/**
 * Describe: 处理本地磁盘缓存日志
 * Created by lyons on 20-4-20
 */
class DiskCacheLogger(private val context: Context) {

    private val tag = "DiskCacheLogger"

    private val charset = Charsets.UTF_8

    fun write(log : String) : Boolean {

        RTLogger.d(this.tag, "-> write log to disk cache")

        val localLogCacheFile = DiskCacheConfig.logLocalPath(this.context)

        if(localLogCacheFile.exists()) {
            var fis : RandomAccessFile? = null
            var fileLock : FileLock? = null
            try {
                fis = RandomAccessFile(localLogCacheFile, "rw") // 读写模式
                val fileChannel = fis.channel
                fileLock = fileChannel.tryLock() // 非阻塞式
                fileLock?.let { // 如果没有拿到文件锁，说明有其它线程在读/写
                    fileChannel.position(fileChannel.size()) // 从文件的尾部追加
                    val byteBuffer = this.charset.encode(log) // 编码
                    while(byteBuffer.hasRemaining()) { fileChannel.write(byteBuffer) } // write to disk
                    return true
                }
            } catch (e : IOException) {}
            finally {
                try {
                    fis?.close() // 先关闭，再释放文件锁
                    fileLock?.release()
                } catch (e1 : IOException) {}
            }
        }
        return false
    }

    fun read() : String {
        val localLogCacheFile = DiskCacheConfig.logLocalPath(this.context)

        if(localLogCacheFile.exists()) {
            var fis : RandomAccessFile? = null
            var fileLock : FileLock? = null
            try {
                fis = RandomAccessFile(localLogCacheFile, "r") // 读模式
                val logChannel = fis.channel
                fileLock = logChannel.tryLock() // 非阻塞式
                fileLock?.let { // 如果没有拿到文件锁，说明有其它线程在读/写
                    val size = logChannel.size()
                    if(size > 0) {
                        // 每日的日志文件应该不会太大，所以是直接一次性读取
                        val mappedByteBuffer = logChannel.map(FileChannel.MapMode.READ_ONLY, 0, size)
                        val readBytes = ByteArray(size.toInt())
                        mappedByteBuffer.get(readBytes, 0, size.toInt())
                        return String(readBytes, this.charset)

//                        // 如果文件内容很大,可以循环读取,计算应该读取多少次
//                        byte[] bytes = new byte[allocate];
//                        long cycle = hasCache / allocate;
//                        int mode = (int)(hasCache % allocate);
//                        //byte[] eachBytes = new byte[allocate];
//                        for (int i = 0; i < cycle; i++) {
//                            // 每次读取allocate个字节
//                            mappedByteBuffer.get(bytes);
//                        }
//                        if(mode > 0) {
//                            bytes = new byte[mode];
//                            mappedByteBuffer.get(bytes);
//
//                            // 打印文件内容,关闭打印速度会很快
//                            // System.out.print(new String(eachBytes));
//                        }
                    }
                }
            } catch (e : IOException) {}
            finally {
                try {
                    fis?.close() // 先关闭，再释放文件锁
                    fileLock?.release()
                } catch (e : IOException) {}
            }
        }
        return ""
    }
}