@file:SourceDebugExtension(["SMAP\nReactNativeScreensUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactNativeScreensUtils.kt\ncom/discord/zoom_layout/utils/ReactNativeScreensUtilsKt\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,47:1\n48#2:48\n*S KotlinDebug\n*F\n+ 1 ReactNativeScreensUtils.kt\ncom/discord/zoom_layout/utils/ReactNativeScreensUtilsKt\n*L\n25#1:48\n*E\n"])

package com.discord.zoom_layout.utils

import android.view.ViewGroup
import android.view.ViewParent
import com.otaliastudios.zoom.ZoomLayout
import com.swmansion.rnscreens.Screen
import kotlin.jvm.internal.SourceDebugExtension

private fun ZoomLayout.isInReactNativeScreensScreenBeingRemoved(): Boolean {
   for (ViewParent var1 = var0.getParent(); var1 instanceof ViewGroup; var1 = ((ViewGroup)var1).getParent()) {
      if (var1 is Screen && (var1 as Screen).isBeingRemoved()) {
         return true;
      }
   }

   return false;
}

internal fun ZoomLayout.maybeApplyReactNativeScreensFix() {
   if (isInReactNativeScreensScreenBeingRemoved(var0)) {
      if (var0.getChildCount() == 0) {
         return;
      }

      var0.removeAllViews();
   }
}
