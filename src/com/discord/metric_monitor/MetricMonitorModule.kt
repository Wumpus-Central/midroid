package com.discord.metric_monitor

import A9.s
import Q1.a
import com.discord.codegen.NativeMetricMonitorModuleSpec
import com.discord.reactevents.ReactEvents
import com.facebook.react.bridge.ReactApplicationContext
import kotlin.jvm.internal.H
import kotlin.jvm.internal.r

public class MetricMonitorModule(reactContext: ReactApplicationContext) : NativeMetricMonitorModuleSpec {
   private final val reactEvents: ReactEvents

   init {
      r.h(var1, "reactContext");
      super(var1);
      this.reactEvents = new ReactEvents(s.a("logMetric", H.b(MetricEvent.class)));
      MonitoringAgent.INSTANCE.setMetricLogger$metric_monitor_release(new a(this, var1));
   }

   @JvmStatic
   fun `_init_$lambda$0`(var0: MetricMonitorModule, var1: ReactApplicationContext, var2: MetricEvent): Unit {
      r.h(var2, "metric");
      var0.reactEvents.emitModuleEvent(var1, var2);
      return Unit.a;
   }

   public override fun addListener(eventType: String) {
      r.h(var1, "eventType");
   }

   public override fun removeListeners(count: Double) {
   }

   public companion object {
      private const val LOG_METRIC: String
   }
}
