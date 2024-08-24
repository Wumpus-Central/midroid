package com.discord.jsitrace

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import kotlin.jvm.internal.r

internal object JSITraceCache {
   private const val CACHE_KEY: String = "JSITraceCache"
   private const val CACHE_KEY_JSI_TRACE_ENABLED: String = "CACHE_KEY_JSI_TRACE_ENABLED"

   private final val cache: SharedPreferences
      private final get() {
         val var2: SharedPreferences = var1.getSharedPreferences("JSITraceCache", 0);
         r.g(var2, "getSharedPreferences(CAC…EY, Context.MODE_PRIVATE)");
         return var2;
      }


   public fun isEnabled(context: Context): Boolean {
      r.h(var1, "context");
      return this.getCache(var1).getBoolean("CACHE_KEY_JSI_TRACE_ENABLED", false);
   }

   public fun setEnabled(context: Context, enabled: Boolean) {
      r.h(var1, "context");
      val var3: Editor = this.getCache(var1).edit();
      r.g(var3, "editor");
      var3.putBoolean("CACHE_KEY_JSI_TRACE_ENABLED", var2);
      var3.apply();
   }
}
