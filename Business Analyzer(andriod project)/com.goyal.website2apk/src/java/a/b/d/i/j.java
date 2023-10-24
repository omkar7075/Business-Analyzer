/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewParent
 *  java.lang.Object
 */
package a.b.d.i;

import a.b.d.i.p;
import a.b.d.i.s;
import android.view.View;
import android.view.ViewParent;

public class j {
    private ViewParent a;
    private ViewParent b;
    private final View c;
    private boolean d;
    private int[] e;

    public j(View view) {
        this.c = view;
    }

    private ViewParent g(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                return null;
            }
            return this.b;
        }
        return this.a;
    }

    private void l(int n2, ViewParent viewParent) {
        if (n2 != 0) {
            if (n2 != 1) {
                return;
            }
            this.b = viewParent;
            return;
        }
        this.a = viewParent;
    }

    public boolean a(float f2, float f3, boolean bl) {
        ViewParent viewParent;
        if (this.j() && (viewParent = this.g(0)) != null) {
            return s.a(viewParent, this.c, f2, f3, bl);
        }
        return false;
    }

    public boolean b(float f2, float f3) {
        ViewParent viewParent;
        if (this.j() && (viewParent = this.g(0)) != null) {
            return s.b(viewParent, this.c, f2, f3);
        }
        return false;
    }

    public boolean c(int n2, int n3, int[] arrn, int[] arrn2) {
        return this.d(n2, n3, arrn, arrn2, 0);
    }

    public boolean d(int n2, int n3, int[] arrn, int[] arrn2, int n4) {
        boolean bl;
        block11 : {
            block13 : {
                int n5;
                ViewParent viewParent;
                int n6;
                block12 : {
                    boolean bl2 = this.j();
                    bl = false;
                    if (!bl2) break block11;
                    viewParent = this.g(n4);
                    if (viewParent == null) {
                        return false;
                    }
                    if (n2 != 0 || n3 != 0) break block12;
                    bl = false;
                    if (arrn2 != null) {
                        arrn2[0] = 0;
                        arrn2[1] = 0;
                        return false;
                    }
                    break block11;
                }
                if (arrn2 != null) {
                    this.c.getLocationInWindow(arrn2);
                    int n7 = arrn2[0];
                    int n8 = arrn2[1];
                    n6 = n7;
                    n5 = n8;
                } else {
                    n6 = 0;
                    n5 = 0;
                }
                if (arrn == null) {
                    if (this.e == null) {
                        this.e = new int[2];
                    }
                    arrn = this.e;
                }
                arrn[0] = 0;
                arrn[1] = 0;
                s.c(viewParent, this.c, n2, n3, arrn, n4);
                if (arrn2 != null) {
                    this.c.getLocationInWindow(arrn2);
                    arrn2[0] = arrn2[0] - n6;
                    arrn2[1] = arrn2[1] - n5;
                }
                if (arrn[0] != 0) break block13;
                int n9 = arrn[1];
                bl = false;
                if (n9 == 0) break block11;
            }
            bl = true;
        }
        return bl;
    }

    public boolean e(int n2, int n3, int n4, int n5, int[] arrn) {
        return this.f(n2, n3, n4, n5, arrn, 0);
    }

    public boolean f(int n2, int n3, int n4, int n5, int[] arrn, int n6) {
        if (this.j()) {
            ViewParent viewParent = this.g(n6);
            if (viewParent == null) {
                return false;
            }
            if (n2 == 0 && n3 == 0 && n4 == 0 && n5 == 0) {
                if (arrn != null) {
                    arrn[0] = 0;
                    arrn[1] = 0;
                    return false;
                }
            } else {
                int n7;
                int n8;
                if (arrn != null) {
                    this.c.getLocationInWindow(arrn);
                    int n9 = arrn[0];
                    int n10 = arrn[1];
                    n7 = n9;
                    n8 = n10;
                } else {
                    n7 = 0;
                    n8 = 0;
                }
                s.d(viewParent, this.c, n2, n3, n4, n5, n6);
                if (arrn != null) {
                    this.c.getLocationInWindow(arrn);
                    arrn[0] = arrn[0] - n7;
                    arrn[1] = arrn[1] - n8;
                }
                return true;
            }
        }
        return false;
    }

    public boolean h() {
        return this.i(0);
    }

    public boolean i(int n2) {
        return this.g(n2) != null;
    }

    public boolean j() {
        return this.d;
    }

    public void k(boolean bl) {
        if (this.d) {
            p.R(this.c);
        }
        this.d = bl;
    }

    public boolean m(int n2) {
        return this.n(n2, 0);
    }

    public boolean n(int n2, int n3) {
        if (this.i(n3)) {
            return true;
        }
        if (this.j()) {
            View view = this.c;
            for (ViewParent viewParent = this.c.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
                if (s.f(viewParent, view, this.c, n2, n3)) {
                    this.l(n3, viewParent);
                    s.e(viewParent, view, this.c, n2, n3);
                    return true;
                }
                if (!(viewParent instanceof View)) continue;
                view = (View)viewParent;
            }
        }
        return false;
    }

    public void o() {
        this.p(0);
    }

    public void p(int n2) {
        ViewParent viewParent = this.g(n2);
        if (viewParent != null) {
            s.g(viewParent, this.c, n2);
            this.l(n2, null);
        }
    }
}

