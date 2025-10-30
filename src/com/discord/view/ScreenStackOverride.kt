package com.discord.view

import android.content.Context
import android.view.View
import cl.d
import com.swmansion.rnscreens.ScreenStack

public class ScreenStackOverride(context: Context?) : ScreenStack(var1) {
   public open fun endViewTransition(view: View) {
      if (var1 is d) {
         (var1 as d).getScreen().endRemovalTransition();
      }

      super.endViewTransition(var1);
   }
}
