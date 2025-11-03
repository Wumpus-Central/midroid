package com.discord.react_fork_overrides.forks

import android.graphics.Paint.FontMetricsInt
import com.facebook.react.views.text.internal.span.CustomLineHeightSpan

internal object CustomLineHeightSpanOverride {
   @JvmStatic
   fun `override$lambda$0`(var0: Array<Any>) {
      var var1: Any = var0[0];
      val var2: Any = var0[1];
      val var3: CustomLineHeightSpanOverride = INSTANCE;
      var1 = var1 as FontMetricsInt;
      var3.overrideLineHeight((FontMetricsInt)var1, var2 as Int);
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
         val var11: Int = var1.descent - var1.ascent;
         if (var1.descent - var1.ascent > 0) {
            val var10: Int = xt.a.c((float)var1.descent * ((float)var2 * 0.75F / (float)var11));
            var1.descent = var10;
            var1.ascent = var10 - var2;
         }
      }
   }

   public fun override() {
      CustomLineHeightSpan.Companion.setChooseHeightOverride(new k());
   }
}
