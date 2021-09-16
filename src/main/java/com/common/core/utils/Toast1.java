package com.common.core.utils;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Field;

/**
 * Describe:
 * Created by lyons on 2019/09/11.
 */
public class Toast1 {

    private static Toast makeText = null;

    private static Context sApplicationContext;
    public static void setup(Context applicationContext) {
        Toast1.sApplicationContext = applicationContext;
    }

    /**
     * 这是个单例Toast，只显示最新的Toast，会覆盖旧的Toast
     */
    public static void show(String content) {
        if (!TextUtils.isEmpty(content))
            show(content, false);
    }

    /**
     */
    public static void show(String content, boolean isLong) {
        if (makeText != null) {
            makeText.setText(content);
            makeText.show();
        } else {
            makeText = ToastCompat.showToast(Toast1.sApplicationContext, content, isLong ? Toast.LENGTH_LONG : Toast.LENGTH_SHORT);
        }
    }

    public static void showLong(String content) {
        show(content, true);
    }

    public static void cancel() {
        if (makeText != null) {
            makeText.cancel();
        }
    }

    static class ToastCompat {
        private static Field sField_TN;
        private static Field sField_TN_Handler;

        static {
            if (Build.VERSION.SDK_INT == Build.VERSION_CODES.N_MR1) {
                try {
                    //noinspection JavaReflectionMemberAccess
                    sField_TN = Toast.class.getDeclaredField("mTN");
                    sField_TN.setAccessible(true);

                    sField_TN_Handler = sField_TN.getType().getDeclaredField("mHandler");
                    sField_TN_Handler.setAccessible(true);
                } catch (Exception ignored) {
                }
            }
        }

        private static void hook(Toast toast) {
            try {
                Object tn = sField_TN.get(toast);
                Handler preHandler = (Handler) sField_TN_Handler.get(tn);
                sField_TN_Handler.set(tn, new SafelyHandlerWrapper(preHandler));
            } catch (Exception ignored) {
            }
        }

        static Toast showToast(Context context, CharSequence cs, int length) {
            Toast toast = Toast.makeText(context, cs, length);
            if (Build.VERSION.SDK_INT == Build.VERSION_CODES.N_MR1) {
                hook(toast);
            }
            toast.show();
            return toast;
        }

        private static class SafelyHandlerWrapper extends Handler {

            private Handler impl;

            SafelyHandlerWrapper(Handler impl) {
                this.impl = impl;
            }

            @Override
            public void handleMessage(@NotNull Message msg) {
                try {
                    impl.handleMessage(msg);
                } catch (Exception ignored) {
                }
            }
        }
    }
}