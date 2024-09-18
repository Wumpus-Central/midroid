package com.discord.mobile_voice_overlay.utils

import com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData
import com.discord.mobile_voice_overlay.views.OverlayView
import kotlin.jvm.functions.Function1
import kotlin.jvm.internal.q

internal class OverlayViewProvider<T extends OverlayView>(initializer: (OverlayViewProvider<Any>) -> Any) {
   private final lateinit var assets: MobileVoiceOverlayAssets
   private final var data: MobileVoiceOverlayData?
   private final val initializer: (OverlayViewProvider<Any>) -> Any
   private final var view: Any?

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
      this.withViewOptional(<unrepresentable>.INSTANCE);
      this.view = null;
   }

   public fun setAssets(assets: MobileVoiceOverlayAssets) {
      q.h(var1, "assets");
      this.assets = var1;
      this.withViewOptional(new Function1(var1) {
         final MobileVoiceOverlayAssets $assets;

         {
            super(1);
            this.$assets = var1;
         }

         public final void invoke(T var1) {
            q.h(var1, "view");
            var1.setAssets(this.$assets);
         }
      });
   }

   public fun setData(data: MobileVoiceOverlayData) {
      q.h(var1, "data");
      this.data = var1;
      this.withViewOptional(new Function1(var1) {
         final MobileVoiceOverlayData $data;

         {
            super(1);
            this.$data = var1;
         }

         public final void invoke(T var1) {
            q.h(var1, "view");
            var1.setData(this.$data);
         }
      });
   }

   public fun showViewOnOverlay() {
      this.ensureView();
   }

   public fun withView(operation: (Any) -> Unit) {
      q.h(var1, "operation");
      var1.invoke(this.ensureView());
   }
}
