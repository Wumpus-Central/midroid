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
import kotlin.jvm.internal.r

public class MaskedShadowView  public constructor(context: Context, attrs: AttributeSet? = null) : View {
   private final var borderRadius: Float
   private final val path: Path
   private final var shadowColor: String
   private final var shadowElevation: Float
   private final val shadowPaint: Paint

   fun MaskedShadowView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2);
      this.shadowColor = "#28000000";
      this.shadowElevation = SizeUtilsKt.getDpToPx(10);
      this.path = new Path();
      val var4: Paint = new Paint();
      var4.setAntiAlias(true);
      var4.setColor(0);
      var4.setShadowLayer(this.shadowElevation, 0.0F, this.shadowElevation / (float)2, Color.parseColor(this.shadowColor));
      this.shadowPaint = var4;
   }

   protected open fun onDraw(canvas: Canvas) {
      r.h(var1, "canvas");
      super.onDraw(var1);
      if (this.getVisibility() == 0 && this.getWidth() != 0 && this.getHeight() != 0) {
         this.path.reset();
         this.path.addRoundRect(0.0F, 0.0F, (float)this.getWidth(), (float)this.getHeight(), this.borderRadius, this.borderRadius, Direction.CW);
         if (VERSION.SDK_INT >= 26) {
            c.a(var1, this.path);
         } else {
            var1.clipPath(this.path, Op.DIFFERENCE);
         }

         val var9: Float = this.shadowElevation / 2;
         var1.drawRoundRect(
            -(this.shadowElevation / (float)2),
            0.0F,
            (float)this.getWidth() + var9,
            (float)this.getHeight() + var9,
            this.borderRadius,
            this.borderRadius,
            this.shadowPaint
         );
      }
   }

   public fun setParams(shadowElevation: Float, borderRadius: Float, shadowColor: String) {
      r.h(var3, "shadowColor");
      this.borderRadius = var2;
      this.shadowElevation = var1;
      this.shadowColor = var3;
      this.shadowPaint.setShadowLayer(var1, 0.0F, var1 / (float)2, Color.parseColor(var3));
      this.invalidate();
   }
}
