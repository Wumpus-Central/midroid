package com.discord.blur

import android.annotation.SuppressLint
import android.content.Context
import android.widget.FrameLayout
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.r

@SuppressLint(["ViewConstructor"])
internal class BlurViewHardwareAccelerated(context: Context, blurTargetNativeId: String, blurTint: Int, blurTintIOSParityCompensation: Int, blurAmount: Float)
   : FrameLayout,
   BlurViewAPI {
   private final var blurAmount: Float
   private final val blurTargetChangeListener: () -> Unit
   private final var blurTargetNativeId: String
   private final var blurTint: Int
   private final var blurTintIOSParityCompensation: Int
   private final var blurViewHeight: Int
   private final var blurViewLocation: IntArray
   private final var blurViewPropertiesDirty: Boolean
   private final var blurViewWidth: Int

   init {
      r.h(var1, "context");
      r.h(var2, "blurTargetNativeId");
      super(var1);
      this.blurTargetNativeId = var2;
      this.blurTint = var3;
      this.blurTintIOSParityCompensation = var4;
      this.blurAmount = var5;
      this.blurViewPropertiesDirty = true;
      this.blurViewWidth = -1;
      this.blurViewHeight = -1;
      this.blurViewLocation = new int[2];
      val var6: Function0 = new Function0<Unit>(this) {
         final BlurViewHardwareAccelerated this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final void invoke() {
            BlurViewHardwareAccelerated.access$maybeUpdate(this.this$0);
         }
      };
      this.blurTargetChangeListener = var6;
      BlurView.Companion.updateListener$blur_release(var6, true, new Function0<Unit>(this) {
         final BlurViewHardwareAccelerated this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final void invoke() {
            BlurViewHardwareAccelerated.access$maybeUpdate(this.this$0);
         }
      });
   }

   private fun maybeUpdate() {
      val var1: Boolean;
      if (this.blurViewWidth != -1 && this.blurViewHeight != -1) {
         var1 = false;
      } else {
         var1 = true;
      }

      val var2: BlurViewAPI.Target = BlurViewTargetRegistry.INSTANCE.get(this.blurTargetNativeId);
      if (var2 != null && !var1 && this.blurViewPropertiesDirty) {
         var2.setBlurAmount(this.getId(), this.blurAmount);
         var2.addBlurRect(this.getId(), this.blurViewLocation[0], this.blurViewLocation[1], this.blurViewWidth, this.blurViewHeight);
         this.setBackgroundColor(BlurView.Companion.mapBlurTint$blur_release(this.blurTintIOSParityCompensation, this.blurTint, this.blurAmount));
         this.blurViewPropertiesDirty = false;
      }
   }

   protected open fun onAttachedToWindow() {
      super.onAttachedToWindow();
      BlurView.Companion.updateListener$blur_release(this.blurTargetChangeListener, true, new Function0<Unit>(this) {
         final BlurViewHardwareAccelerated this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final void invoke() {
            BlurViewHardwareAccelerated.access$maybeUpdate(this.this$0);
         }
      });
   }

   protected open fun onDetachedFromWindow() {
      super.onDetachedFromWindow();
      BlurView.Companion.updateListener$blur_release(this.blurTargetChangeListener, false, new Function0<Unit>(this) {
         final BlurViewHardwareAccelerated this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final void invoke() {
            BlurViewHardwareAccelerated.access$maybeUpdate(this.this$0);
         }
      });
      val var1: BlurViewAPI.Target = BlurViewTargetRegistry.INSTANCE.get(this.blurTargetNativeId);
      if (var1 != null) {
         var1.removeBlurRect(this.getId());
      }
   }

   protected open fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
      super.onLayout(var1, var2, var3, var4, var5);
      val var7: Boolean;
      if (this.blurViewWidth == this.getWidth() && this.blurViewHeight == this.getHeight()) {
         var7 = false;
      } else {
         var7 = true;
      }

      var3 = this.blurViewLocation[0];
      var4 = this.blurViewLocation[1];
      this.getLocationInWindow(this.blurViewLocation);
      if (this.blurViewLocation[0] != var3 || this.blurViewLocation[1] != var4 || var7) {
         this.blurViewWidth = this.getWidth();
         this.blurViewHeight = this.getHeight();
         this.blurViewPropertiesDirty = true;
      }

      this.maybeUpdate();
   }

   public override fun setBlurAmount(rectId: Int, blurAmount: Float) {
      val var3: Boolean;
      if (this.blurAmount == var2) {
         var3 = true;
      } else {
         var3 = false;
      }

      if (!var3) {
         this.blurAmount = var2;
         this.blurViewPropertiesDirty = true;
      }

      this.maybeUpdate();
   }

   public override fun setBlurTargetNativeId(nativeId: String) {
      r.h(var1, "nativeId");
      if (!r.c(this.blurTargetNativeId, var1)) {
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
}
