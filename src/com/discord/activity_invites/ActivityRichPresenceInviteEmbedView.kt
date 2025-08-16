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

@SourceDebugExtension(["SMAP\nActivityRichPresenceInviteEmbedView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityRichPresenceInviteEmbedView.kt\ncom/discord/activity_invites/ActivityRichPresenceInviteEmbedView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,243:1\n257#2,2:244\n257#2,2:246\n257#2,2:248\n257#2,2:250\n257#2,2:252\n257#2,2:254\n257#2,2:256\n257#2,2:258\n257#2,2:260\n257#2,2:262\n257#2,2:264\n257#2,2:266\n257#2,2:268\n257#2,2:270\n257#2,2:272\n257#2,2:274\n257#2,2:276\n257#2,2:278\n257#2,2:280\n257#2,2:282\n257#2,2:284\n257#2,2:286\n257#2,2:292\n257#2,2:294\n257#2,2:296\n257#2,2:298\n1557#3:288\n1628#3,3:289\n1557#3:300\n1628#3,3:301\n*S KotlinDebug\n*F\n+ 1 ActivityRichPresenceInviteEmbedView.kt\ncom/discord/activity_invites/ActivityRichPresenceInviteEmbedView\n*L\n106#1:244,2\n111#1:246,2\n113#1:248,2\n130#1:250,2\n133#1:252,2\n141#1:254,2\n143#1:256,2\n146#1:258,2\n150#1:260,2\n158#1:262,2\n159#1:264,2\n160#1:266,2\n161#1:268,2\n162#1:270,2\n165#1:272,2\n166#1:274,2\n172#1:276,2\n174#1:278,2\n180#1:280,2\n182#1:282,2\n188#1:284,2\n190#1:286,2\n209#1:292,2\n211#1:294,2\n217#1:296,2\n221#1:298,2\n206#1:288\n206#1:289,3\n224#1:300\n224#1:301,3\n*E\n"])
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
      if (!var7 && var8) {
         val var54: SimpleDraweeView = this.binding.activityIcon;
         ReactAssetUtilsKt.setReactAsset(var54, ReactAsset.SpotifyBrandNeutral);
         val var55: SimpleDraweeView = this.binding.activityIcon;
         var55.setVisibility(0);
      } else if (var6 != null) {
         this.binding.activityIcon.setImageURI(f.r(var6));
         val var52: SimpleDraweeView = this.binding.activityIcon;
         var52.setVisibility(0);
      } else {
         val var53: SimpleDraweeView = this.binding.activityIcon;
         var53.setVisibility(8);
      }

      val var56: TextView = this.binding.headerText;
      ViewUtilsKt.setOptionalText(var56, var5);
      val var40: TextView = this.binding.title;
      ViewUtilsKt.setOptionalText(var40, var15);
      val var41: TextView = this.binding.subtitle;
      ViewUtilsKt.setOptionalText(var41, var14);
      if (var7) {
         if (var8) {
            val var42: SimpleDraweeView = this.binding.subtitleIcon;
            ReactAssetUtilsKt.setReactAsset(var42, ReactAsset.Music);
         } else {
            val var43: SimpleDraweeView = this.binding.subtitleIcon;
            ReactAssetUtilsKt.setReactAsset(var43, ReactAsset.GameController);
         }

         val var44: SimpleDraweeView = this.binding.subtitleIcon;
         var44.setVisibility(0);
         val var45: SimpleDraweeView = this.binding.subtitleIcon;
         ColorUtilsKt.setTintColor(var45, whiteAlpha70);
      } else {
         val var46: SimpleDraweeView = this.binding.subtitleIcon;
         var46.setVisibility(8);
      }

      this.setPartyAvatars(var11, var9);
      if (var12 != null) {
         val var47: TextView = this.binding.partySizeText;
         ViewUtilsKt.setOptionalText(var47, var12);
         val var48: TextView = this.binding.partySizeText;
         var48.setVisibility(0);
      } else {
         val var49: TextView = this.binding.partySizeText;
         var49.setVisibility(8);
      }

      val var50: ConstraintLayout = this.binding.partyContainer;
      val var57: Byte;
      if (var7) {
         var57 = 0;
      } else {
         var57 = 8;
      }

      var50.setVisibility(var57);
      if (var2 != null) {
         val var39: DCDButton = this.binding.button;
         var39.setVisibility(0);
         this.binding.button.setOnClickButtonListener(var10);
         this.binding.button.setBackgroundColor(ThemeManagerKt.getTheme().getRedesignButtonPrimaryOverlayBackground());
         this.binding.button.setTextColor(ThemeManagerKt.getTheme().getRedesignButtonPrimaryOverlayText());
         this.binding.button.setText(var2);
         this.binding.button.setClickable(var1);
         val var16: Float;
         if (var1) {
            var16 = 1.0F;
         } else {
            var16 = 0.5F;
         }

         this.binding.button.setAlpha(var16);
         val var19: ConstraintLayout = this.binding.footerContainer;
         var19.setVisibility(8);
         val var20: TextView = this.binding.footerLabel;
         var20.setVisibility(8);
         val var21: SimpleDraweeView = this.binding.xboxIcon;
         var21.setVisibility(8);
         val var22: SimpleDraweeView = this.binding.playstationIcon;
         var22.setVisibility(8);
         val var23: SimpleDraweeView = this.binding.desktopIcon;
         var23.setVisibility(8);
      } else {
         this.binding.button.setOnClickButtonListener(null);
         val var24: DCDButton = this.binding.button;
         var24.setVisibility(8);
         val var25: ConstraintLayout = this.binding.footerContainer;
         var25.setVisibility(0);
         val var26: TextView = this.binding.footerLabel;
         ViewUtilsKt.setOptionalText(var26, var3);
         if (var13 != null && var13.contains("xbox")) {
            val var28: SimpleDraweeView = this.binding.xboxIcon;
            ReactAssetUtilsKt.setReactAsset(var28, ReactAsset.XboxNeutral);
            val var29: SimpleDraweeView = this.binding.xboxIcon;
            ColorUtilsKt.setTintColor(var29, whiteAlpha70);
            val var30: SimpleDraweeView = this.binding.xboxIcon;
            var30.setVisibility(0);
         } else {
            val var27: SimpleDraweeView = this.binding.xboxIcon;
            var27.setVisibility(8);
         }

         if (var13 != null && var13.contains("playstation")) {
            val var32: SimpleDraweeView = this.binding.playstationIcon;
            ReactAssetUtilsKt.setReactAsset(var32, ReactAsset.PlaystationNeutral);
            val var33: SimpleDraweeView = this.binding.playstationIcon;
            ColorUtilsKt.setTintColor(var33, whiteAlpha70);
            val var34: SimpleDraweeView = this.binding.playstationIcon;
            var34.setVisibility(0);
         } else {
            val var31: SimpleDraweeView = this.binding.playstationIcon;
            var31.setVisibility(8);
         }

         if (var13 != null && var13.contains("desktop")) {
            val var36: SimpleDraweeView = this.binding.desktopIcon;
            ReactAssetUtilsKt.setReactAsset(var36, ReactAsset.Screen);
            val var37: SimpleDraweeView = this.binding.desktopIcon;
            ColorUtilsKt.setTintColor(var37, whiteAlpha70);
            val var38: SimpleDraweeView = this.binding.desktopIcon;
            var38.setVisibility(0);
         } else {
            val var35: SimpleDraweeView = this.binding.desktopIcon;
            var35.setVisibility(8);
         }
      }

      this.applyGradientBackground(var4);
      val var58: Float;
      if (var7) {
         var58 = 1.0F;
      } else {
         var58 = 0.6F;
      }

      this.setAlpha(var58);
   }

   public companion object {
      public final val whiteAlpha70: Int
   }
}
