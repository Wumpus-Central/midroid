package com.discord.portals.utils

import android.transition.TransitionManager
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.view.ViewPropertyAnimator
import kotlin.jvm.internal.r

public fun View.removeFromParent() {
   r.h(var0, "<this>");
   val var2: ViewParent = var0.getParent();
   if (var2 != null) {
      var var1: ViewParent = var2;
      if (var2 !is ViewGroup) {
         var1 = null;
      }

      val var3: ViewGroup = var1 as ViewGroup;
      if (var1 as ViewGroup != null) {
         val var4: ViewPropertyAnimator = var0.animate();
         if (var4 != null) {
            var4.cancel();
         }

         var0.clearAnimation();
         var3.endViewTransition(var0);
         TransitionManager.endTransitions(var3);
         var3.setLayoutTransition(null);
         var3.removeView(var0);
      }
   }
}
