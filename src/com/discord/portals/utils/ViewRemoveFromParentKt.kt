package com.discord.portals.utils

import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import kotlin.jvm.internal.q

public fun View.removeFromParent() {
   q.h(var0, "<this>");
   val var2: ViewParent = var0.getParent();
   if (var2 != null) {
      var var1: ViewParent = var2;
      if (var2 !is ViewGroup) {
         var1 = null;
      }

      val var3: ViewGroup = var1 as ViewGroup;
      if (var1 as ViewGroup != null) {
         var3.endViewTransition(var0);
         var3.removeView(var0);
      }
   }
}
