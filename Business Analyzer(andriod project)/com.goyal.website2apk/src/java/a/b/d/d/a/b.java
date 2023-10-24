/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.view.MenuItem
 *  android.view.View
 *  java.lang.CharSequence
 *  java.lang.Object
 */
package a.b.d.d.a;

import a.b.d.i.c;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;

public interface b
extends MenuItem {
    public c a();

    public b b(c var1);

    public boolean collapseActionView();

    public boolean expandActionView();

    public View getActionView();

    public int getAlphabeticModifiers();

    public CharSequence getContentDescription();

    public ColorStateList getIconTintList();

    public PorterDuff.Mode getIconTintMode();

    public int getNumericModifiers();

    public CharSequence getTooltipText();

    public boolean isActionViewExpanded();

    public MenuItem setActionView(int var1);

    public MenuItem setActionView(View var1);

    public MenuItem setAlphabeticShortcut(char var1, int var2);

    public b setContentDescription(CharSequence var1);

    public MenuItem setIconTintList(ColorStateList var1);

    public MenuItem setIconTintMode(PorterDuff.Mode var1);

    public MenuItem setNumericShortcut(char var1, int var2);

    public MenuItem setShortcut(char var1, char var2, int var3, int var4);

    public void setShowAsAction(int var1);

    public MenuItem setShowAsActionFlags(int var1);

    public b setTooltipText(CharSequence var1);
}

