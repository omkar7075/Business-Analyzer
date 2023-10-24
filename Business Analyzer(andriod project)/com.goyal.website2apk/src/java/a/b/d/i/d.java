/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.Gravity
 *  java.lang.Object
 */
package a.b.d.i;

import android.graphics.Rect;
import android.os.Build;
import android.view.Gravity;

public final class d {
    public static void a(int n2, int n3, int n4, Rect rect, Rect rect2, int n5) {
        if (Build.VERSION.SDK_INT >= 17) {
            Gravity.apply((int)n2, (int)n3, (int)n4, (Rect)rect, (Rect)rect2, (int)n5);
            return;
        }
        Gravity.apply((int)n2, (int)n3, (int)n4, (Rect)rect, (Rect)rect2);
    }

    public static int b(int n2, int n3) {
        if (Build.VERSION.SDK_INT >= 17) {
            return Gravity.getAbsoluteGravity((int)n2, (int)n3);
        }
        return n2 & -8388609;
    }
}

