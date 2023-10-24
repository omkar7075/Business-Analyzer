/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.LayoutInflater$Factory
 *  android.view.LayoutInflater$Factory2
 *  java.lang.IllegalAccessException
 *  java.lang.NoSuchFieldException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 */
package a.b.d.i;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;

public final class e {
    private static Field a;
    private static boolean b;
    static final b c;

    static {
        b b2 = Build.VERSION.SDK_INT >= 21 ? new a() : new b();
        c = b2;
    }

    static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        Field field;
        if (!b) {
            try {
                Field field2;
                a = field2 = LayoutInflater.class.getDeclaredField("mFactory2");
                field2.setAccessible(true);
            }
            catch (NoSuchFieldException noSuchFieldException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("forceSetFactory2 Could not find field 'mFactory2' on class ");
                stringBuilder.append(LayoutInflater.class.getName());
                stringBuilder.append("; inflation may have unexpected results.");
                Log.e((String)"LayoutInflaterCompatHC", (String)stringBuilder.toString(), (Throwable)noSuchFieldException);
            }
            b = true;
        }
        if ((field = a) != null) {
            try {
                field.set((Object)layoutInflater, (Object)factory2);
                return;
            }
            catch (IllegalAccessException illegalAccessException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
                stringBuilder.append((Object)layoutInflater);
                stringBuilder.append("; inflation may have unexpected results.");
                Log.e((String)"LayoutInflaterCompatHC", (String)stringBuilder.toString(), (Throwable)illegalAccessException);
            }
        }
    }

    public static void b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        c.a(layoutInflater, factory2);
    }

    static class a
    extends b {
        a() {
        }

        @Override
        public void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
        }
    }

    static class b {
        b() {
        }

        public void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
            layoutInflater.setFactory2(factory2);
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                e.a(layoutInflater, (LayoutInflater.Factory2)factory);
                return;
            }
            e.a(layoutInflater, factory2);
        }
    }

}

