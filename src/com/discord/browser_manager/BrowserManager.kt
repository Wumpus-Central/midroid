package com.discord.browser_manager

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.pm.ResolveInfo
import android.net.Uri
import com.discord.chrome_custom_tabs.CustomTabs
import com.discord.theme.R
import com.discord.theme.utils.ColorUtilsKt
import kotlin.jvm.functions.Function1

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
            var10.setPackage(k.u(k.r(k.C(CollectionsKt.V(var11), new a()), new b(var1))) as java.lang.String);
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
         CustomTabs.INSTANCE, var1, var2, false, ColorUtilsKt.getThemeColor(var1, R.color.white, R.color.primary_600), null, null, null, null, var3, 244, null
      );
   }

   @JvmStatic
   fun `tryOpenUrlWithCustomTabs$lambda$0`(var0: Context, var1: java.lang.String, var2: Function1, var3: Exception): Unit {
      INSTANCE.tryOpenUrlExternally(var0, var1, var2);
      return Unit.a;
   }

   public fun tryOpenUrlExternally(context: Context, url: String, onFailure: (Exception) -> Unit) {
      try {
         val var5: Uri = Uri.parse(var2);
         openUrlExternally$default(this, var1, var5, var3, false, 8, null);
      } catch (var4: Exception) {
         var3.invoke(var4);
      }
   }

   public fun tryOpenUrlWithCustomTabs(context: Context, url: String, onFailure: (Exception) -> Unit) {
      try {
         val var5: Uri = Uri.parse(var2);
         this.openUrlWithCustomTabs(var1, var5, new c(var1, var2, var3));
      } catch (var6: Exception) {
         this.tryOpenUrlExternally(var1, var2, var3);
      }
   }
}
