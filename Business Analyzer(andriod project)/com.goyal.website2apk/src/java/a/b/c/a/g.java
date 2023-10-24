/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.Region
 *  android.graphics.drawable.Drawable
 */
package a.b.c.a;

import a.b.d.c.i.a;
import a.b.d.c.i.f;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

abstract class g
extends Drawable
implements f {
    Drawable a;

    g() {
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.a;
        if (drawable != null) {
            a.a(drawable, theme);
        }
    }

    public void clearColorFilter() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.clearColorFilter();
            return;
        }
        super.clearColorFilter();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return a.d(drawable);
        }
        return null;
    }

    public Drawable getCurrent() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumHeight() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public boolean getPadding(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    public int[] getState() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        Drawable drawable = this.a;
        if (drawable != null) {
            a.h(drawable);
        }
    }

    protected boolean onLevelChange(int n2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setLevel(n2);
        }
        return super.onLevelChange(n2);
    }

    public void setChangingConfigurations(int n2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setChangingConfigurations(n2);
            return;
        }
        super.setChangingConfigurations(n2);
    }

    public void setColorFilter(int n2, PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(n2, mode);
            return;
        }
        super.setColorFilter(n2, mode);
    }

    public void setFilterBitmap(boolean bl) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setFilterBitmap(bl);
        }
    }

    public void setHotspot(float f2, float f3) {
        Drawable drawable = this.a;
        if (drawable != null) {
            a.j(drawable, f2, f3);
        }
    }

    public void setHotspotBounds(int n2, int n3, int n4, int n5) {
        Drawable drawable = this.a;
        if (drawable != null) {
            a.k(drawable, n2, n3, n4, n5);
        }
    }

    public boolean setState(int[] arrn) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(arrn);
        }
        return super.setState(arrn);
    }
}

