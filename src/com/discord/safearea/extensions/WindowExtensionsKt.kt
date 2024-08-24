package com.discord.safearea.extensions

import android.view.Window
import kotlin.jvm.internal.r

internal fun Window.setSystemUITransparent() {
   r.h(var0, "<this>");
   var0.setStatusBarColor(0);
   var0.setNavigationBarColor(0);
}
