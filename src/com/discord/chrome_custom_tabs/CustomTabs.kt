package com.discord.chrome_custom_tabs

import android.content.ActivityNotFoundException
import android.content.Context
import android.net.Uri
import androidx.browser.customtabs.a
import androidx.browser.customtabs.b
import kotlin.jvm.internal.r

public object CustomTabs {
   public fun openUrlWithCustomTabs(
      context: Context,
      uri: Uri,
      showTitle: Boolean = false,
      toolbarColor: Int,
      animShowEnterResId: Int? = null,
      animShowExitResId: Int? = null,
      animHideEnterResId: Int? = null,
      animHideExitResId: Int? = null,
      onFailure: (Exception) -> Unit
   ) {
      r.h(var1, "context");
      r.h(var2, "uri");
      r.h(var9, "onFailure");
      if (CustomTabsPackages.INSTANCE.getCustomTabsDefaultPackage(var1) != null) {
         val var10: a = new a.a().b(var4).d(var4).c(var4).a();
         r.g(var10, "build(...)");
         val var13: b.d = new b.d().c(var10).g(var3);
         if (var5 != null && var6 != null) {
            var13.h(var1, var5, var6);
         }

         if (var7 != null && var8 != null) {
            var13.d(var1, var7, var8);
         }

         val var12: b = var13.a();
         r.g(var12, "build(...)");

         try {
            var12.a.setData(var2);
            var12.a(var1, var2);
         } catch (var11: ActivityNotFoundException) {
            var9.invoke(var11);
         }
      } else {
         var9.invoke(new IllegalStateException("Unable to find custom tabs package."));
      }
   }
}
