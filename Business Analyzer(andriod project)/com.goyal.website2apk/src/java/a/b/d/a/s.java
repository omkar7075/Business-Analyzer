/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.ViewGroup
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Set
 */
package a.b.d.a;

import a.b.d.a.c;
import a.b.d.a.h;
import a.b.d.a.j;
import a.b.d.a.l;
import a.b.d.a.n;
import a.b.d.a.t;
import a.b.d.a.x;
import a.b.d.a.y;
import a.b.d.i.p;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

class s {
    private static final int[] a = new int[]{0, 3, 0, 1, 5, 4, 7, 6, 9, 8};

    private static void A(ViewGroup viewGroup, final h h2, final View view, final ArrayList<View> arrayList, final Object object, final ArrayList<View> arrayList2, final Object object2, final ArrayList<View> arrayList3) {
        Runnable runnable = new Runnable(){

            public void run() {
                Object object3 = object;
                if (object3 != null) {
                    t.q(object3, view);
                    ArrayList arrayList4 = s.n(object, h2, (ArrayList<View>)arrayList, view);
                    arrayList2.addAll((Collection)arrayList4);
                }
                if (arrayList3 != null) {
                    if (object2 != null) {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add((Object)view);
                        t.r(object2, (ArrayList<View>)arrayList3, (ArrayList<View>)arrayList5);
                    }
                    arrayList3.clear();
                    arrayList3.add((Object)view);
                }
            }
        };
        x.a((View)viewGroup, runnable);
    }

