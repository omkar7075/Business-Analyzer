/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.WeakHashMap
 */
package a.a.a.a;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public class b<K, V>
implements Iterable<Map.Entry<K, V>> {
    private d<K, V> a;
    private d<K, V> b;
    private WeakHashMap<?, Boolean> c = new WeakHashMap();
    private int d = 0;

    public Iterator<Map.Entry<K, V>> b() {
        c<K, V> c2 = new c<K, V>(this.b, this.a);
        this.c.put(c2, (Object)Boolean.FALSE);
        return c2;
    }

    public Map.Entry<K, V> c() {
        return this.a;
    }

    public b<K, V> d() {
        e e2 = new e();
        this.c.put((Object)e2, (Object)Boolean.FALSE);
        return e2;
    }

    public Map.Entry<K, V> e() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        b b2 = (b)object;
        if (this.size() != b2.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> iterator = this.iterator();
        Iterator<Map.Entry<K, V>> iterator2 = b2.iterator();
        while (iterator.hasNext() && iterator2.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            Object object2 = iterator2.next();
            if ((entry != null || object2 == null) && (entry == null || entry.equals(object2))) continue;
            return false;
        }
        return !iterator.hasNext() && !iterator2.hasNext();
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        b<K, V> b2 = new b<K, V>(this.a, this.b);
        this.c.put(b2, (Object)Boolean.FALSE);
        return b2;
    }

    public int size() {
        return this.d;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Iterator<Map.Entry<K, V>> iterator = this.iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(((Map.Entry)iterator.next()).toString());
            if (!iterator.hasNext()) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    static class b<K, V>
    extends f<K, V> {
        b(d<K, V> d2, d<K, V> d3) {
            super(d2, d3);
        }

        @Override
        d<K, V> a(d<K, V> d2) {
            throw null;
        }
    }

    private static class c<K, V>
    extends f<K, V> {
        c(d<K, V> d2, d<K, V> d3) {
            super(d2, d3);
        }

        @Override
        d<K, V> a(d<K, V> d2) {
            throw null;
        }
    }

    static class d<K, V>
    implements Map.Entry<K, V> {
    }

    private class e
    implements Iterator<Map.Entry<K, V>> {
        private d<K, V> a;
        private boolean b = true;

        private e() {
        }

        public Map.Entry<K, V> a() {
            block4 : {
                block3 : {
                    block2 : {
                        if (!this.b) break block2;
                        this.b = false;
                        b.this.a;
                        break block3;
                    }
                    if (this.a != null) break block4;
                }
                return this.a;
            }
            throw null;
        }

        public boolean hasNext() {
            if (this.b) {
                d d2 = b.this.a;
                boolean bl = false;
                if (d2 != null) {
                    bl = true;
                }
                return bl;
            }
            if (this.a == null) {
                return false;
            }
            throw null;
        }
    }

    private static abstract class f<K, V>
    implements Iterator<Map.Entry<K, V>> {
        d<K, V> a;
        d<K, V> b;

        f(d<K, V> d2, d<K, V> d3) {
        }

        private d<K, V> c() {
            d<K, V> d2 = this.b;
            d<K, V> d3 = this.a;
            if (d2 != d3 && d3 != null) {
                return this.a(d2);
            }
            return null;
        }

        abstract d<K, V> a(d<K, V> var1);

        public Map.Entry<K, V> b() {
            d<K, V> d2 = this.b;
            this.c();
            return d2;
        }

        public boolean hasNext() {
            return this.b != null;
        }
    }

}

