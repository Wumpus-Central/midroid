package com.discord.theme.utils

import android.app.Activity
import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.view.Window
import com.discord.theme.R
import com.discord.theme.ThemeManager
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nActivityThemeUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityThemeUtils.kt\ncom/discord/theme/utils/ActivityThemeUtils\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,46:1\n27#2:47\n*S KotlinDebug\n*F\n+ 1 ActivityThemeUtils.kt\ncom/discord/theme/utils/ActivityThemeUtils\n*L\n33#1:47\n*E\n"])
internal object ActivityThemeUtils {
   internal fun Activity.updateActivityTheming() {
      UpdateSystemUiKt.updateSystemUi(var1);
      this.updateWindowBackground$theme_release(var1);
   }

   internal fun Activity.updateWindowBackground() {
      val var3: ThemeManager = ThemeManager.INSTANCE;
      if (ThemeManager.INSTANCE.isInitialized()) {
         if (!var3.shouldShowSplashImage$theme_release()) {
            val var4: Window = var1.getWindow();
            val var5: Context = var1.getApplicationContext();
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
