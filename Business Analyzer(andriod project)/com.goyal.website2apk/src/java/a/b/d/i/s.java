/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewParent
 *  java.lang.AbstractMethodError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package a.b.d.i;

import a.b.d.i.k;
import a.b.d.i.l;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

public final class s {
    static final c a;

    /*
     * Enabled aggressive block sorting
     */
    static {
        void var1_2;
        int n2 = Build.VERSION.SDK_INT;
        if (n2 >= 21) {
            b b2 = new b();
        } else if (n2 >= 19) {
            a a2 = new a();
        } else {
            c c2 = new c();
        }
        a = var1_2;
    }

    public static boolean a(ViewParent viewParent, View view, float f2, float f3, boolean bl) {
        return a.a(viewParent, view, f2, f3, bl);
    }

    public static boolean b(ViewParent viewParent, View view, float f2, float f3) {
        return a.b(viewParent, view, f2, f3);
    }

    public static void c(ViewParent viewParent, View view, int n2, int n3, int[] arrn, int n4) {
        if (viewParent instanceof k) {
            ((k)viewParent).m(view, n2, n3, arrn, n4);
            return;
        }
        if (n4 == 0) {
            a.c(viewParent, view, n2, n3, arrn);
        }
    }

    public static void d(ViewParent viewParent, View view, int n2, int n3, int n4, int n5, int n6) {
        if (viewParent instanceof k) {
            ((k)viewParent).k(view, n2, n3, n4, n5, n6);
            return;
        }
        if (n6 == 0) {
            a.d(viewParent, view, n2, n3, n4, n5);
        }
    }

    public static void e(ViewParent viewParent, View view, View view2, int n2, int n3) {
        if (viewParent instanceof k) {
            ((k)viewParent).i(view, view2, n2, n3);
            return;
        }
        if (n3 == 0) {
            a.e(viewParent, view, view2, n2);
        }
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int n2, int n3) {
        if (viewParent instanceof k) {
            return ((k)viewParent).n(view, view2, n2, n3);
        }
        if (n3 == 0) {
            return a.f(viewParent, view, view2, n2);
        }
        return false;
    }

    public static void g(ViewParent viewParent, View view, int n2) {
        if (viewParent instanceof k) {
            ((k)viewParent).l(view, n2);
            return;
        }
        if (n2 == 0) {
            a.g(viewParent, view);
        }
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
        public boolean a(ViewParent viewParent, View view, float f2, float f3, boolean bl) {
            try {
                boolean bl2 = viewParent.onNestedFling(view, f2, f3, bl);
                return bl2;
            }
            catch (AbstractMethodError abstractMethodError) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ViewParent ");
                stringBuilder.append((Object)viewParent);
                stringBuilder.append(" does not implement interface ");
                stringBuilder.append("method onNestedFling");
                Log.e((String)"ViewParentCompat", (String)stringBuilder.toString(), (Throwable)abstractMethodError);
                return false;
            }
        }

