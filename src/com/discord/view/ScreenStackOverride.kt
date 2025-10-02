package com.discord.view

import Y8.d
import android.content.Context
import android.view.View
import com.swmansion.rnscreens.ScreenStack

public class ScreenStackOverride(context: Context?) : ScreenStack(var1) {
   public open fun endViewTransition(view: View) {
      if (var1 is d) {
         (var1 as d).getScreen().endRemovalTransition();
      }

      super.endViewTransition(var1);
   }
}
