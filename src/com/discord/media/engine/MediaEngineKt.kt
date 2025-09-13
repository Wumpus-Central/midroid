package com.discord.media.engine

import com.facebook.react.bridge.NativeModule
import com.facebook.react.bridge.ReactContext

public fun ReactContext.getMediaEngine(): MediaEngine {
   val var1: NativeModule = var0.getNativeModule("NativeMediaEngineModule");
   return (var1 as MediaEngineModule).getMediaEngine();
}
