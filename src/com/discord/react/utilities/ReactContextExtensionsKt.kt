package com.discord.react.utilities

import com.facebook.react.bridge.JavaScriptContextHolder
import com.facebook.react.bridge.ReactContext
import kotlin.jvm.internal.r

public fun JavaScriptContextHolder.jsiId(): Long {
   r.h(var0, "<this>");
   val var1: Long = var0.get();
   if (var1 != 0L) {
      return var1;
   } else {
      throw new IllegalStateException("JSI Runtime is not available.".toString());
   }
}

public fun ReactContext.jsiId(): Long {
   r.h(var0, "<this>");
   val var1: JavaScriptContextHolder = var0.getJavaScriptContextHolder();
   r.g(var1, "javaScriptContextHolder");
   return jsiId(var1);
}
