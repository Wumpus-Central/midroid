package com.discord.chrome_custom_tabs

import android.content.Context
import android.content.Intent
import android.content.pm.ResolveInfo
import android.content.pm.PackageManager.ResolveInfoFlags
import android.net.Uri
import android.os.Build.VERSION
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nCustomTabsPackages.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomTabsPackages.kt\ncom/discord/chrome_custom_tabs/CustomTabsPackages\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n295#2,2:75\n295#2,2:77\n295#2,2:79\n295#2,2:81\n1611#2,9:83\n1863#2:92\n1864#2:94\n1620#2:95\n1#3:93\n*S KotlinDebug\n*F\n+ 1 CustomTabsPackages.kt\ncom/discord/chrome_custom_tabs/CustomTabsPackages\n*L\n22#1:75,2\n23#1:77,2\n24#1:79,2\n25#1:81,2\n44#1:83,9\n44#1:92\n44#1:94\n44#1:95\n44#1:93\n*E\n"])
internal object CustomTabsPackages {
   private const val CHROME_PROD_PACKAGE: String = "com.android.chrome"
   private const val CHROME_BETA_PACKAGE: String = "com.chrome.beta"
   private const val CHROME_DEV_PACKAGE: String = "com.chrome.dev"
   private const val CHROME_LOCAL_PACKAGE: String = "com.google.android.apps.chrome"

   private fun Context.getCustomTabsPackages(): List<String> {
      var var2: Intent = this.getDefaultViewIntentHandler();
      val var5: java.util.List;
      if (VERSION.SDK_INT >= 33) {
         var5 = var1.getPackageManager().queryIntentActivities(var2, ResolveInfoFlags.of((long)0));
      } else {
         var5 = var1.getPackageManager().queryIntentActivities(var2, 0);
      }

      val var6: java.lang.Iterable = var5;
      val var3: ArrayList = new ArrayList();

      for (ResolveInfo var7 : var6) {
         var2 = new Intent().setAction("android.support.customtabs.action.CustomTabsService").setPackage(var7.activityInfo.packageName);
         val var9: ResolveInfo;
         if (VERSION.SDK_INT >= 33) {
            var9 = var1.getPackageManager().resolveService(var2, ResolveInfoFlags.of((long)0));
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
      return var1;
   }

   public fun Context.getCustomTabsDefaultPackage(): String? {
      val var5: java.util.List = this.getCustomTabsPackages(var1);
      val var6: java.lang.Iterable = var5;
      var var4: java.util.Iterator = var5.iterator();

      val var3: Any;
      do {
         val var2: Boolean = var4.hasNext();
         var3 = null;
         if (!var2) {
            var7 = null;
            break;
         }

         var7 = var4.next();
      } while (!(var7 as java.lang.String == "com.android.chrome"));

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
         } while (!(var9 as java.lang.String == "com.chrome.beta"));

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
            } while (!(var10 as java.lang.String == "com.chrome.dev"));

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
               } while (!(var11 as java.lang.String == "com.google.android.apps.chrome"));

               val var12: java.lang.String = var11 as java.lang.String;
               if (var11 as java.lang.String == null) {
                  return CollectionsKt.firstOrNull(var5) as java.lang.String;
               }

               return var12;
            }
         }
      }

      return var8;
   }
}
