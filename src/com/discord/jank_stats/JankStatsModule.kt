package com.discord.jank_stats

import com.discord.codegen.NativeJankStatsSpec
import com.discord.react.utilities.NativeMapExtensionsKt
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.WritableMap
import eh.w
import kotlin.jvm.internal.r

public class JankStatsModule(reactContext: ReactApplicationContext) : NativeJankStatsSpec {
   init {
      r.h(var1, "reactContext");
      super(var1);
   }

   public open fun requestReport(): WritableMap {
      val var1: JankReport = JankStatsAggregator.issueJankReport$default(JankStatsAggregator.INSTANCE, null, 1, null);
      return NativeMapExtensionsKt.nativeMapOf(new Pair[]{w.a("totalFrameCount", var1.getNumFrames()), w.a("jankFrameCount", var1.getNumJankFrames())});
   }

   public open fun setJankHeuristicMultiplier(jankHeuristicMultiplier: Double) {
      JankStatsAggregator.INSTANCE.setJankHeuristicMultiplier((float)var1);
   }

   public open fun startTracking() {
      JankStatsAggregator.INSTANCE.enableTracking();
   }

   public open fun stopTracking() {
      JankStatsAggregator.INSTANCE.disableTracking();
   }

   public companion object {
      public const val NAME: String
   }
}
