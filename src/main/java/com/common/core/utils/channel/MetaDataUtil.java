package com.common.core.utils.channel;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;

/**
 * 获取application节点下的medata工具类
 * 资源文件需要使用resource 普通字符串使用value
 *    <meta-data
 *             android:name="APP_LOGO"
 *             android:resource="@mipmap/app_logo"/>
 *
 *  如果引用的是字符串 需要使用value 即便他是以@的形式
 *   <meta-data
 *           android:name="APP_NAME"
 *           android:resource="@string/app_name"/>
 */
public class MetaDataUtil {


    private static int mAppLogoRes=-1;
    private static String mPerfix;
    private static String mAppScheme;
    private static String mAppName;
    private static String mUmengChanel;

    public static String getMetaDataStr(Context context, String key) {
        String resultData = "";
        if (!TextUtils.isEmpty(key)) {
            Bundle appInfoBundle = getAppInfoBundle(context);
            if (appInfoBundle != null)
                resultData = appInfoBundle.getString(key);
        }
        return resultData;
    }

    public static int getMetaDataInt(Context context, String key) {
        int resultData = 0;
        if (!TextUtils.isEmpty(key)) {
            Bundle appInfoBundle = getAppInfoBundle(context);
            if (appInfoBundle != null)
                resultData = appInfoBundle.getInt(key);
        }
        return resultData;
    }

    /**
     * 获取清单文件中appid
     *
     * @param context
     * @param
     * @return
     */
    public static int readQQAPPID(Context context) {
        return getAppInfoBundle(context).getInt("QQ_APPID", 0);
    }


    /**
     * 获取清单文件中splash
     *
     * @param context
     * @param
     * @return
     */
//    public static int readSplashPic(Context context) {
//        return getAppInfoBundle(context).getInt("SPLASH", R.mipmap.ic_launcher);
//    }

    /**
     * 获取清单文件中QQAPPKEY 长串的
     *
     * @param context
     * @param
     * @return
     */
    public static String readQQAppKey(Context context) {
        return getAppInfoBundle(context).getString("QQ_APP_KEY", "");
    }

    /**
     * 获取清单文件中前缀标识
     *
     * @param context
     * @param
     * @return
     */
    public static String readPerfix(Context context) {
        if (mPerfix==null) {
        mPerfix=getAppInfoBundle(context).getString("Prefix", "");
        }
        return mPerfix;
    }

    /**
     * 获取清单文件中Scheme标识
     *
     * @param context
     * @param
     * @return
     */
    public static String readAppScheme(Context context) {
        if (mAppScheme==null) {

        mAppScheme=getAppInfoBundle(context).getString("app_scheme", "");
        }
        return mAppScheme;
    }

    /**
     * 获取清单文件中Scheme标识
     *
     * @param context
     * @param
     * @return
     */
    public static String readAppName(Context context) {
        if (mAppName==null) {

            mAppName = getAppInfoBundle(context).getString("APP_NAME", "");
        }
        return mAppName;
    }

    /**
     * 获取清单文件中Scheme标识
     *
     * @param context
     * @param
     * @return
     */
    public static String readUmengChannel(Context context) {
        if (mUmengChanel==null) {

            mUmengChanel = getAppInfoBundle(context).getString("UMENG_CHANNEL", "");
        }
        return mUmengChanel;
    }

    /**
     * 获取清单文件中騰訊bugly标识
     *
     * @param context
     * @param
     * @return
     */
    public static String readBuglyKey(Context context) {
        return getAppInfoBundle(context).getString("BUGLY_APP_ID", "");
    }

    /**
     * 获取清单文件中主机地址
     *
     * @param context
     * @param
     * @return
     */
    public static String readHost(Context context) {
        return getAppInfoBundle(context).getString("Host", "");
    }

    public static String readImageHost(Context context) {
        return getAppInfoBundle(context).getString("Image_Host", "");
    }

    /**
     * 获取清单文件中工程环境
     *
     * @param context
     * @param
     * @return
     */
    public static String readEnvironmentConfig(Context context) {
        return getAppInfoBundle(context).getString("environment", "online");
    }

    /**
     * 获取清单文件中QQAPPKEY 长串的
     *
     * @param context
     * @param
     * @return
     */
    public static String readWetchatAppKey(Context context) {
        return getAppInfoBundle(context).getString("WECHAT_APP_KEY", "");
    }


    /**
     * 获取清单文件中的WECHATAPPID
     *
     * @param context
     * @return
     */
    public static String readWECHATAPPID(Context context) {
        return getAppInfoBundle(context).getString("WECHAT_APPID", "");
    }


    /**
     * 获取友盟唯一key
     *
     * @param context
     * @return
     */
    public static String readUmengKey(Context context) {
        return getAppInfoBundle(context).getString("UMENG_SHARE_KEY", "");
    }

//    /**
//     * 获取友盟唯一Secret
//     *
//     * @param context
//     * @return
//     */
//    public static String readSecretKey(Context context) {
//        return getAppInfoBundle(context).getString("UMENG_MSG_SECRET_KEY", "");
//    }
//
//    public static int readLoginLogo(Context context) {
//        return getAppInfoBundle(context).getInt("LOGIN_LOGO", R.mipmap.ic_launcher);
//    }

//    /**
//     * 获取applogo
//     *
//     * @param context
//     * @return
//     */
//    public static int readAppLogo(Context context) {
//        if (mAppLogoRes==-1) {
//       mAppLogoRes= getAppInfoBundle(context).getInt("APP_LOGO",R.mipmap.ic_launcher);
//        }
//        return mAppLogoRes;
//    }

    private static Bundle getAppInfoBundle(Context context) {
        //注意：这里ApplicationInfo不能直接 CommonApplication.mApplication.getApplicationInfo()这样获取，否则会获取不到meta_data的
        ApplicationInfo applicationInfo = getAppInfo(context);
        if (applicationInfo != null) {
            return applicationInfo.metaData;
        }
        //避免空指针闪退
        return new Bundle();
    }

    private static ApplicationInfo getAppInfo(Context context) {
        PackageManager packageManager = context.getPackageManager();
        ApplicationInfo applicationInfo = null;
        if (packageManager != null) {
            try {
                applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
        return applicationInfo;
    }
}
