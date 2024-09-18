package com.discord.device.utils

import android.content.Context
import kotlin.jvm.internal.q

private const val MINIMUM_TABLET_SCREEN_WIDTH: Int = 600
private final var isTabletCache: Boolean?

public fun Context.isTablet(): Boolean {
   q.h(var0, "<this>");
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

public fun Context.isTabletCacheStale(): Boolean {
   q.h(var0, "<this>");
   val var1: Boolean;
   if (isTabletCache != null && !q.c(isTabletCache, isTablet(var0))) {
      var1 = true;
   } else {
      var1 = false;
   }

   return var1;
}

internal fun Context.smallestScreenWidthDp(): Int {
   q.h(var0, "<this>");
   return var0.getResources().getConfiguration().smallestScreenWidthDp;
}
