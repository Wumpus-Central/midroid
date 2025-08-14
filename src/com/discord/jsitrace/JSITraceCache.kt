package com.discord.jsitrace

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nJSITraceCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JSITraceCache.kt\ncom/discord/jsitrace/JSITraceCache\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,22:1\n41#2,12:23\n*S KotlinDebug\n*F\n+ 1 JSITraceCache.kt\ncom/discord/jsitrace/JSITraceCache\n*L\n15#1:23,12\n*E\n"])
internal object JSITraceCache {
   private const val CACHE_KEY: String = "JSITraceCache"
   private const val CACHE_KEY_JSI_TRACE_ENABLED: String = "CACHE_KEY_JSI_TRACE_ENABLED"

   private final val cache: SharedPreferences
      private final get() {
         val var2: SharedPreferences = var1.getSharedPreferences("JSITraceCache", 0);
         return var2;
      }


   public fun isEnabled(context: Context): Boolean {
      return this.getCache(var1).getBoolean("CACHE_KEY_JSI_TRACE_ENABLED", false);
   }

   public fun setEnabled(context: Context, enabled: Boolean) {
      val var3: Editor = this.getCache(var1).edit();
      var3.putBoolean("CACHE_KEY_JSI_TRACE_ENABLED", var2);
      var3.apply();
   }
}
