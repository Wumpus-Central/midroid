package com.discord.cache

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import com.discord.tti_manager.TTIMetrics
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.WritableMap
import g9.j
import java.util.HashSet
import kotlin.jvm.internal.q
import p1.a
import p1.b
import p1.c

public class Cache(reactContext: Context) {
   private final var sharedPrefsLoaded: Boolean

   private final val sharedPrefs: SharedPreferences
      private final get() {
         return this.sharedPrefs$delegate.getValue() as SharedPreferences;
      }


   private final val fastCacheSharedPrefs: SharedPreferences
      private final get() {
         return this.fastCacheSharedPrefs$delegate.getValue() as SharedPreferences;
      }


   init {
      q.h(var1, "reactContext");
      super();
      this.sharedPrefs$delegate = j.b(new a(var1));
      this.fastCacheSharedPrefs$delegate = j.b(new b(var1));
      l9.a.b(false, false, null, null, 0, new c(this), 31, null);
   }

   @JvmStatic
   fun `_init_$lambda$2`(var0: Cache): Unit {
      val var1: TTIMetrics = TTIMetrics.INSTANCE;
      TTIMetrics.record$default(TTIMetrics.INSTANCE, "CacheStorage Init Start", 0L, null, false, 14, null);
      var0.getSharedPrefs().getString("hydrate", null);
      var0.sharedPrefsLoaded = true;
      TTIMetrics.record$default(var1, "CacheStorage Init End", 0L, null, false, 14, null);
      return Unit.a;
   }

   @JvmStatic
   fun `fastCacheSharedPrefs_delegate$lambda$1`(var0: Context): SharedPreferences {
      return var0.getSharedPreferences("FastCacheStore", 0);
   }

   @JvmStatic
   fun `sharedPrefs_delegate$lambda$0`(var0: Context): SharedPreferences {
      return var0.getSharedPreferences("CacheStore", 0);
   }

   public fun clear() {
      var var1: SharedPreferences = this.getSharedPrefs();
      q.g(var1, "<get-sharedPrefs>(...)");
      val var2: Editor = var1.edit();
      var2.clear();
      var2.apply();
      var1 = this.getFastCacheSharedPrefs();
      q.g(var1, "<get-fastCacheSharedPrefs>(...)");
      val var4: Editor = var1.edit();
      var4.clear();
      var4.apply();
   }

   public fun getItem(key: String): String? {
      q.h(var1, "key");
      val var3: HashSet = FAST_CACHE_KEYS;
      if (!FAST_CACHE_KEYS.contains(var1)) {
         if (!this.sharedPrefsLoaded) {
            val var6: TTIMetrics = TTIMetrics.INSTANCE;
            val var8: StringBuilder = new StringBuilder();
            var8.append("WARNING: Cache accessed before parsed ");
            var8.append(var1);
            TTIMetrics.record$default(var6, var8.toString(), 0L, null, false, 14, null);
         }

         return this.getSharedPrefs().getString(var1, null);
      } else {
         if (!this.getFastCacheSharedPrefs().getBoolean("initialized", false)) {
            val var2: SharedPreferences = this.getFastCacheSharedPrefs();
            q.g(var2, "<get-fastCacheSharedPrefs>(...)");
            val var5: Editor = var2.edit();
            var5.putBoolean("initialized", true);

            for (java.lang.String var4 : var3) {
               var5.putString(var4, this.getSharedPrefs().getString(var4, null));
            }

            var5.apply();
         }

         return this.getFastCacheSharedPrefs().getString(var1, null);
      }
   }

   public fun getToken(sanitized: Boolean = true): String? {
      var var3: java.lang.String;
      if (var1) {
         var3 = this.getItem("token");
         if (var3 != null) {
            var3 = h.t0(var3, "\"");
         } else {
            var3 = null;
         }
      } else {
         var3 = this.getItem("token");
      }

      return var3;
   }

