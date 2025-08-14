package com.discord.blur

import android.content.Context
import android.view.ViewGroup
import com.discord.blur.BlurViewAPI.Target
import com.facebook.react.views.view.ReactViewGroup

internal abstract class BlurViewTargetBase : ReactViewGroup, BlurViewAPI.Target {
   private final var blurTargetNativeId: String

   private final val self: Target
      private final get() {
         return this;
      }


   public open val viewRef: ViewGroup
      public open get() {
         return this;
      }


   open fun BlurViewTargetBase(var1: Context, var2: java.lang.String) {
      super(var1);
      this.blurTargetNativeId = var2;
      BlurViewTargetRegistry.INSTANCE.add(var2, this.getSelf());
   }

   protected open fun onAttachedToWindow() {
      super.onAttachedToWindow();
      BlurViewTargetRegistry.INSTANCE.add(this.blurTargetNativeId, this.getSelf());
   }

   protected open fun onDetachedFromWindow() {
      super.onDetachedFromWindow();
      BlurViewTargetRegistry.INSTANCE.remove(this.blurTargetNativeId);
   }

   public override fun setBlurTargetNativeId(nativeId: String) {
      if (!(this.blurTargetNativeId == var1)) {
         this.blurTargetNativeId = var1;
         BlurViewTargetRegistry.INSTANCE.add(var1, this.getSelf());
      }
   }
}
