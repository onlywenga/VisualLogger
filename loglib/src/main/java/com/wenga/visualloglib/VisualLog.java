package com.wenga.visualloglib;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Administrator on 2016/12/27.
 */
public class VisualLog {

    private static Context sContext;

    public static void init(final Context appContext) {
        sContext = appContext.getApplicationContext();
    }

    public static void d(String tag, String msg) {
        visualLog(Log.DEBUG, tag, msg);
    }

    public static void e(String tag, String msg) {
        visualLog(Log.ERROR, tag, msg);
    }

    public static void i(String tag, String msg) {
        visualLog(Log.INFO, tag, msg);
    }

    public static void w(String tag, String msg) {
        visualLog(Log.WARN, tag, msg);
    }

    private static void visualLog(final int level, final String tag, final String str) {
        if (sContext == null) {
            throw new IllegalArgumentException("VisualLog.init(context) missed");
        }
        Intent intent = new Intent();
        intent.setAction("com.bearduck.wenga.logger.msg");
        intent.putExtra("intent_extra_logger", str);
        intent.putExtra("intent_extra_tag", tag);
        intent.putExtra("intent_extra_level", level);
        intent.putExtra("intent_extra_pkg", sContext.getPackageName());
        sContext.sendBroadcast(intent);
    }

}