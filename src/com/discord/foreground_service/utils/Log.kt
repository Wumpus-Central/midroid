package com.discord.foreground_service.utils

import com.discord.crash_reporting.CrashReporting

internal object Log {
   public const val TAG: String = "ForegroundService"

   internal fun e(message: String, e: Exception? = ...) {
      CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, var1, null, "ForegroundService", null, 10, null);
      com.discord.logging.Log.INSTANCE.e("ForegroundService", var1, var2);
   }

   internal fun i(message: String, e: Exception? = ...) {
      CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, var1, null, "ForegroundService", null, 10, null);
      com.discord.logging.Log.INSTANCE.i("ForegroundService", var1, var2);
   }

   internal fun w(message: String, e: Exception? = ...) {
      CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, var1, null, "ForegroundService", null, 10, null);
      com.discord.logging.Log.INSTANCE.w("ForegroundService", var1, var2);
   }
}
