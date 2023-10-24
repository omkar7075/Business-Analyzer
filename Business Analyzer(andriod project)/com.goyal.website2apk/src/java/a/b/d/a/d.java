/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 *  android.util.Log
 *  android.util.SparseArray
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 */
package a.b.d.a;

import a.b.d.a.c;
import a.b.d.a.h;
import a.b.d.a.n;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

final class d
implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>(){

        public d a(Parcel parcel) {
            return new d(parcel);
        }

        public d[] b(int n2) {
            return new d[n2];
        }
    };
    final int[] a;
    final int b;
    final int c;
    final String d;
    final int e;
    final int f;
    final CharSequence g;
    final int h;
    final CharSequence i;
    final ArrayList<String> j;
    final ArrayList<String> k;
    final boolean l;

    public d(c c2) {
        IllegalStateException illegalStateException;
        int n2 = c2.c.size();
        this.a = new int[n2 * 6];
        if (c2.j) {
            int n3 = 0;
            for (int i2 = 0; i2 < n2; ++i2) {
                c.a a2 = (c.a)c2.c.get(i2);
                int[] arrn = this.a;
                int n4 = n3 + 1;
                arrn[n3] = a2.a;
                int n5 = n4 + 1;
                h h2 = a2.b;
                int n6 = h2 != null ? h2.f : -1;
                arrn[n4] = n6;
                int n7 = n5 + 1;
                arrn[n5] = a2.c;
                int n8 = n7 + 1;
                arrn[n7] = a2.d;
                int n9 = n8 + 1;
                arrn[n8] = a2.e;
                n3 = n9 + 1;
                arrn[n9] = a2.f;
            }
            this.b = c2.h;
            this.c = c2.i;
            this.d = c2.l;
            this.e = c2.n;
            this.f = c2.o;
            this.g = c2.p;
            this.h = c2.q;
            this.i = c2.r;
            this.j = c2.s;
            this.k = c2.t;
            this.l = c2.u;
            return;
        }
        illegalStateException = new IllegalStateException("Not on back stack");
        throw illegalStateException;
    }

    public d(Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readString();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.h = parcel.readInt();
        this.i = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.createStringArrayList();
        this.k = parcel.createStringArrayList();
        boolean bl = parcel.readInt() != 0;
        this.l = bl;
    }

    public c a(n n2) {
        c c2 = new c(n2);
        int n3 = 0;
        int n4 = 0;
        while (n3 < this.a.length) {
            int n5;
            int n6;
            int n7;
            int n8;
            c.a a2 = new c.a();
            int[] arrn = this.a;
            int n9 = n3 + 1;
            a2.a = arrn[n3];
            if (n.a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Instantiate ");
                stringBuilder.append((Object)c2);
                stringBuilder.append(" op #");
                stringBuilder.append(n4);
                stringBuilder.append(" base fragment #");
                stringBuilder.append(this.a[n9]);
                Log.v((String)"FragmentManager", (String)stringBuilder.toString());
            }
            int[] arrn2 = this.a;
            int n10 = n9 + 1;
            int n11 = arrn2[n9];
            h h2 = n11 >= 0 ? (h)n2.k.get(n11) : null;
            a2.b = h2;
            int[] arrn3 = this.a;
            int n12 = n10 + 1;
            a2.c = n8 = arrn3[n10];
            int n13 = n12 + 1;
            a2.d = n5 = arrn3[n12];
            int n14 = n13 + 1;
            a2.e = n7 = arrn3[n13];
            int n15 = n14 + 1;
            a2.f = n6 = arrn3[n14];
            c2.d = n8;
            c2.e = n5;
            c2.f = n7;
            c2.g = n6;
            c2.b(a2);
            ++n4;
            n3 = n15;
        }
        c2.h = this.b;
        c2.i = this.c;
        c2.l = this.d;
        c2.n = this.e;
        c2.j = true;
        c2.o = this.f;
        c2.p = this.g;
        c2.q = this.h;
        c2.r = this.i;
        c2.s = this.j;
        c2.t = this.k;
        c2.u = this.l;
        c2.c(1);
        return c2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        parcel.writeIntArray(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        TextUtils.writeToParcel((CharSequence)this.g, (Parcel)parcel, (int)0);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel((CharSequence)this.i, (Parcel)parcel, (int)0);
        parcel.writeStringList(this.j);
        parcel.writeStringList(this.k);
        parcel.writeInt((int)this.l);
    }

}

