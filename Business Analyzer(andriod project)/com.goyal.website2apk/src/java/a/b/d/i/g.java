/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.view.MenuItem
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package a.b.d.i;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;

public final class g {
    static final c a;

    static {
        b b2 = Build.VERSION.SDK_INT >= 26 ? new a() : new b();
        a = b2;
    }

    public static MenuItem a(MenuItem menuItem, a.b.d.i.c c2) {
        if (menuItem instanceof a.b.d.d.a.b) {
            return ((a.b.d.d.a.b)menuItem).b(c2);
        }
        Log.w((String)"MenuItemCompat", (String)"setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void b(MenuItem menuItem, char c2, int n2) {
        if (menuItem instanceof a.b.d.d.a.b) {
            ((a.b.d.d.a.b)menuItem).setAlphabeticShortcut(c2, n2);
            return;
        }
        a.a(menuItem, c2, n2);
    }

    public static void c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof a.b.d.d.a.b) {
            ((a.b.d.d.a.b)menuItem).setContentDescription(charSequence);
            return;
        }
        a.c(menuItem, charSequence);
    }

    public static void d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof a.b.d.d.a.b) {
            ((a.b.d.d.a.b)menuItem).setIconTintList(colorStateList);
            return;
        }
        a.f(menuItem, colorStateList);
    }

    public static void e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof a.b.d.d.a.b) {
            ((a.b.d.d.a.b)menuItem).setIconTintMode(mode);
            return;
        }
        a.b(menuItem, mode);
    }

    public static void f(MenuItem menuItem, char c2, int n2) {
        if (menuItem instanceof a.b.d.d.a.b) {
            ((a.b.d.d.a.b)menuItem).setNumericShortcut(c2, n2);
            return;
        }
        a.d(menuItem, c2, n2);
    }

    public static void g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof a.b.d.d.a.b) {
            ((a.b.d.d.a.b)menuItem).setTooltipText(charSequence);
            return;
        }
        a.e(menuItem, charSequence);
    }

    static class a
    extends b {
        a() {
        }

        @Override
        public void a(MenuItem menuItem, char c2, int n2) {
            menuItem.setAlphabeticShortcut(c2, n2);
        }

        @Override
        public void b(MenuItem menuItem, PorterDuff.Mode mode) {
            menuItem.setIconTintMode(mode);
        }

        @Override
        public void c(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setContentDescription(charSequence);
        }

        @Override
        public void d(MenuItem menuItem, char c2, int n2) {
            menuItem.setNumericShortcut(c2, n2);
        }

        @Override
        public void e(MenuItem menuItem, CharSequence charSequence) {
            menuItem.setTooltipText(charSequence);
        }

        @Override
        public void f(MenuItem menuItem, ColorStateList colorStateList) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    static class b
    implements c {
        b() {
        }

        @Override
        public void a(MenuItem menuItem, char c2, int n2) {
        }

        @Override
        public void b(MenuItem menuItem, PorterDuff.Mode mode) {
        }

        @Override
        public void c(MenuItem menuItem, CharSequence charSequence) {
        }

        @Override
        public void d(MenuItem menuItem, char c2, int n2) {
        }

        @Override
        public void e(MenuItem menuItem, CharSequence charSequence) {
        }

        @Override
        public void f(MenuItem menuItem, ColorStateList colorStateList) {
        }
    }

    static interface c {
        public void a(MenuItem var1, char var2, int var3);

        public void b(MenuItem var1, PorterDuff.Mode var2);

        public void c(MenuItem var1, CharSequence var2);

        public void d(MenuItem var1, char var2, int var3);

        public void e(MenuItem var1, CharSequence var2);

        public void f(MenuItem var1, ColorStateList var2);
    }

}

