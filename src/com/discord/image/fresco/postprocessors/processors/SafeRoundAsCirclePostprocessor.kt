package com.discord.image.fresco.postprocessors.processors

import C3.a
import android.graphics.Bitmap
import kotlin.jvm.internal.r

internal class SafeRoundAsCirclePostprocessor : a {
   public open fun process(bitmap: Bitmap) {
      r.h(var1, "bitmap");
      if (var1.getWidth() >= 2 && var1.getHeight() >= 2) {
         super.process(var1);
      }
   }

   public companion object {
      private const val MIN_SIZE: Int
   }
}
