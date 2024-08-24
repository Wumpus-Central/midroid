package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import com.discord.chat.databinding.ForwardHeaderViewBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_strings.I18nMessage
import com.discord.react_strings.I18nUtilsKt
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration.SpacingProviderView
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView

public class ForwardHeaderView  public constructor(context: Context, attrs: AttributeSet? = null) : LinearLayout, SpacingProviderView {
   public final val binding: ForwardHeaderViewBinding

   fun ForwardHeaderView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2);
      val var3: ForwardHeaderViewBinding = ForwardHeaderViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var3, "inflate(LayoutInflater.from(context), this)");
      this.binding = var3;
      this.setGravity(16);
      var3.getRoot().setPadding(0, SizeUtilsKt.getDpToPx(2), 0, 0);
      val var4: SimpleDraweeView = var3.icon;
      kotlin.jvm.internal.r.g(var3.icon, "binding.icon");
      ReactAssetUtilsKt.setReactAsset(var4, ReactAsset.ChatArrowRightIcon);
      val var5: SimpleDraweeView = var3.icon;
      kotlin.jvm.internal.r.g(var3.icon, "binding.icon");
      ColorUtilsKt.setTintColor(var5, ThemeManagerKt.getTheme().getTextLowContrast());
      val var6: TextView = var3.label;
      kotlin.jvm.internal.r.g(var3.label, "binding.label");
      DiscordFontUtilsKt.setDiscordFont(var6, DiscordFont.PrimarySemiboldItalic);
      val var7: TextView = var3.label;
      kotlin.jvm.internal.r.g(var3.label, "binding.label");
      I18nUtilsKt.i18nSetText$default(var7, I18nMessage.MESSAGE_FORWARDED, null, 2, null);
      var3.label.setTextColor(ThemeManagerKt.getTheme().getTextLowContrast());
   }

   public fun setIcon(useOldIcon: Boolean) {
      if (var1) {
         val var2: SimpleDraweeView = this.binding.icon;
         kotlin.jvm.internal.r.g(this.binding.icon, "binding.icon");
         ReactAssetUtilsKt.setReactAsset(var2, ReactAsset.ArrowAngleRightUpIcon);
      } else {
         val var3: SimpleDraweeView = this.binding.icon;
         kotlin.jvm.internal.r.g(this.binding.icon, "binding.icon");
         ReactAssetUtilsKt.setReactAsset(var3, ReactAsset.ChatArrowRightIcon);
      }

      val var4: SimpleDraweeView = this.binding.icon;
      kotlin.jvm.internal.r.g(this.binding.icon, "binding.icon");
      ColorUtilsKt.setTintColor(var4, ThemeManagerKt.getTheme().getTextLowContrast());
   }

   public open fun spacingPxOverride(): Int {
      return SizeUtilsKt.getDpToPx(4);
   }
}
