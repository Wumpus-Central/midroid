package com.discord.media_player

import android.content.Context
import com.google.android.exoplayer2.upstream.DataSource
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource.Factory
import com.google.android.exoplayer2.upstream.cache.SimpleCache
import com.google.android.exoplayer2.upstream.cache.c
import java.io.File
import kotlin.jvm.internal.q
import o9.s
import p9.h

public class CacheDataSourceFactory private constructor(defaultDatasourceFactory: Factory = new Factory()) :
   com.google.android.exoplayer2.upstream.DataSource.Factory {
   private final val defaultDatasourceFactory: Factory

   init {
      this.defaultDatasourceFactory = var1;
   }

   public open fun createDataSource(): DataSource {
      var var1: SimpleCache = cache;
      var var2: SimpleCache = null;
      if (cache == null) {
         q.y("cache");
         var1 = null;
      }

      val var4: DefaultHttpDataSource = this.defaultDatasourceFactory.a();
      val var5: s = new s();
      if (cache == null) {
         q.y("cache");
      } else {
         var2 = cache;
      }

      return new c(var1, var4, var5, new com.google.android.exoplayer2.upstream.cache.b(var2, 104857600L), 3, null);
   }

   public companion object {
      private const val CACHE_DIR_NAME: String
      private const val CACHE_MAX_SIZE: Long
      private final lateinit var cache: SimpleCache
      private final lateinit var factory: CacheDataSourceFactory

      private fun getSimpleCache(context: Context): SimpleCache {
         return new SimpleCache(new File(var1.getCacheDir(), "app_media_player"), new h(104857600L), new s7.c(var1));
      }

      public fun getInstance(): CacheDataSourceFactory {
         val var2: CacheDataSourceFactory = CacheDataSourceFactory.access$getFactory$cp();
         var var1: CacheDataSourceFactory = var2;
         if (var2 == null) {
            q.y("factory");
            var1 = null;
         }

         return var1;
      }

      public fun init(context: Context) {
         q.h(var1, "context");
         CacheDataSourceFactory.access$setCache$cp(this.getSimpleCache(var1));
         CacheDataSourceFactory.access$setFactory$cp(new CacheDataSourceFactory(null, 1, null));
         var var3: CacheDataSourceFactory = CacheDataSourceFactory.access$getFactory$cp();
         if (var3 == null) {
            q.y("factory");
            var3 = null;
         }

         com.brentvatne.exoplayer.b.e(var3);
      }
   }
}
