package com.discord.chat.presentation.message

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import com.discord.chat.databinding.MessageHighlightHeaderBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.view.SimpleDraweeView

public class MessageHighlightHeader  public constructor(context: Context, attrs: AttributeSet? = null) : LinearLayout {
   private final val binding: MessageHighlightHeaderBinding

   fun MessageHighlightHeader(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2);
      val var3: MessageHighlightHeaderBinding = MessageHighlightHeaderBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var3, "inflate(...)");
      this.binding = var3;
      val var5: TextView = var3.header;
      var3.header.setTextColor(ThemeManagerKt.getTheme().getTextBrand());
      kotlin.jvm.internal.q.e(var5);
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimarySemibold);
      var5.setText(I18nUtilsKt.i18nFormat$default(var1, I18nMessage.HIGHLIGHT, null, 2, null));
      val var4: SimpleDraweeView = var3.highlightIcon;
      kotlin.jvm.internal.q.g(var3.highlightIcon, "highlightIcon");
      ReactAssetUtilsKt.setReactAsset(var4, ReactAsset.Highlight);
   }
}
