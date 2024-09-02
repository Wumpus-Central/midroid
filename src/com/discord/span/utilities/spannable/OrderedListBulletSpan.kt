package com.discord.span.utilities.spannable

import android.graphics.Canvas
import android.graphics.Paint
import android.text.Layout
import android.text.Spanned
import android.text.style.LeadingMarginSpan
import kotlin.jvm.internal.q

public class OrderedListBulletSpan(listItemIndex: Long, trailingMargin: Int, largestListItemIndex: Long, paint: Paint) : LeadingMarginSpan {
   private final val largestBulletContentWidth: Float
   private final val listItemIndex: Long
   private final val trailingMargin: Int

   init {
      q.h(var6, "paint");
      super();
      this.listItemIndex = var1;
      this.trailingMargin = var3;
      val var7: StringBuilder = new StringBuilder();
      var7.append(var4);
      var7.append(".");
      this.largestBulletContentWidth = this.calculateBulletContentWidth(var6, var7.toString());
   }

   private fun calculateBulletContentWidth(paint: Paint, bulletContent: String): Float {
      var1 = new Paint(var1);
      var1.setFontFeatureSettings("tnum");
      return var1.measureText(var2);
   }

   public open fun drawLeadingMargin(
      canvas: Canvas,
      paint: Paint,
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
      q.h(var1, "canvas");
      q.h(var2, "paint");
      q.h(var8, "text");
      q.h(var12, "layout");
      if ((var8 as Spanned).getSpanStart(this) == var9) {
         val var17: java.lang.String = var2.getFontFeatureSettings();
         var2.setFontFeatureSettings("tnum");
         val var15: Long = this.listItemIndex;
         val var18: StringBuilder = new StringBuilder();
         var18.append(var15);
         var18.append(".");
         val var19: java.lang.String = var18.toString();
         var1.drawText(var19, (float)var3 + (this.largestBulletContentWidth - this.calculateBulletContentWidth(var2, var19)), (float)var6, var2);
         var2.setFontFeatureSettings(var17);
      }
   }

   public open fun getLeadingMargin(first: Boolean): Int {
      return (int)this.largestBulletContentWidth + this.trailingMargin;
   }
}
