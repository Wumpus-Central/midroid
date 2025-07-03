package com.discord.logging

import kotlin.jvm.internal.r
import timber.log.a.c

internal class LoggingTree : c {
   protected open fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
      r.h(var3, "message");
      android.util.Log.println(var1, var2, var3);
   }
}
