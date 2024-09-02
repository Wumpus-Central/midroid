package com.discord.modules.proximitysensor

import android.os.PowerManager
import android.os.PowerManager.WakeLock
import kotlin.jvm.internal.q

private class ProximityWakeLockImpl(powerManager: PowerManager, timeout: Long, tag: String) : ProximityWakeLock {
   private final val powerManager: PowerManager
   private final var systemWakeLock: WakeLock?
   private final val tag: String
   private final val timeout: Long

   init {
      q.h(var1, "powerManager");
      q.h(var4, "tag");
      super();
      this.powerManager = var1;
      this.timeout = var2;
      this.tag = var4;
   }

   private fun createProximityScreenWakeLock(): WakeLock? {
      if (!this.powerManager.isWakeLockLevelSupported(32)) {
         return null;
      } else {
         val var1: WakeLock = this.powerManager.newWakeLock(32, this.tag);
         var1.setReferenceCounted(false);
         return var1;
      }
   }

   public override fun acquire() {
      if (this.systemWakeLock == null) {
         val var1: WakeLock = this.createProximityScreenWakeLock();
         this.systemWakeLock = var1;
         if (var1 != null) {
            var1.acquire(this.timeout);
         }
      }
   }

   public override fun release() {
      if (this.systemWakeLock != null) {
         this.systemWakeLock.release();
      }

      this.systemWakeLock = null;
   }
}
