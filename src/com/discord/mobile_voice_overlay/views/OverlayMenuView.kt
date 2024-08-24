package com.discord.mobile_voice_overlay.views

import android.content.Context
import android.content.res.ColorStateList
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData
import com.discord.mobile_voice_overlay.databinding.ViewOverlayMenuBinding
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import eh.p
import kotlin.jvm.internal.r

public class OverlayMenuView : LinearLayout {
   private final lateinit var assets: MobileVoiceOverlayAssets
   public final val binding: ViewOverlayMenuBinding

   public constructor(context: Context) : r.h(var1, "context") {
      super(var1);
      val var2: ViewOverlayMenuBinding = ViewOverlayMenuBinding.inflate(LayoutInflater.from(this.getContext()), this);
      r.g(var2, "inflate(LayoutInflater.from(context), this)");
      this.binding = var2;
      var var3: TextView = var2.overlayGuildName;
      r.g(var2.overlayGuildName, "binding.overlayGuildName");
      val var4: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimarySemibold);
      var3 = var2.overlayInviteLink;
      r.g(var2.overlayInviteLink, "binding.overlayInviteLink");
      DiscordFontUtilsKt.setDiscordFont(var3, var4);
      var3 = var2.overlaySwitchChannels;
      r.g(var2.overlaySwitchChannels, "binding.overlaySwitchChannels");
      DiscordFontUtilsKt.setDiscordFont(var3, var4);
      var3 = var2.overlayOpenApp;
      r.g(var2.overlayOpenApp, "binding.overlayOpenApp");
      DiscordFontUtilsKt.setDiscordFont(var3, var4);
      var2.menuTop.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
      var2.menuTopStatusContainer.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundTertiary());
      var2.menuTopStatusContainer.setBackgroundTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getBackgroundTertiary()));
      var2.menuBottom.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundTertiary());
      var2.overlayInviteLink.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      var2.overlaySwitchChannels.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      var2.overlayOpenApp.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      var2.overlayGuildName.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      var2.overlayChannelName.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
   }

   public constructor(context: Context, attrs: AttributeSet?) : r.h(var1, "context") {
      super(var1, var2);
      val var5: ViewOverlayMenuBinding = ViewOverlayMenuBinding.inflate(LayoutInflater.from(this.getContext()), this);
      r.g(var5, "inflate(LayoutInflater.from(context), this)");
      this.binding = var5;
      var var3: TextView = var5.overlayGuildName;
      r.g(var5.overlayGuildName, "binding.overlayGuildName");
      val var4: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimarySemibold);
      var3 = var5.overlayInviteLink;
      r.g(var5.overlayInviteLink, "binding.overlayInviteLink");
      DiscordFontUtilsKt.setDiscordFont(var3, var4);
      var3 = var5.overlaySwitchChannels;
      r.g(var5.overlaySwitchChannels, "binding.overlaySwitchChannels");
      DiscordFontUtilsKt.setDiscordFont(var3, var4);
      var3 = var5.overlayOpenApp;
      r.g(var5.overlayOpenApp, "binding.overlayOpenApp");
      DiscordFontUtilsKt.setDiscordFont(var3, var4);
      var5.menuTop.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
      var5.menuTopStatusContainer.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundTertiary());
      var5.menuTopStatusContainer.setBackgroundTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getBackgroundTertiary()));
      var5.menuBottom.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundTertiary());
      var5.overlayInviteLink.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      var5.overlaySwitchChannels.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      var5.overlayOpenApp.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      var5.overlayGuildName.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      var5.overlayChannelName.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
   }

   public constructor(context: Context, attrs: AttributeSet?, attributeSetId: Int) : r.h(var1, "context") {
      super(var1, var2, var3);
      val var6: ViewOverlayMenuBinding = ViewOverlayMenuBinding.inflate(LayoutInflater.from(this.getContext()), this);
      r.g(var6, "inflate(LayoutInflater.from(context), this)");
      this.binding = var6;
      var var4: TextView = var6.overlayGuildName;
      r.g(var6.overlayGuildName, "binding.overlayGuildName");
      val var5: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimarySemibold);
      var4 = var6.overlayInviteLink;
      r.g(var6.overlayInviteLink, "binding.overlayInviteLink");
      DiscordFontUtilsKt.setDiscordFont(var4, var5);
      var4 = var6.overlaySwitchChannels;
      r.g(var6.overlaySwitchChannels, "binding.overlaySwitchChannels");
      DiscordFontUtilsKt.setDiscordFont(var4, var5);
      var4 = var6.overlayOpenApp;
      r.g(var6.overlayOpenApp, "binding.overlayOpenApp");
      DiscordFontUtilsKt.setDiscordFont(var4, var5);
      var6.menuTop.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
      var6.menuTopStatusContainer.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundTertiary());
      var6.menuTopStatusContainer.setBackgroundTintList(ColorStateList.valueOf(ThemeManagerKt.getTheme().getBackgroundTertiary()));
      var6.menuBottom.setCardBackgroundColor(ThemeManagerKt.getTheme().getBackgroundTertiary());
      var6.overlayInviteLink.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      var6.overlaySwitchChannels.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      var6.overlayOpenApp.setTextColor(ThemeManagerKt.getTheme().getInteractiveNormal());
      var6.overlayGuildName.setTextColor(ThemeManagerKt.getTheme().getHeaderPrimary());
      var6.overlayChannelName.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
   }

   public fun setAssets(assets: MobileVoiceOverlayAssets) {
      r.h(var1, "assets");
      this.assets = var1;
      var var2: SimpleDraweeView = this.binding.muteToggle;
      this.binding.muteToggle.setContentDescription(var1.getMute());
      r.g(var2, "setAssets$lambda$0");
      ReactAssetUtilsKt.setReactAsset(var2, ReactAsset.Mic);
      ColorUtilsKt.setTintColor(var2, ThemeManagerKt.getTheme().getInteractiveNormal());
      var2 = this.binding.disconnectBtn;
      this.binding.disconnectBtn.setContentDescription(var1.getDisconnectFromVoice());
      r.g(var2, "setAssets$lambda$1");
      ReactAssetUtilsKt.setReactAsset(var2, ReactAsset.Disconnect);
      ColorUtilsKt.setTintColor(var2, ThemeManagerKt.getTheme().getInteractiveNormal());
      this.binding.overlayInviteLink.setText(var1.getGetInvite());
      this.binding.overlaySwitchChannels.setText(var1.getSwitchChannels());
      this.binding.overlayOpenApp.setText(var1.getOpenDiscord());
   }

   public fun setData(data: MobileVoiceOverlayData) {
      r.h(var1, "data");
      val var3: TextView = this.binding.overlayInviteLink;
      r.g(this.binding.overlayInviteLink, "binding.overlayInviteLink");
      var var2: Byte;
      if (var1.getCanGenerateInvite()) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var3.setVisibility(var2);
      var var4: SimpleDraweeView = this.binding.muteToggle;
      r.g(this.binding.muteToggle, "binding.muteToggle");
      val var6: ReactAsset;
      if (var1.getMuted()) {
         var6 = ReactAsset.MicMutedDark;
      } else {
         var6 = ReactAsset.Mic;
      }

      ReactAssetUtilsKt.setReactAsset(var4, var6);
      var4 = this.binding.overlayNetworkIcon;
      r.g(this.binding.overlayNetworkIcon, "binding.overlayNetworkIcon");
      var2 = OverlayMenuView.WhenMappings.$EnumSwitchMapping$0[var1.getConnectionQuality().ordinal()];
      val var8: ReactAsset;
      if (var2 != 1) {
         if (var2 != 2) {
            if (var2 != 3) {
               if (var2 != 4) {
                  throw new p();
               }

               var8 = ReactAsset.CallStatusUnknown;
            } else {
               var8 = ReactAsset.CallStatusRed;
            }
         } else {
            var8 = ReactAsset.CallStatusYellow;
         }
      } else {
         var8 = ReactAsset.CallStatusGreen;
      }

      ReactAssetUtilsKt.setReactAsset(var4, var8);
      this.binding.overlayGuildName.setText(var1.getGuildName());
      this.binding.overlayChannelName.setText(var1.getChannelName());
   }
}
