package com.discord.tti_measurement_view

import android.annotation.SuppressLint
import android.view.View
import com.facebook.react.uimanager.ThemedReactContext

@SuppressLint(["ViewConstructor"])
public class TTIMeasurementView(context: ThemedReactContext) : View(var1) {
   public final var measurementListener: ((TTIMeasurementView, Double) -> Unit)?
   public final var measurementSent: Boolean

   private fun registerDrawListener() {
      FirstDrawDoneListener.registerForNextDraw(this, new b(this));
   }

   @JvmStatic
   fun `registerDrawListener$lambda$0`(var0: TTIMeasurementView) {
      if (!var0.measurementSent) {
         var0.measurementSent = true;
         if (var0.measurementListener != null) {
            var0.measurementListener.invoke(var0, (double)System.currentTimeMillis());
         }
      }
   }

   public fun setOnMeasurementListener(listener: (TTIMeasurementView, Double) -> Unit) {
      this.measurementListener = var1;
      this.registerDrawListener();
   }
}
