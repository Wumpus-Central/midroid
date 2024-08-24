package com.discord.media.engine

import com.facebook.react.bridge.ReactContext
import kotlin.jvm.internal.r

public fun ReactContext.getMediaEngine(): MediaEngine {
   r.h(var0, "<this>");
   val var1: MediaEngineModule = var0.getNativeModule(MediaEngineModule.class) as MediaEngineModule;
   if (var1 != null) {
      val var2: MediaEngine = var1.getMediaEngine();
      if (var2 != null) {
         return var2;
      }
   }

   throw new IllegalStateException("Unable to get MediaEngine native module".toString());
}
