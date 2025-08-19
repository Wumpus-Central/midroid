package com.discord.device.utils

import android.content.Context

private const val MINIMUM_TABLET_SCREEN_WIDTH: Int = 600
private final var isTabletCache: Boolean?

public fun Context.isTablet(): Boolean {
   val var1: Boolean;
   if (smallestScreenWidthDp(var0) >= 600) {
      var1 = true;
   } else {
      var1 = false;
   }

   if (isTabletCache == null) {
      isTabletCache = var1;
   }

   return var1;
}

internal fun Context.smallestScreenWidthDp(): Int {
   return var0.getResources().getConfiguration().smallestScreenWidthDp;
}
