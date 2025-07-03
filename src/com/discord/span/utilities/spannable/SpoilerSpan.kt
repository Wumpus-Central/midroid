package com.discord.span.utilities.spannable

import android.graphics.Color
import android.text.TextPaint
import android.text.style.CharacterStyle
import android.text.style.UpdateAppearance
import kotlin.jvm.internal.r

public class SpoilerSpan(isRevealed: Boolean) : CharacterStyle, UpdateAppearance {
   public final val isRevealed: Boolean

   init {
      this.isRevealed = var1;
   }

   public open fun updateDrawState(tp: TextPaint) {
      r.h(var1, "tp");
      if (!this.isRevealed) {
         var1.setColor(Color.argb(0, 0, 0, 0));
      }
   }
}
