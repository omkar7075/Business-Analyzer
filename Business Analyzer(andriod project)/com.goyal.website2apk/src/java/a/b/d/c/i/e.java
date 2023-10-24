/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.graphics.Outline
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.DrawableContainer
 *  android.graphics.drawable.GradientDrawable
 *  android.graphics.drawable.InsetDrawable
 *  android.graphics.drawable.RippleDrawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 */
package a.b.d.c.i;

import a.b.d.c.i.c;
import a.b.d.c.i.d;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.Method;

class e
extends d {
    private static Method h;

    e(c.a a2, Resources resources) {
        super(a2, resources);
        this.h();
    }

    e(Drawable drawable) {
        super(drawable);
        this.h();
    }

    private void h() {
        if (h == null) {
            try {
                h = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
                return;
            }
            catch (Exception exception) {
                Log.w((String)"DrawableWrapperApi21", (String)"Failed to retrieve Drawable#isProjected() method", (Throwable)exception);
            }
        }
    }

    @Override
    protected boolean c() {
        boolean bl;
        block2 : {
            block3 : {
                int n2 = Build.VERSION.SDK_INT;
                bl = false;
                if (n2 != 21) break block2;
                Drawable drawable = this.g;
                if (drawable instanceof GradientDrawable || drawable instanceof DrawableContainer || drawable instanceof InsetDrawable) break block3;
                boolean bl2 = drawable instanceof RippleDrawable;
                bl = false;
                if (!bl2) break block2;
            }
            bl = true;
        }
        return bl;
    }

    @Override
    c.a d() {
        return new a(this.e, null);
    }

    public Rect getDirtyBounds() {
        return this.g.getDirtyBounds();
    }

    public void getOutline(Outline outline) {
        this.g.getOutline(outline);
    }

    public boolean isProjected() {
        Method method;
        Drawable drawable = this.g;
        if (drawable != null && (method = h) != null) {
            try {
                boolean bl = (Boolean)method.invoke((Object)drawable, new Object[0]);
                return bl;
            }
            catch (Exception exception) {
                Log.w((String)"DrawableWrapperApi21", (String)"Error calling Drawable#isProjected() method", (Throwable)exception);
            }
        }
        return false;
    }

    public void setHotspot(float f2, float f3) {
        this.g.setHotspot(f2, f3);
    }

    public void setHotspotBounds(int n2, int n3, int n4, int n5) {
        this.g.setHotspotBounds(n2, n3, n4, n5);
    }

    @Override
    public boolean setState(int[] arrn) {
        if (c.super.setState(arrn)) {
            this.invalidateSelf();
            return true;
        }
        return false;
    }

    @Override
    public void setTint(int n2) {
        if (this.c()) {
            c.super.setTint(n2);
            return;
        }
        this.g.setTint(n2);
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        if (this.c()) {
            c.super.setTintList(colorStateList);
            return;
        }
        this.g.setTintList(colorStateList);
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.c()) {
            c.super.setTintMode(mode);
            return;
        }
        this.g.setTintMode(mode);
    }

    private static class a
    extends c.a {
        a(c.a a2, Resources resources) {
            super(a2, resources);
        }

        @Override
        public Drawable newDrawable(Resources resources) {
            return new e(this, resources);
        }
    }

}

