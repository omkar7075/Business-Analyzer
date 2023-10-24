/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package a.b.d.h;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class g<K, V> {
    private final LinkedHashMap<K, V> a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;

    public g(int n2) {
        if (n2 > 0) {
            this.c = n2;
            this.a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private int e(K k2, V v2) {
        int n2 = this.f(k2, v2);
        if (n2 >= 0) {
            return n2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Negative size: ");
        stringBuilder.append(k2);
        stringBuilder.append("=");
        stringBuilder.append(v2);
        throw new IllegalStateException(stringBuilder.toString());
    }

    protected V a(K k2) {
        return null;
    }

    protected void b(boolean bl, K k2, V v2, V v3) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final V c(K k2) {
        if (k2 == null) throw new NullPointerException("key == null");
        g g2 = this;
        // MONITORENTER : g2
        Object object = this.a.get(k2);
        if (object != null) {
            this.g = 1 + this.g;
            // MONITOREXIT : g2
            return (V)object;
        }
        this.h = 1 + this.h;
        // MONITOREXIT : g2
        V v2 = this.a(k2);
        if (v2 == null) {
            return null;
        }
        g2 = this;
        // MONITORENTER : g2
        this.e = 1 + this.e;
        Object object2 = this.a.put(k2, v2);
        if (object2 != null) {
            this.a.put(k2, object2);
        } else {
            this.b += this.e(k2, v2);
        }
        // MONITOREXIT : g2
        if (object2 != null) {
            this.b(false, k2, v2, object2);
            return (V)object2;
        }
        this.g(this.c);
        return v2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final V d(K k2, V v2) {
        if (k2 == null) throw new NullPointerException("key == null || value == null");
        if (v2 == null) throw new NullPointerException("key == null || value == null");
        g g2 = this;
        // MONITORENTER : g2
        this.d = 1 + this.d;
        this.b += this.e(k2, v2);
        Object object = this.a.put(k2, v2);
        if (object != null) {
            this.b -= this.e(k2, object);
        }
        // MONITOREXIT : g2
        if (object != null) {
            this.b(false, k2, object, v2);
        }
        this.g(this.c);
        return (V)object;
    }

    protected int f(K k2, V v2) {
        return 1;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void g(int var1_1) {
        do {
            var10_5 = this;
            // MONITORENTER : var10_5
            if (this.b < 0 || this.a.isEmpty() && this.b != 0) ** GOTO lbl19
            if (this.b <= var1_1 || this.a.isEmpty()) break;
            var6_2 = (Map.Entry)this.a.entrySet().iterator().next();
            var7_3 = var6_2.getKey();
            var8_4 = var6_2.getValue();
            this.a.remove(var7_3);
            this.b -= this.e(var7_3, var8_4);
            this.f = 1 + this.f;
            // MONITOREXIT : var10_5
            this.b(true, var7_3, var8_4, null);
        } while (true);
        // MONITOREXIT : var10_5
        return;
lbl19: // 1 sources:
        var3_6 = new StringBuilder();
        var3_6.append(this.getClass().getName());
        var3_6.append(".sizeOf() is reporting inconsistent results!");
        throw new IllegalStateException(var3_6.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String toString() {
        g g2 = this;
        synchronized (g2) {
            int n2 = this.g;
            int n3 = n2 + this.h;
            int n4 = n3 != 0 ? n2 * 100 / n3 : 0;
            Locale locale = Locale.US;
            Object[] arrobject = new Object[]{this.c, this.g, this.h, n4};
            return String.format((Locale)locale, (String)"LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", (Object[])arrobject);
        }
    }
}

