/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  java.lang.Object
 *  java.lang.String
 *  org.xmlpull.v1.XmlPullParser
 */
package a.b.d.b.d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

public class c {
    public static boolean a(TypedArray typedArray, XmlPullParser xmlPullParser, String string, int n2, boolean bl) {
        if (!c.g(xmlPullParser, string)) {
            return bl;
        }
        return typedArray.getBoolean(n2, bl);
    }

    public static int b(TypedArray typedArray, XmlPullParser xmlPullParser, String string, int n2, int n3) {
        if (!c.g(xmlPullParser, string)) {
            return n3;
        }
        return typedArray.getColor(n2, n3);
    }

    public static float c(TypedArray typedArray, XmlPullParser xmlPullParser, String string, int n2, float f2) {
        if (!c.g(xmlPullParser, string)) {
            return f2;
        }
        return typedArray.getFloat(n2, f2);
    }

    public static int d(TypedArray typedArray, XmlPullParser xmlPullParser, String string, int n2, int n3) {
        if (!c.g(xmlPullParser, string)) {
            return n3;
        }
        return typedArray.getInt(n2, n3);
    }

    public static int e(TypedArray typedArray, XmlPullParser xmlPullParser, String string, int n2, int n3) {
        if (!c.g(xmlPullParser, string)) {
            return n3;
        }
        return typedArray.getResourceId(n2, n3);
    }

    public static String f(TypedArray typedArray, XmlPullParser xmlPullParser, String string, int n2) {
        if (!c.g(xmlPullParser, string)) {
            return null;
        }
        return typedArray.getString(n2);
    }

    public static boolean g(XmlPullParser xmlPullParser, String string) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", string) != null;
    }

    public static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] arrn) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, arrn);
        }
        return theme.obtainStyledAttributes(attributeSet, arrn, 0, 0);
    }

    public static TypedValue i(TypedArray typedArray, XmlPullParser xmlPullParser, String string, int n2) {
        if (!c.g(xmlPullParser, string)) {
            return null;
        }
        return typedArray.peekValue(n2);
    }
}

