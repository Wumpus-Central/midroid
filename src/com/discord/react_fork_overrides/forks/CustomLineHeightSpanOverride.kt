package com.discord.react_fork_overrides.forks

import android.graphics.Paint.FontMetricsInt
import com.facebook.react.views.text.internal.span.CustomLineHeightSpan

internal object CustomLineHeightSpanOverride {
   @JvmStatic
   fun `override$lambda$0`(var0: Array<Any>) {
      var var2: Any = ((Object[])var0)[0];
      var0 = ((Object[])var0)[1];
      val var1: CustomLineHeightSpanOverride = INSTANCE;
      var2 = var2 as FontMetricsInt;
      var1.overrideLineHeight((FontMetricsInt)var2, var0 as Int);
   }

   private fun overrideLineHeight(fm: FontMetricsInt, mHeight: Int) {
      if (var2 >= var1.bottom - var1.top) {
         val var3: Double = (var2 - (-var1.top + var1.bottom)) / 2.0F;
         var1.top = var1.top - (int)Math.ceil((double)((float)(var2 - (-var1.top + var1.bottom)) / 2.0F));
         var2 = var1.bottom + (int)Math.floor(var3);
         var1.bottom = var2;
         var1.ascent = var1.top;
         var1.descent = var2;
      } else {
         var var9: Int = var1.descent - var1.ascent;
         if (var1.descent - var1.ascent <= 0) {
            return;
         }

         var9 = O9.a.c((float)var1.descent * ((float)var2 * 0.75F / (float)var9));
         var1.descent = var9;
         var1.ascent = var9 - var2;
      }
   }

   public fun override() {
      CustomLineHeightSpan.Companion.setChooseHeightOverride(new p());
   }
}
