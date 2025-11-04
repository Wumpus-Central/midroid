package com.discord.browser_manager

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.pm.ResolveInfo
import android.net.Uri
import com.discord.chrome_custom_tabs.CustomTabs
import com.discord.theme.R.color
import com.discord.theme.utils.ColorUtilsKt
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nBrowserManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BrowserManager.kt\ncom/discord/browser_manager/BrowserManager\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,86:1\n29#2:87\n29#2:88\n*S KotlinDebug\n*F\n+ 1 BrowserManager.kt\ncom/discord/browser_manager/BrowserManager\n*L\n22#1:87\n41#1:88\n*E\n"])
internal object BrowserManager {
   private fun openUrlExternally(context: Context, uri: Uri, onFailure: (Exception) -> Unit, forceExternal: Boolean = true) {
      try {
         var10 = new Intent("android.intent.action.VIEW", var2).addFlags(268435456);
      } catch (var9: ActivityNotFoundException) {
         var3.invoke(var9);
         return;
      }

      if (var4) {
         try {
            val var11: java.util.List = var1.getPackageManager().queryIntentActivities(var10, 0);
            var10.setPackage(
               k.K(k.F(k.S(CollectionsKt.b0(var11), new com.discord.browser_manager.a()), new com.discord.browser_manager.b(var1))) as java.lang.String
            );
         } catch (var8: ActivityNotFoundException) {
            var3.invoke(var8);
            return;
         }
      }

      try {
         var1.startActivity(var10);
      } catch (var7: ActivityNotFoundException) {
         var3.invoke(var7);
      }
   }

   @JvmStatic
   fun `openUrlExternally$lambda$1`(var0: ResolveInfo): java.lang.String {
      return var0.activityInfo.packageName;
   }

   @JvmStatic
   fun `openUrlExternally$lambda$2`(var0: Context, var1: java.lang.String): Boolean {
      return var1 == var0.getPackageName() xor true;
   }

   private fun openUrlWithCustomTabs(context: Context, uri: Uri, onFailure: (Exception) -> Unit) {
      CustomTabs.openUrlWithCustomTabs$default(
         CustomTabs.INSTANCE, var1, var2, false, ColorUtilsKt.getThemeColor(var1, color.white, color.primary_600), null, null, null, null, var3, 244, null
      );
   }

   @JvmStatic
   fun `tryOpenUrlWithCustomTabs$lambda$0`(var0: Context, var1: java.lang.String, var2: Function1, var3: Exception): Unit {
      INSTANCE.tryOpenUrlExternally(var0, var1, var2);
      return Unit.a;
   }

   public fun tryOpenUrlExternally(context: Context, url: String, onFailure: (Exception) -> Unit) {
      label20: {
         try {
            var7 = Uri.parse(var2);
         } catch (var5: Exception) {
            var6 = var5;
            break label20;
         }

         try {
            openUrlExternally$default(this, var1, var7, var3, false, 8, null);
            return;
         } catch (var4: Exception) {
            var6 = var4;
         }
      }

      var3.invoke(var6);
   }

   public fun tryOpenUrlWithCustomTabs(context: Context, url: String, onFailure: (Exception) -> Unit) {
      try {
         this.openUrlWithCustomTabs(var1, Uri.parse(var2), new c(var1, var2, var3));
      } catch (var6: Exception) {
         this.tryOpenUrlExternally(var1, var2, var3);
      }
   }
}
