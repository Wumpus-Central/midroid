package com.discord.zoom_layout.utils

import android.view.ViewGroup
import android.view.ViewParent
import com.otaliastudios.zoom.ZoomLayout
import com.swmansion.rnscreens.l
import kotlin.jvm.internal.r

private fun ZoomLayout.isInReactNativeScreensScreenBeingRemoved(): Boolean {
   for (ViewParent var1 = var0.getParent(); var1 instanceof ViewGroup; var1 = ((ViewGroup)var1).getParent()) {
      if (var1 is l && (var1 as l).c()) {
         return true;
      }
   }

   return false;
}

internal fun ZoomLayout.maybeApplyReactNativeScreensFix() {
   r.h(var0, "<this>");
   if (isInReactNativeScreensScreenBeingRemoved(var0) && var0.getChildCount() != 0) {
      var0.removeAllViews();
   }
}
