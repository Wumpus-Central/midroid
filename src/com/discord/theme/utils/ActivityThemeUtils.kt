package com.discord.theme.utils

import android.app.Activity
import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.view.Window
import com.discord.theme.R
import com.discord.theme.ThemeManager
import kotlin.jvm.internal.q

internal object ActivityThemeUtils {
   internal fun Activity.updateActivityTheming() {
      q.h(var1, "<this>");
      UpdateSystemUiKt.updateSystemUi(var1);
      this.updateWindowBackground$theme_release(var1);
   }

   internal fun Activity.updateWindowBackground() {
      q.h(var1, "<this>");
      val var3: ThemeManager = ThemeManager.INSTANCE;
      if (ThemeManager.INSTANCE.isInitialized()) {
         if (!var3.shouldShowSplashImage$theme_release()) {
            val var4: Window = var1.getWindow();
            val var5: Context = var1.getApplicationContext();
            q.g(var5, "getApplicationContext(...)");
            val var2: Int;
            if (var3.isThemeDark()) {
               var2 = R.color.primary_660;
            } else {
               var2 = R.color.primary_160;
            }

            var4.setBackgroundDrawable(new ColorDrawable(ColorUtilsKt.getColorCompat(var5, var2)));
         } else {
            val var6: Window = var1.getWindow();
            val var7: Int;
            if (var3.isThemeDark()) {
               var7 = R.drawable.background_splash_dark;
            } else {
               var7 = R.drawable.background_splash_light;
            }

            var6.setBackgroundDrawableResource(var7);
         }
      }
   }
}
