package com.discord.tti_measurement_view

import android.annotation.SuppressLint
import android.view.View
import com.facebook.react.uimanager.ThemedReactContext
import kotlin.jvm.internal.q

@SuppressLint(["ViewConstructor"])
internal class TTIMeasurementView(context: ThemedReactContext) : View {
   private final var onMeasurementListener: ((TTIMeasurementView, Double) -> Unit)?
   private final var measurementSent: Boolean

   init {
      q.h(var1, "context");
      super(var1);
   }

   private fun registerForNextDraw() {
      if (!this.measurementSent) {
         this.measurementSent = true;
         FirstDrawDoneListener.registerForNextDraw(this, new b(this));
      }
   }

   @JvmStatic
   fun `registerForNextDraw$lambda$0`(var0: TTIMeasurementView) {
      q.h(var0, "this$0");
      if (var0.onMeasurementListener != null) {
         var0.onMeasurementListener.invoke(var0, (double)System.currentTimeMillis());
      }
   }

   public fun setOnMeasurementListener(listener: (TTIMeasurementView, Double) -> Unit) {
      q.h(var1, "listener");
      this.onMeasurementListener = var1;
      this.registerForNextDraw();
   }
}
