/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.os.CancellationSignal
 *  java.io.File
 *  java.io.InputStream
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 */
package a.b.d.c;

import a.b.d.b.d.a;
import a.b.d.c.c;
import a.b.d.c.h;
import a.b.d.g.b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.InputStream;

class g
implements c.a {
    g() {
    }

    private a.c e(a.b b2, int n2) {
        return g.f(b2.a(), n2, new c<a.c>(){

            public int c(a.c c2) {
                return c2.c();
            }

            public boolean d(a.c c2) {
                return c2.d();
            }
        });
    }

    private static <T> T f(T[] arrT, int n2, c<T> c2) {
        int n3 = (n2 & 1) == 0 ? 400 : 700;
        boolean bl = (n2 & 2) != 0;
        T t2 = null;
        int n4 = Integer.MAX_VALUE;
        for (T t3 : arrT) {
            int n5 = 2 * Math.abs((int)(c2.a(t3) - n3));
            int n6 = c2.b(t3) == bl ? 0 : 1;
            int n7 = n5 + n6;
            if (t2 != null && n4 <= n7) continue;
            t2 = t3;
            n4 = n7;
        }
        return t2;
    }

    @Override
    public Typeface a(Context context, a.b b2, Resources resources, int n2) {
        a.c c2 = this.e(b2, n2);
        if (c2 == null) {
            return null;
        }
        return a.b.d.c.c.c(context, resources, c2.b(), c2.a(), n2);
    }

    @Override
    public Typeface b(Context context, Resources resources, int n2, String string, int n3) {
        File file;
        block6 : {
            file = h.e(context);
            if (file == null) {
                return null;
            }
            boolean bl = h.c(file, resources, n2);
            if (bl) break block6;
            file.delete();
            return null;
        }
        try {
            Typeface typeface = Typeface.createFromFile((String)file.getPath());
            return typeface;
        }
        catch (Throwable throwable) {
            throw throwable;
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
        finally {
            file.delete();
        }
    }

    /*
     * Exception decompiling
     */
    @Override
    public Typeface c(Context var1, CancellationSignal var2, b.f[] var3, int var4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl44 : ALOAD : trying to set 1 previously set to 0
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

    protected Typeface d(Context context, InputStream inputStream) {
        File file;
        block6 : {
            file = h.e(context);
            if (file == null) {
                return null;
            }
            boolean bl = h.d(file, inputStream);
            if (bl) break block6;
            file.delete();
            return null;
        }
        try {
            Typeface typeface = Typeface.createFromFile((String)file.getPath());
            return typeface;
        }
        catch (Throwable throwable) {
            throw throwable;
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
        finally {
            file.delete();
        }
    }

    protected b.f g(b.f[] arrf, int n2) {
        return g.f(arrf, n2, new c<b.f>(){

            public int c(b.f f2) {
                return f2.d();
            }

            public boolean d(b.f f2) {
                return f2.e();
            }
        });
    }

    private static interface c<T> {
        public int a(T var1);

        public boolean b(T var1);
    }

}

