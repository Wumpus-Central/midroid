package com.discord.cache

import B9.j
import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import com.discord.tti_manager.TTIMetrics
import com.facebook.react.bridge.ReadableArray
import com.facebook.react.bridge.WritableMap
import java.util.HashSet
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension
import m1.a
import m1.b
import m1.c

@SourceDebugExtension(["SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\ncom/discord/cache/Cache\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,140:1\n216#2,2:141\n41#3,6:143\n47#3,6:151\n41#3,12:157\n41#3,12:169\n41#3,12:181\n41#3,12:193\n41#3,12:205\n41#3,12:217\n1863#4,2:149\n*S KotlinDebug\n*F\n+ 1 Cache.kt\ncom/discord/cache/Cache\n*L\n56#1:141,2\n71#1:143,6\n71#1:151,6\n88#1:157,12\n93#1:169,12\n100#1:181,12\n105#1:193,12\n112#1:205,12\n115#1:217,12\n73#1:149,2\n*E\n"])
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
      this.sharedPrefs$delegate = j.b(new a(var1));
      this.fastCacheSharedPrefs$delegate = j.b(new b(var1));
      F9.a.b(false, false, null, null, 0, new c(this), 31, null);
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
      val var2: Editor = var1.edit();
      var2.clear();
      var2.apply();
      var1 = this.getFastCacheSharedPrefs();
      val var4: Editor = var1.edit();
      var4.clear();
      var4.apply();
   }

   public fun getItem(key: String): String? {
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
            val var5: Editor = var2.edit();
            var5.putBoolean("initialized", true);

            for (java.lang.String var7 : var3) {
               var5.putString(var7, this.getSharedPrefs().getString(var7, null));
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
            var3 = StringsKt.t0(var3, "\"");
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
      // 04: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullParameter (Ljava/lang/Object;Ljava/lang/String;)V
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
      // 24: invokestatic kotlin/collections/CollectionsKt.X0 (Ljava/lang/Iterable;)Ljava/util/Set;
      // 27: astore 1
      // 28: aload 0
      // 29: invokespecial com/discord/cache/Cache.getSharedPrefs ()Landroid/content/SharedPreferences;
      // 2c: invokeinterface android/content/SharedPreferences.getAll ()Ljava/util/Map; 1
      // 31: astore 3
      // 32: aload 3
      // 33: ldc_w "getAll(...)"
      // 36: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue (Ljava/lang/Object;Ljava/lang/String;)V
      // 39: aload 3
      // 3a: invokeinterface java/util/Map.entrySet ()Ljava/util/Set; 1
      // 3f: invokeinterface java/util/Set.iterator ()Ljava/util/Iterator; 1
      // 44: astore 3
      // 45: aload 3
      // 46: invokeinterface java/util/Iterator.hasNext ()Z 1
      // 4b: ifeq 98
      // 4e: aload 3
      // 4f: invokeinterface java/util/Iterator.next ()Ljava/lang/Object; 1
      // 54: checkcast java/util/Map$Entry
      // 57: astore 5
      // 59: aload 5
      // 5b: invokeinterface java/util/Map$Entry.getKey ()Ljava/lang/Object; 1
      // 60: checkcast java/lang/String
      // 63: astore 4
      // 65: aload 5
      // 67: invokeinterface java/util/Map$Entry.getValue ()Ljava/lang/Object; 1
      // 6c: astore 5
      // 6e: aload 1
      // 6f: aload 4
      // 71: invokeinterface java/util/Set.contains (Ljava/lang/Object;)Z 2
      // 76: ifne 45
      // 79: aload 4
      // 7b: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;)V
      // 7e: aload 5
      // 80: ldc_w "null cannot be cast to non-null type kotlin.String"
      // 83: invokestatic kotlin/jvm/internal/Intrinsics.checkNotNull (Ljava/lang/Object;Ljava/lang/String;)V
      // 86: aload 2
      // 87: aload 4
      // 89: aload 5
      // 8b: checkcast java/lang/String
      // 8e: invokevirtual com/facebook/react/bridge/WritableNativeMap.putString (Ljava/lang/String;Ljava/lang/String;)V
      // 91: goto 45
      // 94: astore 1
      // 95: goto a9
      // 98: getstatic com/discord/tti_manager/TTIMetrics.INSTANCE Lcom/discord/tti_manager/TTIMetrics;
      // 9b: ldc_w "Storage.refresh() End"
      // 9e: lconst_0
      // 9f: aconst_null
      // a0: bipush 0
      // a1: bipush 14
      // a3: aconst_null
      // a4: invokestatic com/discord/tti_manager/TTIMetrics.record$default (Lcom/discord/tti_manager/TTIMetrics;Ljava/lang/String;JLjava/lang/String;ZILjava/lang/Object;)V
      // a7: aload 2
      // a8: areturn
      // a9: getstatic com/discord/tti_manager/TTIMetrics.INSTANCE Lcom/discord/tti_manager/TTIMetrics;
      // ac: ldc_w "Storage.refresh() End"
      // af: lconst_0
      // b0: aconst_null
      // b1: bipush 0
      // b2: bipush 14
      // b4: aconst_null
      // b5: invokestatic com/discord/tti_manager/TTIMetrics.record$default (Lcom/discord/tti_manager/TTIMetrics;Ljava/lang/String;JLjava/lang/String;ZILjava/lang/Object;)V
      // b8: aload 1
      // b9: athrow
   }

   public fun removeItem(key: String) {
      var var2: SharedPreferences = this.getSharedPrefs();
      val var3: Editor = var2.edit();
      var3.remove(var1);
      var3.apply();
      if (FAST_CACHE_KEYS.contains(var1)) {
         var2 = this.getFastCacheSharedPrefs();
         val var5: Editor = var2.edit();
         var5.remove(var1);
         var5.apply();
      }
   }

   public fun setItem(key: String, value: String) {
      var var3: SharedPreferences = this.getSharedPrefs();
      val var4: Editor = var3.edit();
      var4.putString(var1, var2);
      var4.apply();
      if (FAST_CACHE_KEYS.contains(var1)) {
         var3 = this.getFastCacheSharedPrefs();
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
            Intrinsics.throwUninitializedPropertyAccessException("cacheInstance");
            var1 = null;
         }

         return var1;
      }

      public fun quickInitCache(applicationContext: Context) {
         Cache.access$setCacheInstance$cp(new Cache(var1));
      }
   }
}
