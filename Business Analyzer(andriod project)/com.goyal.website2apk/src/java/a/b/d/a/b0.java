/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.Log
 *  java.lang.Deprecated
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 */
package a.b.d.a;

import a.b.d.a.w;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class b0
implements Iterable<Intent> {
    private static final c a;
    private final ArrayList<Intent> b = new ArrayList();
    private final Context c;

    static {
        c c2 = Build.VERSION.SDK_INT >= 16 ? new b() : new c();
        a = c2;
    }

    private b0(Context context) {
        this.c = context;
    }

    public static b0 d(Context context) {
        return new b0(context);
    }

    public b0 a(Intent intent) {
        this.b.add((Object)intent);
        return this;
    }

    public b0 b(Activity activity) {
        Intent intent = activity instanceof a ? ((a)activity).f() : null;
        if (intent == null) {
            intent = w.a(activity);
        }
        if (intent != null) {
            ComponentName componentName = intent.getComponent();
            if (componentName == null) {
                componentName = intent.resolveActivity(this.c.getPackageManager());
            }
            this.c(componentName);
            this.a(intent);
        }
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public b0 c(ComponentName componentName) {
        int n2 = this.b.size();
        try {
            Intent intent;
            Context context = this.c;
            while ((intent = w.b(context, componentName)) != null) {
                this.b.add(n2, (Object)intent);
                context = this.c;
                componentName = intent.getComponent();
            }
            return this;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            Log.e((String)"TaskStackBuilder", (String)"Bad ComponentName while traversing activity parent metadata");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((Throwable)nameNotFoundException);
            throw illegalArgumentException;
        }
    }

    public void e() {
        this.f(null);
    }

    public void f(Bundle bundle) {
        if (!this.b.isEmpty()) {
            ArrayList<Intent> arrayList = this.b;
            Intent[] arrintent = (Intent[])arrayList.toArray((Object[])new Intent[arrayList.size()]);
            arrintent[0] = new Intent(arrintent[0]).addFlags(268484608);
            if (!a.b.d.b.a.d(this.c, arrintent, bundle)) {
                Intent intent = new Intent(arrintent[-1 + arrintent.length]);
                intent.addFlags(268435456);
                this.c.startActivity(intent);
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.b.iterator();
    }

    public static interface a {
        public Intent f();
    }

    static class b
    extends c {
        b() {
        }
    }

    static class c {
        c() {
        }
    }

}

