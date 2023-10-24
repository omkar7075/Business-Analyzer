/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.util.Log
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package a.b.d.c;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

public class b {
    private static void a(ArrayList<b> arrayList, char c2, float[] arrf) {
        arrayList.add((Object)new b(c2, arrf));
    }

    public static boolean b(b[] arrb, b[] arrb2) {
        if (arrb != null) {
            if (arrb2 == null) {
                return false;
            }
            if (arrb.length != arrb2.length) {
                return false;
            }
            for (int i2 = 0; i2 < arrb.length; ++i2) {
                if (arrb[i2].a == arrb2[i2].a) {
                    if (arrb[i2].b.length == arrb2[i2].b.length) continue;
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    static float[] c(float[] arrf, int n2, int n3) {
        if (n2 <= n3) {
            int n4 = arrf.length;
            if (n2 >= 0 && n2 <= n4) {
                int n5 = n3 - n2;
                int n6 = Math.min((int)n5, (int)(n4 - n2));
                float[] arrf2 = new float[n5];
                System.arraycopy((Object)arrf, (int)n2, (Object)arrf2, (int)0, (int)n6);
                return arrf2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    public static b[] d(String string) {
        if (string == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int n2 = 1;
        int n3 = 0;
        while (n2 < string.length()) {
            int n4 = b.i(string, n2);
            String string2 = string.substring(n3, n4).trim();
            if (string2.length() > 0) {
                float[] arrf = b.h(string2);
                b.a((ArrayList<b>)arrayList, string2.charAt(0), arrf);
            }
            int n5 = n4 + 1;
            n3 = n4;
            n2 = n5;
        }
        if (n2 - n3 == 1 && n3 < string.length()) {
            b.a((ArrayList<b>)arrayList, string.charAt(n3), new float[0]);
        }
        return (b[])arrayList.toArray((Object[])new b[arrayList.size()]);
    }

    public static Path e(String string) {
        Path path = new Path();
        b[] arrb = b.d(string);
        if (arrb != null) {
            try {
                b.e(arrb, path);
                return path;
            }
            catch (RuntimeException runtimeException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error in parsing ");
                stringBuilder.append(string);
                throw new RuntimeException(stringBuilder.toString(), (Throwable)runtimeException);
            }
        }
        return null;
    }

    public static b[] f(b[] arrb) {
        if (arrb == null) {
            return null;
        }
        b[] arrb2 = new b[arrb.length];
        for (int i2 = 0; i2 < arrb.length; ++i2) {
            arrb2[i2] = new b(arrb[i2]);
        }
        return arrb2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static void g(String var0, int var1_1, a var2_2) {
        var2_2.b = false;
        var4_4 = false;
        var5_5 = false;
        var6_6 = false;
        for (var3_3 = var1_1; var3_3 < var0.length(); ++var3_3) {
            block9 : {
                block8 : {
                    var7_7 = var0.charAt(var3_3);
                    if (var7_7 == ' ') break block8;
                    if (var7_7 == 'E' || var7_7 == 'e') ** GOTO lbl23
                    switch (var7_7) {
                        default: {
                            ** GOTO lbl21
                        }
                        case '.': {
                            if (var5_5) ** GOTO lbl19
                            var5_5 = true;
                            var4_4 = false;
                            break block9;
                        }
                        case '-': {
                            if (var3_3 == var1_1 || var4_4) ** GOTO lbl21
lbl19: // 2 sources:
                            var2_2.b = true;
                            break;
lbl21: // 2 sources:
                            var4_4 = false;
                            break block9;
                        }
lbl23: // 1 sources:
                        var4_4 = true;
                        break block9;
                        case ',': 
                    }
                }
                var4_4 = false;
                var6_6 = true;
            }
            if (var6_6) break;
        }
        var2_2.a = var3_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static float[] h(String string) {
        int n2;
        int n3;
        float[] arrf;
        int n4;
        a a2;
        if (string.charAt(0) == 'z') return new float[0];
        if (string.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            arrf = new float[string.length()];
            a2 = new a();
            n4 = string.length();
            n2 = 1;
            n3 = 0;
        }
        catch (NumberFormatException numberFormatException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("error in parsing \"");
            stringBuilder.append(string);
            stringBuilder.append("\"");
            throw new RuntimeException(stringBuilder.toString(), (Throwable)numberFormatException);
        }
        while (n2 < n4) {
            b.g(string, n2, a2);
            int n5 = a2.a;
            if (n2 < n5) {
                int n6 = n3 + 1;
                arrf[n3] = Float.parseFloat((String)string.substring(n2, n5));
                n3 = n6;
            }
            if (a2.b) {
                n2 = n5;
                continue;
            }
            n2 = n5 + 1;
        }
        return b.c(arrf, 0, n3);
    }

    private static int i(String string, int n2) {
        while (n2 < string.length()) {
            char c2 = string.charAt(n2);
            if (((c2 - 65) * (c2 - 90) <= 0 || (c2 - 97) * (c2 - 122) <= 0) && c2 != 'e' && c2 != 'E') {
                return n2;
            }
            ++n2;
        }
        return n2;
    }

    public static void j(b[] arrb, b[] arrb2) {
        for (int i2 = 0; i2 < arrb2.length; ++i2) {
            arrb[i2].a = arrb2[i2].a;
            for (int i3 = 0; i3 < arrb2[i2].b.length; ++i3) {
                arrb[i2].b[i3] = arrb2[i2].b[i3];
            }
        }
    }

    private static class a {
        int a;
        boolean b;

        a() {
        }
    }

    public static class b {
        public char a;
        public float[] b;

        b(char c2, float[] arrf) {
            this.a = c2;
            this.b = arrf;
        }

        b(b b2) {
            this.a = b2.a;
            float[] arrf = b2.b;
            this.b = b.c(arrf, 0, arrf.length);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Lifted jumps to return sites
         */
        private static void a(Path var0, float[] var1_1, char var2_2, char var3_3, float[] var4_4) {
            var5_5 = var3_3;
            var6_6 = var1_1[0];
            var7_7 = var1_1[1];
            var8_8 = var1_1[2];
            var9_9 = var1_1[3];
            var10_10 = var1_1[4];
            var11_11 = var1_1[5];
            switch (var5_5) {
                case 'Z': 
                case 'z': {
                    var0.close();
                    var0.moveTo(var10_10, var11_11);
                    var8_8 = var6_6 = var10_10;
                    var9_9 = var7_7 = var11_11;
                }
                default: {
                    var12_12 = 2;
                    ** break;
                }
                case 'Q': 
                case 'S': 
                case 'q': 
                case 's': {
                    var12_12 = 4;
                    ** break;
                }
                case 'H': 
                case 'V': 
                case 'h': 
                case 'v': {
                    var12_12 = 1;
                    ** break;
                }
                case 'C': 
                case 'c': {
                    var12_12 = 6;
                    ** break;
                }
                case 'A': 
                case 'a': 
            }
            var12_12 = 7;
lbl28: // 5 sources:
            var13_13 = var6_6;
            var14_14 = var7_7;
            var15_15 = var10_10;
            var16_16 = var11_11;
            var17_17 = 0;
            var18_18 = var2_2;
            do {
                block38 : {
                    block41 : {
                        block16 : {
                            block17 : {
                                block18 : {
                                    block19 : {
                                        block20 : {
                                            block21 : {
                                                block33 : {
                                                    block39 : {
                                                        block34 : {
                                                            block22 : {
                                                                block23 : {
                                                                    block24 : {
                                                                        block37 : {
                                                                            block25 : {
                                                                                block26 : {
                                                                                    block36 : {
                                                                                        block40 : {
                                                                                            block27 : {
                                                                                                block28 : {
                                                                                                    block29 : {
                                                                                                        block30 : {
                                                                                                            block35 : {
                                                                                                                block31 : {
                                                                                                                    block32 : {
                                                                                                                        if (var17_17 >= var4_4.length) {
                                                                                                                            var19_133 = var14_14;
                                                                                                                            var1_1[0] = var13_13;
                                                                                                                            var1_1[1] = var19_133;
                                                                                                                            var1_1[2] = var8_8;
                                                                                                                            var1_1[3] = var9_9;
                                                                                                                            var1_1[4] = var15_15;
                                                                                                                            var1_1[5] = var16_16;
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        if (var5_5 == 'A') break block16;
                                                                                                                        if (var5_5 == 'C') break block17;
                                                                                                                        if (var5_5 == 'H') break block18;
                                                                                                                        if (var5_5 == 'Q') break block19;
                                                                                                                        if (var5_5 == 'V') break block20;
                                                                                                                        if (var5_5 == 'a') break block21;
                                                                                                                        if (var5_5 == 'c') break block22;
                                                                                                                        if (var5_5 == 'h') break block23;
                                                                                                                        if (var5_5 == 'q') break block24;
                                                                                                                        if (var5_5 == 'v') break block25;
                                                                                                                        if (var5_5 == 'L') break block26;
                                                                                                                        if (var5_5 == 'M') break block27;
                                                                                                                        if (var5_5 == 'S') break block28;
                                                                                                                        if (var5_5 == 'T') break block29;
                                                                                                                        if (var5_5 == 'l') break block30;
                                                                                                                        if (var5_5 == 'm') break block31;
                                                                                                                        if (var5_5 == 's') break block32;
                                                                                                                        if (var5_5 == 't') {
                                                                                                                            if (var18_18 != 'q' && var18_18 != 't' && var18_18 != 'Q' && var18_18 != 'T') {
                                                                                                                                var128_127 = 0.0f;
                                                                                                                                var127_126 = 0.0f;
                                                                                                                            } else {
                                                                                                                                var127_126 = var13_13 - var8_8;
                                                                                                                                var128_127 = var14_14 - var9_9;
                                                                                                                            }
                                                                                                                            var129_128 = var17_17 + 0;
                                                                                                                            var130_129 = var4_4[var129_128];
                                                                                                                            var131_130 = var17_17 + 1;
                                                                                                                            var0.rQuadTo(var127_126, var128_127, var130_129, var4_4[var131_130]);
                                                                                                                            var132_131 = var127_126 + var13_13;
                                                                                                                            var133_132 = var128_127 + var14_14;
                                                                                                                            var13_13 += var4_4[var129_128];
                                                                                                                            var14_14 += var4_4[var131_130];
                                                                                                                            var9_9 = var133_132;
                                                                                                                            var8_8 = var132_131;
                                                                                                                        }
                                                                                                                        break block33;
                                                                                                                    }
                                                                                                                    if (var18_18 != 'c' && var18_18 != 's' && var18_18 != 'C' && var18_18 != 'S') {
                                                                                                                        var119_118 = 0.0f;
                                                                                                                        var118_117 = 0.0f;
                                                                                                                    } else {
                                                                                                                        var117_116 = var13_13 - var8_8;
                                                                                                                        var118_117 = var14_14 - var9_9;
                                                                                                                        var119_118 = var117_116;
                                                                                                                    }
                                                                                                                    var120_119 = var17_17 + 0;
                                                                                                                    var121_120 = var4_4[var120_119];
                                                                                                                    var122_121 = var17_17 + 1;
                                                                                                                    var123_122 = var4_4[var122_121];
                                                                                                                    var124_123 = var17_17 + 2;
                                                                                                                    var125_124 = var4_4[var124_123];
                                                                                                                    var126_125 = var17_17 + 3;
                                                                                                                    var0.rCubicTo(var119_118, var118_117, var121_120, var123_122, var125_124, var4_4[var126_125]);
                                                                                                                    var80_79 = var13_13 + var4_4[var120_119];
                                                                                                                    var81_80 = var14_14 + var4_4[var122_121];
                                                                                                                    var13_13 += var4_4[var124_123];
                                                                                                                    var82_81 = var4_4[var126_125];
                                                                                                                    break block34;
                                                                                                                }
                                                                                                                var115_114 = var17_17 + 0;
                                                                                                                var13_13 += var4_4[var115_114];
                                                                                                                var116_115 = var17_17 + 1;
                                                                                                                var14_14 += var4_4[var116_115];
                                                                                                                if (var17_17 <= 0) break block35;
                                                                                                                var0.rLineTo(var4_4[var115_114], var4_4[var116_115]);
                                                                                                                break block33;
                                                                                                            }
                                                                                                            var0.rMoveTo(var4_4[var115_114], var4_4[var116_115]);
                                                                                                            break block36;
                                                                                                        }
                                                                                                        var112_111 = var17_17 + 0;
                                                                                                        var113_112 = var4_4[var112_111];
                                                                                                        var114_113 = var17_17 + 1;
                                                                                                        var0.rLineTo(var113_112, var4_4[var114_113]);
                                                                                                        var13_13 += var4_4[var112_111];
                                                                                                        var92_91 = var4_4[var114_113];
                                                                                                        break block37;
                                                                                                    }
                                                                                                    if (var18_18 == 'q' || var18_18 == 't' || var18_18 == 'Q' || var18_18 == 'T') {
                                                                                                        var13_13 = var13_13 * 2.0f - var8_8;
                                                                                                        var14_14 = var14_14 * 2.0f - var9_9;
                                                                                                    }
                                                                                                    var107_106 = var17_17 + 0;
                                                                                                    var108_107 = var4_4[var107_106];
                                                                                                    var109_108 = var17_17 + 1;
                                                                                                    var0.quadTo(var13_13, var14_14, var108_107, var4_4[var109_108]);
                                                                                                    var110_109 = var4_4[var107_106];
                                                                                                    var111_110 = var4_4[var109_108];
                                                                                                    var20_19 = var17_17;
                                                                                                    var9_9 = var14_14;
                                                                                                    var8_8 = var13_13;
                                                                                                    var13_13 = var110_109;
                                                                                                    var14_14 = var111_110;
                                                                                                    break block38;
                                                                                                }
                                                                                                if (var18_18 == 'c' || var18_18 == 's' || var18_18 == 'C' || var18_18 == 'S') {
                                                                                                    var13_13 = var13_13 * 2.0f - var8_8;
                                                                                                    var14_14 = var14_14 * 2.0f - var9_9;
                                                                                                }
                                                                                                var98_97 = var14_14;
                                                                                                var99_98 = var13_13;
                                                                                                var100_99 = var17_17 + 0;
                                                                                                var101_100 = var4_4[var100_99];
                                                                                                var102_101 = var17_17 + 1;
                                                                                                var103_102 = var4_4[var102_101];
                                                                                                var104_103 = var17_17 + 2;
                                                                                                var105_104 = var4_4[var104_103];
                                                                                                var106_105 = var17_17 + 3;
                                                                                                var0.cubicTo(var99_98, var98_97, var101_100, var103_102, var105_104, var4_4[var106_105]);
                                                                                                var80_79 = var4_4[var100_99];
                                                                                                var81_80 = var4_4[var102_101];
                                                                                                var13_13 = var4_4[var104_103];
                                                                                                var14_14 = var4_4[var106_105];
                                                                                                break block39;
                                                                                            }
                                                                                            var96_95 = var17_17 + 0;
                                                                                            var13_13 = var4_4[var96_95];
                                                                                            var97_96 = var17_17 + 1;
                                                                                            var14_14 = var4_4[var97_96];
                                                                                            if (var17_17 <= 0) break block40;
                                                                                            var0.lineTo(var4_4[var96_95], var4_4[var97_96]);
                                                                                            break block33;
                                                                                        }
                                                                                        var0.moveTo(var4_4[var96_95], var4_4[var97_96]);
                                                                                    }
                                                                                    var20_19 = var17_17;
                                                                                    var16_16 = var14_14;
                                                                                    var15_15 = var13_13;
                                                                                    break block38;
                                                                                }
                                                                                var93_92 = var17_17 + 0;
                                                                                var94_93 = var4_4[var93_92];
                                                                                var95_94 = var17_17 + 1;
                                                                                var0.lineTo(var94_93, var4_4[var95_94]);
                                                                                var13_13 = var4_4[var93_92];
                                                                                var14_14 = var4_4[var95_94];
                                                                                break block33;
                                                                            }
                                                                            var91_90 = var17_17 + 0;
                                                                            var0.rLineTo(0.0f, var4_4[var91_90]);
                                                                            var92_91 = var4_4[var91_90];
                                                                        }
                                                                        var14_14 += var92_91;
                                                                        break block33;
                                                                    }
                                                                    var84_83 = var17_17 + 0;
                                                                    var85_84 = var4_4[var84_83];
                                                                    var86_85 = var17_17 + 1;
                                                                    var87_86 = var4_4[var86_85];
                                                                    var88_87 = var17_17 + 2;
                                                                    var89_88 = var4_4[var88_87];
                                                                    var90_89 = var17_17 + 3;
                                                                    var0.rQuadTo(var85_84, var87_86, var89_88, var4_4[var90_89]);
                                                                    var80_79 = var13_13 + var4_4[var84_83];
                                                                    var81_80 = var14_14 + var4_4[var86_85];
                                                                    var13_13 += var4_4[var88_87];
                                                                    var82_81 = var4_4[var90_89];
                                                                    break block34;
                                                                }
                                                                var83_82 = var17_17 + 0;
                                                                var0.rLineTo(var4_4[var83_82], 0.0f);
                                                                var13_13 += var4_4[var83_82];
                                                                break block33;
                                                            }
                                                            var71_70 = var4_4[var17_17 + 0];
                                                            var72_71 = var4_4[var17_17 + 1];
                                                            var73_72 = var17_17 + 2;
                                                            var74_73 = var4_4[var73_72];
                                                            var75_74 = var17_17 + 3;
                                                            var76_75 = var4_4[var75_74];
                                                            var77_76 = var17_17 + 4;
                                                            var78_77 = var4_4[var77_76];
                                                            var79_78 = var17_17 + 5;
                                                            var0.rCubicTo(var71_70, var72_71, var74_73, var76_75, var78_77, var4_4[var79_78]);
                                                            var80_79 = var13_13 + var4_4[var73_72];
                                                            var81_80 = var14_14 + var4_4[var75_74];
                                                            var13_13 += var4_4[var77_76];
                                                            var82_81 = var4_4[var79_78];
                                                        }
                                                        var14_14 += var82_81;
                                                    }
                                                    var8_8 = var80_79;
                                                    var9_9 = var81_80;
                                                }
                                                var20_19 = var17_17;
                                                break block38;
                                            }
                                            var57_56 = var17_17 + 5;
                                            var58_57 = var13_13 + var4_4[var57_56];
                                            var59_58 = var17_17 + 6;
                                            var60_59 = var14_14 + var4_4[var59_58];
                                            var61_60 = var4_4[var17_17 + 0];
                                            var62_61 = var4_4[var17_17 + 1];
                                            var63_62 = var4_4[var17_17 + 2];
                                            var64_63 = var4_4[var17_17 + 3] != 0.0f;
                                            var65_64 = var4_4[var17_17 + 4] != 0.0f;
                                            var66_65 = var13_13;
                                            var67_66 = var14_14;
                                            var20_19 = var17_17;
                                            var68_67 = var14_14;
                                            var69_68 = var64_63;
                                            var70_69 = var13_13;
                                            b.c(var0, var66_65, var67_66, var58_57, var60_59, var61_60, var62_61, var63_62, var69_68, var65_64);
                                            var13_13 = var70_69 + var4_4[var57_56];
                                            var14_14 = var68_67 + var4_4[var59_58];
                                            break block41;
                                        }
                                        var20_19 = var17_17;
                                        var55_54 = var13_13;
                                        var56_55 = var20_19 + 0;
                                        var0.lineTo(var55_54, var4_4[var56_55]);
                                        var14_14 = var4_4[var56_55];
                                        break block38;
                                    }
                                    var20_19 = var17_17;
                                    var46_45 = var20_19 + 0;
                                    var47_46 = var4_4[var46_45];
                                    var48_47 = var20_19 + 1;
                                    var49_48 = var4_4[var48_47];
                                    var50_49 = var20_19 + 2;
                                    var51_50 = var4_4[var50_49];
                                    var52_51 = var20_19 + 3;
                                    var0.quadTo(var47_46, var49_48, var51_50, var4_4[var52_51]);
                                    var53_52 = var4_4[var46_45];
                                    var54_53 = var4_4[var48_47];
                                    var13_13 = var4_4[var50_49];
                                    var14_14 = var4_4[var52_51];
                                    var8_8 = var53_52;
                                    var9_9 = var54_53;
                                    break block38;
                                }
                                var20_19 = var17_17;
                                var44_43 = var14_14;
                                var45_44 = var20_19 + 0;
                                var0.lineTo(var4_4[var45_44], var44_43);
                                var13_13 = var4_4[var45_44];
                                break block38;
                            }
                            var20_19 = var17_17;
                            var32_31 = var4_4[var20_19 + 0];
                            var33_32 = var4_4[var20_19 + 1];
                            var34_33 = var20_19 + 2;
                            var35_34 = var4_4[var34_33];
                            var36_35 = var20_19 + 3;
                            var37_36 = var4_4[var36_35];
                            var38_37 = var20_19 + 4;
                            var39_38 = var4_4[var38_37];
                            var40_39 = var20_19 + 5;
                            var0.cubicTo(var32_31, var33_32, var35_34, var37_36, var39_38, var4_4[var40_39]);
                            var13_13 = var4_4[var38_37];
                            var41_40 = var4_4[var40_39];
                            var42_41 = var4_4[var34_33];
                            var43_42 = var4_4[var36_35];
                            var14_14 = var41_40;
                            var9_9 = var43_42;
                            var8_8 = var42_41;
                            break block38;
                        }
                        var20_19 = var17_17;
                        var21_20 = var14_14;
                        var22_21 = var13_13;
                        var23_22 = var20_19 + 5;
                        var24_23 = var4_4[var23_22];
                        var25_24 = var20_19 + 6;
                        var26_25 = var4_4[var25_24];
                        var27_26 = var4_4[var20_19 + 0];
                        var28_27 = var4_4[var20_19 + 1];
                        var29_28 = var4_4[var20_19 + 2];
                        var30_29 = var4_4[var20_19 + 3] != 0.0f;
                        var31_30 = var4_4[var20_19 + 4] != 0.0f;
                        b.c(var0, var22_21, var21_20, var24_23, var26_25, var27_26, var28_27, var29_28, var30_29, var31_30);
                        var13_13 = var4_4[var23_22];
                        var14_14 = var4_4[var25_24];
                    }
                    var9_9 = var14_14;
                    var8_8 = var13_13;
                }
                var17_17 = var20_19 + var12_12;
                var5_5 = var18_18 = var3_3;
            } while (true);
        }

        private static void b(Path path, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10) {
            double d11 = d4;
            int n2 = (int)Math.ceil((double)Math.abs((double)(d10 * 4.0 / 3.141592653589793)));
            double d12 = Math.cos((double)d8);
            double d13 = Math.sin((double)d8);
            double d14 = Math.cos((double)d9);
            double d15 = Math.sin((double)d9);
            double d16 = -d11;
            double d17 = d16 * d12;
            double d18 = d17 * d15;
            double d19 = d5 * d13;
            double d20 = d18 - d19 * d14;
            double d21 = d16 * d13;
            double d22 = d15 * d21;
            double d23 = d5 * d12;
            double d24 = d22 + d14 * d23;
            double d25 = n2;
            Double.isNaN((double)d25);
            double d26 = d10 / d25;
            double d27 = d9;
            double d28 = d24;
            double d29 = d20;
            double d30 = d6;
            double d31 = d7;
            for (int i2 = 0; i2 < n2; ++i2) {
                double d32 = d27 + d26;
                double d33 = Math.sin((double)d32);
                double d34 = Math.cos((double)d32);
                double d35 = d2 + d34 * (d11 * d12);
                double d36 = d19 * d33;
                int n3 = n2;
                double d37 = d35 - d36;
                double d38 = d3 + d34 * (d11 * d13) + d23 * d33;
                double d39 = d17 * d33 - d19 * d34;
                double d40 = d33 * d21 + d34 * d23;
                double d41 = d32 - d27;
                double d42 = Math.tan((double)(d41 / 2.0));
                double d43 = Math.sin((double)d41) * (Math.sqrt((double)(4.0 + d42 * (d42 * 3.0))) - 1.0) / 3.0;
                double d44 = d30 + d29 * d43;
                double d45 = d28 * d43;
                double d46 = d12;
                double d47 = d31 + d45;
                double d48 = d43 * d39;
                double d49 = d13;
                double d50 = d37 - d48;
                double d51 = d43 * d40;
                double d52 = d26;
                double d53 = d38 - d51;
                double d54 = d21;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float)d44, (float)d47, (float)d50, (float)d53, (float)d37, (float)d38);
                d26 = d52;
                d13 = d49;
                d30 = d37;
                d21 = d54;
                d12 = d46;
                d27 = d32;
                d28 = d40;
                d29 = d39;
                n2 = n3;
                d31 = d38;
                d11 = d4;
            }
        }

        private static void c(Path path, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean bl, boolean bl2) {
            double d2;
            double d3;
            double d4 = Math.toRadians((double)f8);
            double d5 = Math.cos((double)d4);
            double d6 = Math.sin((double)d4);
            double d7 = f2;
            Double.isNaN((double)d7);
            double d8 = d7 * d5;
            double d9 = f3;
            Double.isNaN((double)d9);
            double d10 = d8 + d9 * d6;
            double d11 = f6;
            Double.isNaN((double)d11);
            double d12 = d10 / d11;
            double d13 = -f2;
            Double.isNaN((double)d13);
            double d14 = d13 * d6;
            Double.isNaN((double)d9);
            double d15 = d14 + d9 * d5;
            double d16 = f7;
            Double.isNaN((double)d16);
            double d17 = d15 / d16;
            double d18 = f4;
            Double.isNaN((double)d18);
            double d19 = d18 * d5;
            double d20 = f5;
            Double.isNaN((double)d20);
            double d21 = d19 + d20 * d6;
            Double.isNaN((double)d11);
            double d22 = d21 / d11;
            double d23 = -f4;
            Double.isNaN((double)d23);
            double d24 = d23 * d6;
            Double.isNaN((double)d20);
            double d25 = d24 + d20 * d5;
            Double.isNaN((double)d16);
            double d26 = d25 / d16;
            double d27 = d12 - d22;
            double d28 = d17 - d26;
            double d29 = (d12 + d22) / 2.0;
            double d30 = (d17 + d26) / 2.0;
            double d31 = d27 * d27 + d28 * d28;
            if (d31 == 0.0) {
                Log.w((String)"PathParser", (String)" Points are coincident");
                return;
            }
            double d32 = 1.0 / d31 - 0.25;
            if (d32 < 0.0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Points are too far apart ");
                stringBuilder.append(d31);
                Log.w((String)"PathParser", (String)stringBuilder.toString());
                float f9 = (float)(Math.sqrt((double)d31) / 1.99999);
                b.c(path, f2, f3, f4, f5, f6 * f9, f7 * f9, f8, bl, bl2);
                return;
            }
            double d33 = Math.sqrt((double)d32);
            double d34 = d27 * d33;
            double d35 = d33 * d28;
            if (bl == bl2) {
                d3 = d29 - d35;
                d2 = d30 + d34;
            } else {
                d3 = d29 + d35;
                d2 = d30 - d34;
            }
            double d36 = Math.atan2((double)(d17 - d2), (double)(d12 - d3));
            double d37 = Math.atan2((double)(d26 - d2), (double)(d22 - d3)) - d36;
            boolean bl3 = d37 >= 0.0;
            if (bl2 != bl3) {
                d37 = d37 > 0.0 ? (d37 -= 6.283185307179586) : (d37 += 6.283185307179586);
            }
            Double.isNaN((double)d11);
            double d38 = d3 * d11;
            Double.isNaN((double)d16);
            double d39 = d2 * d16;
            b.b(path, d38 * d5 - d39 * d6, d38 * d6 + d39 * d5, d11, d16, d7, d9, d4, d36, d37);
        }

        public static void e(b[] arrb, Path path) {
            float[] arrf = new float[6];
            char c2 = 'm';
            for (int i2 = 0; i2 < arrb.length; ++i2) {
                b.a(path, arrf, c2, arrb[i2].a, arrb[i2].b);
                c2 = arrb[i2].a;
            }
        }

        public void d(b b2, b b3, float f2) {
            float[] arrf;
            for (int i2 = 0; i2 < (arrf = b2.b).length; ++i2) {
                this.b[i2] = arrf[i2] * (1.0f - f2) + f2 * b3.b[i2];
            }
        }
    }

}

