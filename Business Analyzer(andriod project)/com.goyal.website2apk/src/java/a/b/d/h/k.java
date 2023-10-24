/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package a.b.d.h;

public class k<F, S> {
    public final F a;
    public final S b;

    private static boolean a(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
        {
        }
    }

    public boolean equals(Object object) {
        if (!(object instanceof k)) {
            return false;
        }
        k k2 = (k)object;
        boolean bl = k.a(k2.a, this.a);
        boolean bl2 = false;
        if (bl) {
            boolean bl3 = k.a(k2.b, this.b);
            bl2 = false;
            if (bl3) {
                bl2 = true;
            }
        }
        return bl2;
    }

    public int hashCode() {
        F f2 = this.a;
        int n2 = f2 == null ? 0 : f2.hashCode();
        S s2 = this.b;
        int n3 = s2 == null ? 0 : s2.hashCode();
        return n2 ^ n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Pair{");
        stringBuilder.append(String.valueOf(this.a));
        stringBuilder.append(" ");
        stringBuilder.append(String.valueOf(this.b));
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

