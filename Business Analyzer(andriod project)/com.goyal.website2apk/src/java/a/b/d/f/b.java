/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.IBinder
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.Runnable
 */
package a.b.d.f;

import a.b.d.f.a;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public class b
implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>(){

        public b a(Parcel parcel) {
            return new b(parcel);
        }

        public b[] b(int n2) {
            return new b[n2];
        }
    };
    final boolean a = false;
    final Handler b = null;
    a.b.d.f.a c;

    b(Parcel parcel) {
        this.c = a.a.o(parcel.readStrongBinder());
    }

    protected void a(int n2, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void writeToParcel(Parcel parcel, int n2) {
        b b2 = this;
        synchronized (b2) {
            if (this.c == null) {
                this.c = new b();
            }
            parcel.writeStrongBinder(this.c.asBinder());
            return;
        }
    }

    class b
    extends a.a {
        b() {
        }

        @Override
        public void m(int n2, Bundle bundle) {
            b b2 = b.this;
            Handler handler = b2.b;
            if (handler != null) {
                handler.post((Runnable)b2.new c(n2, bundle));
                return;
            }
            b2.a(n2, bundle);
        }
    }

    class c
    implements Runnable {
        final int a;
        final Bundle b;

        c(int n2, Bundle bundle) {
            this.a = n2;
            this.b = bundle;
        }

        public void run() {
            b.this.a(this.a, this.b);
        }
    }

}

