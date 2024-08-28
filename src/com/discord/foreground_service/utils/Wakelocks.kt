package com.discord.foreground_service.utils

import android.content.Context
import android.net.wifi.WifiManager
import android.net.wifi.WifiManager.WifiLock
import android.os.PowerManager
import android.os.Build.VERSION
import android.os.PowerManager.WakeLock
import androidx.core.content.a
import kotlin.jvm.internal.q

internal class Wakelocks(tag: String, timeout: Long = 3600000L) {
   private final val tag: String
   private final val timeout: Long
   private final var wakeLockPartial: WakeLock?
   private final var wakeLockWifi: WifiLock?

   init {
      q.h(var1, "tag");
      super();
      this.tag = var1;
      this.timeout = var2;
   }

   public fun acquire(context: Context) {
      q.h(var1, "context");
      val var2: WifiManager = a.j(var1, WifiManager.class) as WifiManager;
      if (var2 != null) {
         if (VERSION.SDK_INT >= 34) {
            this.wakeLockWifi = var2.createWifiLock(4, this.tag);
         } else {
            this.wakeLockWifi = var2.createWifiLock(3, this.tag);
         }
      }

      val var3: PowerManager = a.j(var1, PowerManager.class) as PowerManager;
      if (var3 != null && var3.isWakeLockLevelSupported(1)) {
         val var4: WakeLock = var3.newWakeLock(1, this.tag);
         this.wakeLockPartial = var4;
         if (var4 != null) {
            var4.acquire(this.timeout);
         }
      }
   }

   public fun release() {
      if (this.wakeLockPartial != null && this.wakeLockPartial.isHeld()) {
         if (this.wakeLockPartial != null) {
            this.wakeLockPartial.release();
         }

         this.wakeLockPartial = null;
      }

      if (this.wakeLockWifi != null && this.wakeLockWifi.isHeld()) {
         if (this.wakeLockWifi != null) {
            this.wakeLockWifi.release();
         }

         this.wakeLockWifi = null;
      }
   }
}
