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

public class q<E>
implements Cloneable {
    private static final Object a = new Object();
    private boolean b = false;
    private int[] c;
    private Object[] d;
    private int e;

    public q() {
        this(10);
    }

    public q(int n2) {
        if (n2 == 0) {
            this.c = c.a;
            this.d = c.c;
        } else {
            int n3 = c.e(n2);
            this.c = new int[n3];
            this.d = new Object[n3];
        }
        this.e = 0;
    }

    private void e() {
        int n2 = this.e;
        int[] arrn = this.c;
        Object[] arrobject = this.d;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = arrobject[i2];
            if (object == a) continue;
            if (i2 != n3) {
                arrn[n3] = arrn[i2];
                arrobject[n3] = object;
                arrobject[i2] = null;
            }
            ++n3;
        }
        this.b = false;
        this.e = n3;
    }

    public void a(int n2, E e2) {
        int n3;
        int n4 = this.e;
        if (n4 != 0 && n2 <= this.c[n4 - 1]) {
            this.i(n2, e2);
            return;
        }
        if (this.b && n4 >= this.c.length) {
            this.e();
        }
        if ((n3 = this.e) >= this.c.length) {
            int n5 = c.e(n3 + 1);
            int[] arrn = new int[n5];
            Object[] arrobject = new Object[n5];
            int[] arrn2 = this.c;
            System.arraycopy((Object)arrn2, (int)0, (Object)arrn, (int)0, (int)arrn2.length);
            Object[] arrobject2 = this.d;
            System.arraycopy((Object)arrobject2, (int)0, (Object)arrobject, (int)0, (int)arrobject2.length);
            this.c = arrn;
            this.d = arrobject;
        }
        this.c[n3] = n2;
        this.d[n3] = e2;
        this.e = n3 + 1;
    }

    public void b() {
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
    public q<E> c() {
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

    public void d(int n2) {
        Object object;
        Object object2;
        Object[] arrobject;
        int n3 = c.a(this.c, this.e, n2);
        if (n3 >= 0 && (object = (arrobject = this.d)[n3]) != (object2 = a)) {
            arrobject[n3] = object2;
            this.b = true;
        }
    }

    public E f(int n2) {
        return this.g(n2, null);
    }

    public E g(int n2, E e2) {
        int n3 = c.a(this.c, this.e, n2);
        if (n3 >= 0) {
            Object[] arrobject = this.d;
            if (arrobject[n3] == a) {
                return e2;
            }
            return (E)arrobject[n3];
        }
        return e2;
    }

    public int h(int n2) {
        if (this.b) {
            this.e();
        }
        return this.c[n2];
    }

    public void i(int n2, E e2) {
        int n3;
        int n4;
        Object[] arrobject;
        int n5 = c.a(this.c, this.e, n2);
        if (n5 >= 0) {
            this.d[n5] = e2;
            return;
        }
        int n6 = ~n5;
        int n7 = this.e;
        if (n6 < n7 && (arrobject = this.d)[n6] == a) {
            this.c[n6] = n2;
            arrobject[n6] = e2;
            return;
        }
        if (this.b && n7 >= this.c.length) {
            this.e();
            n6 = -1 ^ c.a(this.c, this.e, n2);
        }
        if ((n4 = this.e) >= this.c.length) {
            int n8 = c.e(n4 + 1);
            int[] arrn = new int[n8];
            Object[] arrobject2 = new Object[n8];
            int[] arrn2 = this.c;
            System.arraycopy((Object)arrn2, (int)0, (Object)arrn, (int)0, (int)arrn2.length);
            Object[] arrobject3 = this.d;
            System.arraycopy((Object)arrobject3, (int)0, (Object)arrobject2, (int)0, (int)arrobject3.length);
            this.c = arrn;
            this.d = arrobject2;
        }
        if ((n3 = this.e) - n6 != 0) {
            int[] arrn = this.c;
            int n9 = n6 + 1;
            System.arraycopy((Object)arrn, (int)n6, (Object)arrn, (int)n9, (int)(n3 - n6));
            Object[] arrobject4 = this.d;
            System.arraycopy((Object)arrobject4, (int)n6, (Object)arrobject4, (int)n9, (int)(this.e - n6));
        }
        this.c[n6] = n2;
        this.d[n6] = e2;
        this.e = 1 + this.e;
    }

    public void j(int n2) {
        this.d(n2);
    }

    public int k() {
        if (this.b) {
            this.e();
        }
        return this.e;
    }

    public E l(int n2) {
        if (this.b) {
            this.e();
        }
        return (E)this.d[n2];
    }

    public String toString() {
        if (this.k() <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(28 * this.e);
        stringBuilder.append('{');
        for (int i2 = 0; i2 < this.e; ++i2) {
            if (i2 > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(this.h(i2));
            stringBuilder.append('=');
            E e2 = this.l(i2);
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

