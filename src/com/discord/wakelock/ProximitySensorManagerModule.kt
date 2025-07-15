package com.discord.wakelock

import com.discord.codegen.NativeProximitySensorManagerModuleSpec
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.r

internal class ProximitySensorManagerModule(reactContext: ReactApplicationContext) : NativeProximitySensorManagerModuleSpec {
   private final val proximityWakeLock: ProximitySensorWakeLock

   init {
      r.h(var1, "reactContext");
      super(var1);
      var1 = this.getReactApplicationContext();
      r.g(var1, "getReactApplicationContext(...)");
      this.proximityWakeLock = new ProximitySensorWakeLock(var1, 600000L, "discord:proximitywakelock");
   }

   public override fun setProximityMonitoringEnabled(enabled: Boolean) {
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
