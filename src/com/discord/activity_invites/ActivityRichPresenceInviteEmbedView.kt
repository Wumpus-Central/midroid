package com.discord.activity_invites

import B2.f
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.GradientDrawable.Orientation
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.activity_invites.databinding.ActivityRichPresenceInviteEmbedViewBinding
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.discord.overlapping_circles.OverlappingCirclesView
import com.discord.overlapping_circles.OverlappingItem
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import java.util.ArrayList
import kotlin.jvm.internal.r

public class ActivityRichPresenceInviteEmbedView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout {
   private final val binding: ActivityRichPresenceInviteEmbedViewBinding

   fun ActivityRichPresenceInviteEmbedView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun ActivityRichPresenceInviteEmbedView(var1: Context, var2: AttributeSet) {
      r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2, var3);
      val var4: ActivityRichPresenceInviteEmbedViewBinding = ActivityRichPresenceInviteEmbedViewBinding.inflate(LayoutInflater.from(var1), this);
      r.g(var4, "inflate(...)");
      this.binding = var4;
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(
         this,
         ColorUtilsKt.getColorCompat(var1, ThemeManagerKt.getTheme().getColorRes(com.discord.theme.R.color.primary_130, com.discord.theme.R.color.primary_630)),
         SizeUtilsKt.getDpToPx(12),
         null,
         0,
         12,
         null
      );
      this.setupViews();
   }

   private fun applyGradientBackground(gradientColors: List<RGBAColorModel>?) {
      if (var1 != null && !var1.isEmpty()) {
         val var2: View = this.binding.gradientBackground;
         r.g(this.binding.gradientBackground, "gradientBackground");
         var2.setVisibility(0);
         val var7: ArrayList = new ArrayList(i.v(var1, 10));

         for (RGBAColorModel var3 : var1) {
            var7.add(Color.argb((int)(var3.getA() * (float)255), (int)var3.getR(), (int)var3.getG(), (int)var3.getB()));
         }

         val var6: IntArray = i.T0(var7);
         val var8: GradientDrawable = new GradientDrawable();
         var8.setColors(var6);
         var8.setCornerRadius((float)SizeUtilsKt.getDpToPx(12));
         var8.setOrientation(Orientation.BL_TR);
         this.binding.gradientBackground.setBackground(var8);
      } else {
         val var4: View = this.binding.gradientBackground;
         r.g(this.binding.gradientBackground, "gradientBackground");
         var4.setVisibility(8);
      }
   }

   private fun setPartyAvatars(avatarURIs: List<String>?, maxPartySize: Int) {
      label34: {
         if (var1 != null) {
            val var5: java.util.List = i.e0(var1);
            var1 = var5;
            if (var5 != null) {
               break label34;
            }
         }

         var1 = i.k();
      }

      if (!var1.isEmpty()) {
         val var12: Int = Math.max(0, var2 - var1.size());
         val var13: ArrayList = new ArrayList(i.v(var1, 10));
         val var7: java.util.Iterator = var1.iterator();

         while (var7.hasNext()) {
            var13.add(new OverlappingItem(var7.next() as java.lang.String));
         }

         val var8: Array<OverlappingItem> = new OverlappingItem[var12];

         for (int var11 = 0; var11 < var12; var11++) {
            var8[var11] = new OverlappingItem(null);
         }

         this.binding.partyAvatars.setItems(i.D0(var13, var8));
      } else {
         val var10: OverlappingCirclesView = this.binding.partyAvatars;
         r.g(this.binding.partyAvatars, "partyAvatars");
         var10.setVisibility(8);
      }
   }

   private fun setupViews() {
      var var2: TextView = this.binding.headerText;
      r.e(this.binding.headerText);
      SetTextSizeSpKt.setTextSizeSp(var2, 14.0F);
      var var1: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var2, DiscordFont.PrimarySemibold);
      var2 = this.binding.title;
      r.e(this.binding.title);
      SetTextSizeSpKt.setTextSizeSp(var2, 16.0F);
      DiscordFontUtilsKt.setDiscordFont(var2, var1);
      var2 = this.binding.subtitle;
      r.e(this.binding.subtitle);
      SetTextSizeSpKt.setTextSizeSp(var2, 12.0F);
      var1 = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var2, DiscordFont.PrimaryMedium);
      var2 = this.binding.partySizeText;
      r.e(this.binding.partySizeText);
      SetTextSizeSpKt.setTextSizeSp(var2, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var2, var1);
      var2 = this.binding.footerLabel;
      r.e(this.binding.footerLabel);
      SetTextSizeSpKt.setTextSizeSp(var2, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var2, var1);
   }

   public fun setActivityRichPresenceInviteEmbed(
      headerText: String?,
      title: String?,
      subtitle: String?,
      iconSrc: String?,
      isSpotifyParty: Boolean,
      footerLabel: String?,
      maxPartySize: Int,
      partySizeText: String?,
      partyMemberAvatarURIs: List<String>?,
      platformIconKeys: List<String>?,
      gradientColors: List<RGBAColorModel>?,
      isActive: Boolean
   ) {
      val var15: TextView = this.binding.headerText;
      r.g(this.binding.headerText, "headerText");
      ViewUtilsKt.setOptionalText(var15, var1);
      val var16: TextView = this.binding.title;
      r.g(this.binding.title, "title");
      ViewUtilsKt.setOptionalText(var16, var2);
      val var17: TextView = this.binding.subtitle;
      r.g(this.binding.subtitle, "subtitle");
      ViewUtilsKt.setOptionalText(var17, var3);
      if (var5) {
         val var18: SimpleDraweeView = this.binding.subtitleIcon;
         r.g(this.binding.subtitleIcon, "subtitleIcon");
         ReactAssetUtilsKt.setReactAsset(var18, ReactAsset.Music);
      } else {
         val var19: SimpleDraweeView = this.binding.subtitleIcon;
         r.g(this.binding.subtitleIcon, "subtitleIcon");
         ReactAssetUtilsKt.setReactAsset(var19, ReactAsset.GameController);
      }

      val var20: SimpleDraweeView = this.binding.subtitleIcon;
      r.g(this.binding.subtitleIcon, "subtitleIcon");
      val var14: Int = whiteAlpha70;
      ColorUtilsKt.setTintColor(var20, whiteAlpha70);
      val var21: TextView = this.binding.footerLabel;
      r.g(this.binding.footerLabel, "footerLabel");
      ViewUtilsKt.setOptionalText(var21, var6);
      if (var10 != null && var10.contains("xbox")) {
         val var23: SimpleDraweeView = this.binding.xboxIcon;
         r.g(this.binding.xboxIcon, "xboxIcon");
         ReactAssetUtilsKt.setReactAsset(var23, ReactAsset.XboxNeutral);
         val var24: SimpleDraweeView = this.binding.xboxIcon;
         r.g(this.binding.xboxIcon, "xboxIcon");
         ColorUtilsKt.setTintColor(var24, var14);
      } else {
         val var22: SimpleDraweeView = this.binding.xboxIcon;
         r.g(this.binding.xboxIcon, "xboxIcon");
         var22.setVisibility(8);
      }

      if (var10 != null && var10.contains("playstation")) {
         val var26: SimpleDraweeView = this.binding.playstationIcon;
         r.g(this.binding.playstationIcon, "playstationIcon");
         ReactAssetUtilsKt.setReactAsset(var26, ReactAsset.PlaystationNeutral);
         val var27: SimpleDraweeView = this.binding.playstationIcon;
         r.g(this.binding.playstationIcon, "playstationIcon");
         ColorUtilsKt.setTintColor(var27, var14);
      } else {
         val var25: SimpleDraweeView = this.binding.playstationIcon;
         r.g(this.binding.playstationIcon, "playstationIcon");
         var25.setVisibility(8);
      }

      if (var10 != null && var10.contains("desktop")) {
         val var29: SimpleDraweeView = this.binding.desktopIcon;
         r.g(this.binding.desktopIcon, "desktopIcon");
         ReactAssetUtilsKt.setReactAsset(var29, ReactAsset.Screen);
         val var30: SimpleDraweeView = this.binding.desktopIcon;
         r.g(this.binding.desktopIcon, "desktopIcon");
         ColorUtilsKt.setTintColor(var30, var14);
      } else {
         val var28: SimpleDraweeView = this.binding.desktopIcon;
         r.g(this.binding.desktopIcon, "desktopIcon");
         var28.setVisibility(8);
      }

      if (var4 != null) {
         this.binding.activityIcon.setImageURI(f.r(var4));
         val var32: SimpleDraweeView = this.binding.activityIcon;
         r.g(this.binding.activityIcon, "activityIcon");
         var32.setVisibility(0);
      } else {
         val var33: SimpleDraweeView = this.binding.activityIcon;
         r.g(this.binding.activityIcon, "activityIcon");
         var33.setVisibility(8);
      }

      this.setPartyAvatars(var9, var7);
      if (var8 != null) {
         val var34: TextView = this.binding.partySizeText;
         r.g(this.binding.partySizeText, "partySizeText");
         ViewUtilsKt.setOptionalText(var34, var8);
      } else {
         val var35: TextView = this.binding.partySizeText;
         r.g(this.binding.partySizeText, "partySizeText");
         var35.setVisibility(8);
      }

      if (!var12) {
         val var36: ConstraintLayout = this.binding.partyContainer;
         r.g(this.binding.partyContainer, "partyContainer");
         var36.setVisibility(8);
      }

      this.applyGradientBackground(var11);
      val var13: Float;
      if (var12) {
         var13 = 1.0F;
      } else {
         var13 = 0.6F;
      }

      this.setAlpha(var13);
   }

   public companion object {
      public final val whiteAlpha70: Int
   }
}
