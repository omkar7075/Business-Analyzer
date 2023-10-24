/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 */
package a.b.d.h;

import a.b.d.h.j;
import android.os.Build;

public class i {
    private static final c a;

    static {
        c c2 = Build.VERSION.SDK_INT >= 19 ? new b() : new c();
        a = c2;
    }

    public static boolean a(Object object, Object object2) {
        return a.a(object, object2);
    }

    private static class b
    extends c {
        private b() {
            super();
        }

        @Override
        public boolean a(Object object, Object object2) {
            return j.a(object, object2);
        }
    }

    private static class c {
        private c() {
        }

        public boolean a(Object object, Object object2) {
            return object == object2 || object != null && object.equals(object2);
            {
            }
        }
    }

}

