package com.common.core.ktx

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.provider.MediaStore
import com.common.core.basic.BasicApp
import java.io.File
import java.net.URI

/**
 * Describe: 与文件相关的扩展函数
 * Created by lyons on 2021/05/06.
 */

/**
 * 创建新文件，如果有同名文件则先删除
 */
fun File.createNewFileAfterDeleteOldFile() : Boolean {
    this.parentFile?.let {
        if(!it.exists()) it.mkdirs()
    }
    if(exists()) delete()
    return createNewFile()
}

/**
 * android Q 以下版本系统通知系统扫描文件变动，Q以上系统会自动扫描
 */
fun File.notifySystemToScanBelowAndroidQ() : File {
    if(exists()) {
        val intent = Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE)
        intent.data = Uri.parse("file://" + this.absolutePath)
        BasicApp.applicationContext.sendBroadcast(intent)
    }
    return this
}

/* 兼容高版本系统的uri 2 file */
inline val Uri.file : File?
    get() = if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) this.androidQOrHighFile else File(URI(toString()))

inline val Uri.androidQOrHighFile : File?
    @SuppressLint("Recycle")
    get() {
        val cursor = BasicApp.applicationContext.contentResolver.query(this, arrayOf(MediaStore.Images.Media.DATA), null, null, null)
        val filePath = if (cursor == null) {
            this.path ?: ""
        } else {
            try {
                val columnIndex = cursor.getColumnIndexOrThrow(MediaStore.Images.Media.DATA)
                cursor.moveToFirst()
                cursor.getString(columnIndex)
            } catch (e: IllegalArgumentException) { "" }
        }
        return if(filePath.isEmpty()) null else File(filePath)
    }