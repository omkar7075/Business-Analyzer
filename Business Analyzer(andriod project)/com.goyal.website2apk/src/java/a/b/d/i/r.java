/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.ViewGroup
 *  java.lang.Deprecated
 *  java.lang.Object
 */
package a.b.d.i;

import android.os.Build;
import android.view.ViewGroup;

public final class r {
    static final c a;

    /*
     * Enabled aggressive block sorting
     */
    static {
        void var1_2;
        int n2 = Build.VERSION.SDK_INT;
        if (n2 >= 21) {
            b b2 = new b();
        } else if (n2 >= 18) {
            a a2 = new a();
        } else {
            c c2 = new c();
        }
        a = var1_2;
    }

    @Deprecated
    public static void a(ViewGroup viewGroup, boolean bl) {
        viewGroup.setMotionEventSplittingEnabled(bl);
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
    }

    static class c {
        c() {
        }
    }

}

