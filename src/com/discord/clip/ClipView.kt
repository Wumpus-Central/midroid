package com.discord.clip

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.graphics.Path.Direction
import android.graphics.Region.Op
import com.facebook.react.views.view.ReactViewGroup
import kotlin.jvm.internal.q

public class ClipView(context: Context) : ReactViewGroup {
   private final val clipPath: Path
   private final val clipPathBackgroundColorPaint: Paint
   private final var clipPathRadius: Float
   private final var clipToCircle: Boolean
   private final val cutoutPath: Path

   init {
      q.h(var1, "context");
      super(var1);
      this.cutoutPath = new Path();
      this.clipPath = new Path();
      val var2: Paint = new Paint();
      var2.setColor(0);
      this.clipPathBackgroundColorPaint = var2;
      this.setWillNotDraw(false);
   }

   private fun handleClipTo(width: Float, height: Float, invalidate: Boolean = false) {
      if (!this.clipPath.isEmpty()) {
         this.clipPath.rewind();
      }

      if (this.clipToCircle) {
         this.clipPath.addOval(0.0F, 0.0F, var1, var2, Direction.CCW);
      } else if (this.clipPathRadius > 0.0F) {
         this.clipPath.addRoundRect(0.0F, 0.0F, var1, var2, this.clipPathRadius, this.clipPathRadius, Direction.CCW);
      }

      if (var3) {
         this.invalidate();
      }
   }

   public fun addCircleCutout(x: Float, y: Float, size: Float) {
      this.cutoutPath.addCircle(var1 + var3 / (float)2, var2 + var3 / (float)2, var3 / (float)2, Direction.CCW);
      this.invalidate();
   }

   public fun addRoundedRectCutout(x: Float, y: Float, width: Float, height: Float, cornerRadius: Float) {
      this.cutoutPath.addRoundRect(var1, var2, var1 + var3, var2 + var4, var5, var5, Direction.CCW);
      this.invalidate();
   }

   public fun clipToBorderRadius(borderRadius: Float) {
      this.clipPathRadius = var1;
      this.handleClipTo((float)this.getWidth(), (float)this.getHeight(), true);
   }

   public fun clipToCircle(clipToCircle: Boolean) {
      this.clipToCircle = var1;
      this.handleClipTo((float)this.getWidth(), (float)this.getHeight(), true);
   }

   protected open fun onDraw(canvas: Canvas) {
      q.h(var1, "canvas");
      if (!this.clipPath.isEmpty()) {
         ClipPathCompatKt.clipPathCompat(var1, this.clipPath, Op.INTERSECT);
      }

      if (!this.cutoutPath.isEmpty()) {
         ClipPathCompatKt.clipPathCompat(var1, this.cutoutPath, Op.DIFFERENCE);
      }

      if (this.clipPathBackgroundColorPaint.getColor() != 0) {
         var1.drawRect(0.0F, 0.0F, (float)this.getWidth(), (float)this.getHeight(), this.clipPathBackgroundColorPaint);
      }

      super.onDraw(var1);
   }

   protected open fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
      super.onSizeChanged(var1, var2, var3, var4);
      handleClipTo$default(this, (float)var1, (float)var2, false, 4, null);
   }

   public fun resetCutouts() {
      if (!this.cutoutPath.isEmpty()) {
         this.cutoutPath.rewind();
         this.invalidate();
      }
   }

   public open fun setBackgroundColor(color: Int) {
      this.clipPathBackgroundColorPaint.setColor(var1);
   }
}
