/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.TypedValue
 *  java.lang.Object
 */
package a.b.d.b;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;

public class a {
    private static final Object a = new Object();
    private static TypedValue b;

    public static final int a(Context context, int n2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColor(n2);
        }
        return context.getResources().getColor(n2);
    }

    public static final ColorStateList b(Context context, int n2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(n2);
        }
        return context.getResources().getColorStateList(n2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Drawable c(Context context, int n2) {
        Object object;
        int n3 = Build.VERSION.SDK_INT;
        if (n3 >= 21) {
            return context.getDrawable(n2);
        }
        if (n3 >= 16) {
            return context.getResources().getDrawable(n2);
        }
        Object object2 = object = a;
        synchronized (object2) {
            if (b == null) {
                b = new TypedValue();
            }
            context.getResources().getValue(n2, b, true);
            n2 = a.b.resourceId;
            return context.getResources().getDrawable(n2);
        }
    }

    public static boolean d(Context context, Intent[] arrintent, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivities(arrintent, bundle);
        } else {
            context.startActivities(arrintent);
        }
        return true;
    }
}

