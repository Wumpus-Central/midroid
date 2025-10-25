package com.discord.span.utilities.spannable

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.graphics.Paint.Style
import android.graphics.Path.Direction
import android.text.Layout
import android.text.Spanned
import android.text.style.LeadingMarginSpan
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nBulletSpan.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BulletSpan.kt\ncom/discord/span/utilities/spannable/BulletSpan\n+ 2 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,98:1\n44#2,8:99\n*S KotlinDebug\n*F\n+ 1 BulletSpan.kt\ncom/discord/span/utilities/spannable/BulletSpan\n*L\n72#1:99,8\n*E\n"])
public class BulletSpan(color: Int, gapWidth: Int = 2, wantColor: Boolean = true, bulletRadius: Int = 4, strokeWidth: Float = 4.0F, style: Style = Style.FILL) :
   LeadingMarginSpan {
   private final val mGapWidth: Int
   private final val mBulletRadius: Int
   private final val mWantColor: Boolean
   private final val mColor: Int
   private final val mStrokeWidth: Float
   private final val mStyle: Style

   init {
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
      label42: {
         if ((var8 as Spanned).getSpanStart(this) == var9) {
            val var21: Style = var2.getStyle();
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
                  val var24: Path = new Path();
                  var24.addCircle(0.0F, 0.0F, (float)this.mBulletRadius * 1.2F, Direction.CW);
                  sBulletPath = var24;
               }

               val var14: Float = var3;
               val var16: Float = var4;
               val var15: Float = this.mBulletRadius;
               val var13: Float = (var5 + var7) / 2.0F;
               var3 = var1.save();
               var1.translate(var14 + var16 * 1.2F * var15, var13);

               try {
                  val var25: Path = sBulletPath;
                  var1.drawPath(var25, var2);
               } catch (var17: java.lang.Throwable) {
                  var1.restoreToCount(var3);
               }

               var1.restoreToCount(var3);
            } else {
               var1.drawCircle((float)(var3 + var4 * this.mBulletRadius), (float)(var5 + var7) / 2.0F, (float)this.mBulletRadius, var2);
            }

            if (this.mWantColor) {
               var2.setColor(var6);
            }

            var2.setStyle(var21);
         }
      }
   }

   public open fun getLeadingMargin(first: Boolean): Int {
      return this.mBulletRadius * 2 + this.mGapWidth;
   }

   public companion object {
      private final var sBulletPath: Path?
      public const val STANDARD_GAP_WIDTH_PX: Int
      public const val STANDARD_BULLET_RADIUS_PX: Int
      public const val STANDARD_STROKE_WIDTH_PX: Float
   }
}
