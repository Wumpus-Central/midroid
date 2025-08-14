package com.discord.safearea.extensions

import android.os.Build.VERSION
import android.view.Window

internal fun Window.setSystemUITransparent() {
   if (VERSION.SDK_INT >= 29) {
      e2.a.a(var0, false);
   }
}
