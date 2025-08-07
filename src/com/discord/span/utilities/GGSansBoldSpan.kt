package com.discord.span.utilities

import android.content.Context
import android.graphics.Paint
import android.text.TextPaint
import android.text.style.StyleSpan
import com.discord.fonts.DiscordFont
import h2.a
import h2.b
import kotlin.jvm.internal.r

public class GGSansBoldSpan(context: Context) : StyleSpan {
   private final val context: Context

   init {
      r.h(var1, "context");
      super(1);
      this.context = var1;
   }

   private fun apply(paint: Paint, fallback: () -> Unit) {
      val var3: DiscordFont.Companion = DiscordFont.Companion;
      val var4: DiscordFont = DiscordFont.Companion.fromTypeface(var1.getTypeface());
      val var5: DiscordFont;
      if (var4 != null) {
         var5 = var3.findByStyle(DiscordFont.PrimaryBold.getWeight(), var4.getItalic(), var4.getMonospace());
      } else {
         var5 = null;
      }

      if (var5 != null) {
         var1.setTypeface(var5.typeface(this.context));
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
      r.h(var1, "ds");
      this.apply(var1, new a(this, var1));
   }

   public open fun updateMeasureState(paint: TextPaint) {
      r.h(var1, "paint");
      this.apply(var1, new b(this, var1));
   }
}
