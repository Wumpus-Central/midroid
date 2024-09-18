package com.discord.image.fresco.postprocessors.processors

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.graphics.Paint
import com.facebook.cache.common.CacheKey
import com.facebook.imagepipeline.request.BasePostprocessor
import kotlin.jvm.internal.q
import s3.h

internal object GrayscalePostprocessor : BasePostprocessor {
   public open fun getName(): String {
      val var1: java.lang.String = GrayscalePostprocessor.class.getSimpleName();
      q.g(var1, "getSimpleName(...)");
      return var1;
   }

   public open fun getPostprocessorCacheKey(): CacheKey {
      return new h(this.getName());
   }

   public open fun process(destBitmap: Bitmap, sourceBitmap: Bitmap) {
      q.h(var1, "destBitmap");
      q.h(var2, "sourceBitmap");
      super.process(var1, var2);
      val var3: ColorMatrix = new ColorMatrix();
      var3.setSaturation(0.0F);
      val var4: Paint = new Paint();
      var4.setColorFilter(new ColorMatrixColorFilter(var3));
      new Canvas(var1).drawBitmap(var2, 0.0F, 0.0F, var4);
   }
}
