package com.discord.metric_monitor

import com.discord.logging.Log
import kotlin.jvm.internal.q

public object MonitoringAgent {
   internal final var metricLogger: ((MetricEvent) -> Unit)?

   public fun increment(metric: MetricEvent) {
      q.h(var1, "metric");
      if (metricLogger == null) {
         Log.w$default(Log.INSTANCE, "Metric Monitor", "Attempting to increment metric before logger initialized", null, 4, null);
      } else if (metricLogger != null) {
         metricLogger.invoke(var1);
      }
   }
}
