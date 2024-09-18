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
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2);
      val var4: FlaggedMessageEmbedFooterViewBinding = FlaggedMessageEmbedFooterViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var4, "inflate(...)");
      this.binding = var4;
      val var6: ImageView = var4.separatorDot;
      var4.separatorDot.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModifierAccent());
      kotlin.jvm.internal.q.e(var6);
      ViewClippingUtilsKt.clipToRoundedRectangle(var6, SizeUtilsKt.getDpToPx(4));
      val var3: TextView = var4.flaggedMessageKeyword;
      kotlin.jvm.internal.q.e(var4.flaggedMessageKeyword);
      val var7: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimaryMedium);
      SetTextSizeSpKt.setTextSizeSp(var3, 12.0F, 15.0F);
      var3.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      val var5: TextView = var4.flaggedMessageRuleName;
      kotlin.jvm.internal.q.e(var4.flaggedMessageRuleName);
      DiscordFontUtilsKt.setDiscordFont(var5, var7);
      SetTextSizeSpKt.setTextSizeSp(var5, 12.0F, 15.0F);
      var5.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
   }

   public fun setAutomodContext(autoModerationContext: AutoModerationContext) {
      var var8: Boolean;
      label17: {
         kotlin.jvm.internal.q.h(var1, "autoModerationContext");
         val var4: java.lang.String = var1.getKeywordDisplayText();
         val var6: java.lang.String = var1.getRuleDisplayText();
         val var5: TextView = this.binding.flaggedMessageKeyword;
         kotlin.jvm.internal.q.g(this.binding.flaggedMessageKeyword, "flaggedMessageKeyword");
         ViewUtilsKt.setOptionalText(var5, var4);
         val var10: TextView = this.binding.flaggedMessageRuleName;
         kotlin.jvm.internal.q.g(this.binding.flaggedMessageRuleName, "flaggedMessageRuleName");
         ViewUtilsKt.setOptionalText(var10, var6);
         var7 = this.binding.separatorDot;
         kotlin.jvm.internal.q.g(this.binding.separatorDot, "separatorDot");
         val var11: TextView = this.binding.flaggedMessageKeyword;
         kotlin.jvm.internal.q.g(this.binding.flaggedMessageKeyword, "flaggedMessageKeyword");
         if (var11.getVisibility() == 0) {
            val var12: TextView = this.binding.flaggedMessageRuleName;
            kotlin.jvm.internal.q.g(this.binding.flaggedMessageRuleName, "flaggedMessageRuleName");
            if (var12.getVisibility() == 0) {
               var8 = 1;
               break label17;
            }
         }

         var8 = 0;
      }

      if (var8) {
         var8 = 0;
      } else {
         var8 = 8;
      }

      var7.setVisibility(var8);
   }
}
