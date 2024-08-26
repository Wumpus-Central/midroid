package com.discord.device

import androidx.core.performance.play.services.PlayServicesDevicePerformance
import com.discord.codegen.NativeDevicePerformanceManagerSpec
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.internal.r

public class DevicePerformanceManagerModule(reactContext: ReactApplicationContext) : NativeDevicePerformanceManagerSpec {
   private final var devicePerformance: PlayServicesDevicePerformance

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.devicePerformance = new PlayServicesDevicePerformance(var1);
   }

   @ReactMethod
   public override fun getMediaPerformanceClass(): Double {
      return this.devicePerformance.i();
   }

   public override fun getName(): String {
      return "RTNDeviceLocaleManager";
   }

   public companion object {
      public const val NAME: String
   }
}
