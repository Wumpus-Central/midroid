@file:SourceDebugExtension(["SMAP\nViewRemoveFromParent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewRemoveFromParent.kt\ncom/discord/portals/utils/ViewRemoveFromParentKt\n+ 2 CastUtils.kt\ncom/discord/misc/utilities/kotlin/CastUtilsKt\n*L\n1#1,18:1\n8#2:19\n*S KotlinDebug\n*F\n+ 1 ViewRemoveFromParent.kt\ncom/discord/portals/utils/ViewRemoveFromParentKt\n*L\n8#1:19\n*E\n"])

package com.discord.portals.utils

import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.view.animation.Animation
import kotlin.jvm.internal.SourceDebugExtension

public fun View.removeFromParent() {
   val var2: ViewParent = var0.getParent();
   if (var2 != null) {
      var var1: ViewParent = var2;
      if (var2 !is ViewGroup) {
         var1 = null;
      }

      val var3: ViewGroup = var1 as ViewGroup;
      if (var1 as ViewGroup != null) {
         val var4: Animation = var0.getAnimation();
         if (var4 != null) {
            var4.cancel();
         }

         var0.clearAnimation();
         var3.removeView(var0);
         var3.endViewTransition(var0);
      }
   }
}
