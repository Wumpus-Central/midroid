package com.discord.intents

import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.content.pm.PackageManager.NameNotFoundException
import android.content.pm.PackageManager.PackageInfoFlags
import android.net.Uri
import android.os.Build.VERSION
import com.discord.intents.packages.InstalledPackage
import com.facebook.react.bridge.Callback
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.ReadableMap
import kotlin.jvm.internal.r

public class IntentsSendModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val reactContext: ReactApplicationContext

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.reactContext = var1;
   }

   private fun canResolveActivityForIntent(intent: Intent): Boolean {
      val var4: ReactApplicationContext = this.getReactApplicationContext();
      var var2: Boolean = false;
      if (var4 != null) {
         val var5: PackageManager = var4.getPackageManager();
         var2 = false;
         if (var5 != null) {
            var2 = false;
            if (var1.resolveActivity(var5) != null) {
               var2 = true;
            }
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

   @ReactMethod
   public fun canSendMail(promise: Promise) {
      r.h(var1, "promise");
      var1.resolve(this.canResolveActivityForIntent(createEmailIntent$default(this, null, null, 3, null)));
   }

   @ReactMethod
   public fun canSendSMS(promise: Promise) {
      r.h(var1, "promise");
      var1.resolve(this.canResolveActivityForIntent(createSmsIntent$default(this, null, 1, null)));
   }

   public open fun getName(): String {
      return "DCDSend";
   }

   @ReactMethod
   public fun isPackageInstalled(appName: String, promise: Promise) {
      r.h(var1, "appName");
      r.h(var2, "promise");
      var1 = InstalledPackage.Companion.parse(var1).getAppPackage();
      val var3: PackageManager = this.reactContext.getPackageManager();
      if (var1 != null) {
         label33: {
            try {
               if (VERSION.SDK_INT >= 33) {
                  var3.getPackageInfo(var1, PackageInfoFlags.of(0L));
                  break label33;
               }
            } catch (var7: NameNotFoundException) {
               var2.resolve(java.lang.Boolean.FALSE);
               return;
            }

            try {
               var3.getPackageInfo(var1, 0);
            } catch (var6: NameNotFoundException) {
               var2.resolve(java.lang.Boolean.FALSE);
               return;
            }
         }

         try {
            var2.resolve(java.lang.Boolean.TRUE);
         } catch (var5: NameNotFoundException) {
            var2.resolve(java.lang.Boolean.FALSE);
         }
      } else {
         try {
            var2.resolve(java.lang.Boolean.FALSE);
         } catch (var4: NameNotFoundException) {
            var2.resolve(java.lang.Boolean.FALSE);
         }
      }
   }

   @ReactMethod
   public fun sendMail(options: ReadableMap, callback: Callback) {
      r.h(var1, "options");
      r.h(var2, "callback");
      val var5: java.lang.String = var1.getString("subject");
      var var3: java.lang.String = var5;
      if (var5 == null) {
         var3 = "";
      }

      var var6: java.lang.String = var1.getString("body");
      if (var6 == null) {
         var6 = "";
      }

      var2.invoke(new Object[]{this.startActivityWithIntent(this.createEmailIntent(var3, var6))});
   }

   @ReactMethod
   public fun sendSMS(options: ReadableMap, callback: Callback) {
      r.h(var1, "options");
      r.h(var2, "callback");
      var2.invoke(new Object[]{this.startActivityWithIntent(this.createSmsIntent(var1.getString("body")))});
   }
}
