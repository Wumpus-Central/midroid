package com.discord.safearea.extensions

import android.os.Build.VERSION
import android.view.Window
import kotlin.jvm.internal.q

internal fun Window.setSystemUITransparent() {
   q.h(var0, "<this>");
   if (VERSION.SDK_INT >= 29) {
      f2.a.a(var0, false);
   }
}
