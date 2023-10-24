/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.graphics.Paint
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.ViewPropertyAnimator
 *  android.view.animation.Interpolator
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.ref.WeakReference
 */
package a.b.d.i;

import a.b.d.i.u;
import a.b.d.i.w;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class t {
    private WeakReference<View> a;
    Runnable b = null;
    Runnable c = null;
    int d = -1;

    t(View view) {
        this.a = new WeakReference((Object)view);
    }

    private void g(final View view, final u u2) {
        if (u2 != null) {
            view.animate().setListener((Animator.AnimatorListener)new AnimatorListenerAdapter(){

                public void onAnimationCancel(Animator animator) {
                    u2.c(view);
                }

                public void onAnimationEnd(Animator animator) {
                    u2.a(view);
                }

                public void onAnimationStart(Animator animator) {
                    u2.b(view);
                }
            });
            return;
        }
        view.animate().setListener(null);
    }

    public t a(float f2) {
        View view = (View)this.a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public void b() {
        View view = (View)this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = (View)this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public t d(long l2) {
        View view = (View)this.a.get();
        if (view != null) {
            view.animate().setDuration(l2);
        }
        return this;
    }

    public t e(Interpolator interpolator) {
        View view = (View)this.a.get();
        if (view != null) {
            view.animate().setInterpolator((TimeInterpolator)interpolator);
        }
        return this;
    }

    public t f(u u2) {
        View view = (View)this.a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, (Object)u2);
                u2 = new c(this);
            }
            this.g(view, u2);
        }
        return this;
    }

    public t h(long l2) {
        View view = (View)this.a.get();
        if (view != null) {
            view.animate().setStartDelay(l2);
        }
        return this;
    }

    public t i(final w w2) {
        final View view = (View)this.a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
            if (w2 != null) {
                animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener(){

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        w2.a(view);
                    }
                };
            }
            view.animate().setUpdateListener(animatorUpdateListener);
        }
        return this;
    }

    public void j() {
        View view = (View)this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public t k(float f2) {
        View view = (View)this.a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }

    static class c
    implements u {
        t a;
        boolean b;

        c(t t2) {
            this.a = t2;
        }

        @Override
        public void a(View view) {
            int n2 = this.a.d;
            if (n2 > -1) {
                view.setLayerType(n2, null);
                this.a.d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.b) {
                t t2 = this.a;
                Runnable runnable = t2.c;
                if (runnable != null) {
                    t2.c = null;
                    runnable.run();
                }
                Object object = view.getTag(2113929216);
                boolean bl = object instanceof u;
                u u2 = null;
                if (bl) {
                    u2 = (u)object;
                }
                if (u2 != null) {
                    u2.a(view);
                }
                this.b = true;
            }
        }

        @Override
        public void b(View view) {
            this.b = false;
            if (this.a.d > -1) {
                view.setLayerType(2, null);
            }
            t t2 = this.a;
            Runnable runnable = t2.b;
            if (runnable != null) {
                t2.b = null;
                runnable.run();
            }
            Object object = view.getTag(2113929216);
            boolean bl = object instanceof u;
            u u2 = null;
            if (bl) {
                u2 = (u)object;
            }
            if (u2 != null) {
                u2.b(view);
            }
        }

        @Override
        public void c(View view) {
            Object object = view.getTag(2113929216);
            u u2 = object instanceof u ? (u)object : null;
            if (u2 != null) {
                u2.c(view);
            }
        }
    }

}

