package com.discord.mobile_voice_overlay.utils

import F1.a
import F1.b
import F1.c
import com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData
import com.discord.mobile_voice_overlay.views.OverlayView
import kotlin.jvm.internal.q

internal class OverlayViewProvider<T extends OverlayView>(initializer: (OverlayViewProvider<Any>) -> Any) {
   private final val initializer: (OverlayViewProvider<Any>) -> Any
   private final lateinit var assets: MobileVoiceOverlayAssets
   private final var view: Any?
   private final var data: MobileVoiceOverlayData?

   init {
      q.h(var1, "initializer");
      super();
      this.initializer = var1;
   }

   private fun ensureView(): Any {
      if (this.view != null) {
         return this.view;
      } else {
         val var3: OverlayView = this.initializer.invoke(this) as OverlayView;
         var var4: MobileVoiceOverlayAssets = this.assets;
         if (this.assets == null) {
            q.y("assets");
            var4 = null;
         }

         var3.setAssets(var4);
         var3.initializeWithWindowManager();
         if (this.data != null) {
            var3.setData(this.data);
         }

         this.view = (T)var3;
         return (T)var3;
      }
   }

   @JvmStatic
   fun `removeViewFromOverlay$lambda$0`(var0: OverlayView): Unit {
      q.h(var0, "v");
      var0.removeFromWindowManager();
      return Unit.a;
   }

   @JvmStatic
   fun `setAssets$lambda$1`(var0: MobileVoiceOverlayAssets, var1: OverlayView): Unit {
      q.h(var1, "view");
      var1.setAssets(var0);
      return Unit.a;
   }

   @JvmStatic
   fun `setData$lambda$2`(var0: MobileVoiceOverlayData, var1: OverlayView): Unit {
      q.h(var1, "view");
      var1.setData(var0);
      return Unit.a;
   }

   private fun withViewOptional(operation: (Any) -> Unit) {
      if (this.view != null) {
         var1.invoke(this.view);
      }
   }

   public fun isInOverlay(): Boolean {
      val var1: Boolean;
      if (this.view != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public fun removeViewFromOverlay() {
      this.withViewOptional(new a());
      this.view = null;
   }

   public fun setAssets(assets: MobileVoiceOverlayAssets) {
      q.h(var1, "assets");
      this.assets = var1;
      this.withViewOptional(new c(var1));
   }

   public fun setData(data: MobileVoiceOverlayData) {
      q.h(var1, "data");
      this.data = var1;
      this.withViewOptional(new b(var1));
   }

   public fun showViewOnOverlay() {
      this.ensureView();
   }

   public fun withView(operation: (Any) -> Unit) {
      q.h(var1, "operation");
      var1.invoke(this.ensureView());
   }
}
