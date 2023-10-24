/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.support.v7.view.menu.j
 *  android.support.v7.view.menu.k
 *  android.support.v7.widget.g0
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.InflateException
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.SubMenu
 *  android.view.View
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.Method
 *  org.xmlpull.v1.XmlPullParser
 */
package a.b.e.e;

import a.b.d.i.c;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.support.v7.view.menu.j;
import android.support.v7.view.menu.k;
import android.support.v7.widget.g0;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

public class g
extends MenuInflater {
    static final Class<?>[] a;
    static final Class<?>[] b;
    final Object[] c;
    final Object[] d;
    Context e;
    private Object f;

    static {
        Class[] arrclass = new Class[]{Context.class};
        a = arrclass;
        b = arrclass;
    }

    public g(Context context) {
        super(context);
        this.e = context;
        Object[] arrobject = new Object[]{context};
        this.c = arrobject;
        this.d = arrobject;
    }

    private Object a(Object object) {
        if (object instanceof Activity) {
            return object;
        }
        if (object instanceof ContextWrapper) {
            object = this.a((Object)((ContextWrapper)object).getBaseContext());
        }
        return object;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b b2 = new b(menu);
        int n2 = xmlPullParser.getEventType();
        do {
            if (n2 != 2) continue;
            String string = xmlPullParser.getName();
            if (string.equals((Object)"menu")) {
                n2 = xmlPullParser.next();
                break;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expecting menu, got ");
            stringBuilder.append(string);
            throw new RuntimeException(stringBuilder.toString());
        } while ((n2 = xmlPullParser.next()) != 1);
        String string = null;
        boolean bl = false;
        boolean bl2 = false;
        while (!bl) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 == 3) {
                        String string2 = xmlPullParser.getName();
                        if (bl2 && string2.equals(string)) {
                            bl2 = false;
                            string = null;
                        } else if (string2.equals((Object)"group")) {
                            b2.h();
                        } else if (string2.equals((Object)"item")) {
                            if (!b2.d()) {
                                c c2 = b2.A;
                                if (c2 != null && c2.a()) {
                                    b2.b();
                                } else {
                                    b2.a();
                                }
                            }
                        } else if (string2.equals((Object)"menu")) {
                            bl = true;
                        }
                    }
                } else if (!bl2) {
                    String string3 = xmlPullParser.getName();
                    if (string3.equals((Object)"group")) {
                        b2.f(attributeSet);
                    } else if (string3.equals((Object)"item")) {
                        b2.g(attributeSet);
                    } else if (string3.equals((Object)"menu")) {
                        this.c(xmlPullParser, attributeSet, (Menu)b2.b());
                    } else {
                        string = string3;
                        bl2 = true;
                    }
                }
                n2 = xmlPullParser.next();
                continue;
            }
            throw new RuntimeException("Unexpected end of document");
        }
    }

    Object b() {
        if (this.f == null) {
            this.f = this.a((Object)this.e);
        }
        return this.f;
    }

    /*
     * Exception decompiling
     */
    public void inflate(int var1_1, Menu var2_2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[CATCHBLOCK]], but top level block is 1[TRYBLOCK]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1167)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:641)
        // java.lang.Thread.run(Thread.java:919)
        throw new IllegalStateException("Decompilation failed");
    }

    private static class a
    implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] a = new Class[]{MenuItem.class};
        private Object b;
        private Method c;

        public a(Object object, String string) {
            this.b = object;
            Class class_ = object.getClass();
            try {
                this.c = class_.getMethod(string, a);
                return;
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Couldn't resolve menu item onClick handler ");
                stringBuilder.append(string);
                stringBuilder.append(" in class ");
                stringBuilder.append(class_.getName());
                InflateException inflateException = new InflateException(stringBuilder.toString());
                inflateException.initCause((Throwable)exception);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.c.getReturnType() == Boolean.TYPE) {
                    return (Boolean)this.c.invoke(this.b, new Object[]{menuItem});
                }
                this.c.invoke(this.b, new Object[]{menuItem});
                return true;
            }
            catch (Exception exception) {
                throw new RuntimeException((Throwable)exception);
            }
        }
    }

    private class b {
        c A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;
        private Menu a;
        private int b;
        private int c;
        private int d;
        private int e;
        private boolean f;
        private boolean g;
        private boolean h;
        private int i;
        private int j;
        private CharSequence k;
        private CharSequence l;
        private int m;
        private char n;
        private int o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;

        public b(Menu menu) {
            this.a = menu;
            this.h();
        }

        private char c(String string) {
            if (string == null) {
                return '\u0000';
            }
            return string.charAt(0);
        }

        private <T> T e(String string, Class<?>[] arrclass, Object[] arrobject) {
            Object object;
            try {
                Constructor constructor = g.this.e.getClassLoader().loadClass(string).getConstructor(arrclass);
                constructor.setAccessible(true);
                object = constructor.newInstance(arrobject);
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Cannot instantiate class: ");
                stringBuilder.append(string);
                Log.w((String)"SupportMenuInflater", (String)stringBuilder.toString(), (Throwable)exception);
                return null;
            }
            return (T)object;
        }

        private void i(MenuItem menuItem) {
            ColorStateList colorStateList;
            c c2;
            boolean bl;
            int n2;
            MenuItem menuItem2 = menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
            boolean bl2 = this.r >= 1;
            menuItem2.setCheckable(bl2).setTitleCondensed(this.l).setIcon(this.m);
            int n3 = this.v;
            if (n3 >= 0) {
                menuItem.setShowAsAction(n3);
            }
            if (this.z != null) {
                if (!g.this.e.isRestricted()) {
                    menuItem.setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)new a(g.this.b(), this.z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (bl = menuItem instanceof j) {
                (j)menuItem;
            }
            if (this.r >= 2) {
                if (bl) {
                    ((j)menuItem).s(true);
                } else if (menuItem instanceof k) {
                    ((k)menuItem).i(true);
                }
            }
            String string = this.x;
            boolean bl3 = false;
            if (string != null) {
                menuItem.setActionView((View)this.e(string, g.a, g.this.c));
                bl3 = true;
            }
            if ((n2 = this.w) > 0) {
                if (!bl3) {
                    menuItem.setActionView(n2);
                } else {
                    Log.w((String)"SupportMenuInflater", (String)"Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            if ((c2 = this.A) != null) {
                a.b.d.i.g.a(menuItem, c2);
            }
            a.b.d.i.g.c(menuItem, this.B);
            a.b.d.i.g.g(menuItem, this.C);
            a.b.d.i.g.b(menuItem, this.n, this.o);
            a.b.d.i.g.f(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                a.b.d.i.g.e(menuItem, mode);
            }
            if ((colorStateList = this.D) != null) {
                a.b.d.i.g.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.h = true;
            this.i(this.a.add(this.b, this.i, this.j, this.k));
        }

        public SubMenu b() {
            this.h = true;
            SubMenu subMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
            this.i(subMenu.getItem());
            return subMenu;
        }

        public boolean d() {
            return this.h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArray = g.this.e.obtainStyledAttributes(attributeSet, a.b.e.a.j.i1);
            this.b = typedArray.getResourceId(a.b.e.a.j.k1, 0);
            this.c = typedArray.getInt(a.b.e.a.j.m1, 0);
            this.d = typedArray.getInt(a.b.e.a.j.n1, 0);
            this.e = typedArray.getInt(a.b.e.a.j.o1, 0);
            this.f = typedArray.getBoolean(a.b.e.a.j.l1, true);
            this.g = typedArray.getBoolean(a.b.e.a.j.j1, true);
            typedArray.recycle();
        }

        public void g(AttributeSet attributeSet) {
            String string;
            TypedArray typedArray = g.this.e.obtainStyledAttributes(attributeSet, a.b.e.a.j.p1);
            this.i = typedArray.getResourceId(a.b.e.a.j.s1, 0);
            int n2 = typedArray.getInt(a.b.e.a.j.v1, this.c);
            int n3 = typedArray.getInt(a.b.e.a.j.w1, this.d);
            this.j = n2 & -65536 | n3 & 65535;
            this.k = typedArray.getText(a.b.e.a.j.x1);
            this.l = typedArray.getText(a.b.e.a.j.y1);
            this.m = typedArray.getResourceId(a.b.e.a.j.q1, 0);
            this.n = this.c(typedArray.getString(a.b.e.a.j.z1));
            this.o = typedArray.getInt(a.b.e.a.j.G1, 4096);
            this.p = this.c(typedArray.getString(a.b.e.a.j.A1));
            this.q = typedArray.getInt(a.b.e.a.j.K1, 4096);
            int n4 = a.b.e.a.j.B1;
            int n5 = typedArray.hasValue(n4) ? (int)(typedArray.getBoolean(n4, false) ? 1 : 0) : this.e;
            this.r = n5;
            this.s = typedArray.getBoolean(a.b.e.a.j.t1, false);
            this.t = typedArray.getBoolean(a.b.e.a.j.u1, this.f);
            this.u = typedArray.getBoolean(a.b.e.a.j.r1, this.g);
            this.v = typedArray.getInt(a.b.e.a.j.L1, -1);
            this.z = typedArray.getString(a.b.e.a.j.C1);
            this.w = typedArray.getResourceId(a.b.e.a.j.D1, 0);
            this.x = typedArray.getString(a.b.e.a.j.F1);
            this.y = string = typedArray.getString(a.b.e.a.j.E1);
            boolean bl = string != null;
            if (bl && this.w == 0 && this.x == null) {
                this.A = (c)this.e(string, g.b, g.this.d);
            } else {
                if (bl) {
                    Log.w((String)"SupportMenuInflater", (String)"Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = typedArray.getText(a.b.e.a.j.H1);
            this.C = typedArray.getText(a.b.e.a.j.M1);
            int n6 = a.b.e.a.j.J1;
            this.E = typedArray.hasValue(n6) ? g0.d((int)typedArray.getInt(n6, -1), (PorterDuff.Mode)this.E) : null;
            int n7 = a.b.e.a.j.I1;
            this.D = typedArray.hasValue(n7) ? typedArray.getColorStateList(n7) : null;
            typedArray.recycle();
            this.h = false;
        }

        public void h() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }
    }

}

