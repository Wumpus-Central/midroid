package com.discord.jank_stats

import B9.s
import com.discord.codegen.NativeJankStatsModuleSpec
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.WritableMap

public class JankStatsModule(reactContext: ReactApplicationContext) : NativeJankStatsModuleSpec(var1) {
   public override fun requestReport(): WritableMap {
      val var1: JankReport = JankStatsAggregator.issueJankReport$default(JankStatsAggregator.INSTANCE, null, 1, null);
      return NativeMapExtensionsKt.nativeMapOf(s.a("totalFrameCount", var1.getNumFrames()), s.a("jankFrameCount", var1.getNumJankFrames()));
   }

   public override fun setJankHeuristicMultiplier(jankHeuristicMultiplier: Double) {
      JankStatsAggregator.INSTANCE.setJankHeuristicMultiplier((float)var1);
   }

   public override fun startTracking() {
      JankStatsAggregator.INSTANCE.enableTracking();
   }

   public override fun stopTracking() {
      JankStatsAggregator.INSTANCE.disableTracking();
   }
}
