/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package a.b.d.h;

public class d {
    /*
     * Enabled aggressive block sorting
     */
    public static void a(Object object, StringBuilder stringBuilder) {
        String string;
        if (object == null) {
            string = "null";
        } else {
            int n2;
            String string2 = object.getClass().getSimpleName();
            if (string2.length() <= 0 && (n2 = (string2 = object.getClass().getName()).lastIndexOf(46)) > 0) {
                string2 = string2.substring(n2 + 1);
            }
            stringBuilder.append(string2);
            stringBuilder.append('{');
            string = Integer.toHexString((int)System.identityHashCode((Object)object));
        }
        stringBuilder.append(string);
    }
}

