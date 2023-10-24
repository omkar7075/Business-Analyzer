/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.accessibility.AccessibilityEvent
 *  java.lang.Object
 */
package a.b.d.i.y;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

public final class a {
    private static final c a;

    /*
     * Enabled aggressive block sorting
     */
    static {
        void var1_2;
        int n2 = Build.VERSION.SDK_INT;
        if (n2 >= 19) {
            b b2 = new b();
        } else if (n2 >= 16) {
            a a2 = new a();
        } else {
            c c2 = new c();
        }
        a = var1_2;
    }

    public static int a(AccessibilityEvent accessibilityEvent) {
        return a.a(accessibilityEvent);
    }

    public static void b(AccessibilityEvent accessibilityEvent, int n2) {
        a.b(accessibilityEvent, n2);
    }

    static class a
    extends c {
        a() {
        }
    }

    static class b
    extends a {
        b() {
        }

        @Override
        public int a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        @Override
        public void b(AccessibilityEvent accessibilityEvent, int n2) {
            accessibilityEvent.setContentChangeTypes(n2);
        }
    }

    static class c {
        c() {
        }

        public int a(AccessibilityEvent accessibilityEvent) {
            return 0;
        }

        public void b(AccessibilityEvent accessibilityEvent, int n2) {
        }
    }

}

