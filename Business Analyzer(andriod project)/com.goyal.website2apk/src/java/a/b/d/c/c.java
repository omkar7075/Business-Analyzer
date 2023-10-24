/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.CancellationSignal
 *  android.widget.TextView
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package a.b.d.c;

import a.b.d.b.d.a;
import a.b.d.c.d;
import a.b.d.c.e;
import a.b.d.c.f;
import a.b.d.c.g;
import a.b.d.g.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.widget.TextView;

public class c {
    private static final a a;
    private static final a.b.d.h.g<String, Typeface> b;

    /*
     * Enabled aggressive block sorting
     */
    static {
        void var1_2;
        int n2 = Build.VERSION.SDK_INT;
        if (n2 >= 26) {
            f f2 = new f();
        } else if (n2 >= 24 && e.j()) {
            e e2 = new e();
        } else if (n2 >= 21) {
            d d2 = new d();
        } else {
            g g2 = new g();
        }
        a = var1_2;
        b = new a.b.d.h.g(16);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b.f[] arrf, int n2) {
        return a.c(context, cancellationSignal, arrf, n2);
    }

    public static Typeface b(Context context, a.a a2, Resources resources, int n2, int n3, TextView textView) {
        Typeface typeface;
        if (a2 instanceof a.d) {
            a.d d2 = (a.d)a2;
            typeface = b.k(context, d2.b(), textView, d2.a(), d2.c(), n3);
        } else {
            typeface = a.a(context, (a.b)a2, resources, n3);
        }
        if (typeface != null) {
            b.d(c.d(resources, n2, n3), typeface);
        }
        return typeface;
    }

    public static Typeface c(Context context, Resources resources, int n2, String string, int n3) {
        Typeface typeface = a.b(context, resources, n2, string, n3);
        if (typeface != null) {
            b.d(c.d(resources, n2, n3), typeface);
        }
        return typeface;
    }

    private static String d(Resources resources, int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(resources.getResourcePackageName(n2));
        stringBuilder.append("-");
        stringBuilder.append(n2);
        stringBuilder.append("-");
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public static Typeface e(Resources resources, int n2, int n3) {
        return b.c(c.d(resources, n2, n3));
    }

    static interface a {
        public Typeface a(Context var1, a.b var2, Resources var3, int var4);

        public Typeface b(Context var1, Resources var2, int var3, String var4, int var5);

        public Typeface c(Context var1, CancellationSignal var2, b.f[] var3, int var4);
    }

}

