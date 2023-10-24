/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  android.view.View
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package a.b.d.i;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class c {
    private final Context a;
    private a b;
    private b c;

    public c(Context context) {
        this.a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return this.c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.c = null;
        this.b = null;
    }

    public void i(a a2) {
        this.b = a2;
    }

    public void j(b b2) {
        if (this.c != null && b2 != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            stringBuilder.append(this.getClass().getSimpleName());
            stringBuilder.append(" instance while it is still in use somewhere else?");
            Log.w((String)"ActionProvider(support)", (String)stringBuilder.toString());
        }
        this.c = b2;
    }

    public static interface a {
    }

    public static interface b {
        public void onActionProviderVisibilityChanged(boolean var1);
    }

}

