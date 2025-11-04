package com.discord.wakelock

import com.discord.codegen.NativeProximitySensorManagerModuleSpec
import com.facebook.react.bridge.ReactApplicationContext

internal class ProximitySensorManagerModule(reactContext: ReactApplicationContext) : NativeProximitySensorManagerModuleSpec(var1) {
   private final val proximityWakeLock: ProximitySensorWakeLock

   init {
      var1 = this.getReactApplicationContext();
      this.proximityWakeLock = new ProximitySensorWakeLock(var1, 600000L, "discord:proximitywakelock");
   }

   public open fun setProximityMonitoringEnabled(enabled: Boolean) {
      if (var1) {
         this.proximityWakeLock.acquire();
      } else {
         this.proximityWakeLock.release();
      }
   }

   public companion object {
      private const val PROXIMITY_WAKE_LOCK_TIMEOUT: Long
      private const val PROXIMITY_WAKE_LOCK_TAG: String
   }
}
