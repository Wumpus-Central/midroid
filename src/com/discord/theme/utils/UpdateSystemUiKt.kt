package com.discord.theme.utils

import android.app.Activity
import android.os.Build.VERSION
import android.view.View
import android.view.WindowInsetsController
import androidx.core.view.P
import androidx.core.view.WindowInsetsControllerCompat
import androidx.core.view.p0
import com.discord.misc.utilities.activity.ActivityExtensionsKt
import com.discord.theme.ThemeManager
import kotlin.jvm.internal.q

private fun WindowInsetsControllerCompat.setLightTheme(isLightTheme: Boolean) {
   var0.c(var1);
   var0.b(var1);
}

internal fun Activity.updateSystemUi() {
   q.h(var0, "<this>");
   val var2: ThemeManager = ThemeManager.INSTANCE;
   if (ThemeManager.INSTANCE.isInitialized()) {
      val var1: Boolean = var2.isThemeLight();
      val var4: View = ActivityExtensionsKt.getRootView(var0);
      if (var4 != null) {
         val var3: WindowInsetsControllerCompat = p0.a(var0.getWindow(), var4);
         q.g(var3, "getInsetsController(...)");
         setLightTheme(var3, var1);
      }
   }
}

internal fun View.updateSystemUi() {
   q.h(var0, "<this>");
   val var2: ThemeManager = ThemeManager.INSTANCE;
   if (ThemeManager.INSTANCE.isInitialized()) {
      val var1: Boolean = var2.isThemeLight();
      if (VERSION.SDK_INT >= 30) {
         val var3: WindowInsetsController = P.a(var0);
         if (var3 != null) {
            val var4: WindowInsetsControllerCompat = WindowInsetsControllerCompat.f(var3);
            q.g(var4, "toWindowInsetsControllerCompat(...)");
            setLightTheme(var4, var1);
         }
      }
   }
}
