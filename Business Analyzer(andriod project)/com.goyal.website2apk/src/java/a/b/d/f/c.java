/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Trace
 *  java.lang.Object
 *  java.lang.String
 */
package a.b.d.f;

import android.os.Build;
import android.os.Trace;

public final class c {
    public static void a(String string) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection((String)string);
        }
    }

    public static void b() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}

