package com.discord.device.utils

import androidx.core.performance.play.services.PlayServicesDevicePerformance
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.q

internal object DevicePerformance {
   private final lateinit var playServicesDevicePerformance: PlayServicesDevicePerformance

   public final val mediaPerformanceClass: Int
      public final get() {
         var var1: PlayServicesDevicePerformance = playServicesDevicePerformance;
         if (playServicesDevicePerformance == null) {
            q.y("playServicesDevicePerformance");
            var1 = null;
         }

         return var1.h();
      }


   public fun initializePlayServicesDevicePerformance(reactContext: ReactApplicationContext) {
      q.h(var1, "reactContext");
      if (playServicesDevicePerformance == null) {
         playServicesDevicePerformance = new PlayServicesDevicePerformance(var1);
      }
   }
}
