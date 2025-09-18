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
import java.util.concurrent.Executors
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.TimeUnit

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

         val var7: Builder = Uri.parse(var4).buildUpon();
         val var11: Uri = var7.build();
         var7.clearQuery();

         for (java.lang.String var6 : var11.getQueryParameterNames()) {
            if (!(var6 == "fromAppsFlyer")) {
               val var10: java.util.Iterator = var11.getQueryParameters(var6).iterator();

               while (var10.hasNext()) {
                  var7.appendQueryParameter(var6, var10.next() as java.lang.String);
               }
            }
         }

         var7.appendQueryParameter("fromAppsFlyer", var9);
         return var7.toString();
      }
   }

   public fun getInitialUrl(): Pair<String, Boolean>? {
      return initialUrl;
   }

   public fun init(context: Context) {
      val var2: AppsFlyerLib = AppsFlyerLib.getInstance();
      if (var2 == null) {
         CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "Initial attempt: Unable to get AppsFlyer instance", null, null, 6, null);
         val var3: ScheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
         var3.schedule(new a(var3), 2L, TimeUnit.SECONDS);
      } else {
         var2.subscribeForDeepLink(new DeepLinkListener(var1) {
            final Context $context;

            {
               this.$context = var1;
            }

            @Override
            public void onDeepLinking(DeepLinkResult var1) {
               if (var1.getStatus() === DeepLinkResult.Status.FOUND) {
                  val var4: DeepLink = var1.getDeepLink();
                  if (var4 != null) {
                     val var2: java.lang.String = DeepLinks.access$getDeepLinkDestinationWithAppsFlyerParam(DeepLinks.INSTANCE, var4);
                     if (var2 != null) {
                        if (DeepLinks.access$getInitialUrl$p() == null) {
                           DeepLinks.access$setInitialUrl$p(new Pair(var2, var4.isDeferred() == java.lang.Boolean.TRUE));
                        }

                        try {
                           val var5: Intent = new Intent("android.intent.action.VIEW", Uri.parse(var2));
                           val var6: Context = this.$context;
                           var5.addFlags(268435456);
                           var5.setPackage(var6.getPackageName());
                           this.$context.startActivity(var5);
                        } catch (var3: Exception) {
                           CrashReporting.captureException$default(CrashReporting.INSTANCE, var3, false, 2, null);
                        }
                     }
                  }
               }
            }
         });
         var2.init("GtHaVQcNmvxMT8zPNShJWJ", null, var1);
         var2.start(var1);
      }
   }
}
