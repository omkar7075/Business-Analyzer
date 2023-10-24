/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  java.lang.Object
 */
package a.b.d.i;

import android.view.View;
import android.view.ViewGroup;

public class m {
    private final ViewGroup a;
    private int b;

    public m(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public int a() {
        return this.b;
    }

    public void b(View view, View view2, int n2) {
        this.c(view, view2, n2, 0);
    }

    public void c(View view, View view2, int n2, int n3) {
        this.b = n2;
    }

    public void d(View view) {
        this.e(view, 0);
    }

    public void e(View view, int n2) {
        this.b = 0;
    }
}

