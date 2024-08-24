package com.discord.modules.proximitysensor

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import kotlin.jvm.internal.r

public class ProximitySensorManagerModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule {
   private final val proximityWakeLock: ProximityWakeLock

   init {
      r.h(var1, "reactContext");
      super(var1);
      val var2: ProximityWakeLock.Companion = ProximityWakeLock.Companion;
      var1 = this.getReactApplicationContext();
      r.g(var1, "reactApplicationContext");
      this.proximityWakeLock = var2.create(var1, 600000L, "discord:proximitywakelock");
   }

   public open fun getName(): String {
      return "ProximitySensorManager";
   }

   @ReactMethod
   public fun setProximityMonitoringEnabled(enabled: Boolean) {
      if (var1) {
         this.proximityWakeLock.acquire();
      } else {
         this.proximityWakeLock.release();
      }
   }

   public companion object {
      private const val PROXIMITY_WAKE_LOCK_TAG: String
      private const val PROXIMITY_WAKE_LOCK_TIMEOUT: Long
   }
}
