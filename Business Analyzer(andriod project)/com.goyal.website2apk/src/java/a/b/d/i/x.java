/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.WindowInsets
 *  java.lang.Class
 *  java.lang.Object
 */
package a.b.d.i;

import android.os.Build;
import android.view.WindowInsets;

public class x {
    private final Object a;

    private x(Object object) {
        this.a = object;
    }

    static Object i(x x2) {
        if (x2 == null) {
            return null;
        }
        return x2.a;
    }

    static x j(Object object) {
        if (object == null) {
            return null;
        }
        return new x(object);
    }

    public x a() {
        if (Build.VERSION.SDK_INT >= 20) {
            return new x((Object)((WindowInsets)this.a).consumeSystemWindowInsets());
        }
        return null;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets)this.a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets)this.a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets)this.a).getSystemWindowInsetRight();
        }
        return 0;
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets)this.a).getSystemWindowInsetTop();
        }
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (x.class != object.getClass()) {
                return false;
            }
            x x2 = (x)object;
            Object object2 = this.a;
            Object object3 = x2.a;
            if (object2 == null) {
                return object3 == null;
            }
            return object2.equals(object3);
        }
        return false;
    }

    public boolean f() {
        if (Build.VERSION.SDK_INT >= 20) {
            return ((WindowInsets)this.a).hasSystemWindowInsets();
        }
        return false;
    }

    public boolean g() {
        if (Build.VERSION.SDK_INT >= 21) {
            return ((WindowInsets)this.a).isConsumed();
        }
        return false;
    }

    public x h(int n2, int n3, int n4, int n5) {
        if (Build.VERSION.SDK_INT >= 20) {
            return new x((Object)((WindowInsets)this.a).replaceSystemWindowInsets(n2, n3, n4, n5));
        }
        return null;
    }

    public int hashCode() {
        Object object = this.a;
        if (object == null) {
            return 0;
        }
        return object.hashCode();
    }
}

