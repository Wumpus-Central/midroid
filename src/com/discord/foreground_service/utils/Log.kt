package com.discord.foreground_service.utils

import com.discord.crash_reporting.CrashReporting
import kotlin.jvm.internal.r

internal object Log {
   internal fun i(tag: String, message: String, e: Exception? = ...) {
      r.h(var1, "tag");
      r.h(var2, "message");
      CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, var2, null, var1, 2, null);
      com.discord.logging.Log.INSTANCE.i(var1, var2, var3);
   }

   internal fun w(tag: String, message: String, e: Exception? = ...) {
      r.h(var1, "tag");
      r.h(var2, "message");
      CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, var2, null, var1, 2, null);
      com.discord.logging.Log.INSTANCE.w(var1, var2, var3);
   }
}
