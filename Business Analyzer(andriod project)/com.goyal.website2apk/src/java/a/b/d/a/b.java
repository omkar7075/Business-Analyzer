/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.AppOpsManager
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 */
package a.b.d.a;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;

public final class b {
    public static int a(Context context, String string, String string2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager)context.getSystemService(AppOpsManager.class)).noteProxyOp(string, string2);
        }
        return 1;
    }

    public static String b(String string) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp((String)string);
        }
        return null;
    }
}

