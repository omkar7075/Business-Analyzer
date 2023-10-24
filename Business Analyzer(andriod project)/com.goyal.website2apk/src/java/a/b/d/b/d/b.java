/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.Resources$Theme
 *  android.content.res.XmlResourceParser
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.util.TypedValue
 *  android.widget.TextView
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package a.b.d.b.d;

import a.b.d.b.d.a;
import a.b.d.c.c;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class b {
    public static Drawable a(Resources resources, int n2, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(n2, theme);
        }
        return resources.getDrawable(n2);
    }

    public static Typeface b(Context context, int n2, TypedValue typedValue, int n3, TextView textView) {
        if (context.isRestricted()) {
            return null;
        }
        return b.c(context, n2, typedValue, n3, textView);
    }

    private static Typeface c(Context context, int n2, TypedValue typedValue, int n3, TextView textView) {
        Resources resources = context.getResources();
        resources.getValue(n2, typedValue, true);
        Typeface typeface = b.d(context, resources, typedValue, n2, n3, textView);
        if (typeface != null) {
            return typeface;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Font resource ID #0x");
        stringBuilder.append(Integer.toHexString((int)n2));
        throw new Resources.NotFoundException(stringBuilder.toString());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Typeface d(Context context, Resources resources, TypedValue typedValue, int n2, int n3, TextView textView) {
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            StringBuilder stringBuilder;
            String string;
            String string2;
            void var16_13;
            a.a a2;
            block8 : {
                string = charSequence.toString();
                if (!string.startsWith("res/")) {
                    return null;
                }
                Typeface typeface = c.e(resources, n2, n3);
                if (typeface != null) {
                    return typeface;
                }
                if (!string.toLowerCase().endsWith(".xml")) return c.c(context, resources, n2, string, n3);
                a2 = a.a((XmlPullParser)resources.getXml(n2), resources);
                if (a2 != null) break block8;
                Log.e((String)"ResourcesCompat", (String)"Failed to find font-family tag");
                return null;
            }
            try {
                return c.b(context, a2, resources, n2, n3, textView);
            }
            catch (IOException iOException) {
                stringBuilder = new StringBuilder();
                string2 = "Failed to read xml resource ";
            }
            catch (XmlPullParserException xmlPullParserException) {
                stringBuilder = new StringBuilder();
                string2 = "Failed to parse xml resource ";
            }
            stringBuilder.append(string2);
            stringBuilder.append(string);
            Log.e((String)"ResourcesCompat", (String)stringBuilder.toString(), (Throwable)var16_13);
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Resource \"");
        stringBuilder.append(resources.getResourceName(n2));
        stringBuilder.append("\" (");
        stringBuilder.append(Integer.toHexString((int)n2));
        stringBuilder.append(") is not a Font: ");
        stringBuilder.append((Object)typedValue);
        throw new Resources.NotFoundException(stringBuilder.toString());
    }
}

