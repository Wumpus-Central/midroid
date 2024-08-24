package com.discord.misc.utilities.drawable

import android.graphics.Canvas
import android.graphics.ColorFilter
import android.graphics.drawable.Drawable

public abstract class CustomDrawDrawable : Drawable {
   public abstract fun draw(canvas: Canvas) {
   }

   public fun getOpacity(): Int {
      return -3;
   }

   public fun setAlpha(alpha: Int) {
   }

   public fun setColorFilter(colorFilter: ColorFilter?) {
   }
}
