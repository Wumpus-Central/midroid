package com.discord.media_player

import android.content.Context
import com.google.android.exoplayer2.upstream.DataSource
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource.Factory
import com.google.android.exoplayer2.upstream.cache.SimpleCache
import java.io.File
import kotlin.jvm.internal.Intrinsics
import xd.s

public class CacheDataSourceFactory private constructor(defaultDatasourceFactory: Factory = new DefaultHttpDataSource.Factory()) : DataSource.Factory {
   private final val defaultDatasourceFactory: Factory

   init {
      this.defaultDatasourceFactory = var1;
   }

   public override fun createDataSource(): DataSource {
      var var1: SimpleCache = cache;
      if (cache == null) {
         Intrinsics.throwUninitializedPropertyAccessException("cache");
         var1 = null;
      }

      val var4: DefaultHttpDataSource = this.defaultDatasourceFactory.a();
      val var5: s = new s();
      var var6: SimpleCache = cache;
      if (cache == null) {
         Intrinsics.throwUninitializedPropertyAccessException("cache");
         var6 = null;
      }

      return new com.google.android.exoplayer2.upstream.cache.c(var1, var4, var5, new com.google.android.exoplayer2.upstream.cache.b(var6, 104857600L), 3, null);
   }

   public companion object {
      private final lateinit var cache: SimpleCache
      private final lateinit var factory: CacheDataSourceFactory
      private const val CACHE_MAX_SIZE: Long
      private const val CACHE_DIR_NAME: String

      private fun getSimpleCache(context: Context): SimpleCache {
         return new SimpleCache(new File(var1.getCacheDir(), "app_media_player"), new yd.h(104857600L), new bc.c(var1));
      }

      public fun getInstance(): CacheDataSourceFactory {
         val var2: CacheDataSourceFactory = CacheDataSourceFactory.access$getFactory$cp();
         var var1: CacheDataSourceFactory = var2;
         if (var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("factory");
            var1 = null;
         }

         return var1;
      }

      public fun init(context: Context) {
         CacheDataSourceFactory.access$setCache$cp(this.getSimpleCache(var1));
         var var3: CacheDataSourceFactory = null;
         CacheDataSourceFactory.access$setFactory$cp(new CacheDataSourceFactory(null, 1, null));
         val var2: CacheDataSourceFactory = CacheDataSourceFactory.access$getFactory$cp();
         if (var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("factory");
         } else {
            var3 = var2;
         }

         com.brentvatne.exoplayer.b.e(var3);
      }
   }
}
