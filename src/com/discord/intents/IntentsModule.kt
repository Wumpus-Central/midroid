package com.discord.intents

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.content.pm.PackageManager.NameNotFoundException
import android.net.Uri
import android.os.Build.VERSION
import com.discord.codegen.NativeIntentsModuleSpec
import com.discord.intents.packages.InstalledPackage
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReadableArray
import kotlin.jvm.internal.r

internal class IntentsModule(reactContext: ReactApplicationContext) : NativeIntentsModuleSpec {
   private final val reactContext: ReactApplicationContext

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
   }

   private fun canResolveActivityForIntent(intent: Intent): Boolean {
      val var4: PackageManager = this.reactContext.getPackageManager();
      var var2: Boolean = false;
      if (var4 != null) {
         var2 = false;
         if (var1.resolveActivity(var4) != null) {
            var2 = true;
         }
      }

      return var2;
   }

   private fun createEmailIntent(subject: String? = null, body: String? = null): Intent {
      val var4: Intent = new Intent("android.intent.action.SENDTO");
      var4.setData(Uri.parse("mailto:"));
      var var3: java.lang.String = var1;
      if (var1 == null) {
         var3 = "";
      }

      var4.putExtra("android.intent.extra.SUBJECT", var3);
      var1 = var2;
      if (var2 == null) {
         var1 = "";
      }

      var4.putExtra("android.intent.extra.TEXT", var1);
      return var4;
   }

   private fun createSmsIntent(body: String? = null): Intent {
      val var3: Intent = new Intent("android.intent.action.VIEW");
      var var2: java.lang.String = var1;
      if (var1 == null) {
         var2 = "";
      }

      val var4: StringBuilder = new StringBuilder();
      var4.append("sms:?body=");
      var4.append(var2);
      var3.setData(Uri.parse(var4.toString()));
      return var3;
   }

   private fun startActivityWithIntent(intent: Intent): Boolean {
      val var3: Boolean = this.canResolveActivityForIntent(var1);
      var var2: Boolean = false;
      if (!var3) {
         return false;
      } else {
         val var4: Activity = this.reactContext.getCurrentActivity();
         if (var4 != null) {
            var4.startActivity(var1);
            var2 = true;
         }

         return var2;
      }
   }

   public override fun canOpenUrlScheme(urlScheme: String): Boolean {
      r.h(var1, "urlScheme");
      val var2: java.lang.String = InstalledPackage.Companion.parse(var1).getAppPackage();
      val var4: PackageManager = this.reactContext.getPackageManager();
      if (var2 != null) {
         try {
            if (VERSION.SDK_INT >= 33) {
               b.a(var4, var2, a.a(0L));
            } else {
               var4.getPackageInfo(var2, 0);
            }

            return true;
         } catch (var3: NameNotFoundException) {
         }
      }

      return false;
   }

   public override fun canSendMail(): Boolean {
      return this.canResolveActivityForIntent(createEmailIntent$default(this, null, null, 3, null));
   }

   public override fun canSendSMS(): Boolean {
      return this.canResolveActivityForIntent(createSmsIntent$default(this, null, 1, null));
   }

   public override fun sendMail(subject: String, body: String, recipients: ReadableArray): Boolean {
      r.h(var1, "subject");
      r.h(var2, "body");
      r.h(var3, "recipients");
      return this.startActivityWithIntent(this.createEmailIntent(var1, var2));
   }

   public override fun sendSMS(body: String, recipients: ReadableArray): Boolean {
      r.h(var1, "body");
      r.h(var2, "recipients");
      return this.startActivityWithIntent(this.createSmsIntent(var1));
   }
}
