package com.discord.chat.presentation.message.viewholder

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.Paint
import android.graphics.drawable.Drawable
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.FontManager

public class RoleDotDrawable(context: Context, borderColor: Int, spSize: Int = 20) : Drawable {
   private final val borderColorPaint: Paint
   private final val pxSize: Float
   private final val roleColorAlphaPaint: Paint
   private final val roleColorPaint: Paint
   private final val scale: Float
   private final val spSize: Int

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super();
      this.spSize = var3;
      val var4: Float = FontManager.INSTANCE.getFontScale(var1);
      this.scale = var4;
      this.pxSize = SizeUtilsKt.getSpToPx(var3) * var4;
      val var5: Paint = new Paint();
      var5.setColor(Color.argb(255, Color.red(var2), Color.green(var2), Color.blue(var2)));
      var5.setAntiAlias(true);
      this.borderColorPaint = var5;
      val var6: Paint = new Paint();
      var6.setAntiAlias(true);
      this.roleColorAlphaPaint = var6;
      val var7: Paint = new Paint();
      var7.setAntiAlias(true);
      this.roleColorPaint = var7;
   }

   public open fun draw(canvas: Canvas) {
      kotlin.jvm.internal.q.h(var1, "canvas");
      val var2: Float = 2;
      val var3: Float = (this.pxSize / 2 + 2) / 2;
      var1.drawCircle(this.pxSize / (float)2, this.pxSize / (float)2, (this.pxSize / (float)2 + (float)2) / (float)2, this.borderColorPaint);
      var1.drawCircle(this.pxSize / var2, this.pxSize / var2, var3, this.roleColorAlphaPaint);
      var1.drawCircle(this.pxSize / var2, this.pxSize / var2, var3 - var2, this.roleColorPaint);
   }

   public open fun getOpacity(): Int {
      return -1;
   }

   public open fun setAlpha(p0: Int) {
      val var2: StringBuilder = new StringBuilder();
      var2.append("An operation is not implemented: ");
      var2.append("Not yet implemented");
      throw new gh.q(var2.toString());
   }

   public fun setColor(roleColor: Int) {
      this.roleColorAlphaPaint.setColor(Color.argb(102, Color.red(var1), Color.green(var1), Color.blue(var1)));
      this.roleColorPaint.setColor(Color.argb(255, Color.red(var1), Color.green(var1), Color.blue(var1)));
   }

   public open fun setColorFilter(p0: ColorFilter?) {
      val var2: StringBuilder = new StringBuilder();
      var2.append("An operation is not implemented: ");
      var2.append("Not yet implemented");
      throw new gh.q(var2.toString());
   }
}
