/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.os.Process
 *  java.lang.Object
 *  java.lang.String
 */
package a.b.d.b;

import a.b.d.a.b;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;

public final class c {
    public static int a(Context context, String string, int n2, int n3, String string2) {
        if (context.checkPermission(string, n2, n3) == -1) {
            return -1;
        }
        String string3 = b.b(string);
        if (string3 == null) {
            return 0;
        }
        if (string2 == null) {
            String[] arrstring = context.getPackageManager().getPackagesForUid(n3);
            if (arrstring != null) {
                if (arrstring.length <= 0) {
                    return -1;
                }
                string2 = arrstring[0];
            } else {
                return -1;
            }
        }
        if (b.a(context, string3, string2) != 0) {
            return -2;
        }
        return 0;
    }

    public static int b(Context context, String string) {
        return c.a(context, string, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}

