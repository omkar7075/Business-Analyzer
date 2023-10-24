/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.System
 *  java.lang.reflect.Array
 */
package a.b.e.b.a;

import java.lang.reflect.Array;

final class c {
    public static int[] a(int[] arrn, int n2, int n3) {
        if (n2 + 1 > arrn.length) {
            int[] arrn2 = new int[c.c(n2)];
            System.arraycopy((Object)arrn, (int)0, (Object)arrn2, (int)0, (int)n2);
            arrn = arrn2;
        }
        arrn[n2] = n3;
        return arrn;
    }

    public static <T> T[] b(T[] arrobject, int n2, T t2) {
        if (n2 + 1 > arrobject.length) {
            Object[] arrobject2 = (Object[])Array.newInstance((Class)arrobject.getClass().getComponentType(), (int)c.c(n2));
            System.arraycopy(arrobject, (int)0, (Object)arrobject2, (int)0, (int)n2);
            arrobject = arrobject2;
        }
        arrobject[n2] = t2;
        return arrobject;
    }

    public static int c(int n2) {
        if (n2 <= 4) {
            return 8;
        }
        return n2 * 2;
    }
}

