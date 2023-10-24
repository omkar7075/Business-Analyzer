/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.Log
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 */
package a.b.d.a;

import a.b.d.a.l;
import a.b.d.a.n;
import a.b.d.a.u;
import a.b.d.b.b;
import a.b.d.h.d;
import a.b.d.h.q;
import android.os.Bundle;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class v
extends u {
    static boolean a;
    final q<a> b = new q();
    final q<a> c = new q();
    final String d;
    boolean e;
    boolean f;
    l g;

    v(String string, l l2, boolean bl) {
        this.d = string;
        this.g = l2;
        this.e = bl;
    }

    void a() {
        if (!this.f) {
            if (a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Destroying Active in ");
                stringBuilder.append((Object)this);
                Log.v((String)"LoaderManager", (String)stringBuilder.toString());
            }
            for (int i2 = -1 + this.b.k(); i2 >= 0; --i2) {
                this.b.l(i2).b();
            }
            this.b.b();
        }
        if (a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Destroying Inactive in ");
            stringBuilder.append((Object)this);
            Log.v((String)"LoaderManager", (String)stringBuilder.toString());
        }
        for (int i3 = -1 + this.c.k(); i3 >= 0; --i3) {
            this.c.l(i3).b();
        }
        this.c.b();
        this.g = null;
    }

    void b() {
        for (int i2 = this.b.k() - 1; i2 >= 0; --i2) {
            this.b.l((int)i2).k = true;
        }
    }

    void c() {
        for (int i2 = -1 + this.b.k(); i2 >= 0; --i2) {
            this.b.l(i2).e();
        }
    }

    void d() {
        if (a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Retaining in ");
            stringBuilder.append((Object)this);
            Log.v((String)"LoaderManager", (String)stringBuilder.toString());
        }
        if (!this.e) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Called doRetain when not started: ");
            stringBuilder.append((Object)this);
            Log.w((String)"LoaderManager", (String)stringBuilder.toString(), (Throwable)runtimeException);
            return;
        }
        this.f = true;
        this.e = false;
        for (int i2 = this.b.k() - 1; i2 >= 0; --i2) {
            this.b.l(i2).f();
        }
    }

    void e() {
        if (a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Starting in ");
            stringBuilder.append((Object)this);
            Log.v((String)"LoaderManager", (String)stringBuilder.toString());
        }
        if (this.e) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Called doStart when already started: ");
            stringBuilder.append((Object)this);
            Log.w((String)"LoaderManager", (String)stringBuilder.toString(), (Throwable)runtimeException);
            return;
        }
        this.e = true;
        for (int i2 = this.b.k() - 1; i2 >= 0; --i2) {
            this.b.l(i2).g();
        }
    }

    void f() {
        if (a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Stopping in ");
            stringBuilder.append((Object)this);
            Log.v((String)"LoaderManager", (String)stringBuilder.toString());
        }
        if (!this.e) {
            RuntimeException runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Called doStop when not started: ");
            stringBuilder.append((Object)this);
            Log.w((String)"LoaderManager", (String)stringBuilder.toString(), (Throwable)runtimeException);
            return;
        }
        for (int i2 = -1 + this.b.k(); i2 >= 0; --i2) {
            this.b.l(i2).h();
        }
        this.e = false;
    }

    public void g(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
        int n2 = this.b.k();
        int n3 = 0;
        if (n2 > 0) {
            printWriter.print(string);
            printWriter.println("Active Loaders:");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("    ");
            String string2 = stringBuilder.toString();
            for (int i2 = 0; i2 < this.b.k(); ++i2) {
                a a2 = this.b.l(i2);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(this.b.h(i2));
                printWriter.print(": ");
                printWriter.println(a2.toString());
                a2.c(string2, fileDescriptor, printWriter, arrstring);
            }
        }
        if (this.c.k() > 0) {
            printWriter.print(string);
            printWriter.println("Inactive Loaders:");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("    ");
            String string3 = stringBuilder.toString();
            while (n3 < this.c.k()) {
                a a3 = this.c.l(n3);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(this.c.h(n3));
                printWriter.print(": ");
                printWriter.println(a3.toString());
                a3.c(string3, fileDescriptor, printWriter, arrstring);
                ++n3;
            }
        }
    }

    void h() {
        if (this.f) {
            if (a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Finished Retaining in ");
                stringBuilder.append((Object)this);
                Log.v((String)"LoaderManager", (String)stringBuilder.toString());
            }
            this.f = false;
            for (int i2 = -1 + this.b.k(); i2 >= 0; --i2) {
                this.b.l(i2).d();
            }
        }
    }

    public boolean i() {
        int n2 = this.b.k();
        boolean bl = false;
        for (int i2 = 0; i2 < n2; ++i2) {
            a a2 = this.b.l(i2);
            boolean bl2 = a2.h && !a2.f;
            bl |= bl2;
        }
        return bl;
    }

    void j(l l2) {
        this.g = l2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString((int)System.identityHashCode((Object)this)));
        stringBuilder.append(" in ");
        d.a(this.g, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    final class a {
        final int a;
        final Bundle b;
        u.a<Object> c;
        b<Object> d;
        boolean e;
        boolean f;
        Object g;
        boolean h;
        boolean i;
        boolean j;
        boolean k;
        boolean l;
        boolean m;
        a n;
        final /* synthetic */ v o;

        void a(b<Object> b2, Object object) {
            u.a<Object> a2 = this.c;
            if (a2 != null) {
                block7 : {
                    block8 : {
                        String string;
                        l l2 = this.o.g;
                        if (l2 != null) {
                            n n2 = l2.e;
                            string = n2.z;
                            n2.z = "onLoadFinished";
                        } else {
                            string = null;
                        }
                        try {
                            if (v.a) break block7;
                            a2.b(b2, object);
                            l l3 = this.o.g;
                            if (l3 == null) break block8;
                        }
                        catch (Throwable throwable) {
                            l l4 = this.o.g;
                            if (l4 != null) {
                                l4.e.z = string;
                            }
                            throw throwable;
                        }
                        l3.e.z = string;
                    }
                    this.f = true;
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  onLoadFinished in ");
                stringBuilder.append(b2);
                stringBuilder.append(": ");
                throw null;
            }
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        void b() {
            if (v.a) {
                var1_1 = new StringBuilder();
                var1_1.append("  Destroying: ");
                var1_1.append((Object)this);
                Log.v((String)"LoaderManager", (String)var1_1.toString());
            }
            this.l = true;
            var5_2 = this.f;
            this.f = false;
            if (this.c != null && this.d != null && this.e && var5_2) {
                if (v.a) {
                    var7_3 = new StringBuilder();
                    var7_3.append("  Resetting: ");
                    var7_3.append((Object)this);
                    Log.v((String)"LoaderManager", (String)var7_3.toString());
                }
                if ((var11_4 = this.o.g) != null) {
                    var16_5 = var11_4.e;
                    var12_6 = var16_5.z;
                    var16_5.z = "onLoaderReset";
                } else {
                    var12_6 = null;
                }
                try {
                    this.c.a(this.d);
                    var15_7 = this.o.g;
                    ** if (var15_7 == null) goto lbl-1000
                }
                catch (Throwable var13_8) {
                    var14_9 = this.o.g;
                    if (var14_9 == null) throw var13_8;
                    var14_9.e.z = var12_6;
                    throw var13_8;
                }
lbl-1000: // 1 sources:
                {
                    var15_7.e.z = var12_6;
                }
lbl-1000: // 2 sources:
                {
                }
            }
            this.c = null;
            this.g = null;
            this.e = false;
            if (this.d != null) {
                if (this.m == false) throw null;
                this.m = false;
                throw null;
            }
            var6_10 = this.n;
            if (var6_10 == null) return;
            var6_10.b();
        }

        public void c(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
            printWriter.print(string);
            printWriter.print("mId=");
            printWriter.print(this.a);
            printWriter.print(" mArgs=");
            printWriter.println((Object)this.b);
            printWriter.print(string);
            printWriter.print("mCallbacks=");
            printWriter.println(this.c);
            printWriter.print(string);
            printWriter.print("mLoader=");
            printWriter.println(this.d);
            if (this.d == null) {
                if (this.e || this.f) {
                    printWriter.print(string);
                    printWriter.print("mHaveData=");
                    printWriter.print(this.e);
                    printWriter.print("  mDeliveredData=");
                    printWriter.println(this.f);
                    printWriter.print(string);
                    printWriter.print("mData=");
                    printWriter.println(this.g);
                }
                printWriter.print(string);
                printWriter.print("mStarted=");
                printWriter.print(this.h);
                printWriter.print(" mReportNextStart=");
                printWriter.print(this.k);
                printWriter.print(" mDestroyed=");
                printWriter.println(this.l);
                printWriter.print(string);
                printWriter.print("mRetaining=");
                printWriter.print(this.i);
                printWriter.print(" mRetainingStarted=");
                printWriter.print(this.j);
                printWriter.print(" mListenerRegistered=");
                printWriter.println(this.m);
                if (this.n != null) {
                    printWriter.print(string);
                    printWriter.println("Pending Loader ");
                    printWriter.print((Object)this.n);
                    printWriter.println(":");
                    a a2 = this.n;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string);
                    stringBuilder.append("  ");
                    a2.c(stringBuilder.toString(), fileDescriptor, printWriter, arrstring);
                }
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("  ");
            stringBuilder.toString();
            throw null;
        }

        void d() {
            if (this.i) {
                if (v.a) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("  Finished Retaining: ");
                    stringBuilder.append((Object)this);
                    Log.v((String)"LoaderManager", (String)stringBuilder.toString());
                }
                this.i = false;
                boolean bl = this.h;
                if (bl != this.j && !bl) {
                    this.h();
                }
            }
            if (this.h && this.e && !this.k) {
                this.a(this.d, this.g);
            }
        }

        void e() {
            if (this.h && this.k) {
                this.k = false;
                if (this.e && !this.i) {
                    this.a(this.d, this.g);
                }
            }
        }

        void f() {
            if (v.a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  Retaining: ");
                stringBuilder.append((Object)this);
                Log.v((String)"LoaderManager", (String)stringBuilder.toString());
            }
            this.i = true;
            this.j = this.h;
            this.h = false;
            this.c = null;
        }

        void g() {
            u.a<Object> a2;
            if (this.i && this.j) {
                this.h = true;
                return;
            }
            if (this.h) {
                return;
            }
            this.h = true;
            if (v.a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  Starting: ");
                stringBuilder.append((Object)this);
                Log.v((String)"LoaderManager", (String)stringBuilder.toString());
            }
            if (this.d == null && (a2 = this.c) != null) {
                a2.c(this.a, this.b);
            }
            if (this.d == null) {
                return;
            }
            throw null;
        }

        void h() {
            if (v.a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("  Stopping: ");
                stringBuilder.append((Object)this);
                Log.v((String)"LoaderManager", (String)stringBuilder.toString());
            }
            this.h = false;
            if (!this.i && this.d != null) {
                if (!this.m) {
                    return;
                }
                this.m = false;
                throw null;
            }
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(64);
            stringBuilder.append("LoaderInfo{");
            stringBuilder.append(Integer.toHexString((int)System.identityHashCode((Object)this)));
            stringBuilder.append(" #");
            stringBuilder.append(this.a);
            stringBuilder.append(" : ");
            d.a(this.d, stringBuilder);
            stringBuilder.append("}}");
            return stringBuilder.toString();
        }
    }

}

