package com.discord.crash_reporting

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import kotlin.jvm.internal.q

public class CrashReportingCache(context: Context) {
   public final val cache: SharedPreferences

   init {
      q.h(var1, "context");
      super();
      val var2: SharedPreferences = var1.getSharedPreferences("crash_reporting", 0);
      q.g(var2, "getSharedPreferences(...)");
      this.cache = var2;
   }

   public fun isStaff(): Boolean {
      return this.cache.getBoolean("staff", false);
   }

   public fun setStaff(isStaff: Boolean) {
      val var2: Editor = this.cache.edit();
      q.g(var2, "editor");
      var2.putBoolean("staff", var1);
      var2.apply();
   }

   public companion object {
      private final var instance: CrashReportingCache?

      public fun getInstance(context: Context): CrashReportingCache {
         q.h(var1, "context");
         if (CrashReportingCache.access$getInstance$cp() == null) {
            CrashReportingCache.access$setInstance$cp(new CrashReportingCache(var1));
         }

         val var2: CrashReportingCache = CrashReportingCache.access$getInstance$cp();
         q.e(var2);
         return var2;
      }
   }
}
