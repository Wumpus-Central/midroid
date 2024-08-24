package com.discord.device.utils

import android.annotation.SuppressLint
import android.content.Context
import kotlin.jvm.internal.r

@SuppressLint(["DiscouragedApi"])
public fun Context.isGestureNavigationEnabled(): Boolean {
   r.h(var0, "<this>");
   var var1: Int = var0.getResources().getIdentifier("config_navBarInteractionMode", "integer", "android");
   var var2: Boolean = false;
   if (var1 > 0) {
      var1 = var0.getResources().getInteger(var1);
   } else {
      var1 = 0;
   }

   if (var1 == NavigationType.GESTURE.getValue()) {
      var2 = true;
   }

   return var2;
}
