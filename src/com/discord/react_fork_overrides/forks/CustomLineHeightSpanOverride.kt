package com.discord.react_fork_overrides.forks

import android.graphics.Paint.FontMetricsInt
import com.facebook.react.views.text.CustomLineHeightSpan
import kotlin.jvm.internal.r

internal object CustomLineHeightSpanOverride {
   @JvmStatic
   fun `override$lambda$0`(var0: Array<Any>) {
      r.g(var0, "(fm, mHeight)");
      var var2: Any = ((Object[])var0)[0];
      var0 = ((Object[])var0)[1];
      val var1: CustomLineHeightSpanOverride = INSTANCE;
      r.f(var2, "null cannot be cast to non-null type android.graphics.Paint.FontMetricsInt");
      var2 = var2 as FontMetricsInt;
      r.f(var0, "null cannot be cast to non-null type kotlin.Int");
      var1.overrideLineHeight((FontMetricsInt)var2, var0 as Int);
   }

   private fun overrideLineHeight(fm: FontMetricsInt, mHeight: Int) {
      var var6: Boolean;
      if (var2 >= var1.bottom - var1.top) {
         var6 = 1;
      } else {
         var6 = 0;
      }

      if (var6) {
         val var3: Double = (var2 - (-var1.top + var1.bottom)) / 2.0F;
         var1.top = var1.top - (int)Math.ceil((double)((float)(var2 - (-var1.top + var1.bottom)) / 2.0F));
         var2 = var1.bottom + (int)Math.floor(var3);
         var1.bottom = var2;
         var1.ascent = var1.top;
         var1.descent = var2;
      } else {
         val var12: Int = var1.descent - var1.ascent;
         if (var1.descent - var1.ascent <= 0) {
            return;
         }

         var6 = sh.a.b((float)var1.descent * ((float)var2 * 0.75F / (float)var12));
         var1.descent = var6;
         var1.ascent = var6 - var2;
      }
   }

   public fun override() {
      CustomLineHeightSpan.chooseHeightOverride = new c();
   }
}
