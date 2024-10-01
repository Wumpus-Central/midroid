package com.discord.span.utilities.spannable

import android.graphics.Paint.FontMetricsInt
import android.text.Spanned
import android.text.style.LineHeightSpan
import kotlin.jvm.internal.q

public class VerticalPaddingSpan(top: Int, bottom: Int) : LineHeightSpan {
   public final val bottom: Int
   private final var initialized: Boolean
   private final var origAscent: Int
   private final var origBottom: Int
   private final var origDescent: Int
   private final var origTop: Int
   public final val top: Int

   public constructor(padding: Int) : this(var1, var1)
   init {
      this.top = var1;
      this.bottom = var2;
      this.origTop = -1;
      this.origAscent = -1;
      this.origBottom = -1;
      this.origDescent = -1;
   }

   public open fun chooseHeight(text: CharSequence, start: Int, end: Int, spanstartv: Int, v: Int, fontMetrics: FontMetricsInt) {
      q.h(var1, "text");
      q.h(var6, "fontMetrics");
      if (var1 is Spanned) {
         if (!this.initialized) {
            this.origTop = var6.top;
            this.origAscent = var6.ascent;
            this.origBottom = var6.bottom;
            this.origDescent = var6.descent;
            this.initialized = true;
         }

         val var7: Spanned = var1 as Spanned;
         if ((var1 as Spanned).getSpanStart(this) == var2) {
            var2 = this.top;
            var6.top = var6.top - this.top;
            var6.ascent -= var2;
         } else {
            var6.top = this.origTop;
            var6.ascent = this.origAscent;
         }

         if (var7.getSpanEnd(this) == var3) {
            var2 = this.bottom;
            var6.bottom = var6.bottom + this.bottom;
            var6.descent += var2;
         } else {
            var6.bottom = this.origBottom;
            var6.descent = this.origDescent;
         }
      }
   }
}
