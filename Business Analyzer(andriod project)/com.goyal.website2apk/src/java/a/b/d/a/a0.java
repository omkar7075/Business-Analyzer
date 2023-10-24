/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.arch.lifecycle.a
 *  android.arch.lifecycle.a$b
 *  android.arch.lifecycle.b
 *  android.arch.lifecycle.c
 *  android.arch.lifecycle.f
 *  android.os.Bundle
 *  java.lang.Class
 */
package a.b.d.a;

import a.b.d.h.p;
import android.app.Activity;
import android.arch.lifecycle.a;
import android.arch.lifecycle.b;
import android.arch.lifecycle.c;
import android.arch.lifecycle.f;
import android.os.Bundle;

public class a0
extends Activity
implements b {
    private p<Class<?>, ?> a = new p();
    private c b = new c((b)this);

    public a a() {
        return this.b;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f.e((Activity)this);
    }

    protected void onSaveInstanceState(Bundle bundle) {
        this.b.g(a.b.c);
        super.onSaveInstanceState(bundle);
    }
}

