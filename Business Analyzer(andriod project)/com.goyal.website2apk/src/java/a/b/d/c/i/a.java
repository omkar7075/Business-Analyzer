/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  org.xmlpull.v1.XmlPullParser
 */
package a.b.d.c.i;

import a.b.d.c.i.f;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

public final class a {
    static final e a;

    /*
     * Enabled aggressive block sorting
     */
    static {
        void var1_2;
        int n2 = Build.VERSION.SDK_INT;
        if (n2 >= 23) {
            d d2 = new d();
        } else if (n2 >= 21) {
            c c2 = new c();
        } else if (n2 >= 19) {
            b b2 = new b();
        } else if (n2 >= 17) {
            a a2 = new a();
        } else {
            e e2 = new e();
        }
        a = var1_2;
    }

    public static void a(Drawable drawable, Resources.Theme theme) {
        a.a(drawable, theme);
    }

    public static boolean b(Drawable drawable) {
        return a.b(drawable);
    }

    public static int c(Drawable drawable) {
        return a.c(drawable);
    }

    public static ColorFilter d(Drawable drawable) {
        return a.d(drawable);
    }

    public static int e(Drawable drawable) {
        return a.e(drawable);
    }

    public static void f(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        a.f(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean g(Drawable drawable) {
        return a.g(drawable);
    }

    public static void h(Drawable drawable) {
        a.h(drawable);
    }

    public static void i(Drawable drawable, boolean bl) {
        a.i(drawable, bl);
    }

    public static void j(Drawable drawable, float f2, float f3) {
        a.j(drawable, f2, f3);
    }

    public static void k(Drawable drawable, int n2, int n3, int n4, int n5) {
        a.k(drawable, n2, n3, n4, n5);
    }

    public static boolean l(Drawable drawable, int n2) {
        return a.l(drawable, n2);
    }

    public static void m(Drawable drawable, int n2) {
        a.m(drawable, n2);
    }

    public static void n(Drawable drawable, ColorStateList colorStateList) {
        a.n(drawable, colorStateList);
    }

    public static void o(Drawable drawable, PorterDuff.Mode mode) {
        a.o(drawable, mode);
    }

    public static Drawable p(Drawable drawable) {
        return a.p(drawable);
    }

    static class a
    extends e {
        private static Method a;
        private static boolean b;
        private static Method c;
        private static boolean d;

        a() {
        }

        @Override
        public int e(Drawable drawable) {
            Method method;
            if (!d) {
                try {
                    Method method2;
                    c = method2 = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    method2.setAccessible(true);
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    Log.i((String)"DrawableCompatApi17", (String)"Failed to retrieve getLayoutDirection() method", (Throwable)noSuchMethodException);
                }
                d = true;
            }
            if ((method = c) != null) {
                try {
                    int n2 = (Integer)method.invoke((Object)drawable, new Object[0]);
                    return n2;
                }
                catch (Exception exception) {
                    Log.i((String)"DrawableCompatApi17", (String)"Failed to invoke getLayoutDirection() via reflection", (Throwable)exception);
                    c = null;
                }
            }
            return 0;
        }

        @Override
        public boolean l(Drawable drawable, int n2) {
            Method method;
            if (!b) {
                try {
                    Method method2;
                    Class[] arrclass = new Class[]{Integer.TYPE};
                    a = method2 = Drawable.class.getDeclaredMethod("setLayoutDirection", arrclass);
                    method2.setAccessible(true);
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    Log.i((String)"DrawableCompatApi17", (String)"Failed to retrieve setLayoutDirection(int) method", (Throwable)noSuchMethodException);
                }
                b = true;
            }
            if ((method = a) != null) {
                try {
                    Object[] arrobject = new Object[]{n2};
                    method.invoke((Object)drawable, arrobject);
                    return true;
                }
                catch (Exception exception) {
                    Log.i((String)"DrawableCompatApi17", (String)"Failed to invoke setLayoutDirection(int) via reflection", (Throwable)exception);
                    a = null;
                }
            }
            return false;
        }
    }

    static class b
    extends a {
        b() {
        }

        @Override
        public int c(Drawable drawable) {
            return drawable.getAlpha();
        }

        @Override
        public boolean g(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        @Override
        public void i(Drawable drawable, boolean bl) {
            drawable.setAutoMirrored(bl);
        }

        @Override
        public Drawable p(Drawable drawable) {
            if (!(drawable instanceof f)) {
                return new a.b.d.c.i.d(drawable);
            }
            return drawable;
        }
    }

    static class c
    extends b {
        c() {
        }

        @Override
        public void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        @Override
        public boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        @Override
        public ColorFilter d(Drawable drawable) {
            return drawable.getColorFilter();
        }

        @Override
        public void f(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        @Override
        public void j(Drawable drawable, float f2, float f3) {
            drawable.setHotspot(f2, f3);
        }

        @Override
        public void k(Drawable drawable, int n2, int n3, int n4, int n5) {
            drawable.setHotspotBounds(n2, n3, n4, n5);
        }

        @Override
        public void m(Drawable drawable, int n2) {
            drawable.setTint(n2);
        }

        @Override
        public void n(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        @Override
        public void o(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }

        @Override
        public Drawable p(Drawable drawable) {
            if (!(drawable instanceof f)) {
                return new a.b.d.c.i.e(drawable);
            }
            return drawable;
        }
    }

    static class d
    extends c {
        d() {
        }

        @Override
        public int e(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        @Override
        public boolean l(Drawable drawable, int n2) {
            return drawable.setLayoutDirection(n2);
        }

        @Override
        public Drawable p(Drawable drawable) {
            return drawable;
        }
    }

    static class e {
        e() {
        }

        public void a(Drawable drawable, Resources.Theme theme) {
        }

        public boolean b(Drawable drawable) {
            return false;
        }

        public int c(Drawable drawable) {
            return 0;
        }

        public ColorFilter d(Drawable drawable) {
            return null;
        }

        public int e(Drawable drawable) {
            return 0;
        }

        public void f(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }

        public boolean g(Drawable drawable) {
            return false;
        }

        public void h(Drawable drawable) {
            drawable.jumpToCurrentState();
        }

        public void i(Drawable drawable, boolean bl) {
        }

        public void j(Drawable drawable, float f2, float f3) {
        }

        public void k(Drawable drawable, int n2, int n3, int n4, int n5) {
        }

        public boolean l(Drawable drawable, int n2) {
            return false;
        }

        public void m(Drawable drawable, int n2) {
            if (drawable instanceof f) {
                ((f)drawable).setTint(n2);
            }
        }

        public void n(Drawable drawable, ColorStateList colorStateList) {
            if (drawable instanceof f) {
                ((f)drawable).setTintList(colorStateList);
            }
        }

        public void o(Drawable drawable, PorterDuff.Mode mode) {
            if (drawable instanceof f) {
                ((f)drawable).setTintMode(mode);
            }
        }

        public Drawable p(Drawable drawable) {
            if (!(drawable instanceof f)) {
                return new a.b.d.c.i.c(drawable);
            }
            return drawable;
        }
    }

}

