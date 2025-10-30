package com.discord.intents

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.content.pm.PackageManager.NameNotFoundException
import android.content.pm.PackageManager.PackageInfoFlags
import android.net.Uri
import android.os.Build.VERSION
import com.discord.codegen.NativeIntentsModuleSpec
import com.discord.intents.packages.InstalledPackage
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReadableArray
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nIntentsModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntentsModule.kt\ncom/discord/intents/IntentsModule\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,87:1\n29#2:88\n29#2:89\n*S KotlinDebug\n*F\n+ 1 IntentsModule.kt\ncom/discord/intents/IntentsModule\n*L\n62#1:88\n66#1:89\n*E\n"])
internal class IntentsModule(reactContext: ReactApplicationContext) : NativeIntentsModuleSpec(var1) {
   private final val reactContext: ReactApplicationContext

   init {
      this.reactContext = var1;
   }

   private fun canResolveActivityForIntent(intent: Intent): Boolean {
      val var2: PackageManager = this.reactContext.getPackageManager();
      return var2 != null && var1.resolveActivity(var2) != null;
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
      if (!this.canResolveActivityForIntent(var1)) {
         return false;
      } else {
         val var2: Activity = this.reactContext.getCurrentActivity();
         if (var2 != null) {
            var2.startActivity(var1);
            return true;
         } else {
            return false;
         }
      }
   }

   public override fun canOpenUrlScheme(urlScheme: String): Boolean {
      var1 = InstalledPackage.Companion.parse(var1).getAppPackage();
      val var2: PackageManager = this.reactContext.getPackageManager();
      if (var1 != null) {
         try {
            if (VERSION.SDK_INT >= 33) {
               var2.getPackageInfo(var1, PackageInfoFlags.of(0L));
            } else {
               var2.getPackageInfo(var1, 0);
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
      return this.startActivityWithIntent(this.createEmailIntent(var1, var2));
   }

   public override fun sendSMS(body: String, recipients: ReadableArray): Boolean {
      return this.startActivityWithIntent(this.createSmsIntent(var1));
   }
}
