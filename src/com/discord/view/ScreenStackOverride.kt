package com.discord.view

import android.content.Context
import android.view.View
import com.swmansion.rnscreens.ScreenStack

public class ScreenStackOverride(context: Context?) : ScreenStack(var1) {
   public open fun endViewTransition(view: View) {
      if (var1 is ro.d) {
         (var1 as ro.d).getScreen().endRemovalTransition();
      }

      super.endViewTransition(var1);
   }
}
