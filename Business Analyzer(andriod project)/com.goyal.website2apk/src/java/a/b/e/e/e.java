/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.support.v7.view.menu.h
 *  android.support.v7.view.menu.h$a
 *  android.support.v7.widget.ActionBarContextView
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ref.WeakReference
 */
package a.b.e.e;

import a.b.e.e.b;
import a.b.e.e.g;
import android.content.Context;
import android.support.v7.view.menu.h;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public class e
extends b
implements h.a {
    private Context c;
    private ActionBarContextView d;
    private b.a e;
    private WeakReference<View> f;
    private boolean g;
    private boolean h;
    private h i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a a2, boolean bl) {
        h h2;
        this.c = context;
        this.d = actionBarContextView;
        this.e = a2;
        this.i = h2 = new h(actionBarContextView.getContext()).V(1);
        h2.U((h.a)this);
        this.h = bl;
    }

    public void a(h h2) {
        this.k();
        this.d.l();
    }

    public boolean b(h h2, MenuItem menuItem) {
        return this.e.b(this, menuItem);
    }

    @Override
    public void c() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.d.sendAccessibilityEvent(32);
        this.e.a(this);
    }

    @Override
    public View d() {
        WeakReference<View> weakReference = this.f;
        if (weakReference != null) {
            return (View)weakReference.get();
        }
        return null;
    }

    @Override
    public Menu e() {
        return this.i;
    }

    @Override
    public MenuInflater f() {
        return new g(this.d.getContext());
    }

    @Override
    public CharSequence g() {
        return this.d.getSubtitle();
    }

    @Override
    public CharSequence i() {
        return this.d.getTitle();
    }

    @Override
    public void k() {
        this.e.c(this, (Menu)this.i);
    }

    @Override
    public boolean l() {
        return this.d.j();
    }

    @Override
    public void m(View view) {
        this.d.setCustomView(view);
        WeakReference weakReference = view != null ? new WeakReference((Object)view) : null;
        this.f = weakReference;
    }

    @Override
    public void n(int n2) {
        this.o(this.c.getString(n2));
    }

    @Override
    public void o(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override
    public void q(int n2) {
        this.r(this.c.getString(n2));
    }

    @Override
    public void r(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override
    public void s(boolean bl) {
        super.s(bl);
        this.d.setTitleOptional(bl);
    }
}

