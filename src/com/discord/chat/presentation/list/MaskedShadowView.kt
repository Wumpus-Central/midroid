package com.discord.chat.presentation.list

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.graphics.Path.Direction
import android.graphics.Region.Op
import android.os.Build.VERSION
import android.util.AttributeSet
import android.view.View
import com.discord.misc.utilities.size.SizeUtilsKt

public class MaskedShadowView  public constructor(context: Context, attrs: AttributeSet? = null) : View(var1, var2) {
   private final var shadowColor: String = "#28000000"
   private final var borderRadius: Float
   private final var shadowElevation: Float = SizeUtilsKt.getDpToPx(10)
   private final val path: Path
   private final val shadowPaint: Paint

   fun MaskedShadowView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      this.path = new Path();
      val var4: Paint = new Paint();
      var4.setAntiAlias(true);
      var4.setColor(0);
      var4.setShadowLayer(this.shadowElevation, 0.0F, this.shadowElevation / (float)2, Color.parseColor(this.shadowColor));
      this.shadowPaint = var4;
   }

   protected open fun onDraw(canvas: Canvas) {
      super.onDraw(var1);
      if (this.getVisibility() == 0 && this.getWidth() != 0 && this.getHeight() != 0) {
         this.path.reset();
         this.path.addRoundRect(0.0F, 0.0F, (float)this.getWidth(), (float)this.getHeight(), this.borderRadius, this.borderRadius, Direction.CW);
         if (VERSION.SDK_INT >= 26) {
            x.a(var1, this.path);
         } else {
            var1.clipPath(this.path, Op.DIFFERENCE);
         }

         val var5: Float = this.shadowElevation / 2;
         var1.drawRoundRect(
            -(this.shadowElevation / (float)2),
            0.0F,
            (float)this.getWidth() + var5,
            (float)this.getHeight() + var5,
            this.borderRadius,
            this.borderRadius,
            this.shadowPaint
         );
      }
   }

   public fun setParams(shadowElevation: Float, borderRadius: Float, shadowColor: String) {
      this.borderRadius = var2;
      this.shadowElevation = var1;
      this.shadowColor = var3;
      this.shadowPaint.setShadowLayer(var1, 0.0F, var1 / (float)2, Color.parseColor(var3));
      this.invalidate();
   }
}
