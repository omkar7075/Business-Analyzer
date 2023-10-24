/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.support.v7.view.menu.q
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.util.ArrayList
 */
package a.b.e.e;

import a.b.d.h.p;
import a.b.e.e.b;
import android.content.Context;
import android.support.v7.view.menu.q;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

public class f
extends ActionMode {
    final Context a;
    final b b;

    public f(Context context, b b2) {
        this.a = context;
        this.b = b2;
    }

    public void finish() {
        this.b.c();
    }

    public View getCustomView() {
        return this.b.d();
    }

    public Menu getMenu() {
        return q.a((Context)this.a, (a.b.d.d.a.a)((a.b.d.d.a.a)this.b.e()));
    }

    public MenuInflater getMenuInflater() {
        return this.b.f();
    }

    public CharSequence getSubtitle() {
        return this.b.g();
    }

    public Object getTag() {
        return this.b.h();
    }

    public CharSequence getTitle() {
        return this.b.i();
    }

    public boolean getTitleOptionalHint() {
        return this.b.j();
    }

    public void invalidate() {
        this.b.k();
    }

    public boolean isTitleOptional() {
        return this.b.l();
    }

    public void setCustomView(View view) {
        this.b.m(view);
    }

    public void setSubtitle(int n2) {
        this.b.n(n2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    public void setTag(Object object) {
        this.b.p(object);
    }

    public void setTitle(int n2) {
        this.b.q(n2);
    }

    public void setTitle(CharSequence charSequence) {
        this.b.r(charSequence);
    }

    public void setTitleOptionalHint(boolean bl) {
        this.b.s(bl);
    }

    public static class a
    implements b.a {
        final ActionMode.Callback a;
        final Context b;
        final ArrayList<f> c;
        final p<Menu, Menu> d;

        public a(Context context, ActionMode.Callback callback) {
            this.b = context;
            this.a = callback;
            this.c = new ArrayList();
            this.d = new p();
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.d.get((Object)menu);
            if (menu2 == null) {
                menu2 = q.a((Context)this.b, (a.b.d.d.a.a)((a.b.d.d.a.a)menu));
                this.d.put(menu, menu2);
            }
            return menu2;
        }

        @Override
        public void a(b b2) {
            this.a.onDestroyActionMode(this.e(b2));
        }

        @Override
        public boolean b(b b2, MenuItem menuItem) {
            return this.a.onActionItemClicked(this.e(b2), q.b((Context)this.b, (a.b.d.d.a.b)((a.b.d.d.a.b)menuItem)));
        }

        @Override
        public boolean c(b b2, Menu menu) {
            return this.a.onPrepareActionMode(this.e(b2), this.f(menu));
        }

        @Override
        public boolean d(b b2, Menu menu) {
            return this.a.onCreateActionMode(this.e(b2), this.f(menu));
        }

        public ActionMode e(b b2) {
            int n2 = this.c.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                f f2 = (f)((Object)this.c.get(i2));
                if (f2 == null || f2.b != b2) continue;
                return f2;
            }
            f f3 = new f(this.b, b2);
            this.c.add((Object)f3);
            return f3;
        }
    }

}

