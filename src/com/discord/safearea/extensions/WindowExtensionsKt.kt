package com.discord.safearea.extensions

import android.os.Build.VERSION
import android.view.Window
import androidx.activity.o

internal fun Window.setSystemUITransparent() {
   if (VERSION.SDK_INT >= 29) {
      o.a(var0, false);
   }
}