   public fun refresh(exclude: ReadableArray): WritableMap {
      // $VF: Couldn't be decompiled
      // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
      // java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
      //   at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:100)
      //   at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:106)
      //   at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:302)
      //   at java.base/java.util.Objects.checkIndex(Objects.java:385)
      //   at java.base/java.util.ArrayList.remove(ArrayList.java:551)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.removeExceptionInstructionsEx(FinallyProcessor.java:1057)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.insertSemaphore(FinallyProcessor.java:350)
      //   at org.jetbrains.java.decompiler.modules.decompiler.FinallyProcessor.iterateGraph(FinallyProcessor.java:99)
      //
      // Bytecode:
      // 00: aload 1
      // 01: ldc_w "exclude"
      // 04: invokestatic kotlin/jvm/internal/q.h (Ljava/lang/Object;Ljava/lang/String;)V
      // 07: getstatic com/discord/tti_manager/TTIMetrics.INSTANCE Lcom/discord/tti_manager/TTIMetrics;
      // 0a: ldc_w "Storage.refresh() Start"
      // 0d: lconst_0
      // 0e: aconst_null
      // 0f: bipush 0
      // 10: bipush 14
      // 12: aconst_null
      // 13: invokestatic com/discord/tti_manager/TTIMetrics.record$default (Lcom/discord/tti_manager/TTIMetrics;Ljava/lang/String;JLjava/lang/String;ZILjava/lang/Object;)V
      // 16: new com/facebook/react/bridge/WritableNativeMap
      // 19: astore 2
      // 1a: aload 2
      // 1b: invokespecial com/facebook/react/bridge/WritableNativeMap.<init> ()V
      // 1e: aload 1
      // 1f: invokeinterface com/facebook/react/bridge/ReadableArray.toArrayList ()Ljava/util/ArrayList; 1
      // 24: invokestatic kotlin/collections/i.V0 (Ljava/lang/Iterable;)Ljava/util/Set;
      // 27: astore 1
      // 28: aload 0
      // 29: invokespecial com/discord/cache/Cache.getSharedPrefs ()Landroid/content/SharedPreferences;
      // 2c: invokeinterface android/content/SharedPreferences.getAll ()Ljava/util/Map; 1
      // 31: astore 3
      // 32: aload 3
      // 33: ldc_w "getAll(...)"
      // 36: invokestatic kotlin/jvm/internal/q.g (Ljava/lang/Object;Ljava/lang/String;)V
      // 39: aload 3
      // 3a: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 3f: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 44: astore 4
      // 46: aload 4
      // 48: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4d: ifeq 97
      // 50: aload 4
      // 52: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 57: checkcast java/util/Map$Entry
      // 5a: astore 5
      // 5c: aload 5
      // 5e: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 63: checkcast java/lang/String
      // 66: astore 3
      // 67: aload 5
      // 69: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 6e: astore 5
      // 70: aload 1
      // 71: aload 3
      // 72: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 77: ifne 46
      // 7a: aload 3
      // 7b: invokestatic kotlin/jvm/internal/q.e (Ljava/lang/Object;)V
      // 7e: aload 5
      // 80: ldc_w "null cannot be cast to non-null type kotlin.String"
      // 83: invokestatic kotlin/jvm/internal/q.f (Ljava/lang/Object;Ljava/lang/String;)V
      // 86: aload 2
      // 87: aload 3
      // 88: aload 5
      // 8a: checkcast java/lang/String
      // 8d: invokevirtual com/facebook/react/bridge/WritableNativeMap.putString (Ljava/lang/String;Ljava/lang/String;)V
      // 90: goto 46
      // 93: astore 1
      // 94: goto a8
      // 97: getstatic com/discord/tti_manager/TTIMetrics.INSTANCE Lcom/discord/tti_manager/TTIMetrics;
      // 9a: ldc_w "Storage.refresh() End"
      // 9d: lconst_0
      // 9e: aconst_null
      // 9f: bipush 0
      // a0: bipush 14
      // a2: aconst_null
      // a3: invokestatic com/discord/tti_manager/TTIMetrics.record$default (Lcom/discord/tti_manager/TTIMetrics;Ljava/lang/String;JLjava/lang/String;ZILjava/lang/Object;)V
      // a6: aload 2
      // a7: areturn
      // a8: getstatic com/discord/tti_manager/TTIMetrics.INSTANCE Lcom/discord/tti_manager/TTIMetrics;
      // ab: ldc_w "Storage.refresh() End"
      // ae: lconst_0
      // af: aconst_null
      // b0: bipush 0
      // b1: bipush 14
      // b3: aconst_null
      // b4: invokestatic com/discord/tti_manager/TTIMetrics.record$default (Lcom/discord/tti_manager/TTIMetrics;Ljava/lang/String;JLjava/lang/String;ZILjava/lang/Object;)V
      // b7: aload 1
      // b8: athrow
   }

   public fun removeItem(key: String) {
      q.h(var1, "key");
      var var2: SharedPreferences = this.getSharedPrefs();
      q.g(var2, "<get-sharedPrefs>(...)");
      val var3: Editor = var2.edit();
      var3.remove(var1);
      var3.apply();
      if (FAST_CACHE_KEYS.contains(var1)) {
         var2 = this.getFastCacheSharedPrefs();
         q.g(var2, "<get-fastCacheSharedPrefs>(...)");
         val var5: Editor = var2.edit();
         var5.remove(var1);
         var5.apply();
      }
   }

   public fun setItem(key: String, value: String) {
      q.h(var1, "key");
      q.h(var2, "value");
      var var3: SharedPreferences = this.getSharedPrefs();
      q.g(var3, "<get-sharedPrefs>(...)");
      val var4: Editor = var3.edit();
      var4.putString(var1, var2);
      var4.apply();
      if (FAST_CACHE_KEYS.contains(var1)) {
         var3 = this.getFastCacheSharedPrefs();
         q.g(var3, "<get-fastCacheSharedPrefs>(...)");
         val var6: Editor = var3.edit();
         var6.putString(var1, var2);
         var6.apply();
      }
   }

   public companion object {
      private const val CACHE_STORE_NAME: String
      private final val FAST_CACHE_KEYS: HashSet<String>
      private final lateinit var cacheInstance: Cache

      public fun get(): Cache {
         val var2: Cache = Cache.access$getCacheInstance$cp();
         var var1: Cache = var2;
         if (var2 == null) {
            q.y("cacheInstance");
            var1 = null;
         }

         return var1;
      }

      public fun quickInitCache(applicationContext: Context) {
         q.h(var1, "applicationContext");
         Cache.access$setCacheInstance$cp(new Cache(var1));
      }
   }
}
