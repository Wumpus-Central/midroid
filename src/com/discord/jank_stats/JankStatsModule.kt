package com.discord.jank_stats

import ch.w
import com.discord.codegen.NativeJankStatsSpec
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q

public class JankStatsModule(reactContext: ReactApplicationContext) : NativeJankStatsSpec {
   init {
      q.h(var1, "reactContext");
      super(var1);
   }

   public override fun requestReport(): WritableMap {
      val var1: JankReport = JankStatsAggregator.issueJankReport$default(JankStatsAggregator.INSTANCE, null, 1, null);
      return NativeMapExtensionsKt.nativeMapOf(w.a("totalFrameCount", var1.getNumFrames()), w.a("jankFrameCount", var1.getNumJankFrames()));
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

   public companion object {
      public const val NAME: String
   }
}
