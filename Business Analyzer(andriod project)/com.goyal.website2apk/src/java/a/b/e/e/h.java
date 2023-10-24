/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.animation.Interpolator
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Iterator
 */
package a.b.e.e;

import a.b.d.i.t;
import a.b.d.i.u;
import a.b.d.i.v;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public class h {
    final ArrayList<t> a = new ArrayList();
    private long b = -1L;
    private Interpolator c;
    u d;
    private boolean e;
    private final v f = new v(){
        private boolean a = false;
        private int b = 0;

        @Override
        public void a(View view) {
            int n2;
            this.b = n2 = 1 + this.b;
            if (n2 == h.this.a.size()) {
                u u2 = h.this.d;
                if (u2 != null) {
                    u2.a(null);
                }
                this.d();
            }
        }

        @Override
        public void b(View view) {
            if (this.a) {
                return;
            }
            this.a = true;
            u u2 = h.this.d;
            if (u2 != null) {
                u2.b(null);
            }
        }

        void d() {
            this.b = 0;
            this.a = false;
            h.this.b();
        }
    };

    public void a() {
        if (!this.e) {
            return;
        }
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((t)iterator.next()).b();
        }
        this.e = false;
    }

    void b() {
        this.e = false;
    }

    public h c(t t2) {
        if (!this.e) {
            this.a.add((Object)t2);
        }
        return this;
    }

    public h d(t t2, t t3) {
        this.a.add((Object)t2);
        t3.h(t2.c());
        this.a.add((Object)t3);
        return this;
    }

    public h e(long l2) {
        if (!this.e) {
            this.b = l2;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.e) {
            this.c = interpolator;
        }
        return this;
    }

    public h g(u u2) {
        if (!this.e) {
            this.d = u2;
        }
        return this;
    }

    public void h() {
        if (this.e) {
            return;
        }
        for (t t2 : this.a) {
            Interpolator interpolator;
            long l2 = this.b;
            if (l2 >= 0L) {
                t2.d(l2);
            }
            if ((interpolator = this.c) != null) {
                t2.e(interpolator);
            }
            if (this.d != null) {
                t2.f(this.f);
            }
            t2.j();
        }
        this.e = true;
    }

}

