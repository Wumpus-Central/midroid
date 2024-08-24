package com.discord.span.utilities.spannable

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.graphics.Paint.Style
import android.graphics.Path.Direction
import android.text.Layout
import android.text.Spanned
import android.text.style.LeadingMarginSpan
import kotlin.jvm.internal.r

public class BulletSpan(color: Int, gapWidth: Int = 2, wantColor: Boolean = true, bulletRadius: Int = 4, strokeWidth: Float = 4.0F, style: Style = Style.FILL) :
   LeadingMarginSpan {
   private final val mBulletRadius: Int
   private final val mColor: Int
   private final val mGapWidth: Int
   private final val mStrokeWidth: Float
   private final val mStyle: Style
   private final val mWantColor: Boolean

   init {
      r.h(var6, "style");
      super();
      this.mGapWidth = var2;
      this.mBulletRadius = var4;
      this.mWantColor = var3;
      this.mColor = var1;
      this.mStrokeWidth = var5;
      this.mStyle = var6;
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
      l: Layout
   ) {
      r.h(var1, "c");
      r.h(var2, "p");
      r.h(var8, "text");
      r.h(var12, "l");
      if ((var8 as Spanned).getSpanStart(this) == var9) {
         val var14: Style = var2.getStyle();
         if (this.mWantColor) {
            var6 = var2.getColor();
            var2.setColor(this.mColor);
         } else {
            var6 = 0;
         }

         var2.setStyle(this.mStyle);
         if (this.mStyle === Style.STROKE || this.mStyle === Style.FILL_AND_STROKE) {
            var2.setStrokeWidth(this.mStrokeWidth);
         }

         if (var1.isHardwareAccelerated()) {
            if (sBulletPath == null) {
               val var17: Path = new Path();
               var17.addCircle(0.0F, 0.0F, (float)this.mBulletRadius * 1.2F, Direction.CW);
               sBulletPath = var17;
            }

            var1.save();
            var1.translate((float)var3 + (float)var4 * 1.2F * (float)this.mBulletRadius, (float)(var5 + var7) / 2.0F);
            val var18: Path = sBulletPath;
            r.e(sBulletPath);
            var1.drawPath(var18, var2);
            var1.restore();
         } else {
            var1.drawCircle((float)(var3 + var4 * this.mBulletRadius), (float)(var5 + var7) / 2.0F, (float)this.mBulletRadius, var2);
         }

         if (this.mWantColor) {
            var2.setColor(var6);
         }

         var2.setStyle(var14);
      }
   }

   public open fun getLeadingMargin(first: Boolean): Int {
      return this.mBulletRadius * 2 + this.mGapWidth;
   }

   public companion object {
      public const val STANDARD_BULLET_RADIUS_PX: Int
      public const val STANDARD_GAP_WIDTH_PX: Int
      public const val STANDARD_STROKE_WIDTH_PX: Float
      private final var sBulletPath: Path?
   }
}
