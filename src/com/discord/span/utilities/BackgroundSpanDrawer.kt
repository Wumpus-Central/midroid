package com.discord.span.utilities

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.graphics.Paint.Style
import android.graphics.Path.Direction
import android.text.Layout
import android.text.SpannedString
import android.text.style.LineBackgroundSpan
import android.widget.TextView
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.span.utilities.common.BackgroundStyle
import com.discord.span.utilities.common.BorderStyle
import com.discord.span.utilities.common.ShadowStyle
import com.discord.span.utilities.spannable.BackgroundSpan
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nBackgroundSpanDrawer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackgroundSpanDrawer.kt\ncom/discord/span/utilities/BackgroundSpanDrawer\n+ 2 SpannedString.kt\nandroidx/core/text/SpannedStringKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,214:1\n28#2:215\n1863#3,2:216\n*S KotlinDebug\n*F\n+ 1 BackgroundSpanDrawer.kt\ncom/discord/span/utilities/BackgroundSpanDrawer\n*L\n34#1:215\n40#1:216,2\n*E\n"])
public class BackgroundSpanDrawer(provider: TextView) : LineBackgroundSpan {
   private final val provider: TextView

   init {
      this.provider = var1;
   }

   private fun drawBackground(
      canvas: Canvas,
      paint: Paint,
      lineNumber: Int,
      startLine: Int,
      endLine: Int,
      l: Int,
      r: Int,
      top: Int,
      bottom: Int,
      cornerRadius: Float
   ) {
      if (var4 == var5) {
         var1.drawRoundRect((float)var6, (float)var8, (float)var7, (float)var9, var10, var10, var2);
      } else if (var4 == var3) {
         val var21: Path = new Path();
         var21.addRoundRect((float)var6, (float)var8, (float)var7, (float)var9, new float[]{var10, var10, 0.0F, 0.0F, 0.0F, 0.0F, var10, var10}, Direction.CW);
         var1.drawPath(var21, var2);
      } else if (var5 == var3) {
         val var15: Path = new Path();
         var15.addRoundRect((float)var6, (float)var8, (float)var7, (float)var9, new float[]{0.0F, 0.0F, var10, var10, var10, var10, 0.0F, 0.0F}, Direction.CW);
         var1.drawPath(var15, var2);
      } else {
         var1.drawRect((float)var6, (float)var8, (float)var7, (float)var9, var2);
      }
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
      val var18: SpannedString = SpannedString.valueOf(var8);
      val var26: Array<Any> = var18.getSpans(0, var8.length(), BackgroundSpan.class);
      val var27: java.util.List = m.D0(var26);
      val var19: Layout = this.provider.getLayout();
      val var20: java.util.Iterator = var27.iterator();
      var var28: Paint = var2;

      while (var20.hasNext()) {
         val var21: BackgroundSpan = var20.next() as BackgroundSpan;
         var4 = var18.getSpanStart(var21);
         var10 = var18.getSpanEnd(var21);
         val var22: BackgroundStyle = var21.getBackground();
         val var13: Float = SizeUtilsKt.getDpToPx(var22.getCornerRadius());
         var6 = var19.getLineForOffset(var4);
         var9 = var19.getLineForOffset(var10);
         var var17: Paint = var28;
         if (var6 <= var11) {
            var17 = var28;
            if (var11 <= var9) {
               if (var6 == var11) {
                  var4 = (int)var19.getPrimaryHorizontal(var4);
               } else {
                  var4 = var3;
               }

               val var12: Float;
               if (var9 == var11) {
                  var12 = var19.getPrimaryHorizontal(Math.min(var10, var19.getLineEnd(var11)));
               } else {
                  var12 = var19.getLineRight(var11);
               }

               val var14: Int = (int)var12;
               var10 = var5 + SizeUtilsKt.getDpToPx(var22.getMarginVertical());
               val var15: Int = var7 - SizeUtilsKt.getDpToPx(var22.getMarginVertical());
               val var16: Int = var28.getColor();
               var28.setColor(var22.getBackgroundColor());
               val var33: ShadowStyle = var21.getShadow();
               if (var33 != null) {
                  var28.setShadowLayer(var33.getRadius(), var33.getOffset().getWidth(), var33.getOffset().getHeight(), var33.getColor());
                  this.drawBackground(var1, var28, var11, var6, var9, var4, var14, var10, var15, var13);
               }

               var2.clearShadowLayer();
               var17 = var2;
               this.drawBackground(var1, var2, var11, var6, var9, var4, var14, var10, var15, var13);
               val var29: BorderStyle = var21.getBorder();
               if (var29 != null) {
                  var2.setColor(var29.getColor());
                  var2.setStyle(Style.STROKE);
                  var2.setStrokeWidth((float)var29.getWidth());
                  this.drawBackground(var1, var2, var11, var6, var9, var4, var14, var10, var15, var13);
               }

               var2.setStyle(Style.FILL);
               var2.setColor(var16);
            }
         }

         var28 = var17;
      }
   }
}
