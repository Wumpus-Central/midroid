package com.discord.image.fresco.postprocessors.processors

import android.graphics.Bitmap
import com.facebook.imagepipeline.request.BasePostprocessor
import kotlin.jvm.internal.r

internal class CompositePostprocessor(postprocessors: List<BasePostprocessor>) : BasePostprocessor {
   private final val postprocessors: List<BasePostprocessor>

   init {
      r.h(var1, "postprocessors");
      super();
      this.postprocessors = var1;
   }

   public open fun process(destBitmap: Bitmap, sourceBitmap: Bitmap) {
      r.h(var1, "destBitmap");
      r.h(var2, "sourceBitmap");
      val var3: java.util.Iterator = this.postprocessors.iterator();

      while (var3.hasNext()) {
         (var3.next() as BasePostprocessor).process(var1, var2);
      }
   }
}
