package com.discord.tti_measurement_view

import com.discord.reactevents.ReactEvents
import com.discord.tti_measurement_view.events.OnMeasurementEvent
import com.facebook.react.module.annotations.ReactModule
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext
import com.facebook.react.viewmanagers.DCDTTIMeasurementViewManagerDelegate
import com.facebook.react.viewmanagers.DCDTTIMeasurementViewManagerInterface
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.G
import kotlin.jvm.internal.q
import l8.w

@ReactModule(name = "DCDTTIMeasurementView")
internal class TTIMeasurementViewManager : SimpleViewManager<TTIMeasurementView>, DCDTTIMeasurementViewManagerInterface<TTIMeasurementView> {
   private final val reactEvents: ReactEvents = new ReactEvents(w.a("onMeasurement", G.b(OnMeasurementEvent.class)))

   private fun onMeasurement(view: TTIMeasurementView, timestamp: Double) {
      this.reactEvents.emitEvent(var1, new OnMeasurementEvent(var2));
   }

   protected open fun addEventEmitters(reactContext: ThemedReactContext, view: TTIMeasurementView) {
      q.h(var1, "reactContext");
      q.h(var2, "view");
      super.addEventEmitters(var1, var2);
      var2.setOnMeasurementListener(new Function2(this) {
         {
            super(2, var1, TTIMeasurementViewManager::class.java, "onMeasurement", "onMeasurement(Lcom/discord/tti_measurement_view/TTIMeasurementView;D)V", 0);
         }

         public final void invoke(TTIMeasurementView var1, double var2) {
            q.h(var1, "p0");
            TTIMeasurementViewManager.access$onMeasurement(super.receiver as TTIMeasurementViewManager, var1, var2);
         }
      });
   }

   protected open fun createViewInstance(reactContext: ThemedReactContext): TTIMeasurementView {
      q.h(var1, "reactContext");
      return new TTIMeasurementView(var1);
   }

   protected open fun getDelegate(): DCDTTIMeasurementViewManagerDelegate<TTIMeasurementView, TTIMeasurementViewManager> {
      return new DCDTTIMeasurementViewManagerDelegate(this);
   }

   public open fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
      return this.reactEvents.exportEventConstants();
   }

   public open fun getName(): String {
      return "DCDTTIMeasurementView";
   }

   public companion object {
      internal const val NAME: String
   }
}
