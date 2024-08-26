package com.discord.chat.presentation.textutils

import android.content.Context
import android.graphics.Paint
import android.graphics.Typeface
import android.text.TextPaint
import android.text.style.MetricAffectingSpan
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFont.Companion
import kotlin.jvm.internal.r

public class DiscordFontSpan(context: Context, discordFont: DiscordFont) : MetricAffectingSpan {
   private final val context: Context
   private final val discordFont: DiscordFont
   private final val typeface: Typeface

   init {
      r.h(var1, "context");
      r.h(var2, "discordFont");
      super();
      this.context = var1;
      this.discordFont = var2;
      this.typeface = var2.typeface(var1);
   }

   private fun applyCustomTypeFace(paint: Paint) {
      var var7: Typeface = var1.getTypeface();
      var var6: Boolean = false;
      val var2: Int;
      if (var7 != null) {
         var2 = var7.getStyle();
      } else {
         var2 = 0;
      }

      var var4: Int = var2 and this.typeface.getStyle().inv();
      val var8: Companion = DiscordFont.Companion;
      val var12: DiscordFont = DiscordFont.Companion.fromTypeface(var1.getTypeface());
      val var9: Boolean;
      if (!var1.isFakeBoldText() && (var4 and 1) == 0) {
         var9 = false;
      } else {
         var9 = true;
      }

      if (this.discordFont.getMonospace()) {
         val var13: DiscordFont;
         if (var9) {
            var13 = DiscordFont.CodeBold;
         } else {
            var13 = DiscordFont.CodeNormal;
         }

         var1.setTypeface(var13.typeface(this.context));
      } else {
         var var3: Boolean;
         if (var1.getTextSkewX() == 0.0F) {
            var3 = 1;
         } else {
            var3 = 0;
         }

         label50: {
            if (var3 && !this.discordFont.getItalic() && (var4 and 2) == 0) {
               val var5: Boolean;
               if (var12 != null) {
                  var5 = var12.getItalic();
               } else {
                  var5 = false;
               }

               if (!var5) {
                  break label50;
               }
            }

            var6 = true;
         }

         var4 = this.discordFont.getWeight();
         var3 = var4;
         if (var9) {
            var3 = Math.max(700, var4);
         }

         val var14: DiscordFont = Companion.findByStyle$default(var8, var3, var6, false, 4, null);
         if (var14 != null) {
            var7 = var14.typeface(this.context);
         } else {
            var7 = null;
         }

         var1.setTypeface(var7);
      }
   }

   public open fun updateDrawState(paint: TextPaint) {
      r.h(var1, "paint");
      this.applyCustomTypeFace(var1);
   }

   public open fun updateMeasureState(paint: TextPaint) {
      r.h(var1, "paint");
      this.applyCustomTypeFace(var1);
   }
}
