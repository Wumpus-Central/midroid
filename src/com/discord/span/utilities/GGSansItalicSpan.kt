package com.discord.span.utilities

import android.content.Context
import android.graphics.Paint
import android.graphics.Typeface
import android.text.TextPaint
import android.text.style.StyleSpan
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFont.Companion
import k7.c
import k7.d

public class GGSansItalicSpan(context: Context) : StyleSpan(2) {
   private final val context: Context

   init {
      this.context = var1;
   }

   private fun apply(paint: Paint, fallback: () -> Unit) {
      val var6: Companion = DiscordFont.Companion;
      var var5: DiscordFont = DiscordFont.Companion.fromTypeface(var1.getTypeface());
      var var3: Typeface = null;
      if (var5 != null) {
         var5 = Companion.findByStyle$default(var6, var5.getWeight(), true, false, 4, null);
         var3 = null;
         if (var5 != null) {
            var3 = var5.typeface(this.context);
         }
      }

      if (var3 != null) {
         var1.setTypeface(var3);
      } else {
         var2.invoke();
      }
   }

   @JvmStatic
   fun `updateDrawState$lambda$0`(var0: GGSansItalicSpan, var1: TextPaint): Unit {
      var0.updateDrawState(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `updateMeasureState$lambda$1`(var0: GGSansItalicSpan, var1: TextPaint): Unit {
      var0.updateMeasureState(var1);
      return Unit.a;
   }

   public open fun updateDrawState(ds: TextPaint) {
      this.apply(var1, new d(this, var1));
   }

   public open fun updateMeasureState(paint: TextPaint) {
      this.apply(var1, new c(this, var1));
   }
}
