package com.discord.span.utilities

import android.content.Context
import android.graphics.Paint
import android.text.TextPaint
import android.text.style.StyleSpan
import com.discord.fonts.DiscordFont
import g2.a
import g2.b

public class GGSansBoldSpan(context: Context) : StyleSpan(1) {
   private final val context: Context

   init {
      this.context = var1;
   }

   private fun apply(paint: Paint, fallback: () -> Unit) {
      val var4: DiscordFont.Companion = DiscordFont.Companion;
      var var3: DiscordFont = DiscordFont.Companion.fromTypeface(var1.getTypeface());
      if (var3 != null) {
         var3 = var4.findByStyle(DiscordFont.PrimaryBold.getWeight(), var3.getItalic(), var3.getMonospace());
      } else {
         var3 = null;
      }

      if (var3 != null) {
         var1.setTypeface(var3.typeface(this.context));
      } else {
         var2.invoke();
      }
   }

   @JvmStatic
   fun `updateDrawState$lambda$0`(var0: GGSansBoldSpan, var1: TextPaint): Unit {
      var0.updateDrawState(var1);
      return Unit.a;
   }

   @JvmStatic
   fun `updateMeasureState$lambda$1`(var0: GGSansBoldSpan, var1: TextPaint): Unit {
      var0.updateMeasureState(var1);
      return Unit.a;
   }

   public open fun updateDrawState(ds: TextPaint) {
      this.apply(var1, new a(this, var1));
   }

   public open fun updateMeasureState(paint: TextPaint) {
      this.apply(var1, new b(this, var1));
   }
}
