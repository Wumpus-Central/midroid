package com.discord.foreground_service.utils

import android.content.Context
import android.net.wifi.WifiManager
import android.net.wifi.WifiManager.WifiLock
import android.os.PowerManager
import android.os.Build.VERSION
import android.os.PowerManager.WakeLock
import androidx.core.content.a
import kotlin.jvm.internal.r

internal class Wakelocks(tag: String, timeout: Long = 3600000L) {
   private final val tag: String
   private final val timeout: Long
   private final var wakeLockPartial: WakeLock?
   private final var wakeLockWifi: WifiLock?

   init {
      r.h(var1, "tag");
      super();
      this.tag = var1;
      this.timeout = var2;
   }

   public fun acquire(context: Context) {
      r.h(var1, "context");
      val var4: WifiManager = a.i(var1, WifiManager.class) as WifiManager;
      if (var4 != null) {
         if (VERSION.SDK_INT >= 34) {
            this.wakeLockWifi = var4.createWifiLock(4, this.tag);
         } else {
            this.wakeLockWifi = var4.createWifiLock(3, this.tag);
         }
      }

      val var5: PowerManager = a.i(var1, PowerManager.class) as PowerManager;
      var var2: Boolean = false;
      if (var5 != null) {
         var2 = false;
         if (var5.isWakeLockLevelSupported(1)) {
            var2 = true;
         }
      }

      if (var2) {
         val var6: WakeLock = var5.newWakeLock(1, this.tag);
         this.wakeLockPartial = var6;
         if (var6 != null) {
            var6.acquire(this.timeout);
         }
      }
   }

   public fun release() {
      var var1: Boolean;
      if (this.wakeLockPartial != null && this.wakeLockPartial.isHeld()) {
         var1 = true;
      } else {
         var1 = false;
      }

      if (var1) {
         if (this.wakeLockPartial != null) {
            this.wakeLockPartial.release();
         }

         this.wakeLockPartial = null;
      }

      if (this.wakeLockWifi != null && this.wakeLockWifi.isHeld()) {
         var1 = true;
      } else {
         var1 = false;
      }

      if (var1) {
         if (this.wakeLockWifi != null) {
            this.wakeLockWifi.release();
         }

         this.wakeLockWifi = null;
      }
   }
}
