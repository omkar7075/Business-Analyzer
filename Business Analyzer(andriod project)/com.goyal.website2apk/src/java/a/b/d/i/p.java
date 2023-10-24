/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.IBinder
 *  android.util.Log
 *  android.view.Display
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.view.WindowInsets
 *  android.view.WindowManager
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.ThreadLocal
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.WeakHashMap
 */
package a.b.d.i;

import a.b.d.i.n;
import a.b.d.i.o;
import a.b.d.i.t;
import a.b.d.i.x;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class p {
    static final j a;

    /*
     * Enabled aggressive block sorting
     */
    static {
        void var1_2;
        int n2 = Build.VERSION.SDK_INT;
        if (n2 >= 26) {
            i i2 = new i();
        } else if (n2 >= 24) {
            h h2 = new h();
        } else if (n2 >= 23) {
            g g2 = new g();
        } else if (n2 >= 21) {
            f f2 = new f();
        } else if (n2 >= 19) {
            e e2 = new e();
        } else if (n2 >= 18) {
            d d2 = new d();
        } else if (n2 >= 17) {
            c c2 = new c();
        } else if (n2 >= 16) {
            b b2 = new b();
        } else if (n2 >= 15) {
            a a2 = new a();
        } else {
            j j2 = new j();
        }
        a = var1_2;
    }

    public static void A(View view, int n2) {
        a.C(view, n2);
    }

    public static x B(View view, x x2) {
        return a.D(view, x2);
    }

    public static void C(View view) {
        a.E(view);
    }

    public static void D(View view, Runnable runnable) {
        a.F(view, runnable);
    }

    public static void E(View view, Runnable runnable, long l2) {
        a.G(view, runnable, l2);
    }

    public static void F(View view) {
        a.H(view);
    }

    public static void G(View view, a.b.d.i.b b2) {
        a.I(view, b2);
    }

    public static void H(View view, Drawable drawable) {
        a.J(view, drawable);
    }

    public static void I(View view, ColorStateList colorStateList) {
        a.K(view, colorStateList);
    }

    public static void J(View view, PorterDuff.Mode mode) {
        a.L(view, mode);
    }

    public static void K(ViewGroup viewGroup, boolean bl) {
        a.M(viewGroup, bl);
    }

    public static void L(View view, float f2) {
        a.N(view, f2);
    }

    @Deprecated
    public static void M(View view, boolean bl) {
        view.setFitsSystemWindows(bl);
    }

    public static void N(View view, int n2) {
        a.O(view, n2);
    }

    public static void O(View view, n n2) {
        a.P(view, n2);
    }

    public static void P(View view, int n2, int n3, int n4, int n5) {
        a.Q(view, n2, n3, n4, n5);
    }

    public static void Q(View view, int n2, int n3) {
        a.R(view, n2, n3);
    }

    public static void R(View view) {
        a.S(view);
    }

    public static t a(View view) {
        return a.a(view);
    }

    public static x b(View view, x x2) {
        return a.b(view, x2);
    }

    public static ColorStateList c(View view) {
        return a.c(view);
    }

    public static PorterDuff.Mode d(View view) {
        return a.d(view);
    }

    public static Display e(View view) {
        return a.e(view);
    }

    public static float f(View view) {
        return a.f(view);
    }

    public static boolean g(View view) {
        return a.g(view);
    }

    public static int h(View view) {
        return a.i(view);
    }

    public static int i(View view) {
        return a.j(view);
    }

    public static int j(View view) {
        return a.k(view);
    }

    public static int k(View view) {
        return a.l(view);
    }

    public static int l(View view) {
        return a.m(view);
    }

    public static int m(View view) {
        return a.n(view);
    }

    public static ViewParent n(View view) {
        return a.o(view);
    }

    public static String o(View view) {
        return a.p(view);
    }

    public static int p(View view) {
        return a.r(view);
    }

    public static float q(View view) {
        return a.s(view);
    }

    public static boolean r(View view) {
        return a.t(view);
    }

    public static boolean s(View view) {
        return a.u(view);
    }

    public static boolean t(View view) {
        return a.v(view);
    }

    public static boolean u(View view) {
        return a.w(view);
    }

    public static boolean v(View view) {
        return a.x(view);
    }

    public static boolean w(View view) {
        return a.y(view);
    }

    public static boolean x(View view) {
        return a.z(view);
    }

    public static boolean y(View view) {
        return a.A(view);
    }

    public static void z(View view, int n2) {
        a.B(view, n2);
    }

    static class a
    extends j {
        a() {
        }

        @Override
        public boolean u(View view) {
            return view.hasOnClickListeners();
        }
    }

    static class b
    extends a {
        b() {
        }

        @Override
        public void E(View view) {
            view.postInvalidateOnAnimation();
        }

        @Override
        public void F(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        @Override
        public void G(View view, Runnable runnable, long l2) {
            view.postOnAnimationDelayed(runnable, l2);
        }

        @Override
        public void H(View view) {
            view.requestFitSystemWindows();
        }

        @Override
        public void J(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        @Override
        public void O(View view, int n2) {
            if (n2 == 4) {
                n2 = 2;
            }
            view.setImportantForAccessibility(n2);
        }

        @Override
        public boolean g(View view) {
            return view.getFitsSystemWindows();
        }

        @Override
        public int i(View view) {
            return view.getImportantForAccessibility();
        }

        @Override
        public int k(View view) {
            return view.getMinimumHeight();
        }

        @Override
        public int l(View view) {
            return view.getMinimumWidth();
        }

        @Override
        public ViewParent o(View view) {
            return view.getParentForAccessibility();
        }

        @Override
        public boolean v(View view) {
            return view.hasOverlappingRendering();
        }

        @Override
        public boolean w(View view) {
            return view.hasTransientState();
        }
    }

    static class c
    extends b {
        c() {
        }

        @Override
        public boolean A(View view) {
            return view.isPaddingRelative();
        }

        @Override
        public void Q(View view, int n2, int n3, int n4, int n5) {
            view.setPaddingRelative(n2, n3, n4, n5);
        }

        @Override
        public Display e(View view) {
            return view.getDisplay();
        }

        @Override
        public int j(View view) {
            return view.getLayoutDirection();
        }

        @Override
        public int m(View view) {
            return view.getPaddingEnd();
        }

        @Override
        public int n(View view) {
            return view.getPaddingStart();
        }

        @Override
        public int r(View view) {
            return view.getWindowSystemUiVisibility();
        }
    }

    static class d
    extends c {
        d() {
        }
    }

    static class e
    extends d {
        e() {
        }

        @Override
        public void O(View view, int n2) {
            view.setImportantForAccessibility(n2);
        }

        @Override
        public boolean x(View view) {
            return view.isAttachedToWindow();
        }

        @Override
        public boolean y(View view) {
            return view.isLaidOut();
        }
    }

    static class f
    extends e {
        private static ThreadLocal<Rect> j;

        f() {
        }

        private static Rect U() {
            Rect rect;
            if (j == null) {
                j = new ThreadLocal();
            }
            if ((rect = (Rect)j.get()) == null) {
                rect = new Rect();
                j.set((Object)rect);
            }
            rect.setEmpty();
            return rect;
        }

        @Override
        public void B(View view, int n2) {
            boolean bl;
            Rect rect = f.U();
            ViewParent viewParent = view.getParent();
            if (viewParent instanceof View) {
                View view2 = (View)viewParent;
                rect.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                bl = true ^ rect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else {
                bl = false;
            }
            j.super.B(view, n2);
            if (bl && rect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View)viewParent).invalidate(rect);
            }
        }

        @Override
        public void C(View view, int n2) {
            boolean bl;
            Rect rect = f.U();
            ViewParent viewParent = view.getParent();
            if (viewParent instanceof View) {
                View view2 = (View)viewParent;
                rect.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                bl = true ^ rect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else {
                bl = false;
            }
            j.super.C(view, n2);
            if (bl && rect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View)viewParent).invalidate(rect);
            }
        }

        @Override
        public x D(View view, x x2) {
            WindowInsets windowInsets = (WindowInsets)x.i(x2);
            WindowInsets windowInsets2 = view.onApplyWindowInsets(windowInsets);
            if (windowInsets2 != windowInsets) {
                windowInsets = new WindowInsets(windowInsets2);
            }
            return x.j((Object)windowInsets);
        }

        @Override
        public void H(View view) {
            view.requestApplyInsets();
        }

        @Override
        public void K(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable drawable = view.getBackground();
                boolean bl = view.getBackgroundTintList() != null && view.getBackgroundTintMode() != null;
                if (drawable != null && bl) {
                    if (drawable.isStateful()) {
                        drawable.setState(view.getDrawableState());
                    }
                    view.setBackground(drawable);
                }
            }
        }

        @Override
        public void L(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable drawable = view.getBackground();
                boolean bl = view.getBackgroundTintList() != null && view.getBackgroundTintMode() != null;
                if (drawable != null && bl) {
                    if (drawable.isStateful()) {
                        drawable.setState(view.getDrawableState());
                    }
                    view.setBackground(drawable);
                }
            }
        }

        @Override
        public void N(View view, float f2) {
            view.setElevation(f2);
        }

        @Override
        public void P(View view, final n n2) {
            if (n2 == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(){

                public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    x x2 = x.j((Object)windowInsets);
                    return (WindowInsets)x.i(n2.a(view, x2));
                }
            });
        }

        @Override
        public void S(View view) {
            view.stopNestedScroll();
        }

        @Override
        public x b(View view, x x2) {
            WindowInsets windowInsets = (WindowInsets)x.i(x2);
            WindowInsets windowInsets2 = view.dispatchApplyWindowInsets(windowInsets);
            if (windowInsets2 != windowInsets) {
                windowInsets = new WindowInsets(windowInsets2);
            }
            return x.j((Object)windowInsets);
        }

        @Override
        public ColorStateList c(View view) {
            return view.getBackgroundTintList();
        }

        @Override
        public PorterDuff.Mode d(View view) {
            return view.getBackgroundTintMode();
        }

        @Override
        public float f(View view) {
            return view.getElevation();
        }

        @Override
        public String p(View view) {
            return view.getTransitionName();
        }

        @Override
        public float q(View view) {
            return view.getTranslationZ();
        }

        @Override
        public float s(View view) {
            return view.getZ();
        }

        @Override
        public boolean z(View view) {
            return view.isNestedScrollingEnabled();
        }

    }

    static class g
    extends f {
        g() {
        }

        @Override
        public void B(View view, int n2) {
            view.offsetLeftAndRight(n2);
        }

        @Override
        public void C(View view, int n2) {
            view.offsetTopAndBottom(n2);
        }

        @Override
        public void R(View view, int n2, int n3) {
            view.setScrollIndicators(n2, n3);
        }
    }

    static class h
    extends g {
        h() {
        }
    }

    static class i
    extends h {
        i() {
        }
    }

    static class j {
        private static Field a;
        private static boolean b;
        private static Field c;
        private static boolean d;
        private static WeakHashMap<View, String> e;
        private static Method f;
        static Field g;
        static boolean h;
        WeakHashMap<View, t> i = null;

        j() {
        }

        private static void T(View view) {
            float f2 = view.getTranslationY();
            view.setTranslationY(1.0f + f2);
            view.setTranslationY(f2);
        }

        public boolean A(View view) {
            return false;
        }

        public void B(View view, int n2) {
            view.offsetLeftAndRight(n2);
            if (view.getVisibility() == 0) {
                j.T(view);
                ViewParent viewParent = view.getParent();
                if (viewParent instanceof View) {
                    j.T((View)viewParent);
                }
            }
        }

        public void C(View view, int n2) {
            view.offsetTopAndBottom(n2);
            if (view.getVisibility() == 0) {
                j.T(view);
                ViewParent viewParent = view.getParent();
                if (viewParent instanceof View) {
                    j.T((View)viewParent);
                }
            }
        }

        public x D(View view, x x2) {
            return x2;
        }

        public void E(View view) {
            view.postInvalidate();
        }

        public void F(View view, Runnable runnable) {
            view.postDelayed(runnable, this.h());
        }

        public void G(View view, Runnable runnable, long l2) {
            view.postDelayed(runnable, l2 + this.h());
        }

        public void H(View view) {
        }

        public void I(View view, a.b.d.i.b b2) {
            View.AccessibilityDelegate accessibilityDelegate = b2 == null ? null : b2.c();
            view.setAccessibilityDelegate(accessibilityDelegate);
        }

        public void J(View view, Drawable drawable) {
            view.setBackgroundDrawable(drawable);
        }

        public void K(View view, ColorStateList colorStateList) {
            if (view instanceof o) {
                ((o)view).setSupportBackgroundTintList(colorStateList);
            }
        }

        public void L(View view, PorterDuff.Mode mode) {
            if (view instanceof o) {
                ((o)view).setSupportBackgroundTintMode(mode);
            }
        }

        public void M(ViewGroup viewGroup, boolean bl) {
            void var3_10;
            if (f == null) {
                try {
                    Class[] arrclass = new Class[]{Boolean.TYPE};
                    f = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", arrclass);
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    Log.e((String)"ViewCompat", (String)"Unable to find childrenDrawingOrderEnabled", (Throwable)noSuchMethodException);
                }
                f.setAccessible(true);
            }
            try {
                Method method = f;
                Object[] arrobject = new Object[]{bl};
                method.invoke((Object)viewGroup, arrobject);
                return;
            }
            catch (InvocationTargetException invocationTargetException) {
            }
            catch (IllegalArgumentException illegalArgumentException) {
            }
            catch (IllegalAccessException illegalAccessException) {
                // empty catch block
            }
            Log.e((String)"ViewCompat", (String)"Unable to invoke childrenDrawingOrderEnabled", (Throwable)var3_10);
        }

        public void N(View view, float f2) {
        }

        public void O(View view, int n2) {
        }

        public void P(View view, n n2) {
        }

        public void Q(View view, int n2, int n3, int n4, int n5) {
            view.setPadding(n2, n3, n4, n5);
        }

        public void R(View view, int n2, int n3) {
        }

        public void S(View view) {
            if (view instanceof a.b.d.i.i) {
                ((a.b.d.i.i)view).stopNestedScroll();
            }
        }

        public t a(View view) {
            t t2;
            if (this.i == null) {
                this.i = new WeakHashMap();
            }
            if ((t2 = (t)this.i.get((Object)view)) == null) {
                t2 = new t(view);
                this.i.put((Object)view, (Object)t2);
            }
            return t2;
        }

        public x b(View view, x x2) {
            return x2;
        }

        public ColorStateList c(View view) {
            if (view instanceof o) {
                return ((o)view).getSupportBackgroundTintList();
            }
            return null;
        }

        public PorterDuff.Mode d(View view) {
            if (view instanceof o) {
                return ((o)view).getSupportBackgroundTintMode();
            }
            return null;
        }

        public Display e(View view) {
            if (this.x(view)) {
                return ((WindowManager)view.getContext().getSystemService("window")).getDefaultDisplay();
            }
            return null;
        }

        public float f(View view) {
            return 0.0f;
        }

        public boolean g(View view) {
            return false;
        }

        long h() {
            return ValueAnimator.getFrameDelay();
        }

        public int i(View view) {
            return 0;
        }

        public int j(View view) {
            return 0;
        }

        /*
         * Exception decompiling
         */
        public int k(View var1) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl28.1 : ICONST_0 : trying to set 0 previously set to 1
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
            // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.g.p(Method.java:396)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
            // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
            // org.benf.cfr.reader.b.a(Driver.java:128)
            // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
            // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
            // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
            // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
            // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
            // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
            // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
            // java.lang.Thread.run(Thread.java:919)
            throw new IllegalStateException("Decompilation failed");
        }

        /*
         * Exception decompiling
         */
        public int l(View var1) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl28.1 : ICONST_0 : trying to set 0 previously set to 1
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
            // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.g.p(Method.java:396)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
            // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
            // org.benf.cfr.reader.b.a(Driver.java:128)
            // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
            // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
            // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
            // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
            // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
            // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
            // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
            // java.lang.Thread.run(Thread.java:919)
            throw new IllegalStateException("Decompilation failed");
        }

        public int m(View view) {
            return view.getPaddingRight();
        }

        public int n(View view) {
            return view.getPaddingLeft();
        }

        public ViewParent o(View view) {
            return view.getParent();
        }

        public String p(View view) {
            WeakHashMap<View, String> weakHashMap = e;
            if (weakHashMap == null) {
                return null;
            }
            return (String)weakHashMap.get((Object)view);
        }

        public float q(View view) {
            return 0.0f;
        }

        public int r(View view) {
            return 0;
        }

        public float s(View view) {
            return this.q(view) + this.f(view);
        }

        public boolean t(View view) {
            if (h) {
                return false;
            }
            if (g == null) {
                try {
                    Field field;
                    g = field = View.class.getDeclaredField("mAccessibilityDelegate");
                    field.setAccessible(true);
                }
                catch (Throwable throwable) {
                    h = true;
                    return false;
                }
            }
            try {
                Object object = g.get((Object)view);
                boolean bl = false;
                if (object != null) {
                    bl = true;
                }
                return bl;
            }
            catch (Throwable throwable) {
                h = true;
                return false;
            }
        }

        public boolean u(View view) {
            return false;
        }

        public boolean v(View view) {
            return true;
        }

        public boolean w(View view) {
            return false;
        }

        public boolean x(View view) {
            return view.getWindowToken() != null;
        }

        public boolean y(View view) {
            return view.getWidth() > 0 && view.getHeight() > 0;
        }

        public boolean z(View view) {
            if (view instanceof a.b.d.i.i) {
                return ((a.b.d.i.i)view).isNestedScrollingEnabled();
            }
            return false;
        }
    }

}

