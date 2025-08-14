package com.discord.tti_measurement_view

import android.annotation.SuppressLint
import android.view.View
import com.facebook.react.uimanager.ThemedReactContext

@SuppressLint(["ViewConstructor"])
internal class TTIMeasurementView(context: ThemedReactContext) : View(var1) {
   private final var onMeasurementListener: ((TTIMeasurementView, Double) -> Unit)?
   private final var measurementSent: Boolean

   private fun registerForNextDraw() {
      if (!this.measurementSent) {
         this.measurementSent = true;
         FirstDrawDoneListener.registerForNextDraw(this, new b(this));
      }
   }

   @JvmStatic
   fun `registerForNextDraw$lambda$0`(var0: TTIMeasurementView) {
      if (var0.onMeasurementListener != null) {
         var0.onMeasurementListener.invoke(var0, (double)System.currentTimeMillis());
      }
   }

   public fun setOnMeasurementListener(listener: (TTIMeasurementView, Double) -> Unit) {
      this.onMeasurementListener = var1;
      this.registerForNextDraw();
   }
}
