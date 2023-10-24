/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.AlertDialog$Builder
 *  android.app.DownloadManager
 *  android.app.DownloadManager$Request
 *  android.content.ActivityNotFoundException
 *  android.content.ComponentName
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.net.Uri
 *  android.net.http.SslError
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Environment
 *  android.os.Handler
 *  android.os.Parcelable
 *  android.print.PrintAttributes
 *  android.print.PrintAttributes$Builder
 *  android.print.PrintAttributes$MediaSize
 *  android.print.PrintDocumentAdapter
 *  android.print.PrintJob
 *  android.print.PrintManager
 *  android.provider.Settings
 *  android.provider.Settings$Secure
 *  android.provider.Settings$SettingNotFoundException
 *  android.support.design.widget.NavigationView
 *  android.support.design.widget.NavigationView$b
 *  android.support.v4.widget.DrawerLayout
 *  android.support.v4.widget.SwipeRefreshLayout
 *  android.support.v4.widget.SwipeRefreshLayout$j
 *  android.support.v7.app.b
 *  android.support.v7.app.e
 *  android.support.v7.widget.Toolbar
 *  android.text.TextUtils
 *  android.util.Log
 *  android.view.LayoutInflater
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnLongClickListener
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.Window
 *  android.webkit.ConsoleMessage
 *  android.webkit.CookieManager
 *  android.webkit.CookieSyncManager
 *  android.webkit.DownloadListener
 *  android.webkit.GeolocationPermissions
 *  android.webkit.GeolocationPermissions$Callback
 *  android.webkit.JavascriptInterface
 *  android.webkit.JsResult
 *  android.webkit.PermissionRequest
 *  android.webkit.SslErrorHandler
 *  android.webkit.URLUtil
 *  android.webkit.ValueCallback
 *  android.webkit.WebChromeClient
 *  android.webkit.WebChromeClient$CustomViewCallback
 *  android.webkit.WebChromeClient$FileChooserParams
 *  android.webkit.WebStorage
 *  android.webkit.WebStorage$QuotaUpdater
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.ProgressBar
 *  android.widget.Toast
 *  java.io.BufferedReader
 *  java.io.File
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.io.StringWriter
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.URLDecoder
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.goyal.website2apk;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Parcelable;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintJob;
import android.print.PrintManager;
import android.provider.Settings;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.webkit.ConsoleMessage;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity
extends android.support.v7.app.e
implements NavigationView.b {
    private static final String q = MainActivity.class.getSimpleName();
    ImageView A;
    String B;
    String C;
    ProgressBar D;
    WebChromeClient E;
    Context F;
    DrawerLayout G;
    android.support.v7.app.b H;
    Toolbar I;
    com.goyal.website2apk.a J;
    Boolean K = Boolean.FALSE;
    private SwipeRefreshLayout r;
    NavigationView s;
    private String t;
    private ValueCallback<Uri> u;
    private ValueCallback<Uri[]> v;
    private FrameLayout w;
    private WebChromeClient.CustomViewCallback x;
    private View y;
    WebView z;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private String D(int n2) {
        InputStream inputStream = this.getResources().openRawResource(n2);
        StringWriter stringWriter = new StringWriter();
        char[] arrc = new char[1024];
        try {
            int n3;
            BufferedReader bufferedReader = new BufferedReader((Reader)new InputStreamReader(inputStream, "UTF-8"));
            while ((n3 = bufferedReader.read(arrc)) != -1) {
                stringWriter.write(arrc, 0, n3);
            }
            return stringWriter.toString();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return stringWriter.toString();
    }

    private void T() {
        NavigationView navigationView;
        if (!this.getResources().getBoolean(2130968593)) {
            return;
        }
        this.s = navigationView = (NavigationView)this.findViewById(2131230875);
        Menu menu = navigationView.getMenu();
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2;
            jSONArray = jSONArray2 = new JSONArray(new String(this.J.a(this.D(2131492864))));
        }
        catch (Exception exception) {
            Toast.makeText((Context)this.F, (CharSequence)exception.getMessage(), (int)0).show();
        }
        for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
            try {
                menu.add(0, i2, 0, (CharSequence)URLDecoder.decode((String)jSONArray.getJSONObject(i2).getString("title")));
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
                return;
            }
        }
        if (this.getResources().getBoolean(2130968603)) {
            int n2 = jSONArray.length();
            menu.add(1, n2 + 1, 0, (CharSequence)"Share App");
            menu.add(1, n2 + 2, 0, (CharSequence)"Rate Us");
            menu.add(1, n2 + 3, 0, (CharSequence)"About Us");
            menu.add(1, n2 + 4, 0, (CharSequence)"Exit");
        }
        this.s.invalidate();
    }

    private boolean W(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("android.permission.");
        stringBuilder.append(string);
        return this.checkCallingOrSelfPermission(stringBuilder.toString()) == 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean X(String string) {
        Intent intent;
        if (string.startsWith("market://")) {
            try {
                this.z.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)string)));
                return true;
            }
            catch (ActivityNotFoundException activityNotFoundException) {
                activityNotFoundException.printStackTrace();
                return true;
            }
        }
        if (string.startsWith("tel:")) {
            intent = new Intent("android.intent.action.DIAL", Uri.parse((String)string));
        } else {
            if (string.startsWith("exit:")) {
                this.finish();
                return true;
            }
            if (string.startsWith("intent://") && string.contains((CharSequence)"scheme=http")) {
                String string2 = Uri.decode((String)string);
                Matcher matcher = Pattern.compile((String)"intent://(.*?)#").matcher((CharSequence)string2);
                if (!matcher.find()) {
                    return false;
                }
                String string3 = matcher.group(1);
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("http://");
                stringBuilder.append(string3);
                intent = new Intent("android.intent.action.VIEW", Uri.parse((String)stringBuilder.toString()));
            } else if (!(string.startsWith("whatsapp:") || string.startsWith("skype:") || string.startsWith("geo:0,0?q=") || string.startsWith("maps:") || string.startsWith("tg:"))) {
                if (string.startsWith("sms:")) {
                    intent = new Intent("android.intent.action.SENDTO", Uri.parse((String)string));
                } else if (string.startsWith("mailto:")) {
                    intent = new Intent("android.intent.action.SENDTO", Uri.parse((String)string));
                } else {
                    if (!string.contains((CharSequence)"#___external")) {
                        return false;
                    }
                    intent = new Intent("android.intent.action.VIEW", Uri.parse((String)string));
                }
            } else {
                intent = new Intent("android.intent.action.VIEW", Uri.parse((String)string));
            }
        }
        this.startActivity(intent);
        return true;
    }

    private File Y() {
        String string = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("img_");
        stringBuilder.append(string);
        stringBuilder.append("_");
        return File.createTempFile((String)stringBuilder.toString(), (String)".jpg", (File)Environment.getExternalStoragePublicDirectory((String)Environment.DIRECTORY_PICTURES));
    }

    /*
     * Exception decompiling
     */
    private Date a0() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl34 : ALOAD_1 : trying to set 0 previously set to 1
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

    private String b0() {
        return MainActivity.h0(this.getPackageName()).toUpperCase().substring(0, 16);
    }

    private String c0() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getString(2131558441));
        stringBuilder.append(this.getPackageName());
        return MainActivity.h0(stringBuilder.toString()).toUpperCase().substring(16, 32);
    }

    private Boolean e0() {
        if (this.F.getPackageName().equalsIgnoreCase("com.goyal.website2apk")) {
            return Boolean.FALSE;
        }
        if (!this.getString(2131558440).toUpperCase().substring(16, 32).equals((Object)this.c0())) {
            Date date = this.a0();
            long l2 = (new Date().getTime() - date.getTime()) / 86400000L;
            String string = this.F.getPackageManager().getInstallerPackageName(this.F.getPackageName());
            if (l2 > 30L && string != null && !string.equals((Object)"com.google.android.packageinstaller")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("https://websitetoapk.com/");
                stringBuilder.append(new StringBuffer("ptset/tsetppa").reverse().toString());
                stringBuilder.append(".html");
                this.B = stringBuilder.toString();
                if (Build.VERSION.SDK_INT >= 19) {
                    WebView.setWebContentsDebuggingEnabled((boolean)this.getResources().getBoolean(2130968602));
                }
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    public static boolean f0(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                int n2 = Settings.Secure.getInt((ContentResolver)context.getContentResolver(), (String)"location_mode");
                return n2 != 0;
            }
            catch (Settings.SettingNotFoundException settingNotFoundException) {
                settingNotFoundException.printStackTrace();
                return false;
            }
        }
        return true ^ TextUtils.isEmpty((CharSequence)Settings.Secure.getString((ContentResolver)context.getContentResolver(), (String)"location_providers_allowed"));
    }

    public static final String h0(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("00110011");
        String string2 = stringBuilder.toString();
        MessageDigest messageDigest = MessageDigest.getInstance((String)"MD5");
        messageDigest.update(string2.getBytes());
        byte[] arrby = messageDigest.digest();
        StringBuilder stringBuilder2 = new StringBuilder();
        int n2 = arrby.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string3 = Integer.toHexString((int)(255 & arrby[i2]));
            while (string3.length() < 2) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("0");
                stringBuilder3.append(string3);
                string3 = stringBuilder3.toString();
            }
            stringBuilder2.append(string3);
        }
        try {
            String string4 = stringBuilder2.toString();
            return string4;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            noSuchAlgorithmException.printStackTrace();
            return "";
        }
    }

    public void C() {
        if (this.getResources().getBoolean(2130968588)) {
            new AlertDialog.Builder((Context)this).setTitle(2131558439).setNegativeButton(17039360, null).setPositiveButton(17039370, new DialogInterface.OnClickListener(){

                public void onClick(DialogInterface dialogInterface, int n2) {
                    MainActivity.this.finish();
                }
            }).create().show();
            return;
        }
        this.finish();
    }

    public void U() {
        if (!MainActivity.f0(this.F)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.F);
            builder.setTitle((CharSequence)"Enable GPS");
            builder.setMessage((CharSequence)"GPS is disabled. Do you want to enable it?");
            builder.setPositiveButton((CharSequence)"Settings", new DialogInterface.OnClickListener(){

                public void onClick(DialogInterface dialogInterface, int n2) {
                    Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                    MainActivity.this.F.startActivity(intent);
                }
            });
            builder.setNegativeButton((CharSequence)"Cancel", new DialogInterface.OnClickListener(){

                public void onClick(DialogInterface dialogInterface, int n2) {
                    dialogInterface.cancel();
                }
            });
            builder.show();
        }
    }

    @TargetApi(value=23)
    protected void V() {
        this.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION", "android.permission.RECORD_AUDIO", "android.permission.CAMERA"}, 200);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void Z(WebView webView) {
        block2 : {
            String string;
            Context context;
            block4 : {
                PrintJob printJob;
                block3 : {
                    if (Build.VERSION.SDK_INT < 19) break block2;
                    PrintManager printManager = (PrintManager)this.getSystemService("print");
                    PrintDocumentAdapter printDocumentAdapter = webView.createPrintDocumentAdapter();
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this.getString(2131558435));
                    stringBuilder.append(" Document");
                    String string2 = stringBuilder.toString();
                    PrintAttributes.Builder builder = new PrintAttributes.Builder();
                    builder.setMediaSize(PrintAttributes.MediaSize.ISO_A5);
                    printJob = printManager.print(string2, printDocumentAdapter, builder.build());
                    if (!printJob.isCompleted()) break block3;
                    context = this.getApplicationContext();
                    string = "Print Completed";
                    break block4;
                }
                if (!printJob.isFailed()) break block2;
                context = this.getApplicationContext();
                string = "Print Failed";
            }
            Toast.makeText((Context)context, (CharSequence)string, (int)1).show();
            return;
        }
    }

    public String d0() {
        return Settings.Secure.getString((ContentResolver)this.F.getContentResolver(), (String)"android_id");
    }

    /*
     * Exception decompiling
     */
    public boolean e(MenuItem var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl34 : FAKE_TRY : trying to set 1 previously set to 0
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

    public void g0() {
        block4 : {
            View view;
            int n2;
            block6 : {
                int n3;
                block5 : {
                    if (!this.getResources().getBoolean(2130968598)) break block4;
                    n3 = Build.VERSION.SDK_INT;
                    if (n3 < 16) {
                        this.getWindow().setFlags(1024, 1024);
                        return;
                    }
                    view = this.getWindow().getDecorView();
                    if (n3 < 16 || n3 >= 19) break block5;
                    n2 = 1796;
                    break block6;
                }
                if (n3 < 19) break block4;
                n2 = 3332;
            }
            view.setSystemUiVisibility(n2);
        }
    }

    public void i0() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("market://details?id=");
        stringBuilder.append(this.F.getPackageName());
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String)stringBuilder.toString()));
        intent.addFlags(1207959552);
        try {
            this.startActivity(intent);
            return;
        }
        catch (ActivityNotFoundException activityNotFoundException) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("http://play.google.com/store/apps/details?id=");
            stringBuilder2.append(this.F.getPackageName());
            this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String)stringBuilder2.toString())));
            return;
        }
    }

    protected boolean j0() {
        return Build.VERSION.SDK_INT > 23;
    }

    public void k0() {
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
        builder.setMessage(2131558451);
        builder.setTitle(2131558432);
        builder.setPositiveButton((CharSequence)"OK", null);
        builder.setCancelable(true);
        if (!((Activity)this.F).isFinishing()) {
            builder.create().show();
        }
    }

    public void l0(String string, String string2, String string3) {
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
        builder.setMessage((CharSequence)string);
        builder.setTitle((CharSequence)string2);
        builder.setPositiveButton((CharSequence)string3, null);
        builder.setCancelable(true);
        if (!((Activity)this.F).isFinishing()) {
            builder.create().show();
        }
    }

    /*
     * Exception decompiling
     */
    protected void onActivityResult(int var1, int var2, Intent var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl103 : ALOAD_0 : trying to set 1 previously set to 0
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
     */
    public void onBackPressed() {
        if (!this.K.booleanValue() && this.z.canGoBack()) {
            this.z.goBack();
            this.K = Boolean.TRUE;
        } else {
            this.C();
        }
        new Handler().postDelayed(new Runnable(){

            public void run() {
                MainActivity.this.K = Boolean.FALSE;
            }
        }, 200L);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    /*
     * Exception decompiling
     */
    public void onCreate(Bundle var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl266 : ALOAD_0 : trying to set 1 previously set to 0
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

    public boolean onCreateOptionsMenu(Menu menu) {
        this.getMenuInflater().inflate(2131427328, menu);
        menu.findItem(2131230743).setVisible(this.getResources().getBoolean(2130968604));
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.H.f(menuItem)) {
            return true;
        }
        int n2 = menuItem.getItemId();
        Intent intent = new Intent("android.intent.action.SEND");
        if (n2 == 2131230742) {
            this.C();
            return true;
        }
        if (n2 == 2131230751) {
            this.k0();
            return true;
        }
        if (n2 == 2131230900) {
            this.i0();
            return true;
        }
        if (n2 == 2131230750) {
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", this.getString(2131558448));
            intent.putExtra("android.intent.extra.TEXT", this.getString(2131558449));
            this.startActivity(Intent.createChooser((Intent)intent, (CharSequence)"Share via"));
            return true;
        }
        if (n2 == 2131230743) {
            this.z.loadUrl(this.B);
        }
        return Activity.super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        CookieSyncManager.getInstance().stopSync();
        this.z.onPause();
        a.b.d.a.i.super.onPause();
    }

    public void onResume() {
        this.g0();
        CookieSyncManager.getInstance().startSync();
        this.z.onResume();
        a.b.d.a.i.super.onResume();
    }

    public class m {
        Context a;

        m(Context context) {
            this.a = context;
        }

        @JavascriptInterface
        public void askEnableGPS() {
            MainActivity.this.U();
        }

        @JavascriptInterface
        public void clickMenuButton() {
            MainActivity.this.openOptionsMenu();
        }

        @JavascriptInterface
        public void exitApp() {
            MainActivity.this.C();
        }

        @JavascriptInterface
        public String getAppPackageName() {
            try {
                String string = MainActivity.this.getPackageManager().getPackageInfo((String)MainActivity.this.getPackageName(), (int)0).packageName;
                return string;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                nameNotFoundException.printStackTrace();
                return "ERROR";
            }
        }

        @JavascriptInterface
        public int getAppVersionCode() {
            try {
                int n2 = MainActivity.this.getPackageManager().getPackageInfo((String)MainActivity.this.getPackageName(), (int)0).versionCode;
                return n2;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                nameNotFoundException.printStackTrace();
                return 0;
            }
        }

        @JavascriptInterface
        public String getAppVersionName() {
            try {
                String string = MainActivity.this.getPackageManager().getPackageInfo((String)MainActivity.this.getPackageName(), (int)0).versionName;
                return string;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                nameNotFoundException.printStackTrace();
                return "Error Fetching Version Info";
            }
        }

        @JavascriptInterface
        public int getDeviceApiLevel() {
            return Build.VERSION.SDK_INT;
        }

        @JavascriptInterface
        public String getUniqueDeviceID() {
            return MainActivity.this.d0();
        }

        @JavascriptInterface
        public void keepScreenOn(final boolean bl) {
            MainActivity.this.z.post(new Runnable(){

                public void run() {
                    MainActivity.this.z.setKeepScreenOn(bl);
                }
            });
        }

        @JavascriptInterface
        public void openExternal(String string) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse((String)string));
            MainActivity.this.startActivity(intent);
        }

        @JavascriptInterface
        public void printPage() {
            MainActivity.this.z.post(new Runnable(){

                public void run() {
                    MainActivity mainActivity = MainActivity.this;
                    mainActivity.Z(mainActivity.z);
                }
            });
        }

        @JavascriptInterface
        public void rateUs() {
            MainActivity.this.i0();
        }

        @JavascriptInterface
        public void refreshPage() {
            MainActivity.this.z.post(new Runnable(){

                public void run() {
                    MainActivity.this.z.reload();
                }
            });
        }

        @JavascriptInterface
        public void shareIntent() {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", this.a.getString(2131558448));
            intent.putExtra("android.intent.extra.TEXT", this.a.getString(2131558449));
            this.a.startActivity(Intent.createChooser((Intent)intent, (CharSequence)"Share App via"));
        }

        @JavascriptInterface
        public void showAboutDialog() {
            MainActivity.this.k0();
        }

        @JavascriptInterface
        public void showAboutDialog(String string, String string2, String string3) {
            MainActivity.this.l0(string, string2, string3);
        }

        @JavascriptInterface
        public void showToast(String string) {
            Toast.makeText((Context)this.a, (CharSequence)string, (int)0).show();
        }

    }

}

