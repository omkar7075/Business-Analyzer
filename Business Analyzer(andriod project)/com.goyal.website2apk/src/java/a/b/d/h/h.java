/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.lang.reflect.Array
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.NoSuchElementException
 *  java.util.Set
 */
package a.b.d.h;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

abstract class h<K, V> {
    h<K, V> a;
    h<K, V> b;
    h<K, V> c;

    h() {
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (map.containsKey(iterator.next())) continue;
            return false;
        }
        return true;
    }

    /*
     * Exception decompiling
     */
    public static <T> boolean k(Set<T> var0, Object var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl27.1 : ICONST_0 : trying to set 0 previously set to 1
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int n2 = map.size();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            map.remove(iterator.next());
        }
        return n2 != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int n2 = map.size();
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            if (collection.contains(iterator.next())) continue;
            iterator.remove();
        }
        return n2 != map.size();
    }

    protected abstract void a();

    protected abstract Object b(int var1, int var2);

    protected abstract Map<K, V> c();

    protected abstract int d();

    protected abstract int e(Object var1);

    protected abstract int f(Object var1);

    protected abstract void g(K var1, V var2);

    protected abstract void h(int var1);

    protected abstract V i(int var1, V var2);

    public Set<Map.Entry<K, V>> l() {
        if (this.a == null) {
            this.a = new b();
        }
        return this.a;
    }

    public Set<K> m() {
        if (this.b == null) {
            this.b = new c();
        }
        return this.b;
    }

    public Collection<V> n() {
        if (this.c == null) {
            this.c = new e();
        }
        return this.c;
    }

    public Object[] q(int n2) {
        int n3 = this.d();
        Object[] arrobject = new Object[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            arrobject[i2] = this.b(i2, n2);
        }
        return arrobject;
    }

    public <T> T[] r(T[] arrobject, int n2) {
        int n3 = this.d();
        if (arrobject.length < n3) {
            arrobject = (Object[])Array.newInstance((Class)arrobject.getClass().getComponentType(), (int)n3);
        }
        for (int i2 = 0; i2 < n3; ++i2) {
            arrobject[i2] = this.b(i2, n2);
        }
        if (arrobject.length > n3) {
            arrobject[n3] = null;
        }
        return arrobject;
    }

    final class a<T>
    implements Iterator<T> {
        final int a;
        int b;
        int c;
        boolean d = false;

        a(int n2) {
            this.a = n2;
            this.b = h.this.d();
        }

        public boolean hasNext() {
            return this.c < this.b;
        }

        public T next() {
            if (this.hasNext()) {
                Object object = h.this.b(this.c, this.a);
                this.c = 1 + this.c;
                this.d = true;
                return (T)object;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.d) {
                int n2;
                this.c = n2 = -1 + this.c;
                this.b = -1 + this.b;
                this.d = false;
                h.this.h(n2);
                return;
            }
            throw new IllegalStateException();
        }
    }

    final class b
    implements Set<Map.Entry<K, V>> {
        b() {
        }

        public boolean a(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int n2 = h.this.d();
            for (Map.Entry entry : collection) {
                h.this.g(entry.getKey(), entry.getValue());
            }
            return n2 != h.this.d();
        }

        public void clear() {
            h.this.a();
        }

        public boolean contains(Object object) {
            if (!(object instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry)object;
            int n2 = h.this.e(entry.getKey());
            if (n2 < 0) {
                return false;
            }
            return a.b.d.h.c.c(h.this.b(n2, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                if (this.contains(iterator.next())) continue;
                return false;
            }
            return true;
        }

        public boolean equals(Object object) {
            return h.k(this, object);
        }

        public int hashCode() {
            int n2 = 0;
            for (int i2 = h.this.d() - 1; i2 >= 0; --i2) {
                Object object = h.this.b(i2, 0);
                Object object2 = h.this.b(i2, 1);
                int n3 = object == null ? 0 : object.hashCode();
                int n4 = object2 == null ? 0 : object2.hashCode();
                n2 += n3 ^ n4;
            }
            return n2;
        }

        public boolean isEmpty() {
            return h.this.d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public boolean remove(Object object) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return h.this.d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] arrT) {
            throw new UnsupportedOperationException();
        }
    }

    final class c
    implements Set<K> {
        c() {
        }

        public boolean add(K k2) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            h.this.a();
        }

        public boolean contains(Object object) {
            return h.this.e(object) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            return h.j(h.this.c(), collection);
        }

        public boolean equals(Object object) {
            return h.k(this, object);
        }

        public int hashCode() {
            int n2 = 0;
            for (int i2 = -1 + h.this.d(); i2 >= 0; --i2) {
                Object object = h.this.b(i2, 0);
                int n3 = object == null ? 0 : object.hashCode();
                n2 += n3;
            }
            return n2;
        }

        public boolean isEmpty() {
            return h.this.d() == 0;
        }

        public Iterator<K> iterator() {
            return new a(0);
        }

        public boolean remove(Object object) {
            int n2 = h.this.e(object);
            if (n2 >= 0) {
                h.this.h(n2);
                return true;
            }
            return false;
        }

        public boolean removeAll(Collection<?> collection) {
            return h.o(h.this.c(), collection);
        }

        public boolean retainAll(Collection<?> collection) {
            return h.p(h.this.c(), collection);
        }

        public int size() {
            return h.this.d();
        }

        public Object[] toArray() {
            return h.this.q(0);
        }

        public <T> T[] toArray(T[] arrT) {
            return h.this.r(arrT, 0);
        }
    }

    final class d
    implements Iterator<Map.Entry<K, V>>,
    Map.Entry<K, V> {
        int a;
        int b;
        boolean c = false;

        d() {
            this.a = -1 + h.this.d();
            this.b = -1;
        }

        public Map.Entry<K, V> a() {
            if (this.hasNext()) {
                this.b = 1 + this.b;
                this.c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public final boolean equals(Object object) {
            if (this.c) {
                if (!(object instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry)object;
                boolean bl = a.b.d.h.c.c(entry.getKey(), h.this.b(this.b, 0));
                boolean bl2 = false;
                if (bl) {
                    boolean bl3 = a.b.d.h.c.c(entry.getValue(), h.this.b(this.b, 1));
                    bl2 = false;
                    if (bl3) {
                        bl2 = true;
                    }
                }
                return bl2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public K getKey() {
            if (this.c) {
                return (K)h.this.b(this.b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.c) {
                return (V)h.this.b(this.b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.b < this.a;
        }

        public final int hashCode() {
            if (this.c) {
                Object object = h.this.b(this.b, 0);
                Object object2 = h.this.b(this.b, 1);
                int n2 = object == null ? 0 : object.hashCode();
                int n3 = object2 == null ? 0 : object2.hashCode();
                return n2 ^ n3;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public void remove() {
            if (this.c) {
                h.this.h(this.b);
                this.b = -1 + this.b;
                this.a = -1 + this.a;
                this.c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v2) {
            if (this.c) {
                return h.this.i(this.b, v2);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getKey());
            stringBuilder.append("=");
            stringBuilder.append(this.getValue());
            return stringBuilder.toString();
        }
    }

    final class e
    implements Collection<V> {
        e() {
        }

        public boolean add(V v2) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            h.this.a();
        }

        public boolean contains(Object object) {
            return h.this.f(object) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                if (this.contains(iterator.next())) continue;
                return false;
            }
            return true;
        }

        public boolean isEmpty() {
            return h.this.d() == 0;
        }

        public Iterator<V> iterator() {
            return new a(1);
        }

        public boolean remove(Object object) {
            int n2 = h.this.f(object);
            if (n2 >= 0) {
                h.this.h(n2);
                return true;
            }
            return false;
        }

        public boolean removeAll(Collection<?> collection) {
            int n2 = h.this.d();
            boolean bl = false;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!collection.contains(h.this.b(i2, 1))) continue;
                h.this.h(i2);
                --i2;
                --n2;
                bl = true;
            }
            return bl;
        }

        public boolean retainAll(Collection<?> collection) {
            int n2 = h.this.d();
            boolean bl = false;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (collection.contains(h.this.b(i2, 1))) continue;
                h.this.h(i2);
                --i2;
                --n2;
                bl = true;
            }
            return bl;
        }

        public int size() {
            return h.this.d();
        }

        public Object[] toArray() {
            return h.this.q(1);
        }

        public <T> T[] toArray(T[] arrT) {
            return h.this.r(arrT, 1);
        }
    }

}

