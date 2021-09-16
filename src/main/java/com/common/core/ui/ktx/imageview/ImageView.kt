package com.common.core.ui.ktx.imageview

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.annotation.DrawableRes
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestBuilder
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target

/**
 * Describe: ImageView的扩展函数
 * Created by Lyons-Hoo on 2020/06/03.
 */
/* 普通加载 */
inline fun ImageView.loadRemoteImage(url : String, crossinline loadSuccessAction : (Drawable) -> Unit = {}) : ImageView {
    val builder = Glide.with(this).load(url)
    builder.onLoadSuccess(loadSuccessAction)
    builder.into(this)
    return this
}

inline fun ImageView.loadLocalImage(@DrawableRes imgRes: Int, crossinline loadSuccessAction : (Drawable) -> Unit = {}) : ImageView {
    val builder = Glide.with(this).load(imgRes)
    builder.onLoadSuccess(loadSuccessAction)
    builder.into(this)
    return this
}

inline fun ImageView.loadLocalImage(absPath: String, crossinline loadSuccessAction : (Drawable) -> Unit = {}) : ImageView {
    val builder = Glide.with(this).load("file://$absPath")
    builder.onLoadSuccess(loadSuccessAction)
    builder.into(this)
    return this
}

/* 圆形图片加载 */
inline fun ImageView.loadCircleRemoteImage(url : String, crossinline loadSuccessAction : (Drawable) -> Unit = {}) : ImageView {
    val builder = Glide.with(this)
        .load(url)
        .apply(cropCircleOptions())
    builder.onLoadSuccess(loadSuccessAction)
    builder.into(this)
    return this
}

inline fun ImageView.loadCircleLocalImage(@DrawableRes imgRes: Int, crossinline loadSuccessAction : (Drawable) -> Unit = {}) : ImageView {
    val builder = Glide.with(this)
        .load(imgRes)
        .apply(cropCircleOptions())
    builder.onLoadSuccess(loadSuccessAction)
    builder.into(this)
    return this
}

inline fun ImageView.loadCircleLocalImage(absPath: String, crossinline loadSuccessAction : (Drawable) -> Unit = {}) : ImageView {
    val builder = Glide.with(this)
        .load("file://$absPath")
        .apply(cropCircleOptions())
    builder.onLoadSuccess(loadSuccessAction)
    builder.into(this)
    return this
}

/* 圆角图片加载 */
inline fun ImageView.loadRoundRemoteImage(url : String, radius : Int, centerCrop : Boolean = false, crossinline loadSuccessAction : (Drawable) -> Unit = {}) : ImageView {
    val builder = Glide.with(this)
        .load(url)
        .apply(
            if(centerCrop) {
                defaultOptions().transform(
                    GlideRoundTransform(
                        radius
                    )
                )
            } else {
                RequestOptions().transform(
                    GlideRoundTransform(
                        radius
                    )
                )
            }
        )
    builder.onLoadSuccess(loadSuccessAction)
    builder.into(this)
    return this
}

inline fun ImageView.loadRoundLocalImage(@DrawableRes imgRes: Int, radius : Int, centerCrop : Boolean = false, crossinline loadSuccessAction : (Drawable) -> Unit = {}) : ImageView {
    val builder = Glide.with(this)
        .load(imgRes)
        .apply(
            if(centerCrop) {
                defaultOptions().transform(
                    GlideRoundTransform(
                        radius
                    )
                )
            } else {
                RequestOptions().transform(
                    GlideRoundTransform(
                        radius
                    )
                )
            }
        )
    builder.onLoadSuccess(loadSuccessAction)
    builder.into(this)
    return this
}

inline fun ImageView.loadRoundLocalImage(absPath: String, radius : Int, centerCrop : Boolean = false, crossinline loadSuccessAction : (Drawable) -> Unit = {}) : ImageView {
    val builder = Glide.with(this)
        .load("file://$absPath")
        .apply(
            if(centerCrop) {
                defaultOptions().transform(
                    GlideRoundTransform(
                        radius
                    )
                )
            } else {
                RequestOptions().transform(
                    GlideRoundTransform(
                        radius
                    )
                )
            }
        )
    builder.onLoadSuccess(loadSuccessAction)
    builder.into(this)
    return this
}

fun defaultOptions(): RequestOptions {
    return RequestOptions()
        .centerCrop()
}

fun cropCircleOptions(): RequestOptions {
    return RequestOptions()
        .circleCrop()
}

inline fun <T> RequestBuilder<T>.onLoadSuccess(crossinline action : (T) -> Unit) : RequestBuilder<T> {
    return addListener(object : RequestListener<T> {
        override fun onLoadFailed(
            e: GlideException?,
            model: Any?,
            target: Target<T>?,
            isFirstResource: Boolean
        ): Boolean {
            return false
        }

        override fun onResourceReady(
            resource: T,
            model: Any?,
            target: Target<T>?,
            dataSource: DataSource?,
            isFirstResource: Boolean
        ): Boolean {
            action(resource)
            return false
        }
    })
}