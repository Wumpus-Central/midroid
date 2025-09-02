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
import z2.f

@SourceDebugExtension(["SMAP\nActivityRichPresenceInviteEmbedView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityRichPresenceInviteEmbedView.kt\ncom/discord/activity_invites/ActivityRichPresenceInviteEmbedView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,252:1\n257#2,2:253\n257#2,2:255\n257#2,2:257\n257#2,2:259\n257#2,2:261\n257#2,2:263\n257#2,2:265\n257#2,2:267\n257#2,2:269\n257#2,2:271\n257#2,2:273\n257#2,2:275\n257#2,2:277\n257#2,2:279\n257#2,2:281\n257#2,2:283\n257#2,2:285\n257#2,2:287\n257#2,2:289\n257#2,2:291\n257#2,2:293\n257#2,2:295\n257#2,2:301\n257#2,2:303\n257#2,2:305\n257#2,2:307\n1557#3:297\n1628#3,3:298\n1557#3:309\n1628#3,3:310\n*S KotlinDebug\n*F\n+ 1 ActivityRichPresenceInviteEmbedView.kt\ncom/discord/activity_invites/ActivityRichPresenceInviteEmbedView\n*L\n107#1:253,2\n112#1:255,2\n114#1:257,2\n131#1:259,2\n134#1:261,2\n142#1:263,2\n144#1:265,2\n147#1:267,2\n151#1:269,2\n165#1:271,2\n169#1:273,2\n175#1:275,2\n177#1:277,2\n183#1:279,2\n185#1:281,2\n191#1:283,2\n193#1:285,2\n196#1:287,2\n197#1:289,2\n198#1:291,2\n199#1:293,2\n200#1:295,2\n218#1:301,2\n220#1:303,2\n226#1:305,2\n230#1:307,2\n215#1:297\n215#1:298,3\n233#1:309\n233#1:310,3\n*E\n"])
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
      val var4: ActivityRichPresenceInviteEmbedViewBinding = ActivityRichPresenceInviteEmbedViewBinding.inflate(LayoutInflater.from(var1), this);
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
         var2.setVisibility(0);
         val var7: ArrayList = new ArrayList(CollectionsKt.v(var1, 10));

         for (RGBAColorModel var3 : var1) {
            var7.add(Color.argb((int)(var3.getA() * (float)255), (int)var3.getR(), (int)var3.getG(), (int)var3.getB()));
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
      label34: {
         if (var1 != null) {
            val var4: java.util.List = CollectionsKt.e0(var1);
            var1 = var4;
            if (var4 != null) {
               break label34;
            }
         }

         var1 = CollectionsKt.k();
      }

      if (!var1.isEmpty()) {
         val var3: Int = Math.max(0, var2 - var1.size());
         val var12: ArrayList = new ArrayList(CollectionsKt.v(var1, 10));
         val var6: java.util.Iterator = var1.iterator();

         while (var6.hasNext()) {
            var12.add(new OverlappingItem(var6.next() as java.lang.String));
         }

         val var7: Array<OverlappingItem> = new OverlappingItem[var3];

         for (int var11 = 0; var11 < var3; var11++) {
            var7[var11] = new OverlappingItem(null);
         }

         this.binding.partyAvatars.setItems(CollectionsKt.C0(var12, var7));
         val var9: OverlappingCirclesView = this.binding.partyAvatars;
         var9.setVisibility(0);
      } else {
         val var10: OverlappingCirclesView = this.binding.partyAvatars;
         var10.setVisibility(8);
      }
   }

   private fun setupViews() {
      var var2: TextView = this.binding.headerText;
      SetTextSizeSpKt.setTextSizeSp(var2, 14.0F);
      var var1: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var2, DiscordFont.PrimarySemibold);
      var2 = this.binding.title;
      SetTextSizeSpKt.setTextSizeSp(var2, 16.0F);
      DiscordFontUtilsKt.setDiscordFont(var2, var1);
      var2 = this.binding.subtitle;
      SetTextSizeSpKt.setTextSizeSp(var2, 12.0F);
      var1 = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var2, DiscordFont.PrimaryMedium);
      var2 = this.binding.partySizeText;
      SetTextSizeSpKt.setTextSizeSp(var2, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var2, var1);
      var2 = this.binding.footerLabel;
      SetTextSizeSpKt.setTextSizeSp(var2, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var2, var1);
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
      if (!var8 && var9) {
         val var56: SimpleDraweeView = this.binding.activityIcon;
         ReactAssetUtilsKt.setReactAsset(var56, ReactAsset.SpotifyBrandNeutral);
         val var57: SimpleDraweeView = this.binding.activityIcon;
         var57.setVisibility(0);
      } else if (var7 != null) {
         this.binding.activityIcon.setImageURI(f.r(var7));
         val var54: SimpleDraweeView = this.binding.activityIcon;
         var54.setVisibility(0);
      } else {
         val var55: SimpleDraweeView = this.binding.activityIcon;
         var55.setVisibility(8);
      }

      val var58: TextView = this.binding.headerText;
      ViewUtilsKt.setOptionalText(var58, var6);
      val var41: TextView = this.binding.title;
      ViewUtilsKt.setOptionalText(var41, var16);
      val var42: TextView = this.binding.subtitle;
      ViewUtilsKt.setOptionalText(var42, var15);
      if (var8) {
         if (var9) {
            val var43: SimpleDraweeView = this.binding.subtitleIcon;
            ReactAssetUtilsKt.setReactAsset(var43, ReactAsset.Music);
         } else {
            val var44: SimpleDraweeView = this.binding.subtitleIcon;
            ReactAssetUtilsKt.setReactAsset(var44, ReactAsset.GameController);
         }

         val var45: SimpleDraweeView = this.binding.subtitleIcon;
         var45.setVisibility(0);
         val var46: SimpleDraweeView = this.binding.subtitleIcon;
         ColorUtilsKt.setTintColor(var46, whiteAlpha70);
      } else {
         val var47: SimpleDraweeView = this.binding.subtitleIcon;
         var47.setVisibility(8);
      }

      this.setPartyAvatars(var12, var10);
      if (var13 != null) {
         val var48: TextView = this.binding.partySizeText;
         ViewUtilsKt.setOptionalText(var48, var13);
         val var49: TextView = this.binding.partySizeText;
         var49.setVisibility(0);
      } else {
         val var50: TextView = this.binding.partySizeText;
         var50.setVisibility(8);
      }

      val var51: ConstraintLayout = this.binding.partyContainer;
      val var60: Byte;
      if (var8) {
         var60 = 0;
      } else {
         var60 = 8;
      }

      var51.setVisibility(var60);
      if (var2 != null) {
         val var52: DCDButton = this.binding.button;
         var52.setVisibility(0);
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
         val var21: DCDButton = this.binding.button;
         var21.setVisibility(8);
      }

      if (var4 != null && var4.length() > 0) {
         val var27: ConstraintLayout = this.binding.footerContainer;
         var27.setVisibility(0);
         val var28: TextView = this.binding.footerLabel;
         ViewUtilsKt.setOptionalText(var28, var4);
         if (var14 != null && var14.contains("xbox")) {
            val var30: SimpleDraweeView = this.binding.xboxIcon;
            ReactAssetUtilsKt.setReactAsset(var30, ReactAsset.XboxNeutral);
            val var31: SimpleDraweeView = this.binding.xboxIcon;
            ColorUtilsKt.setTintColor(var31, whiteAlpha70);
            val var32: SimpleDraweeView = this.binding.xboxIcon;
            var32.setVisibility(0);
         } else {
            val var29: SimpleDraweeView = this.binding.xboxIcon;
            var29.setVisibility(8);
         }

         if (var14 != null && var14.contains("playstation")) {
            val var34: SimpleDraweeView = this.binding.playstationIcon;
            ReactAssetUtilsKt.setReactAsset(var34, ReactAsset.PlaystationNeutral);
            val var35: SimpleDraweeView = this.binding.playstationIcon;
            ColorUtilsKt.setTintColor(var35, whiteAlpha70);
            val var36: SimpleDraweeView = this.binding.playstationIcon;
            var36.setVisibility(0);
         } else {
            val var33: SimpleDraweeView = this.binding.playstationIcon;
            var33.setVisibility(8);
         }

         if (var14 != null && var14.contains("desktop")) {
            val var38: SimpleDraweeView = this.binding.desktopIcon;
            ReactAssetUtilsKt.setReactAsset(var38, ReactAsset.Screen);
            val var39: SimpleDraweeView = this.binding.desktopIcon;
            ColorUtilsKt.setTintColor(var39, whiteAlpha70);
            val var40: SimpleDraweeView = this.binding.desktopIcon;
            var40.setVisibility(0);
         } else {
            val var37: SimpleDraweeView = this.binding.desktopIcon;
            var37.setVisibility(8);
         }
      } else {
         val var22: ConstraintLayout = this.binding.footerContainer;
         var22.setVisibility(8);
         val var23: TextView = this.binding.footerLabel;
         var23.setVisibility(8);
         val var24: SimpleDraweeView = this.binding.xboxIcon;
         var24.setVisibility(8);
         val var25: SimpleDraweeView = this.binding.playstationIcon;
         var25.setVisibility(8);
         val var26: SimpleDraweeView = this.binding.desktopIcon;
         var26.setVisibility(8);
      }

      this.applyGradientBackground(var5);
      val var61: Float;
      if (var8) {
         var61 = 1.0F;
      } else {
         var61 = 0.6F;
      }

      this.setAlpha(var61);
   }

   public companion object {
      public final val whiteAlpha70: Int
   }
}
