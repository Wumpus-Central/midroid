package com.discord.react.utilities

import com.facebook.react.bridge.JavaScriptContextHolder
import com.facebook.react.bridge.ReactContext
import kotlin.jvm.internal.q

public fun JavaScriptContextHolder.jsiId(): Long {
   q.h(var0, "<this>");
   val var1: Long = var0.get();
   if (var1 != 0L) {
      return var1;
   } else {
      throw new IllegalStateException("JSI Runtime is not available.".toString());
   }
}

public fun ReactContext.jsiId(): Long? {
   q.h(var0, "<this>");
   val var1: JavaScriptContextHolder = var0.getJavaScriptContextHolder();
   val var2: java.lang.Long;
   if (var1 != null) {
      var2 = jsiId(var1);
   } else {
      var2 = null;
   }

   return var2;
}
