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
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nFlaggedMessageEmbedFooterView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlaggedMessageEmbedFooterView.kt\ncom/discord/chat/presentation/message/view/FlaggedMessageEmbedFooterView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,58:1\n257#2,2:59\n*S KotlinDebug\n*F\n+ 1 FlaggedMessageEmbedFooterView.kt\ncom/discord/chat/presentation/message/view/FlaggedMessageEmbedFooterView\n*L\n55#1:59,2\n*E\n"])
public class FlaggedMessageEmbedFooterView  public constructor(context: Context, attrs: AttributeSet? = null) : ConstraintLayout(var1, var2) {
   private final val binding: FlaggedMessageEmbedFooterViewBinding

   fun FlaggedMessageEmbedFooterView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      val var6: FlaggedMessageEmbedFooterViewBinding = FlaggedMessageEmbedFooterViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var6;
      val var4: ImageView = var6.separatorDot;
      var6.separatorDot.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModifierAccent());
      ViewClippingUtilsKt.clipToRoundedRectangle(var4, SizeUtilsKt.getDpToPx(4));
      val var3: TextView = var6.flaggedMessageKeyword;
      val var5: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimaryMedium);
      SetTextSizeSpKt.setTextSizeSp(var3, 12.0F, 15.0F);
      var3.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      val var7: TextView = var6.flaggedMessageRuleName;
      DiscordFontUtilsKt.setDiscordFont(var7, var5);
      SetTextSizeSpKt.setTextSizeSp(var7, 12.0F, 15.0F);
      var7.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
   }

   public fun setAutomodContext(autoModerationContext: AutoModerationContext) {
      val var4: java.lang.String = var1.getKeywordDisplayText();
      val var5: java.lang.String = var1.getRuleDisplayText();
      if (var4 != null && !(var4 == "")) {
         this.binding.flaggedMessageKeyword.setText(var4);
      }

      if (var5 != null && !(var5 == "")) {
         this.binding.flaggedMessageRuleName.setText(var5);
      }

      val var6: ImageView = this.binding.separatorDot;
      var var2: Boolean;
      if (var4 != null && !(var4 == "") && var5 != null && !(var5 == "")) {
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
