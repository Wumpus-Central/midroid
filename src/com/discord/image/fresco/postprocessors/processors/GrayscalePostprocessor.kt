package com.discord.image.fresco.postprocessors.processors

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.graphics.Paint
import com.facebook.cache.common.CacheKey
import com.facebook.imagepipeline.request.BasePostprocessor
import kotlin.jvm.internal.r
import q3.h

internal object GrayscalePostprocessor : BasePostprocessor {
   public open fun getName(): String {
      val var1: java.lang.String = GrayscalePostprocessor.class.getSimpleName();
      r.g(var1, "javaClass.simpleName");
      return var1;
   }

   public open fun getPostprocessorCacheKey(): CacheKey {
      return new h(this.getName());
   }

   public open fun process(destBitmap: Bitmap, sourceBitmap: Bitmap) {
      r.h(var1, "destBitmap");
      r.h(var2, "sourceBitmap");
      super.process(var1, var2);
      val var4: ColorMatrix = new ColorMatrix();
      var4.setSaturation(0.0F);
      val var3: Paint = new Paint();
      var3.setColorFilter(new ColorMatrixColorFilter(var4));
      new Canvas(var1).drawBitmap(var2, 0.0F, 0.0F, var3);
   }
}
