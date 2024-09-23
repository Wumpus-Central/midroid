package com.discord.suspense_visible_view

import com.facebook.react.uimanager.LayoutShadowNode
import com.facebook.yoga.YogaDisplay

internal class SuspenseVisibleViewShadowNode : LayoutShadowNode {
   public open fun setDisplay(display: YogaDisplay?) {
      if (var1 != YogaDisplay.l) {
         super.setDisplay(var1);
      }
   }
}
