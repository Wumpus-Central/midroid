package com.discord.image.fresco.postprocessors.processors

import A3.a
import android.graphics.Bitmap

internal class SafeRoundAsCirclePostprocessor : a {
   public open fun process(bitmap: Bitmap) {
      if (var1.getWidth() >= 2 && var1.getHeight() >= 2) {
         super.process(var1);
      }
   }

   public companion object {
      private const val MIN_SIZE: Int
   }
}
