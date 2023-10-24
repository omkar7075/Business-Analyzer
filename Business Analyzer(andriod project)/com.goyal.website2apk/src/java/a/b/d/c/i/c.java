/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.Region
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.graphics.drawable.Drawable$ConstantState
 *  java.lang.Runnable
 */
package a.b.d.c.i;

import a.b.d.c.i.f;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

class c
extends Drawable
implements Drawable.Callback,
a.b.d.c.i.b,
f {
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    private int b;
    private PorterDuff.Mode c;
    private boolean d;
    a e;
    private boolean f;
    Drawable g;

    c(a a2, Resources resources) {
        this.e = a2;
        this.f(resources);
    }

    c(Drawable drawable) {
        this.e = this.d();
        this.b(drawable);
    }

    private void f(Resources resources) {
        Drawable.ConstantState constantState;
        a a2 = this.e;
        if (a2 != null && (constantState = a2.b) != null) {
            this.b(this.e(constantState, resources));
        }
    }

    private boolean g(int[] arrn) {
        if (!this.c()) {
            return false;
        }
        a a2 = this.e;
        ColorStateList colorStateList = a2.c;
        PorterDuff.Mode mode = a2.d;
        if (colorStateList != null && mode != null) {
            int n2 = colorStateList.getColorForState(arrn, colorStateList.getDefaultColor());
            if (!this.d || n2 != this.b || mode != this.c) {
                this.setColorFilter(n2, mode);
                this.b = n2;
                this.c = mode;
                this.d = true;
                return true;
            }
        } else {
            this.d = false;
            this.clearColorFilter();
        }
        return false;
    }

    @Override
    public final Drawable a() {
        return this.g;
    }

    @Override
    public final void b(Drawable drawable) {
        Drawable drawable2 = this.g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.g = drawable;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback)this);
            this.setVisible(drawable.isVisible(), true);
            this.setState(drawable.getState());
            this.setLevel(drawable.getLevel());
            this.setBounds(drawable.getBounds());
            a a2 = this.e;
            if (a2 != null) {
                a2.b = drawable.getConstantState();
            }
        }
        this.invalidateSelf();
    }

    protected boolean c() {
        return true;
    }

    a d() {
        return new b(this.e, null);
    }

    public void draw(Canvas canvas) {
        this.g.draw(canvas);
    }

    protected Drawable e(Drawable.ConstantState constantState, Resources resources) {
        return constantState.newDrawable(resources);
    }

    public int getChangingConfigurations() {
        int n2 = super.getChangingConfigurations();
        a a2 = this.e;
        int n3 = a2 != null ? a2.getChangingConfigurations() : 0;
        return n2 | n3 | this.g.getChangingConfigurations();
    }

    public Drawable.ConstantState getConstantState() {
        a a2 = this.e;
        if (a2 != null && a2.a()) {
            this.e.a = this.getChangingConfigurations();
            return this.e;
        }
        return null;
    }

    public Drawable getCurrent() {
        return this.g.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.g.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.g.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.g.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.g.getMinimumWidth();
    }

    public int getOpacity() {
        return this.g.getOpacity();
    }

    public boolean getPadding(Rect rect) {
        return this.g.getPadding(rect);
    }

    public int[] getState() {
        return this.g.getState();
    }

    public Region getTransparentRegion() {
        return this.g.getTransparentRegion();
    }

    public void invalidateDrawable(Drawable drawable) {
        this.invalidateSelf();
    }

    public boolean isStateful() {
        a a2;
        ColorStateList colorStateList = this.c() && (a2 = this.e) != null ? a2.c : null;
        return colorStateList != null && colorStateList.isStateful() || this.g.isStateful();
    }

    public void jumpToCurrentState() {
        this.g.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (!this.f && super.mutate() == this) {
            a a2;
            this.e = this.d();
            Drawable drawable = this.g;
            if (drawable != null) {
                drawable.mutate();
            }
            if ((a2 = this.e) != null) {
                Drawable drawable2 = this.g;
                Drawable.ConstantState constantState = drawable2 != null ? drawable2.getConstantState() : null;
                a2.b = constantState;
            }
            this.f = true;
        }
        return this;
    }

    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    protected boolean onLevelChange(int n2) {
        return this.g.setLevel(n2);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l2) {
        this.scheduleSelf(runnable, l2);
    }

    public void setAlpha(int n2) {
        this.g.setAlpha(n2);
    }

    public void setChangingConfigurations(int n2) {
        this.g.setChangingConfigurations(n2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.g.setColorFilter(colorFilter);
    }

    public void setDither(boolean bl) {
        this.g.setDither(bl);
    }

    public void setFilterBitmap(boolean bl) {
        this.g.setFilterBitmap(bl);
    }

    public boolean setState(int[] arrn) {
        boolean bl = this.g.setState(arrn);
        return this.g(arrn) || bl;
        {
        }
    }

    @Override
    public void setTint(int n2) {
        this.setTintList(ColorStateList.valueOf((int)n2));
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        this.e.c = colorStateList;
        this.g(this.getState());
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        this.e.d = mode;
        this.g(this.getState());
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        return super.setVisible(bl, bl2) || this.g.setVisible(bl, bl2);
        {
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.unscheduleSelf(runnable);
    }

    protected static abstract class a
    extends Drawable.ConstantState {
        int a;
        Drawable.ConstantState b;
        ColorStateList c = null;
        PorterDuff.Mode d = c.a;

        a(a a2, Resources resources) {
            if (a2 != null) {
                this.a = a2.a;
                this.b = a2.b;
                this.c = a2.c;
                this.d = a2.d;
            }
        }

        boolean a() {
            return this.b != null;
        }

        public int getChangingConfigurations() {
            int n2 = this.a;
            Drawable.ConstantState constantState = this.b;
            int n3 = constantState != null ? constantState.getChangingConfigurations() : 0;
            return n2 | n3;
        }

        public Drawable newDrawable() {
            return this.newDrawable(null);
        }

        public abstract Drawable newDrawable(Resources var1);
    }

    private static class b
    extends a {
        b(a a2, Resources resources) {
            super(a2, resources);
        }

        @Override
        public Drawable newDrawable(Resources resources) {
            return new c(this, resources);
        }
    }

}

