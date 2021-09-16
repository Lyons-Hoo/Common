package com.common.core.ui.ktx

import android.Manifest
import android.annotation.SuppressLint
import android.content.ContentValues
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.os.Build
import android.os.CountDownTimer
import android.os.Environment
import android.provider.MediaStore
import android.view.View
import android.widget.TextView
import androidx.annotation.RequiresPermission
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.common.core.basic.BasicApp
import com.common.core.ktx.createNewFileAfterDeleteOldFile
import com.common.core.ktx.file
import com.common.core.ktx.notifySystemToScanBelowAndroidQ
import com.common.core.log.RandomStringProvider
import java.io.*
import java.util.*

/**
 * Describe: 与View相关的扩展函数
 * Created by lyons on 2020/09/15.
 */
inline fun <V : View> V.onClick(crossinline action : (V) -> Unit) {
    setOnClickListener { action(this) }
}

inline fun <V : View> V.onLongClick(crossinline action : (V) -> Boolean) {
    setOnLongClickListener { action(this) }
}

fun RecyclerView.verticalLayout() : RecyclerView {
    this.layoutManager = LinearLayoutManager(this.context)
    return this
}

fun RecyclerView.horizontalLayout() : RecyclerView {
    this.layoutManager = LinearLayoutManager(this.context, RecyclerView.HORIZONTAL, false)
    return this
}

fun RecyclerView.gridLayout(spanCount : Int) : RecyclerView {
    this.layoutManager = GridLayoutManager(this.context, spanCount)
    return this
}

fun View.dumpViewDrawingCache() : Bitmap {
    val drawingCache = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.RGB_565)
    val canvas = Canvas()
    canvas.setBitmap(drawingCache)
    draw(canvas)
    return drawingCache
}

/**
 * 倒计时
 */
fun TextView.startCountDown(
    suffixText : String = "s后重新发送",/*倒计时后缀文本*/
    finishText : String = "重新发送",/*倒计时结束文本*/
    finishSeconds : Int = 60, /*倒计时结束时间*/
    finishAction : (() -> Unit)? = null /*倒计时结束事件*/
) : CountDownTimer
{
    val countDownTimer = object : CountDownTimer(finishSeconds * 1000L, 1000) {
        override fun onTick(millisUntilFinished: Long) {
            this@startCountDown.isEnabled = false
            val seconds = (millisUntilFinished / 1000).toInt()
            @SuppressLint("SetTextI18n")
            this@startCountDown.text = "${if(seconds < 10) "0$seconds" else seconds.toString()}$suffixText"
        }

        override fun onFinish() {
            this@startCountDown.isEnabled = true
            this@startCountDown.text = finishText
            finishAction?.invoke()
        }
    }
    this.addOnAttachStateChangeListener(object : View.OnAttachStateChangeListener {
        override fun onViewAttachedToWindow(v: View?) {
        }

        override fun onViewDetachedFromWindow(v: View?) {
            this@startCountDown.removeOnAttachStateChangeListener(this)
            countDownTimer.cancel()
        }
    })
    return countDownTimer.start()
}

inline fun <reified Activity : FragmentActivity> Fragment.doInHost(crossinline action : (Activity) -> Unit) {
    val host = this.activity
    if(host is Activity) action(host)
}

inline fun <reified Fragment : androidx.fragment.app.Fragment> androidx.fragment.app.Fragment.doInParent(crossinline action : (Fragment) -> Unit) {
    val parent = this.parentFragment
    if(parent is Fragment) action(parent)
}

/**
 * 将图像保存到系统相册
 * @param format 图片编码格式
 * @param quality 质量
 * @return 保存到本地的文件
 */
@RequiresPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
fun Drawable.save2Gallery(format: Bitmap.CompressFormat = Bitmap.CompressFormat.PNG,
                          quality: Int = 80
) : File? {
    return this.bitmap.save2Gallery(format, quality)
}

inline val Drawable.bitmap : Bitmap
    get() {
        return if(this is BitmapDrawable) this.bitmap
        else {
            val width = this.intrinsicWidth
            val height = this.intrinsicHeight
            setBounds(0, 0, width, height)
            val config = Bitmap.Config.RGB_565
            val bitmap = Bitmap.createBitmap(width, height, config)
            //注意，下面三行代码要用到，否则在View或者SurfaceView里的canvas.drawBitmap会看不到图
            val canvas = Canvas(bitmap)
            draw(canvas)
            bitmap
        }
    }

inline val Bitmap.drawable : Drawable
    get() = BitmapDrawable(this)

@RequiresPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)
fun Bitmap.save2Gallery(
    format: Bitmap.CompressFormat = Bitmap.CompressFormat.PNG,
    quality: Int = 80
) : File? {
    val dirName = BasicApp.applicationContext.packageName // 目录名
    val suffix = (if (Bitmap.CompressFormat.JPEG == format) "JPG" else format.name).toLowerCase(
        Locale.getDefault())
    val fileName = "${System.currentTimeMillis()}_${RandomStringProvider().provide()}_$quality.$suffix"
    if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) { // 保存到系统文件目录
        val picDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM)
        val destFile = File(picDir, "$dirName/$fileName")
        destFile.createNewFileAfterDeleteOldFile() // 覆盖旧文件
        val ret: Boolean
        var os: OutputStream? = null
        try {
            os = BufferedOutputStream(FileOutputStream(destFile))
            ret = this.compress(format, quality, os)
            if(ret) return destFile.notifySystemToScanBelowAndroidQ() // 通知系统刷新相册
        } catch (e: IOException) {
        } finally {
            try { os?.close() }
            catch (e: IOException) {}
        }
    } else { // 10.0及以上版本的系统
        val contentValues = ContentValues()
        contentValues.put(MediaStore.Images.Media.DISPLAY_NAME, fileName)
        contentValues.put(MediaStore.Images.Media.MIME_TYPE, "image/*")
        val contentUri = if (Environment.getExternalStorageState() == Environment.MEDIA_MOUNTED) {
            MediaStore.Images.Media.EXTERNAL_CONTENT_URI
        } else {
            MediaStore.Images.Media.INTERNAL_CONTENT_URI
        }
        contentValues.put(
            MediaStore.Images.Media.RELATIVE_PATH,
            Environment.DIRECTORY_DCIM.toString() + "/" + dirName
        )
        contentValues.put(MediaStore.MediaColumns.IS_PENDING, 1)
        val uri = BasicApp.applicationContext.contentResolver.insert(contentUri, contentValues)
        uri?.let {
            var os : OutputStream? = null
            try {
                os = BasicApp.applicationContext.contentResolver.openOutputStream(uri)
                this.compress(format, quality, os)
                contentValues.clear()
                contentValues.put(MediaStore.MediaColumns.IS_PENDING, 0)
                BasicApp.applicationContext.contentResolver.update(uri, contentValues, null, null)
                return uri.file
            } catch (e: java.lang.Exception) {
                BasicApp.applicationContext.contentResolver.delete(uri, null, null)
            } finally {
                try { os?.close() }
                catch (e: IOException) {}
            }
        }
    }
    return null
}