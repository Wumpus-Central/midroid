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
      val var21: Array<BackgroundSpan> = var20.getSpans(0, var8.length(), BackgroundSpan.class) as BackgroundSpan[];
      val var26: Layout = this.provider.getLayout();
      r.g(var26, "provider.layout");
      r.g(var21, "backgroundSpans");
      var4 = var21.length;

      for (int var25 = 0; var25 < var4; var25++) {
         val var22: BackgroundSpan = var21[var25];
         var var19: Int = var20.getSpanStart(var21[var25]);
         var var18: Int = var20.getSpanEnd(var21[var25]);
         val var37: BackgroundStyle = var22.getStyle();
         val var13: Float = SizeUtilsKt.getDpToPx(var37.getCornerRadius());
         val var17: Int = var26.getLineForOffset(var19);
         var10 = var26.getLineForOffset(var18);
         var var27: Boolean;
         if (var17 <= var11 && var11 <= var10) {
            var27 = 1;
         } else {
            var27 = 0;
         }

         if (var27) {
            if (var17 == var11) {
               var27 = (int)var26.getPrimaryHorizontal(var19);
            } else {
               var27 = var3;
            }

            val var12: Float;
            if (var10 == var11) {
               var12 = var26.getPrimaryHorizontal(Math.min(var18, var26.getLineEnd(var11)));
            } else {
               var12 = var26.getLineRight(var11);
            }

            var19 = (int)var12;
            var18 = var2.getColor();
            var2.setColor(var37.getBackgroundColor());
            if (var17 == var10) {
               var1.drawRoundRect(
                  (float)var27,
                  (float)var5,
                  (float)var19,
                  (float)var7,
                  (float)SizeUtilsKt.getDpToPx(var37.getCornerRadius()),
                  (float)SizeUtilsKt.getDpToPx(var37.getCornerRadius()),
                  var2
               );
            } else if (var17 == var11) {
               var2.setColor(var37.getBackgroundColor());
               val var23: Path = new Path();
               var23.addRoundRect(
                  (float)var27, (float)var5, (float)var19, (float)var7, new float[]{var13, var13, 0.0F, 0.0F, 0.0F, 0.0F, var13, var13}, Direction.CW
               );
               var1.drawPath(var23, var2);
            } else if (var10 == var11) {
               var2.setColor(var37.getBackgroundColor());
               val var40: Path = new Path();
               var40.addRoundRect(
                  (float)var27, (float)var5, (float)var19, (float)var7, new float[]{0.0F, 0.0F, var13, var13, var13, var13, 0.0F, 0.0F}, Direction.CW
               );
               var1.drawPath(var40, var2);
            } else {
               var1.drawRect((float)var27, (float)var5, (float)var19, (float)var7, var2);
            }

            var2.setColor(var18);
         }
      }
   }
}
