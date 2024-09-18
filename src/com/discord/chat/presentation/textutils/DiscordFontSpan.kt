package com.discord.chat.presentation.textutils

import android.content.Context
import android.graphics.Paint
import android.graphics.Typeface
import android.text.TextPaint
import android.text.style.MetricAffectingSpan
import com.discord.fonts.DiscordFont
import kotlin.jvm.internal.q

public class DiscordFontSpan(context: Context, discordFont: DiscordFont) : MetricAffectingSpan {
   private final val context: Context
   private final val discordFont: DiscordFont
   private final val typeface: Typeface

   init {
      q.h(var1, "context");
      q.h(var2, "discordFont");
      super();
      this.context = var1;
      this.discordFont = var2;
      this.typeface = var2.typeface(var1);
   }

   private fun applyCustomTypeFace(paint: Paint) {
      var var7: Typeface = var1.getTypeface();
      val var2: Int;
      if (var7 != null) {
         var2 = var7.getStyle();
      } else {
         var2 = 0;
      }

      var var3: Int = var2 and this.typeface.getStyle().inv();
      val var11: DiscordFont.Companion = DiscordFont.Companion;
      val var8: DiscordFont = DiscordFont.Companion.fromTypeface(var1.getTypeface());
      val var9: Boolean;
      if (!var1.isFakeBoldText() && (var3 and 1) == 0) {
         var9 = false;
      } else {
         var9 = true;
      }

      if (this.discordFont.getMonospace()) {
         val var12: DiscordFont;
         if (var9) {
            var12 = DiscordFont.CodeBold;
         } else {
            var12 = DiscordFont.CodeNormal;
         }

         var1.setTypeface(var12.typeface(this.context));
      } else {
         var var5: Boolean;
         label45: {
            if (var1.getTextSkewX() == 0.0F && !this.discordFont.getItalic() && (var3 and 2) == 0) {
               var5 = false;
               if (var8 == null) {
                  break label45;
               }

               var5 = false;
               if (!var8.getItalic()) {
                  break label45;
               }
            }

            var5 = true;
         }

         val var4: Int = this.discordFont.getWeight();
         var3 = var4;
         if (var9) {
            var3 = Math.max(700, var4);
         }

         val var14: DiscordFont = DiscordFont.Companion.findByStyle$default(var11, var3, var5, false, 4, null);
         if (var14 != null) {
            var7 = var14.typeface(this.context);
         } else {
            var7 = null;
         }

         var1.setTypeface(var7);
      }
   }

   public open fun updateDrawState(paint: TextPaint) {
      q.h(var1, "paint");
      this.applyCustomTypeFace(var1);
   }

   public open fun updateMeasureState(paint: TextPaint) {
      q.h(var1, "paint");
      this.applyCustomTypeFace(var1);
   }
}
