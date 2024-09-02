package com.discord.blur

import android.annotation.SuppressLint
import android.content.Context
import kotlin.jvm.internal.q

@SuppressLint(["ViewConstructor"])
internal class BlurViewTarget(context: Context, blurTargetNativeId: String) : BlurViewTargetBase {
   init {
      q.h(var1, "context");
      q.h(var2, "blurTargetNativeId");
      super(var1, var2);
   }

   public override fun addBlurRect(rectId: Int, windowX: Int, windowY: Int, width: Int, height: Int) {
   }

   public override fun removeBlurRect(rectId: Int) {
   }

   public override fun setBlurAmount(rectId: Int, blurAmount: Float) {
   }
}