    private static void B(Object object, Object object2, a.b.d.h.a<String, View> a2, boolean bl, a.b.d.a.c c2) {
        ArrayList<String> arrayList = c2.s;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList<String> arrayList2 = bl ? c2.t : c2.s;
            View view = (View)a2.get((String)arrayList2.get(0));
            t.w(object, view);
            if (object2 != null) {
                t.w(object2, view);
            }
        }
    }

    private static void C(ArrayList<View> arrayList, int n2) {
        if (arrayList == null) {
            return;
        }
        for (int i2 = -1 + arrayList.size(); i2 >= 0; --i2) {
            ((View)arrayList.get(i2)).setVisibility(n2);
        }
    }

    static void D(n n2, ArrayList<a.b.d.a.c> arrayList, ArrayList<Boolean> arrayList2, int n3, int n4, boolean bl) {
        if (n2.r < 1) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            SparseArray sparseArray = new SparseArray();
            for (int i2 = n3; i2 < n4; ++i2) {
                a.b.d.a.c c2 = (a.b.d.a.c)arrayList.get(i2);
                if (((Boolean)arrayList2.get(i2)).booleanValue()) {
                    s.j(c2, (SparseArray<e>)sparseArray, bl);
                    continue;
                }
                s.h(c2, (SparseArray<e>)sparseArray, bl);
            }
            if (sparseArray.size() != 0) {
                View view = new View(n2.s.i());
                int n5 = sparseArray.size();
                for (int i3 = 0; i3 < n5; ++i3) {
                    int n6 = sparseArray.keyAt(i3);
                    a.b.d.h.a<String, String> a2 = s.i(n6, arrayList, arrayList2, n3, n4);
                    e e2 = (e)sparseArray.valueAt(i3);
                    if (bl) {
                        s.r(n2, n6, e2, view, a2);
                        continue;
                    }
                    s.q(n2, n6, e2, view, a2);
                }
            }
        }
    }

    private static void f(ArrayList<View> arrayList, a.b.d.h.a<String, View> a2, Collection<String> collection) {
        for (int i2 = -1 + a2.size(); i2 >= 0; --i2) {
            View view = (View)a2.l(i2);
            if (!collection.contains((Object)p.o(view))) continue;
            arrayList.add((Object)view);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static void g(a.b.d.a.c var0, c.a var1_1, SparseArray<e> var2_2, boolean var3_3, boolean var4_4) {
        block20 : {
            block17 : {
                block19 : {
                    block13 : {
                        block14 : {
                            block15 : {
                                block18 : {
                                    block16 : {
                                        var5_5 = var1_1.b;
                                        if (var5_5 == null) {
                                            return;
                                        }
                                        var6_6 = var5_5.y;
                                        if (var6_6 == 0) {
                                            return;
                                        }
                                        var7_7 = var3_3 != false ? s.a[var1_1.a] : var1_1.a;
                                        var8_8 = false;
                                        if (var7_7 == 1) break block13;
                                        if (var7_7 == 3) break block14;
                                        if (var7_7 == 4) break block15;
                                        if (var7_7 == 5) break block16;
                                        if (var7_7 == 6) break block14;
                                        if (var7_7 == 7) break block13;
                                        var10_9 = false;
                                        break block17;
                                    }
                                    if (!var4_4) break block18;
                                    if (!var5_5.R || var5_5.A || !var5_5.l) ** GOTO lbl-1000
                                    ** GOTO lbl-1000
                                }
                                var9_12 = var5_5.A;
                                break block19;
                            }
                            if (!(var4_4 != false ? var5_5.R != false && var5_5.l != false && var5_5.A != false : var5_5.l != false && var5_5.A == false)) ** GOTO lbl-1000
                            ** GOTO lbl-1000
                        }
                        var16_13 = var5_5.l;
                        if (var4_4 != false ? var16_13 == false && (var18_14 = var5_5.I) != null && var18_14.getVisibility() == 0 && var5_5.S >= 0.0f : var16_13 != false && var5_5.A == false) lbl-1000: // 2 sources:
                        {
                            var17_15 = true;
                        } else lbl-1000: // 2 sources:
                        {
                            var17_15 = false;
                        }
                        var12_11 = var17_15;
                        var11_10 = true;
                        var10_9 = false;
                        var8_8 = false;
                        break block20;
                    }
                    if (var4_4) {
                        var9_12 = var5_5.Q;
                    } else if (!var5_5.l && !var5_5.A) lbl-1000: // 2 sources:
                    {
                        var9_12 = true;
                    } else lbl-1000: // 2 sources:
                    {
                        var9_12 = false;
                    }
                }
                var8_8 = var9_12;
                var10_9 = true;
            }
            var11_10 = false;
            var12_11 = false;
        }
        var13_16 = (e)var2_2.get(var6_6);
        if (var8_8) {
            var13_16 = s.s(var13_16, var2_2, var6_6);
            var13_16.a = var5_5;
            var13_16.b = var3_3;
            var13_16.c = var0;
        }
        var14_17 = var13_16;
        if (!var4_4 && var10_9) {
            if (var14_17 != null && var14_17.d == var5_5) {
                var14_17.d = null;
            }
            var15_18 = var0.b;
            if (var5_5.c < 1 && var15_18.r >= 1 && !var0.u) {
                var15_18.v0(var5_5);
                var15_18.F0(var5_5, 1, 0, 0, false);
            }
        }
        if (var12_11 && (var14_17 == null || var14_17.d == null)) {
            var14_17 = s.s(var14_17, var2_2, var6_6);
            var14_17.d = var5_5;
            var14_17.e = var3_3;
            var14_17.f = var0;
        }
        if (var4_4 != false) return;
        if (var11_10 == false) return;
        if (var14_17 == null) return;
        if (var14_17.a != var5_5) return;
        var14_17.a = null;
    }

    public static void h(a.b.d.a.c c2, SparseArray<e> sparseArray, boolean bl) {
        int n2 = c2.c.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            s.g(c2, (c.a)c2.c.get(i2), sparseArray, false, bl);
        }
    }

    private static a.b.d.h.a<String, String> i(int n2, ArrayList<a.b.d.a.c> arrayList, ArrayList<Boolean> arrayList2, int n3, int n4) {
        a.b.d.h.a<String, String> a2 = new a.b.d.h.a<String, String>();
        for (int i2 = n4 - 1; i2 >= n3; --i2) {
            ArrayList<String> arrayList3;
            ArrayList<String> arrayList4;
            a.b.d.a.c c2 = (a.b.d.a.c)arrayList.get(i2);
            if (!c2.j(n2)) continue;
            boolean bl = (Boolean)arrayList2.get(i2);
            ArrayList<String> arrayList5 = c2.s;
            if (arrayList5 == null) continue;
            int n5 = arrayList5.size();
            if (bl) {
                arrayList3 = c2.s;
                arrayList4 = c2.t;
            } else {
                ArrayList<String> arrayList6 = c2.s;
                arrayList3 = c2.t;
                arrayList4 = arrayList6;
            }
            for (int i3 = 0; i3 < n5; ++i3) {
                String string = (String)arrayList4.get(i3);
                String string2 = (String)arrayList3.get(i3);
                String string3 = (String)a2.remove(string2);
                if (string3 != null) {
                    a2.put(string, string3);
                    continue;
                }
                a2.put(string, string2);
            }
        }
        return a2;
    }

    public static void j(a.b.d.a.c c2, SparseArray<e> sparseArray, boolean bl) {
        if (!c2.b.t.c()) {
            return;
        }
        for (int i2 = c2.c.size() - 1; i2 >= 0; --i2) {
            s.g(c2, (c.a)c2.c.get(i2), sparseArray, true, bl);
        }
    }

    private static void k(h h2, h h3, boolean bl, a.b.d.h.a<String, View> a2, boolean bl2) {
        y y2 = bl ? h3.n() : h2.n();
        if (y2 != null) {
            int n2;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int n3 = 0;
            if (a2 == null) {
                n2 = 0;
                n3 = 0;
            } else {
                n2 = a2.size();
            }
            while (n3 < n2) {
                arrayList2.add(a2.i(n3));
                arrayList.add(a2.l(n3));
                ++n3;
            }
            throw null;
        }
    }

    private static a.b.d.h.a<String, View> l(a.b.d.h.a<String, String> a2, Object object, e e2) {
        h h2 = e2.a;
        View view = h2.B();
        if (!a2.isEmpty() && object != null && view != null) {
            ArrayList<String> arrayList;
            y y2;
            a.b.d.h.a<String, View> a3 = new a.b.d.h.a<String, View>();
            t.j(a3, view);
            a.b.d.a.c c2 = e2.c;
            if (e2.b) {
                y2 = h2.p();
                arrayList = c2.s;
            } else {
                y2 = h2.n();
                arrayList = c2.t;
            }
            if (arrayList != null) {
                a3.n((Collection<?>)arrayList);
            }
            if (y2 == null) {
                s.z(a2, a3);
                return a3;
            }
            throw null;
        }
        a2.clear();
        return null;
    }

    private static a.b.d.h.a<String, View> m(a.b.d.h.a<String, String> a2, Object object, e e2) {
        if (!a2.isEmpty() && object != null) {
            ArrayList<String> arrayList;
            y y2;
            h h2 = e2.d;
            a.b.d.h.a<String, View> a3 = new a.b.d.h.a<String, View>();
            t.j(a3, h2.B());
            a.b.d.a.c c2 = e2.f;
            if (e2.e) {
                y2 = h2.n();
                arrayList = c2.t;
            } else {
                y2 = h2.p();
                arrayList = c2.s;
            }
            a3.n((Collection<?>)arrayList);
            if (y2 == null) {
                a2.n((Collection<?>)a3.keySet());
                return a3;
            }
            throw null;
        }
        a2.clear();
        return null;
    }

    private static ArrayList<View> n(Object object, h h2, ArrayList<View> arrayList, View view) {
        ArrayList arrayList2;
        if (object != null) {
            arrayList2 = new ArrayList();
            View view2 = h2.B();
            if (view2 != null) {
                t.f((ArrayList<View>)arrayList2, view2);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.add((Object)view);
                t.c(object, (ArrayList<View>)arrayList2);
                return arrayList2;
            }
        } else {
            arrayList2 = null;
        }
        return arrayList2;
    }

    private static Object o(ViewGroup viewGroup, final View view, final a.b.d.h.a<String, String> a2, final e e2, final ArrayList<View> arrayList, final ArrayList<View> arrayList2, final Object object, Object object2) {
        final h h2 = e2.a;
        final h h3 = e2.d;
        Rect rect = null;
        if (h2 != null) {
            a.b.d.h.a<String, String> a3;
            Object object3;
            Object object4;
            if (h3 == null) {
                return null;
            }
            final boolean bl = e2.b;
            if (a2.isEmpty()) {
                a3 = a2;
                object3 = null;
            } else {
                object3 = s.w(h2, h3, bl);
                a3 = a2;
            }
            a.b.d.h.a<String, View> a4 = s.m(a3, object3, e2);
            if (a2.isEmpty()) {
                object4 = null;
            } else {
                arrayList.addAll(a4.values());
                object4 = object3;
            }
            if (object == null && object2 == null && object4 == null) {
                return null;
            }
            s.k(h2, h3, bl, a4, true);
            if (object4 != null) {
                rect = new Rect();
                t.z(object4, view, arrayList);
                s.B(object4, object2, a4, e2.e, e2.f);
                if (object != null) {
                    t.v(object, rect);
                }
            }
            final Rect rect2 = rect;
            Runnable runnable = new Runnable(){

                public void run() {
                    a.b.d.h.a a22 = s.l(a2, object4, e2);
                    if (a22 != null) {
                        arrayList2.addAll(a22.values());
                        arrayList2.add((Object)view);
                    }
                    s.k(h2, h3, bl, a22, false);
                    Object object2 = object4;
                    if (object2 != null) {
                        t.A(object2, (ArrayList<View>)arrayList, (ArrayList<View>)arrayList2);
                        View view2 = s.v(a22, e2, object, bl);
                        if (view2 != null) {
                            t.k(view2, rect2);
                        }
                    }
                }
            };
            x.a((View)viewGroup, runnable);
            return object4;
        }
        return null;
    }

    private static Object p(ViewGroup viewGroup, View view, a.b.d.h.a<String, String> a2, e e2, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object object, Object object2) {
        final h h2 = e2.a;
        final h h3 = e2.d;
        if (h2 != null) {
            h2.B().setVisibility(0);
        }
        if (h2 != null) {
            View view2;
            Rect rect;
            if (h3 == null) {
                return null;
            }
            final boolean bl = e2.b;
            Object object3 = a2.isEmpty() ? null : s.w(h2, h3, bl);
            a.b.d.h.a<String, View> a3 = s.m(a2, object3, e2);
            final a.b.d.h.a<String, View> a4 = s.l(a2, object3, e2);
            if (a2.isEmpty()) {
                if (a3 != null) {
                    a3.clear();
                }
                if (a4 != null) {
                    a4.clear();
                }
                object3 = null;
            } else {
                s.f(arrayList, a3, a2.keySet());
                s.f(arrayList2, a4, a2.values());
            }
            if (object == null && object2 == null && object3 == null) {
                return null;
            }
            s.k(h2, h3, bl, a3, true);
            if (object3 != null) {
                arrayList2.add((Object)view);
                t.z(object3, view, arrayList);
                s.B(object3, object2, a3, e2.e, e2.f);
                Rect rect2 = new Rect();
                View view3 = s.v(a4, e2, object, bl);
                if (view3 != null) {
                    t.v(object, rect2);
                }
                rect = rect2;
                view2 = view3;
            } else {
                view2 = null;
                rect = null;
            }
            Runnable runnable = new Runnable(){

                public void run() {
                    s.k(h2, h3, bl, a4, false);
                    View view = view2;
                    if (view != null) {
                        t.k(view, rect);
                    }
                }
            };
            x.a((View)viewGroup, runnable);
            return object3;
        }
        return null;
    }

    private static void q(n n2, int n3, e e2, View view, a.b.d.h.a<String, String> a2) {
        ArrayList<View> arrayList;
        Object object;
        ViewGroup viewGroup = n2.t.c() ? (ViewGroup)n2.t.b(n3) : null;
        if (viewGroup == null) {
            return;
        }
        h h2 = e2.a;
        h h3 = e2.d;
        boolean bl = e2.b;
        boolean bl2 = e2.e;
        Object object2 = s.t(h2, bl);
        Object object3 = s.u(h3, bl2);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Object object4 = s.o(viewGroup, view, a2, e2, (ArrayList<View>)arrayList2, (ArrayList<View>)arrayList3, object2, object3);
        if (object2 == null && object4 == null) {
            object = object3;
            if (object == null) {
                return;
            }
        } else {
            object = object3;
        }
        Object object5 = (arrayList = s.n(object, h3, (ArrayList<View>)arrayList2, view)) != null && !arrayList.isEmpty() ? object : null;
        t.b(object2, view);
        Object object6 = s.x(object2, object5, object4, h2, e2.b);
        if (object6 != null) {
            ArrayList arrayList4 = new ArrayList();
            t.u(object6, object2, (ArrayList<View>)arrayList4, object5, arrayList, object4, (ArrayList<View>)arrayList3);
            s.A(viewGroup, h2, view, (ArrayList<View>)arrayList3, object2, (ArrayList<View>)arrayList4, object5, arrayList);
            t.x((View)viewGroup, (ArrayList<View>)arrayList3, a2);
            t.d(viewGroup, object6);
            t.t(viewGroup, (ArrayList<View>)arrayList3, a2);
        }
    }

    private static void r(n n2, int n3, e e2, View view, a.b.d.h.a<String, String> a2) {
        Object object;
        ViewGroup viewGroup = n2.t.c() ? (ViewGroup)n2.t.b(n3) : null;
        ViewGroup viewGroup2 = viewGroup;
        if (viewGroup2 == null) {
            return;
        }
        h h2 = e2.a;
        h h3 = e2.d;
        boolean bl = e2.b;
        boolean bl2 = e2.e;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object object2 = s.t(h2, bl);
        Object object3 = s.u(h3, bl2);
        Object object4 = s.p(viewGroup2, view, a2, e2, (ArrayList<View>)arrayList2, (ArrayList<View>)arrayList, object2, object3);
        if (object2 == null && object4 == null) {
            object = object3;
            if (object == null) {
                return;
            }
        } else {
            object = object3;
        }
        ArrayList<View> arrayList3 = s.n(object, h3, (ArrayList<View>)arrayList2, view);
        ArrayList<View> arrayList4 = s.n(object2, h2, (ArrayList<View>)arrayList, view);
        s.C(arrayList4, 4);
        Object object5 = s.x(object2, object, object4, h2, bl);
        if (object5 != null) {
            s.y(object, h3, arrayList3);
            ArrayList<String> arrayList5 = t.p((ArrayList<View>)arrayList);
            t.u(object5, object2, arrayList4, object, arrayList3, object4, (ArrayList<View>)arrayList);
            t.d(viewGroup2, object5);
            t.y((View)viewGroup2, (ArrayList<View>)arrayList2, (ArrayList<View>)arrayList, arrayList5, a2);
            s.C(arrayList4, 0);
            t.A(object4, (ArrayList<View>)arrayList2, (ArrayList<View>)arrayList);
        }
    }

    private static e s(e e2, SparseArray<e> sparseArray, int n2) {
        if (e2 == null) {
            e2 = new e();
            sparseArray.put(n2, (Object)e2);
        }
        return e2;
    }

    private static Object t(h h2, boolean bl) {
        if (h2 == null) {
            return null;
        }
        Object object = bl ? h2.v() : h2.m();
        return t.g(object);
    }

    private static Object u(h h2, boolean bl) {
        if (h2 == null) {
            return null;
        }
        Object object = bl ? h2.x() : h2.o();
        return t.g(object);
    }

    private static View v(a.b.d.h.a<String, View> a2, e e2, Object object, boolean bl) {
        ArrayList<String> arrayList;
        a.b.d.a.c c2 = e2.c;
        if (object != null && a2 != null && (arrayList = c2.s) != null && !arrayList.isEmpty()) {
            ArrayList<String> arrayList2 = bl ? c2.s : c2.t;
            return (View)a2.get((String)arrayList2.get(0));
        }
        return null;
    }

    private static Object w(h h2, h h3, boolean bl) {
        if (h2 != null && h3 != null) {
            Object object = bl ? h3.z() : h2.y();
            return t.B(t.g(object));
        }
        return null;
    }

    private static Object x(Object object, Object object2, Object object3, h h2, boolean bl) {
        boolean bl2 = object != null && object2 != null && h2 != null ? (bl ? h2.i() : h2.h()) : true;
        if (bl2) {
            return t.o(object2, object, object3);
        }
        return t.n(object2, object, object3);
    }

    private static void y(Object object, h h2, final ArrayList<View> arrayList) {
        if (h2 != null && object != null && h2.l && h2.A && h2.R) {
            h2.T0(true);
            t.s(object, h2.B(), arrayList);
            x.a((View)h2.H, new Runnable(){

                public void run() {
                    s.C((ArrayList<View>)arrayList, 4);
                }
            });
        }
    }

    private static void z(a.b.d.h.a<String, String> a2, a.b.d.h.a<String, View> a3) {
        for (int i2 = -1 + a2.size(); i2 >= 0; --i2) {
            if (a3.containsKey((String)a2.l(i2))) continue;
            a2.j(i2);
        }
    }

    static class e {
        public h a;
        public boolean b;
        public a.b.d.a.c c;
        public h d;
        public boolean e;
        public a.b.d.a.c f;

        e() {
        }
    }

}

