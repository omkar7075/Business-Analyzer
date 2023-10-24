/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.Region
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  java.lang.Runnable
 */
package a.b.e.c.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public class a
extends Drawable
implements Drawable.Callback {
    private Drawable a;

    public a(Drawable drawable) {
        this.b(drawable);
    }

    public Drawable a() {
        return this.a;
    }

    public void b(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback)this);
        }
    }

    public void draw(Canvas canvas) {
        this.a.draw(canvas);
    }

    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.a.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.a.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.a.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.a.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.a.getMinimumWidth();
    }

    public int getOpacity() {
        return this.a.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.a.getPadding(rect);
    }

    public int[] getState() {
        return this.a.getState();
    }

    public Region getTransparentRegion() {
        return this.a.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        this.invalidateSelf();
    }

    public boolean isAutoMirrored() {
        return a.b.d.c.i.a.g(this.a);
    }

    public boolean isStateful() {
        return this.a.isStateful();
    }

    public void jumpToCurrentState() {
        a.b.d.c.i.a.h(this.a);
    }

    protected void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
    }

    protected boolean onLevelChange(int n2) {
        return this.a.setLevel(n2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l2) {
        this.scheduleSelf(runnable, l2);
    }

    public void setAlpha(int n2) {
        this.a.setAlpha(n2);
    }

    public void setAutoMirrored(boolean bl) {
        a.b.d.c.i.a.i(this.a, bl);
    }

    public void setChangingConfigurations(int n2) {
        this.a.setChangingConfigurations(n2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
    }

    public void setDither(boolean bl) {
        this.a.setDither(bl);
    }

    public void setFilterBitmap(boolean bl) {
        this.a.setFilterBitmap(bl);
    }

    public void setHotspot(float f2, float f3) {
        a.b.d.c.i.a.j(this.a, f2, f3);
    }

    public void setHotspotBounds(int n2, int n3, int n4, int n5) {
        a.b.d.c.i.a.k(this.a, n2, n3, n4, n5);
    }

    public boolean setState(int[] arrn) {
        return this.a.setState(arrn);
    }

    public void setTint(int n2) {
        a.b.d.c.i.a.m(this.a, n2);
    }

    public void setTintList(ColorStateList colorStateList) {
        a.b.d.c.i.a.n(this.a, colorStateList);
    }

    public void setTintMode(PorterDuff.Mode mode) {
        a.b.d.c.i.a.o(this.a, mode);
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        return super.setVisible(bl, bl2) || this.a.setVisible(bl, bl2);
        {
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.unscheduleSelf(runnable);
    }
}

