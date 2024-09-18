package com.discord.span.utilities.spannable

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.graphics.Paint.Style
import android.text.Spanned
import android.text.style.LineBackgroundSpan
import kotlin.jvm.internal.q

public class BlockBackgroundSpan(fillColor: Int, strokeColor: Int, strokeWidth: Int, strokeRadius: Int, insetStart: Int, insetTop: Int, insetBottom: Int) :
   LineBackgroundSpan {
   private final val fillPaint: Paint
   private final val insetBottom: Int
   private final val insetStart: Int
   private final val insetTop: Int
   private final val radius: Float
   private final val rect: RectF
   private final val strokePaint: Paint

   init {
      this.insetStart = var5;
      this.insetTop = var6;
      this.insetBottom = var7;
      var var8: Paint = new Paint();
      var8.setStyle(Style.FILL);
      var8.setColor(var1);
      this.fillPaint = var8;
      var8 = new Paint();
      var8.setStyle(Style.STROKE);
      var8.setColor(var2);
      var8.setStrokeWidth((float)var3);
      var8.setAntiAlias(true);
      this.strokePaint = var8;
      this.rect = new RectF();
      this.radius = var4;
   }

   public open fun drawBackground(
      canvas: Canvas,
      paint: Paint,
      left: Int,
      right: Int,
      top: Int,
      baseline: Int,
      bottom: Int,
      text: CharSequence,
      start: Int,
      end: Int,
      lnum: Int
   ) {
      q.h(var1, "canvas");
      q.h(var2, "paint");
      q.h(var8, "text");
      if (var8 is Spanned) {
         val var16: Spanned = var8 as Spanned;
         if ((var8 as Spanned).getSpanStart(this) == var9) {
            val var13: RectF = this.rect;
            this.rect.left = (float)var3 + this.insetStart;
            var13.top = (float)var5 + this.insetTop;
         }

         if (var16.getSpanEnd(this) == var10) {
            val var14: RectF = this.rect;
            this.rect.right = var4;
            var14.bottom = (float)var7 - this.insetBottom;
            var1.drawRoundRect(var14, this.radius, this.radius, this.fillPaint);
            var1.drawRoundRect(this.rect, this.radius, this.radius, this.strokePaint);
         }
      }
   }
}
