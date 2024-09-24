package com.discord.span.utilities.spannable

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.graphics.Paint.Style
import android.text.Layout
import android.text.Spanned
import android.text.style.LeadingMarginSpan
import kotlin.jvm.internal.q

public class QuoteSpan(stripeColor: Int, stripeWidth: Int, gapWidth: Int) : LeadingMarginSpan {
   public final val insetStart: Int
      public final get() {
         return this.insetStart;
      }


   private final val radius: Float
   private final val rect: RectF
   public final val stripeColor: Int
   private final val stripeWidth: Int

   init {
      this.stripeColor = var1;
      this.stripeWidth = var2;
      this.rect = new RectF();
      this.radius = var2 / 2.0F;
      this.insetStart = var2 + var3;
   }

   private fun draw(c: Canvas, p: Paint) {
      val var6: Style = var2.getStyle();
      val var4: Int = var2.getColor();
      var2.setStyle(Style.FILL);
      var2.setColor(this.stripeColor);
      var1.drawRoundRect(this.rect, this.radius, this.radius, var2);
      var2.setStyle(var6);
      var2.setColor(var4);
   }

   public open fun drawLeadingMargin(
      c: Canvas,
      p: Paint,
      x: Int,
      dir: Int,
      top: Int,
      baseline: Int,
      bottom: Int,
      text: CharSequence,
      start: Int,
      end: Int,
      first: Boolean,
      layout: Layout
   ) {
      q.h(var1, "c");
      q.h(var2, "p");
      q.h(var8, "text");
      q.h(var12, "layout");
      if (var8 is Spanned) {
         val var15: Spanned = var8 as Spanned;
         if ((var8 as Spanned).getSpanStart(this) == var9) {
            val var13: RectF = this.rect;
            this.rect.left = var3;
            var13.right = var3 + var4 * this.stripeWidth;
            var13.top = var5;
         }

         var3 = var15.getSpanEnd(this);
         if (var3 == var10 || var3 - 1 == var10 && var8.charAt(var10) == '\n') {
            this.rect.bottom = var7;
            this.draw(var1, var2);
         }
      }
   }

   public open fun getLeadingMargin(first: Boolean): Int {
      return this.insetStart;
   }
}
