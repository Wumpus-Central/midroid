package com.discord.span.utilities.spannable

import android.graphics.Color
import android.text.TextPaint
import android.text.style.CharacterStyle
import android.text.style.UpdateAppearance
import kotlin.jvm.internal.r

public class SpoilerSpan(isRevealed: Boolean, hiddenColor: Int, revealedColor: Int) : CharacterStyle, UpdateAppearance {
   private final val hiddenColor: Int
   public final val isRevealed: Boolean
   private final val revealedColor: Int

   init {
      this.isRevealed = var1;
      this.hiddenColor = var2;
      this.revealedColor = var3;
   }

   public open fun updateDrawState(tp: TextPaint) {
      r.h(var1, "tp");
      if (this.isRevealed) {
         var1.bgColor = this.revealedColor;
      } else {
         var1.bgColor = this.hiddenColor;
         var1.setColor(Color.argb(0, 0, 0, 0));
      }
   }
}
