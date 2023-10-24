/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.Object
 *  java.lang.String
 */
package a.b.d.a;

import a.b.d.a.h;
import a.b.d.a.j;
import a.b.d.a.l;
import a.b.d.a.m;
import a.b.d.a.n;
import a.b.d.a.o;
import a.b.d.a.u;
import a.b.d.h.p;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class k {
    private final l<?> a;

    private k(l<?> l2) {
        this.a = l2;
    }

    public static final k b(l<?> l2) {
        return new k(l2);
    }

    public void A() {
        this.a.e.G0();
    }

    public View B(View view, String string, Context context, AttributeSet attributeSet) {
        return this.a.e.onCreateView(view, string, context, attributeSet);
    }

    public void C() {
        this.a.v();
    }

    public void D(Parcelable parcelable, o o2) {
        this.a.e.P0(parcelable, o2);
    }

    public void E(p<String, u> p2) {
        this.a.w(p2);
    }

    public p<String, u> F() {
        return this.a.x();
    }

    public o G() {
        return this.a.e.Q0();
    }

    public Parcelable H() {
        return this.a.e.S0();
    }

    public void a(h h2) {
        l<?> l2 = this.a;
        l2.e.k(l2, l2, h2);
    }

    public void c() {
        this.a.e.s();
    }

    public void d(Configuration configuration) {
        this.a.e.t(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.a.e.u(menuItem);
    }

    public void f() {
        this.a.e.v();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.a.e.w(menu, menuInflater);
    }

    public void h() {
        this.a.e.x();
    }

    public void i() {
        this.a.e.z();
    }

    public void j(boolean bl) {
        this.a.e.A(bl);
    }

    public boolean k(MenuItem menuItem) {
        return this.a.e.P(menuItem);
    }

    public void l(Menu menu) {
        this.a.e.Q(menu);
    }

    public void m() {
        this.a.e.R();
    }

    public void n(boolean bl) {
        this.a.e.S(bl);
    }

    public boolean o(Menu menu) {
        return this.a.e.T(menu);
    }

    public void p() {
        this.a.e.U();
    }

    public void q() {
        this.a.e.V();
    }

    public void r() {
        this.a.e.W();
    }

    public void s() {
        this.a.e.Y();
    }

    public void t() {
        this.a.d();
    }

    public void u() {
        this.a.e();
    }

    public void v(boolean bl) {
        this.a.f(bl);
    }

    public void w(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
        this.a.g(string, fileDescriptor, printWriter, arrstring);
    }

    public boolean x() {
        return this.a.e.d0();
    }

    public h y(String string) {
        return this.a.e.j0(string);
    }

    public m z() {
        return this.a.j();
    }
}

