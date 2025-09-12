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
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nOverlayMenuView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlayMenuView.kt\ncom/discord/mobile_voice_overlay/views/OverlayMenuView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,82:1\n257#2,2:83\n*S KotlinDebug\n*F\n+ 1 OverlayMenuView.kt\ncom/discord/mobile_voice_overlay/views/OverlayMenuView\n*L\n66#1:83,2\n*E\n"])
public class OverlayMenuView : LinearLayout {
   public final val binding: ViewOverlayMenuBinding
   private final lateinit var assets: MobileVoiceOverlayAssets

   public constructor(context: Context) : super(var1) {
      val var2: ViewOverlayMenuBinding = ViewOverlayMenuBinding.inflate(LayoutInflater.from(this.getContext()), this);
      this.binding = var2;
      var var3: TextView = var2.overlayGuildName;
      val var4: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimarySemibold);
      var3 = var2.overlayInviteLink;
      DiscordFontUtilsKt.setDiscordFont(var3, var4);
      var3 = var2.overlaySwitchChannels;
      DiscordFontUtilsKt.setDiscordFont(var3, var4);
      var3 = var2.overlayOpenApp;
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

   public constructor(context: Context, attrs: AttributeSet?) : super(var1, var2) {
      val var5: ViewOverlayMenuBinding = ViewOverlayMenuBinding.inflate(LayoutInflater.from(this.getContext()), this);
      this.binding = var5;
      var var3: TextView = var5.overlayGuildName;
      val var4: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimarySemibold);
      var3 = var5.overlayInviteLink;
      DiscordFontUtilsKt.setDiscordFont(var3, var4);
      var3 = var5.overlaySwitchChannels;
      DiscordFontUtilsKt.setDiscordFont(var3, var4);
      var3 = var5.overlayOpenApp;
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

   public constructor(context: Context, attrs: AttributeSet?, attributeSetId: Int) : super(var1, var2, var3) {
      val var6: ViewOverlayMenuBinding = ViewOverlayMenuBinding.inflate(LayoutInflater.from(this.getContext()), this);
      this.binding = var6;
      var var4: TextView = var6.overlayGuildName;
      val var5: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimarySemibold);
      var4 = var6.overlayInviteLink;
      DiscordFontUtilsKt.setDiscordFont(var4, var5);
      var4 = var6.overlaySwitchChannels;
      DiscordFontUtilsKt.setDiscordFont(var4, var5);
      var4 = var6.overlayOpenApp;
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
      this.assets = var1;
      var var2: SimpleDraweeView = this.binding.muteToggle;
      this.binding.muteToggle.setContentDescription(var1.getMute());
      ReactAssetUtilsKt.setReactAsset(var2, ReactAsset.Mic);
      ColorUtilsKt.setTintColor(var2, ThemeManagerKt.getTheme().getInteractiveNormal());
      var2 = this.binding.disconnectBtn;
      this.binding.disconnectBtn.setContentDescription(var1.getDisconnectFromVoice());
      ReactAssetUtilsKt.setReactAsset(var2, ReactAsset.Disconnect);
      ColorUtilsKt.setTintColor(var2, ThemeManagerKt.getTheme().getInteractiveNormal());
      this.binding.overlayInviteLink.setText(var1.getGetInvite());
      this.binding.overlaySwitchChannels.setText(var1.getSwitchChannels());
      this.binding.overlayOpenApp.setText(var1.getOpenDiscord());
   }

   public fun setData(data: MobileVoiceOverlayData) {
      val var3: TextView = this.binding.overlayInviteLink;
      var var2: Byte;
      if (var1.getCanGenerateInvite()) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var3.setVisibility(var2);
      var var4: SimpleDraweeView = this.binding.muteToggle;
      val var6: ReactAsset;
      if (var1.getMuted()) {
         var6 = ReactAsset.MicMutedDark;
      } else {
         var6 = ReactAsset.Mic;
      }

      ReactAssetUtilsKt.setReactAsset(var4, var6);
      var4 = this.binding.overlayNetworkIcon;
      var2 = OverlayMenuView.WhenMappings.$EnumSwitchMapping$0[var1.getConnectionQuality().ordinal()];
      val var8: ReactAsset;
      if (var2 != 1) {
         if (var2 != 2) {
            if (var2 != 3) {
               if (var2 != 4) {
                  throw new Ca.p();
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
