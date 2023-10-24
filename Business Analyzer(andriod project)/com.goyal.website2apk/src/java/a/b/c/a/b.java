/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorSet
 *  android.animation.ArgbEvaluator
 *  android.animation.ObjectAnimator
 *  android.animation.TypeEvaluator
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.graphics.Region
 *  android.graphics.drawable.Animatable
 *  android.graphics.drawable.AnimatedVectorDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.graphics.drawable.Drawable$ConstantState
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  org.xmlpull.v1.XmlPullParser
 */
package a.b.c.a;

import a.b.c.a.d;
import a.b.c.a.g;
import a.b.c.a.h;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Collection;
import org.xmlpull.v1.XmlPullParser;

public class b
extends g
implements Animatable {
    private b b;
    private Context c;
    private ArgbEvaluator d = null;
    private Animator.AnimatorListener e = null;
    private ArrayList<?> f = null;
    final Drawable.Callback g;

    b() {
        this(null, null, null);
    }

    private b(Context context) {
        this(context, null, null);
    }

    private b(Context context, b b2, Resources resources) {
        Drawable.Callback callback;
        this.g = callback = new Drawable.Callback(){

            public void invalidateDrawable(Drawable drawable) {
                b.this.invalidateSelf();
            }

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long l2) {
                b.this.scheduleSelf(runnable, l2);
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                b.this.unscheduleSelf(runnable);
            }
        };
        this.c = context;
        if (b2 != null) {
            this.b = b2;
            return;
        }
        this.b = new b(context, b2, callback, resources);
    }

    public static b a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        b b2 = new b(context);
        b2.inflate(resources, xmlPullParser, attributeSet, theme);
        return b2;
    }

    private void b(String string, Animator animator) {
        animator.setTarget(this.b.b.d(string));
        if (Build.VERSION.SDK_INT < 21) {
            this.c(animator);
        }
        if (this.b.d == null) {
            this.b.d = new ArrayList();
            this.b.e = new a.b.d.h.a();
        }
        this.b.d.add((Object)animator);
        this.b.e.put(animator, string);
    }

    private void c(Animator animator) {
        ObjectAnimator objectAnimator;
        String string;
        ArrayList arrayList;
        if (animator instanceof AnimatorSet && (arrayList = ((AnimatorSet)animator).getChildAnimations()) != null) {
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                this.c((Animator)arrayList.get(i2));
            }
        }
        if (animator instanceof ObjectAnimator && ("fillColor".equals((Object)(string = (objectAnimator = (ObjectAnimator)animator).getPropertyName())) || "strokeColor".equals((Object)string))) {
            if (this.d == null) {
                this.d = new ArgbEvaluator();
            }
            objectAnimator.setEvaluator((TypeEvaluator)this.d);
        }
    }

    @Override
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.a;
        if (drawable != null) {
            a.b.d.c.i.a.a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return a.b.d.c.i.a.b(drawable);
        }
        return false;
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.b.b.draw(canvas);
        if (this.b.c.isStarted()) {
            this.invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return a.b.d.c.i.a.c(drawable);
        }
        return this.b.b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return Drawable.super.getChangingConfigurations() | this.b.a;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.a != null && Build.VERSION.SDK_INT >= 24) {
            return new c(this.a.getConstantState());
        }
        return null;
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.b.b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.b.b.getIntrinsicWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.b.b.getOpacity();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        this.inflate(resources, xmlPullParser, attributeSet, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.a;
        if (drawable != null) {
            a.b.d.c.i.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int n2 = xmlPullParser.getEventType();
        int n3 = 1 + xmlPullParser.getDepth();
        while (n2 != 1 && (xmlPullParser.getDepth() >= n3 || n2 != 3)) {
            block10 : {
                TypedArray typedArray;
                block12 : {
                    String string;
                    block11 : {
                        if (n2 != 2) break block10;
                        string = xmlPullParser.getName();
                        if (!"animated-vector".equals((Object)string)) break block11;
                        typedArray = a.b.d.b.d.c.h(resources, theme, attributeSet, a.b.c.a.a.e);
                        int n4 = typedArray.getResourceId(0, 0);
                        if (n4 != 0) {
                            h h2 = h.b(resources, n4, theme);
                            h2.h(false);
                            h2.setCallback(this.g);
                            h h3 = this.b.b;
                            if (h3 != null) {
                                h3.setCallback(null);
                            }
                            this.b.b = h2;
                        }
                        break block12;
                    }
                    if (!"target".equals((Object)string)) break block10;
                    typedArray = resources.obtainAttributes(attributeSet, a.b.c.a.a.f);
                    String string2 = typedArray.getString(0);
                    int n5 = typedArray.getResourceId(1, 0);
                    if (n5 != 0) {
                        Context context = this.c;
                        if (context == null) {
                            typedArray.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        this.b(string2, d.i(context, n5));
                    }
                }
                typedArray.recycle();
            }
            n2 = xmlPullParser.next();
        }
        this.b.c();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return a.b.d.c.i.a.g(drawable);
        }
        return this.b.b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable)drawable).isRunning();
        }
        return this.b.c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.b.b.isStateful();
    }

    public Drawable mutate() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(rect);
            return;
        }
        this.b.b.setBounds(rect);
    }

    @Override
    protected boolean onLevelChange(int n2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setLevel(n2);
        }
        return this.b.b.setLevel(n2);
    }

    protected boolean onStateChange(int[] arrn) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setState(arrn);
        }
        return this.b.b.setState(arrn);
    }

    public void setAlpha(int n2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setAlpha(n2);
            return;
        }
        this.b.b.setAlpha(n2);
    }

    public void setAutoMirrored(boolean bl) {
        Drawable drawable = this.a;
        if (drawable != null) {
            a.b.d.c.i.a.i(drawable, bl);
            return;
        }
        this.b.b.setAutoMirrored(bl);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.b.b.setColorFilter(colorFilter);
    }

    @Override
    public void setTint(int n2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            a.b.d.c.i.a.m(drawable, n2);
            return;
        }
        this.b.b.setTint(n2);
    }

    @Override
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.a;
        if (drawable != null) {
            a.b.d.c.i.a.n(drawable, colorStateList);
            return;
        }
        this.b.b.setTintList(colorStateList);
    }

    @Override
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.a;
        if (drawable != null) {
            a.b.d.c.i.a.o(drawable, mode);
            return;
        }
        this.b.b.setTintMode(mode);
    }

    public boolean setVisible(boolean bl, boolean bl2) {
        Drawable drawable = this.a;
        if (drawable != null) {
            return drawable.setVisible(bl, bl2);
        }
        this.b.b.setVisible(bl, bl2);
        return Drawable.super.setVisible(bl, bl2);
    }

    public void start() {
        Drawable drawable = this.a;
        if (drawable != null) {
            ((AnimatedVectorDrawable)drawable).start();
            return;
        }
        if (this.b.c.isStarted()) {
            return;
        }
        this.b.c.start();
        this.invalidateSelf();
    }

    public void stop() {
        Drawable drawable = this.a;
        if (drawable != null) {
            ((AnimatedVectorDrawable)drawable).stop();
            return;
        }
        this.b.c.end();
    }

    private static class b
    extends Drawable.ConstantState {
        int a;
        h b;
        AnimatorSet c;
        private ArrayList<Animator> d;
        a.b.d.h.a<Animator, String> e;

        public b(Context context, b b2, Drawable.Callback callback, Resources resources) {
            if (b2 != null) {
                ArrayList<Animator> arrayList;
                this.a = b2.a;
                h h2 = b2.b;
                int n2 = 0;
                if (h2 != null) {
                    h h3;
                    Drawable.ConstantState constantState = h2.getConstantState();
                    Drawable drawable = resources != null ? constantState.newDrawable(resources) : constantState.newDrawable();
                    this.b = (h)drawable;
                    this.b = h3 = (h)this.b.mutate();
                    h3.setCallback(callback);
                    this.b.setBounds(b2.b.getBounds());
                    this.b.h(false);
                }
                if ((arrayList = b2.d) != null) {
                    int n3 = arrayList.size();
                    this.d = new ArrayList(n3);
                    this.e = new a.b.d.h.a(n3);
                    while (n2 < n3) {
                        Animator animator = (Animator)b2.d.get(n2);
                        Animator animator2 = animator.clone();
                        String string = (String)b2.e.get((Object)animator);
                        animator2.setTarget(this.b.d(string));
                        this.d.add((Object)animator2);
                        this.e.put(animator2, string);
                        ++n2;
                    }
                    this.c();
                }
            }
        }

        public void c() {
            if (this.c == null) {
                this.c = new AnimatorSet();
            }
            this.c.playTogether(this.d);
        }

        public int getChangingConfigurations() {
            return this.a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    private static class c
    extends Drawable.ConstantState {
        private final Drawable.ConstantState a;

        public c(Drawable.ConstantState constantState) {
            this.a = constantState;
        }

        public boolean canApplyTheme() {
            return this.a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            Drawable drawable;
            b b2 = new b();
            b2.a = drawable = this.a.newDrawable();
            drawable.setCallback(b2.g);
            return b2;
        }

        public Drawable newDrawable(Resources resources) {
            Drawable drawable;
            b b2 = new b();
            b2.a = drawable = this.a.newDrawable(resources);
            drawable.setCallback(b2.g);
            return b2;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            Drawable drawable;
            b b2 = new b();
            b2.a = drawable = this.a.newDrawable(resources, theme);
            drawable.setCallback(b2.g);
            return b2;
        }
    }

}

