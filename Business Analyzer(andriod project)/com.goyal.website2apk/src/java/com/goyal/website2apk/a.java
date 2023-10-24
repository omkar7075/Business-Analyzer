/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.security.Key
 *  java.security.NoSuchAlgorithmException
 *  java.security.spec.AlgorithmParameterSpec
 *  javax.crypto.Cipher
 *  javax.crypto.NoSuchPaddingException
 *  javax.crypto.spec.IvParameterSpec
 *  javax.crypto.spec.SecretKeySpec
 */
package com.goyal.website2apk;

import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class a {
    static char[] a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private IvParameterSpec b;
    private SecretKeySpec c;
    private Cipher d;

    public a(String string, String string2) {
        this.b = new IvParameterSpec(string2.getBytes());
        this.c = new SecretKeySpec(string.getBytes(), "AES");
        try {
            this.d = Cipher.getInstance((String)"AES/CBC/NoPadding");
            return;
        }
        catch (NoSuchPaddingException noSuchPaddingException) {
            noSuchPaddingException.printStackTrace();
            return;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
            return;
        }
    }

    public static byte[] b(String string) {
        if (string == null) {
            return null;
        }
        if (string.length() < 2) {
            return null;
        }
        int n2 = string.length() / 2;
        byte[] arrby = new byte[n2];
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = i2 * 2;
            arrby[i2] = (byte)Integer.parseInt((String)string.substring(n3, n3 + 2), (int)16);
        }
        return arrby;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public byte[] a(String var1_1) {
        if (var1_1 == null || var1_1.length() == 0) ** GOTO lbl9
        try {
            block7 : {
                this.d.init(2, (Key)this.c, (AlgorithmParameterSpec)this.b);
                var7_2 = this.d.doFinal(a.b(var1_1));
                if (var7_2.length <= 0) return var7_2;
                var8_3 = -1 + var7_2.length;
                var9_4 = 0;
                break block7;
lbl9: // 1 sources:
                var2_8 = new Exception("Empty string");
                throw var2_8;
            }
lbl12: // 2 sources:
            do {
                if (var8_3 >= 0) {
                    if (var7_2[var8_3] == 0) {
                        ++var9_4;
                    }
                    break;
                }
                if (var9_4 <= 0) return var7_2;
                var10_5 = new byte[var7_2.length - var9_4];
                System.arraycopy((Object)var7_2, (int)0, (Object)var10_5, (int)0, (int)(var7_2.length - var9_4));
                return var10_5;
                break;
            } while (true);
        }
        catch (Exception var3_6) {
            var4_7 = new StringBuilder();
            var4_7.append("[decrypt] ");
            var4_7.append(var3_6.getMessage());
            throw new Exception(var4_7.toString());
        }
        --var8_3;
        ** while (true)
    }
}

