package com.discord.image.fresco.postprocessors.processors

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.graphics.Paint
import com.facebook.cache.common.CacheKey
import com.facebook.imagepipeline.request.BasePostprocessor

internal object GrayscalePostprocessor : BasePostprocessor {
   public override fun getName(): String {
      val var1: java.lang.String = GrayscalePostprocessor.class.getSimpleName();
      return var1;
   }

   public override fun getPostprocessorCacheKey(): CacheKey {
      return new n9.h(this.getName());
   }

   public override fun process(destBitmap: Bitmap, sourceBitmap: Bitmap) {
      super.process(var1, var2);
      val var4: ColorMatrix = new ColorMatrix();
      var4.setSaturation(0.0F);
      val var3: Paint = new Paint();
      var3.setColorFilter(new ColorMatrixColorFilter(var4));
      new Canvas(var1).drawBitmap(var2, 0.0F, 0.0F, var3);
   }
}
