/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package a.b.d.h;

import a.b.d.h.h;
import a.b.d.h.p;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class a<K, V>
extends p<K, V>
implements Map<K, V> {
    h<K, V> h;

    public a() {
    }

    public a(int n2) {
        super(n2);
    }

    private h<K, V> m() {
        if (this.h == null) {
            this.h = new h<K, V>(){

                @Override
                protected void a() {
                    a.this.clear();
                }

                @Override
                protected Object b(int n2, int n3) {
                    return a.this.f[n3 + (n2 << 1)];
                }

                @Override
                protected Map<K, V> c() {
                    return a.this;
                }

                @Override
                protected int d() {
                    return a.this.g;
                }

                @Override
                protected int e(Object object) {
                    return a.this.f(object);
                }

                @Override
                protected int f(Object object) {
                    return a.this.h(object);
                }

                @Override
                protected void g(K k2, V v2) {
                    a.this.put(k2, v2);
                }

                @Override
                protected void h(int n2) {
                    a.this.j(n2);
                }

                @Override
                protected V i(int n2, V v2) {
                    return a.this.k(n2, v2);
                }
            };
        }
        return this.h;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return this.m().l();
    }

    public Set<K> keySet() {
        return this.m().m();
    }

    public boolean n(Collection<?> collection) {
        return h.p(this, collection);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        this.c(this.g + map.size());
        for (Map.Entry entry : map.entrySet()) {
            this.put(entry.getKey(), entry.getValue());
        }
    }

    public Collection<V> values() {
        return this.m().n();
    }

}

