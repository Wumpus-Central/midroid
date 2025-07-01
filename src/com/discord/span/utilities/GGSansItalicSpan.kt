package com.discord.span.utilities

import android.content.Context
import android.graphics.Paint
import android.graphics.Typeface
import android.text.TextPaint
import android.text.style.StyleSpan
import com.discord.fonts.DiscordFont
import h2.c
import h2.d
import kotlin.jvm.internal.q

public class GGSansItalicSpan(context: Context) : StyleSpan {
   private final val context: Context

   init {
      q.h(var1, "context");
      super(2);
      this.context = var1;
   }

   private fun apply(paint: Paint, fallback: () -> Unit) {
      val var5: DiscordFont.Companion = DiscordFont.Companion;
      val var6: DiscordFont = DiscordFont.Companion.fromTypeface(var1.getTypeface());
      var var3: Typeface = null;
      if (var6 != null) {
         val var7: DiscordFont = DiscordFont.Companion.findByStyle$default(var5, var6.getWeight(), true, false, 4, null);
         var3 = null;
         if (var7 != null) {
            var3 = var7.typeface(this.context);
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
      q.h(var1, "ds");
      this.apply(var1, new d(this, var1));
   }

   public open fun updateMeasureState(paint: TextPaint) {
      q.h(var1, "paint");
      this.apply(var1, new c(this, var1));
   }
}
