package com.discord.tti_measurement_view

import android.annotation.SuppressLint
import android.view.View
import com.facebook.react.uimanager.ThemedReactContext
import kotlin.jvm.internal.r

@SuppressLint(["ViewConstructor"])
internal class TTIMeasurementView(context: ThemedReactContext) : View {
   private final var onMeasurementListener: ((TTIMeasurementView, Double) -> Unit)?
   private final var measurementSent: Boolean

   init {
      r.h(var1, "context");
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
      if (var0.onMeasurementListener != null) {
         var0.onMeasurementListener.invoke(var0, (double)System.currentTimeMillis());
      }
   }

   public fun setOnMeasurementListener(listener: (TTIMeasurementView, Double) -> Unit) {
      r.h(var1, "listener");
      this.onMeasurementListener = var1;
      this.registerForNextDraw();
   }
}
