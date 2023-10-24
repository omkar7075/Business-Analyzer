/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.view.ViewGroup
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeProvider
 *  java.lang.Object
 */
package a.b.d.i;

import a.b.d.i.y.c;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

public class b {
    private static final b a;
    private static final View.AccessibilityDelegate b;
    final View.AccessibilityDelegate c = a.b(this);

    static {
        b b2 = Build.VERSION.SDK_INT >= 16 ? new a() : new b();
        a = b2;
        b = new View.AccessibilityDelegate();
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public c b(View view) {
        return a.a(b, view);
    }

    View.AccessibilityDelegate c() {
        return this.c;
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void e(View view, a.b.d.i.y.b b2) {
        b.onInitializeAccessibilityNodeInfo(view, b2.U());
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean g(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean h(View view, int n2, Bundle bundle) {
        return a.c(b, view, n2, bundle);
    }

    public void i(View view, int n2) {
        b.sendAccessibilityEvent(view, n2);
    }

    public void j(View view, AccessibilityEvent accessibilityEvent) {
        b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    static class a.b.d.i.b$a
    extends b {
        a.b.d.i.b$a() {
        }

        @Override
        public c a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            AccessibilityNodeProvider accessibilityNodeProvider = accessibilityDelegate.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return new c((Object)accessibilityNodeProvider);
            }
            return null;
        }

        @Override
        public View.AccessibilityDelegate b(final b b2) {
            return new View.AccessibilityDelegate(){

                public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    return b2.a(view, accessibilityEvent);
                }

                public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
                    c c2 = b2.b(view);
                    if (c2 != null) {
                        return (AccessibilityNodeProvider)c2.a();
                    }
                    return null;
                }

                public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    b2.d(view, accessibilityEvent);
                }

                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    b2.e(view, a.b.d.i.y.b.V(accessibilityNodeInfo));
                }

                public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    b2.f(view, accessibilityEvent);
                }

                public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return b2.g(viewGroup, view, accessibilityEvent);
                }

                public boolean performAccessibilityAction(View view, int n2, Bundle bundle) {
                    return b2.h(view, n2, bundle);
                }

                public void sendAccessibilityEvent(View view, int n2) {
                    b2.i(view, n2);
                }

                public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                    b2.j(view, accessibilityEvent);
                }
            };
        }

        @Override
        public boolean c(View.AccessibilityDelegate accessibilityDelegate, View view, int n2, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, n2, bundle);
        }

    }

    static class b {
        b() {
        }

        public c a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return null;
        }

        public View.AccessibilityDelegate b(final b b2) {
            return new View.AccessibilityDelegate(){

                public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    return b2.a(view, accessibilityEvent);
                }

                public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    b2.d(view, accessibilityEvent);
                }

                public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                    b2.e(view, a.b.d.i.y.b.V(accessibilityNodeInfo));
                }

                public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
                    b2.f(view, accessibilityEvent);
                }

                public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
                    return b2.g(viewGroup, view, accessibilityEvent);
                }

                public void sendAccessibilityEvent(View view, int n2) {
                    b2.i(view, n2);
                }

                public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
                    b2.j(view, accessibilityEvent);
                }
            };
        }

        public boolean c(View.AccessibilityDelegate accessibilityDelegate, View view, int n2, Bundle bundle) {
            return false;
        }

    }

}

