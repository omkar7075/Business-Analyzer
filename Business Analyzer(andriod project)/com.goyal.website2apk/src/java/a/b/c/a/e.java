/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.TypeEvaluator
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 */
package a.b.c.a;

import android.animation.TypeEvaluator;

public class e
implements TypeEvaluator {
    private static final e a = new e();

    public static e a() {
        return a;
    }

    public Object evaluate(float f2, Object object, Object object2) {
        int n2 = (Integer)object;
        float f3 = (float)(255 & n2 >> 24) / 255.0f;
        float f4 = (float)(255 & n2 >> 16) / 255.0f;
        float f5 = (float)(255 & n2 >> 8) / 255.0f;
        float f6 = (float)(n2 & 255) / 255.0f;
        int n3 = (Integer)object2;
        float f7 = (float)(255 & n3 >> 24) / 255.0f;
        float f8 = (float)(255 & n3 >> 16) / 255.0f;
        float f9 = (float)(255 & n3 >> 8) / 255.0f;
        float f10 = (float)(n3 & 255) / 255.0f;
        float f11 = (float)Math.pow((double)f4, (double)2.2);
        float f12 = (float)Math.pow((double)f5, (double)2.2);
        float f13 = (float)Math.pow((double)f6, (double)2.2);
        float f14 = (float)Math.pow((double)f8, (double)2.2);
        float f15 = (float)Math.pow((double)f9, (double)2.2);
        float f16 = (float)Math.pow((double)f10, (double)2.2);
        float f17 = f3 + f2 * (f7 - f3);
        float f18 = f11 + f2 * (f14 - f11);
        float f19 = f12 + f2 * (f15 - f12);
        float f20 = f13 + f2 * (f16 - f13);
        float f21 = f17 * 255.0f;
        float f22 = 255.0f * (float)Math.pow((double)f18, (double)0.45454545454545453);
        float f23 = 255.0f * (float)Math.pow((double)f19, (double)0.45454545454545453);
        float f24 = 255.0f * (float)Math.pow((double)f20, (double)0.45454545454545453);
        return Math.round((float)f21) << 24 | Math.round((float)f22) << 16 | Math.round((float)f23) << 8 | Math.round((float)f24);
    }
}

