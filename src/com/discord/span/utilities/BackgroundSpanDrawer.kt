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
      val var21: Array<BackgroundSpan> = var20.getSpans(0, var8.length(), BackgroundSpan.class) as Array<BackgroundSpan>;
      val var26: Layout = this.provider.getLayout();
      q.g(var26, "getLayout(...)");
      q.e(var21);
      var4 = var21.length;

      for (int var25 = 0; var25 < var4; var25++) {
         val var22: BackgroundSpan = var21[var25];
         var9 = var20.getSpanStart(var21[var25]);
         var var18: Int = var20.getSpanEnd(var21[var25]);
         val var36: BackgroundStyle = var22.getStyle();
         val var13: Float = SizeUtilsKt.getDpToPx(var36.getCornerRadius());
         var10 = var26.getLineForOffset(var9);
         val var17: Int = var26.getLineForOffset(var18);
         if (var10 <= var11 && var11 <= var17) {
            if (var10 == var11) {
               var9 = (int)var26.getPrimaryHorizontal(var9);
            } else {
               var9 = var3;
            }

            val var12: Float;
            if (var17 == var11) {
               var12 = var26.getPrimaryHorizontal(Math.min(var18, var26.getLineEnd(var11)));
            } else {
               var12 = var26.getLineRight(var11);
            }

            val var19: Int = (int)var12;
            var18 = var2.getColor();
            var2.setColor(var36.getBackgroundColor());
            if (var10 == var17) {
               var1.drawRoundRect(
                  (float)var9,
                  (float)var5,
                  (float)var19,
                  (float)var7,
                  (float)SizeUtilsKt.getDpToPx(var36.getCornerRadius()),
                  (float)SizeUtilsKt.getDpToPx(var36.getCornerRadius()),
                  var2
               );
            } else if (var10 == var11) {
               var2.setColor(var36.getBackgroundColor());
               val var37: Path = new Path();
               var37.addRoundRect(
                  (float)var9, (float)var5, (float)var19, (float)var7, new float[]{var13, var13, 0.0F, 0.0F, 0.0F, 0.0F, var13, var13}, Direction.CW
               );
               var1.drawPath(var37, var2);
            } else if (var17 == var11) {
               var2.setColor(var36.getBackgroundColor());
               val var39: Path = new Path();
               var39.addRoundRect(
                  (float)var9, (float)var5, (float)var19, (float)var7, new float[]{0.0F, 0.0F, var13, var13, var13, var13, 0.0F, 0.0F}, Direction.CW
               );
               var1.drawPath(var39, var2);
            } else {
               var1.drawRect((float)var9, (float)var5, (float)var19, (float)var7, var2);
            }

            var2.setColor(var18);
         }
      }
   }
}
