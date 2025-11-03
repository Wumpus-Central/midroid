package com.discord.theme.utils

import android.app.Activity
import android.os.Build.VERSION
import android.view.View
import android.view.WindowInsetsController
import androidx.core.view.WindowInsetsControllerCompat
import androidx.core.view.v0
import com.discord.misc.utilities.activity.ActivityExtensionsKt
import com.discord.theme.ThemeManager

private fun WindowInsetsControllerCompat.setLightTheme(isLightTheme: Boolean) {
   var0.e(var1);
   var0.d(var1);
}

internal fun Activity.updateSystemUi() {
   val var2: ThemeManager = ThemeManager.INSTANCE;
   if (ThemeManager.INSTANCE.isInitialized()) {
      val var1: Boolean = var2.isThemeLight();
      val var4: View = ActivityExtensionsKt.getRootView(var0);
      if (var4 != null) {
         val var3: WindowInsetsControllerCompat = v0.a(var0.getWindow(), var4);
         setLightTheme(var3, var1);
      }
   }
}

internal fun View.updateSystemUi() {
   val var2: ThemeManager = ThemeManager.INSTANCE;
   if (ThemeManager.INSTANCE.isInitialized()) {
      val var1: Boolean = var2.isThemeLight();
      if (VERSION.SDK_INT >= 30) {
         val var3: WindowInsetsController = var0.getWindowInsetsController();
         if (var3 != null) {
            val var4: WindowInsetsControllerCompat = WindowInsetsControllerCompat.h(var3);
            setLightTheme(var4, var1);
         }
      }
   }
}
