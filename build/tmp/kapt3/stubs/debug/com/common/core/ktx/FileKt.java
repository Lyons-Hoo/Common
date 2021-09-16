package com.common.core.ktx;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\u0001\u001a\n\u0010\t\u001a\u00020\u0001*\u00020\u0001\"\u0018\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028\u00c7\u0002\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00028\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u00a8\u0006\n"}, d2 = {"androidQOrHighFile", "Ljava/io/File;", "Landroid/net/Uri;", "getAndroidQOrHighFile", "(Landroid/net/Uri;)Ljava/io/File;", "file", "getFile", "createNewFileAfterDeleteOldFile", "", "notifySystemToScanBelowAndroidQ", "core_debug"})
public final class FileKt {
    
    /**
     * 创建新文件，如果有同名文件则先删除
     */
    public static final boolean createNewFileAfterDeleteOldFile(@org.jetbrains.annotations.NotNull()
    java.io.File $this$createNewFileAfterDeleteOldFile) {
        return false;
    }
    
    /**
     * android Q 以下版本系统通知系统扫描文件变动，Q以上系统会自动扫描
     */
    @org.jetbrains.annotations.NotNull()
    public static final java.io.File notifySystemToScanBelowAndroidQ(@org.jetbrains.annotations.NotNull()
    java.io.File $this$notifySystemToScanBelowAndroidQ) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.io.File getFile(@org.jetbrains.annotations.NotNull()
    android.net.Uri $this$file) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"Recycle"})
    public static final java.io.File getAndroidQOrHighFile(@org.jetbrains.annotations.NotNull()
    android.net.Uri $this$androidQOrHighFile) {
        return null;
    }
}