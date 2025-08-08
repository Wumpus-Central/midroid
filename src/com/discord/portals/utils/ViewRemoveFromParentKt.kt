package com.discord.portals.utils

import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.view.animation.Animation
import kotlin.jvm.internal.r

public fun View.removeFromParent() {
   r.h(var0, "<this>");
   val var2: ViewParent = var0.getParent();
   if (var2 != null) {
      var var1: ViewParent = var2;
      if (var2 !is ViewGroup) {
         var1 = null;
      }

      val var4: ViewGroup = var1 as ViewGroup;
      if (var1 as ViewGroup != null) {
         val var3: Animation = var0.getAnimation();
         if (var3 != null) {
            var3.cancel();
         }

         var0.clearAnimation();
         var4.removeView(var0);
         var4.endViewTransition(var0);
      }
   }
}
