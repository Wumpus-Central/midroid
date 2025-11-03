package com.discord.mobile_voice_overlay.utils

import com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData
import com.discord.mobile_voice_overlay.views.OverlayView
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension
import u8.a
import u8.b
import u8.c

@SourceDebugExtension(["SMAP\nOverlayViewProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlayViewProvider.kt\ncom/discord/mobile_voice_overlay/utils/OverlayViewProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"])
internal class OverlayViewProvider<T extends OverlayView>(initializer: (OverlayViewProvider<Any>) -> Any) {
   private final val initializer: (OverlayViewProvider<Any>) -> Any
   private final lateinit var assets: MobileVoiceOverlayAssets
   private final var view: Any?
   private final var data: MobileVoiceOverlayData?

   init {
      this.initializer = var1;
   }

   private fun ensureView(): Any {
      if (this.view != null) {
         return this.view;
      } else {
         val var3: OverlayView = this.initializer.invoke(this) as OverlayView;
         var var4: MobileVoiceOverlayAssets = this.assets;
         if (this.assets == null) {
            Intrinsics.throwUninitializedPropertyAccessException("assets");
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
      var0.removeFromWindowManager();
      return Unit.a;
   }

   @JvmStatic
   fun `setAssets$lambda$1`(var0: MobileVoiceOverlayAssets, var1: OverlayView): Unit {
      var1.setAssets(var0);
      return Unit.a;
   }

   @JvmStatic
   fun `setData$lambda$2`(var0: MobileVoiceOverlayData, var1: OverlayView): Unit {
      var1.setData(var0);
      return Unit.a;
   }

   private fun withViewOptional(operation: (Any) -> Unit) {
      if (this.view != null) {
         var1.invoke(this.view);
      }
   }

   public fun isInOverlay(): Boolean {
      return this.view != null;
   }

   public fun removeViewFromOverlay() {
      this.withViewOptional(new a());
      this.view = null;
   }

   public fun setAssets(assets: MobileVoiceOverlayAssets) {
      this.assets = var1;
      this.withViewOptional(new c(var1));
   }

   public fun setData(data: MobileVoiceOverlayData) {
      this.data = var1;
      this.withViewOptional(new b(var1));
   }

   public fun showViewOnOverlay() {
      this.ensureView();
   }

   public fun withView(operation: (Any) -> Unit) {
      var1.invoke(this.ensureView());
   }
}
