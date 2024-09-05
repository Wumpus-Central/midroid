package com.discord.chrome_custom_tabs

import android.content.Context
import android.content.Intent
import android.content.pm.ResolveInfo
import android.net.Uri
import android.os.Build.VERSION
import c5.a
import c5.b
import java.util.ArrayList
import kotlin.jvm.internal.q
import u3.d1

internal object CustomTabsPackages {
   private const val CHROME_BETA_PACKAGE: String = "com.chrome.beta"
   private const val CHROME_DEV_PACKAGE: String = "com.chrome.dev"
   private const val CHROME_LOCAL_PACKAGE: String = "com.google.android.apps.chrome"
   private const val CHROME_PROD_PACKAGE: String = "com.android.chrome"

   private fun Context.getCustomTabsPackages(): List<String> {
      var var2: Intent = this.getDefaultViewIntentHandler();
      val var5: java.util.List;
      if (VERSION.SDK_INT >= 33) {
         var5 = a.a(var1.getPackageManager(), var2, d1.a((long)0));
      } else {
         var5 = var1.getPackageManager().queryIntentActivities(var2, 0);
      }

      q.e(var5);
      val var3: ArrayList = new ArrayList();

      for (ResolveInfo var6 : var5) {
         var2 = new Intent().setAction("android.support.customtabs.action.CustomTabsService").setPackage(var6.activityInfo.packageName);
         q.g(var2, "setPackage(...)");
         val var8: ResolveInfo;
         if (VERSION.SDK_INT >= 33) {
            var8 = b.a(var1.getPackageManager(), var2, d1.a((long)0));
         } else {
            var8 = var1.getPackageManager().resolveService(var2, 0);
         }

         label28:
         if (var8 != null && var8.activityInfo != null) {
            var10 = var8.activityInfo.packageName;
            break label28;
         } else {
            var10 = null;
         }

         if (var10 != null) {
            var3.add(var10);
         }
      }

      return var3;
   }

   private fun getDefaultViewIntentHandler(): Intent {
      val var1: Intent = new Intent()
         .setAction("android.intent.action.VIEW")
         .addCategory("android.intent.category.BROWSABLE")
         .setData(Uri.fromParts("http", "", null));
      q.g(var1, "setData(...)");
      return var1;
   }

   public fun Context.getCustomTabsDefaultPackage(): String? {
      q.h(var1, "<this>");
      val var5: java.util.List = this.getCustomTabsPackages(var1);
      var var4: java.util.Iterator = var5.iterator();

      var var3: Any;
      do {
         val var2: Boolean = var4.hasNext();
         var3 = null;
         if (!var2) {
            var6 = null;
            break;
         }

         var6 = var4.next();
      } while (!q.c((java.lang.String)var6, "com.android.chrome"));

      val var12: java.lang.String = var6 as java.lang.String;
      var var7: java.lang.String = var6 as java.lang.String;
      if (var12 == null) {
         var4 = var5.iterator();

         do {
            if (!var4.hasNext()) {
               var8 = null;
               break;
            }

            var8 = var4.next();
         } while (!q.c((java.lang.String)var8, "com.chrome.beta"));

         val var14: java.lang.String = var8 as java.lang.String;
         var7 = var8 as java.lang.String;
         if (var14 == null) {
            var4 = var5.iterator();

            do {
               if (!var4.hasNext()) {
                  var9 = null;
                  break;
               }

               var9 = var4.next();
            } while (!q.c((java.lang.String)var9, "com.chrome.dev"));

            val var16: java.lang.String = var9 as java.lang.String;
            var7 = var9 as java.lang.String;
            if (var16 == null) {
               var4 = var5.iterator();

               do {
                  var10 = var3;
                  if (!var4.hasNext()) {
                     break;
                  }

                  var10 = var4.next();
               } while (!q.c((java.lang.String)var10, "com.google.android.apps.chrome"));

               var3 = var10 as java.lang.String;
               var7 = var10 as java.lang.String;
               if (var3 == null) {
                  var7 = i.f0(var5) as java.lang.String;
               }
            }
         }
      }

      return var7;
   }
}
