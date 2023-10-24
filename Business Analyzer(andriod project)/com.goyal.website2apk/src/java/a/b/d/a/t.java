/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.transition.Transition
 *  android.transition.Transition$EpicenterCallback
 *  android.transition.Transition$TransitionListener
 *  android.transition.TransitionManager
 *  android.transition.TransitionSet
 *  android.view.View
 *  android.view.ViewGroup
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package a.b.d.a;

import a.b.d.a.x;
import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

class t {
    public static void A(Object object, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet)object;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            t.r((Object)transitionSet, arrayList, arrayList2);
        }
    }

    public static Object B(Object object) {
        if (object == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition)object);
        return transitionSet;
    }

    public static void b(Object object, View view) {
        if (object != null) {
            ((Transition)object).addTarget(view);
        }
    }

    public static void c(Object object, ArrayList<View> arrayList) {
        block4 : {
            Transition transition;
            int n2;
            block3 : {
                transition = (Transition)object;
                if (transition == null) {
                    return;
                }
                boolean bl = transition instanceof TransitionSet;
                if (!bl) break block3;
                TransitionSet transitionSet = (TransitionSet)transition;
                int n3 = transitionSet.getTransitionCount();
                for (n2 = 0; n2 < n3; ++n2) {
                    t.c((Object)transitionSet.getTransitionAt(n2), arrayList);
                }
                break block4;
            }
            if (t.l(transition) || !t.m(transition.getTargets())) break block4;
            int n4 = arrayList.size();
            while (n2 < n4) {
                transition.addTarget((View)arrayList.get(n2));
                ++n2;
            }
        }
    }

    public static void d(ViewGroup viewGroup, Object object) {
        TransitionManager.beginDelayedTransition((ViewGroup)viewGroup, (Transition)((Transition)object));
    }

    private static void e(List<View> list, View view) {
        int n2 = list.size();
        if (t.h(list, view, n2)) {
            return;
        }
        list.add((Object)view);
        for (int i2 = n2; i2 < list.size(); ++i2) {
            View view2 = (View)list.get(i2);
            if (!(view2 instanceof ViewGroup)) continue;
            ViewGroup viewGroup = (ViewGroup)view2;
            int n3 = viewGroup.getChildCount();
            for (int i3 = 0; i3 < n3; ++i3) {
                View view3 = viewGroup.getChildAt(i3);
                if (t.h(list, view3, n2)) continue;
                list.add((Object)view3);
            }
        }
    }

    public static void f(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (view instanceof ViewGroup && !(view = (ViewGroup)view).isTransitionGroup()) {
                int n2 = view.getChildCount();
                for (int i2 = 0; i2 < n2; ++i2) {
                    t.f(arrayList, view.getChildAt(i2));
                }
            } else {
                arrayList.add((Object)view);
            }
        }
    }

    public static Object g(Object object) {
        if (object != null) {
            return ((Transition)object).clone();
        }
        return null;
    }

    private static boolean h(List<View> list, View view, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            if (list.get(i2) != view) continue;
            return true;
        }
        return false;
    }

    private static String i(Map<String, String> map, String string) {
        for (Map.Entry entry : map.entrySet()) {
            if (!string.equals(entry.getValue())) continue;
            return (String)entry.getKey();
        }
        return null;
    }

    public static void j(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String string = view.getTransitionName();
            if (string != null) {
                map.put((Object)string, (Object)view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup)view;
                int n2 = viewGroup.getChildCount();
                for (int i2 = 0; i2 < n2; ++i2) {
                    t.j(map, viewGroup.getChildAt(i2));
                }
            }
        }
    }

    public static void k(View view, Rect rect) {
        int[] arrn = new int[2];
        view.getLocationOnScreen(arrn);
        rect.set(arrn[0], arrn[1], arrn[0] + view.getWidth(), arrn[1] + view.getHeight());
    }

    private static boolean l(Transition transition) {
        return !t.m(transition.getTargetIds()) || !t.m(transition.getTargetNames()) || !t.m(transition.getTargetTypes());
        {
        }
    }

    private static boolean m(List list) {
        return list == null || list.isEmpty();
        {
        }
    }

    public static Object n(Object object, Object object2, Object object3) {
        Object object4 = (Transition)object;
        Transition transition = (Transition)object2;
        Transition transition2 = (Transition)object3;
        if (object4 != null && transition != null) {
            object4 = new TransitionSet().addTransition(object4).addTransition(transition).setOrdering(1);
        } else if (object4 == null) {
            object4 = transition != null ? transition : null;
        }
        if (transition2 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (object4 != null) {
                transitionSet.addTransition(object4);
            }
            transitionSet.addTransition(transition2);
            return transitionSet;
        }
        return object4;
    }

    public static Object o(Object object, Object object2, Object object3) {
        TransitionSet transitionSet = new TransitionSet();
        if (object != null) {
            transitionSet.addTransition((Transition)object);
        }
        if (object2 != null) {
            transitionSet.addTransition((Transition)object2);
        }
        if (object3 != null) {
            transitionSet.addTransition((Transition)object3);
        }
        return transitionSet;
    }

    public static ArrayList<String> p(ArrayList<View> arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            View view = (View)arrayList.get(i2);
            arrayList2.add((Object)view.getTransitionName());
            view.setTransitionName(null);
        }
        return arrayList2;
    }

    public static void q(Object object, View view) {
        if (object != null) {
            ((Transition)object).removeTarget(view);
        }
    }

    public static void r(Object object, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        block6 : {
            int n2;
            int n3;
            List list;
            Transition transition;
            block5 : {
                transition = (Transition)object;
                boolean bl = transition instanceof TransitionSet;
                if (!bl) break block5;
                TransitionSet transitionSet = (TransitionSet)transition;
                int n4 = transitionSet.getTransitionCount();
                for (n2 = 0; n2 < n4; ++n2) {
                    t.r((Object)transitionSet.getTransitionAt(n2), arrayList, arrayList2);
                }
                break block6;
            }
            if (t.l(transition) || (list = transition.getTargets()) == null || list.size() != arrayList.size() || !list.containsAll(arrayList)) break block6;
            if (arrayList2 == null) {
                n3 = 0;
                n2 = 0;
            } else {
                n3 = arrayList2.size();
            }
            while (n2 < n3) {
                transition.addTarget((View)arrayList2.get(n2));
                ++n2;
            }
            for (int i2 = -1 + arrayList.size(); i2 >= 0; --i2) {
                transition.removeTarget((View)arrayList.get(i2));
            }
        }
    }

    public static void s(Object object, final View view, final ArrayList<View> arrayList) {
        ((Transition)object).addListener(new Transition.TransitionListener(){

            public void onTransitionCancel(Transition transition) {
            }

            public void onTransitionEnd(Transition transition) {
                transition.removeListener((Transition.TransitionListener)this);
                view.setVisibility(8);
                int n2 = arrayList.size();
                for (int i2 = 0; i2 < n2; ++i2) {
                    ((View)arrayList.get(i2)).setVisibility(0);
                }
            }

            public void onTransitionPause(Transition transition) {
            }

            public void onTransitionResume(Transition transition) {
            }

            public void onTransitionStart(Transition transition) {
            }
        });
    }

    public static void t(ViewGroup viewGroup, final ArrayList<View> arrayList, final Map<String, String> map) {
        x.a((View)viewGroup, new Runnable(){

            public void run() {
                int n2 = arrayList.size();
                for (int i2 = 0; i2 < n2; ++i2) {
                    View view = (View)arrayList.get(i2);
                    String string = view.getTransitionName();
                    view.setTransitionName((String)map.get((Object)string));
                }
            }
        });
    }

    public static void u(Object object, final Object object2, final ArrayList<View> arrayList, final Object object3, final ArrayList<View> arrayList2, final Object object4, final ArrayList<View> arrayList3) {
        Transition transition = (Transition)object;
        Transition.TransitionListener transitionListener = new Transition.TransitionListener(){

            public void onTransitionCancel(Transition transition) {
            }

            public void onTransitionEnd(Transition transition) {
            }

            public void onTransitionPause(Transition transition) {
            }

            public void onTransitionResume(Transition transition) {
            }

            public void onTransitionStart(Transition transition) {
                Object object;
                Object object22;
                Object object32 = object2;
                if (object32 != null) {
                    t.r(object32, (ArrayList<View>)arrayList, null);
                }
                if ((object22 = object3) != null) {
                    t.r(object22, (ArrayList<View>)arrayList2, null);
                }
                if ((object = object4) != null) {
                    t.r(object, (ArrayList<View>)arrayList3, null);
                }
            }
        };
        transition.addListener(transitionListener);
    }

    public static void v(Object object, final Rect rect) {
        if (object != null) {
            ((Transition)object).setEpicenterCallback(new Transition.EpicenterCallback(){

                public Rect onGetEpicenter(Transition transition) {
                    Rect rect2 = rect;
                    if (rect2 != null && !rect2.isEmpty()) {
                        return rect;
                    }
                    return null;
                }
            });
        }
    }

    public static void w(Object object, View view) {
        if (view != null) {
            Transition transition = (Transition)object;
            final Rect rect = new Rect();
            t.k(view, rect);
            transition.setEpicenterCallback(new Transition.EpicenterCallback(){

                public Rect onGetEpicenter(Transition transition) {
                    return rect;
                }
            });
        }
    }

    public static void x(View view, final ArrayList<View> arrayList, final Map<String, String> map) {
        x.a(view, new Runnable(){

            public void run() {
                int n2 = arrayList.size();
                for (int i2 = 0; i2 < n2; ++i2) {
                    View view = (View)arrayList.get(i2);
                    String string = view.getTransitionName();
                    if (string == null) continue;
                    view.setTransitionName(t.i((Map<String, String>)map, string));
                }
            }
        });
    }

    public static void y(View view, final ArrayList<View> arrayList, final ArrayList<View> arrayList2, final ArrayList<String> arrayList3, Map<String, String> map) {
        final int n2 = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        block0 : for (int i2 = 0; i2 < n2; ++i2) {
            View view2 = (View)arrayList.get(i2);
            String string = view2.getTransitionName();
            arrayList4.add((Object)string);
            if (string == null) continue;
            view2.setTransitionName(null);
            String string2 = (String)map.get((Object)string);
            for (int i3 = 0; i3 < n2; ++i3) {
                if (!string2.equals(arrayList3.get(i3))) continue;
                ((View)arrayList2.get(i3)).setTransitionName(string);
                continue block0;
            }
        }
        Runnable runnable = new Runnable(){

            public void run() {
                for (int i2 = 0; i2 < n2; ++i2) {
                    ((View)arrayList2.get(i2)).setTransitionName((String)arrayList3.get(i2));
                    ((View)arrayList.get(i2)).setTransitionName((String)arrayList4.get(i2));
                }
            }
        };
        x.a(view, runnable);
    }

    public static void z(Object object, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet)object;
        List list = transitionSet.getTargets();
        list.clear();
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            t.e((List<View>)list, (View)arrayList.get(i2));
        }
        list.add((Object)view);
        arrayList.add((Object)view);
        t.c((Object)transitionSet, arrayList);
    }

}

