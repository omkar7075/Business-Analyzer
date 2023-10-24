/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnPreDrawListener
 *  java.lang.Object
 *  java.lang.Runnable
 */
package a.b.d.a;

import android.view.View;
import android.view.ViewTreeObserver;

class x
implements ViewTreeObserver.OnPreDrawListener,
View.OnAttachStateChangeListener {
    private final View a;
    private ViewTreeObserver b;
    private final Runnable c;

    private x(View view, Runnable runnable) {
        this.a = view;
        this.b = view.getViewTreeObserver();
        this.c = runnable;
    }

    public static x a(View view, Runnable runnable) {
        x x2 = new x(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)x2);
        view.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)x2);
        return x2;
    }

    public void b() {
        ViewTreeObserver viewTreeObserver = this.b.isAlive() ? this.b : this.a.getViewTreeObserver();
        viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
        this.a.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
    }

    public boolean onPreDraw() {
        this.b();
        this.c.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.b = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        this.b();
    }
}

