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
import kotlin.jvm.internal.q

public class BackgroundSpanDrawer(provider: TextView) : LineBackgroundSpan {
   private final val provider: TextView

   init {
      q.h(var1, "provider");
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
      q.h(var1, "canvas");
      q.h(var2, "paint");
      q.h(var8, "text");
      val var20: SpannedString = SpannedString.valueOf(var8);
      q.g(var20, "valueOf(this)");
      val var22: Array<BackgroundSpan> = var20.getSpans(0, var8.length(), BackgroundSpan.class) as Array<BackgroundSpan>;
      val var21: Layout = this.provider.getLayout();
      q.g(var21, "getLayout(...)");
      q.e(var22);
      var4 = var22.length;
      var6 = 0;
      val var26: SpannedString = var20;

      for (Layout var36 = var21; var6 < var4; var6++) {
         val var37: BackgroundSpan = var22[var6];
         var9 = var26.getSpanStart(var22[var6]);
         var var18: Int = var26.getSpanEnd(var22[var6]);
         val var38: BackgroundStyle = var37.getStyle();
         val var13: Float = SizeUtilsKt.getDpToPx(var38.getCornerRadius());
         val var17: Int = var36.getLineForOffset(var9);
         var10 = var36.getLineForOffset(var18);
         if (var17 <= var11 && var11 <= var10) {
            if (var17 == var11) {
               var9 = (int)var36.getPrimaryHorizontal(var9);
            } else {
               var9 = var3;
            }

            val var12: Float;
            if (var10 == var11) {
               var12 = var36.getPrimaryHorizontal(Math.min(var18, var36.getLineEnd(var11)));
            } else {
               var12 = var36.getLineRight(var11);
            }

            val var19: Int = (int)var12;
            var18 = var2.getColor();
            var2.setColor(var38.getBackgroundColor());
            if (var17 == var10) {
               var1.drawRoundRect(
                  (float)var9,
                  (float)var5,
                  (float)var19,
                  (float)var7,
                  (float)SizeUtilsKt.getDpToPx(var38.getCornerRadius()),
                  (float)SizeUtilsKt.getDpToPx(var38.getCornerRadius()),
                  var2
               );
            } else if (var17 == var11) {
               var2.setColor(var38.getBackgroundColor());
               val var23: Path = new Path();
               var23.addRoundRect(
                  (float)var9, (float)var5, (float)var19, (float)var7, new float[]{var13, var13, 0.0F, 0.0F, 0.0F, 0.0F, var13, var13}, Direction.CW
               );
               var1.drawPath(var23, var2);
            } else if (var10 == var11) {
               var2.setColor(var38.getBackgroundColor());
               val var40: Path = new Path();
               var40.addRoundRect(
                  (float)var9, (float)var5, (float)var19, (float)var7, new float[]{0.0F, 0.0F, var13, var13, var13, var13, 0.0F, 0.0F}, Direction.CW
               );
               var1.drawPath(var40, var2);
            } else {
               var1.drawRect((float)var9, (float)var5, (float)var19, (float)var7, var2);
            }

            var2.setColor(var18);
         }
      }
   }
}
