package com.discord.cpu_pnq

import com.discord.codegen.NativeCPUPnQSpec
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.q

public class CPUPnQModule(reactContext: ReactApplicationContext) : NativeCPUPnQSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   public override fun enable(cpuPercentage: Double) {
      CPUPnQManager.INSTANCE.enable(var1);
   }

   public override fun hangNativeThread(durationMs: Double) {
      CPUPnQManager.INSTANCE.hangNativeThread(var1);
   }

   public companion object {
      public const val NAME: String
   }
}
