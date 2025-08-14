package com.discord.image.fresco.config

import android.app.ActivityManager
import android.content.Context
import com.facebook.imagepipeline.cache.MemoryCacheParams
import o3.o

internal class FrescoBitmapSupplier(context: Context) : o {
   init {
      val var2: Any = var1.getSystemService("activity");
      super(var2 as ActivityManager);
   }

   public open fun get(): MemoryCacheParams {
      val var2: MemoryCacheParams = super.get();
      return new MemoryCacheParams(var2.a, var2.b, var2.c, var2.d, var2.a / 3, 0L, 32, null);
   }

   public companion object {
      private const val MAX_BITMAP_MEM_CACHE_SIZE_RATIO: Int
   }
}
