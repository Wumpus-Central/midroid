package com.discord.deep_link

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.net.Uri.Builder
import com.appsflyer.AppsFlyerLib
import com.appsflyer.deeplink.DeepLink
import com.appsflyer.deeplink.DeepLinkListener
import com.appsflyer.deeplink.DeepLinkResult
import com.discord.crash_reporting.CrashReporting

public object DeepLinks {
   private final var initialUrl: Pair<String, Boolean>?

   private fun getDeepLinkDestinationWithAppsFlyerParam(deepLinkObj: DeepLink): String? {
      val var4: java.lang.String = var1.getDeepLinkValue();
      if (var4 == null) {
         return null;
      } else {
         val var2: Boolean = var1.isDeferred() == java.lang.Boolean.TRUE;
         val var3: java.lang.String = var1.getStringValue("host");
         var var8: java.lang.String = var3;
         if (var3 == null) {
            var8 = "";
         }

         val var9: java.lang.String;
         if (!var2 && !(var8 == "discordapp.onelink.me")) {
            var9 = "false";
         } else {
            var9 = "true";
         }

         val var6: Builder = Uri.parse(var4).buildUpon();
         val var11: Uri = var6.build();
         var6.clearQuery();

         for (java.lang.String var10 : var11.getQueryParameterNames()) {
            if (!(var10 == "fromAppsFlyer")) {
               val var7: java.util.Iterator = var11.getQueryParameters(var10).iterator();

               while (var7.hasNext()) {
                  var6.appendQueryParameter(var10, var7.next() as java.lang.String);
               }
            }
         }

         var6.appendQueryParameter("fromAppsFlyer", var9);
         return var6.toString();
      }
   }

   public fun getInitialUrl(): Pair<String, Boolean>? {
      return initialUrl;
   }

   public fun init(context: Context) {
      AppsFlyerLib.getInstance().subscribeForDeepLink(new DeepLinkListener(var1) {
         final Context $context;

         {
            this.$context = var1;
         }

         @Override
         public void onDeepLinking(DeepLinkResult var1) {
            if (var1.getStatus() === DeepLinkResult.Status.FOUND) {
               val var2: DeepLink = var1.getDeepLink();
               if (var2 != null) {
                  val var4: java.lang.String = DeepLinks.access$getDeepLinkDestinationWithAppsFlyerParam(DeepLinks.INSTANCE, var2);
                  if (var4 != null) {
                     if (DeepLinks.access$getInitialUrl$p() == null) {
                        DeepLinks.access$setInitialUrl$p(new Pair(var4, var2.isDeferred() == java.lang.Boolean.TRUE));
                     }

                     try {
                        val var6: Intent = new Intent("android.intent.action.VIEW", Uri.parse(var4));
                        val var5: Context = this.$context;
                        var6.addFlags(268435456);
                        var6.setPackage(var5.getPackageName());
                        this.$context.startActivity(var6);
                     } catch (var3: Exception) {
                        CrashReporting.captureException$default(CrashReporting.INSTANCE, var3, false, 2, null);
                     }
                  }
               }
            }
         }
      });
      AppsFlyerLib.getInstance().init("GtHaVQcNmvxMT8zPNShJWJ", null, var1);
      AppsFlyerLib.getInstance().start(var1);
   }
}
