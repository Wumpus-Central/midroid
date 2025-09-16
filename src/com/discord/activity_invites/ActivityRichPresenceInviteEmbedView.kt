package com.discord.activity_invites

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.GradientDrawable.Orientation
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.activity_invites.databinding.ActivityRichPresenceInviteEmbedViewBinding
import com.discord.core.DCDButton
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
import kotlin.jvm.internal.SourceDebugExtension
import y2.f

@SourceDebugExtension(["SMAP\nActivityRichPresenceInviteEmbedView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityRichPresenceInviteEmbedView.kt\ncom/discord/activity_invites/ActivityRichPresenceInviteEmbedView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,249:1\n257#2,2:250\n257#2,2:252\n257#2,2:254\n257#2,2:256\n257#2,2:258\n257#2,2:260\n257#2,2:262\n257#2,2:264\n257#2,2:266\n257#2,2:268\n257#2,2:270\n257#2,2:272\n257#2,2:274\n257#2,2:276\n257#2,2:278\n257#2,2:280\n257#2,2:282\n257#2,2:284\n257#2,2:286\n257#2,2:288\n257#2,2:290\n257#2,2:292\n257#2,2:298\n257#2,2:300\n257#2,2:302\n257#2,2:304\n1557#3:294\n1628#3,3:295\n1557#3:306\n1628#3,3:307\n*S KotlinDebug\n*F\n+ 1 ActivityRichPresenceInviteEmbedView.kt\ncom/discord/activity_invites/ActivityRichPresenceInviteEmbedView\n*L\n104#1:250,2\n109#1:252,2\n111#1:254,2\n128#1:256,2\n131#1:258,2\n139#1:260,2\n141#1:262,2\n144#1:264,2\n148#1:266,2\n162#1:268,2\n166#1:270,2\n172#1:272,2\n174#1:274,2\n180#1:276,2\n182#1:278,2\n188#1:280,2\n190#1:282,2\n193#1:284,2\n194#1:286,2\n195#1:288,2\n196#1:290,2\n197#1:292,2\n215#1:298,2\n217#1:300,2\n223#1:302,2\n227#1:304,2\n212#1:294\n212#1:295,3\n230#1:306\n230#1:307,3\n*E\n"])
public class ActivityRichPresenceInviteEmbedView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout(
      var1, var2, var3
   ) {
   private final val binding: ActivityRichPresenceInviteEmbedViewBinding

   fun ActivityRichPresenceInviteEmbedView(var1: Context) {
      this(var1, null, 0, 6, null);
   }

   fun ActivityRichPresenceInviteEmbedView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   init {
      val var5: ActivityRichPresenceInviteEmbedViewBinding = ActivityRichPresenceInviteEmbedViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var5;
      var var4: TextView = var5.headerText;
      SetTextSizeSpKt.setTextSizeSp(var4, 14.0F);
      val var7: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimarySemibold);
      var4 = var5.title;
      SetTextSizeSpKt.setTextSizeSp(var4, 16.0F);
      DiscordFontUtilsKt.setDiscordFont(var4, var7);
      var4 = var5.subtitle;
      SetTextSizeSpKt.setTextSizeSp(var4, 12.0F);
      val var8: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryMedium);
      var4 = var5.partySizeText;
      SetTextSizeSpKt.setTextSizeSp(var4, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var4, var8);
      val var6: TextView = var5.footerLabel;
      SetTextSizeSpKt.setTextSizeSp(var6, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var6, var8);
   }

   private fun applyGradientBackground(gradientColors: List<RGBAColorModel>?) {
      if (var1 != null && !var1.isEmpty()) {
         val var2: View = this.binding.gradientBackground;
         var2.setVisibility(0);
         val var7: ArrayList = new ArrayList(CollectionsKt.v(var1, 10));

         for (RGBAColorModel var5 : var1) {
            var7.add(Color.argb((int)(var5.getA() * (float)255), (int)var5.getR(), (int)var5.getG(), (int)var5.getB()));
         }

         val var8: IntArray = CollectionsKt.S0(var7);
         val var6: GradientDrawable = new GradientDrawable();
         var6.setColors(var8);
         var6.setCornerRadius((float)SizeUtilsKt.getDpToPx(12));
         var6.setOrientation(Orientation.BL_TR);
         this.binding.gradientBackground.setBackground(var6);
      } else {
         val var4: View = this.binding.gradientBackground;
         var4.setVisibility(8);
      }
   }

   private fun setPartyAvatars(avatarURIs: List<String>?, maxPartySize: Int) {
      var var4: java.util.List = var1;
      if (var1 == null) {
         var4 = CollectionsKt.k();
      }

      if (!var4.isEmpty()) {
         val var3: Int = Math.max(0, var2 - var4.size());
         val var5: ArrayList = new ArrayList(CollectionsKt.v(var4, 10));
         val var10: java.util.Iterator = var4.iterator();

         while (var10.hasNext()) {
            var5.add(new OverlappingItem(var10.next() as java.lang.String));
         }

         val var11: Array<OverlappingItem> = new OverlappingItem[var3];

         for (int var9 = 0; var9 < var3; var9++) {
            var11[var9] = new OverlappingItem(null);
         }

         this.binding.partyAvatars.setItems(CollectionsKt.C0(var5, var11));
         val var7: OverlappingCirclesView = this.binding.partyAvatars;
         var7.setVisibility(0);
      } else {
         val var8: OverlappingCirclesView = this.binding.partyAvatars;
         var8.setVisibility(8);
      }
   }

   public fun setActivityRichPresenceInviteEmbed(
      ctaButtonEnabled: Boolean,
      ctaButtonText: String?,
      ctaButtonIsLoading: Boolean,
      footerLabel: String?,
      gradientColors: List<RGBAColorModel>?,
      headerText: String?,
      iconSrc: String?,
      isActive: Boolean,
      isSpotifyParty: Boolean,
      maxPartySize: Int,
      onTapJoinRichPresence: OnClickListener,
      partyMemberAvatarURIs: List<String>?,
      partySizeText: String?,
      platformIconKeys: List<String>?,
      subtitle: String?,
      title: String?
   ) {
      val var19: Context = this.getContext();
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(
         this,
         ColorUtilsKt.getColorCompat(var19, ThemeManagerKt.getTheme().getColorRes(com.discord.theme.R.color.primary_130, com.discord.theme.R.color.primary_630)),
         SizeUtilsKt.getDpToPx(12),
         null,
         0,
         12,
         null
      );
      if (!var8 && var9) {
         val var57: SimpleDraweeView = this.binding.activityIcon;
         ReactAssetUtilsKt.setReactAsset(var57, ReactAsset.SpotifyBrandNeutral);
         val var58: SimpleDraweeView = this.binding.activityIcon;
         var58.setVisibility(0);
      } else if (var7 != null) {
         this.binding.activityIcon.setImageURI(f.r(var7));
         val var55: SimpleDraweeView = this.binding.activityIcon;
         var55.setVisibility(0);
      } else {
         val var56: SimpleDraweeView = this.binding.activityIcon;
         var56.setVisibility(8);
      }

      val var59: TextView = this.binding.headerText;
      ViewUtilsKt.setOptionalText(var59, var6);
      val var42: TextView = this.binding.title;
      ViewUtilsKt.setOptionalText(var42, var16);
      val var43: TextView = this.binding.subtitle;
      ViewUtilsKt.setOptionalText(var43, var15);
      if (var8) {
         if (var9) {
            val var44: SimpleDraweeView = this.binding.subtitleIcon;
            ReactAssetUtilsKt.setReactAsset(var44, ReactAsset.Music);
         } else {
            val var45: SimpleDraweeView = this.binding.subtitleIcon;
            ReactAssetUtilsKt.setReactAsset(var45, ReactAsset.GameController);
         }

         val var46: SimpleDraweeView = this.binding.subtitleIcon;
         var46.setVisibility(0);
         val var47: SimpleDraweeView = this.binding.subtitleIcon;
         ColorUtilsKt.setTintColor(var47, whiteAlpha70);
      } else {
         val var48: SimpleDraweeView = this.binding.subtitleIcon;
         var48.setVisibility(8);
      }

      this.setPartyAvatars(var12, var10);
      if (var13 != null) {
         val var49: TextView = this.binding.partySizeText;
         ViewUtilsKt.setOptionalText(var49, var13);
         val var50: TextView = this.binding.partySizeText;
         var50.setVisibility(0);
      } else {
         val var51: TextView = this.binding.partySizeText;
         var51.setVisibility(8);
      }

      val var52: ConstraintLayout = this.binding.partyContainer;
      val var61: Byte;
      if (var8) {
         var61 = 0;
      } else {
         var61 = 8;
      }

      var52.setVisibility(var61);
      if (var2 != null) {
         val var53: DCDButton = this.binding.button;
         var53.setVisibility(0);
         this.binding.button.setBackgroundColor(ThemeManagerKt.getTheme().getRedesignButtonPrimaryOverlayBackground());
         this.binding.button.setTextColor(ThemeManagerKt.getTheme().getRedesignButtonPrimaryOverlayText());
         this.binding.button.setText(var2);
         if (var1 && !var3) {
            var9 = true;
         } else {
            var9 = false;
         }

         this.binding.button.setClickable(var9);
         if (var1) {
            this.binding.button.setOnClickButtonListener(var11);
         } else {
            this.binding.button.setOnClickButtonListener(null);
         }

         val var17: Float;
         if (var1) {
            var17 = 1.0F;
         } else {
            var17 = 0.5F;
         }

         this.binding.button.setAlpha(var17);
         this.binding.button.setLoading(var3, true);
      } else {
         this.binding.button.setOnClickButtonListener(null);
         val var22: DCDButton = this.binding.button;
         var22.setVisibility(8);
      }

      if (var4 != null && var4.length() > 0) {
         val var28: ConstraintLayout = this.binding.footerContainer;
         var28.setVisibility(0);
         val var29: TextView = this.binding.footerLabel;
         ViewUtilsKt.setOptionalText(var29, var4);
         if (var14 != null && var14.contains("xbox")) {
            val var31: SimpleDraweeView = this.binding.xboxIcon;
            ReactAssetUtilsKt.setReactAsset(var31, ReactAsset.XboxNeutral);
            val var32: SimpleDraweeView = this.binding.xboxIcon;
            ColorUtilsKt.setTintColor(var32, whiteAlpha70);
            val var33: SimpleDraweeView = this.binding.xboxIcon;
            var33.setVisibility(0);
         } else {
            val var30: SimpleDraweeView = this.binding.xboxIcon;
            var30.setVisibility(8);
         }

         if (var14 != null && var14.contains("playstation")) {
            val var35: SimpleDraweeView = this.binding.playstationIcon;
            ReactAssetUtilsKt.setReactAsset(var35, ReactAsset.PlaystationNeutral);
            val var36: SimpleDraweeView = this.binding.playstationIcon;
            ColorUtilsKt.setTintColor(var36, whiteAlpha70);
            val var37: SimpleDraweeView = this.binding.playstationIcon;
            var37.setVisibility(0);
         } else {
            val var34: SimpleDraweeView = this.binding.playstationIcon;
            var34.setVisibility(8);
         }

         if (var14 != null && var14.contains("desktop")) {
            val var39: SimpleDraweeView = this.binding.desktopIcon;
            ReactAssetUtilsKt.setReactAsset(var39, ReactAsset.Screen);
            val var40: SimpleDraweeView = this.binding.desktopIcon;
            ColorUtilsKt.setTintColor(var40, whiteAlpha70);
            val var41: SimpleDraweeView = this.binding.desktopIcon;
            var41.setVisibility(0);
         } else {
            val var38: SimpleDraweeView = this.binding.desktopIcon;
            var38.setVisibility(8);
         }
      } else {
         val var23: ConstraintLayout = this.binding.footerContainer;
         var23.setVisibility(8);
         val var24: TextView = this.binding.footerLabel;
         var24.setVisibility(8);
         val var25: SimpleDraweeView = this.binding.xboxIcon;
         var25.setVisibility(8);
         val var26: SimpleDraweeView = this.binding.playstationIcon;
         var26.setVisibility(8);
         val var27: SimpleDraweeView = this.binding.desktopIcon;
         var27.setVisibility(8);
      }

      this.applyGradientBackground(var5);
      val var62: Float;
      if (var8) {
         var62 = 1.0F;
      } else {
         var62 = 0.6F;
      }

      this.setAlpha(var62);
   }

   public companion object {
      public final val whiteAlpha70: Int
   }
}
