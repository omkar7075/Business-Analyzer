/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.graphics.fonts.FontVariationAxis
 *  android.os.CancellationSignal
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.InstantiationException
 *  java.lang.Integer
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Array
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.nio.ByteBuffer
 */
package a.b.d.c;

import a.b.d.b.d.a;
import a.b.d.c.d;
import a.b.d.c.g;
import a.b.d.g.b;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;

public class f
extends d {
    private static final Class a;
    private static final Constructor b;
    private static final Method c;
    private static final Method d;
    private static final Method e;
    private static final Method f;
    private static final Method g;

    static {
        Method method;
        Method method2;
        Method method3;
        Class class_;
        Constructor constructor;
        Method method4;
        Method method5;
        block3 : {
            void var1_14;
            constructor = null;
            try {
                class_ = Class.forName((String)"android.graphics.FontFamily");
                Constructor constructor2 = class_.getConstructor(new Class[0]);
                Class class_2 = Integer.TYPE;
                Class[] arrclass = new Class[]{AssetManager.class, String.class, class_2, Boolean.TYPE, class_2, class_2, class_2, FontVariationAxis[].class};
                method4 = class_.getMethod("addFontFromAssetManager", arrclass);
                method2 = class_.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, class_2, FontVariationAxis[].class, class_2, class_2});
                method5 = class_.getMethod("freeze", new Class[0]);
                method = class_.getMethod("abortCreation", new Class[0]);
                Object object = Array.newInstance((Class)class_, (int)1);
                Class[] arrclass2 = new Class[]{object.getClass(), class_2, class_2};
                method3 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", arrclass2);
                method3.setAccessible(true);
                constructor = constructor2;
                break block3;
            }
            catch (NoSuchMethodException noSuchMethodException) {
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to collect necessary methods for class ");
            stringBuilder.append(var1_14.getClass().getName());
            Log.e((String)"TypefaceCompatApi26Impl", (String)stringBuilder.toString(), (Throwable)var1_14);
            class_ = null;
            method3 = null;
            method4 = null;
            method2 = null;
            method5 = null;
            method = null;
        }
        b = constructor;
        a = class_;
        c = method4;
        d = method2;
        e = method5;
        f = method;
        g = method3;
    }

    private static boolean i(Object object) {
        void var1_4;
        try {
            boolean bl = (Boolean)f.invoke(object, new Object[0]);
            return bl;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var1_4);
    }

    private static boolean j(Context context, Object object, String string, int n2, int n3, int n4) {
        void var6_11;
        try {
            Method method = c;
            Object[] arrobject = new Object[]{context.getAssets(), string, 0, Boolean.FALSE, n2, n3, n4, null};
            boolean bl = (Boolean)method.invoke(object, arrobject);
            return bl;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var6_11);
    }

    private static boolean k(Object object, ByteBuffer byteBuffer, int n2, int n3, int n4) {
        void var5_10;
        try {
            Method method = d;
            Object[] arrobject = new Object[]{byteBuffer, n2, null, n3, n4};
            boolean bl = (Boolean)method.invoke(object, arrobject);
            return bl;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var5_10);
    }

    private static Typeface l(Object object) {
        void var1_7;
        try {
            Object object2 = Array.newInstance((Class)a, (int)1);
            Array.set((Object)object2, (int)0, (Object)object);
            Method method = g;
            Object[] arrobject = new Object[]{object2, -1, -1};
            Typeface typeface = (Typeface)method.invoke(null, arrobject);
            return typeface;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var1_7);
    }

    private static boolean m(Object object) {
        void var1_4;
        try {
            boolean bl = (Boolean)e.invoke(object, new Object[0]);
            return bl;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var1_4);
    }

    private static boolean n() {
        Method method = c;
        if (method == null) {
            Log.w((String)"TypefaceCompatApi26Impl", (String)"Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object o() {
        void var0_4;
        try {
            Object object = b.newInstance(new Object[0]);
            return object;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (InstantiationException instantiationException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var0_4);
    }

    @Override
    public Typeface a(Context context, a.b b2, Resources resources, int n2) {
        if (!f.n()) {
            return g.super.a(context, b2, resources, n2);
        }
        Object object = f.o();
        for (a.c c2 : b2.a()) {
            if (f.j(context, object, c2.a(), 0, c2.c(), (int)c2.d())) continue;
            f.i(object);
            return null;
        }
        if (!f.m(object)) {
            return null;
        }
        return f.l(object);
    }

    @Override
    public Typeface b(Context context, Resources resources, int n2, String string, int n3) {
        if (!f.n()) {
            return g.super.b(context, resources, n2, string, n3);
        }
        Object object = f.o();
        if (!f.j(context, object, string, 0, -1, -1)) {
            f.i(object);
            return null;
        }
        if (!f.m(object)) {
            return null;
        }
        return f.l(object);
    }

    /*
     * Exception decompiling
     */
    @Override
    public Typeface c(Context var1, CancellationSignal var2, b.f[] var3, int var4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl50.3 : FAKE_TRY : trying to set 0 previously set to 1
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
}

