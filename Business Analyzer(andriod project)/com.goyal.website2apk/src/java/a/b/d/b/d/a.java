/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.util.Base64
 *  android.util.Xml
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package a.b.d.b.d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class a {
    public static a a(XmlPullParser xmlPullParser, Resources resources) {
        XmlPullParserException xmlPullParserException;
        int n2;
        while ((n2 = xmlPullParser.next()) != 2 && n2 != 1) {
        }
        if (n2 == 2) {
            return a.c(xmlPullParser, resources);
        }
        xmlPullParserException = new XmlPullParserException("No start tag found");
        throw xmlPullParserException;
    }

    public static List<List<byte[]>> b(Resources resources, int n2) {
        ArrayList arrayList = null;
        if (n2 != 0) {
            TypedArray typedArray = resources.obtainTypedArray(n2);
            int n3 = typedArray.length();
            arrayList = null;
            if (n3 > 0) {
                arrayList = new ArrayList();
                boolean bl = typedArray.getResourceId(0, 0) != 0;
                if (bl) {
                    for (int i2 = 0; i2 < typedArray.length(); ++i2) {
                        arrayList.add(a.g(resources.getStringArray(typedArray.getResourceId(i2, 0))));
                    }
                } else {
                    arrayList.add(a.g(resources.getStringArray(n2)));
                }
            }
            typedArray.recycle();
        }
        if (arrayList != null) {
            return arrayList;
        }
        return Collections.emptyList();
    }

    private static a c(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals((Object)"font-family")) {
            return a.d(xmlPullParser, resources);
        }
        a.f(xmlPullParser);
        return null;
    }

    private static a d(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray typedArray = resources.obtainAttributes(Xml.asAttributeSet((XmlPullParser)xmlPullParser), a.b.a.a.a);
        String string = typedArray.getString(a.b.a.a.b);
        String string2 = typedArray.getString(a.b.a.a.f);
        String string3 = typedArray.getString(a.b.a.a.g);
        int n2 = typedArray.getResourceId(a.b.a.a.c, 0);
        int n3 = typedArray.getInteger(a.b.a.a.d, 1);
        int n4 = typedArray.getInteger(a.b.a.a.e, 500);
        typedArray.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                a.f(xmlPullParser);
            }
            return new d(new a.b.d.g.a(string, string2, string3, a.b(resources, n2)), n3, n4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() != 2) continue;
            if (xmlPullParser.getName().equals((Object)"font")) {
                arrayList.add((Object)a.e(xmlPullParser, resources));
                continue;
            }
            a.f(xmlPullParser);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b((c[])arrayList.toArray((Object[])new c[arrayList.size()]));
    }

    private static c e(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray typedArray = resources.obtainAttributes(Xml.asAttributeSet((XmlPullParser)xmlPullParser), a.b.a.a.h);
        int n2 = typedArray.getInt(a.b.a.a.k, 400);
        int n3 = 1;
        int n4 = typedArray.getInt(a.b.a.a.j, 0);
        if (n3 != n4) {
            n3 = 0;
        }
        int n5 = a.b.a.a.i;
        int n6 = typedArray.getResourceId(n5, 0);
        String string = typedArray.getString(n5);
        typedArray.recycle();
        while (xmlPullParser.next() != 3) {
            a.f(xmlPullParser);
        }
        return new c(string, n2, (boolean)n3, n6);
    }

    private static void f(XmlPullParser xmlPullParser) {
        int n2 = 1;
        while (n2 > 0) {
            int n3 = xmlPullParser.next();
            if (n3 != 2) {
                if (n3 != 3) continue;
                --n2;
                continue;
            }
            ++n2;
        }
    }

    private static List<byte[]> g(String[] arrstring) {
        ArrayList arrayList = new ArrayList();
        int n2 = arrstring.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add((Object)Base64.decode((String)arrstring[i2], (int)0));
        }
        return arrayList;
    }

    public static interface a {
    }

    public static final class b
    implements a {
        private final c[] a;

        public b(c[] arrc) {
            this.a = arrc;
        }

        public c[] a() {
            return this.a;
        }
    }

    public static final class c {
        private final String a;
        private int b;
        private boolean c;
        private int d;

        public c(String string, int n2, boolean bl, int n3) {
            this.a = string;
            this.b = n2;
            this.c = bl;
            this.d = n3;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.d;
        }

        public int c() {
            return this.b;
        }

        public boolean d() {
            return this.c;
        }
    }

    public static final class d
    implements a {
        private final a.b.d.g.a a;
        private final int b;
        private final int c;

        public d(a.b.d.g.a a2, int n2, int n3) {
            this.a = a2;
            this.c = n2;
            this.b = n3;
        }

        public int a() {
            return this.c;
        }

        public a.b.d.g.a b() {
            return this.a;
        }

        public int c() {
            return this.b;
        }
    }

}

