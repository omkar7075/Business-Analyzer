/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Binder
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 *  java.lang.String
 */
package a.b.d.f;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public interface a
extends IInterface {
    public void m(int var1, Bundle var2);

    public static abstract class a.b.d.f.a$a
    extends Binder
    implements a.b.d.f.a {
        public a.b.d.f.a$a() {
            this.attachInterface((IInterface)this, "android.support.v4.os.IResultReceiver");
        }

        public static a.b.d.f.a o(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterface = iBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            if (iInterface != null && iInterface instanceof a.b.d.f.a) {
                return (a.b.d.f.a)iInterface;
            }
            return new a(iBinder);
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int n2, Parcel parcel, Parcel parcel2, int n3) {
            if (n2 != 1) {
                if (n2 != 1598968902) {
                    return super.onTransact(n2, parcel, parcel2, n3);
                }
                parcel2.writeString("android.support.v4.os.IResultReceiver");
                return true;
            }
            parcel.enforceInterface("android.support.v4.os.IResultReceiver");
            int n4 = parcel.readInt();
            Bundle bundle = parcel.readInt() != 0 ? (Bundle)Bundle.CREATOR.createFromParcel(parcel) : null;
            this.m(n4, bundle);
            return true;
        }

        private static class a
        implements a.b.d.f.a {
            private IBinder a;

            a(IBinder iBinder) {
                this.a = iBinder;
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

    }

}

