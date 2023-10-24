/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.Log
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package a.b.d.a;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

public final class w {
    public static Intent a(Activity activity) {
        Intent intent;
        if (Build.VERSION.SDK_INT >= 16 && (intent = activity.getParentActivityIntent()) != null) {
            return intent;
        }
        String string = w.c(activity);
        if (string == null) {
            return null;
        }
        ComponentName componentName = new ComponentName((Context)activity, string);
        try {
            if (w.d((Context)activity, componentName) == null) {
                return Intent.makeMainActivity((ComponentName)componentName);
            }
            Intent intent2 = new Intent().setComponent(componentName);
            return intent2;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("getParentActivityIntent: bad parentActivityName '");
            stringBuilder.append(string);
            stringBuilder.append("' in manifest");
            Log.e((String)"NavUtils", (String)stringBuilder.toString());
            return null;
        }
    }

    public static Intent b(Context context, ComponentName componentName) {
        String string = w.d(context, componentName);
        if (string == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), string);
        if (w.d(context, componentName2) == null) {
            return Intent.makeMainActivity((ComponentName)componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String c(Activity activity) {
        try {
            String string = w.d((Context)activity, activity.getComponentName());
            return string;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            throw new IllegalArgumentException((Throwable)nameNotFoundException);
        }
    }

    public static String d(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 128);
        if (Build.VERSION.SDK_INT >= 16 && (string = activityInfo.parentActivityName) != null) {
            return string;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null) {
            return null;
        }
        String string2 = bundle.getString("android.support.PARENT_ACTIVITY");
        if (string2 == null) {
            return null;
        }
        if (string2.charAt(0) == '.') {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(context.getPackageName());
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
        }
        return string2;
    }

    public static void e(Activity activity, Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.navigateUpTo(intent);
            return;
        }
        intent.addFlags(67108864);
        activity.startActivity(intent);
        activity.finish();
    }

    public static boolean f(Activity activity, Intent intent) {
        if (Build.VERSION.SDK_INT >= 16) {
            return activity.shouldUpRecreateTask(intent);
        }
        String string = activity.getIntent().getAction();
        return string != null && !string.equals((Object)"android.intent.action.MAIN");
    }
}

