package com.discord.react.utilities

import com.facebook.react.bridge.JavaScriptContextHolder
import com.facebook.react.bridge.ReactContext

public fun JavaScriptContextHolder.jsiId(): Long {
   val var1: Long = var0.get();
   if (var1 != 0L) {
      return var1;
   } else {
      throw new IllegalStateException("JSI Runtime is not available.");
   }
}

public fun ReactContext.jsiId(): Long? {
   val var1: JavaScriptContextHolder = var0.getJavaScriptContextHolder();
   return if (var1 != null) jsiId(var1) else null;
}
