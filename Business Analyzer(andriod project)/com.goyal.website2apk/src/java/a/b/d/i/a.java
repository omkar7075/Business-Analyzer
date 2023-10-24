/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$ClassLoaderCreator
 *  android.os.Parcelable$Creator
 *  java.lang.ClassLoader
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package a.b.d.i;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class a
implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR;
    public static final a a;
    private final Parcelable b;

    static {
        a = new a(){};
        CREATOR = new Parcelable.ClassLoaderCreator<a>(){

            public a a(Parcel parcel) {
                return this.b(parcel, null);
            }

            public a b(Parcel parcel, ClassLoader classLoader) {
                if (parcel.readParcelable(classLoader) == null) {
                    return a.a;
                }
                throw new IllegalStateException("superState must be null");
            }

            public a[] c(int n2) {
                return new a[n2];
            }
        };
    }

    private a() {
        this.b = null;
    }

    protected a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        if (parcelable == null) {
            parcelable = a;
        }
        this.b = parcelable;
    }

    protected a(Parcelable parcelable) {
        if (parcelable != null) {
            if (parcelable == a) {
                parcelable = null;
            }
            this.b = parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public final Parcelable a() {
        return this.b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int n2) {
        parcel.writeParcelable(this.b, n2);
    }

}

