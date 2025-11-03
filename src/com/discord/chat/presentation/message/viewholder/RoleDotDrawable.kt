package com.discord.chat.presentation.message.viewholder

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.LinearGradient
import android.graphics.Paint
import android.graphics.Shader.TileMode
import android.graphics.drawable.Drawable
import com.discord.chat.bridge.rolecolors.RoleColors
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.FontManager

public class RoleDotDrawable(context: Context, borderColor: Int, spSize: Int = 20) : Drawable {
   private final val scale: Float
   private final val pxSize: Float
   private final val borderColorPaint: Paint
   private final val roleColorAlphaPaint: Paint
   private final val roleColorPaint: Paint

   init {
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
      val var3: Float = 2;
      val var2: Float = (this.pxSize / 2 + 2) / 2;
      var1.drawCircle(this.pxSize / (float)2, this.pxSize / (float)2, (this.pxSize / (float)2 + (float)2) / (float)2, this.borderColorPaint);
      var1.drawCircle(this.pxSize / var3, this.pxSize / var3, var2, this.roleColorAlphaPaint);
      var1.drawCircle(this.pxSize / var3, this.pxSize / var3, var2 - var3, this.roleColorPaint);
   }

   @ht.c
   public open fun getOpacity(): Int {
      return -1;
   }

   public open fun setAlpha(p0: Int) {
   }

   public open fun setColorFilter(p0: ColorFilter?) {
   }

   public fun setColors(roleColors: RoleColors) {
      if (var1.getSecondaryColor() != null) {
         val var5: java.util.List = CollectionsKt.r(new Integer[]{var1.getPrimaryColor(), var1.getSecondaryColor()});
         if (var1.getTertiaryColor() != null) {
            var5.add(var1.getTertiaryColor());
         }

         this.roleColorPaint
            .setShader(
               new LinearGradient(
                  this.pxSize / (float)2 / (float)2,
                  0.0F,
                  this.pxSize / (float)2 / (float)2 + (this.pxSize / (float)2 + (float)2),
                  0.0F,
                  CollectionsKt.g1(var5),
                  null,
                  TileMode.MIRROR
               )
            );
      } else {
         this.roleColorPaint.setShader(null);
         this.roleColorPaint
            .setColor(Color.argb(255, Color.red(var1.getPrimaryColor()), Color.green(var1.getPrimaryColor()), Color.blue(var1.getPrimaryColor())));
      }

      this.roleColorAlphaPaint
         .setColor(Color.argb(102, Color.red(var1.getPrimaryColor()), Color.green(var1.getPrimaryColor()), Color.blue(var1.getPrimaryColor())));
   }
}
