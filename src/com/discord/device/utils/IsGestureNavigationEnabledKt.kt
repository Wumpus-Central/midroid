package com.discord.device.utils

import android.annotation.SuppressLint
import android.content.Context

@SuppressLint(["DiscouragedApi"])
public fun Context.isGestureNavigationEnabled(): Boolean {
   var var1: Int = var0.getResources().getIdentifier("config_navBarInteractionMode", "integer", "android");
   if (var1 > 0) {
      var1 = var0.getResources().getInteger(var1);
   } else {
      var1 = 0;
   }

   return var1 == NavigationType.GESTURE.getValue();
}
