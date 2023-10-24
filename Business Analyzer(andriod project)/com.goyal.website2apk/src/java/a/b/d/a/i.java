/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.arch.lifecycle.a
 *  android.arch.lifecycle.a$b
 *  android.arch.lifecycle.c
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.content.res.Configuration
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Message
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.Window
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.Deprecated
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.List
 */
package a.b.d.a;

import a.b.d.a.a0;
import a.b.d.a.e;
import a.b.d.a.f;
import a.b.d.a.h;
import a.b.d.a.k;
import a.b.d.a.l;
import a.b.d.a.m;
import a.b.d.a.o;
import a.b.d.a.u;
import a.b.d.h.p;
import a.b.d.h.q;
import android.app.Activity;
import android.arch.lifecycle.a;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public class i
extends f {
    final Handler e = new Handler(){

        public void handleMessage(Message message) {
            int n2 = message.what;
            if (n2 != 1) {
                if (n2 != 2) {
                    super.handleMessage(message);
                    return;
                }
                i.this.p();
                i.this.f.x();
                return;
            }
            i i2 = i.this;
            if (i2.i) {
                i2.j(false);
            }
        }
    };
    final k f = k.b(new b());
    boolean g;
    boolean h;
    boolean i = true;
    boolean j = true;
    boolean k;
    int l;
    q<String> m;

    private static void l(m m2, a.b b2) {
        for (h h2 : m2.b()) {
            if (h2 == null) continue;
            h2.V.g(b2);
            i.l(h2.l(), b2);
        }
    }

    @Override
    public android.arch.lifecycle.a a() {
        return a0.super.a();
    }

    public void dump(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
        Activity.super.dump(string, fileDescriptor, printWriter, arrstring);
        printWriter.print(string);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString((int)System.identityHashCode((Object)((Object)this))));
        printWriter.println(" State:");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("  ");
        String string2 = stringBuilder.toString();
        printWriter.print(string2);
        printWriter.print("mCreated=");
        printWriter.print(this.g);
        printWriter.print("mResumed=");
        printWriter.print(this.h);
        printWriter.print(" mStopped=");
        printWriter.print(this.i);
        printWriter.print(" mReallyStopped=");
        printWriter.println(this.j);
        this.f.w(string2, fileDescriptor, printWriter, arrstring);
        this.f.z().a(string, fileDescriptor, printWriter, arrstring);
    }

    @Override
    final View i(View view, String string, Context context, AttributeSet attributeSet) {
        return this.f.B(view, string, context, attributeSet);
    }

    void j(boolean bl) {
        if (!this.j) {
            this.j = true;
            this.k = bl;
            this.e.removeMessages(1);
            this.o();
            return;
        }
        if (bl) {
            this.f.u();
            this.f.v(true);
        }
    }

    public m k() {
        return this.f.z();
    }

    public void m(h h2) {
    }

    protected boolean n(View view, Menu menu) {
        return Activity.super.onPreparePanel(0, view, menu);
    }

    void o() {
        this.f.v(this.k);
        this.f.p();
    }

    protected void onActivityResult(int n2, int n3, Intent intent) {
        this.f.A();
        int n4 = n2 >> 16;
        if (n4 != 0) {
            int n5 = n4 - 1;
            String string = this.m.f(n5);
            this.m.j(n5);
            if (string == null) {
                Log.w((String)"FragmentActivity", (String)"Activity result delivered for unknown Fragment.");
                return;
            }
            h h2 = this.f.y(string);
            if (h2 == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Activity result no fragment exists for who: ");
                stringBuilder.append(string);
                Log.w((String)"FragmentActivity", (String)stringBuilder.toString());
                return;
            }
            h2.M(n2 & 65535, n3, intent);
            return;
        }
        Activity.super.onActivityResult(n2, n3, intent);
    }

    public void onBackPressed() {
        m m2 = this.f.z();
        boolean bl = m2.c();
        if (bl && Build.VERSION.SDK_INT <= 25) {
            return;
        }
        if (bl || !m2.d()) {
            Activity.super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        Activity.super.onConfigurationChanged(configuration);
        this.f.d(configuration);
    }

    @Override
    protected void onCreate(Bundle bundle) {
        this.f.a(null);
        a0.super.onCreate(bundle);
        c c2 = (c)this.getLastNonConfigurationInstance();
        if (c2 != null) {
            this.f.E(c2.c);
        }
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            k k2 = this.f;
            o o2 = null;
            if (c2 != null) {
                o2 = c2.b;
            }
            k2.D(parcelable, o2);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.l = bundle.getInt("android:support:next_request_index");
                int[] arrn = bundle.getIntArray("android:support:request_indicies");
                String[] arrstring = bundle.getStringArray("android:support:request_fragment_who");
                if (arrn != null && arrstring != null && arrn.length == arrstring.length) {
                    this.m = new q(arrn.length);
                    for (int i2 = 0; i2 < arrn.length; ++i2) {
                        this.m.i(arrn[i2], arrstring[i2]);
                    }
                } else {
                    Log.w((String)"FragmentActivity", (String)"Invalid requestCode mapping in savedInstanceState.");
                }
            }
        }
        if (this.m == null) {
            this.m = new q();
            this.l = 0;
        }
        this.f.f();
    }

    public boolean onCreatePanelMenu(int n2, Menu menu) {
        if (n2 == 0) {
            return Activity.super.onCreatePanelMenu(n2, menu) | this.f.g(menu, this.getMenuInflater());
        }
        return Activity.super.onCreatePanelMenu(n2, menu);
    }

    protected void onDestroy() {
        Activity.super.onDestroy();
        this.j(false);
        this.f.h();
        this.f.t();
    }

    public void onLowMemory() {
        Activity.super.onLowMemory();
        this.f.i();
    }

    public boolean onMenuItemSelected(int n2, MenuItem menuItem) {
        if (Activity.super.onMenuItemSelected(n2, menuItem)) {
            return true;
        }
        if (n2 != 0) {
            if (n2 != 6) {
                return false;
            }
            return this.f.e(menuItem);
        }
        return this.f.k(menuItem);
    }

    public void onMultiWindowModeChanged(boolean bl) {
        this.f.j(bl);
    }

    protected void onNewIntent(Intent intent) {
        Activity.super.onNewIntent(intent);
        this.f.A();
    }

    public void onPanelClosed(int n2, Menu menu) {
        if (n2 == 0) {
            this.f.l(menu);
        }
        Activity.super.onPanelClosed(n2, menu);
    }

    protected void onPause() {
        Activity.super.onPause();
        this.h = false;
        if (this.e.hasMessages(2)) {
            this.e.removeMessages(2);
            this.p();
        }
        this.f.m();
    }

    public void onPictureInPictureModeChanged(boolean bl) {
        this.f.n(bl);
    }

    protected void onPostResume() {
        Activity.super.onPostResume();
        this.e.removeMessages(2);
        this.p();
        this.f.x();
    }

    public boolean onPreparePanel(int n2, View view, Menu menu) {
        if (n2 == 0 && menu != null) {
            return this.n(view, menu) | this.f.o(menu);
        }
        return Activity.super.onPreparePanel(n2, view, menu);
    }

    public void onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        int n3 = 65535 & n2 >> 16;
        if (n3 != 0) {
            int n4 = n3 - 1;
            String string = this.m.f(n4);
            this.m.j(n4);
            if (string == null) {
                Log.w((String)"FragmentActivity", (String)"Activity result delivered for unknown Fragment.");
                return;
            }
            h h2 = this.f.y(string);
            if (h2 == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Activity result no fragment exists for who: ");
                stringBuilder.append(string);
                Log.w((String)"FragmentActivity", (String)stringBuilder.toString());
                return;
            }
            h2.k0(n2 & 65535, arrstring, arrn);
        }
    }

    protected void onResume() {
        Activity.super.onResume();
        this.e.sendEmptyMessage(2);
        this.h = true;
        this.f.x();
    }

    public final Object onRetainNonConfigurationInstance() {
        if (this.i) {
            this.j(true);
        }
        Object object = this.q();
        o o2 = this.f.G();
        p<String, u> p2 = this.f.F();
        if (o2 == null && p2 == null && object == null) {
            return null;
        }
        c c2 = new c();
        c2.a = object;
        c2.b = o2;
        c2.c = p2;
        return c2;
    }

    @Override
    protected void onSaveInstanceState(Bundle bundle) {
        a0.super.onSaveInstanceState(bundle);
        i.l(this.k(), a.b.c);
        Parcelable parcelable = this.f.H();
        if (parcelable != null) {
            bundle.putParcelable("android:support:fragments", parcelable);
        }
        if (this.m.k() > 0) {
            bundle.putInt("android:support:next_request_index", this.l);
            int[] arrn = new int[this.m.k()];
            String[] arrstring = new String[this.m.k()];
            for (int i2 = 0; i2 < this.m.k(); ++i2) {
                arrn[i2] = this.m.h(i2);
                arrstring[i2] = this.m.l(i2);
            }
            bundle.putIntArray("android:support:request_indicies", arrn);
            bundle.putStringArray("android:support:request_fragment_who", arrstring);
        }
    }

    protected void onStart() {
        Activity.super.onStart();
        this.i = false;
        this.j = false;
        this.e.removeMessages(1);
        if (!this.g) {
            this.g = true;
            this.f.c();
        }
        this.f.A();
        this.f.x();
        this.f.u();
        this.f.r();
        this.f.C();
    }

    public void onStateNotSaved() {
        this.f.A();
    }

    protected void onStop() {
        Activity.super.onStop();
        this.i = true;
        i.l(this.k(), a.b.c);
        this.e.sendEmptyMessage(1);
        this.f.s();
    }

    protected void p() {
        this.f.q();
    }

    public Object q() {
        return null;
    }

    @Deprecated
    public void r() {
        this.invalidateOptionsMenu();
    }

    public void startActivityForResult(Intent intent, int n2) {
        if (!this.d && n2 != -1) {
            e.h(n2);
        }
        Activity.super.startActivityForResult(intent, n2);
    }

    class b
    extends l<i> {
        public b() {
            super(i.this);
        }

        @Override
        public View b(int n2) {
            return i.this.findViewById(n2);
        }

        @Override
        public boolean c() {
            Window window = i.this.getWindow();
            return window != null && window.peekDecorView() != null;
        }

        @Override
        public void o(h h2) {
            i.this.m(h2);
        }

        @Override
        public void p(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
            i.this.dump(string, fileDescriptor, printWriter, arrstring);
        }

        @Override
        public LayoutInflater q() {
            return i.this.getLayoutInflater().cloneInContext((Context)i.this);
        }

        @Override
        public int r() {
            Window window = i.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override
        public boolean s() {
            return i.this.getWindow() != null;
        }

        @Override
        public boolean t(h h2) {
            return true ^ i.this.isFinishing();
        }

        @Override
        public void u() {
            i.this.r();
        }
    }

    static final class c {
        Object a;
        o b;
        p<String, u> c;

        c() {
        }
    }

}

