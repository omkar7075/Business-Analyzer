/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Cloneable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package a.b.d.h;

import a.b.d.h.c;

public class f<E>
implements Cloneable {
    private static final Object a = new Object();
    private boolean b = false;
    private long[] c;
    private Object[] d;
    private int e;

    public f() {
        this(10);
    }

    public f(int n2) {
        if (n2 == 0) {
            this.c = c.b;
            this.d = c.c;
        } else {
            int n3 = c.f(n2);
            this.c = new long[n3];
            this.d = new Object[n3];
        }
        this.e = 0;
    }

    private void d() {
        int n2 = this.e;
        long[] arrl = this.c;
        Object[] arrobject = this.d;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = arrobject[i2];
            if (object == a) continue;
            if (i2 != n3) {
                arrl[n3] = arrl[i2];
                arrobject[n3] = object;
                arrobject[i2] = null;
            }
            ++n3;
        }
        this.b = false;
        this.e = n3;
    }

    public void a() {
        int n2 = this.e;
        Object[] arrobject = this.d;
        for (int i2 = 0; i2 < n2; ++i2) {
            arrobject[i2] = null;
        }
        this.e = 0;
        this.b = false;
    }

    /*
     * Exception decompiling
     */
    public f<E> b() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl25 : ALOAD_1 : trying to set 0 previously set to 1
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

    public void c(long l2) {
        Object[] arrobject;
        Object object;
        Object object2;
        int n2 = c.b(this.c, this.e, l2);
        if (n2 >= 0 && (object = (arrobject = this.d)[n2]) != (object2 = a)) {
            arrobject[n2] = object2;
            this.b = true;
        }
    }

    public E e(long l2) {
        return this.f(l2, null);
    }

    public E f(long l2, E e2) {
        int n2 = c.b(this.c, this.e, l2);
        if (n2 >= 0) {
            Object[] arrobject = this.d;
            if (arrobject[n2] == a) {
                return e2;
            }
            return (E)arrobject[n2];
        }
        return e2;
    }

    public long g(int n2) {
        if (this.b) {
            this.d();
        }
        return this.c[n2];
    }

    public void h(long l2, E e2) {
        Object[] arrobject;
        int n2;
        int n3;
        int n4 = c.b(this.c, this.e, l2);
        if (n4 >= 0) {
            this.d[n4] = e2;
            return;
        }
        int n5 = ~n4;
        int n6 = this.e;
        if (n5 < n6 && (arrobject = this.d)[n5] == a) {
            this.c[n5] = l2;
            arrobject[n5] = e2;
            return;
        }
        if (this.b && n6 >= this.c.length) {
            this.d();
            n5 = -1 ^ c.b(this.c, this.e, l2);
        }
        if ((n3 = this.e) >= this.c.length) {
            int n7 = c.f(n3 + 1);
            long[] arrl = new long[n7];
            Object[] arrobject2 = new Object[n7];
            long[] arrl2 = this.c;
            System.arraycopy((Object)arrl2, (int)0, (Object)arrl, (int)0, (int)arrl2.length);
            Object[] arrobject3 = this.d;
            System.arraycopy((Object)arrobject3, (int)0, (Object)arrobject2, (int)0, (int)arrobject3.length);
            this.c = arrl;
            this.d = arrobject2;
        }
        if ((n2 = this.e) - n5 != 0) {
            long[] arrl = this.c;
            int n8 = n5 + 1;
            System.arraycopy((Object)arrl, (int)n5, (Object)arrl, (int)n8, (int)(n2 - n5));
            Object[] arrobject4 = this.d;
            System.arraycopy((Object)arrobject4, (int)n5, (Object)arrobject4, (int)n8, (int)(this.e - n5));
        }
        this.c[n5] = l2;
        this.d[n5] = e2;
        this.e = 1 + this.e;
    }

    public void i(int n2) {
        Object[] arrobject = this.d;
        Object object = arrobject[n2];
        Object object2 = a;
        if (object != object2) {
            arrobject[n2] = object2;
            this.b = true;
        }
    }

    public int j() {
        if (this.b) {
            this.d();
        }
        return this.e;
    }

    public E k(int n2) {
        if (this.b) {
            this.d();
        }
        return (E)this.d[n2];
    }

    public String toString() {
        if (this.j() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(28 * this.e);
        stringBuilder.append('{');
        for (int i2 = 0; i2 < this.e; ++i2) {
            if (i2 > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.g(i2));
            stringBuilder.append('=');
            E e2 = this.k(i2);
            if (e2 != this) {
                stringBuilder.append(e2);
                continue;
            }
            stringBuilder.append("(this Map)");
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

