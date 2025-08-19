package com.discord.crash_reporting

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nCrashReportingCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashReportingCache.kt\ncom/discord/crash_reporting/CrashReportingCache\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,32:1\n41#2,12:33\n*S KotlinDebug\n*F\n+ 1 CrashReportingCache.kt\ncom/discord/crash_reporting/CrashReportingCache\n*L\n15#1:33,12\n*E\n"])
public class CrashReportingCache(context: Context) {
   public final val cache: SharedPreferences

   init {
      val var2: SharedPreferences = var1.getSharedPreferences("crash_reporting", 0);
      this.cache = var2;
   }

   public fun isStaff(): Boolean {
      return this.cache.getBoolean("staff", false);
   }

   public fun setStaff(isStaff: Boolean) {
      val var2: Editor = this.cache.edit();
      var2.putBoolean("staff", var1);
      var2.apply();
   }

   public companion object {
      private final var instance: CrashReportingCache?

      public fun getInstance(context: Context): CrashReportingCache {
         if (CrashReportingCache.access$getInstance$cp() == null) {
            CrashReportingCache.access$setInstance$cp(new CrashReportingCache(var1));
         }

         val var2: CrashReportingCache = CrashReportingCache.access$getInstance$cp();
         return var2;
      }
   }
}
