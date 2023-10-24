/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.accessibility.AccessibilityRecord
 *  java.lang.Object
 */
package a.b.d.i.y;

import android.os.Build;
import android.view.accessibility.AccessibilityRecord;

public class d {
    private static final c a;

    /*
     * Enabled aggressive block sorting
     */
    static {
        void var1_2;
        int n2 = Build.VERSION.SDK_INT;
        if (n2 >= 16) {
            b b2 = new b();
        } else if (n2 >= 15) {
            a a2 = new a();
        } else {
            c c2 = new c();
        }
        a = var1_2;
    }

    public static void a(AccessibilityRecord accessibilityRecord, int n2) {
        a.a(accessibilityRecord, n2);
    }

    public static void b(AccessibilityRecord accessibilityRecord, int n2) {
        a.b(accessibilityRecord, n2);
    }

    static class a
    extends c {
        a() {
        }

        @Override
        public void a(AccessibilityRecord accessibilityRecord, int n2) {
            accessibilityRecord.setMaxScrollX(n2);
        }

        @Override
        public void b(AccessibilityRecord accessibilityRecord, int n2) {
            accessibilityRecord.setMaxScrollY(n2);
        }
    }

    static class b
    extends a {
        b() {
        }
    }

    static class c {
        c() {
        }

        public void a(AccessibilityRecord accessibilityRecord, int n2) {
        }

        public void b(AccessibilityRecord accessibilityRecord, int n2) {
        }
    }

}

