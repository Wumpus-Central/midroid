package com.discord.device.utils

import android.content.Context
import kotlin.jvm.internal.r

private const val MINIMUM_TABLET_SCREEN_WIDTH: Int = 600

internal fun Context.isTablet(): Boolean {
   r.h(var0, "<this>");
   val var1: Boolean;
   if (smallestScreenWidthDp(var0) >= 600) {
      var1 = true;
   } else {
      var1 = false;
   }

   return var1;
}

internal fun Context.smallestScreenWidthDp(): Int {
   r.h(var0, "<this>");
   return var0.getResources().getConfiguration().smallestScreenWidthDp;
}
