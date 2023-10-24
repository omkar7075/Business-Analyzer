/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.UnsupportedOperationException
 *  java.lang.reflect.Array
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 */
package a.b.d.h;

import a.b.d.h.c;
import a.b.d.h.h;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class b<E>
implements Collection<E>,
Set<E> {
    private static final int[] a = new int[0];
    private static final Object[] b = new Object[0];
    static Object[] c;
    static int d;
    static Object[] e;
    static int f;
    final boolean g;
    int[] h;
    Object[] i;
    int j;
    h<E, E> k;

    public b() {
        this(0, false);
    }

    public b(int n2, boolean bl) {
        this.g = bl;
        if (n2 == 0) {
            this.h = a;
            this.i = b;
        } else {
            this.a(n2);
        }
        this.j = 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void a(int n2) {
        if (n2 == 8) {
            Class<b> class_ = b.class;
            // MONITORENTER : a.b.d.h.b.class
            Object[] arrobject = e;
            if (arrobject != null) {
                this.i = arrobject;
                e = (Object[])arrobject[0];
                this.h = (int[])arrobject[1];
                arrobject[1] = null;
                arrobject[0] = null;
                --f;
                // MONITOREXIT : class_
                return;
            }
            // MONITOREXIT : class_
        } else if (n2 == 4) {
            Class<b> class_ = b.class;
            // MONITORENTER : a.b.d.h.b.class
            Object[] arrobject = c;
            if (arrobject != null) {
                this.i = arrobject;
                c = (Object[])arrobject[0];
                this.h = (int[])arrobject[1];
                arrobject[1] = null;
                arrobject[0] = null;
                --d;
                // MONITOREXIT : class_
                return;
            }
            // MONITOREXIT : class_
        }
        this.h = new int[n2];
        this.i = new Object[n2];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void c(int[] arrn, Object[] arrobject, int n2) {
        if (arrn.length == 8) {
            Class<b> class_ = b.class;
            synchronized (b.class) {
                if (f < 10) {
                    arrobject[0] = e;
                    arrobject[1] = arrn;
                    for (int i2 = n2 - 1; i2 >= 2; --i2) {
                        arrobject[i2] = null;
                    }
                    e = arrobject;
                    f = 1 + f;
                }
                // ** MonitorExit[var7_3] (shouldn't be in output)
                return;
            }
        }
        if (arrn.length != 4) {
            return;
        }
        Class<b> class_ = b.class;
        synchronized (b.class) {
            if (d < 10) {
                arrobject[0] = c;
                arrobject[1] = arrn;
                for (int i3 = n2 - 1; i3 >= 2; --i3) {
                    arrobject[i3] = null;
                }
                c = arrobject;
                d = 1 + d;
            }
            // ** MonitorExit[var7_4] (shouldn't be in output)
            return;
        }
    }

    private h<E, E> d() {
        if (this.k == null) {
            this.k = new h<E, E>(){

                @Override
                protected void a() {
                    b.this.clear();
                }

                @Override
                protected Object b(int n2, int n3) {
                    return b.this.i[n2];
                }

                @Override
                protected Map<E, E> c() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override
                protected int d() {
                    return b.this.j;
                }

                @Override
                protected int e(Object object) {
                    return b.this.e(object);
                }

                @Override
                protected int f(Object object) {
                    return b.this.e(object);
                }

                @Override
                protected void g(E e2, E e3) {
                    b.this.add(e2);
                }

                @Override
                protected void h(int n2) {
                    b.this.h(n2);
                }

                @Override
                protected E i(int n2, E e2) {
                    throw new UnsupportedOperationException("not a map");
                }
            };
        }
        return this.k;
    }

    private int f(Object object, int n2) {
        int n3;
        int n4 = this.j;
        if (n4 == 0) {
            return -1;
        }
        int n5 = c.a(this.h, n4, n2);
        if (n5 < 0) {
            return n5;
        }
        if (object.equals(this.i[n5])) {
            return n5;
        }
        for (n3 = n5 + 1; n3 < n4 && this.h[n3] == n2; ++n3) {
            if (!object.equals(this.i[n3])) continue;
            return n3;
        }
        for (int i2 = n5 - 1; i2 >= 0 && this.h[i2] == n2; --i2) {
            if (!object.equals(this.i[i2])) continue;
            return i2;
        }
        return ~n3;
    }

    private int g() {
        int n2;
        int n3 = this.j;
        if (n3 == 0) {
            return -1;
        }
        int n4 = c.a(this.h, n3, 0);
        if (n4 < 0) {
            return n4;
        }
        if (this.i[n4] == null) {
            return n4;
        }
        for (n2 = n4 + 1; n2 < n3 && this.h[n2] == 0; ++n2) {
            if (this.i[n2] != null) continue;
            return n2;
        }
        for (int i2 = n4 - 1; i2 >= 0 && this.h[i2] == 0; --i2) {
            if (this.i[i2] != null) continue;
            return i2;
        }
        return ~n2;
    }

    public boolean add(E e2) {
        int n2;
        int n3;
        int n4;
        if (e2 == null) {
            n3 = this.g();
            n4 = 0;
        } else {
            int n5 = this.g ? System.identityHashCode(e2) : e2.hashCode();
            int n6 = this.f(e2, n5);
            n4 = n5;
            n3 = n6;
        }
        if (n3 >= 0) {
            return false;
        }
        int n7 = ~n3;
        int n8 = this.j;
        int[] arrn = this.h;
        if (n8 >= arrn.length) {
            int n9 = 4;
            if (n8 >= 8) {
                n9 = n8 + (n8 >> 1);
            } else if (n8 >= n9) {
                n9 = 8;
            }
            Object[] arrobject = this.i;
            this.a(n9);
            int[] arrn2 = this.h;
            if (arrn2.length > 0) {
                System.arraycopy((Object)arrn, (int)0, (Object)arrn2, (int)0, (int)arrn.length);
                System.arraycopy((Object)arrobject, (int)0, (Object)this.i, (int)0, (int)arrobject.length);
            }
            b.c(arrn, arrobject, this.j);
        }
        if (n7 < (n2 = this.j)) {
            int[] arrn3 = this.h;
            int n10 = n7 + 1;
            System.arraycopy((Object)arrn3, (int)n7, (Object)arrn3, (int)n10, (int)(n2 - n7));
            Object[] arrobject = this.i;
            System.arraycopy((Object)arrobject, (int)n7, (Object)arrobject, (int)n10, (int)(this.j - n7));
        }
        this.h[n7] = n4;
        this.i[n7] = e2;
        this.j = 1 + this.j;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        this.b(this.j + collection.size());
        Iterator iterator = collection.iterator();
        boolean bl = false;
        while (iterator.hasNext()) {
            bl |= this.add(iterator.next());
        }
        return bl;
    }

    public void b(int n2) {
        int[] arrn = this.h;
        if (arrn.length < n2) {
            Object[] arrobject = this.i;
            this.a(n2);
            int n3 = this.j;
            if (n3 > 0) {
                System.arraycopy((Object)arrn, (int)0, (Object)this.h, (int)0, (int)n3);
                System.arraycopy((Object)arrobject, (int)0, (Object)this.i, (int)0, (int)this.j);
            }
            b.c(arrn, arrobject, this.j);
        }
    }

    public void clear() {
        int n2 = this.j;
        if (n2 != 0) {
            b.c(this.h, this.i, n2);
            this.h = a;
            this.i = b;
            this.j = 0;
        }
    }

    public boolean contains(Object object) {
        return this.e(object) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (this.contains(iterator.next())) continue;
            return false;
        }
        return true;
    }

    public int e(Object object) {
        if (object == null) {
            return this.g();
        }
        int n2 = this.g ? System.identityHashCode((Object)object) : object.hashCode();
        return this.f(object, n2);
    }

    /*
     * Exception decompiling
     */
    public boolean equals(Object var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl39.1 : ICONST_0 : trying to set 0 previously set to 1
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

    public E h(int n2) {
        Object[] arrobject = this.i;
        Object object = arrobject[n2];
        int n3 = this.j;
        if (n3 <= 1) {
            b.c(this.h, arrobject, n3);
            this.h = a;
            this.i = b;
            this.j = 0;
            return (E)object;
        }
        int[] arrn = this.h;
        int n4 = arrn.length;
        int n5 = 8;
        if (n4 > n5 && n3 < arrn.length / 3) {
            int n6;
            if (n3 > n5) {
                n5 = n3 + (n3 >> 1);
            }
            this.a(n5);
            --this.j;
            if (n2 > 0) {
                System.arraycopy((Object)arrn, (int)0, (Object)this.h, (int)0, (int)n2);
                System.arraycopy((Object)arrobject, (int)0, (Object)this.i, (int)0, (int)n2);
            }
            if (n2 < (n6 = this.j)) {
                int n7 = n2 + 1;
                System.arraycopy((Object)arrn, (int)n7, (Object)this.h, (int)n2, (int)(n6 - n2));
                System.arraycopy((Object)arrobject, (int)n7, (Object)this.i, (int)n2, (int)(this.j - n2));
                return (E)object;
            }
        } else {
            int n8;
            this.j = n8 = n3 - 1;
            if (n2 < n8) {
                int n9 = n2 + 1;
                System.arraycopy((Object)arrn, (int)n9, (Object)arrn, (int)n2, (int)(n8 - n2));
                Object[] arrobject2 = this.i;
                System.arraycopy((Object)arrobject2, (int)n9, (Object)arrobject2, (int)n2, (int)(this.j - n2));
            }
            this.i[this.j] = null;
        }
        return (E)object;
    }

    public int hashCode() {
        int[] arrn = this.h;
        int n2 = this.j;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 += arrn[i2];
        }
        return n3;
    }

    public E i(int n2) {
        return (E)this.i[n2];
    }

    public boolean isEmpty() {
        return this.j <= 0;
    }

    public Iterator<E> iterator() {
        return this.d().m().iterator();
    }

    public boolean remove(Object object) {
        int n2 = this.e(object);
        if (n2 >= 0) {
            this.h(n2);
            return true;
        }
        return false;
    }

    public boolean removeAll(Collection<?> collection) {
        Iterator iterator = collection.iterator();
        boolean bl = false;
        while (iterator.hasNext()) {
            bl |= this.remove(iterator.next());
        }
        return bl;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean bl = false;
        for (int i2 = this.j - 1; i2 >= 0; --i2) {
            if (collection.contains(this.i[i2])) continue;
            this.h(i2);
            bl = true;
        }
        return bl;
    }

    public int size() {
        return this.j;
    }

    public Object[] toArray() {
        int n2 = this.j;
        Object[] arrobject = new Object[n2];
        System.arraycopy((Object)this.i, (int)0, (Object)arrobject, (int)0, (int)n2);
        return arrobject;
    }

    public <T> T[] toArray(T[] arrobject) {
        if (arrobject.length < this.j) {
            arrobject = (Object[])Array.newInstance((Class)arrobject.getClass().getComponentType(), (int)this.j);
        }
        System.arraycopy((Object)this.i, (int)0, arrobject, (int)0, (int)this.j);
        int n2 = arrobject.length;
        int n3 = this.j;
        if (n2 > n3) {
            arrobject[n3] = null;
        }
        return arrobject;
    }

    public String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(14 * this.j);
        stringBuilder.append('{');
        for (int i2 = 0; i2 < this.j; ++i2) {
            E e2;
            if (i2 > 0) {
                stringBuilder.append(", ");
            }
            if ((e2 = this.i(i2)) != this) {
                stringBuilder.append(e2);
                continue;
            }
            stringBuilder.append("(this Set)");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

}

