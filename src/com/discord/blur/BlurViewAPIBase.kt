package com.discord.blur

internal interface BlurViewAPIBase {
   public abstract fun setBlurAmount(rectId: Int, blurAmount: Float) {
   }

   public abstract fun setBlurTargetNativeId(nativeId: String) {
   }
}
