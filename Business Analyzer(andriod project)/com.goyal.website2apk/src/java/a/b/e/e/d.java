/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.AssetManager
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.LayoutInflater
 *  java.lang.Object
 *  java.lang.String
 */
package a.b.e.e;

import a.b.e.a.i;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;

public class d
extends ContextWrapper {
    private int a;
    private Resources.Theme b;
    private LayoutInflater c;
    private Configuration d;
    private Resources e;

    public d() {
        super(null);
    }

    public d(Context context, int n2) {
        super(context);
        this.a = n2;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.b = theme;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Resources a() {
        Resources resources;
        if (this.e != null) return this.e;
        Configuration configuration = this.d;
        if (configuration == null) {
            resources = super.getResources();
        } else {
            if (Build.VERSION.SDK_INT < 17) return this.e;
            resources = this.createConfigurationContext(configuration).getResources();
        }
        this.e = resources;
        return this.e;
    }

    private void c() {
        boolean bl = this.b == null;
        if (bl) {
            this.b = this.getResources().newTheme();
            Resources.Theme theme = this.getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.d(this.b, this.a, bl);
    }

    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int b() {
        return this.a;
    }

    protected void d(Resources.Theme theme, int n2, boolean bl) {
        theme.applyStyle(n2, true);
    }

    public AssetManager getAssets() {
        return this.getResources().getAssets();
    }

    public Resources getResources() {
        return this.a();
    }

    public Object getSystemService(String string) {
        if ("layout_inflater".equals((Object)string)) {
            if (this.c == null) {
                this.c = LayoutInflater.from((Context)this.getBaseContext()).cloneInContext((Context)this);
            }
            return this.c;
        }
        return this.getBaseContext().getSystemService(string);
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = i.d;
        }
        this.c();
        return this.b;
    }

    public void setTheme(int n2) {
        if (this.a != n2) {
            this.a = n2;
            this.c();
        }
    }
}

