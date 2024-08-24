package com.discord.span.utilities.spannable

import android.graphics.Canvas
import android.graphics.Paint
import android.text.Layout
import android.text.Spanned
import android.text.style.LeadingMarginSpan
import kotlin.jvm.internal.r

public class OrderedListBulletSpan(listItemIndex: Long, trailingMargin: Int, largestListItemIndex: Long, paint: Paint) : LeadingMarginSpan {
   private final val largestBulletContentWidth: Float
   private final val listItemIndex: Long
   private final val trailingMargin: Int

   init {
      r.h(var6, "paint");
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
      r.h(var1, "canvas");
      r.h(var2, "paint");
      r.h(var8, "text");
      r.h(var12, "layout");
      val var17: Boolean;
      if ((var8 as Spanned).getSpanStart(this) == var9) {
         var17 = true;
      } else {
         var17 = false;
      }

      if (var17) {
         val var18: java.lang.String = var2.getFontFeatureSettings();
         var2.setFontFeatureSettings("tnum");
         val var15: Long = this.listItemIndex;
         val var19: StringBuilder = new StringBuilder();
         var19.append(var15);
         var19.append(".");
         val var20: java.lang.String = var19.toString();
         var1.drawText(var20, (float)var3 + (this.largestBulletContentWidth - this.calculateBulletContentWidth(var2, var20)), (float)var6, var2);
         var2.setFontFeatureSettings(var18);
      }
   }

   public open fun getLeadingMargin(first: Boolean): Int {
      return (int)this.largestBulletContentWidth + this.trailingMargin;
   }
}
