package com.discord.animatable_underlay

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RectF
import android.graphics.Paint.Style
import android.graphics.Path.Direction
import kotlin.jvm.internal.r

internal class AnimatableUnderlayBorders {
   public final var borderBottomLeftRadius: Float
      internal final set(value) {
         this.borderBottomLeftRadius = var1;
         this.borderRadiusRadii[6] = var1;
         this.borderRadiusRadii[7] = var1;
         this.borderStrokeRadiusRadii[6] = var1 - this.borderWidth;
         this.borderStrokeRadiusRadii[7] = var1 - this.borderWidth;
      }


   public final var borderBottomRightRadius: Float
      internal final set(value) {
         this.borderBottomRightRadius = var1;
         this.borderRadiusRadii[4] = var1;
         this.borderRadiusRadii[5] = var1;
         this.borderStrokeRadiusRadii[4] = var1 - this.borderWidth;
         this.borderStrokeRadiusRadii[5] = var1 - this.borderWidth;
      }


   public final var borderColor: Int
   public final val borderRadiusRadii: FloatArray
   private final val borderStrokeRadiusRadii: FloatArray

   public final var borderTopLeftRadius: Float
      internal final set(value) {
         this.borderTopLeftRadius = var1;
         this.borderRadiusRadii[0] = var1;
         this.borderRadiusRadii[1] = var1;
         this.borderStrokeRadiusRadii[0] = var1 - this.borderWidth;
         this.borderStrokeRadiusRadii[1] = var1 - this.borderWidth;
      }


   public final var borderTopRightRadius: Float
      internal final set(value) {
         this.borderTopRightRadius = var1;
         this.borderRadiusRadii[2] = var1;
         this.borderRadiusRadii[3] = var1;
         this.borderStrokeRadiusRadii[2] = var1 - this.borderWidth;
         this.borderStrokeRadiusRadii[3] = var1 - this.borderWidth;
      }


   public final var borderWidth: Float
      internal final set(value) {
         this.borderWidth = var1;
         this.borderStrokeRadiusRadii[0] = this.borderTopLeftRadius - var1;
         this.borderStrokeRadiusRadii[1] = this.borderTopLeftRadius - var1;
         this.borderStrokeRadiusRadii[2] = this.borderTopRightRadius - var1;
         this.borderStrokeRadiusRadii[3] = this.borderTopRightRadius - var1;
         this.borderStrokeRadiusRadii[4] = this.borderBottomRightRadius - var1;
         this.borderStrokeRadiusRadii[5] = this.borderBottomRightRadius - var1;
         this.borderStrokeRadiusRadii[6] = this.borderBottomLeftRadius - var1;
         this.borderStrokeRadiusRadii[7] = this.borderBottomLeftRadius - var1;
      }


   private final val path: Path = new Path()

   internal fun drawBorderStroke(canvas: Canvas, paint: Paint, pathRect: RectF) {
      r.h(var1, "canvas");
      r.h(var2, "paint");
      r.h(var3, "pathRect");
      val var4: Float = this.borderWidth;
      if (!(this.borderWidth <= 0.0F)) {
         var3.left = var3.left + this.borderWidth / 2.0F;
         var3.top += var4 / 2.0F;
         var3.right -= var4 / 2.0F;
         var3.bottom -= var4 / 2.0F;
         this.path.reset();
         this.path.addRoundRect(var3, this.borderStrokeRadiusRadii, Direction.CW);
         var2.setStyle(Style.STROKE);
         var2.setStrokeWidth(this.borderWidth);
         var2.setColor(this.borderColor);
         var1.drawPath(this.path, var2);
         var2.setStyle(Style.FILL);
      }
   }
}
