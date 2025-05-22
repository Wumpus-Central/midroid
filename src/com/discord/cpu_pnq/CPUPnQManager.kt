package com.discord.cpu_pnq

import com.discord.misc.utilities.threading.ThreadUtilsKt

public object CPUPnQManager {
   private final var cpuPercentage: Double
   private final var isEnabled: Boolean
   private final var backgrounded: Boolean
   private final var wasteThread: Thread?

   private fun wasteCycles() {
      if (wasteThread == null) {
         wasteThread = W8.a.b(true, false, null, null, 0, new a(), 30, null);
      }
   }

   @JvmStatic
   fun `wasteCycles$lambda$1`(): Unit {
      while (!backgrounded) {
         val var2: Int = (int)(cpuPercentage / 100.0 * 1000000000);
         val var3: Long = (long)(1000 - cpuPercentage * 10);
         val var5: Long = System.nanoTime();

         while (System.nanoTime() - var5 < var2) {
         }

         try {
            Thread.sleep(var3);
         } catch (var8: InterruptedException) {
            break;
         }
      }

      wasteThread = null;
      return Unit.a;
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
