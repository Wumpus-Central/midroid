package com.discord.deep_link

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.net.Uri.Builder
import com.appsflyer.AppsFlyerLib
import com.appsflyer.deeplink.DeepLink
import com.appsflyer.deeplink.DeepLinkListener
import com.appsflyer.deeplink.DeepLinkResult
import com.appsflyer.deeplink.DeepLinkResult.Status
import com.discord.crash_reporting.CrashReporting
import java.util.concurrent.Executors
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.TimeUnit
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nDeepLinks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeepLinks.kt\ncom/discord/deep_link/DeepLinks\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,130:1\n29#2:131\n*S KotlinDebug\n*F\n+ 1 DeepLinks.kt\ncom/discord/deep_link/DeepLinks\n*L\n28#1:131\n*E\n"])
public object DeepLinks {
   private final var initialUrl: Pair<String, Boolean>?

   private fun getDeepLinkDestinationWithAppsFlyerParam(deepLinkDestination: String, fromAppsFlyer: Boolean): String {
      val var3: Builder = Uri.parse(var1).buildUpon();
      val var7: Uri = var3.build();
      var3.clearQuery();

      for (java.lang.String var4 : var7.getQueryParameterNames()) {
         if (!(var4 == "fromAppsFlyer")) {
            val var6: java.util.Iterator = var7.getQueryParameters(var4).iterator();

            while (var6.hasNext()) {
               var3.appendQueryParameter(var4, var6.next() as java.lang.String);
            }
         }
      }

      if (var2) {
         var1 = "true";
      } else {
         var1 = "false";
      }

      var3.appendQueryParameter("fromAppsFlyer", var1);
      var1 = var3.toString();
      return var1;
   }

   public fun getInitialUrl(): Pair<String, Boolean>? {
      return initialUrl;
   }

   public fun init(context: Context) {
      val var2: AppsFlyerLib = AppsFlyerLib.getInstance();
      if (var2 == null) {
         CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, "Initial attempt: Unable to get AppsFlyer instance", null, null, null, 14, null);
         val var3: ScheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
         var3.schedule(new a(var3), 2L, TimeUnit.SECONDS);
      } else {
         var2.subscribeForDeepLink(new DeepLinkListener(var1) {
            final Context $context;

            {
               this.$context = var1;
            }

            public void onDeepLinking(DeepLinkResult var1) {
               if (var1.getStatus() === Status.FOUND) {
                  val var5: DeepLink = var1.getDeepLink();
                  if (var5 != null) {
                     var var7: java.lang.String = var5.getDeepLinkValue();
                     var var2: Boolean;
                     val var3: Boolean;
                     if (var7 != null) {
                        var3 = var5.isDeferred() == java.lang.Boolean.TRUE;
                        var2 = true;
                     } else {
                        var7 = var5.getStringValue("link");
                        if (var7 == null) {
                           var7 = null;
                        }

                        if (var7 == null) {
                           var7 = null;
                        }

                        var3 = false;
                        var2 = false;
                     }

                     if (var7 != null) {
                        val var10: java.lang.String = DeepLinks.access$getDeepLinkDestinationWithAppsFlyerParam(DeepLinks.INSTANCE, var7, var2);
                        if (DeepLinks.access$getInitialUrl$p() == null) {
                           if (var3) {
                              var2 = true;
                           } else {
                              var2 = false;
                           }

                           DeepLinks.access$setInitialUrl$p(new Pair(var10, var2));
                        }

                        try {
                           val var8: Intent = new Intent("android.intent.action.VIEW", Uri.parse(var10));
                           val var11: Context = this.$context;
                           var8.addFlags(268435456);
                           var8.setPackage(var11.getPackageName());
                           this.$context.startActivity(var8);
                           return;
                        } catch (var6: Exception) {
                           CrashReporting.captureException$default(CrashReporting.INSTANCE, var6, false, 2, null);
                           return;
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