        @Override
        public boolean b(ViewParent viewParent, View view, float f2, float f3) {
            try {
                boolean bl = viewParent.onNestedPreFling(view, f2, f3);
                return bl;
            }
            catch (AbstractMethodError abstractMethodError) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ViewParent ");
                stringBuilder.append((Object)viewParent);
                stringBuilder.append(" does not implement interface ");
                stringBuilder.append("method onNestedPreFling");
                Log.e((String)"ViewParentCompat", (String)stringBuilder.toString(), (Throwable)abstractMethodError);
                return false;
            }
        }

        @Override
        public void c(ViewParent viewParent, View view, int n2, int n3, int[] arrn) {
            try {
                viewParent.onNestedPreScroll(view, n2, n3, arrn);
                return;
            }
            catch (AbstractMethodError abstractMethodError) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ViewParent ");
                stringBuilder.append((Object)viewParent);
                stringBuilder.append(" does not implement interface ");
                stringBuilder.append("method onNestedPreScroll");
                Log.e((String)"ViewParentCompat", (String)stringBuilder.toString(), (Throwable)abstractMethodError);
                return;
            }
        }

        @Override
        public void d(ViewParent viewParent, View view, int n2, int n3, int n4, int n5) {
            try {
                viewParent.onNestedScroll(view, n2, n3, n4, n5);
                return;
            }
            catch (AbstractMethodError abstractMethodError) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ViewParent ");
                stringBuilder.append((Object)viewParent);
                stringBuilder.append(" does not implement interface ");
                stringBuilder.append("method onNestedScroll");
                Log.e((String)"ViewParentCompat", (String)stringBuilder.toString(), (Throwable)abstractMethodError);
                return;
            }
        }

        @Override
        public void e(ViewParent viewParent, View view, View view2, int n2) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, n2);
                return;
            }
            catch (AbstractMethodError abstractMethodError) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ViewParent ");
                stringBuilder.append((Object)viewParent);
                stringBuilder.append(" does not implement interface ");
                stringBuilder.append("method onNestedScrollAccepted");
                Log.e((String)"ViewParentCompat", (String)stringBuilder.toString(), (Throwable)abstractMethodError);
                return;
            }
        }

        @Override
        public boolean f(ViewParent viewParent, View view, View view2, int n2) {
            try {
                boolean bl = viewParent.onStartNestedScroll(view, view2, n2);
                return bl;
            }
            catch (AbstractMethodError abstractMethodError) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ViewParent ");
                stringBuilder.append((Object)viewParent);
                stringBuilder.append(" does not implement interface ");
                stringBuilder.append("method onStartNestedScroll");
                Log.e((String)"ViewParentCompat", (String)stringBuilder.toString(), (Throwable)abstractMethodError);
                return false;
            }
        }

        @Override
        public void g(ViewParent viewParent, View view) {
            try {
                viewParent.onStopNestedScroll(view);
                return;
            }
            catch (AbstractMethodError abstractMethodError) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ViewParent ");
                stringBuilder.append((Object)viewParent);
                stringBuilder.append(" does not implement interface ");
                stringBuilder.append("method onStopNestedScroll");
                Log.e((String)"ViewParentCompat", (String)stringBuilder.toString(), (Throwable)abstractMethodError);
                return;
            }
        }
    }

    static class c {
        c() {
        }

        public boolean a(ViewParent viewParent, View view, float f2, float f3, boolean bl) {
            if (viewParent instanceof l) {
                return ((l)viewParent).onNestedFling(view, f2, f3, bl);
            }
            return false;
        }

        public boolean b(ViewParent viewParent, View view, float f2, float f3) {
            if (viewParent instanceof l) {
                return ((l)viewParent).onNestedPreFling(view, f2, f3);
            }
            return false;
        }

        public void c(ViewParent viewParent, View view, int n2, int n3, int[] arrn) {
            if (viewParent instanceof l) {
                ((l)viewParent).onNestedPreScroll(view, n2, n3, arrn);
            }
        }

        public void d(ViewParent viewParent, View view, int n2, int n3, int n4, int n5) {
            if (viewParent instanceof l) {
                ((l)viewParent).onNestedScroll(view, n2, n3, n4, n5);
            }
        }

        public void e(ViewParent viewParent, View view, View view2, int n2) {
            if (viewParent instanceof l) {
                ((l)viewParent).onNestedScrollAccepted(view, view2, n2);
            }
        }

        public boolean f(ViewParent viewParent, View view, View view2, int n2) {
            if (viewParent instanceof l) {
                return ((l)viewParent).onStartNestedScroll(view, view2, n2);
            }
            return false;
        }

        public void g(ViewParent viewParent, View view) {
            if (viewParent instanceof l) {
                ((l)viewParent).onStopNestedScroll(view);
            }
        }
    }

}

