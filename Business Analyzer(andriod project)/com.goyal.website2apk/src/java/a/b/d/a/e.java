/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.util.AttributeSet
 *  android.view.View
 *  java.lang.IllegalArgumentException
 *  java.lang.String
 */
package a.b.d.a;

import a.b.d.a.a0;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.util.AttributeSet;
import android.view.View;

abstract class e
extends a0 {
    boolean c;

    e() {
    }

    static void h(int n2) {
        if ((n2 & -65536) == 0) {
            return;
        }
        throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
    }

    abstract View i(View var1, String var2, Context var3, AttributeSet var4);

    public View onCreateView(View view, String string, Context context, AttributeSet attributeSet) {
        View view2 = this.i(view, string, context, attributeSet);
        if (view2 == null) {
            return Activity.super.onCreateView(view, string, context, attributeSet);
        }
        return view2;
    }

    public View onCreateView(String string, Context context, AttributeSet attributeSet) {
        View view = this.i(null, string, context, attributeSet);
        if (view == null) {
            return Activity.super.onCreateView(string, context, attributeSet);
        }
        return view;
    }

    public void startIntentSenderForResult(IntentSender intentSender, int n2, Intent intent, int n3, int n4, int n5) {
        if (!this.c && n2 != -1) {
            e.h(n2);
        }
        Activity.super.startIntentSenderForResult(intentSender, n2, intent, n3, n4, n5);
    }
}

