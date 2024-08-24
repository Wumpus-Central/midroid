package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.automod.AutoModerationContext
import com.discord.chat.databinding.FlaggedMessageEmbedFooterViewBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.discord.theme.ThemeManagerKt

public class FlaggedMessageEmbedFooterView  public constructor(context: Context, attrs: AttributeSet? = null) : ConstraintLayout {
   private final val binding: FlaggedMessageEmbedFooterViewBinding

   fun FlaggedMessageEmbedFooterView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2);
      val var6: FlaggedMessageEmbedFooterViewBinding = FlaggedMessageEmbedFooterViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var6, "inflate(LayoutInflater.from(context), this)");
      this.binding = var6;
      val var4: ImageView = var6.separatorDot;
      var6.separatorDot.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModifierAccent());
      kotlin.jvm.internal.r.g(var4, "_init_$lambda$0");
      ViewClippingUtilsKt.clipToRoundedRectangle(var4, SizeUtilsKt.getDpToPx(4));
      val var3: TextView = var6.flaggedMessageKeyword;
      kotlin.jvm.internal.r.g(var6.flaggedMessageKeyword, "_init_$lambda$1");
      val var5: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimaryMedium);
      SetTextSizeSpKt.setTextSizeSp(var3, 12.0F, 15.0F);
      var3.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      val var7: TextView = var6.flaggedMessageRuleName;
      kotlin.jvm.internal.r.g(var6.flaggedMessageRuleName, "_init_$lambda$2");
      DiscordFontUtilsKt.setDiscordFont(var7, var5);
      SetTextSizeSpKt.setTextSizeSp(var7, 12.0F, 15.0F);
      var7.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
   }

   public fun setAutomodContext(autoModerationContext: AutoModerationContext) {
      kotlin.jvm.internal.r.h(var1, "autoModerationContext");
      val var5: java.lang.String = var1.getKeywordDisplayText();
      val var7: java.lang.String = var1.getRuleDisplayText();
      val var6: TextView = this.binding.flaggedMessageKeyword;
      kotlin.jvm.internal.r.g(this.binding.flaggedMessageKeyword, "binding.flaggedMessageKeyword");
      ViewUtilsKt.setOptionalText(var6, var5);
      val var13: TextView = this.binding.flaggedMessageRuleName;
      kotlin.jvm.internal.r.g(this.binding.flaggedMessageRuleName, "binding.flaggedMessageRuleName");
      ViewUtilsKt.setOptionalText(var13, var7);
      val var8: ImageView = this.binding.separatorDot;
      kotlin.jvm.internal.r.g(this.binding.separatorDot, "binding.separatorDot");
      val var14: TextView = this.binding.flaggedMessageKeyword;
      kotlin.jvm.internal.r.g(this.binding.flaggedMessageKeyword, "binding.flaggedMessageKeyword");
      var var9: Boolean;
      if (var14.getVisibility() == 0) {
         var9 = 1;
      } else {
         var9 = 0;
      }

      label26: {
         if (var9) {
            val var15: TextView = this.binding.flaggedMessageRuleName;
            kotlin.jvm.internal.r.g(this.binding.flaggedMessageRuleName, "binding.flaggedMessageRuleName");
            if (var15.getVisibility() == 0) {
               var9 = (boolean)1;
            } else {
               var9 = (boolean)0;
            }

            if (var9) {
               var9 = (boolean)1;
               break label26;
            }
         }

         var9 = (boolean)0;
      }

      if (var9) {
         var9 = 0;
      } else {
         var9 = 8;
      }

      var8.setVisibility(var9);
   }
}
