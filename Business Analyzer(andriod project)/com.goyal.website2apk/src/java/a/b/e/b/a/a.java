/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Color
 *  android.util.AttributeSet
 *  android.util.StateSet
 *  android.util.Xml
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package a.b.e.b.a;

import a.b.e.a.j;
import a.b.e.b.a.c;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class a {
    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        XmlPullParserException xmlPullParserException;
        int n2;
        AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlPullParser);
        while ((n2 = xmlPullParser.next()) != 2 && n2 != 1) {
        }
        if (n2 == 2) {
            return a.b(resources, xmlPullParser, attributeSet, theme);
        }
        xmlPullParserException = new XmlPullParserException("No start tag found");
        throw xmlPullParserException;
    }

    private static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String string = xmlPullParser.getName();
        if (string.equals((Object)"selector")) {
            return a.c(resources, xmlPullParser, attributeSet, theme);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(xmlPullParser.getPositionDescription());
        stringBuilder.append(": invalid color state list tag ");
        stringBuilder.append(string);
        throw new XmlPullParserException(stringBuilder.toString());
    }

    /*
     * Enabled aggressive block sorting
     */
    private static ColorStateList c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int n2 = xmlPullParser.getDepth();
        int n3 = 1;
        int n4 = n2 + n3;
        int[][] arrarrn = new int[20][];
        int[] arrn = new int[20];
        int n5 = 0;
        do {
            block6 : {
                int n6;
                int n7;
                int[] arrn2;
                int n8;
                float f2;
                block7 : {
                    block5 : {
                        int n9;
                        int n10;
                        if ((n10 = xmlPullParser.next()) == n3 || (n9 = xmlPullParser.getDepth()) < n4 && n10 == 3) break block5;
                        if (n10 != 2 || n9 > n4 || !xmlPullParser.getName().equals((Object)"item")) break block6;
                        TypedArray typedArray = a.e(resources, theme, attributeSet, j.z0);
                        n8 = typedArray.getColor(j.A0, -65281);
                        f2 = 1.0f;
                        int n11 = j.B0;
                        if (typedArray.hasValue(n11) || typedArray.hasValue(n11 = j.C0)) {
                            f2 = typedArray.getFloat(n11, f2);
                        }
                        typedArray.recycle();
                        n7 = attributeSet.getAttributeCount();
                        arrn2 = new int[n7];
                        n6 = 0;
                        break block7;
                    }
                    int[] arrn3 = new int[n5];
                    int[][] arrarrn2 = new int[n5][];
                    System.arraycopy((Object)arrn, (int)0, (Object)arrn3, (int)0, (int)n5);
                    System.arraycopy((Object)arrarrn, (int)0, (Object)arrarrn2, (int)0, (int)n5);
                    return new ColorStateList((int[][])arrarrn2, arrn3);
                }
                for (int i2 = 0; i2 < n7; ++i2) {
                    int n12 = attributeSet.getAttributeNameResource(i2);
                    if (n12 == 16843173 || n12 == 16843551 || n12 == a.b.e.a.a.p) continue;
                    int n13 = n6 + 1;
                    if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                        n12 = -n12;
                    }
                    arrn2[n6] = n12;
                    n6 = n13;
                }
                int[] arrn4 = StateSet.trimStateSet((int[])arrn2, (int)n6);
                int n14 = a.d(n8, f2);
                if (n5 != 0) {
                    arrn4.length;
                }
                arrn = c.a(arrn, n5, n14);
                arrarrn = c.b(arrarrn, n5, arrn4);
                ++n5;
            }
            n3 = 1;
        } while (true);
    }

    private static int d(int n2, float f2) {
        return a.b.d.c.a.d(n2, Math.round((float)(f2 * (float)Color.alpha((int)n2))));
    }

    private static TypedArray e(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] arrn) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, arrn);
        }
        return theme.obtainStyledAttributes(attributeSet, arrn, 0, 0);
    }
}

