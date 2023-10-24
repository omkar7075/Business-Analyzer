/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.view.View
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 */
package a.b.d.a;

import a.b.d.a.h;
import a.b.d.a.n;
import a.b.d.a.r;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;

final class c
extends r
implements n.j {
    static final boolean a;
    final n b;
    ArrayList<a> c = new ArrayList();
    int d;
    int e;
    int f;
    int g;
    int h;
    int i;
    boolean j;
    boolean k = true;
    String l;
    boolean m;
    int n = -1;
    int o;
    CharSequence p;
    int q;
    CharSequence r;
    ArrayList<String> s;
    ArrayList<String> t;
    boolean u = false;
    ArrayList<Runnable> v;

    static {
        boolean bl = Build.VERSION.SDK_INT >= 21;
        a = bl;
    }

    public c(n n2) {
        this.b = n2;
    }

    private static boolean l(a a2) {
        h h2 = a2.b;
        return h2 != null && h2.l && h2.I != null && !h2.B && !h2.A && h2.H();
    }

    @Override
    public boolean a(ArrayList<c> arrayList, ArrayList<Boolean> arrayList2) {
        if (n.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Run: ");
            stringBuilder.append((Object)this);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        arrayList.add((Object)this);
        arrayList2.add((Object)Boolean.FALSE);
        if (this.j) {
            this.b.h(this);
        }
        return true;
    }

    void b(a a2) {
        this.c.add((Object)a2);
        a2.c = this.d;
        a2.d = this.e;
        a2.e = this.f;
        a2.f = this.g;
    }

    void c(int n2) {
        if (!this.j) {
            return;
        }
        if (n.a) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Bump nesting in ");
            stringBuilder.append((Object)this);
            stringBuilder.append(" by ");
            stringBuilder.append(n2);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
        int n3 = this.c.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            a a2 = (a)this.c.get(i2);
            h h2 = a2.b;
            if (h2 == null) continue;
            h2.r = n2 + h2.r;
            if (!n.a) continue;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Bump nesting of ");
            stringBuilder.append((Object)a2.b);
            stringBuilder.append(" to ");
            stringBuilder.append(a2.b.r);
            Log.v((String)"FragmentManager", (String)stringBuilder.toString());
        }
    }

    public void d(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
        this.e(string, printWriter, true);
    }

    public void e(String string, PrintWriter printWriter, boolean bl) {
        if (bl) {
            printWriter.print(string);
            printWriter.print("mName=");
            printWriter.print(this.l);
            printWriter.print(" mIndex=");
            printWriter.print(this.n);
            printWriter.print(" mCommitted=");
            printWriter.println(this.m);
            if (this.h != 0) {
                printWriter.print(string);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString((int)this.h));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString((int)this.i));
            }
            if (this.d != 0 || this.e != 0) {
                printWriter.print(string);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString((int)this.d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString((int)this.e));
            }
            if (this.f != 0 || this.g != 0) {
                printWriter.print(string);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString((int)this.f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString((int)this.g));
            }
            if (this.o != 0 || this.p != null) {
                printWriter.print(string);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString((int)this.o));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println((Object)this.p);
            }
            if (this.q != 0 || this.r != null) {
                printWriter.print(string);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString((int)this.q));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println((Object)this.r);
            }
        }
        if (!this.c.isEmpty()) {
            printWriter.print(string);
            printWriter.println("Operations:");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            stringBuilder.append("    ");
            stringBuilder.toString();
            int n2 = this.c.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                String string2;
                a a2 = (a)this.c.get(i2);
                switch (a2.a) {
                    default: {
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append("cmd=");
                        stringBuilder2.append(a2.a);
                        string2 = stringBuilder2.toString();
                        break;
                    }
                    case 9: {
                        string2 = "UNSET_PRIMARY_NAV";
                        break;
                    }
                    case 8: {
                        string2 = "SET_PRIMARY_NAV";
                        break;
                    }
                    case 7: {
                        string2 = "ATTACH";
                        break;
                    }
                    case 6: {
                        string2 = "DETACH";
                        break;
                    }
                    case 5: {
                        string2 = "SHOW";
                        break;
                    }
                    case 4: {
                        string2 = "HIDE";
                        break;
                    }
                    case 3: {
                        string2 = "REMOVE";
                        break;
                    }
                    case 2: {
                        string2 = "REPLACE";
                        break;
                    }
                    case 1: {
                        string2 = "ADD";
                        break;
                    }
                    case 0: {
                        string2 = "NULL";
                    }
                }
                printWriter.print(string);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(string2);
                printWriter.print(" ");
                printWriter.println((Object)a2.b);
                if (!bl) continue;
                if (a2.c != 0 || a2.d != 0) {
                    printWriter.print(string);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString((int)a2.c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString((int)a2.d));
                }
                if (a2.e == 0 && a2.f == 0) continue;
                printWriter.print(string);
                printWriter.print("popEnterAnim=#");
                printWriter.print(Integer.toHexString((int)a2.e));
                printWriter.print(" popExitAnim=#");
                printWriter.println(Integer.toHexString((int)a2.f));
            }
        }
    }

    void f() {
        int n2 = this.c.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            a a2 = (a)this.c.get(i2);
            h h2 = a2.b;
            if (h2 != null) {
                h2.W0(this.h, this.i);
            }
            switch (a2.a) {
                default: {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown cmd: ");
                    stringBuilder.append(a2.a);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                case 9: {
                    this.b.Z0(null);
                    break;
                }
                case 8: {
                    this.b.Z0(h2);
                    break;
                }
                case 7: {
                    h2.V0(a2.c);
                    this.b.l(h2);
                    break;
                }
                case 6: {
                    h2.V0(a2.d);
                    this.b.r(h2);
                    break;
                }
                case 5: {
                    h2.V0(a2.c);
                    this.b.c1(h2);
                    break;
                }
                case 4: {
                    h2.V0(a2.d);
                    this.b.s0(h2);
                    break;
                }
                case 3: {
                    h2.V0(a2.d);
                    this.b.M0(h2);
                    break;
                }
                case 1: {
                    h2.V0(a2.c);
                    this.b.i(h2, false);
                }
            }
            if (this.u || a2.a == 1 || h2 == null) continue;
            this.b.C0(h2);
        }
        if (!this.u) {
            n n3 = this.b;
            n3.D0(n3.r, true);
        }
    }

    void g(boolean bl) {
        for (int i2 = this.c.size() - 1; i2 >= 0; --i2) {
            a a2 = (a)this.c.get(i2);
            h h2 = a2.b;
            if (h2 != null) {
                h2.W0(n.R0(this.h), this.i);
            }
            switch (a2.a) {
                default: {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown cmd: ");
                    stringBuilder.append(a2.a);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                case 9: {
                    this.b.Z0(h2);
                    break;
                }
                case 8: {
                    this.b.Z0(null);
                    break;
                }
                case 7: {
                    h2.V0(a2.f);
                    this.b.r(h2);
                    break;
                }
                case 6: {
                    h2.V0(a2.e);
                    this.b.l(h2);
                    break;
                }
                case 5: {
                    h2.V0(a2.f);
                    this.b.s0(h2);
                    break;
                }
                case 4: {
                    h2.V0(a2.e);
                    this.b.c1(h2);
                    break;
                }
                case 3: {
                    h2.V0(a2.e);
                    this.b.i(h2, false);
                    break;
                }
                case 1: {
                    h2.V0(a2.f);
                    this.b.M0(h2);
                }
            }
            if (this.u || a2.a == 3 || h2 == null) continue;
            this.b.C0(h2);
        }
        if (!this.u && bl) {
            n n2 = this.b;
            n2.D0(n2.r, true);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    h h(ArrayList<h> arrayList, h h2) {
        h h3 = h2;
        int n2 = 0;
        do {
            block12 : {
                boolean bl;
                a a2;
                h h4;
                int n3;
                block13 : {
                    block9 : {
                        block10 : {
                            block11 : {
                                if (n2 >= this.c.size()) {
                                    return h3;
                                }
                                a2 = (a)this.c.get(n2);
                                int n4 = a2.a;
                                if (n4 == 1) break block9;
                                if (n4 == 2) break block10;
                                if (n4 == 3 || n4 == 6) break block11;
                                if (n4 == 7) break block9;
                                if (n4 == 8) {
                                    this.c.add(n2, (Object)new a(9, h3));
                                    ++n2;
                                    h3 = a2.b;
                                }
                                break block12;
                            }
                            arrayList.remove((Object)a2.b);
                            h h5 = a2.b;
                            if (h5 == h3) {
                                this.c.add(n2, (Object)new a(9, h5));
                                ++n2;
                                h3 = null;
                            }
                            break block12;
                        }
                        h4 = a2.b;
                        n3 = h4.y;
                        bl = false;
                        break block13;
                    }
                    arrayList.add((Object)a2.b);
                    break block12;
                }
                for (int i2 = arrayList.size() - 1; i2 >= 0; --i2) {
                    h h6 = (h)arrayList.get(i2);
                    if (h6.y != n3) continue;
                    if (h6 == h4) {
                        bl = true;
                        continue;
                    }
                    if (h6 == h3) {
                        this.c.add(n2, (Object)new a(9, h6));
                        ++n2;
                        h3 = null;
                    }
                    a a3 = new a(3, h6);
                    a3.c = a2.c;
                    a3.e = a2.e;
                    a3.d = a2.d;
                    a3.f = a2.f;
                    this.c.add(n2, (Object)a3);
                    arrayList.remove((Object)h6);
                    ++n2;
                }
                if (bl) {
                    this.c.remove(n2);
                    --n2;
                } else {
                    a2.a = 1;
                    arrayList.add((Object)h4);
                }
            }
            ++n2;
        } while (true);
    }

    public String i() {
        return this.l;
    }

    boolean j(int n2) {
        int n3 = this.c.size();
        for (int i2 = 0; i2 < n3; ++i2) {
            h h2 = ((a)this.c.get((int)i2)).b;
            int n4 = h2 != null ? h2.y : 0;
            if (n4 == 0 || n4 != n2) continue;
            return true;
        }
        return false;
    }

    boolean k(ArrayList<c> arrayList, int n2, int n3) {
        if (n3 == n2) {
            return false;
        }
        int n4 = this.c.size();
        int n5 = -1;
        for (int i2 = 0; i2 < n4; ++i2) {
            h h2 = ((a)this.c.get((int)i2)).b;
            int n6 = h2 != null ? h2.y : 0;
            if (n6 == 0 || n6 == n5) continue;
            for (int i3 = n2; i3 < n3; ++i3) {
                c c2 = (c)arrayList.get(i3);
                int n7 = c2.c.size();
                for (int i4 = 0; i4 < n7; ++i4) {
                    h h3 = ((a)c2.c.get((int)i4)).b;
                    int n8 = h3 != null ? h3.y : 0;
                    if (n8 != n6) continue;
                    return true;
                }
            }
            n5 = n6;
        }
        return false;
    }

    boolean m() {
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            if (!c.l((a)this.c.get(i2))) continue;
            return true;
        }
        return false;
    }

    public void n() {
        ArrayList<Runnable> arrayList = this.v;
        if (arrayList != null) {
            int n2 = arrayList.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                ((Runnable)this.v.get(i2)).run();
            }
            this.v = null;
        }
    }

    void o(h.e e2) {
        for (int i2 = 0; i2 < this.c.size(); ++i2) {
            a a2 = (a)this.c.get(i2);
            if (!c.l(a2)) continue;
            a2.b.X0(e2);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    h p(ArrayList<h> var1_1, h var2_2) {
        var3_3 = 0;
        while (var3_3 < this.c.size()) {
            block7 : {
                var4_4 = (a)this.c.get(var3_3);
                var5_5 = var4_4.a;
                if (var5_5 == 1) break block7;
                if (var5_5 == 3) ** GOTO lbl-1000
                switch (var5_5) {
                    default: {
                        ** break;
                    }
                    case 9: {
                        var2_2 = var4_4.b;
                        ** break;
                    }
                    case 8: {
                        var2_2 = null;
                        ** break;
                    }
                    case 6: lbl-1000: // 2 sources:
                    {
                        var1_1.add((Object)var4_4.b);
                        ** break;
                    }
                    case 7: 
                }
            }
            var1_1.remove((Object)var4_4.b);
lbl22: // 5 sources:
            ++var3_3;
        }
        return var2_2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("BackStackEntry{");
        stringBuilder.append(Integer.toHexString((int)System.identityHashCode((Object)this)));
        if (this.n >= 0) {
            stringBuilder.append(" #");
            stringBuilder.append(this.n);
        }
        if (this.l != null) {
            stringBuilder.append(" ");
            stringBuilder.append(this.l);
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    static final class a {
        int a;
        h b;
        int c;
        int d;
        int e;
        int f;

        a() {
        }

        a(int n2, h h2) {
            this.a = n2;
            this.b = h2;
        }
    }

}

