/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 *  java.lang.Exception
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.Callable
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.atomic.AtomicBoolean
 *  java.util.concurrent.atomic.AtomicReference
 *  java.util.concurrent.locks.Condition
 *  java.util.concurrent.locks.ReentrantLock
 */
package a.b.d.g;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class c {
    private final Object a = new Object();
    private HandlerThread b;
    private Handler c;
    private int d;
    private Handler.Callback e = new Handler.Callback(){

        public boolean handleMessage(Message message) {
            int n2 = message.what;
            if (n2 != 0) {
                if (n2 != 1) {
                    return true;
                }
                c.this.d((Runnable)message.obj);
                return true;
            }
            c.this.c();
            return true;
        }
    };
    private final int f;
    private final int g;
    private final String h;

    public c(String string, int n2, int n3) {
        this.h = string;
        this.g = n2;
        this.f = n3;
        this.d = 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void c() {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            if (this.c.hasMessages(1)) {
                return;
            }
            this.b.quit();
            this.b = null;
            this.c = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void d(Runnable runnable) {
        Object object;
        runnable.run();
        Object object2 = object = this.a;
        synchronized (object2) {
            this.c.removeMessages(0);
            Handler handler = this.c;
            handler.sendMessageDelayed(handler.obtainMessage(0), (long)this.f);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void e(Runnable runnable) {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            if (this.b == null) {
                HandlerThread handlerThread;
                this.b = handlerThread = new HandlerThread(this.h, this.g);
                handlerThread.start();
                this.c = new Handler(this.b.getLooper(), this.e);
                this.d = 1 + this.d;
            }
            this.c.removeMessages(0);
            Handler handler = this.c;
            handler.sendMessage(handler.obtainMessage(1, (Object)runnable));
            return;
        }
    }

    public <T> void f(final Callable<T> callable, d<T> d2) {
        this.e(new Runnable(new Handler(), d2){
            final /* synthetic */ Handler b;
            final /* synthetic */ d c;
            {
                this.b = handler;
                this.c = d2;
            }

            /*
             * Exception decompiling
             */
            public void run() {
                // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl8 : ALOAD_0 : trying to set 1 previously set to 0
                // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
                // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
                // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
                // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
                // org.benf.cfr.reader.entities.g.p(Method.java:396)
                // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
                // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
                // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
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

        });
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public <T> T g(final Callable<T> var1_1, int var2_2) {
        block7 : {
            var3_3 = new ReentrantLock();
            var4_4 = var3_3.newCondition();
            var5_5 = new AtomicReference();
            var6_6 = new AtomicBoolean(true);
            var7_7 = new Runnable(){

                public void run() {
                    try {
                        var5_5.set(var1_1.call());
                    }
                    catch (Exception exception) {}
                    var3_3.lock();
                    try {
                        var6_6.set(false);
                        var4_4.signal();
                        return;
                    }
                    finally {
                        var3_3.unlock();
                    }
                }
            };
            this.e(var7_7);
            var3_3.lock();
            if (var6_6.get()) break block7;
            var13_8 = var5_5.get();
            var3_3.unlock();
            return (T)var13_8;
        }
        try {
            var9_9 = TimeUnit.MILLISECONDS.toNanos((long)var2_2);
            do lbl-1000: // 2 sources:
            {
                try {
                    var9_9 = var4_4.awaitNanos(var9_9);
                }
                catch (InterruptedException v0) {}
                if (var6_6.get()) continue;
                var12_10 = var5_5.get();
                break;
            } while (true);
        }
        catch (Throwable var8_11) {
            var3_3.unlock();
            throw var8_11;
        }
        {
            var3_3.unlock();
            return (T)var12_10;
            ** while (var9_9 > 0L)
        }
lbl31: // 2 sources:
        throw new InterruptedException("timeout");
    }

    public static interface d<T> {
        public void a(T var1);
    }

}

