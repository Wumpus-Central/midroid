package com.discord.metric_monitor

import B9.s
import P1.a
import com.discord.codegen.NativeMetricMonitorModuleSpec
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.ReactApplicationContext

public class MetricMonitorModule(reactContext: ReactApplicationContext) : NativeMetricMonitorModuleSpec(var1) {
   private final val reactEvents: ReactEvents = new ReactEvents(s.a("logMetric", MetricEvent::class))

   init {
      MonitoringAgent.INSTANCE.setMetricLogger$metric_monitor_release(new a(this, var1));
   }

   @JvmStatic
   fun `_init_$lambda$0`(var0: MetricMonitorModule, var1: ReactApplicationContext, var2: MetricEvent): Unit {
      var0.reactEvents.emitModuleEvent(var1, var2);
      return Unit.a;
   }

   public override fun addListener(eventType: String) {
   }

   public override fun removeListeners(count: Double) {
   }

   public companion object {
      private const val LOG_METRIC: String
   }
}
