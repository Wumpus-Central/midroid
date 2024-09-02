package com.discord.media.engine.types

import com.discord.logging.Log
import kotlin.jvm.internal.q

internal object Debug {
   public const val ENABLE: Boolean = false
   public const val ENABLE_ON_FRAME_DEBUG: Boolean = false
   public const val LOG_ON_FRAME_INTERVAL: Int = 100
   public const val LOG_ON_FRAME_RESET_INTERVAL: Int = 500
   private const val LOG_TAG: String = "media_engine"
   private const val TAG: String = "Debug"

   public inline fun log(tag: String, method: String = "") {
      q.h(var1, "tag");
      q.h(var2, "method");
   }

   public inline fun log(tag: String, method: String = "", startNs: Long) {
      q.h(var1, "tag");
      q.h(var2, "method");
   }

   public inline fun log(tag: String, method: String = "", startNs: Long, lazyMsg: () -> Any?) {
      q.h(var1, "tag");
      q.h(var2, "method");
      q.h(var5, "lazyMsg");
   }

   public inline fun log(tag: String, method: String = "", lazyMsg: () -> Any?) {
      q.h(var1, "tag");
      q.h(var2, "method");
      q.h(var3, "lazyMsg");
   }

   public fun logDebugLoggingConfig() {
      Log.i$default(Log.INSTANCE, "Debug", "MediaEngine debug logging disabled.", null, 4, null);
   }
}
