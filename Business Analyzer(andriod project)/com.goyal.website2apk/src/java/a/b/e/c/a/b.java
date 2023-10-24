/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  java.lang.Double
 *  java.lang.Math
 */
package a.b.e.c.a;

import a.b.d.c.i.a;
import a.b.e.a.i;
import a.b.e.a.j;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public class b
extends Drawable {
    private static final float a = (float)Math.toRadians((double)45.0);
    private final Paint b;
    private float c;
    private float d;
    private float e;
    private float f;
    private boolean g;
    private final Path h;
    private final int i;
    private boolean j;
    private float k;
    private float l;
    private int m;

    public b(Context context) {
        Paint paint;
        this.b = paint = new Paint();
        this.h = new Path();
        this.j = false;
        this.m = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArray = context.getTheme().obtainStyledAttributes(null, j.H0, a.b.e.a.a.B, i.b);
        this.c(typedArray.getColor(j.L0, 0));
        this.b(typedArray.getDimension(j.P0, 0.0f));
        this.f(typedArray.getBoolean(j.O0, true));
        this.d(Math.round((float)typedArray.getDimension(j.N0, 0.0f)));
        this.i = typedArray.getDimensionPixelSize(j.M0, 0);
        this.d = Math.round((float)typedArray.getDimension(j.K0, 0.0f));
        this.c = Math.round((float)typedArray.getDimension(j.I0, 0.0f));
        this.e = typedArray.getDimension(j.J0, 0.0f);
        typedArray.recycle();
    }

    private static float a(float f2, float f3, float f4) {
        return f2 + f4 * (f3 - f2);
    }

    public void b(float f2) {
        if (this.b.getStrokeWidth() != f2) {
            this.b.setStrokeWidth(f2);
            double d2 = f2 / 2.0f;
            double d3 = Math.cos((double)a);
            Double.isNaN((double)d2);
            this.l = (float)(d2 * d3);
            this.invalidateSelf();
        }
    }

    public void c(int n2) {
        if (n2 != this.b.getColor()) {
            this.b.setColor(n2);
            this.invalidateSelf();
        }
    }

    public void d(float f2) {
        if (f2 != this.f) {
            this.f = f2;
            this.invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Rect rect;
        boolean bl;
        block6 : {
            block7 : {
                block8 : {
                    rect = this.getBounds();
                    int n2 = this.m;
                    bl = false;
                    if (n2 == 0) break block6;
                    if (n2 == 1) break block7;
                    if (n2 == 3) break block8;
                    int n3 = a.e(this);
                    bl = false;
                    if (n3 != 1) break block6;
                    break block7;
                }
                int n4 = a.e(this);
                bl = false;
                if (n4 != 0) break block6;
            }
            bl = true;
        }
        float f2 = this.c;
        float f3 = (float)Math.sqrt((double)(2.0f * (f2 * f2)));
        float f4 = b.a(this.d, f3, this.k);
        float f5 = b.a(this.d, this.e, this.k);
        float f6 = Math.round((float)b.a(0.0f, this.l, this.k));
        float f7 = b.a(0.0f, a, this.k);
        float f8 = bl ? 0.0f : -180.0f;
        float f9 = bl ? 180.0f : 0.0f;
        float f10 = b.a(f8, f9, this.k);
        double d2 = f4;
        double d3 = f7;
        double d4 = Math.cos((double)d3);
        Double.isNaN((double)d2);
        double d5 = d4 * d2;
        boolean bl2 = bl;
        float f11 = Math.round((double)d5);
        double d6 = Math.sin((double)d3);
        Double.isNaN((double)d2);
        float f12 = Math.round((double)(d2 * d6));
        this.h.rewind();
        float f13 = b.a(this.f + this.b.getStrokeWidth(), -this.l, this.k);
        float f14 = -f5 / 2.0f;
        this.h.moveTo(f14 + f6, 0.0f);
        this.h.rLineTo(f5 - f6 * 2.0f, 0.0f);
        this.h.moveTo(f14, f13);
        this.h.rLineTo(f11, f12);
        this.h.moveTo(f14, -f13);
        this.h.rLineTo(f11, -f12);
        this.h.close();
        canvas.save();
        float f15 = this.b.getStrokeWidth();
        float f16 = (float)rect.height() - 3.0f * f15;
        float f17 = this.f;
        float f18 = (float)(2 * ((int)(f16 - 2.0f * f17) / 4)) + (f17 + f15 * 1.5f);
        canvas.translate((float)rect.centerX(), f18);
        if (this.g) {
            int n5 = bl2 ^ this.j ? -1 : 1;
            canvas.rotate(f10 * (float)n5);
        } else if (bl2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.h, this.b);
        canvas.restore();
    }

    public void e(float f2) {
        if (this.k != f2) {
            this.k = f2;
            this.invalidateSelf();
        }
    }

    public void f(boolean bl) {
        if (this.g != bl) {
            this.g = bl;
            this.invalidateSelf();
        }
    }

    public void g(boolean bl) {
        if (this.j != bl) {
            this.j = bl;
            this.invalidateSelf();
        }
    }

    public int getIntrinsicHeight() {
        return this.i;
    }

    public int getIntrinsicWidth() {
        return this.i;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int n2) {
        if (n2 != this.b.getAlpha()) {
            this.b.setAlpha(n2);
            this.invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        this.invalidateSelf();
    }
}

