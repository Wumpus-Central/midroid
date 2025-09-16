package com.discord.blur

import android.annotation.SuppressLint
import android.content.Context
import android.view.ViewGroup
import com.discord.blur.BlurViewAPI.Target
import com.discord.theme.utils.ColorUtilsKt
import java.lang.ref.WeakReference

@SuppressLint(["ViewConstructor"])
internal class BlurView(context: Context, blurTargetNativeId: String, blurTint: Int, blurTintIOSParityCompensation: Int, blurAmount: Float) : eightbitlab.com.blurview.BlurView(
         var1
      ),
   BlurViewAPI {
   private final var blurTargetNativeId: String
   private final var blurTint: Int
   private final var blurTintIOSParityCompensation: Int
   private final var blurAmount: Float
   private final var blurEnabled: Boolean
   private final var blurViewPropertiesDirty: Boolean
   private final var blurTarget: WeakReference<Target>
   private final val blurTargetChangeListener: () -> Unit

   init {
      this.blurTargetNativeId = var2;
      this.blurTint = var3;
      this.blurTintIOSParityCompensation = var4;
      this.blurAmount = var5;
      this.blurEnabled = true;
      this.blurViewPropertiesDirty = true;
      this.blurTarget = new WeakReference<>(null);
      val var6: c = new c(this);
      this.blurTargetChangeListener = var6;
      Companion.updateListener$blur_release(var6, true, new d(this));
   }

   @JvmStatic
   fun `_init_$lambda$1`(var0: BlurView): Unit {
      var0.maybeUpdate();
      return Unit.a;
   }

   @JvmStatic
   fun `blurTargetChangeListener$lambda$0`(var0: BlurView): Unit {
      var0.maybeUpdate();
      return Unit.a;
   }

   private fun maybeUpdate() {
      var var1: BlurViewAPI.Target = BlurViewTargetRegistry.INSTANCE.get(this.blurTargetNativeId);
      if (var1 != null && this.blurViewPropertiesDirty) {
         if (!(this.blurTarget.get() == var1)) {
            this.blurTarget = new WeakReference<>(var1);
            this.setupWith(var1.getViewRef()).d(var1.getViewRef().getBackground());
         }

         this.maybeUpdateBlurEnabled();
         val var2: BlurView.Companion = Companion;
         this.setOverlayColor(Companion.mapBlurTint$blur_release(this.blurTintIOSParityCompensation, this.blurTint, this.blurAmount));
         this.setBlurRadius(BlurView.Companion.mapRadius$blur_release$default(var2, this.blurAmount, 0.0F, 0.0F, 6, null));
         var1 = this.blurTarget.get();
         if (var1 != null) {
            val var4: ViewGroup = var1.getViewRef();
            if (var4 != null) {
               var4.invalidate();
            }
         }

         this.invalidate();
         this.blurViewPropertiesDirty = false;
      }
   }

   private fun maybeUpdateBlurEnabled() {
      if (this.blurEnabled && this.blurAmount <= 0.0F) {
         this.blurEnabled = false;
         this.setBlurEnabled(false);
      } else if (!this.blurEnabled && this.blurAmount > 0.0F) {
         this.blurEnabled = true;
         this.setBlurEnabled(true);
      }
   }

   @JvmStatic
   fun `onAttachedToWindow$lambda$2`(var0: BlurView): Unit {
      var0.maybeUpdate();
      return Unit.a;
   }

   @JvmStatic
   fun `onDetachedFromWindow$lambda$3`(var0: BlurView): Unit {
      var0.maybeUpdate();
      return Unit.a;
   }

   protected open fun onAttachedToWindow() {
      super.onAttachedToWindow();
      Companion.updateListener$blur_release(this.blurTargetChangeListener, true, new b(this));
   }

   protected open fun onDetachedFromWindow() {
      super.onDetachedFromWindow();
      Companion.updateListener$blur_release(this.blurTargetChangeListener, false, new a(this));
   }

   public override fun setBlurAmount(rectId: Int, blurAmount: Float) {
      if (this.blurAmount != var2) {
         this.blurAmount = var2;
         this.blurViewPropertiesDirty = true;
      }

      this.maybeUpdate();
   }

   public override fun setBlurTargetNativeId(nativeId: String) {
      if (!(this.blurTargetNativeId == var1)) {
         this.blurTargetNativeId = var1;
         this.blurViewPropertiesDirty = true;
      }

      this.maybeUpdate();
   }

   public override fun setBlurTint(color: Int) {
      if (this.blurTint != var1) {
         this.blurTint = var1;
         this.blurViewPropertiesDirty = true;
      }

      this.maybeUpdate();
   }

   public override fun setBlurTintIOSParityCompensation(color: Int) {
      if (this.blurTintIOSParityCompensation != var1) {
         this.blurTintIOSParityCompensation = var1;
         this.blurViewPropertiesDirty = true;
      }

      this.maybeUpdate();
   }

   public companion object {
      internal fun mapBlurTint(blurAmountTint: Int, blurTint: Int, blurAmount: Float): Int {
         return y.c.g(var2, ColorUtilsKt.argbWithAdjustedAlpha(var1, var3));
      }

      internal fun mapRadius(radius: Float, maxRadius: Float = ..., minRadius: Float = ...): Float {
         return Math.max(var3, Math.min(1.0F, var1)) * var2;
      }

      internal fun updateListener(blurTargetChangeListener: () -> Unit, attached: Boolean, maybeUpdate: () -> Unit) {
         if (var2) {
            BlurViewTargetRegistry.INSTANCE.addChangeListener(var1);
         } else {
            BlurViewTargetRegistry.INSTANCE.removeChangeListener(var1);
         }

         if (var2) {
            var3.invoke();
         }
      }
   }
}
