package com.discord.chat.presentation.message

import android.graphics.LinearGradient
import android.graphics.Shader.TileMode
import android.text.TextPaint
import android.text.style.CharacterStyle
import android.text.style.UpdateAppearance

public class EnhancedRoleColorsSpan(roleColors: IntArray) : CharacterStyle, UpdateAppearance {
   private final val roleColors: IntArray

   init {
      this.roleColors = var1;
   }

   public open fun updateDrawState(tp: TextPaint) {
      var1.setShader(new LinearGradient(0.0F, 0.0F, 150.0F, 0.0F, this.roleColors, null, TileMode.MIRROR));
   }
}
