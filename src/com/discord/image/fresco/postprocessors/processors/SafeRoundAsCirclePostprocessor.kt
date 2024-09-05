package com.discord.image.fresco.postprocessors.processors

import android.graphics.Bitmap
import kotlin.jvm.internal.q
import x7.a

internal class SafeRoundAsCirclePostprocessor : a {
   public open fun process(bitmap: Bitmap) {
      q.h(var1, "bitmap");
      if (var1.getWidth() >= 2 && var1.getHeight() >= 2) {
         super.process(var1);
      }
   }

   public companion object {
      private const val MIN_SIZE: Int
   }
}
