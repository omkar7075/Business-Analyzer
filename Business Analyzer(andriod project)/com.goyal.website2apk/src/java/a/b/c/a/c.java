/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.Resources$Theme
 *  android.content.res.XmlResourceParser
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.Xml
 *  android.view.animation.AccelerateDecelerateInterpolator
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.AnimationUtils
 *  android.view.animation.AnticipateInterpolator
 *  android.view.animation.AnticipateOvershootInterpolator
 *  android.view.animation.BounceInterpolator
 *  android.view.animation.CycleInterpolator
 *  android.view.animation.DecelerateInterpolator
 *  android.view.animation.Interpolator
 *  android.view.animation.LinearInterpolator
 *  android.view.animation.OvershootInterpolator
 *  java.io.IOException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package a.b.c.a;

import a.b.c.a.f;
import a.b.d.i.z.a;
import a.b.d.i.z.b;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.CycleInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class c {
    /*
     * Enabled aggressive block sorting
     */
    private static Interpolator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser) {
        int n2;
        int n3 = xmlPullParser.getDepth();
        LinearInterpolator linearInterpolator = null;
        while (((n2 = xmlPullParser.next()) != 3 || xmlPullParser.getDepth() > n3) && n2 != 1) {
            void var9_9;
            if (n2 != 2) continue;
            AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlPullParser);
            String string = xmlPullParser.getName();
            if (string.equals((Object)"linearInterpolator")) {
                linearInterpolator = new LinearInterpolator();
                continue;
            }
            if (string.equals((Object)"accelerateInterpolator")) {
                AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator(context, attributeSet);
            } else if (string.equals((Object)"decelerateInterpolator")) {
                DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(context, attributeSet);
            } else {
                if (string.equals((Object)"accelerateDecelerateInterpolator")) {
                    linearInterpolator = new AccelerateDecelerateInterpolator();
                    continue;
                }
                if (string.equals((Object)"cycleInterpolator")) {
                    CycleInterpolator cycleInterpolator = new CycleInterpolator(context, attributeSet);
                } else if (string.equals((Object)"anticipateInterpolator")) {
                    AnticipateInterpolator anticipateInterpolator = new AnticipateInterpolator(context, attributeSet);
                } else if (string.equals((Object)"overshootInterpolator")) {
                    OvershootInterpolator overshootInterpolator = new OvershootInterpolator(context, attributeSet);
                } else if (string.equals((Object)"anticipateOvershootInterpolator")) {
                    AnticipateOvershootInterpolator anticipateOvershootInterpolator = new AnticipateOvershootInterpolator(context, attributeSet);
                } else {
                    if (string.equals((Object)"bounceInterpolator")) {
                        linearInterpolator = new BounceInterpolator();
                        continue;
                    }
                    if (!string.equals((Object)"pathInterpolator")) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unknown interpolator name: ");
                        stringBuilder.append(xmlPullParser.getName());
                        throw new RuntimeException(stringBuilder.toString());
                    }
                    f f2 = new f(context, attributeSet, xmlPullParser);
                }
            }
            linearInterpolator = var9_9;
        }
        return linearInterpolator;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static Interpolator b(Context var0, int var1_1) {
        if (Build.VERSION.SDK_INT >= 21) {
            return AnimationUtils.loadInterpolator((Context)var0, (int)var1_1);
        }
        var2_2 = null;
        if (var1_1 != 17563663) ** GOTO lbl7
        try {
            return new a();
lbl7: // 1 sources:
            var2_2 = null;
            if (var1_1 == 17563661) {
                return new b();
            }
            var2_2 = null;
            if (var1_1 == 17563662) {
                return new a.b.d.i.z.c();
            }
            var2_2 = var0.getResources().getAnimation(var1_1);
            var16_3 = c.a(var0, var0.getResources(), var0.getTheme(), (XmlPullParser)var2_2);
            if (var2_2 == null) return var16_3;
        }
        catch (IOException var10_4) {
            ** continue;
        }
        catch (XmlPullParserException var3_7) {}
        var2_2.close();
        return var16_3;
lbl18: // 1 sources:
        do {
            try {
                var11_5 = new StringBuilder();
                var11_5.append("Can't load animation resource ID #0x");
                var11_5.append(Integer.toHexString((int)var1_1));
                var14_6 = new Resources.NotFoundException(var11_5.toString());
                var14_6.initCause((Throwable)var10_4);
                throw var14_6;
            }
            catch (Throwable var9_10) {}
            if (var2_2 == null) throw var9_10;
            var2_2.close();
            throw var9_10;
            break;
        } while (true);
        var4_8 = new StringBuilder();
        var4_8.append("Can't load animation resource ID #0x");
        var4_8.append(Integer.toHexString((int)var1_1));
        var7_9 = new Resources.NotFoundException(var4_8.toString());
        var7_9.initCause((Throwable)var3_7);
        throw var7_9;
    }
}

