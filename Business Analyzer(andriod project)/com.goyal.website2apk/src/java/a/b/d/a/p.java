/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 */
package a.b.d.a;

import a.b.d.a.d;
import a.b.d.a.q;
import android.os.Parcel;
import android.os.Parcelable;

final class p
implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new Parcelable.Creator<p>(){

        public p a(Parcel parcel) {
            return new p(parcel);
        }

        public p[] b(int n2) {
            return new p[n2];
        }
    };
    q[] a;
    int[] b;
    d[] c;
    int d = -1;
    int e;

    public p() {
    }

    public p(Parcel parcel) {
        this.a = (q[])parcel.createTypedArray(q.CREATOR);
        this.b = parcel.createIntArray();
        this.c = (d[])parcel.createTypedArray(d.CREATOR);
        this.d = parcel.readInt();
        this.e = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        parcel.writeTypedArray((Parcelable[])this.a, n2);
        parcel.writeIntArray(this.b);
        parcel.writeTypedArray((Parcelable[])this.c, n2);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
    }

}

