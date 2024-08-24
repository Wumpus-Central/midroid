package com.discord.image.fresco.config

import android.content.Context
import com.facebook.cache.disk.DiskCacheConfig
import kotlin.jvm.internal.r

internal object FrescoDiskCache {
   private const val CACHE_DIR: String = "app_images_cache"
   private const val CACHE_DIR_SMALL: String = "app_images_cache_small"
   private const val MAX_DISK_CACHE_SIZE: Long = 62914560L

   private fun Context.newDiskCacheConfig(directoryName: String): DiskCacheConfig {
      val var3: DiskCacheConfig = DiskCacheConfig.m(var1).p(var1.getCacheDir()).o(var2).q(62914560L).n();
      r.g(var3, "newBuilder(this)\n       …IZE)\n            .build()");
      return var3;
   }

   public fun Context.newRegularDiskCache(): DiskCacheConfig {
      r.h(var1, "<this>");
      return this.newDiskCacheConfig(var1, "app_images_cache");
   }

   public fun Context.newSmallDiskCache(): DiskCacheConfig {
      r.h(var1, "<this>");
      return this.newDiskCacheConfig(var1, "app_images_cache_small");
   }
}
