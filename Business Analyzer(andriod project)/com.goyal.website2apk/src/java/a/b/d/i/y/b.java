/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionInfo
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package a.b.d.i.y;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

public class b {
    static final j a;
    private final AccessibilityNodeInfo b;
    public int c = -1;

    /*
     * Enabled aggressive block sorting
     */
    static {
        void var1_2;
        int n2 = Build.VERSION.SDK_INT;
        if (n2 >= 24) {
            i i2 = new i();
        } else if (n2 >= 23) {
            h h2 = new h();
        } else if (n2 >= 22) {
            g g2 = new g();
        } else if (n2 >= 21) {
            f f2 = new f();
        } else if (n2 >= 19) {
            e e2 = new e();
        } else if (n2 >= 18) {
            d d2 = new d();
        } else if (n2 >= 17) {
            c c2 = new c();
        } else if (n2 >= 16) {
            b b2 = new b();
        } else {
            j j2 = new j();
        }
        a = var1_2;
    }

    private b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.b = accessibilityNodeInfo;
    }

    public static b V(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new b(accessibilityNodeInfo);
    }

    private static String c(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                switch (n2) {
                    default: {
                        return "ACTION_UNKNOWN";
                    }
                    case 131072: {
                        return "ACTION_SET_SELECTION";
                    }
                    case 65536: {
                        return "ACTION_CUT";
                    }
                    case 32768: {
                        return "ACTION_PASTE";
                    }
                    case 16384: {
                        return "ACTION_COPY";
                    }
                    case 8192: {
                        return "ACTION_SCROLL_BACKWARD";
                    }
                    case 4096: {
                        return "ACTION_SCROLL_FORWARD";
                    }
                    case 2048: {
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    }
                    case 1024: {
                        return "ACTION_NEXT_HTML_ELEMENT";
                    }
                    case 512: {
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    }
                    case 256: {
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    }
                    case 128: {
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    }
                    case 64: {
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    }
                    case 32: {
                        return "ACTION_LONG_CLICK";
                    }
                    case 16: {
                        return "ACTION_CLICK";
                    }
                    case 8: {
                        return "ACTION_CLEAR_SELECTION";
                    }
                    case 4: 
                }
                return "ACTION_SELECT";
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    public static b x(b b2) {
        return b.V(AccessibilityNodeInfo.obtain((AccessibilityNodeInfo)b2.b));
    }

    public void A(boolean bl) {
        a.p(this.b, bl);
    }

    public void B(Rect rect) {
        this.b.setBoundsInParent(rect);
    }

    public void C(Rect rect) {
        this.b.setBoundsInScreen(rect);
    }

    public void D(boolean bl) {
        this.b.setCheckable(bl);
    }

    public void E(boolean bl) {
        this.b.setChecked(bl);
    }

    public void F(CharSequence charSequence) {
        this.b.setClassName(charSequence);
    }

    public void G(boolean bl) {
        this.b.setClickable(bl);
    }

    public void H(Object object) {
        a.q(this.b, ((k)object).a);
    }

    public void I(Object object) {
        a.r(this.b, ((l)object).a);
    }

    public void J(CharSequence charSequence) {
        this.b.setContentDescription(charSequence);
    }

    public void K(boolean bl) {
        this.b.setEnabled(bl);
    }

    public void L(boolean bl) {
        this.b.setFocusable(bl);
    }

    public void M(boolean bl) {
        this.b.setFocused(bl);
    }

    public void N(boolean bl) {
        this.b.setLongClickable(bl);
    }

    public void O(CharSequence charSequence) {
        this.b.setPackageName(charSequence);
    }

    public void P(View view) {
        this.b.setParent(view);
    }

    public void Q(boolean bl) {
        this.b.setScrollable(bl);
    }

    public void R(boolean bl) {
        this.b.setSelected(bl);
    }

    public void S(View view) {
        this.b.setSource(view);
    }

    public void T(boolean bl) {
        a.s(this.b, bl);
    }

    public AccessibilityNodeInfo U() {
        return this.b;
    }

    public void a(int n2) {
        this.b.addAction(n2);
    }

    public void b(View view) {
        this.b.addChild(view);
    }

    public int d() {
        return this.b.getActions();
    }

    public void e(Rect rect) {
        this.b.getBoundsInParent(rect);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (b.class != object.getClass()) {
            return false;
        }
        b b2 = (b)object;
        AccessibilityNodeInfo accessibilityNodeInfo = this.b;
        AccessibilityNodeInfo accessibilityNodeInfo2 = b2.b;
        return !(accessibilityNodeInfo == null ? accessibilityNodeInfo2 != null : !accessibilityNodeInfo.equals((Object)accessibilityNodeInfo2));
    }

    public void f(Rect rect) {
        this.b.getBoundsInScreen(rect);
    }

    public CharSequence g() {
        return this.b.getClassName();
    }

    public CharSequence h() {
        return this.b.getContentDescription();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.b;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public CharSequence i() {
        return this.b.getPackageName();
    }

    public CharSequence j() {
        return this.b.getText();
    }

    public String k() {
        return a.i(this.b);
    }

    public boolean l() {
        return a.j(this.b);
    }

    public boolean m() {
        return this.b.isCheckable();
    }

    public boolean n() {
        return this.b.isChecked();
    }

    public boolean o() {
        return this.b.isClickable();
    }

    public boolean p() {
        return this.b.isEnabled();
    }

    public boolean q() {
        return this.b.isFocusable();
    }

    public boolean r() {
        return this.b.isFocused();
    }

    public boolean s() {
        return this.b.isLongClickable();
    }

    public boolean t() {
        return this.b.isPassword();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        this.e(rect);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("; boundsInParent: ");
        stringBuilder2.append((Object)rect);
        stringBuilder.append(stringBuilder2.toString());
        this.f(rect);
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("; boundsInScreen: ");
        stringBuilder3.append((Object)rect);
        stringBuilder.append(stringBuilder3.toString());
        stringBuilder.append("; packageName: ");
        stringBuilder.append(this.i());
        stringBuilder.append("; className: ");
        stringBuilder.append(this.g());
        stringBuilder.append("; text: ");
        stringBuilder.append(this.j());
        stringBuilder.append("; contentDescription: ");
        stringBuilder.append(this.h());
        stringBuilder.append("; viewId: ");
        stringBuilder.append(this.k());
        stringBuilder.append("; checkable: ");
        stringBuilder.append(this.m());
        stringBuilder.append("; checked: ");
        stringBuilder.append(this.n());
        stringBuilder.append("; focusable: ");
        stringBuilder.append(this.q());
        stringBuilder.append("; focused: ");
        stringBuilder.append(this.r());
        stringBuilder.append("; selected: ");
        stringBuilder.append(this.v());
        stringBuilder.append("; clickable: ");
        stringBuilder.append(this.o());
        stringBuilder.append("; longClickable: ");
        stringBuilder.append(this.s());
        stringBuilder.append("; enabled: ");
        stringBuilder.append(this.p());
        stringBuilder.append("; password: ");
        stringBuilder.append(this.t());
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append("; scrollable: ");
        stringBuilder4.append(this.u());
        stringBuilder.append(stringBuilder4.toString());
        stringBuilder.append("; [");
        int n2 = this.d();
        while (n2 != 0) {
            int n3 = 1 << Integer.numberOfTrailingZeros((int)n2);
            stringBuilder.append(b.c(n3));
            if ((n2 &= ~n3) == 0) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public boolean u() {
        return this.b.isScrollable();
    }

    public boolean v() {
        return this.b.isSelected();
    }

    public boolean w() {
        return a.k(this.b);
    }

    public void y() {
        this.b.recycle();
    }

    public boolean z(a a2) {
        return a.o(this.b, a2.E);
    }

    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final a m;
        public static final a n;
        public static final a o;
        public static final a p;
        public static final a q;
        public static final a r;
        public static final a s;
        public static final a t;
        public static final a u;
        public static final a v;
        public static final a w;
        public static final a x;
        public static final a y;
        public static final a z;
        final Object E;

        static {
            a = new a(1, null);
            b = new a(2, null);
            c = new a(4, null);
            d = new a(8, null);
            e = new a(16, null);
            f = new a(32, null);
            g = new a(64, null);
            h = new a(128, null);
            i = new a(256, null);
            j = new a(512, null);
            k = new a(1024, null);
            l = new a(2048, null);
            m = new a(4096, null);
            n = new a(8192, null);
            o = new a(16384, null);
            p = new a(32768, null);
            q = new a(65536, null);
            r = new a(131072, null);
            s = new a(262144, null);
            t = new a(524288, null);
            u = new a(1048576, null);
            v = new a(2097152, null);
            j j2 = b.a;
            w = new a(j2.h());
            x = new a(j2.e());
            y = new a(j2.f());
            z = new a(j2.c());
            A = new a(j2.b());
            B = new a(j2.d());
            C = new a(j2.a());
            D = new a(j2.g());
        }

        public a(int n2, CharSequence charSequence) {
            this(b.a.l(n2, charSequence));
        }

        a(Object object) {
            this.E = object;
        }
    }

    static class b
    extends j {
        b() {
        }

        @Override
        public boolean j(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityFocused();
        }

        @Override
        public boolean k(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isVisibleToUser();
        }

        @Override
        public void p(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl) {
            accessibilityNodeInfo.setAccessibilityFocused(bl);
        }

        @Override
        public void s(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl) {
            accessibilityNodeInfo.setVisibleToUser(bl);
        }
    }

    static class c
    extends b {
        c() {
        }
    }

    static class d
    extends c {
        d() {
        }

        @Override
        public String i(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getViewIdResourceName();
        }
    }

    static class e
    extends d {
        e() {
        }

        @Override
        public Object m(int n2, int n3, boolean bl, int n4) {
            return AccessibilityNodeInfo.CollectionInfo.obtain((int)n2, (int)n3, (boolean)bl);
        }

        @Override
        public Object n(int n2, int n3, int n4, int n5, boolean bl, boolean bl2) {
            return AccessibilityNodeInfo.CollectionItemInfo.obtain((int)n2, (int)n3, (int)n4, (int)n5, (boolean)bl);
        }

        @Override
        public void q(AccessibilityNodeInfo accessibilityNodeInfo, Object object) {
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo)object);
        }

        @Override
        public void r(AccessibilityNodeInfo accessibilityNodeInfo, Object object) {
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo)object);
        }
    }

    static class f
    extends e {
        f() {
        }

        @Override
        public Object l(int n2, CharSequence charSequence) {
            return new AccessibilityNodeInfo.AccessibilityAction(n2, charSequence);
        }

        @Override
        public Object m(int n2, int n3, boolean bl, int n4) {
            return AccessibilityNodeInfo.CollectionInfo.obtain((int)n2, (int)n3, (boolean)bl, (int)n4);
        }

        @Override
        public Object n(int n2, int n3, int n4, int n5, boolean bl, boolean bl2) {
            return AccessibilityNodeInfo.CollectionItemInfo.obtain((int)n2, (int)n3, (int)n4, (int)n5, (boolean)bl, (boolean)bl2);
        }

        @Override
        public boolean o(AccessibilityNodeInfo accessibilityNodeInfo, Object object) {
            return accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction)object);
        }
    }

    static class g
    extends f {
        g() {
        }
    }

    static class h
    extends g {
        h() {
        }

        @Override
        public Object a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
        }

        @Override
        public Object b() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
        }

        @Override
        public Object c() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
        }

        @Override
        public Object d() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
        }

        @Override
        public Object e() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        }

        @Override
        public Object f() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
        }

        @Override
        public Object h() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
        }
    }

    static class i
    extends h {
        i() {
        }

        @Override
        public Object g() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        }
    }

    static class j {
        j() {
        }

        public Object a() {
            return null;
        }

        public Object b() {
            return null;
        }

        public Object c() {
            return null;
        }

        public Object d() {
            return null;
        }

        public Object e() {
            return null;
        }

        public Object f() {
            return null;
        }

        public Object g() {
            return null;
        }

        public Object h() {
            return null;
        }

        public String i(AccessibilityNodeInfo accessibilityNodeInfo) {
            return null;
        }

        public boolean j(AccessibilityNodeInfo accessibilityNodeInfo) {
            return false;
        }

        public boolean k(AccessibilityNodeInfo accessibilityNodeInfo) {
            return false;
        }

        public Object l(int n2, CharSequence charSequence) {
            return null;
        }

        public Object m(int n2, int n3, boolean bl, int n4) {
            return null;
        }

        public Object n(int n2, int n3, int n4, int n5, boolean bl, boolean bl2) {
            return null;
        }

        public boolean o(AccessibilityNodeInfo accessibilityNodeInfo, Object object) {
            return false;
        }

        public void p(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl) {
        }

        public void q(AccessibilityNodeInfo accessibilityNodeInfo, Object object) {
        }

        public void r(AccessibilityNodeInfo accessibilityNodeInfo, Object object) {
        }

        public void s(AccessibilityNodeInfo accessibilityNodeInfo, boolean bl) {
        }
    }

    public static class k {
        final Object a;

        k(Object object) {
            this.a = object;
        }

        public static k a(int n2, int n3, boolean bl, int n4) {
            return new k(b.a.m(n2, n3, bl, n4));
        }
    }

    public static class l {
        final Object a;

        l(Object object) {
            this.a = object;
        }

        public static l a(int n2, int n3, int n4, int n5, boolean bl, boolean bl2) {
            return new l(b.a.n(n2, n3, n4, n5, bl, bl2));
        }
    }

}

