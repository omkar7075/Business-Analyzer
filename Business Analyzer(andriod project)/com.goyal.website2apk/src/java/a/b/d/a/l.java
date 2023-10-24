/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Handler
 *  android.view.LayoutInflater
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package a.b.d.a;

import a.b.d.a.h;
import a.b.d.a.i;
import a.b.d.a.j;
import a.b.d.a.n;
import a.b.d.a.u;
import a.b.d.a.v;
import a.b.d.h.p;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class l<E>
extends j {
    private final Activity a;
    final Context b;
    private final Handler c;
    final int d;
    final n e = new n();
    private p<String, u> f;
    private boolean g;
    private v h;
    private boolean i;
    private boolean j;

    l(i i2) {
        this(i2, (Context)i2, i2.e, 0);
    }

    l(Activity activity, Context context, Handler handler, int n2) {
        this.a = activity;
        this.b = context;
        this.c = handler;
        this.d = n2;
    }

    void d() {
        v v2 = this.h;
        if (v2 == null) {
            return;
        }
        v2.a();
    }

    /*
     * Enabled aggressive block sorting
     */
    void e() {
        block5 : {
            v v2;
            block4 : {
                if (this.j) {
                    return;
                }
                this.j = true;
                v2 = this.h;
                if (v2 != null) break block4;
                if (this.i) break block5;
                this.h = v2 = this.l("(root)", true, false);
                if (v2 == null || v2.e) break block5;
            }
            v2.e();
        }
        this.i = true;
    }

    void f(boolean bl) {
        this.g = bl;
        v v2 = this.h;
        if (v2 == null) {
            return;
        }
        if (!this.j) {
            return;
        }
        this.j = false;
        if (bl) {
            v2.d();
            return;
        }
        v2.f();
    }

    void g(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
        printWriter.print(string);
        printWriter.print("mLoadersStarted=");
        printWriter.println(this.j);
        if (this.h != null) {
            printWriter.print(string);
            printWriter.print("Loader Manager ");
            printWriter.print(Integer.toHexString((int)System.identityHashCode((Object)this.h)));
            printWriter.println(":");
            v v2 = this.h;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("  ");
            v2.g(stringBuilder.toString(), fileDescriptor, printWriter, arrstring);
        }
    }

    Activity h() {
        return this.a;
    }

    Context i() {
        return this.b;
    }

    n j() {
        return this.e;
    }

    Handler k() {
        return this.c;
    }

    v l(String string, boolean bl, boolean bl2) {
        v v2;
        if (this.f == null) {
            this.f = new p();
        }
        if ((v2 = (v)this.f.get(string)) == null && bl2) {
            v v3 = new v(string, this, bl);
            this.f.put(string, v3);
            return v3;
        }
        if (bl && v2 != null && !v2.e) {
            v2.e();
        }
        return v2;
    }

    boolean m() {
        return this.g;
    }

    void n(String string) {
        v v2;
        p<String, u> p2 = this.f;
        if (p2 != null && (v2 = (v)p2.get(string)) != null && !v2.f) {
            v2.a();
            this.f.remove(string);
        }
    }

    abstract void o(h var1);

    public abstract void p(String var1, FileDescriptor var2, PrintWriter var3, String[] var4);

    public abstract LayoutInflater q();

    public abstract int r();

    public abstract boolean s();

    public abstract boolean t(h var1);

    public abstract void u();

    void v() {
        p<String, u> p2 = this.f;
        if (p2 != null) {
            int n2 = p2.size();
            v[] arrv = new v[n2];
            for (int i2 = n2 - 1; i2 >= 0; --i2) {
                arrv[i2] = (v)this.f.l(i2);
            }
            for (int i3 = 0; i3 < n2; ++i3) {
                v v2 = arrv[i3];
                v2.h();
                v2.c();
            }
        }
    }

    void w(p<String, u> p2) {
        if (p2 != null) {
            int n2 = p2.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                ((v)p2.l(i2)).j(this);
            }
        }
        this.f = p2;
    }

    p<String, u> x() {
        p<String, u> p2 = this.f;
        int n2 = 0;
        if (p2 != null) {
            int n3 = p2.size();
            v[] arrv = new v[n3];
            for (int i2 = n3 - 1; i2 >= 0; --i2) {
                arrv[i2] = (v)this.f.l(i2);
            }
            boolean bl = this.m();
            int n4 = 0;
            while (n2 < n3) {
                v v2 = arrv[n2];
                if (!v2.f && bl) {
                    if (!v2.e) {
                        v2.e();
                    }
                    v2.d();
                }
                if (v2.f) {
                    n4 = 1;
                } else {
                    v2.a();
                    this.f.remove(v2.d);
                }
                ++n2;
            }
            n2 = n4;
        }
        if (n2 != 0) {
            return this.f;
        }
        return null;
    }
}

