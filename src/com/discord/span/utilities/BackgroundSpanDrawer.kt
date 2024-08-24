package com.discord.span.utilities

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.graphics.Path.Direction
import android.text.Layout
import android.text.SpannedString
import android.text.style.LineBackgroundSpan
import android.widget.TextView
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.span.utilities.common.BackgroundStyle
import com.discord.span.utilities.spannable.BackgroundSpan
import kotlin.jvm.internal.r

public class BackgroundSpanDrawer(provider: TextView) : LineBackgroundSpan {
   private final val provider: TextView

   init {
      r.h(var1, "provider");
      super();
      this.provider = var1;
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
      lineNumber: Int
   ) {
      r.h(var1, "canvas");
      r.h(var2, "paint");
      r.h(var8, "text");
      val var20: SpannedString = SpannedString.valueOf(var8);
      r.g(var20, "valueOf(this)");
      val var22: Array<BackgroundSpan> = var20.getSpans(0, var8.length(), BackgroundSpan.class) as BackgroundSpan[];
      val var21: Layout = this.provider.getLayout();
      r.g(var21, "provider.layout");
      r.g(var22, "backgroundSpans");
      var4 = var22.length;
      var6 = 0;
      val var26: SpannedString = var20;

      for (Layout var37 = var21; var6 < var4; var6++) {
         val var38: BackgroundSpan = var22[var6];
         var var19: Int = var26.getSpanStart(var22[var6]);
         var var18: Int = var26.getSpanEnd(var22[var6]);
         val var39: BackgroundStyle = var38.getStyle();
         val var13: Float = SizeUtilsKt.getDpToPx(var39.getCornerRadius());
         val var17: Int = var37.getLineForOffset(var19);
         var10 = var37.getLineForOffset(var18);
         var var27: Boolean;
         if (var17 <= var11 && var11 <= var10) {
            var27 = 1;
         } else {
            var27 = 0;
         }

         if (var27) {
            if (var17 == var11) {
               var27 = (int)var37.getPrimaryHorizontal(var19);
            } else {
               var27 = var3;
            }

            val var12: Float;
            if (var10 == var11) {
               var12 = var37.getPrimaryHorizontal(Math.min(var18, var37.getLineEnd(var11)));
            } else {
               var12 = var37.getLineRight(var11);
            }

            var18 = (int)var12;
            var19 = var2.getColor();
            var2.setColor(var39.getBackgroundColor());
            if (var17 == var10) {
               var1.drawRoundRect(
                  (float)var27,
                  (float)var5,
                  (float)var18,
                  (float)var7,
                  (float)SizeUtilsKt.getDpToPx(var39.getCornerRadius()),
                  (float)SizeUtilsKt.getDpToPx(var39.getCornerRadius()),
                  var2
               );
            } else if (var17 == var11) {
               var2.setColor(var39.getBackgroundColor());
               val var40: Path = new Path();
               var40.addRoundRect(
                  (float)var27, (float)var5, (float)var18, (float)var7, new float[]{var13, var13, 0.0F, 0.0F, 0.0F, 0.0F, var13, var13}, Direction.CW
               );
               var1.drawPath(var40, var2);
            } else if (var10 == var11) {
               var2.setColor(var39.getBackgroundColor());
               val var41: Path = new Path();
               var41.addRoundRect(
                  (float)var27, (float)var5, (float)var18, (float)var7, new float[]{0.0F, 0.0F, var13, var13, var13, var13, 0.0F, 0.0F}, Direction.CW
               );
               var1.drawPath(var41, var2);
            } else {
               var1.drawRect((float)var27, (float)var5, (float)var18, (float)var7, var2);
            }

            var2.setColor(var19);
         }
      }
   }
}
