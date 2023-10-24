/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package a.b.d.a;

import a.b.d.a.h;
import a.b.d.a.j;
import a.b.d.a.l;
import a.b.d.a.n;
import a.b.d.a.o;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

final class q
implements Parcelable {
    public static final Parcelable.Creator<q> CREATOR = new Parcelable.Creator<q>(){

        public q a(Parcel parcel) {
            return new q(parcel);
        }

        public q[] b(int n2) {
            return new q[n2];
        }
    };
    final String a;
    final int b;
    final boolean c;
    final int d;
    final int e;
    final String f;
    final boolean g;
    final boolean h;
    final Bundle i;
    final boolean j;
    Bundle k;
    h l;

    public q(h h2) {
        this.a = h2.getClass().getName();
        this.b = h2.f;
        this.c = h2.n;
        this.d = h2.x;
        this.e = h2.y;
        this.f = h2.z;
        this.g = h2.C;
        this.h = h2.B;
        this.i = h2.h;
        this.j = h2.A;
    }

    public q(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
        int n2 = parcel.readInt();
        boolean bl = true;
        boolean bl2 = n2 != 0;
        this.c = bl2;
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        boolean bl3 = parcel.readInt() != 0;
        this.g = bl3;
        boolean bl4 = parcel.readInt() != 0;
        this.h = bl4;
        this.i = parcel.readBundle();
        if (parcel.readInt() == 0) {
            bl = false;
        }
        this.j = bl;
        this.k = parcel.readBundle();
    }

    public h a(l l2, j j2, h h2, o o2) {
        if (this.l == null) {
            Context context = l2.i();
            Bundle bundle = this.i;
            if (bundle != null) {
                bundle.setClassLoader(context.getClassLoader());
            }
            h h3 = j2 != null ? j2.a(context, this.a, this.i) : h.D(context, this.a, this.i);
            this.l = h3;
            Bundle bundle2 = this.k;
            if (bundle2 != null) {
                bundle2.setClassLoader(context.getClassLoader());
                this.l.d = this.k;
            }
            this.l.U0(this.b, h2);
            h h4 = this.l;
            h4.n = this.c;
            h4.p = true;
            h4.x = this.d;
            h4.y = this.e;
            h4.z = this.f;
            h4.C = this.g;
            h4.B = this.h;
            h4.A = this.j;
            h4.s = l2.e;
            if (n.a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Instantiated fragment ");
                stringBuilder.append((Object)this.l);
                Log.v((String)"FragmentManager", (String)stringBuilder.toString());
            }
        }
        h h5 = this.l;
        h5.v = o2;
        return h5;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt((int)this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt((int)this.g);
        parcel.writeInt((int)this.h);
        parcel.writeBundle(this.i);
        parcel.writeInt((int)this.j);
        parcel.writeBundle(this.k);
    }

}

