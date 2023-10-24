/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package a.b.d.h;

import a.b.d.h.l;

public class m<T>
implements l<T> {
    private final Object[] a;
    private int b;

    public m(int n2) {
        if (n2 > 0) {
            this.a = new Object[n2];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    private boolean c(T t2) {
        for (int i2 = 0; i2 < this.b; ++i2) {
            if (this.a[i2] != t2) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean a(T t2) {
        if (!this.c(t2)) {
            int n2 = this.b;
            Object[] arrobject = this.a;
            if (n2 < arrobject.length) {
                arrobject[n2] = t2;
                this.b = n2 + 1;
                return true;
            }
            return false;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    @Override
    public T b() {
        int n2 = this.b;
        if (n2 > 0) {
            int n3 = n2 - 1;
            Object[] arrobject = this.a;
            Object object = arrobject[n3];
            arrobject[n3] = null;
            this.b = n2 - 1;
            return (T)object;
        }
        return null;
    }
}

