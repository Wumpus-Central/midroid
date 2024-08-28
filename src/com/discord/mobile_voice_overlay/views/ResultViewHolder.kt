package com.discord.mobile_voice_overlay.views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.mobile_voice_overlay.MobileVoiceOverlaySelectorResult
import com.discord.mobile_voice_overlay.databinding.OverlayVoiceChannelSearchResultBinding
import com.discord.primitives.ChannelId
import com.discord.theme.ThemeManagerKt
import kotlin.jvm.internal.r

private class ResultViewHolder(parent: ViewGroup,
      onChannelSelected: (ChannelId) -> Unit,
      binding: OverlayVoiceChannelSearchResultBinding = OverlayVoiceChannelSearchResultBinding.inflate(LayoutInflater.from(var1.getContext()), var1, false)
   )
   : ViewHolder {
   private final val binding: OverlayVoiceChannelSearchResultBinding
   private final val onChannelSelected: (ChannelId) -> Unit

   public final var result: MobileVoiceOverlaySelectorResult?
      internal set

   init {
      r.h(var1, "parent");
      r.h(var2, "onChannelSelected");
      r.h(var3, "binding");
      super(var3.getRoot());
      this.onChannelSelected = var2;
      this.binding = var3;
      var3.container.setOnClickListener(new h(this));
      val var4: TextView = var3.channelName;
      r.g(var3.channelName, "_init_$lambda$2");
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimarySemibold);
      var4.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      val var6: TextView = var3.categoryName;
      r.g(var3.categoryName, "_init_$lambda$3");
      val var5: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var6, DiscordFont.PrimaryMedium);
      var6.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
      val var7: TextView = var3.guildName;
      r.g(var3.guildName, "_init_$lambda$4");
      DiscordFontUtilsKt.setDiscordFont(var7, var5);
      var7.setTextColor(ThemeManagerKt.getTheme().getHeaderSecondary());
   }

   @JvmStatic
   fun `_init_$lambda$1`(var0: ResultViewHolder, var1: View) {
      r.h(var0, "this$0");
      if (var0.result != null) {
         var0.onChannelSelected.invoke(ChannelId.box-impl(var0.result.getChannelId-o4g7jtM()));
      }
   }

   public fun bind(result: MobileVoiceOverlaySelectorResult) {
      r.h(var1, "result");
      this.result = var1;
      this.binding.channelName.setText(var1.getChannelName());
      this.binding.categoryName.setText(var1.getCategoryName());
      this.binding.guildName.setText(var1.getGuildName());
   }
}
