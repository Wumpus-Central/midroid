package com.discord.image.fresco.config

import android.app.ActivityManager
import android.content.Context
import c6.o
import com.facebook.imagepipeline.cache.MemoryCacheParams
import kotlin.jvm.internal.q

internal class FrescoBitmapSupplier(context: Context) : o {
   init {
      q.h(var1, "context");
      val var2: Any = var1.getSystemService("activity");
      q.f(var2, "null cannot be cast to non-null type android.app.ActivityManager");
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
