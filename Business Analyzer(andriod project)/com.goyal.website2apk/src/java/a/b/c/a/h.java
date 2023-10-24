/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.ColorFilter
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.Path$FillType
 *  android.graphics.PathMeasure
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.Rect
 *  android.graphics.Region
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.graphics.drawable.VectorDrawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.Xml
 *  java.io.IOException
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Stack
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package a.b.c.a;

import a.b.d.c.b;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class h
extends a.b.c.a.g {
    static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;
    private f c;
    private PorterDuffColorFilter d;
    private ColorFilter e;
    private boolean f;
    private boolean g = true;
    private Drawable.ConstantState h;
    private final float[] i = new float[9];
    private final Matrix j = new Matrix();
    private final Rect k = new Rect();

    h() {
        this.c = new f();
    }

    h(f f2) {
        this.c = f2;
        this.d = this.j(this.d, f2.c, f2.d);
    }

    static int a(int n2, float f2) {
        int n3 = Color.alpha((int)n2);
        return n2 & 16777215 | (int)(f2 * (float)n3) << 24;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static h b(Resources resources, int n2, Resources.Theme theme) {
        void var4_9;
        int n3;
        if (Build.VERSION.SDK_INT >= 24) {
            h h2 = new h();
            h2.a = a.b.d.b.d.b.a(resources, n2, theme);
            h2.h = new g(h2.a.getConstantState());
            return h2;
        }
        XmlResourceParser xmlResourceParser = resources.getXml(n2);
        AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
        while ((n3 = xmlResourceParser.next()) != 2 && n3 != 1) {
        }
        if (n3 != 2) throw new XmlPullParserException("No start tag found");
        try {
            return h.c(resources, (XmlPullParser)xmlResourceParser, attributeSet, theme);
        }
        catch (IOException iOException) {
        }
        catch (XmlPullParserException xmlPullParserException) {
            // empty catch block
        }
        Log.e((String)"VectorDrawableCompat", (String)"parser error", (Throwable)var4_9);
        return null;
    }

    public static h c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h h2 = new h();
        h2.inflate(resources, xmlPullParser, attributeSet, theme);
        return h2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        f f2 = this.c;
        e e2 = f2.b;
        Stack stack = new Stack();
        stack.push((Object)e2.i);
        int n2 = xmlPullParser.getEventType();
        int n3 = 1 + xmlPullParser.getDepth();
        boolean bl = true;
        while (n2 != 1 && (xmlPullParser.getDepth() >= n3 || n2 != 3)) {
            block14 : {
                block9 : {
                    int n4;
                    int n5;
                    block13 : {
                        c c2;
                        String string;
                        block12 : {
                            d d2;
                            block11 : {
                                block10 : {
                                    if (n2 != 2) break block9;
                                    string = xmlPullParser.getName();
                                    c2 = (c)stack.peek();
                                    if (!"path".equals((Object)string)) break block10;
                                    d2 = new b();
                                    ((b)d2).e(resources, attributeSet, theme, xmlPullParser);
                                    c2.b.add((Object)d2);
                                    if (d2.getPathName() != null) {
                                        e2.p.put(d2.getPathName(), d2);
                                    }
                                    bl = false;
                                    break block11;
                                }
                                if (!"clip-path".equals((Object)string)) break block12;
                                d2 = new a();
                                ((a)d2).c(resources, attributeSet, theme, xmlPullParser);
                                c2.b.add((Object)d2);
                                if (d2.getPathName() != null) {
                                    e2.p.put(d2.getPathName(), d2);
                                }
                            }
                            n4 = f2.a;
                            n5 = d2.c;
                            break block13;
                        }
                        if (!"group".equals((Object)string)) break block14;
                        c c3 = new c();
                        c3.c(resources, attributeSet, theme, xmlPullParser);
                        c2.b.add((Object)c3);
                        stack.push((Object)c3);
                        if (c3.getGroupName() != null) {
                            e2.p.put(c3.getGroupName(), c3);
                        }
                        n4 = f2.a;
                        n5 = c3.k;
                    }
                    f2.a = n5 | n4;
                    break block14;
                }
                if (n2 == 3 && "group".equals((Object)xmlPullParser.getName())) {
                    stack.pop();
                }
            }
            n2 = xmlPullParser.next();
        }
        if (!bl) {
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (stringBuffer.length() > 0) {
            stringBuffer.append(" or ");
        }
        stringBuffer.append("path");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("no ");
        stringBuilder.append((Object)stringBuffer);
        stringBuilder.append(" defined");
        throw new XmlPullParserException(stringBuilder.toString());
    }

    private boolean f() {
        int n2 = Build.VERSION.SDK_INT;
        boolean bl = false;
        if (n2 >= 17) {
            boolean bl2 = this.isAutoMirrored();
            bl = false;
            if (bl2) {
                int n3 = a.b.d.c.i.a.e(this);
                bl = false;
                if (n3 == 1) {
                    bl = true;
                }
            }
        }
        return bl;
    }

    private static PorterDuff.Mode g(int n2, PorterDuff.Mode mode) {
        if (n2 != 3) {
            if (n2 != 5) {
                if (n2 != 9) {
                    switch (n2) {
                        default: {
                            return mode;
                        }
                        case 16: {
                            if (Build.VERSION.SDK_INT >= 11) {
                                return PorterDuff.Mode.ADD;
                            }
                            return mode;
                        }
                        case 15: {
                            return PorterDuff.Mode.SCREEN;
                        }
                        case 14: 
                    }
                    return PorterDuff.Mode.MULTIPLY;
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser) {
        float f2;
        f f3 = this.c;
        e e2 = f3.b;
        f3.d = h.g(a.b.d.b.d.c.d(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            f3.c = colorStateList;
        }
        f3.e = a.b.d.b.d.c.a(typedArray, xmlPullParser, "autoMirrored", 5, f3.e);
        e2.l = a.b.d.b.d.c.c(typedArray, xmlPullParser, "viewportWidth", 7, e2.l);
        e2.m = f2 = a.b.d.b.d.c.c(typedArray, xmlPullParser, "viewportHeight", 8, e2.m);
        if (!(e2.l <= 0.0f)) {
            if (!(f2 <= 0.0f)) {
                float f4;
                e2.j = typedArray.getDimension(3, e2.j);
                e2.k = f4 = typedArray.getDimension(2, e2.k);
                if (!(e2.j <= 0.0f)) {
                    if (!(f4 <= 0.0f)) {
                        e2.setAlpha(a.b.d.b.d.c.c(typedArray, xmlPullParser, "alpha", 4, e2.getAlpha()));
                        String string = typedArray.getString(0);
                        if (string != null) {
                            e2.o = string;
                            e2.p.put(string, e2);
                        }
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(typedArray.getPositionDescription());
                    stringBuilder.append("<vector> tag requires height > 0");
                    throw new XmlPullParserException(stringBuilder.toString());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(typedArray.getPositionDescription());
                stringBuilder.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(typedArray.getPositionDescription());
            stringBuilder.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(typedArray.getPositionDescription());
        stringBuilder.append("<vector> tag requires viewportWidth > 0");
        throw new XmlPullParserException(stringBuilder.toString());
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable != null) {
            a.b.d.c.i.a.b(drawable);
        }
        return false;
    }

    Object d(String string) {
        return this.c.b.p.get(string);
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.copyBounds(this.k);
        if (this.k.width() > 0) {
            if (this.k.height() <= 0) {
                return;
            }
            ColorFilter colorFilter = this.e;
            if (colorFilter == null) {
                colorFilter = this.d;
            }
            canvas.getMatrix(this.j);
            this.j.getValues(this.i);
            float f2 = Math.abs((float)this.i[0]);
            float f3 = Math.abs((float)this.i[4]);
            float f4 = Math.abs((float)this.i[1]);
            float f5 = Math.abs((float)this.i[3]);
            if (f4 != 0.0f || f5 != 0.0f) {
                f2 = 1.0f;
                f3 = 1.0f;
            }
            int n2 = (int)(f2 * (float)this.k.width());
            int n3 = (int)(f3 * (float)this.k.height());
            int n4 = Math.min((int)2048, (int)n2);
            int n5 = Math.min((int)2048, (int)n3);
            if (n4 > 0) {
                if (n5 <= 0) {
                    return;
                }
                int n6 = canvas.save();
                Rect rect = this.k;
                canvas.translate((float)rect.left, (float)rect.top);
                if (this.f()) {
                    canvas.translate((float)this.k.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.k.offsetTo(0, 0);
                this.c.c(n4, n5);
                if (!this.g) {
                    this.c.h(n4, n5);
                } else if (!this.c.b()) {
                    this.c.h(n4, n5);
                    this.c.g();
                }
                this.c.d(canvas, colorFilter, this.k);
                canvas.restoreToCount(n6);
            }
        }
    }

    public int getAlpha() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return a.b.d.c.i.a.c(drawable);
        }
        return this.c.b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return Drawable.super.getChangingConfigurations() | this.c.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.a != null && Build.VERSION.SDK_INT >= 24) {
            return new g(this.a.getConstantState());
        }
        this.c.a = this.getChangingConfigurations();
        return this.c;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int)this.c.b.k;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int)this.c.b.j;
    }

    public int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    void h(boolean bl) {
        this.g = bl;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
            return;
        }
        this.inflate(resources, xmlPullParser, attributeSet, null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.a;
        if (drawable != null) {
            a.b.d.c.i.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        f f2 = this.c;
        f2.b = new e();
        TypedArray typedArray = a.b.d.b.d.c.h(resources, theme, attributeSet, a.b.c.a.a.a);
        this.i(typedArray, xmlPullParser);
        typedArray.recycle();
        f2.a = this.getChangingConfigurations();
        f2.k = true;
        this.e(resources, xmlPullParser, attributeSet, theme);
        this.d = this.j(this.d, f2.c, f2.d);
    }

    public void invalidateSelf() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.invalidateSelf();
            return;
        }
        Drawable.super.invalidateSelf();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return a.b.d.c.i.a.g(drawable);
        }
        return this.c.e;
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        f f2;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return Drawable.super.isStateful() || (f2 = this.c) != null && (colorStateList = f2.c) != null && colorStateList.isStateful();
        {
        }
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(this.getState(), 0), mode);
        }
        return null;
    }

    public Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f && Drawable.super.mutate() == this) {
            this.c = new f(this.c);
            this.f = true;
        }
        return this;
    }

    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    protected boolean onStateChange(int[] arrn) {
        PorterDuff.Mode mode;
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(arrn);
        }
        f f2 = this.c;
        ColorStateList colorStateList = f2.c;
        if (colorStateList != null && (mode = f2.d) != null) {
            this.d = this.j(this.d, colorStateList, mode);
            this.invalidateSelf();
            return true;
        }
        return false;
    }

    public void scheduleSelf(Runnable runnable, long l2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, l2);
            return;
        }
        Drawable.super.scheduleSelf(runnable, l2);
    }

    public void setAlpha(int n2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(n2);
            return;
        }
        if (this.c.b.getRootAlpha() != n2) {
            this.c.b.setRootAlpha(n2);
            this.invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean bl) {
        Drawable drawable = this.a;
        if (drawable != null) {
            a.b.d.c.i.a.i(drawable, bl);
            return;
        }
        this.c.e = bl;
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.e = colorFilter;
        this.invalidateSelf();
    }

    @Override
    public void setTint(int n2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            a.b.d.c.i.a.m(drawable, n2);
            return;
        }
        this.setTintList(ColorStateList.valueOf((int)n2));
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            a.b.d.c.i.a.n(drawable, colorStateList);
            return;
        }
        f f2 = this.c;
        if (f2.c != colorStateList) {
            f2.c = colorStateList;
            this.d = this.j(this.d, colorStateList, f2.d);
            this.invalidateSelf();
        }
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            a.b.d.c.i.a.o(drawable, mode);
            return;
        }
        f f2 = this.c;
        if (f2.d != mode) {
            f2.d = mode;
            this.d = this.j(this.d, f2.c, mode);
            this.invalidateSelf();
        }
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setVisible(bl, bl2);
        }
        return Drawable.super.setVisible(bl, bl2);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
            return;
        }
        Drawable.super.unscheduleSelf(runnable);
    }

    private static class a
    extends d {
        public a() {
        }

        public a(a a2) {
            super(a2);
        }

        private void d(TypedArray typedArray) {
            String string;
            String string2 = typedArray.getString(0);
            if (string2 != null) {
                this.b = string2;
            }
            if ((string = typedArray.getString(1)) != null) {
                this.a = a.b.d.c.b.d(string);
            }
        }

        @Override
        public boolean a() {
            return true;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (!a.b.d.b.d.c.g(xmlPullParser, "pathData")) {
                return;
            }
            TypedArray typedArray = a.b.d.b.d.c.h(resources, theme, attributeSet, a.b.c.a.a.d);
            this.d(typedArray);
            typedArray.recycle();
        }
    }

    private static class b
    extends d {
        private int[] d;
        int e = 0;
        float f = 0.0f;
        int g = 0;
        float h = 1.0f;
        int i = 0;
        float j = 1.0f;
        float k = 0.0f;
        float l = 1.0f;
        float m = 0.0f;
        Paint.Cap n = Paint.Cap.BUTT;
        Paint.Join o = Paint.Join.MITER;
        float p = 4.0f;

        public b() {
        }

        public b(b b2) {
            super(b2);
            this.d = b2.d;
            this.e = b2.e;
            this.f = b2.f;
            this.h = b2.h;
            this.g = b2.g;
            this.i = b2.i;
            this.j = b2.j;
            this.k = b2.k;
            this.l = b2.l;
            this.m = b2.m;
            this.n = b2.n;
            this.o = b2.o;
            this.p = b2.p;
        }

        private Paint.Cap c(int n2, Paint.Cap cap) {
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        return cap;
                    }
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }

        private Paint.Join d(int n2, Paint.Join join) {
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        return join;
                    }
                    return Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string;
            this.d = null;
            if (!a.b.d.b.d.c.g(xmlPullParser, "pathData")) {
                return;
            }
            String string2 = typedArray.getString(0);
            if (string2 != null) {
                this.b = string2;
            }
            if ((string = typedArray.getString(2)) != null) {
                this.a = a.b.d.c.b.d(string);
            }
            this.g = a.b.d.b.d.c.b(typedArray, xmlPullParser, "fillColor", 1, this.g);
            this.j = a.b.d.b.d.c.c(typedArray, xmlPullParser, "fillAlpha", 12, this.j);
            this.n = this.c(a.b.d.b.d.c.d(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.n);
            this.o = this.d(a.b.d.b.d.c.d(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.o);
            this.p = a.b.d.b.d.c.c(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.p);
            this.e = a.b.d.b.d.c.b(typedArray, xmlPullParser, "strokeColor", 3, this.e);
            this.h = a.b.d.b.d.c.c(typedArray, xmlPullParser, "strokeAlpha", 11, this.h);
            this.f = a.b.d.b.d.c.c(typedArray, xmlPullParser, "strokeWidth", 4, this.f);
            this.l = a.b.d.b.d.c.c(typedArray, xmlPullParser, "trimPathEnd", 6, this.l);
            this.m = a.b.d.b.d.c.c(typedArray, xmlPullParser, "trimPathOffset", 7, this.m);
            this.k = a.b.d.b.d.c.c(typedArray, xmlPullParser, "trimPathStart", 5, this.k);
            this.i = a.b.d.b.d.c.d(typedArray, xmlPullParser, "fillType", 13, this.i);
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArray = a.b.d.b.d.c.h(resources, theme, attributeSet, a.b.c.a.a.c);
            this.f(typedArray, xmlPullParser);
            typedArray.recycle();
        }

        float getFillAlpha() {
            return this.j;
        }

        int getFillColor() {
            return this.g;
        }

        float getStrokeAlpha() {
            return this.h;
        }

        int getStrokeColor() {
            return this.e;
        }

        float getStrokeWidth() {
            return this.f;
        }

        float getTrimPathEnd() {
            return this.l;
        }

        float getTrimPathOffset() {
            return this.m;
        }

        float getTrimPathStart() {
            return this.k;
        }

        void setFillAlpha(float f2) {
            this.j = f2;
        }

        void setFillColor(int n2) {
            this.g = n2;
        }

        void setStrokeAlpha(float f2) {
            this.h = f2;
        }

        void setStrokeColor(int n2) {
            this.e = n2;
        }

        void setStrokeWidth(float f2) {
            this.f = f2;
        }

        void setTrimPathEnd(float f2) {
            this.l = f2;
        }

        void setTrimPathOffset(float f2) {
            this.m = f2;
        }

        void setTrimPathStart(float f2) {
            this.k = f2;
        }
    }

    private static class c {
        private final Matrix a = new Matrix();
        final ArrayList<Object> b = new ArrayList();
        float c = 0.0f;
        private float d = 0.0f;
        private float e = 0.0f;
        private float f = 1.0f;
        private float g = 1.0f;
        private float h = 0.0f;
        private float i = 0.0f;
        private final Matrix j;
        int k;
        private int[] l;
        private String m;

        public c() {
            this.j = new Matrix();
            this.m = null;
        }

        public c(c c2, a.b.d.h.a<String, Object> a2) {
            String string;
            Matrix matrix;
            this.j = matrix = new Matrix();
            this.m = null;
            this.c = c2.c;
            this.d = c2.d;
            this.e = c2.e;
            this.f = c2.f;
            this.g = c2.g;
            this.h = c2.h;
            this.i = c2.i;
            this.l = c2.l;
            this.m = string = c2.m;
            this.k = c2.k;
            if (string != null) {
                a2.put(string, this);
            }
            matrix.set(c2.j);
            ArrayList<Object> arrayList = c2.b;
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                block8 : {
                    d d2;
                    block7 : {
                        Object object;
                        block6 : {
                            object = arrayList.get(i2);
                            if (object instanceof c) {
                                c c3 = (c)object;
                                this.b.add((Object)new c(c3, a2));
                                continue;
                            }
                            if (!(object instanceof b)) break block6;
                            d2 = new b((b)object);
                            break block7;
                        }
                        if (!(object instanceof a)) break block8;
                        d2 = new a((a)object);
                    }
                    this.b.add((Object)d2);
                    String string2 = d2.b;
                    if (string2 == null) continue;
                    a2.put(string2, d2);
                    continue;
                }
                throw new IllegalStateException("Unknown object in the tree!");
            }
        }

        private void d() {
            this.j.reset();
            this.j.postTranslate(-this.d, -this.e);
            this.j.postScale(this.f, this.g);
            this.j.postRotate(this.c, 0.0f, 0.0f);
            this.j.postTranslate(this.h + this.d, this.i + this.e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.l = null;
            this.c = a.b.d.b.d.c.c(typedArray, xmlPullParser, "rotation", 5, this.c);
            this.d = typedArray.getFloat(1, this.d);
            this.e = typedArray.getFloat(2, this.e);
            this.f = a.b.d.b.d.c.c(typedArray, xmlPullParser, "scaleX", 3, this.f);
            this.g = a.b.d.b.d.c.c(typedArray, xmlPullParser, "scaleY", 4, this.g);
            this.h = a.b.d.b.d.c.c(typedArray, xmlPullParser, "translateX", 6, this.h);
            this.i = a.b.d.b.d.c.c(typedArray, xmlPullParser, "translateY", 7, this.i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.m = string;
            }
            this.d();
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArray = a.b.d.b.d.c.h(resources, theme, attributeSet, a.b.c.a.a.b);
            this.e(typedArray, xmlPullParser);
            typedArray.recycle();
        }

        public String getGroupName() {
            return this.m;
        }

        public Matrix getLocalMatrix() {
            return this.j;
        }

        public float getPivotX() {
            return this.d;
        }

        public float getPivotY() {
            return this.e;
        }

        public float getRotation() {
            return this.c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.g;
        }

        public float getTranslateX() {
            return this.h;
        }

        public float getTranslateY() {
            return this.i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.d) {
                this.d = f2;
                this.d();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.e) {
                this.e = f2;
                this.d();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.c) {
                this.c = f2;
                this.d();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f) {
                this.f = f2;
                this.d();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.g) {
                this.g = f2;
                this.d();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.h) {
                this.h = f2;
                this.d();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.i) {
                this.i = f2;
                this.d();
            }
        }
    }

    private static class d {
        protected b.b[] a = null;
        String b;
        int c;

        public d() {
        }

        public d(d d2) {
            this.b = d2.b;
            this.c = d2.c;
            this.a = a.b.d.c.b.f(d2.a);
        }

        public boolean a() {
            return false;
        }

        public void b(Path path) {
            path.reset();
            b.b[] arrb = this.a;
            if (arrb != null) {
                b.b.e(arrb, path);
            }
        }

        public b.b[] getPathData() {
            return this.a;
        }

        public String getPathName() {
            return this.b;
        }

        public void setPathData(b.b[] arrb) {
            if (!a.b.d.c.b.b(this.a, arrb)) {
                this.a = a.b.d.c.b.f(arrb);
                return;
            }
            a.b.d.c.b.j(this.a, arrb);
        }
    }

    private static class e {
        private static final Matrix a = new Matrix();
        private final Path b;
        private final Path c;
        private final Matrix d = new Matrix();
        private Paint e;
        private Paint f;
        private PathMeasure g;
        private int h;
        final c i;
        float j = 0.0f;
        float k = 0.0f;
        float l = 0.0f;
        float m = 0.0f;
        int n = 255;
        String o = null;
        final a.b.d.h.a<String, Object> p;

        public e() {
            this.p = new a.b.d.h.a();
            this.i = new c();
            this.b = new Path();
            this.c = new Path();
        }

        public e(e e2) {
            a.b.d.h.a<String, Object> a2 = new a.b.d.h.a<String, Object>();
            this.p = a2;
            this.i = new c(e2.i, a2);
            this.b = new Path(e2.b);
            this.c = new Path(e2.c);
            this.j = e2.j;
            this.k = e2.k;
            this.l = e2.l;
            this.m = e2.m;
            this.h = e2.h;
            this.n = e2.n;
            this.o = e2.o;
            String string = e2.o;
            if (string != null) {
                a2.put(string, this);
            }
        }

        private static float e(float f2, float f3, float f4, float f5) {
            return f2 * f5 - f3 * f4;
        }

        private void g(c c2, Matrix matrix, Canvas canvas, int n2, int n3, ColorFilter colorFilter) {
            c2.a.set(matrix);
            c2.a.preConcat(c2.j);
            canvas.save();
            for (int i2 = 0; i2 < c2.b.size(); ++i2) {
                Object object = c2.b.get(i2);
                if (object instanceof c) {
                    this.g((c)object, c2.a, canvas, n2, n3, colorFilter);
                    continue;
                }
                if (!(object instanceof d)) continue;
                this.h(c2, (d)object, canvas, n2, n3, colorFilter);
            }
            canvas.restore();
        }

        private void h(c c2, d d2, Canvas canvas, int n2, int n3, ColorFilter colorFilter) {
            float f2 = (float)n2 / this.l;
            float f3 = (float)n3 / this.m;
            float f4 = Math.min((float)f2, (float)f3);
            Matrix matrix = c2.a;
            this.d.set(matrix);
            this.d.postScale(f2, f3);
            float f5 = this.i(matrix);
            if (f5 == 0.0f) {
                return;
            }
            d2.b(this.b);
            Path path = this.b;
            this.c.reset();
            if (d2.a()) {
                this.c.addPath(path, this.d);
                canvas.clipPath(this.c);
                return;
            }
            b b2 = (b)d2;
            float f6 = b2.k;
            if (f6 != 0.0f || b2.l != 1.0f) {
                float f7 = b2.m;
                float f8 = (f6 + f7) % 1.0f;
                float f9 = (f7 + b2.l) % 1.0f;
                if (this.g == null) {
                    this.g = new PathMeasure();
                }
                this.g.setPath(this.b, false);
                float f10 = this.g.getLength();
                float f11 = f8 * f10;
                float f12 = f9 * f10;
                path.reset();
                if (f11 > f12) {
                    this.g.getSegment(f11, f10, path, true);
                    this.g.getSegment(0.0f, f12, path, true);
                } else {
                    this.g.getSegment(f11, f12, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.c.addPath(path, this.d);
            if (b2.g != 0) {
                if (this.f == null) {
                    Paint paint;
                    this.f = paint = new Paint();
                    paint.setStyle(Paint.Style.FILL);
                    this.f.setAntiAlias(true);
                }
                Paint paint = this.f;
                paint.setColor(h.a(b2.g, b2.j));
                paint.setColorFilter(colorFilter);
                Path path2 = this.c;
                Path.FillType fillType = b2.i == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                path2.setFillType(fillType);
                canvas.drawPath(this.c, paint);
            }
            if (b2.e != 0) {
                Paint.Cap cap;
                if (this.e == null) {
                    Paint paint;
                    this.e = paint = new Paint();
                    paint.setStyle(Paint.Style.STROKE);
                    this.e.setAntiAlias(true);
                }
                Paint paint = this.e;
                Paint.Join join = b2.o;
                if (join != null) {
                    paint.setStrokeJoin(join);
                }
                if ((cap = b2.n) != null) {
                    paint.setStrokeCap(cap);
                }
                paint.setStrokeMiter(b2.p);
                paint.setColor(h.a(b2.e, b2.h));
                paint.setColorFilter(colorFilter);
                paint.setStrokeWidth(f4 * f5 * b2.f);
                canvas.drawPath(this.c, paint);
            }
        }

        private float i(Matrix matrix) {
            float[] arrf = new float[]{0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(arrf);
            float f2 = (float)Math.hypot((double)arrf[0], (double)arrf[1]);
            float f3 = (float)Math.hypot((double)arrf[2], (double)arrf[3]);
            float f4 = e.e(arrf[0], arrf[1], arrf[2], arrf[3]);
            float f5 = Math.max((float)f2, (float)f3);
            float f6 = f5 FCMPL 0.0f;
            float f7 = 0.0f;
            if (f6 > 0) {
                f7 = Math.abs((float)f4) / f5;
            }
            return f7;
        }

        public void f(Canvas canvas, int n2, int n3, ColorFilter colorFilter) {
            this.g(this.i, a, canvas, n2, n3, colorFilter);
        }

        public float getAlpha() {
            return (float)this.getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.n;
        }

        public void setAlpha(float f2) {
            this.setRootAlpha((int)(f2 * 255.0f));
        }

        public void setRootAlpha(int n2) {
            this.n = n2;
        }
    }

    private static class f
    extends Drawable.ConstantState {
        int a;
        e b;
        ColorStateList c = null;
        PorterDuff.Mode d = h.b;
        boolean e;
        Bitmap f;
        ColorStateList g;
        PorterDuff.Mode h;
        int i;
        boolean j;
        boolean k;
        Paint l;

        public f() {
            this.b = new e();
        }

        public f(f f2) {
            if (f2 != null) {
                this.a = f2.a;
                this.b = new e(f2.b);
                if (f2.b.f != null) {
                    this.b.f = new Paint(f2.b.f);
                }
                if (f2.b.e != null) {
                    this.b.e = new Paint(f2.b.e);
                }
                this.c = f2.c;
                this.d = f2.d;
                this.e = f2.e;
            }
        }

        public boolean a(int n2, int n3) {
            return n2 == this.f.getWidth() && n3 == this.f.getHeight();
        }

        public boolean b() {
            return !this.k && this.g == this.c && this.h == this.d && this.j == this.e && this.i == this.b.getRootAlpha();
        }

        public void c(int n2, int n3) {
            if (this.f == null || !this.a(n2, n3)) {
                this.f = Bitmap.createBitmap((int)n2, (int)n3, (Bitmap.Config)Bitmap.Config.ARGB_8888);
                this.k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            Paint paint = this.e(colorFilter);
            canvas.drawBitmap(this.f, null, rect, paint);
        }

        public Paint e(ColorFilter colorFilter) {
            if (!this.f() && colorFilter == null) {
                return null;
            }
            if (this.l == null) {
                Paint paint;
                this.l = paint = new Paint();
                paint.setFilterBitmap(true);
            }
            this.l.setAlpha(this.b.getRootAlpha());
            this.l.setColorFilter(colorFilter);
            return this.l;
        }

        public boolean f() {
            return this.b.getRootAlpha() < 255;
        }

        public void g() {
            this.g = this.c;
            this.h = this.d;
            this.i = this.b.getRootAlpha();
            this.j = this.e;
            this.k = false;
        }

        public int getChangingConfigurations() {
            return this.a;
        }

        public void h(int n2, int n3) {
            this.f.eraseColor(0);
            Canvas canvas = new Canvas(this.f);
            this.b.f(canvas, n2, n3, null);
        }

        public Drawable newDrawable() {
            return new h(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new h(this);
        }
    }

    private static class g
    extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public g(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            h h2 = new h();
            h2.a = (VectorDrawable)this.a.newDrawable();
            return h2;
        }

        public Drawable newDrawable(Resources resources) {
            h h2 = new h();
            h2.a = (VectorDrawable)this.a.newDrawable(resources);
            return h2;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h h2 = new h();
            h2.a = (VectorDrawable)this.a.newDrawable(resources, theme);
            return h2;
        }
    }

}

