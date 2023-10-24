/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.animation.Interpolator
 *  java.lang.Math
 *  java.lang.Object
 */
package a.b.d.i.z;

import android.view.animation.Interpolator;

abstract class d
implements Interpolator {
    private final float[] a;
    private final float b;

    public d(float[] arrf) {
        this.a = arrf;
        this.b = 1.0f / (float)(-1 + arrf.length);
    }

    public float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] arrf = this.a;
        int n2 = Math.min((int)((int)(f2 * (float)(-1 + arrf.length))), (int)(-2 + arrf.length));
        float f3 = n2;
        float f4 = this.b;
        float f5 = (f2 - f3 * f4) / f4;
        float[] arrf2 = this.a;
        return arrf2[n2] + f5 * (arrf2[n2 + 1] - arrf2[n2]);
    }
}

