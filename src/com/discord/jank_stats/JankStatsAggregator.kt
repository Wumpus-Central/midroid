package com.discord.jank_stats

import android.view.Window
import androidx.metrics.performance.FrameData
import androidx.metrics.performance.JankStats
import androidx.metrics.performance.JankStats.OnFrameListener
import com.discord.crash_reporting.CrashReporting
import com.discord.logging.Log
import kotlin.jvm.internal.q
import u3.a

public object JankStatsAggregator {
   private final var jankStats: JankStats?
   private final val listener: OnFrameListener = new a()
   private final var numFrames: Int
   private final var numJankFrames: Int

   @JvmStatic
   fun `listener$lambda$0`(var0: FrameData) {
      q.h(var0, "frameData");
      if (numFrames != Integer.MAX_VALUE && numJankFrames != Integer.MAX_VALUE) {
         numFrames += 1;
         if (var0.d()) {
            numJankFrames++;
         }
      } else {
         INSTANCE.disableTracking();
         Log.e$default(Log.INSTANCE, "JankStatsAggregator", "Frame count reached unexpected max int", null, 4, null);
         CrashReporting.INSTANCE.captureMessage("JankStatsAggregator", "Frame count reached unexpected max int", CrashReporting.ErrorLevel.WARNING);
      }
   }

   public fun disableTracking() {
      val var1: JankStats = jankStats;
      if (jankStats != null) {
         q.e(jankStats);
         var1.d(false);
         Log.i$default(Log.INSTANCE, "JankStatsAggregator", "Jank tracking disabled.", null, 4, null);
      }
   }

   public fun enableTracking() {
      val var1: JankStats = jankStats;
      if (jankStats != null) {
         q.e(jankStats);
         var1.d(true);
         Log.i$default(Log.INSTANCE, "JankStatsAggregator", "Jank tracking enabled.", null, 4, null);
      }
   }

   public fun initialize(window: Window) {
      label13: {
         q.h(var1, "window");
         synchronized (this){} // $VF: monitorenter 

         try {
            jankStats = JankStats.f.a(var1, listener);
         } catch (var2: java.lang.Throwable) {
            // $VF: monitorexit
         }

         // $VF: monitorexit
      }
   }

   public fun issueJankReport(reason: String = ""): JankReport {
      q.h(var1, "reason");
      val var5: Int = numFrames;
      val var4: Int = numJankFrames;
      numFrames = 0;
      numJankFrames = 0;
      val var6: Log = Log.INSTANCE;
      val var2: Double;
      if (var5 > 0) {
         var2 = (double)var4 / var5 * 100.0;
      } else {
         var2 = 0.0;
      }

      val var7: StringBuilder = new StringBuilder();
      var7.append("*** Jank Report (");
      var7.append(var1);
      var7.append("), totalFrames = ");
      var7.append(var5);
      var7.append(", jankFrames = ");
      var7.append(var4);
      var7.append(", jank % = ");
      var7.append(var2);
      Log.i$default(var6, "JankStatsAggregator", var7.toString(), null, 4, null);
      return new JankReport(var5, var4);
   }

   public fun setJankHeuristicMultiplier(jankHeuristicMultiplier: Float) {
      val var2: JankStats = jankStats;
      q.e(jankStats);
      var2.c(var1);
      val var3: Log = Log.INSTANCE;
      val var4: StringBuilder = new StringBuilder();
      var4.append("Jank heuristic multiplier set to ");
      var4.append(var1);
      var4.append(".");
      Log.i$default(var3, "JankStatsAggregator", var4.toString(), null, 4, null);
   }
}
