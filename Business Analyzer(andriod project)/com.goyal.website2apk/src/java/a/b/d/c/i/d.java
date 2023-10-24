/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 */
package a.b.d.c.i;

import a.b.d.c.i.c;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

class d
extends c {
    d(c.a a2, Resources resources) {
        super(a2, resources);
    }

    d(Drawable drawable) {
        super(drawable);
    }

    @Override
    c.a d() {
        return new a(this.e, null);
    }

    public boolean isAutoMirrored() {
        return this.g.isAutoMirrored();
    }

    public void setAutoMirrored(boolean bl) {
        this.g.setAutoMirrored(bl);
    }

    private static class a
    extends c.a {
        a(c.a a2, Resources resources) {
            super(a2, resources);
        }

        @Override
        public Drawable newDrawable(Resources resources) {
            return new d(this, resources);
        }
    }

}

