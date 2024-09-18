package com.discord.cpu_pnq

import com.discord.misc.utilities.threading.ThreadUtilsKt
import gh.a

public object CPUPnQManager {
   private final var backgrounded: Boolean
   private final var cpuPercentage: Double
   private final var isEnabled: Boolean
   private final var wasteThread: Thread?

   private fun wasteCycles() {
      if (wasteThread == null) {
         wasteThread = a.b(true, false, null, null, 0, <unrepresentable>.INSTANCE, 30, null);
      }
   }

   public fun enable(cpuPercentage: Double) {
      cpuPercentage = Math.min(var1, 100.0);
      isEnabled = true;
      this.wasteCycles();
   }

   public fun hangNativeThread(durationMs: Double) {
      if (ThreadUtilsKt.isOnMainThread()) {
         Thread.sleep((long)var1);
      } else {
         ThreadUtilsKt.getUiHandler().post(new Runnable(var1) {
            final double $durationMs$inlined;

            {
               this.$durationMs$inlined = var1;
            }

            @Override
            public final void run() {
               Thread.sleep((long)this.$durationMs$inlined);
            }
         });
      }
   }

   public fun initialize() {
   }

   public fun onPause() {
      backgrounded = true;
   }

   public fun onResume() {
      backgrounded = false;
      if (isEnabled) {
         this.wasteCycles();
      }
   }
}
