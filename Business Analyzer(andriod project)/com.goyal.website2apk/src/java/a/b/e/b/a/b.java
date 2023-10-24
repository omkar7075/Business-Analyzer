/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.XmlResourceParser
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.support.v7.widget.l
 *  android.util.Log
 *  android.util.SparseArray
 *  android.util.TypedValue
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ThreadLocal
 *  java.lang.Throwable
 *  java.util.WeakHashMap
 *  org.xmlpull.v1.XmlPullParser
 */
package a.b.e.b.a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.l;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

public final class b {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal();
    private static final WeakHashMap<Context, SparseArray<a>> b = new WeakHashMap(0);
    private static final Object c = new Object();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void a(Context context, int n2, ColorStateList colorStateList) {
        Object object;
        Object object2 = object = c;
        synchronized (object2) {
            WeakHashMap<Context, SparseArray<a>> weakHashMap = b;
            SparseArray sparseArray = (SparseArray)weakHashMap.get((Object)context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                weakHashMap.put((Object)context, (Object)sparseArray);
            }
            sparseArray.append(n2, (Object)new a(colorStateList, context.getResources().getConfiguration()));
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static ColorStateList b(Context context, int n2) {
        Object object;
        Object object2 = object = c;
        synchronized (object2) {
            SparseArray sparseArray = (SparseArray)b.get((Object)context);
            if (sparseArray == null) return null;
            if (sparseArray.size() <= 0) return null;
            a a2 = (a)sparseArray.get(n2);
            if (a2 == null) return null;
            if (a2.b.equals(context.getResources().getConfiguration())) {
                return a2.a;
            }
            sparseArray.remove(n2);
            return null;
        }
    }

    public static ColorStateList c(Context context, int n2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(n2);
        }
        ColorStateList colorStateList = b.b(context, n2);
        if (colorStateList != null) {
            return colorStateList;
        }
        ColorStateList colorStateList2 = b.f(context, n2);
        if (colorStateList2 != null) {
            b.a(context, n2, colorStateList2);
            return colorStateList2;
        }
        return a.b.d.b.a.b(context, n2);
    }

    public static Drawable d(Context context, int n2) {
        return l.n().p(context, n2);
    }

    private static TypedValue e() {
        ThreadLocal<TypedValue> threadLocal = a;
        TypedValue typedValue = (TypedValue)threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set((Object)typedValue);
        }
        return typedValue;
    }

    private static ColorStateList f(Context context, int n2) {
        if (b.g(context, n2)) {
            return null;
        }
        Resources resources = context.getResources();
        XmlResourceParser xmlResourceParser = resources.getXml(n2);
        try {
            ColorStateList colorStateList = a.b.e.b.a.a.a(resources, (XmlPullParser)xmlResourceParser, context.getTheme());
            return colorStateList;
        }
        catch (Exception exception) {
            Log.e((String)"AppCompatResources", (String)"Failed to inflate ColorStateList, leaving it to the framework", (Throwable)exception);
            return null;
        }
    }

    private static boolean g(Context context, int n2) {
        Resources resources = context.getResources();
        TypedValue typedValue = b.e();
        resources.getValue(n2, typedValue, true);
        int n3 = typedValue.type;
        return n3 >= 28 && n3 <= 31;
    }

    private static class a {
        final ColorStateList a;
        final Configuration b;

        a(ColorStateList colorStateList, Configuration configuration) {
            this.a = colorStateList;
            this.b = configuration;
        }
    }

}

