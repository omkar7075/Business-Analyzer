/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.util.Log
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 */
package a.b.d.a;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class g {
    public static IBinder a(Bundle bundle, String string) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bundle.getBinder(string);
        }
        return a.a(bundle, string);
    }

    static class a {
        private static Method a;
        private static boolean b;

        public static IBinder a(Bundle bundle, String string) {
            Method method;
            if (!b) {
                try {
                    Method method2;
                    a = method2 = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                    method2.setAccessible(true);
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    Log.i((String)"BundleCompatBaseImpl", (String)"Failed to retrieve getIBinder method", (Throwable)noSuchMethodException);
                }
                b = true;
            }
            if ((method = a) != null) {
                void var3_9;
                try {
                    IBinder iBinder = (IBinder)method.invoke((Object)bundle, new Object[]{string});
                    return iBinder;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                }
                catch (IllegalAccessException illegalAccessException) {
                }
                catch (InvocationTargetException invocationTargetException) {
                    // empty catch block
                }
                Log.i((String)"BundleCompatBaseImpl", (String)"Failed to invoke getIBinder via reflection", (Throwable)var3_9);
                a = null;
            }
            return null;
        }
    }

}

