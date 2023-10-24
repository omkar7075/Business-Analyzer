/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.io.Writer
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package a.b.d.h;

import android.util.Log;
import java.io.Writer;

public class e
extends Writer {
    private final String a;
    private StringBuilder b = new StringBuilder(128);

    public e(String string) {
        this.a = string;
    }

    private void a() {
        if (this.b.length() > 0) {
            Log.d((String)this.a, (String)this.b.toString());
            StringBuilder stringBuilder = this.b;
            stringBuilder.delete(0, stringBuilder.length());
        }
    }

    public void close() {
        this.a();
    }

    public void flush() {
        this.a();
    }

    public void write(char[] arrc, int n2, int n3) {
        for (int i2 = 0; i2 < n3; ++i2) {
            char c2 = arrc[n2 + i2];
            if (c2 == '\n') {
                this.a();
                continue;
            }
            this.b.append(c2);
        }
    }
}

