/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.app.Activity
 *  android.arch.lifecycle.a
 *  android.arch.lifecycle.a$a
 *  android.arch.lifecycle.b
 *  android.arch.lifecycle.c
 *  android.content.ComponentCallbacks
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.SparseArray
 *  android.view.ContextMenu
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.LayoutInflater
 *  android.view.LayoutInflater$Factory2
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnCreateContextMenuListener
 *  android.view.ViewGroup
 *  android.view.animation.Animation
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.Deprecated
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalStateException
 *  java.lang.InstantiationException
 *  java.lang.Integer
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.InvocationTargetException
 */
package a.b.d.a;

import a.b.d.a.i;
import a.b.d.a.j;
import a.b.d.a.l;
import a.b.d.a.m;
import a.b.d.a.n;
import a.b.d.a.o;
import a.b.d.a.v;
import a.b.d.a.y;
import a.b.d.a.z;
import a.b.d.h.p;
import android.animation.Animator;
import android.app.Activity;
import android.arch.lifecycle.a;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class h
implements ComponentCallbacks,
View.OnCreateContextMenuListener,
android.arch.lifecycle.b {
    private static final p<String, Class<?>> a = new p();
    static final Object b = new Object();
    boolean A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F = true;
    boolean G;
    ViewGroup H;
    View I;
    View J;
    boolean K;
    boolean L = true;
    v M;
    boolean N;
    boolean O;
    c P;
    boolean Q;
    boolean R;
    float S;
    LayoutInflater T;
    boolean U;
    android.arch.lifecycle.c V = new android.arch.lifecycle.c((android.arch.lifecycle.b)this);
    int c = 0;
    Bundle d;
    SparseArray<Parcelable> e;
    int f = -1;
    String g;
    Bundle h;
    h i;
    int j = -1;
    int k;
    boolean l;
    boolean m;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    int r;
    n s;
    l t;
    n u;
    o v;
    h w;
    int x;
    int y;
    String z;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static h D(Context context, String string, Bundle bundle) {
        try {
            p<String, Class<?>> p2 = a;
            Class class_ = p2.get(string);
            if (class_ == null) {
                class_ = context.getClassLoader().loadClass(string);
                p2.put(string, class_);
            }
            h h2 = (h)class_.getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(h2.getClass().getClassLoader());
                h2.S0(bundle);
            }
            return h2;
        }
        catch (InvocationTargetException invocationTargetException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(string);
            stringBuilder.append(": calling Fragment constructor caused an exception");
            throw new d(stringBuilder.toString(), (Exception)invocationTargetException);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(string);
            stringBuilder.append(": could not find Fragment constructor");
            throw new d(stringBuilder.toString(), (Exception)noSuchMethodException);
        }
        catch (IllegalAccessException illegalAccessException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(string);
            stringBuilder.append(": make sure class name exists, is public, and has an");
            stringBuilder.append(" empty constructor that is public");
            throw new d(stringBuilder.toString(), (Exception)illegalAccessException);
        }
        catch (InstantiationException instantiationException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(string);
            stringBuilder.append(": make sure class name exists, is public, and has an");
            stringBuilder.append(" empty constructor that is public");
            throw new d(stringBuilder.toString(), (Exception)instantiationException);
        }
        catch (ClassNotFoundException classNotFoundException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(string);
            stringBuilder.append(": make sure class name exists, is public, and has an");
            stringBuilder.append(" empty constructor that is public");
            throw new d(stringBuilder.toString(), (Exception)classNotFoundException);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean J(Context context, String string) {
        Class class_;
        p<String, Class<?>> p2;
        try {
            p2 = a;
            class_ = p2.get(string);
            if (class_ != null) return h.class.isAssignableFrom(class_);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
        class_ = context.getClassLoader().loadClass(string);
        p2.put(string, class_);
        return h.class.isAssignableFrom(class_);
    }

    private void c() {
        e e2;
        c c2 = this.P;
        if (c2 == null) {
            e2 = null;
        } else {
            c2.q = false;
            e e3 = c2.r;
            c2.r = null;
            e2 = e3;
        }
        if (e2 != null) {
            e2.a();
        }
    }

    private c e() {
        if (this.P == null) {
            this.P = new c();
        }
        return this.P;
    }

    int A() {
        c c2 = this.P;
        if (c2 == null) {
            return 0;
        }
        return c2.c;
    }

    void A0() {
        this.G = false;
        this.Z();
        this.T = null;
        if (this.G) {
            n n2 = this.u;
            if (n2 != null) {
                if (this.D) {
                    n2.x();
                    this.u = null;
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Child FragmentManager of ");
                stringBuilder.append((Object)this);
                stringBuilder.append(" was not ");
                stringBuilder.append(" destroyed and this fragment is not retaining instance");
                throw new IllegalStateException(stringBuilder.toString());
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append((Object)this);
        stringBuilder.append(" did not call through to super.onDetach()");
        throw new z(stringBuilder.toString());
    }

    public View B() {
        return this.I;
    }

    LayoutInflater B0(Bundle bundle) {
        LayoutInflater layoutInflater;
        this.T = layoutInflater = this.a0(bundle);
        return layoutInflater;
    }

    void C() {
        this.f = -1;
        this.g = null;
        this.l = false;
        this.m = false;
        this.n = false;
        this.o = false;
        this.p = false;
        this.r = 0;
        this.s = null;
        this.u = null;
        this.t = null;
        this.x = 0;
        this.y = 0;
        this.z = null;
        this.A = false;
        this.B = false;
        this.D = false;
        this.M = null;
        this.N = false;
        this.O = false;
    }

    void C0() {
        this.onLowMemory();
        n n2 = this.u;
        if (n2 != null) {
            n2.z();
        }
    }

    void D0(boolean bl) {
        this.e0(bl);
        n n2 = this.u;
        if (n2 != null) {
            n2.A(bl);
        }
    }

    void E() {
        if (this.t != null) {
            n n2;
            this.u = n2 = new n();
            n2.k(this.t, new j(){

                @Override
                public h a(Context context, String string, Bundle bundle) {
                    return h.this.t.a(context, string, bundle);
                }

                @Override
                public View b(int n2) {
                    View view = h.this.I;
                    if (view != null) {
                        return view.findViewById(n2);
                    }
                    throw new IllegalStateException("Fragment does not have a view");
                }

                @Override
                public boolean c() {
                    return h.this.I != null;
                }
            }, this);
            return;
        }
        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    boolean E0(MenuItem menuItem) {
        if (!this.A) {
            if (this.E && this.F && this.f0(menuItem)) {
                return true;
            }
            n n2 = this.u;
            if (n2 != null && n2.P(menuItem)) {
                return true;
            }
        }
        return false;
    }

    boolean F() {
        c c2 = this.P;
        if (c2 == null) {
            return false;
        }
        return c2.s;
    }

    void F0(Menu menu) {
        if (!this.A) {
            n n2;
            if (this.E && this.F) {
                this.g0(menu);
            }
            if ((n2 = this.u) != null) {
                n2.Q(menu);
            }
        }
    }

    final boolean G() {
        return this.r > 0;
    }

    void G0() {
        this.V.e(a.a.ON_PAUSE);
        n n2 = this.u;
        if (n2 != null) {
            n2.R();
        }
        this.c = 4;
        this.G = false;
        this.h0();
        if (this.G) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append((Object)this);
        stringBuilder.append(" did not call through to super.onPause()");
        throw new z(stringBuilder.toString());
    }

    boolean H() {
        c c2 = this.P;
        if (c2 == null) {
            return false;
        }
        return c2.q;
    }

    void H0(boolean bl) {
        this.i0(bl);
        n n2 = this.u;
        if (n2 != null) {
            n2.S(bl);
        }
    }

    public final boolean I() {
        n n2 = this.s;
        if (n2 == null) {
            return false;
        }
        return n2.c();
    }

    boolean I0(Menu menu) {
        boolean bl = this.A;
        boolean bl2 = false;
        if (!bl) {
            n n2;
            boolean bl3 = this.E;
            bl2 = false;
            if (bl3) {
                boolean bl4 = this.F;
                bl2 = false;
                if (bl4) {
                    this.j0(menu);
                    bl2 = true;
                }
            }
            if ((n2 = this.u) != null) {
                bl2 |= n2.T(menu);
            }
        }
        return bl2;
    }

    void J0() {
        n n2 = this.u;
        if (n2 != null) {
            n2.U();
        }
        this.c = 2;
        if (this.N) {
            this.N = false;
            if (!this.O) {
                this.O = true;
                this.M = this.t.l(this.g, false, false);
            }
            if (this.M != null) {
                if (this.t.m()) {
                    this.M.d();
                    return;
                }
                this.M.f();
            }
        }
    }

    void K() {
        n n2 = this.u;
        if (n2 != null) {
            n2.G0();
        }
    }

    void K0() {
        n n2 = this.u;
        if (n2 != null) {
            n2.G0();
            this.u.d0();
        }
        this.c = 5;
        this.G = false;
        this.l0();
        if (this.G) {
            n n3 = this.u;
            if (n3 != null) {
                n3.V();
                this.u.d0();
            }
            this.V.e(a.a.ON_RESUME);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append((Object)this);
        stringBuilder.append(" did not call through to super.onResume()");
        throw new z(stringBuilder.toString());
    }

    public void L(Bundle bundle) {
        this.G = true;
    }

    void L0(Bundle bundle) {
        Parcelable parcelable;
        this.m0(bundle);
        n n2 = this.u;
        if (n2 != null && (parcelable = n2.S0()) != null) {
            bundle.putParcelable("android:support:fragments", parcelable);
        }
    }

    public void M(int n2, int n3, Intent intent) {
    }

    void M0() {
        n n2 = this.u;
        if (n2 != null) {
            n2.G0();
            this.u.d0();
        }
        this.c = 4;
        this.G = false;
        this.n0();
        if (this.G) {
            v v2;
            n n3 = this.u;
            if (n3 != null) {
                n3.W();
            }
            if ((v2 = this.M) != null) {
                v2.c();
            }
            this.V.e(a.a.ON_START);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append((Object)this);
        stringBuilder.append(" did not call through to super.onStart()");
        throw new z(stringBuilder.toString());
    }

    @Deprecated
    public void N(Activity activity) {
        this.G = true;
    }

    void N0() {
        this.V.e(a.a.ON_STOP);
        n n2 = this.u;
        if (n2 != null) {
            n2.Y();
        }
        this.c = 3;
        this.G = false;
        this.o0();
        if (this.G) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append((Object)this);
        stringBuilder.append(" did not call through to super.onStop()");
        throw new z(stringBuilder.toString());
    }

    public void O(Context context) {
        this.G = true;
        l l2 = this.t;
        Activity activity = l2 == null ? null : l2.h();
        if (activity != null) {
            this.G = false;
            this.N(activity);
        }
    }

    void O0(Bundle bundle) {
        Parcelable parcelable;
        if (bundle != null && (parcelable = bundle.getParcelable("android:support:fragments")) != null) {
            if (this.u == null) {
                this.E();
            }
            this.u.P0(parcelable, this.v);
            this.v = null;
            this.u.v();
        }
    }

    public void P(h h2) {
    }

    final void P0(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.e;
        if (sparseArray != null) {
            this.J.restoreHierarchyState(sparseArray);
            this.e = null;
        }
        this.G = false;
        this.q0(bundle);
        if (this.G) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append((Object)this);
        stringBuilder.append(" did not call through to super.onViewStateRestored()");
        throw new z(stringBuilder.toString());
    }

    public boolean Q(MenuItem menuItem) {
        return false;
    }

    void Q0(View view) {
        this.e().a = view;
    }

    public void R(Bundle bundle) {
        this.G = true;
        this.O0(bundle);
        n n2 = this.u;
        if (n2 != null && !n2.t0(1)) {
            this.u.v();
        }
    }

    void R0(Animator animator) {
        this.e().b = animator;
    }

    public Animation S(int n2, boolean bl, int n3) {
        return null;
    }

    public void S0(Bundle bundle) {
        if (this.f >= 0 && this.I()) {
            throw new IllegalStateException("Fragment already active and state has been saved");
        }
        this.h = bundle;
    }

    public Animator T(int n2, boolean bl, int n3) {
        return null;
    }

    void T0(boolean bl) {
        this.e().s = bl;
    }

    public void U(Menu menu, MenuInflater menuInflater) {
    }

    /*
     * Exception decompiling
     */
    final void U0(int var1, h var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.lang.IllegalStateException: Invisible function parameters on a non-constructor (or reads of uninitialised local variables).
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1560)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1816)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:332)
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

    public View V(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return null;
    }

    void V0(int n2) {
        if (this.P == null && n2 == 0) {
            return;
        }
        this.e().d = n2;
    }

    public void W() {
        v v2;
        this.G = true;
        if (!this.O) {
            this.O = true;
            this.M = this.t.l(this.g, this.N, false);
        }
        if ((v2 = this.M) != null) {
            v2.a();
        }
    }

    void W0(int n2, int n3) {
        if (this.P == null && n2 == 0 && n3 == 0) {
            return;
        }
        this.e();
        c c2 = this.P;
        c2.e = n2;
        c2.f = n3;
    }

    public void X() {
    }

    void X0(e e2) {
        this.e();
        c c2 = this.P;
        e e3 = c2.r;
        if (e2 == e3) {
            return;
        }
        if (e2 != null && e3 != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trying to set a replacement startPostponedEnterTransition on ");
            stringBuilder.append((Object)this);
            throw new IllegalStateException(stringBuilder.toString());
        }
        if (c2.q) {
            c2.r = e2;
        }
        if (e2 != null) {
            e2.b();
        }
    }

    public void Y() {
        this.G = true;
    }

    void Y0(int n2) {
        this.e().c = n2;
    }

    public void Z() {
        this.G = true;
    }

    public void Z0() {
        n n2 = this.s;
        if (n2 != null && n2.s != null) {
            if (Looper.myLooper() != this.s.s.k().getLooper()) {
                this.s.s.k().postAtFrontOfQueue(new Runnable(){

                    public void run() {
                        h.this.c();
                    }
                });
                return;
            }
            this.c();
            return;
        }
        this.e().q = false;
    }

    public android.arch.lifecycle.a a() {
        return this.V;
    }

    public LayoutInflater a0(Bundle bundle) {
        return this.r(bundle);
    }

    public void b0(boolean bl) {
    }

    @Deprecated
    public void c0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.G = true;
    }

    public void d(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
        printWriter.print(string);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString((int)this.x));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString((int)this.y));
        printWriter.print(" mTag=");
        printWriter.println(this.z);
        printWriter.print(string);
        printWriter.print("mState=");
        printWriter.print(this.c);
        printWriter.print(" mIndex=");
        printWriter.print(this.f);
        printWriter.print(" mWho=");
        printWriter.print(this.g);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.r);
        printWriter.print(string);
        printWriter.print("mAdded=");
        printWriter.print(this.l);
        printWriter.print(" mRemoving=");
        printWriter.print(this.m);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.n);
        printWriter.print(" mInLayout=");
        printWriter.println(this.o);
        printWriter.print(string);
        printWriter.print("mHidden=");
        printWriter.print(this.A);
        printWriter.print(" mDetached=");
        printWriter.print(this.B);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.F);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.E);
        printWriter.print(string);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.C);
        printWriter.print(" mRetaining=");
        printWriter.print(this.D);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.L);
        if (this.s != null) {
            printWriter.print(string);
            printWriter.print("mFragmentManager=");
            printWriter.println((Object)this.s);
        }
        if (this.t != null) {
            printWriter.print(string);
            printWriter.print("mHost=");
            printWriter.println((Object)this.t);
        }
        if (this.w != null) {
            printWriter.print(string);
            printWriter.print("mParentFragment=");
            printWriter.println((Object)this.w);
        }
        if (this.h != null) {
            printWriter.print(string);
            printWriter.print("mArguments=");
            printWriter.println((Object)this.h);
        }
        if (this.d != null) {
            printWriter.print(string);
            printWriter.print("mSavedFragmentState=");
            printWriter.println((Object)this.d);
        }
        if (this.e != null) {
            printWriter.print(string);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.e);
        }
        if (this.i != null) {
            printWriter.print(string);
            printWriter.print("mTarget=");
            printWriter.print((Object)this.i);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.k);
        }
        if (this.s() != 0) {
            printWriter.print(string);
            printWriter.print("mNextAnim=");
            printWriter.println(this.s());
        }
        if (this.H != null) {
            printWriter.print(string);
            printWriter.print("mContainer=");
            printWriter.println((Object)this.H);
        }
        if (this.I != null) {
            printWriter.print(string);
            printWriter.print("mView=");
            printWriter.println((Object)this.I);
        }
        if (this.J != null) {
            printWriter.print(string);
            printWriter.print("mInnerView=");
            printWriter.println((Object)this.I);
        }
        if (this.j() != null) {
            printWriter.print(string);
            printWriter.print("mAnimatingAway=");
            printWriter.println((Object)this.j());
            printWriter.print(string);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(this.A());
        }
        if (this.M != null) {
            printWriter.print(string);
            printWriter.println("Loader Manager:");
            v v2 = this.M;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("  ");
            v2.g(stringBuilder.toString(), fileDescriptor, printWriter, arrstring);
        }
        if (this.u != null) {
            printWriter.print(string);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Child ");
            stringBuilder.append((Object)this.u);
            stringBuilder.append(":");
            printWriter.println(stringBuilder.toString());
            n n2 = this.u;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string);
            stringBuilder2.append("  ");
            n2.a(stringBuilder2.toString(), fileDescriptor, printWriter, arrstring);
        }
    }

    public void d0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.G = true;
        l l2 = this.t;
        Activity activity = l2 == null ? null : l2.h();
        if (activity != null) {
            this.G = false;
            this.c0(activity, attributeSet, bundle);
        }
    }

    public void e0(boolean bl) {
    }

    public final boolean equals(Object object) {
        return super.equals(object);
    }

    h f(String string) {
        if (string.equals((Object)this.g)) {
            return this;
        }
        n n2 = this.u;
        if (n2 != null) {
            return n2.j0(string);
        }
        return null;
    }

    public boolean f0(MenuItem menuItem) {
        return false;
    }

    public final i g() {
        l l2 = this.t;
        if (l2 == null) {
            return null;
        }
        return (i)l2.h();
    }

    public void g0(Menu menu) {
    }

    public boolean h() {
        c c2 = this.P;
        if (c2 != null && c2.n != null) {
            return this.P.n;
        }
        return true;
    }

    public void h0() {
        this.G = true;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public boolean i() {
        c c2 = this.P;
        if (c2 != null && c2.m != null) {
            return this.P.m;
        }
        return true;
    }

    public void i0(boolean bl) {
    }

    View j() {
        c c2 = this.P;
        if (c2 == null) {
            return null;
        }
        return c2.a;
    }

    public void j0(Menu menu) {
    }

    Animator k() {
        c c2 = this.P;
        if (c2 == null) {
            return null;
        }
        return c2.b;
    }

    public void k0(int n2, String[] arrstring, int[] arrn) {
    }

    public final m l() {
        if (this.u == null) {
            this.E();
            int n2 = this.c;
            if (n2 >= 5) {
                this.u.V();
            } else if (n2 >= 4) {
                this.u.W();
            } else if (n2 >= 2) {
                this.u.s();
            } else if (n2 >= 1) {
                this.u.v();
            }
        }
        return this.u;
    }

    public void l0() {
        this.G = true;
    }

    public Object m() {
        c c2 = this.P;
        if (c2 == null) {
            return null;
        }
        return c2.g;
    }

    public void m0(Bundle bundle) {
    }

    y n() {
        c c2 = this.P;
        if (c2 == null) {
            return null;
        }
        return c2.o;
    }

    public void n0() {
        this.G = true;
        if (!this.N) {
            this.N = true;
            if (!this.O) {
                this.O = true;
                this.M = this.t.l(this.g, true, false);
                return;
            }
            v v2 = this.M;
            if (v2 != null) {
                v2.e();
            }
        }
    }

    public Object o() {
        c c2 = this.P;
        if (c2 == null) {
            return null;
        }
        return c2.i;
    }

    public void o0() {
        this.G = true;
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.G = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.g().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.G = true;
    }

    y p() {
        c c2 = this.P;
        if (c2 == null) {
            return null;
        }
        return c2.p;
    }

    public void p0(View view, Bundle bundle) {
    }

    public final m q() {
        return this.s;
    }

    public void q0(Bundle bundle) {
        this.G = true;
    }

    @Deprecated
    public LayoutInflater r(Bundle bundle) {
        l l2 = this.t;
        if (l2 != null) {
            LayoutInflater layoutInflater = l2.q();
            this.l();
            a.b.d.i.e.b(layoutInflater, this.u.q0());
            return layoutInflater;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    m r0() {
        return this.u;
    }

    int s() {
        c c2 = this.P;
        if (c2 == null) {
            return 0;
        }
        return c2.d;
    }

    void s0(Bundle bundle) {
        n n2 = this.u;
        if (n2 != null) {
            n2.G0();
        }
        this.c = 2;
        this.G = false;
        this.L(bundle);
        if (this.G) {
            n n3 = this.u;
            if (n3 != null) {
                n3.s();
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append((Object)this);
        stringBuilder.append(" did not call through to super.onActivityCreated()");
        throw new z(stringBuilder.toString());
    }

    int t() {
        c c2 = this.P;
        if (c2 == null) {
            return 0;
        }
        return c2.e;
    }

    void t0(Configuration configuration) {
        this.onConfigurationChanged(configuration);
        n n2 = this.u;
        if (n2 != null) {
            n2.t(configuration);
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        a.b.d.h.d.a(this, stringBuilder);
        if (this.f >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.f);
        }
        if (this.x != 0) {
            stringBuilder.append(" id=0x");
            stringBuilder.append(Integer.toHexString((int)this.x));
        }
        if (this.z != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.z);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    int u() {
        c c2 = this.P;
        if (c2 == null) {
            return 0;
        }
        return c2.f;
    }

    boolean u0(MenuItem menuItem) {
        if (!this.A) {
            if (this.Q(menuItem)) {
                return true;
            }
            n n2 = this.u;
            if (n2 != null && n2.u(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public Object v() {
        c c2 = this.P;
        if (c2 == null) {
            return null;
        }
        if (c2.j == b) {
            return this.o();
        }
        return this.P.j;
    }

    void v0(Bundle bundle) {
        n n2 = this.u;
        if (n2 != null) {
            n2.G0();
        }
        this.c = 1;
        this.G = false;
        this.R(bundle);
        this.U = true;
        if (this.G) {
            this.V.e(a.a.ON_CREATE);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append((Object)this);
        stringBuilder.append(" did not call through to super.onCreate()");
        throw new z(stringBuilder.toString());
    }

    public final Resources w() {
        l l2 = this.t;
        if (l2 != null) {
            return l2.i().getResources();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append((Object)this);
        stringBuilder.append(" not attached to Activity");
        throw new IllegalStateException(stringBuilder.toString());
    }

    boolean w0(Menu menu, MenuInflater menuInflater) {
        boolean bl = this.A;
        boolean bl2 = false;
        if (!bl) {
            n n2;
            boolean bl3 = this.E;
            bl2 = false;
            if (bl3) {
                boolean bl4 = this.F;
                bl2 = false;
                if (bl4) {
                    this.U(menu, menuInflater);
                    bl2 = true;
                }
            }
            if ((n2 = this.u) != null) {
                bl2 |= n2.w(menu, menuInflater);
            }
        }
        return bl2;
    }

    public Object x() {
        c c2 = this.P;
        if (c2 == null) {
            return null;
        }
        if (c2.h == b) {
            return this.m();
        }
        return this.P.h;
    }

    View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        n n2 = this.u;
        if (n2 != null) {
            n2.G0();
        }
        this.q = true;
        return this.V(layoutInflater, viewGroup, bundle);
    }

    public Object y() {
        c c2 = this.P;
        if (c2 == null) {
            return null;
        }
        return c2.k;
    }

    void y0() {
        this.V.e(a.a.ON_DESTROY);
        n n2 = this.u;
        if (n2 != null) {
            n2.x();
        }
        this.c = 0;
        this.G = false;
        this.U = false;
        this.W();
        if (this.G) {
            this.u = null;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append((Object)this);
        stringBuilder.append(" did not call through to super.onDestroy()");
        throw new z(stringBuilder.toString());
    }

    public Object z() {
        c c2 = this.P;
        if (c2 == null) {
            return null;
        }
        if (c2.l == b) {
            return this.y();
        }
        return this.P.l;
    }

    void z0() {
        n n2 = this.u;
        if (n2 != null) {
            n2.y();
        }
        this.c = 1;
        this.G = false;
        this.Y();
        if (this.G) {
            v v2 = this.M;
            if (v2 != null) {
                v2.b();
            }
            this.q = false;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append((Object)this);
        stringBuilder.append(" did not call through to super.onDestroyView()");
        throw new z(stringBuilder.toString());
    }

    static class c {
        View a;
        Animator b;
        int c;
        int d;
        int e;
        int f;
        private Object g = null;
        private Object h;
        private Object i;
        private Object j;
        private Object k;
        private Object l;
        private Boolean m;
        private Boolean n;
        y o;
        y p;
        boolean q;
        e r;
        boolean s;

        c() {
            Object object;
            this.h = object = h.b;
            this.i = null;
            this.j = object;
            this.k = null;
            this.l = object;
        }
    }

    public static class d
    extends RuntimeException {
        public d(String string, Exception exception) {
            super(string, (Throwable)exception);
        }
    }

    static interface e {
        public void a();

        public void b();
    }

}

