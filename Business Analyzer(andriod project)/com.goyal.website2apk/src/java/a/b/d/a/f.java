/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.os.Bundle
 */
package a.b.d.a;

import a.b.d.a.e;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

abstract class f
extends e {
    boolean d;

    f() {
    }

    public void startActivityForResult(Intent intent, int n2, Bundle bundle) {
        if (!this.d && n2 != -1) {
            e.h(n2);
        }
        Activity.super.startActivityForResult(intent, n2, bundle);
    }

    public void startIntentSenderForResult(IntentSender intentSender, int n2, Intent intent, int n3, int n4, int n5, Bundle bundle) {
        if (!this.c && n2 != -1) {
            e.h(n2);
        }
        Activity.super.startIntentSenderForResult(intentSender, n2, intent, n3, n4, n5, bundle);
    }
}

