package com.discord.chat.presentation.message

import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import android.graphics.drawable.LayerDrawable
import android.text.style.DynamicDrawableSpan
import com.discord.chat.presentation.message.viewholder.RoleDotDrawable
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react.FontManager
import com.discord.theme.R.color
import com.discord.theme.utils.ColorUtilsKt

public class RoleDotSpan(context: Context, backgroundColor: Int, spSize: Int = 20) : DynamicDrawableSpan {
   private final val backgroundDrawable: ColorDrawable
   private final val borderColor: Int
   private final val layerDrawable: LayerDrawable
   private final val pxSize: Int
   private final val roleDot: RoleDotDrawable
   private final val scale: Float
   private final val spSize: Int
   private final val topPos: Int

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super();
      this.spSize = var3;
      val var4: Float = FontManager.INSTANCE.getFontScale(var1);
      this.scale = var4;
      this.pxSize = (int)(SizeUtilsKt.getSpToPx(var3) * var4);
      this.topPos = SizeUtilsKt.getSpToPx(var3 * -1 / 4);
      val var5: Int = ColorUtilsKt.getThemeColor(var1, color.black, color.white);
      this.borderColor = var5;
      val var6: RoleDotDrawable = new RoleDotDrawable(var1, var5, var3);
      this.roleDot = var6;
      val var7: ColorDrawable = new ColorDrawable(var2);
      this.backgroundDrawable = var7;
      this.layerDrawable = new LayerDrawable(new Drawable[]{var7, var6});
   }

   public open fun getDrawable(): Drawable {
      this.layerDrawable.setBounds(0, this.topPos, this.pxSize, this.pxSize);
      return this.layerDrawable;
   }

   public fun setColor(roleColor: Int) {
      this.roleDot.setColor(var1);
   }
}
