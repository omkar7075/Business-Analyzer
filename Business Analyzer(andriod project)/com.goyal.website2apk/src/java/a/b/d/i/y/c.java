/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 */
package a.b.d.i.y;

import android.os.Build;

public class c {
    private static final a a;
    private final Object b;

    /*
     * Enabled aggressive block sorting
     */
    static {
        void var1_2;
        int n2 = Build.VERSION.SDK_INT;
        if (n2 >= 19) {
            c c2 = new c();
        } else if (n2 >= 16) {
            b b2 = new b();
        } else {
            d d2 = new d();
        }
        a = var1_2;
    }

    public c(Object object) {
        this.b = object;
    }

    public Object a() {
        return this.b;
    }

    static interface a {
    }

    private static class b
    extends d {
        b() {
        }
    }

    private static class c
    extends d {
        c() {
        }
    }

    static class d
    implements a {
        d() {
        }
    }

}

