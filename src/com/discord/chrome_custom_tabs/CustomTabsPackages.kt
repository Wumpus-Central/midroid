package com.discord.chrome_custom_tabs

import android.content.Context
import android.content.Intent
import android.content.pm.ResolveInfo
import android.net.Uri
import android.os.Build.VERSION
import java.util.ArrayList
import k3.d1
import kotlin.jvm.internal.q
import s4.a
import s4.b

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
      val var6: java.lang.Iterable = var5;
      val var3: ArrayList = new ArrayList();

      for (ResolveInfo var7 : var6) {
         var2 = new Intent().setAction("android.support.customtabs.action.CustomTabsService").setPackage(var7.activityInfo.packageName);
         q.g(var2, "setPackage(...)");
         val var9: ResolveInfo;
         if (VERSION.SDK_INT >= 33) {
            var9 = b.a(var1.getPackageManager(), var2, d1.a((long)0));
         } else {
            var9 = var1.getPackageManager().resolveService(var2, 0);
         }

         label28:
         if (var9 != null && var9.activityInfo != null) {
            var11 = var9.activityInfo.packageName;
            break label28;
         } else {
            var11 = null;
         }

         if (var11 != null) {
            var3.add(var11);
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
      val var6: java.lang.Iterable = var5;
      var var4: java.util.Iterator = var5.iterator();

      var var3: Any;
      do {
         val var2: Boolean = var4.hasNext();
         var3 = null;
         if (!var2) {
            var7 = null;
            break;
         }

         var7 = var4.next();
      } while (!q.c((java.lang.String)var7, "com.android.chrome"));

      val var13: java.lang.String = var7 as java.lang.String;
      var var8: java.lang.String = var7 as java.lang.String;
      if (var13 == null) {
         var4 = var6.iterator();

         do {
            if (!var4.hasNext()) {
               var9 = null;
               break;
            }

            var9 = var4.next();
         } while (!q.c((java.lang.String)var9, "com.chrome.beta"));

         val var15: java.lang.String = var9 as java.lang.String;
         var8 = var9 as java.lang.String;
         if (var15 == null) {
            var4 = var6.iterator();

            do {
               if (!var4.hasNext()) {
                  var10 = null;
                  break;
               }

               var10 = var4.next();
            } while (!q.c((java.lang.String)var10, "com.chrome.dev"));

            val var17: java.lang.String = var10 as java.lang.String;
            var8 = var10 as java.lang.String;
            if (var17 == null) {
               var4 = var6.iterator();

               do {
                  var11 = var3;
                  if (!var4.hasNext()) {
                     break;
                  }

                  var11 = var4.next();
               } while (!q.c((java.lang.String)var11, "com.google.android.apps.chrome"));

               var3 = var11 as java.lang.String;
               var8 = var11 as java.lang.String;
               if (var3 == null) {
                  var8 = i.f0(var5) as java.lang.String;
               }
            }
         }
      }

      return var8;
   }
}
