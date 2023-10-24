/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.net.Uri
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
 *  java.lang.Throwable
 *  java.lang.reflect.Array
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.nio.ByteBuffer
 *  java.util.List
 */
package a.b.d.c;

import a.b.d.b.d.a;
import a.b.d.c.g;
import a.b.d.c.h;
import a.b.d.g.b;
import a.b.d.h.p;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

class e
extends g {
    private static final Class a;
    private static final Constructor b;
    private static final Method c;
    private static final Method d;

    static {
        Method method;
        Constructor constructor;
        Class class_;
        Method method2;
        block3 : {
            void var1_12;
            constructor = null;
            try {
                Method method3;
                class_ = Class.forName((String)"android.graphics.FontFamily");
                Constructor constructor2 = class_.getConstructor(new Class[0]);
                Class class_2 = Integer.TYPE;
                Class[] arrclass = new Class[]{ByteBuffer.class, class_2, List.class, class_2, Boolean.TYPE};
                method2 = class_.getMethod("addFontWeightStyle", arrclass);
                Object object = Array.newInstance((Class)class_, (int)1);
                Class[] arrclass2 = new Class[]{object.getClass()};
                method = method3 = Typeface.class.getMethod("createFromFamiliesWithDefault", arrclass2);
                constructor = constructor2;
                break block3;
            }
            catch (NoSuchMethodException noSuchMethodException) {
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
            Log.e((String)"TypefaceCompatApi24Impl", (String)var1_12.getClass().getName(), (Throwable)var1_12);
            class_ = null;
            method = null;
            method2 = null;
        }
        b = constructor;
        a = class_;
        c = method2;
        d = method;
    }

    e() {
    }

    private static boolean h(Object object, ByteBuffer byteBuffer, int n2, int n3, boolean bl) {
        void var5_10;
        try {
            Method method = c;
            Object[] arrobject = new Object[]{byteBuffer, n2, null, n3, bl};
            boolean bl2 = (Boolean)method.invoke(object, arrobject);
            return bl2;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var5_10);
    }

    private static Typeface i(Object object) {
        void var1_5;
        try {
            Object object2 = Array.newInstance((Class)a, (int)1);
            Array.set((Object)object2, (int)0, (Object)object);
            Typeface typeface = (Typeface)d.invoke(null, new Object[]{object2});
            return typeface;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var1_5);
    }

    public static boolean j() {
        Method method = c;
        if (method == null) {
            Log.w((String)"TypefaceCompatApi24Impl", (String)"Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object k() {
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
        Object object = e.k();
        for (a.c c2 : b2.a()) {
            if (e.h(object, h.b(context, resources, c2.b()), 0, c2.c(), c2.d())) continue;
            return null;
        }
        return e.i(object);
    }

    @Override
    public Typeface c(Context context, CancellationSignal cancellationSignal, b.f[] arrf, int n2) {
        Object object = e.k();
        p<Uri, ByteBuffer> p2 = new p<Uri, ByteBuffer>();
        for (b.f f2 : arrf) {
            Uri uri = f2.c();
            ByteBuffer byteBuffer = (ByteBuffer)p2.get((Object)uri);
            if (byteBuffer == null) {
                byteBuffer = h.f(context, cancellationSignal, uri);
                p2.put(uri, byteBuffer);
            }
            if (e.h(object, byteBuffer, f2.b(), f2.d(), f2.e())) continue;
            return null;
        }
        return e.i(object);
    }
}

