/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.animation.AnimatorSet
 *  android.animation.PropertyValuesHolder
 *  android.animation.ValueAnimator
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.TypedArray
 *  android.graphics.Paint
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.LayoutInflater
 *  android.view.LayoutInflater$Factory2
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.AlphaAnimation
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 *  android.view.animation.AnimationSet
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 *  android.view.animation.ScaleAnimation
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.io.Writer
 *  java.lang.Boolean
 *  java.lang.ClassLoader
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.NoSuchFieldException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.CopyOnWriteArrayList
 */
package a.b.d.a;

import a.b.d.a.h;
import a.b.d.a.l;
import a.b.d.a.m;
import a.b.d.a.o;
import a.b.d.a.p;
import a.b.d.a.q;
import a.b.d.a.s;
import a.b.d.a.v;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class n
extends m
implements LayoutInflater.Factory2 {
    static boolean a;
    static Field b;
    static final Interpolator c;
    static final Interpolator d;
    static final Interpolator e;
    static final Interpolator f;
    boolean A;
    ArrayList<a.b.d.a.c> B;
    ArrayList<Boolean> C;
    ArrayList<a.b.d.a.h> D;
    Bundle E = null;
    SparseArray<Parcelable> F = null;
    ArrayList<k> G;
    o H;
    Runnable I = new Runnable(){

        public void run() {
            n.this.d0();
        }
    };
    ArrayList<j> g;
    boolean h;
    int i = 0;
    final ArrayList<a.b.d.a.h> j = new ArrayList();
    SparseArray<a.b.d.a.h> k;
    ArrayList<a.b.d.a.c> l;
    ArrayList<a.b.d.a.h> m;
    ArrayList<a.b.d.a.c> n;
    ArrayList<Integer> o;
    ArrayList<m.b> p;
    private final CopyOnWriteArrayList<a.b.d.h.k<m.a, Boolean>> q = new CopyOnWriteArrayList();
    int r = 0;
    l s;
    a.b.d.a.j t;
    a.b.d.a.h u;
    a.b.d.a.h v;
    boolean w;
    boolean x;
    boolean y;
    String z;

    static {
        c = new DecelerateInterpolator(2.5f);
        d = new DecelerateInterpolator(1.5f);
        e = new AccelerateInterpolator(2.5f);
        f = new AccelerateInterpolator(1.5f);
    }

    n() {
    }

    static boolean A0(Animator animator) {
        block4 : {
            block3 : {
                if (animator == null) {
                    return false;
                }
                if (!(animator instanceof ValueAnimator)) break block3;
                PropertyValuesHolder[] arrpropertyValuesHolder = ((ValueAnimator)animator).getValues();
                for (int i2 = 0; i2 < arrpropertyValuesHolder.length; ++i2) {
                    if (!"alpha".equals((Object)arrpropertyValuesHolder[i2].getPropertyName())) continue;
                    return true;
                }
                break block4;
            }
            if (!(animator instanceof AnimatorSet)) break block4;
            ArrayList arrayList = ((AnimatorSet)animator).getChildAnimations();
            for (int i3 = 0; i3 < arrayList.size(); ++i3) {
                if (!n.A0((Animator)arrayList.get(i3))) continue;
                return true;
            }
        }
        return false;
    }

    static boolean B0(g g2) {
        Animation animation = g2.a;
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (animation instanceof AnimationSet) {
            List list = ((AnimationSet)animation).getAnimations();
            for (int i2 = 0; i2 < list.size(); ++i2) {
                if (!(list.get(i2) instanceof AlphaAnimation)) continue;
                return true;
            }
            return false;
        }
        return n.A0(g2.b);
    }

    private boolean I0(String string, int n2, int n3) {
        boolean bl;
        m m2;
        this.d0();
        this.b0(true);
        a.b.d.a.h h2 = this.v;
        if (h2 != null && n2 < 0 && string == null && (m2 = h2.r0()) != null && m2.d()) {
            return true;
        }
        bl = this.J0(this.B, this.C, string, n2, n3);
        if (bl) {
            this.h = true;
            try {
                this.N0(this.B, this.C);
            }
            finally {
                this.o();
            }
        }
        this.Z();
        this.m();
        return bl;
    }

    private int K0(ArrayList<a.b.d.a.c> arrayList, ArrayList<Boolean> arrayList2, int n2, int n3, a.b.d.h.b<a.b.d.a.h> b2) {
        int n4 = n3;
        for (int i2 = n3 - 1; i2 >= n2; --i2) {
            a.b.d.a.c c2 = (a.b.d.a.c)arrayList.get(i2);
            boolean bl = (Boolean)arrayList2.get(i2);
            boolean bl2 = c2.m() && !c2.k(arrayList, i2 + 1, n3);
            if (!bl2) continue;
            if (this.G == null) {
                this.G = new ArrayList();
            }
            k k2 = new k(c2, bl);
            this.G.add((Object)k2);
            c2.o(k2);
            if (bl) {
                c2.f();
            } else {
                c2.g(false);
            }
            if (i2 != --n4) {
                arrayList.remove(i2);
                arrayList.add(n4, (Object)c2);
            }
            this.g(b2);
        }
        return n4;
    }

    private void N0(ArrayList<a.b.d.a.c> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                return;
            }
            if (arrayList2 != null && arrayList.size() == arrayList2.size()) {
                this.g0(arrayList, arrayList2);
                int n2 = arrayList.size();
                int n3 = 0;
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (((a.b.d.a.c)arrayList.get((int)i2)).u) continue;
                    if (n3 != i2) {
                        this.f0(arrayList, arrayList2, n3, i2);
                    }
                    if (((Boolean)arrayList2.get(i2)).booleanValue()) {
                        for (n3 = i2 + 1; n3 < n2 && ((Boolean)arrayList2.get(n3)).booleanValue() && !((a.b.d.a.c)arrayList.get((int)n3)).u; ++n3) {
                        }
                    }
                    this.f0(arrayList, arrayList2, i2, n3);
                    i2 = n3 - 1;
                }
                if (n3 != n2) {
                    this.f0(arrayList, arrayList2, n3, n2);
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public static int R0(int n2) {
        int n3 = 8194;
        if (n2 != 4097) {
            if (n2 != 4099) {
                if (n2 != n3) {
                    return 0;
                }
                return 4097;
            }
            n3 = 4099;
        }
        return n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void W0() {
        n n2 = this;
        synchronized (n2) {
            ArrayList<k> arrayList = this.G;
            boolean bl = arrayList != null && !arrayList.isEmpty();
            ArrayList<j> arrayList2 = this.g;
            boolean bl2 = false;
            if (arrayList2 != null) {
                int n3 = arrayList2.size();
                bl2 = false;
                if (n3 == 1) {
                    bl2 = true;
                }
            }
            if (bl || bl2) {
                this.s.k().removeCallbacks(this.I);
                this.s.k().post(this.I);
            }
            return;
        }
    }

    private void X(int n2) {
        try {
            this.h = true;
            this.D0(n2, false);
            this.d0();
            return;
        }
        finally {
            this.h = false;
        }
    }

    private static void Y0(View view, g g2) {
        if (view != null) {
            if (g2 == null) {
                return;
            }
            if (n.b1(view, g2)) {
                Animator animator = g2.b;
                if (animator != null) {
                    animator.addListener((Animator.AnimatorListener)new h(view));
                    return;
                }
                Animation.AnimationListener animationListener = n.o0(g2.a);
                view.setLayerType(2, null);
                g2.a.setAnimationListener((Animation.AnimationListener)new e(view, animationListener));
            }
        }
    }

    private void a0() {
        int n2;
        SparseArray<a.b.d.a.h> sparseArray = this.k;
        int n3 = 0;
        if (sparseArray == null) {
            n2 = 0;
            n3 = 0;
        } else {
            n2 = sparseArray.size();
        }
        while (n3 < n2) {
            a.b.d.a.h h2 = (a.b.d.a.h)this.k.valueAt(n3);
            if (h2 != null) {
                if (h2.j() != null) {
                    int n4 = h2.A();
                    View view = h2.j();
                    h2.Q0(null);
                    Animation animation = view.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        view.clearAnimation();
                    }
                    this.F0(h2, n4, 0, 0, false);
                } else if (h2.k() != null) {
                    h2.k().end();
                }
            }
            ++n3;
        }
    }

    private static void a1(o o2) {
        List<o> list;
        if (o2 == null) {
            return;
        }
        List<a.b.d.a.h> list2 = o2.b();
        if (list2 != null) {
            Iterator iterator = list2.iterator();
            while (iterator.hasNext()) {
                ((a.b.d.a.h)iterator.next()).D = true;
            }
        }
        if ((list = o2.a()) != null) {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                n.a1((o)iterator.next());
            }
        }
    }

    private void b0(boolean bl) {
        if (!this.h) {
            if (Looper.myLooper() == this.s.k().getLooper()) {
                if (!bl) {
                    this.n();
                }
                if (this.B == null) {
                    this.B = new ArrayList();
                    this.C = new ArrayList();
                }
                this.h = true;
                try {
                    this.g0(null, null);
                    return;
                }
                finally {
                    this.h = false;
                }
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    static boolean b1(View view, g g2) {
        boolean bl = false;
        if (view != null) {
            if (g2 == null) {
                return false;
            }
            int n2 = Build.VERSION.SDK_INT;
            bl = false;
            if (n2 >= 19) {
                int n3 = view.getLayerType();
                bl = false;
                if (n3 == 0) {
                    boolean bl2 = a.b.d.i.p.t(view);
                    bl = false;
                    if (bl2) {
                        boolean bl3 = n.B0(g2);
                        bl = false;
                        if (bl3) {
                            bl = true;
                        }
                    }
                }
            }
        }
        return bl;
    }

    private static void e0(ArrayList<a.b.d.a.c> arrayList, ArrayList<Boolean> arrayList2, int n2, int n3) {
        while (n2 < n3) {
            a.b.d.a.c c2 = (a.b.d.a.c)arrayList.get(n2);
            boolean bl = (Boolean)arrayList2.get(n2);
            boolean bl2 = true;
            if (bl) {
                c2.c(-1);
                if (n2 != n3 - 1) {
                    bl2 = false;
                }
                c2.g(bl2);
            } else {
                c2.c((int)bl2);
                c2.f();
            }
            ++n2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void e1(RuntimeException var1_1) {
        Log.e((String)"FragmentManager", (String)var1_1.getMessage());
        Log.e((String)"FragmentManager", (String)"Activity state:");
        var4_2 = new PrintWriter((Writer)new a.b.d.h.e("FragmentManager"));
        var5_3 = this.s;
        if (var5_3 == null) ** GOTO lbl9
        try {
            var5_3.p("  ", null, var4_2, new String[0]);
            throw var1_1;
lbl9: // 1 sources:
            this.a("  ", null, var4_2, new String[0]);
            throw var1_1;
        }
        catch (Exception var6_4) {
            Log.e((String)"FragmentManager", (String)"Failed dumping state", (Throwable)var6_4);
        }
        throw var1_1;
    }

    private void f0(ArrayList<a.b.d.a.c> arrayList, ArrayList<Boolean> arrayList2, int n2, int n3) {
        int n4;
        int n5 = n2;
        boolean bl = ((a.b.d.a.c)arrayList.get((int)n5)).u;
        ArrayList<a.b.d.a.h> arrayList3 = this.D;
        if (arrayList3 == null) {
            this.D = new ArrayList();
        } else {
            arrayList3.clear();
        }
        this.D.addAll(this.j);
        a.b.d.a.h h2 = this.r0();
        boolean bl2 = false;
        for (int i2 = n5; i2 < n3; ++i2) {
            a.b.d.a.c c2 = (a.b.d.a.c)arrayList.get(i2);
            h2 = (Boolean)arrayList2.get(i2) == false ? c2.h(this.D, h2) : c2.p(this.D, h2);
            if (!bl2 && !c2.j) {
                bl2 = false;
                continue;
            }
            bl2 = true;
        }
        this.D.clear();
        if (!bl) {
            s.D(this, arrayList, arrayList2, n2, n3, false);
        }
        n.e0(arrayList, arrayList2, n2, n3);
        if (bl) {
            a.b.d.h.b<a.b.d.a.h> b2 = new a.b.d.h.b<a.b.d.a.h>();
            this.g(b2);
            int n6 = this.K0(arrayList, arrayList2, n2, n3, b2);
            this.z0(b2);
            n4 = n6;
        } else {
            n4 = n3;
        }
        if (n4 != n5 && bl) {
            s.D(this, arrayList, arrayList2, n2, n4, true);
            this.D0(this.r, true);
        }
        while (n5 < n3) {
            int n7;
            a.b.d.a.c c3 = (a.b.d.a.c)arrayList.get(n5);
            if (((Boolean)arrayList2.get(n5)).booleanValue() && (n7 = c3.n) >= 0) {
                this.m0(n7);
                c3.n = -1;
            }
            c3.n();
            ++n5;
        }
        if (bl2) {
            this.O0();
        }
    }

    public static int f1(int n2, boolean bl) {
        if (n2 != 4097) {
            if (n2 != 4099) {
                if (n2 != 8194) {
                    return -1;
                }
                if (bl) {
                    return 3;
                }
                return 4;
            }
            if (bl) {
                return 5;
            }
            return 6;
        }
        if (bl) {
            return 1;
        }
        return 2;
    }

    private void g(a.b.d.h.b<a.b.d.a.h> b2) {
        int n2 = this.r;
        if (n2 < 1) {
            return;
        }
        int n3 = Math.min((int)n2, (int)4);
        int n4 = this.j.size();
        for (int i2 = 0; i2 < n4; ++i2) {
            a.b.d.a.h h2 = (a.b.d.a.h)this.j.get(i2);
            if (h2.c >= n3) continue;
            this.F0(h2, n3, h2.s(), h2.t(), false);
            if (h2.I == null || h2.A || !h2.Q) continue;
            b2.add(h2);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void g0(ArrayList<a.b.d.a.c> var1_1, ArrayList<Boolean> var2_2) {
        var3_3 = this.G;
        var4_4 = var3_3 == null ? 0 : var3_3.size();
        block0 : for (var5_5 = 0; var5_5 < var4_4; ++var5_5) {
            var6_6 = (k)this.G.get(var5_5);
            if (var1_1 != null && !k.c(var6_6) && (var9_8 = var1_1.indexOf((Object)k.d(var6_6))) != -1 && ((Boolean)var2_2.get(var9_8)).booleanValue()) {
                do {
                    var6_6.e();
                    continue block0;
                    break;
                } while (true);
            }
            if (!var6_6.g() && (var1_1 == null || !k.d(var6_6).k(var1_1, 0, var1_1.size()))) continue;
            this.G.remove(var5_5);
            --var5_5;
            --var4_4;
            if (var1_1 != null && !k.c(var6_6) && (var8_7 = var1_1.indexOf((Object)k.d(var6_6))) != -1 && ((Boolean)var2_2.get(var8_7)).booleanValue()) ** continue;
            var6_6.f();
        }
    }

    private void j(final a.b.d.a.h h2, g g2, int n2) {
        final View view = h2.I;
        h2.Y0(n2);
        Animation animation = g2.a;
        if (animation != null) {
            h2.Q0(h2.I);
            animation.setAnimationListener((Animation.AnimationListener)new f(n.o0(animation)){

                @Override
                public void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    if (h2.j() != null) {
                        h2.Q0(null);
                        n n2 = n.this;
                        a.b.d.a.h h22 = h2;
                        n2.F0(h22, h22.A(), 0, 0, false);
                    }
                }
            });
            n.Y0(view, g2);
            h2.I.startAnimation(animation);
            return;
        }
        Animator animator = g2.b;
        h2.R0(animator);
        final ViewGroup viewGroup = h2.H;
        if (viewGroup != null) {
            viewGroup.startViewTransition(view);
        }
        animator.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(){

            public void onAnimationEnd(Animator animator) {
                ViewGroup viewGroup2 = viewGroup;
                if (viewGroup2 != null) {
                    viewGroup2.endViewTransition(view);
                }
                if (h2.k() != null) {
                    h2.R0(null);
                    n n2 = n.this;
                    a.b.d.a.h h22 = h2;
                    n2.F0(h22, h22.A(), 0, 0, false);
                }
            }
        });
        animator.setTarget((Object)h2.I);
        n.Y0(h2.I, g2);
        animator.start();
    }

    private a.b.d.a.h k0(a.b.d.a.h h2) {
        ViewGroup viewGroup = h2.H;
        View view = h2.I;
        if (viewGroup != null) {
            if (view == null) {
                return null;
            }
            for (int i2 = -1 + this.j.indexOf((Object)h2); i2 >= 0; --i2) {
                a.b.d.a.h h3 = (a.b.d.a.h)this.j.get(i2);
                if (h3.H != viewGroup || h3.I == null) continue;
                return h3;
            }
        }
        return null;
    }

    private void l0() {
        if (this.G != null) {
            while (!this.G.isEmpty()) {
                ((k)this.G.remove(0)).f();
            }
        }
    }

    private void m() {
        SparseArray<a.b.d.a.h> sparseArray = this.k;
        if (sparseArray != null) {
            for (int i2 = -1 + sparseArray.size(); i2 >= 0; --i2) {
                if (this.k.valueAt(i2) != null) continue;
                SparseArray<a.b.d.a.h> sparseArray2 = this.k;
                sparseArray2.delete(sparseArray2.keyAt(i2));
            }
        }
    }

    private void n() {
        if (!this.x) {
            if (this.z == null) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can not perform this action inside of ");
            stringBuilder.append(this.z);
            throw new IllegalStateException(stringBuilder.toString());
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean n0(ArrayList<a.b.d.a.c> arrayList, ArrayList<Boolean> arrayList2) {
        n n2 = this;
        synchronized (n2) {
            boolean bl;
            int n3;
            ArrayList<j> arrayList3 = this.g;
            if (arrayList3 == null) return false;
            if (arrayList3.size() != 0) {
                n3 = this.g.size();
                bl = false;
            } else {
                return false;
            }
            for (int i2 = 0; i2 < n3; bl |= ((j)this.g.get((int)i2)).a(arrayList, arrayList2), ++i2) {
            }
            this.g.clear();
            this.s.k().removeCallbacks(this.I);
            return bl;
        }
    }

    private void o() {
        this.h = false;
        this.C.clear();
        this.B.clear();
    }

    private static Animation.AnimationListener o0(Animation animation) {
        String string;
        void var1_5;
        try {
            if (b == null) {
                Field field;
                b = field = Animation.class.getDeclaredField("mListener");
                field.setAccessible(true);
            }
            Animation.AnimationListener animationListener = (Animation.AnimationListener)b.get((Object)animation);
            return animationListener;
        }
        catch (IllegalAccessException illegalAccessException) {
            string = "Cannot access Animation's mListener field";
        }
        catch (NoSuchFieldException noSuchFieldException) {
            string = "No field with the name mListener is found in Animation class";
        }
        Log.e((String)"FragmentManager", (String)string, (Throwable)var1_5);
        return null;
    }

    private void p(a.b.d.a.c c2, boolean bl, boolean bl2, boolean bl3) {
        SparseArray<a.b.d.a.h> sparseArray;
        if (bl) {
            c2.g(bl3);
        } else {
            c2.f();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add((Object)c2);
        arrayList2.add((Object)bl);
        if (bl2) {
            s.D(this, (ArrayList<a.b.d.a.c>)arrayList, (ArrayList<Boolean>)arrayList2, 0, 1, true);
        }
        if (bl3) {
            this.D0(this.r, true);
        }
        if ((sparseArray = this.k) != null) {
            int n2 = sparseArray.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                a.b.d.a.h h2 = (a.b.d.a.h)this.k.valueAt(i2);
                if (h2 == null || h2.I == null || !h2.Q || !c2.j(h2.y)) continue;
                float f2 = h2.S;
                if (f2 > 0.0f) {
                    h2.I.setAlpha(f2);
                }
                if (bl3) {
                    h2.S = 0.0f;
                    continue;
                }
                h2.S = -1.0f;
                h2.Q = false;
            }
        }
    }

    static g w0(Context context, float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(d);
        alphaAnimation.setDuration(220L);
        return new g((Animation)alphaAnimation);
    }

    static g y0(Context context, float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(c);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation((Animation)scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(d);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation((Animation)alphaAnimation);
        return new g((Animation)animationSet);
    }

    private void z0(a.b.d.h.b<a.b.d.a.h> b2) {
        int n2 = b2.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            a.b.d.a.h h2 = b2.i(i2);
            if (h2.l) continue;
            View view = h2.B();
            h2.S = view.getAlpha();
            view.setAlpha(0.0f);
        }
    }

    public void A(boolean bl) {
        for (int i2 = -1 + this.j.size(); i2 >= 0; --i2) {
            a.b.d.a.h h2 = (a.b.d.a.h)this.j.get(i2);
            if (h2 == null) continue;
            h2.D0(bl);
        }
    }

    void B(a.b.d.a.h h2, Bundle bundle, boolean bl) {
        m m2;
        a.b.d.a.h h3 = this.u;
        if (h3 != null && (m2 = h3.q()) instanceof n) {
            ((n)m2).B(h2, bundle, true);
        }
        for (a.b.d.h.k k2 : this.q) {
            if (bl && !((Boolean)k2.b).booleanValue()) continue;
            ((m.a)k2.a).a(this, h2, bundle);
        }
    }

    void C(a.b.d.a.h h2, Context context, boolean bl) {
        m m2;
        a.b.d.a.h h3 = this.u;
        if (h3 != null && (m2 = h3.q()) instanceof n) {
            ((n)m2).C(h2, context, true);
        }
        for (a.b.d.h.k k2 : this.q) {
            if (bl && !((Boolean)k2.b).booleanValue()) continue;
            ((m.a)k2.a).b(this, h2, context);
        }
    }

    void C0(a.b.d.a.h h2) {
        if (h2 == null) {
            return;
        }
        int n2 = this.r;
        if (h2.m) {
            n2 = h2.G() ? Math.min((int)n2, (int)1) : Math.min((int)n2, (int)0);
        }
        this.F0(h2, n2, h2.t(), h2.u(), false);
        if (h2.I != null) {
            a.b.d.a.h h3 = this.k0(h2);
            if (h3 != null) {
                View view = h3.I;
                ViewGroup viewGroup = h2.H;
                int n3 = viewGroup.indexOfChild(view);
                int n4 = viewGroup.indexOfChild(h2.I);
                if (n4 < n3) {
                    viewGroup.removeViewAt(n4);
                    viewGroup.addView(h2.I, n3);
                }
            }
            if (h2.Q && h2.H != null) {
                float f2 = h2.S;
                if (f2 > 0.0f) {
                    h2.I.setAlpha(f2);
                }
                h2.S = 0.0f;
                h2.Q = false;
                g g2 = this.u0(h2, h2.t(), true, h2.u());
                if (g2 != null) {
                    n.Y0(h2.I, g2);
                    Animation animation = g2.a;
                    if (animation != null) {
                        h2.I.startAnimation(animation);
                    } else {
                        g2.b.setTarget((Object)h2.I);
                        g2.b.start();
                    }
                }
            }
        }
        if (h2.R) {
            this.q(h2);
        }
    }

    void D(a.b.d.a.h h2, Bundle bundle, boolean bl) {
        m m2;
        a.b.d.a.h h3 = this.u;
        if (h3 != null && (m2 = h3.q()) instanceof n) {
            ((n)m2).D(h2, bundle, true);
        }
        for (a.b.d.h.k k2 : this.q) {
            if (bl && !((Boolean)k2.b).booleanValue()) continue;
            ((m.a)k2.a).c(this, h2, bundle);
        }
    }

    void D0(int n2, boolean bl) {
        if (this.s == null && n2 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (!bl && n2 == this.r) {
            return;
        }
        this.r = n2;
        if (this.k != null) {
            l l2;
            int n3 = this.j.size();
            boolean bl2 = false;
            for (int i2 = 0; i2 < n3; ++i2) {
                a.b.d.a.h h2 = (a.b.d.a.h)this.j.get(i2);
                this.C0(h2);
                v v2 = h2.M;
                if (v2 == null) continue;
                bl2 |= v2.i();
            }
            int n4 = this.k.size();
            for (int i3 = 0; i3 < n4; ++i3) {
                a.b.d.a.h h3 = (a.b.d.a.h)this.k.valueAt(i3);
                if (h3 == null || !h3.m && !h3.B || h3.Q) continue;
                this.C0(h3);
                v v3 = h3.M;
                if (v3 == null) continue;
                bl2 |= v3.i();
            }
            if (!bl2) {
                this.d1();
            }
            if (this.w && (l2 = this.s) != null && this.r == 5) {
                l2.u();
                this.w = false;
            }
        }
    }

    void E(a.b.d.a.h h2, boolean bl) {
        m m2;
        a.b.d.a.h h3 = this.u;
        if (h3 != null && (m2 = h3.q()) instanceof n) {
            ((n)m2).E(h2, true);
        }
        for (a.b.d.h.k k2 : this.q) {
            if (bl && !((Boolean)k2.b).booleanValue()) continue;
            ((m.a)k2.a).d(this, h2);
        }
    }

    void E0(a.b.d.a.h h2) {
        this.F0(h2, this.r, 0, 0, false);
    }

    void F(a.b.d.a.h h2, boolean bl) {
        m m2;
        a.b.d.a.h h3 = this.u;
        if (h3 != null && (m2 = h3.q()) instanceof n) {
            ((n)m2).F(h2, true);
        }
        for (a.b.d.h.k k2 : this.q) {
            if (bl && !((Boolean)k2.b).booleanValue()) continue;
            ((m.a)k2.a).e(this, h2);
        }
    }

    /*
     * Exception decompiling
     */
    void F0(a.b.d.a.h var1, int var2, int var3, int var4, boolean var5) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl443 : NEW : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
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

    void G(a.b.d.a.h h2, boolean bl) {
        m m2;
        a.b.d.a.h h3 = this.u;
        if (h3 != null && (m2 = h3.q()) instanceof n) {
            ((n)m2).G(h2, true);
        }
        for (a.b.d.h.k k2 : this.q) {
            if (bl && !((Boolean)k2.b).booleanValue()) continue;
            ((m.a)k2.a).f(this, h2);
        }
    }

    public void G0() {
        this.H = null;
        this.x = false;
        int n2 = this.j.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            a.b.d.a.h h2 = (a.b.d.a.h)this.j.get(i2);
            if (h2 == null) continue;
            h2.K();
        }
    }

    void H(a.b.d.a.h h2, Context context, boolean bl) {
        m m2;
        a.b.d.a.h h3 = this.u;
        if (h3 != null && (m2 = h3.q()) instanceof n) {
            ((n)m2).H(h2, context, true);
        }
        for (a.b.d.h.k k2 : this.q) {
            if (bl && !((Boolean)k2.b).booleanValue()) continue;
            ((m.a)k2.a).g(this, h2, context);
        }
    }

    public void H0(a.b.d.a.h h2) {
        if (h2.K) {
            if (this.h) {
                this.A = true;
                return;
            }
            h2.K = false;
            this.F0(h2, this.r, 0, 0, false);
        }
    }

    void I(a.b.d.a.h h2, Bundle bundle, boolean bl) {
        m m2;
        a.b.d.a.h h3 = this.u;
        if (h3 != null && (m2 = h3.q()) instanceof n) {
            ((n)m2).I(h2, bundle, true);
        }
        for (a.b.d.h.k k2 : this.q) {
            if (bl && !((Boolean)k2.b).booleanValue()) continue;
            ((m.a)k2.a).h(this, h2, bundle);
        }
    }

    void J(a.b.d.a.h h2, boolean bl) {
        m m2;
        a.b.d.a.h h3 = this.u;
        if (h3 != null && (m2 = h3.q()) instanceof n) {
            ((n)m2).J(h2, true);
        }
        for (a.b.d.h.k k2 : this.q) {
            if (bl && !((Boolean)k2.b).booleanValue()) continue;
            ((m.a)k2.a).i(this, h2);
        }
    }

    boolean J0(ArrayList<a.b.d.a.c> arrayList, ArrayList<Boolean> arrayList2, String string, int n2, int n3) {
        int n4;
        ArrayList<a.b.d.a.c> arrayList3 = this.l;
        if (arrayList3 == null) {
            return false;
        }
        if (string == null && n2 < 0 && (n3 & 1) == 0) {
            int n5 = arrayList3.size() - 1;
            if (n5 < 0) {
                return false;
            }
            arrayList.add(this.l.remove(n5));
            arrayList2.add((Object)Boolean.TRUE);
            return true;
        }
        if (string == null && n2 < 0) {
            n4 = -1;
        } else {
            int n6;
            for (n6 = arrayList3.size() - 1; n6 >= 0; --n6) {
                a.b.d.a.c c2 = (a.b.d.a.c)this.l.get(n6);
                if (string != null && string.equals((Object)c2.i()) || n2 >= 0 && n2 == c2.n) break;
            }
            if (n6 < 0) {
                return false;
            }
            if ((n3 & 1) != 0) {
                while (--n6 >= 0) {
                    a.b.d.a.c c3 = (a.b.d.a.c)this.l.get(n6);
                    if (string != null && string.equals((Object)c3.i()) || n2 >= 0 && n2 == c3.n) continue;
                }
            }
            n4 = n6;
        }
        if (n4 == this.l.size() - 1) {
            return false;
        }
        for (int i2 = this.l.size() - 1; i2 > n4; --i2) {
            arrayList.add(this.l.remove(i2));
            arrayList2.add((Object)Boolean.TRUE);
        }
        return true;
    }

    void K(a.b.d.a.h h2, Bundle bundle, boolean bl) {
        m m2;
        a.b.d.a.h h3 = this.u;
        if (h3 != null && (m2 = h3.q()) instanceof n) {
            ((n)m2).K(h2, bundle, true);
        }
        for (a.b.d.h.k k2 : this.q) {
            if (bl && !((Boolean)k2.b).booleanValue()) continue;
            ((m.a)k2.a).j(this, h2, bundle);
        }
    }

    void L(a.b.d.a.h h2, boolean bl) {
        m m2;
        a.b.d.a.h h3 = this.u;
        if (h3 != null && (m2 = h3.q()) instanceof n) {
            ((n)m2).L(h2, true);
        }
        for (a.b.d.h.k k2 : this.q) {
            if (bl && !((Boolean)k2.b).booleanValue()) continue;
            ((m.a)k2.a).k(this, h2);
        }
    }

    public void L0(Bundle bundle, String string, a.b.d.a.h h2) {
        if (h2.f < 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append((Object)h2);
            stringBuilder.append(" is not currently in the FragmentManager");
            this.e1((RuntimeException)new IllegalStateException(stringBuilder.toString()));
        }
        bundle.putInt(string, h2.f);
    }

    void M(a.b.d.a.h h2, boolean bl) {
        m m2;
        a.b.d.a.h h3 = this.u;
        if (h3 != null && (m2 = h3.q()) instanceof n) {
            ((n)m2).M(h2, true);
        }
        for (a.b.d.h.k k2 : this.q) {
            if (bl && !((Boolean)k2.b).booleanValue()) continue;
            ((m.a)k2.a).l(this, h2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void M0(a.b.d.a.h h2) {
        ArrayList<a.b.d.a.h> arrayList;
        if (a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("remove: ");
            stringBuilder.append((Object)h2);
            stringBuilder.append(" nesting=");
            stringBuilder.append(h2.r);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        boolean bl = true ^ h2.G();
        if (h2.B) {
            if (!bl) return;
        }
        ArrayList<a.b.d.a.h> arrayList2 = arrayList = this.j;
        // MONITORENTER : arrayList2
        this.j.remove((Object)h2);
        // MONITOREXIT : arrayList2
        if (h2.E && h2.F) {
            this.w = true;
        }
        h2.l = false;
        h2.m = true;
    }

    void N(a.b.d.a.h h2, View view, Bundle bundle, boolean bl) {
        m m2;
        a.b.d.a.h h3 = this.u;
        if (h3 != null && (m2 = h3.q()) instanceof n) {
            ((n)m2).N(h2, view, bundle, true);
        }
        for (a.b.d.h.k k2 : this.q) {
            if (bl && !((Boolean)k2.b).booleanValue()) continue;
            ((m.a)k2.a).m(this, h2, view, bundle);
        }
    }

    void O(a.b.d.a.h h2, boolean bl) {
        m m2;
        a.b.d.a.h h3 = this.u;
        if (h3 != null && (m2 = h3.q()) instanceof n) {
            ((n)m2).O(h2, true);
        }
        for (a.b.d.h.k k2 : this.q) {
            if (bl && !((Boolean)k2.b).booleanValue()) continue;
            ((m.a)k2.a).n(this, h2);
        }
    }

    void O0() {
        if (this.p != null) {
            for (int i2 = 0; i2 < this.p.size(); ++i2) {
                ((m.b)this.p.get(i2)).a();
            }
        }
    }

    public boolean P(MenuItem menuItem) {
        for (int i2 = 0; i2 < this.j.size(); ++i2) {
            a.b.d.a.h h2 = (a.b.d.a.h)this.j.get(i2);
            if (h2 == null || !h2.E0(menuItem)) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void P0(Parcelable parcelable, o o2) {
        int n2;
        List<o> list;
        q[] arrq;
        if (parcelable == null) {
            return;
        }
        p p2 = (p)parcelable;
        if (p2.a == null) {
            return;
        }
        if (o2 == null) {
            list = null;
        } else {
            List<a.b.d.a.h> list2 = o2.b();
            list = o2.a();
            int n3 = list2 != null ? list2.size() : 0;
            for (int i2 = 0; i2 < n3; ++i2) {
                int n4;
                q[] arrq2;
                a.b.d.a.h h2 = (a.b.d.a.h)list2.get(i2);
                if (a) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("restoreAllState: re-attaching retained ");
                    stringBuilder.append((Object)h2);
                    Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                }
                for (n4 = 0; n4 < (arrq2 = p2.a).length && arrq2[n4].b != h2.f; ++n4) {
                }
                if (n4 == arrq2.length) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Could not find active fragment with index ");
                    stringBuilder.append(h2.f);
                    this.e1((RuntimeException)new IllegalStateException(stringBuilder.toString()));
                }
                q q2 = p2.a[n4];
                q2.l = h2;
                h2.e = null;
                h2.r = 0;
                h2.o = false;
                h2.l = false;
                h2.i = null;
                Bundle bundle = q2.k;
                if (bundle == null) continue;
                bundle.setClassLoader(this.s.i().getClassLoader());
                h2.e = q2.k.getSparseParcelableArray("android:view_state");
                h2.d = q2.k;
            }
        }
        this.k = new SparseArray(p2.a.length);
        for (int i3 = 0; i3 < (arrq = p2.a).length; ++i3) {
            q q3 = arrq[i3];
            if (q3 == null) continue;
            o o3 = list != null && i3 < list.size() ? (o)list.get(i3) : null;
            a.b.d.a.h h3 = q3.a(this.s, this.t, this.u, o3);
            if (a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("restoreAllState: active #");
                stringBuilder.append(i3);
                stringBuilder.append(": ");
                stringBuilder.append((Object)h3);
                Log.v((String)"FragmentManager", (String)stringBuilder.toString());
            }
            this.k.put(h3.f, (Object)h3);
            q3.l = null;
        }
        if (o2 != null) {
            List<a.b.d.a.h> list3 = o2.b();
            int n5 = list3 != null ? list3.size() : 0;
            for (int i4 = 0; i4 < n5; ++i4) {
                a.b.d.a.h h4;
                a.b.d.a.h h5 = (a.b.d.a.h)list3.get(i4);
                int n6 = h5.j;
                if (n6 < 0) continue;
                h5.i = h4 = (a.b.d.a.h)this.k.get(n6);
                if (h4 != null) continue;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Re-attaching retained fragment ");
                stringBuilder.append((Object)h5);
                stringBuilder.append(" target no longer exists: ");
                stringBuilder.append(h5.j);
                Log.w((String)"FragmentManager", (String)stringBuilder.toString());
            }
        }
        this.j.clear();
        if (p2.b != null) {
            int[] arrn;
            for (int i5 = 0; i5 < (arrn = p2.b).length; ++i5) {
                ArrayList<a.b.d.a.h> arrayList;
                a.b.d.a.h h6 = (a.b.d.a.h)this.k.get(arrn[i5]);
                if (h6 == null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("No instantiated fragment for index #");
                    stringBuilder.append(p2.b[i5]);
                    this.e1((RuntimeException)new IllegalStateException(stringBuilder.toString()));
                }
                h6.l = true;
                if (a) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("restoreAllState: added #");
                    stringBuilder.append(i5);
                    stringBuilder.append(": ");
                    stringBuilder.append((Object)h6);
                    Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                }
                if (this.j.contains((Object)h6)) {
                    throw new IllegalStateException("Already added!");
                }
                ArrayList<a.b.d.a.h> arrayList2 = arrayList = this.j;
                synchronized (arrayList2) {
                    this.j.add((Object)h6);
                    continue;
                }
            }
        }
        if (p2.c != null) {
            a.b.d.a.d[] arrd;
            this.l = new ArrayList(p2.c.length);
            for (int i6 = 0; i6 < (arrd = p2.c).length; ++i6) {
                a.b.d.a.c c2 = arrd[i6].a(this);
                if (a) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("restoreAllState: back stack #");
                    stringBuilder.append(i6);
                    stringBuilder.append(" (index ");
                    stringBuilder.append(c2.n);
                    stringBuilder.append("): ");
                    stringBuilder.append((Object)c2);
                    Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                    PrintWriter printWriter = new PrintWriter((Writer)new a.b.d.h.e("FragmentManager"));
                    c2.e("  ", printWriter, false);
                    printWriter.close();
                }
                this.l.add((Object)c2);
                int n7 = c2.n;
                if (n7 < 0) continue;
                this.X0(n7, c2);
            }
        } else {
            this.l = null;
        }
        if ((n2 = p2.d) >= 0) {
            this.v = (a.b.d.a.h)this.k.get(n2);
        }
        this.i = p2.e;
    }

    public void Q(Menu menu) {
        for (int i2 = 0; i2 < this.j.size(); ++i2) {
            a.b.d.a.h h2 = (a.b.d.a.h)this.j.get(i2);
            if (h2 == null) continue;
            h2.F0(menu);
        }
    }

    o Q0() {
        n.a1(this.H);
        return this.H;
    }

    public void R() {
        this.X(4);
    }

    public void S(boolean bl) {
        for (int i2 = -1 + this.j.size(); i2 >= 0; --i2) {
            a.b.d.a.h h2 = (a.b.d.a.h)this.j.get(i2);
            if (h2 == null) continue;
            h2.H0(bl);
        }
    }

    Parcelable S0() {
        this.l0();
        this.a0();
        this.d0();
        this.x = true;
        this.H = null;
        SparseArray<a.b.d.a.h> sparseArray = this.k;
        if (sparseArray != null) {
            int[] arrn;
            if (sparseArray.size() <= 0) {
                return null;
            }
            int n2 = this.k.size();
            q[] arrq = new q[n2];
            int n3 = 0;
            boolean bl = false;
            for (int i2 = 0; i2 < n2; ++i2) {
                q q2;
                a.b.d.a.h h2 = (a.b.d.a.h)this.k.valueAt(i2);
                if (h2 == null) continue;
                if (h2.f < 0) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Failure saving state: active ");
                    stringBuilder.append((Object)h2);
                    stringBuilder.append(" has cleared index: ");
                    stringBuilder.append(h2.f);
                    this.e1((RuntimeException)new IllegalStateException(stringBuilder.toString()));
                }
                arrq[i2] = q2 = new q(h2);
                if (h2.c > 0 && q2.k == null) {
                    q2.k = this.T0(h2);
                    a.b.d.a.h h3 = h2.i;
                    if (h3 != null) {
                        if (h3.f < 0) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Failure saving state: ");
                            stringBuilder.append((Object)h2);
                            stringBuilder.append(" has target not in fragment manager: ");
                            stringBuilder.append((Object)h2.i);
                            this.e1((RuntimeException)new IllegalStateException(stringBuilder.toString()));
                        }
                        if (q2.k == null) {
                            q2.k = new Bundle();
                        }
                        this.L0(q2.k, "android:target_state", h2.i);
                        int n4 = h2.k;
                        if (n4 != 0) {
                            q2.k.putInt("android:target_req_state", n4);
                        }
                    }
                } else {
                    q2.k = h2.d;
                }
                if (a) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Saved state of ");
                    stringBuilder.append((Object)h2);
                    stringBuilder.append(": ");
                    stringBuilder.append((Object)q2.k);
                    Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                }
                bl = true;
            }
            if (!bl) {
                if (a) {
                    Log.v((String)"FragmentManager", (String)"saveAllState: no fragments!");
                }
                return null;
            }
            int n5 = this.j.size();
            if (n5 > 0) {
                arrn = new int[n5];
                for (int i3 = 0; i3 < n5; ++i3) {
                    arrn[i3] = ((a.b.d.a.h)this.j.get((int)i3)).f;
                    if (arrn[i3] < 0) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Failure saving state: active ");
                        stringBuilder.append(this.j.get(i3));
                        stringBuilder.append(" has cleared index: ");
                        stringBuilder.append(arrn[i3]);
                        this.e1((RuntimeException)new IllegalStateException(stringBuilder.toString()));
                    }
                    if (!a) continue;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("saveAllState: adding fragment #");
                    stringBuilder.append(i3);
                    stringBuilder.append(": ");
                    stringBuilder.append(this.j.get(i3));
                    Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                }
            } else {
                arrn = null;
            }
            ArrayList<a.b.d.a.c> arrayList = this.l;
            a.b.d.a.d[] arrd = null;
            if (arrayList != null) {
                int n6 = arrayList.size();
                arrd = null;
                if (n6 > 0) {
                    arrd = new a.b.d.a.d[n6];
                    while (n3 < n6) {
                        arrd[n3] = new a.b.d.a.d((a.b.d.a.c)this.l.get(n3));
                        if (a) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("saveAllState: adding back stack #");
                            stringBuilder.append(n3);
                            stringBuilder.append(": ");
                            stringBuilder.append(this.l.get(n3));
                            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                        }
                        ++n3;
                    }
                }
            }
            p p2 = new p();
            p2.a = arrq;
            p2.b = arrn;
            p2.c = arrd;
            a.b.d.a.h h4 = this.v;
            if (h4 != null) {
                p2.d = h4.f;
            }
            p2.e = this.i;
            this.V0();
            return p2;
        }
        return null;
    }

    public boolean T(Menu menu) {
        boolean bl = false;
        for (int i2 = 0; i2 < this.j.size(); ++i2) {
            a.b.d.a.h h2 = (a.b.d.a.h)this.j.get(i2);
            if (h2 == null || !h2.I0(menu)) continue;
            bl = true;
        }
        return bl;
    }

    Bundle T0(a.b.d.a.h h2) {
        if (this.E == null) {
            this.E = new Bundle();
        }
        h2.L0(this.E);
        this.K(h2, this.E, false);
        boolean bl = this.E.isEmpty();
        Bundle bundle = null;
        if (!bl) {
            Bundle bundle2 = this.E;
            this.E = null;
            bundle = bundle2;
        }
        if (h2.I != null) {
            this.U0(h2);
        }
        if (h2.e != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", h2.e);
        }
        if (!h2.L) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", h2.L);
        }
        return bundle;
    }

    public void U() {
        this.X(2);
    }

    void U0(a.b.d.a.h h2) {
        if (h2.J == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = this.F;
        if (sparseArray == null) {
            this.F = new SparseArray();
        } else {
            sparseArray.clear();
        }
        h2.J.saveHierarchyState(this.F);
        if (this.F.size() > 0) {
            h2.e = this.F;
            this.F = null;
        }
    }

    public void V() {
        this.x = false;
        this.X(5);
    }

    void V0() {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (this.k != null) {
            arrayList2 = null;
            arrayList = null;
            for (int i2 = 0; i2 < this.k.size(); ++i2) {
                n n2;
                o o2;
                a.b.d.a.h h2 = (a.b.d.a.h)this.k.valueAt(i2);
                if (h2 == null) continue;
                if (h2.C) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add((Object)h2);
                    a.b.d.a.h h3 = h2.i;
                    int n3 = h3 != null ? h3.f : -1;
                    h2.j = n3;
                    if (a) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("retainNonConfig: keeping retained ");
                        stringBuilder.append((Object)h2);
                        Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                    }
                }
                if ((n2 = h2.u) != null) {
                    n2.V0();
                    o2 = h2.u.H;
                } else {
                    o2 = h2.v;
                }
                if (arrayList == null && o2 != null) {
                    arrayList = new ArrayList(this.k.size());
                    for (int i3 = 0; i3 < i2; ++i3) {
                        arrayList.add(null);
                    }
                }
                if (arrayList == null) continue;
                arrayList.add((Object)o2);
            }
        } else {
            arrayList2 = null;
            arrayList = null;
        }
        if (arrayList2 == null && arrayList == null) {
            this.H = null;
            return;
        }
        this.H = new o((List<a.b.d.a.h>)arrayList2, (List<o>)arrayList);
    }

    public void W() {
        this.x = false;
        this.X(4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void X0(int n2, a.b.d.a.c c2) {
        n n3 = this;
        synchronized (n3) {
            int n4;
            if (this.n == null) {
                this.n = new ArrayList();
            }
            if (n2 < (n4 = this.n.size())) {
                if (a) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Setting back stack index ");
                    stringBuilder.append(n2);
                    stringBuilder.append(" to ");
                    stringBuilder.append((Object)c2);
                    Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                }
                this.n.set(n2, (Object)c2);
            } else {
                while (n4 < n2) {
                    this.n.add(null);
                    if (this.o == null) {
                        this.o = new ArrayList();
                    }
                    if (a) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Adding available back stack index ");
                        stringBuilder.append(n4);
                        Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                    }
                    this.o.add((Object)n4);
                    ++n4;
                }
                if (a) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Adding back stack index ");
                    stringBuilder.append(n2);
                    stringBuilder.append(" with ");
                    stringBuilder.append((Object)c2);
                    Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                }
                this.n.add((Object)c2);
            }
            return;
        }
    }

    public void Y() {
        this.x = true;
        this.X(3);
    }

    void Z() {
        if (this.A) {
            boolean bl = false;
            for (int i2 = 0; i2 < this.k.size(); ++i2) {
                v v2;
                a.b.d.a.h h2 = (a.b.d.a.h)this.k.valueAt(i2);
                if (h2 == null || (v2 = h2.M) == null) continue;
                bl |= v2.i();
            }
            if (!bl) {
                this.A = false;
                this.d1();
            }
        }
    }

    public void Z0(a.b.d.a.h h2) {
        if (h2 != null && (this.k.get(h2.f) != h2 || h2.t != null && h2.q() != this)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append((Object)h2);
            stringBuilder.append(" is not an active fragment of FragmentManager ");
            stringBuilder.append((Object)this);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.v = h2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public void a(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
        ArrayList<Integer> arrayList3;
        int n4;
        int n3;
        ArrayList<a.b.d.a.h> arrayList2;
        int n6;
        ArrayList<a.b.d.a.c> arrayList;
        int n2;
        int n7;
        int n5;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("    ");
        String string2 = stringBuilder.toString();
        SparseArray<a.b.d.a.h> sparseArray = this.k;
        int n8 = 0;
        if (sparseArray != null && (n7 = sparseArray.size()) > 0) {
            printWriter.print(string);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString((int)System.identityHashCode((Object)this)));
            printWriter.println(":");
            for (int i2 = 0; i2 < n7; ++i2) {
                a.b.d.a.h h2 = (a.b.d.a.h)this.k.valueAt(i2);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println((Object)h2);
                if (h2 == null) continue;
                h2.d(string2, fileDescriptor, printWriter, arrstring);
            }
        }
        if ((n6 = this.j.size()) > 0) {
            printWriter.print(string);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < n6; ++i3) {
                a.b.d.a.h h3 = (a.b.d.a.h)this.j.get(i3);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(h3.toString());
            }
        }
        if ((arrayList2 = this.m) != null && (n3 = arrayList2.size()) > 0) {
            printWriter.print(string);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < n3; ++i4) {
                a.b.d.a.h h4 = (a.b.d.a.h)this.m.get(i4);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(h4.toString());
            }
        }
        if ((arrayList = this.l) != null && (n5 = arrayList.size()) > 0) {
            printWriter.print(string);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < n5; ++i5) {
                a.b.d.a.c c2 = (a.b.d.a.c)this.l.get(i5);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(c2.toString());
                c2.d(string2, fileDescriptor, printWriter, arrstring);
            }
        }
        n n9 = this;
        // MONITORENTER : n9
        ArrayList<a.b.d.a.c> arrayList4 = this.n;
        if (arrayList4 != null && (n2 = arrayList4.size()) > 0) {
            printWriter.print(string);
            printWriter.println("Back Stack Indices:");
            for (int i6 = 0; i6 < n2; ++i6) {
                a.b.d.a.c c3 = (a.b.d.a.c)this.n.get(i6);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println((Object)c3);
            }
        }
        if ((arrayList3 = this.o) != null && arrayList3.size() > 0) {
            printWriter.print(string);
            printWriter.print("mAvailBackStackIndices: ");
            printWriter.println(Arrays.toString((Object[])this.o.toArray()));
        }
        // MONITOREXIT : n9
        ArrayList<j> arrayList5 = this.g;
        if (arrayList5 != null && (n4 = arrayList5.size()) > 0) {
            printWriter.print(string);
            printWriter.println("Pending Actions:");
            while (n8 < n4) {
                j j2 = (j)this.g.get(n8);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(n8);
                printWriter.print(": ");
                printWriter.println((Object)j2);
                ++n8;
            }
        }
        printWriter.print(string);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(string);
        printWriter.print("  mHost=");
        printWriter.println((Object)this.s);
        printWriter.print(string);
        printWriter.print("  mContainer=");
        printWriter.println((Object)this.t);
        if (this.u != null) {
            printWriter.print(string);
            printWriter.print("  mParent=");
            printWriter.println((Object)this.u);
        }
        printWriter.print(string);
        printWriter.print("  mCurState=");
        printWriter.print(this.r);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.x);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.y);
        if (this.w) {
            printWriter.print(string);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.w);
        }
        if (this.z == null) return;
        printWriter.print(string);
        printWriter.print("  mNoTransactionsBecause=");
        printWriter.println(this.z);
        return;
        {
            catch (Throwable throwable) {}
            {
                // MONITOREXIT : n9
                throw throwable;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public List<a.b.d.a.h> b() {
        ArrayList<a.b.d.a.h> arrayList;
        if (this.j.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList<a.b.d.a.h> arrayList2 = arrayList = this.j;
        synchronized (arrayList2) {
            return (List)this.j.clone();
        }
    }

    @Override
    public boolean c() {
        return this.x;
    }

    void c0(a.b.d.a.h h2) {
        if (h2.n && !h2.q) {
            View view;
            h2.I = view = h2.x0(h2.B0(h2.d), null, h2.d);
            if (view != null) {
                h2.J = view;
                view.setSaveFromParentEnabled(false);
                if (h2.A) {
                    h2.I.setVisibility(8);
                }
                h2.p0(h2.I, h2.d);
                this.N(h2, h2.I, h2.d, false);
                return;
            }
            h2.J = null;
        }
    }

    public void c1(a.b.d.a.h h2) {
        if (a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("show: ");
            stringBuilder.append((Object)h2);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        if (h2.A) {
            h2.A = false;
            h2.R = true ^ h2.R;
        }
    }

    @Override
    public boolean d() {
        this.n();
        return this.I0(null, -1, 0);
    }

    public boolean d0() {
        this.b0(true);
        boolean bl = false;
        while (this.n0(this.B, this.C)) {
            this.h = true;
            try {
                this.N0(this.B, this.C);
                bl = true;
            }
            finally {
                this.o();
            }
        }
        this.Z();
        this.m();
        return bl;
    }

    void d1() {
        if (this.k == null) {
            return;
        }
        for (int i2 = 0; i2 < this.k.size(); ++i2) {
            a.b.d.a.h h2 = (a.b.d.a.h)this.k.valueAt(i2);
            if (h2 == null) continue;
            this.H0(h2);
        }
    }

    void h(a.b.d.a.c c2) {
        if (this.l == null) {
            this.l = new ArrayList();
        }
        this.l.add((Object)c2);
    }

    public a.b.d.a.h h0(int n2) {
        for (int i2 = -1 + this.j.size(); i2 >= 0; --i2) {
            a.b.d.a.h h2 = (a.b.d.a.h)this.j.get(i2);
            if (h2 == null || h2.x != n2) continue;
            return h2;
        }
        SparseArray<a.b.d.a.h> sparseArray = this.k;
        if (sparseArray != null) {
            for (int i3 = -1 + sparseArray.size(); i3 >= 0; --i3) {
                a.b.d.a.h h3 = (a.b.d.a.h)this.k.valueAt(i3);
                if (h3 == null || h3.x != n2) continue;
                return h3;
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void i(a.b.d.a.h h2, boolean bl) {
        if (a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("add: ");
            stringBuilder.append((Object)h2);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        this.v0(h2);
        if (!h2.B) {
            ArrayList<a.b.d.a.h> arrayList;
            if (this.j.contains((Object)h2)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Fragment already added: ");
                stringBuilder.append((Object)h2);
                throw new IllegalStateException(stringBuilder.toString());
            }
            ArrayList<a.b.d.a.h> arrayList2 = arrayList = this.j;
            synchronized (arrayList2) {
                this.j.add((Object)h2);
            }
            h2.l = true;
            h2.m = false;
            if (h2.I == null) {
                h2.R = false;
            }
            if (h2.E && h2.F) {
                this.w = true;
            }
            if (bl) {
                this.E0(h2);
                return;
            }
        }
    }

    public a.b.d.a.h i0(String string) {
        SparseArray<a.b.d.a.h> sparseArray;
        if (string != null) {
            for (int i2 = -1 + this.j.size(); i2 >= 0; --i2) {
                a.b.d.a.h h2 = (a.b.d.a.h)this.j.get(i2);
                if (h2 == null || !string.equals((Object)h2.z)) continue;
                return h2;
            }
        }
        if ((sparseArray = this.k) != null && string != null) {
            for (int i3 = -1 + sparseArray.size(); i3 >= 0; --i3) {
                a.b.d.a.h h3 = (a.b.d.a.h)this.k.valueAt(i3);
                if (h3 == null || !string.equals((Object)h3.z)) continue;
                return h3;
            }
        }
        return null;
    }

    public a.b.d.a.h j0(String string) {
        SparseArray<a.b.d.a.h> sparseArray = this.k;
        if (sparseArray != null && string != null) {
            for (int i2 = -1 + sparseArray.size(); i2 >= 0; --i2) {
                a.b.d.a.h h2;
                a.b.d.a.h h3 = (a.b.d.a.h)this.k.valueAt(i2);
                if (h3 == null || (h2 = h3.f(string)) == null) continue;
                return h2;
            }
        }
        return null;
    }

    public void k(l l2, a.b.d.a.j j2, a.b.d.a.h h2) {
        if (this.s == null) {
            this.s = l2;
            this.t = j2;
            this.u = h2;
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void l(a.b.d.a.h h2) {
        if (a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("attach: ");
            stringBuilder.append((Object)h2);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        if (h2.B) {
            h2.B = false;
            if (!h2.l) {
                ArrayList<a.b.d.a.h> arrayList;
                if (this.j.contains((Object)h2)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Fragment already added: ");
                    stringBuilder.append((Object)h2);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                if (a) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("add from attach: ");
                    stringBuilder.append((Object)h2);
                    Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                }
                ArrayList<a.b.d.a.h> arrayList2 = arrayList = this.j;
                synchronized (arrayList2) {
                    this.j.add((Object)h2);
                }
                h2.l = true;
                if (h2.E && h2.F) {
                    this.w = true;
                    return;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void m0(int n2) {
        n n3 = this;
        synchronized (n3) {
            this.n.set(n2, null);
            if (this.o == null) {
                this.o = new ArrayList();
            }
            if (a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Freeing back stack index ");
                stringBuilder.append(n2);
                Log.v((String)"FragmentManager", (String)stringBuilder.toString());
            }
            this.o.add((Object)n2);
            return;
        }
    }

    public View onCreateView(View view, String string, Context context, AttributeSet attributeSet) {
        String string2;
        String string3;
        int n2;
        int n3;
        block19 : {
            a.b.d.a.h h2;
            block18 : {
                l l2;
                block17 : {
                    l l3;
                    if (!"fragment".equals((Object)string)) {
                        return null;
                    }
                    String string4 = attributeSet.getAttributeValue(null, "class");
                    TypedArray typedArray = context.obtainStyledAttributes(attributeSet, i.a);
                    if (string4 == null) {
                        string4 = typedArray.getString(0);
                    }
                    string3 = string4;
                    n3 = typedArray.getResourceId(1, -1);
                    string2 = typedArray.getString(2);
                    typedArray.recycle();
                    if (!a.b.d.a.h.J(this.s.i(), string3)) {
                        return null;
                    }
                    n2 = 0;
                    if (view != null) {
                        n2 = view.getId();
                    }
                    if (n2 == -1 && n3 == -1 && string2 == null) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(attributeSet.getPositionDescription());
                        stringBuilder.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
                        stringBuilder.append(string3);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    h2 = n3 != -1 ? this.h0(n3) : null;
                    if (h2 == null && string2 != null) {
                        h2 = this.i0(string2);
                    }
                    if (h2 == null && n2 != -1) {
                        h2 = this.h0(n2);
                    }
                    if (a) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("onCreateView: id=0x");
                        stringBuilder.append(Integer.toHexString((int)n3));
                        stringBuilder.append(" fname=");
                        stringBuilder.append(string3);
                        stringBuilder.append(" existing=");
                        stringBuilder.append((Object)h2);
                        Log.v((String)"FragmentManager", (String)stringBuilder.toString());
                    }
                    if (h2 != null) break block17;
                    h2 = this.t.a(context, string3, null);
                    h2.n = true;
                    int n4 = n3 != 0 ? n3 : n2;
                    h2.x = n4;
                    h2.y = n2;
                    h2.z = string2;
                    h2.o = true;
                    h2.s = this;
                    h2.t = l3 = this.s;
                    h2.d0(l3.i(), attributeSet, h2.d);
                    this.i(h2, true);
                    break block18;
                }
                if (h2.o) break block19;
                h2.o = true;
                h2.t = l2 = this.s;
                if (!h2.D) {
                    h2.d0(l2.i(), attributeSet, h2.d);
                }
            }
            a.b.d.a.h h3 = h2;
            if (this.r < 1 && h3.n) {
                this.F0(h3, 1, 0, 0, false);
            } else {
                this.E0(h3);
            }
            View view2 = h3.I;
            if (view2 != null) {
                if (n3 != 0) {
                    view2.setId(n3);
                }
                if (h3.I.getTag() == null) {
                    h3.I.setTag((Object)string2);
                }
                return h3.I;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment ");
            stringBuilder.append(string3);
            stringBuilder.append(" did not create a view.");
            throw new IllegalStateException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(attributeSet.getPositionDescription());
        stringBuilder.append(": Duplicate id 0x");
        stringBuilder.append(Integer.toHexString((int)n3));
        stringBuilder.append(", tag ");
        stringBuilder.append(string2);
        stringBuilder.append(", or parent id 0x");
        stringBuilder.append(Integer.toHexString((int)n2));
        stringBuilder.append(" with another fragment for ");
        stringBuilder.append(string3);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public View onCreateView(String string, Context context, AttributeSet attributeSet) {
        return this.onCreateView(null, string, context, attributeSet);
    }

    public a.b.d.a.h p0(Bundle bundle, String string) {
        int n2 = bundle.getInt(string, -1);
        if (n2 == -1) {
            return null;
        }
        a.b.d.a.h h2 = (a.b.d.a.h)this.k.get(n2);
        if (h2 == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Fragment no longer exists for key ");
            stringBuilder.append(string);
            stringBuilder.append(": index ");
            stringBuilder.append(n2);
            this.e1((RuntimeException)new IllegalStateException(stringBuilder.toString()));
        }
        return h2;
    }

    void q(final a.b.d.a.h h2) {
        if (h2.I != null) {
            Animator animator;
            g g2 = this.u0(h2, h2.t(), true ^ h2.A, h2.u());
            if (g2 != null && (animator = g2.b) != null) {
                animator.setTarget((Object)h2.I);
                if (h2.A) {
                    if (h2.F()) {
                        h2.T0(false);
                    } else {
                        final ViewGroup viewGroup = h2.H;
                        final View view = h2.I;
                        viewGroup.startViewTransition(view);
                        g2.b.addListener((Animator.AnimatorListener)new AnimatorListenerAdapter(){

                            public void onAnimationEnd(Animator animator) {
                                viewGroup.endViewTransition(view);
                                animator.removeListener((Animator.AnimatorListener)this);
                                View view2 = h2.I;
                                if (view2 != null) {
                                    view2.setVisibility(8);
                                }
                            }
                        });
                    }
                } else {
                    h2.I.setVisibility(0);
                }
                n.Y0(h2.I, g2);
                g2.b.start();
            } else {
                if (g2 != null) {
                    n.Y0(h2.I, g2);
                    h2.I.startAnimation(g2.a);
                    g2.a.start();
                }
                int n2 = h2.A && !h2.F() ? 8 : 0;
                h2.I.setVisibility(n2);
                if (h2.F()) {
                    h2.T0(false);
                }
            }
        }
        if (h2.l && h2.E && h2.F) {
            this.w = true;
        }
        h2.R = false;
        h2.b0(h2.A);
    }

    LayoutInflater.Factory2 q0() {
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void r(a.b.d.a.h h2) {
        ArrayList<a.b.d.a.h> arrayList;
        if (a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("detach: ");
            stringBuilder.append((Object)h2);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        if (h2.B) return;
        h2.B = true;
        if (!h2.l) return;
        if (a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("remove from detach: ");
            stringBuilder.append((Object)h2);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        ArrayList<a.b.d.a.h> arrayList2 = arrayList = this.j;
        // MONITORENTER : arrayList2
        this.j.remove((Object)h2);
        // MONITOREXIT : arrayList2
        if (h2.E && h2.F) {
            this.w = true;
        }
        h2.l = false;
    }

    public a.b.d.a.h r0() {
        return this.v;
    }

    public void s() {
        this.x = false;
        this.X(2);
    }

    public void s0(a.b.d.a.h h2) {
        if (a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("hide: ");
            stringBuilder.append((Object)h2);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        if (!h2.A) {
            h2.A = true;
            h2.R = true ^ h2.R;
        }
    }

    public void t(Configuration configuration) {
        for (int i2 = 0; i2 < this.j.size(); ++i2) {
            a.b.d.a.h h2 = (a.b.d.a.h)this.j.get(i2);
            if (h2 == null) continue;
            h2.t0(configuration);
        }
    }

    boolean t0(int n2) {
        return this.r >= n2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentManager{");
        stringBuilder.append(Integer.toHexString((int)System.identityHashCode((Object)this)));
        stringBuilder.append(" in ");
        Object object = this.u;
        if (object == null) {
            object = this.s;
        }
        a.b.d.h.d.a(object, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    public boolean u(MenuItem menuItem) {
        for (int i2 = 0; i2 < this.j.size(); ++i2) {
            a.b.d.a.h h2 = (a.b.d.a.h)this.j.get(i2);
            if (h2 == null || !h2.u0(menuItem)) continue;
            return true;
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    g u0(a.b.d.a.h var1, int var2, boolean var3, int var4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl72 : ILOAD : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
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

    public void v() {
        this.x = false;
        this.X(1);
    }

    void v0(a.b.d.a.h h2) {
        if (h2.f >= 0) {
            return;
        }
        int n2 = this.i;
        this.i = n2 + 1;
        h2.U0(n2, this.u);
        if (this.k == null) {
            this.k = new SparseArray();
        }
        this.k.put(h2.f, (Object)h2);
        if (a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Allocated fragment index ");
            stringBuilder.append((Object)h2);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
    }

    public boolean w(Menu menu, MenuInflater menuInflater) {
        ArrayList arrayList = null;
        boolean bl = false;
        for (int i2 = 0; i2 < this.j.size(); ++i2) {
            a.b.d.a.h h2 = (a.b.d.a.h)this.j.get(i2);
            if (h2 == null || !h2.w0(menu, menuInflater)) continue;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add((Object)h2);
            bl = true;
        }
        ArrayList<a.b.d.a.h> arrayList2 = this.m;
        if (arrayList2 != null) {
            for (int i3 = 0; i3 < this.m.size(); ++i3) {
                a.b.d.a.h h3 = (a.b.d.a.h)this.m.get(i3);
                if (arrayList != null && arrayList.contains((Object)h3)) continue;
                h3.X();
            }
        }
        this.m = arrayList;
        return bl;
    }

    public void x() {
        this.y = true;
        this.d0();
        this.X(0);
        this.s = null;
        this.t = null;
        this.u = null;
    }

    void x0(a.b.d.a.h h2) {
        if (h2.f < 0) {
            return;
        }
        if (a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Freeing fragment index ");
            stringBuilder.append((Object)h2);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        this.k.put(h2.f, null);
        this.s.n(h2.g);
        h2.C();
    }

    public void y() {
        this.X(1);
    }

    public void z() {
        for (int i2 = 0; i2 < this.j.size(); ++i2) {
            a.b.d.a.h h2 = (a.b.d.a.h)this.j.get(i2);
            if (h2 == null) continue;
            h2.C0();
        }
    }

    private static class e
    extends f {
        View b;

        e(View view, Animation.AnimationListener animationListener) {
            super(animationListener);
            this.b = view;
        }

        @Override
        public void onAnimationEnd(Animation animation) {
            if (!a.b.d.i.p.v(this.b) && Build.VERSION.SDK_INT < 24) {
                this.b.setLayerType(0, null);
            } else {
                this.b.post(new Runnable(){

                    public void run() {
                        e.this.b.setLayerType(0, null);
                    }
                });
            }
            super.onAnimationEnd(animation);
        }

    }

    private static class f
    implements Animation.AnimationListener {
        private final Animation.AnimationListener a;

        private f(Animation.AnimationListener animationListener) {
            this.a = animationListener;
        }

        public void onAnimationEnd(Animation animation) {
            Animation.AnimationListener animationListener = this.a;
            if (animationListener != null) {
                animationListener.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            Animation.AnimationListener animationListener = this.a;
            if (animationListener != null) {
                animationListener.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            Animation.AnimationListener animationListener = this.a;
            if (animationListener != null) {
                animationListener.onAnimationStart(animation);
            }
        }
    }

    private static class g {
        public final Animation a;
        public final Animator b;

        private g(Animator animator) {
            this.a = null;
            this.b = animator;
            if (animator != null) {
                return;
            }
            throw new IllegalStateException("Animator cannot be null");
        }

        private g(Animation animation) {
            this.a = animation;
            this.b = null;
            if (animation != null) {
                return;
            }
            throw new IllegalStateException("Animation cannot be null");
        }
    }

    private static class h
    extends AnimatorListenerAdapter {
        View a;

        h(View view) {
            this.a = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.a.setLayerType(0, null);
            animator.removeListener((Animator.AnimatorListener)this);
        }

        public void onAnimationStart(Animator animator) {
            this.a.setLayerType(2, null);
        }
    }

    static class i {
        public static final int[] a = new int[]{16842755, 16842960, 16842961};
    }

    static interface j {
        public boolean a(ArrayList<a.b.d.a.c> var1, ArrayList<Boolean> var2);
    }

    static class k
    implements h.e {
        private final boolean a;
        private final a.b.d.a.c b;
        private int c;

        k(a.b.d.a.c c2, boolean bl) {
            this.a = bl;
            this.b = c2;
        }

        static /* synthetic */ boolean c(k k2) {
            return k2.a;
        }

        static /* synthetic */ a.b.d.a.c d(k k2) {
            return k2.b;
        }

        @Override
        public void a() {
            int n2;
            this.c = n2 = -1 + this.c;
            if (n2 != 0) {
                return;
            }
            this.b.b.W0();
        }

        @Override
        public void b() {
            this.c = 1 + this.c;
        }

        public void e() {
            a.b.d.a.c c2 = this.b;
            c2.b.p(c2, this.a, false, false);
        }

        public void f() {
            int n2 = this.c;
            boolean bl = n2 > 0;
            n n3 = this.b.b;
            int n4 = n3.j.size();
            for (int i2 = 0; i2 < n4; ++i2) {
                a.b.d.a.h h2 = (a.b.d.a.h)n3.j.get(i2);
                h2.X0(null);
                if (!bl || !h2.H()) continue;
                h2.Z0();
            }
            a.b.d.a.c c2 = this.b;
            c2.b.p(c2, this.a, bl ^ true, true);
        }

        public boolean g() {
            return this.c == 0;
        }
    }

}

