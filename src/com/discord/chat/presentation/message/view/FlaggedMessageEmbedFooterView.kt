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
      val var6: FlaggedMessageEmbedFooterViewBinding = FlaggedMessageEmbedFooterViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var6, "inflate(...)");
      this.binding = var6;
      val var4: ImageView = var6.separatorDot;
      var6.separatorDot.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModifierAccent());
      kotlin.jvm.internal.q.e(var4);
      ViewClippingUtilsKt.clipToRoundedRectangle(var4, SizeUtilsKt.getDpToPx(4));
      val var3: TextView = var6.flaggedMessageKeyword;
      kotlin.jvm.internal.q.e(var6.flaggedMessageKeyword);
      val var5: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimaryMedium);
      SetTextSizeSpKt.setTextSizeSp(var3, 12.0F, 15.0F);
      var3.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      val var7: TextView = var6.flaggedMessageRuleName;
      kotlin.jvm.internal.q.e(var6.flaggedMessageRuleName);
      DiscordFontUtilsKt.setDiscordFont(var7, var5);
      SetTextSizeSpKt.setTextSizeSp(var7, 12.0F, 15.0F);
      var7.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
   }

   public fun setAutomodContext(autoModerationContext: AutoModerationContext) {
      kotlin.jvm.internal.q.h(var1, "autoModerationContext");
      val var4: java.lang.String = var1.getKeywordDisplayText();
      val var5: java.lang.String = var1.getRuleDisplayText();
      if (var4 != null && !kotlin.jvm.internal.q.c(var4, "")) {
         this.binding.flaggedMessageKeyword.setText(var4);
      }

      if (var5 != null && !kotlin.jvm.internal.q.c(var5, "")) {
         this.binding.flaggedMessageRuleName.setText(var5);
      }

      val var6: ImageView = this.binding.separatorDot;
      kotlin.jvm.internal.q.g(this.binding.separatorDot, "separatorDot");
      var var2: Boolean;
      if (var4 != null && !kotlin.jvm.internal.q.c(var4, "") && var5 != null && !kotlin.jvm.internal.q.c(var5, "")) {
         var2 = 1;
      } else {
         var2 = 0;
      }

      if (var2) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var6.setVisibility(var2);
   }
}
