/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.ContentUris
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ProviderInfo
 *  android.content.pm.Signature
 *  android.content.res.Resources
 *  android.database.Cursor
 *  android.graphics.Typeface
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.CancellationSignal
 *  android.widget.TextView
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.nio.ByteBuffer
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.Callable
 */
package a.b.d.g;

import a.b.d.c.h;
import a.b.d.g.c;
import a.b.d.h.g;
import a.b.d.h.o;
import a.b.d.h.p;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class b {
    private static final g<String, Typeface> a = new g(16);
    private static final a.b.d.g.c b = new a.b.d.g.c("fonts", 10, 10000);
    private static final Object c = new Object();
    private static final p<String, ArrayList<c.d<Typeface>>> d = new p();
    private static final Comparator<byte[]> e = new Comparator<byte[]>(){

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public int a(byte[] arrby, byte[] arrby2) {
            int n2;
            int n3;
            if (arrby.length != arrby2.length) {
                n3 = arrby.length;
                n2 = arrby2.length;
                do {
                    return n3 - n2;
                    break;
                } while (true);
            }
            for (int i2 = 0; i2 < arrby.length; ++i2) {
                if (arrby[i2] == arrby2[i2]) continue;
                n3 = arrby[i2];
                n2 = arrby2[i2];
                return n3 - n2;
            }
            return 0;
        }
    };

    private static List<byte[]> e(Signature[] arrsignature) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < arrsignature.length; ++i2) {
            arrayList.add((Object)arrsignature[i2].toByteArray());
        }
        return arrayList;
    }

    private static boolean f(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); ++i2) {
            if (Arrays.equals((byte[])((byte[])list.get(i2)), (byte[])((byte[])list2.get(i2)))) continue;
            return false;
        }
        return true;
    }

    public static e g(Context context, CancellationSignal cancellationSignal, a.b.d.g.a a2) {
        ProviderInfo providerInfo = b.l(context.getPackageManager(), a2, context.getResources());
        if (providerInfo == null) {
            return new e(1, null);
        }
        return new e(0, b.i(context, a2, providerInfo.authority, cancellationSignal));
    }

    private static List<List<byte[]>> h(a.b.d.g.a a2, Resources resources) {
        if (a2.a() != null) {
            return a2.a();
        }
        return a.b.d.b.d.a.b(resources, a2.b());
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    static f[] i(Context context, a.b.d.g.a a2, String string, CancellationSignal cancellationSignal) {
        Cursor cursor;
        void var7_36;
        block9 : {
            Cursor cursor2;
            ArrayList arrayList;
            block8 : {
                ArrayList arrayList2;
                block7 : {
                    String string3;
                    int n2;
                    String string2;
                    ArrayList arrayList3 = new ArrayList();
                    Uri uri = new Uri.Builder().scheme("content").authority(string).build();
                    Uri uri2 = new Uri.Builder().scheme("content").authority(string).appendPath("file").build();
                    int n3 = Build.VERSION.SDK_INT;
                    if (n3 > 16) {
                        ContentResolver contentResolver = context.getContentResolver();
                        String[] arrstring = new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                        String[] arrstring2 = new String[]{a2.f()};
                        arrayList2 = arrayList3;
                        string3 = "file_id";
                        cursor2 = contentResolver.query(uri, arrstring, "query = ?", arrstring2, null, cancellationSignal);
                        string2 = "_id";
                        n2 = 1;
                    } else {
                        arrayList2 = arrayList3;
                        string3 = "file_id";
                        string2 = "_id";
                        ContentResolver contentResolver = context.getContentResolver();
                        String[] arrstring = new String[]{string2, string3, "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                        String[] arrstring3 = new String[]{a2.f()};
                        n2 = 1;
                        cursor2 = contentResolver.query(uri, arrstring, "query = ?", arrstring3, null);
                    }
                    if (cursor2 == null) break block7;
                    try {
                        if (cursor2.getCount() <= 0) break block7;
                        int n4 = cursor2.getColumnIndex("result_code");
                        ArrayList arrayList4 = new ArrayList();
                        int n5 = cursor2.getColumnIndex(string2);
                        int n6 = cursor2.getColumnIndex(string3);
                        int n7 = cursor2.getColumnIndex("font_ttc_index");
                        int n8 = cursor2.getColumnIndex("font_weight");
                        int n9 = cursor2.getColumnIndex("font_italic");
                        while (cursor2.moveToNext()) {
                            int n10 = n4 != -1 ? cursor2.getInt(n4) : 0;
                            int n11 = n7 != -1 ? cursor2.getInt(n7) : 0;
                            Uri uri3 = n6 == -1 ? ContentUris.withAppendedId((Uri)uri, (long)cursor2.getLong(n5)) : ContentUris.withAppendedId((Uri)uri2, (long)cursor2.getLong(n6));
                            Uri uri4 = uri3;
                            int n12 = n8 != -1 ? cursor2.getInt(n8) : 400;
                            boolean bl = n9 != -1 && cursor2.getInt(n9) == n2;
                            f f2 = new f(uri4, n11, n12, bl, n10);
                            arrayList4.add((Object)f2);
                        }
                        arrayList = arrayList4;
                        break block8;
                    }
                    catch (Throwable throwable) {
                        cursor = cursor2;
                        break block9;
                    }
                }
                arrayList = arrayList2;
            }
            if (cursor2 == null) return (f[])arrayList.toArray((Object[])new f[0]);
            cursor2.close();
            return (f[])arrayList.toArray((Object[])new f[0]);
            catch (Throwable throwable) {
                cursor = null;
            }
        }
        if (cursor == null) throw var7_36;
        cursor.close();
        throw var7_36;
    }

    /*
     * Exception decompiling
     */
    private static Typeface j(Context var0, a.b.d.g.a var1, int var2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl16.1 : ACONST_NULL : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Typeface k(final Context context, final a.b.d.g.a a2, TextView textView, int n2, int n3, final int n4) {
        Object object;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a2.c());
        stringBuilder.append("-");
        stringBuilder.append(n4);
        final String string = stringBuilder.toString();
        Typeface typeface = a.c(string);
        if (typeface != null) {
            return typeface;
        }
        boolean bl = n2 == 0;
        if (bl && n3 == -1) {
            return b.j(context, a2, n4);
        }
        Callable<Typeface> callable = new Callable<Typeface>(){

            public Typeface a() {
                Typeface typeface = b.j(context, a2, n4);
                if (typeface != null) {
                    a.d(string, typeface);
                }
                return typeface;
            }
        };
        if (bl) {
            try {
                return b.g(callable, n3);
            }
            catch (InterruptedException interruptedException) {
                return null;
            }
        }
        c.d<Typeface> d2 = new c.d<Typeface>(new WeakReference((Object)textView), textView, n4){
            final /* synthetic */ WeakReference a;
            final /* synthetic */ TextView b;
            final /* synthetic */ int c;
            {
                this.a = weakReference;
                this.b = textView;
                this.c = n2;
            }

            public void b(Typeface typeface) {
                if ((TextView)this.a.get() != null) {
                    this.b.setTypeface(typeface, this.c);
                }
            }
        };
        Object object2 = object = c;
        synchronized (object2) {
            p<String, ArrayList<c.d<Typeface>>> p2 = d;
            if (p2.containsKey(string)) {
                p2.get(string).add((Object)d2);
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add((Object)d2);
            p2.put(string, (ArrayList<c.d<Typeface>>)arrayList);
        }
        b.f(callable, new c.d<Typeface>(){

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            public void b(Typeface typeface) {
                Object object;
                Object object2 = object = c;
                // MONITORENTER : object2
                ArrayList arrayList = (ArrayList)d.get(string);
                d.remove(string);
                // MONITOREXIT : object2
                int n2 = 0;
                while (n2 < arrayList.size()) {
                    ((c.d)arrayList.get(n2)).a(typeface);
                    ++n2;
                }
                return;
                {
                    catch (Throwable throwable) {}
                    {
                        // MONITOREXIT : object2
                        throw throwable;
                    }
                }
            }
        });
        return null;
    }

    public static ProviderInfo l(PackageManager packageManager, a.b.d.g.a a2, Resources resources) {
        PackageManager.NameNotFoundException nameNotFoundException;
        String string = a2.d();
        ProviderInfo providerInfo = packageManager.resolveContentProvider(string, 0);
        if (providerInfo != null) {
            if (providerInfo.packageName.equals((Object)a2.e())) {
                List<byte[]> list = b.e(packageManager.getPackageInfo((String)providerInfo.packageName, (int)64).signatures);
                Collections.sort(list, e);
                List<List<byte[]>> list2 = b.h(a2, resources);
                for (int i2 = 0; i2 < list2.size(); ++i2) {
                    ArrayList arrayList = new ArrayList((Collection)list2.get(i2));
                    Collections.sort((List)arrayList, e);
                    if (!b.f(list, (List<byte[]>)arrayList)) continue;
                    return providerInfo;
                }
                return null;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Found content provider ");
            stringBuilder.append(string);
            stringBuilder.append(", but package was not ");
            stringBuilder.append(a2.e());
            throw new PackageManager.NameNotFoundException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No package found for authority: ");
        stringBuilder.append(string);
        nameNotFoundException = new PackageManager.NameNotFoundException(stringBuilder.toString());
        throw nameNotFoundException;
    }

    public static Map<Uri, ByteBuffer> m(Context context, f[] arrf, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (f f2 : arrf) {
            Uri uri;
            if (f2.a() != 0 || hashMap.containsKey((Object)(uri = f2.c()))) continue;
            hashMap.put((Object)uri, (Object)h.f(context, cancellationSignal, uri));
        }
        return Collections.unmodifiableMap((Map)hashMap);
    }

    public static class e {
        private final int a;
        private final f[] b;

        public e(int n2, f[] arrf) {
            this.a = n2;
            this.b = arrf;
        }

        public f[] a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    public static class f {
        private final Uri a;
        private final int b;
        private final int c;
        private final boolean d;
        private final int e;

        public f(Uri uri, int n2, int n3, boolean bl, int n4) {
            this.a = o.a(uri);
            this.b = n2;
            this.c = n3;
            this.d = bl;
            this.e = n4;
        }

        public int a() {
            return this.e;
        }

        public int b() {
            return this.b;
        }

        public Uri c() {
            return this.a;
        }

        public int d() {
            return this.c;
        }

        public boolean e() {
            return this.d;
        }
    }

}

