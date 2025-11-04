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
import ba.f
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
import com.discord.theme.R.color
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import java.util.ArrayList
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nActivityRichPresenceInviteEmbedView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityRichPresenceInviteEmbedView.kt\ncom/discord/activity_invites/ActivityRichPresenceInviteEmbedView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,261:1\n257#2,2:262\n257#2,2:264\n257#2,2:266\n257#2,2:268\n257#2,2:270\n257#2,2:272\n257#2,2:274\n257#2,2:276\n257#2,2:278\n257#2,2:280\n257#2,2:282\n257#2,2:284\n257#2,2:286\n257#2,2:288\n257#2,2:290\n257#2,2:292\n257#2,2:294\n257#2,2:296\n257#2,2:298\n257#2,2:300\n257#2,2:302\n257#2,2:304\n257#2,2:310\n257#2,2:312\n257#2,2:314\n257#2,2:316\n257#2,2:322\n1557#3:306\n1628#3,3:307\n1557#3:318\n1628#3,3:319\n*S KotlinDebug\n*F\n+ 1 ActivityRichPresenceInviteEmbedView.kt\ncom/discord/activity_invites/ActivityRichPresenceInviteEmbedView\n*L\n105#1:262,2\n110#1:264,2\n112#1:266,2\n129#1:268,2\n132#1:270,2\n140#1:272,2\n142#1:274,2\n145#1:276,2\n149#1:278,2\n163#1:280,2\n167#1:282,2\n173#1:284,2\n175#1:286,2\n181#1:288,2\n183#1:290,2\n189#1:292,2\n191#1:294,2\n194#1:296,2\n195#1:298,2\n196#1:300,2\n197#1:302,2\n198#1:304,2\n219#1:310,2\n221#1:312,2\n227#1:314,2\n231#1:316,2\n254#1:322,2\n216#1:306\n216#1:307,3\n234#1:318\n234#1:319,3\n*E\n"])
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
         val var7: java.lang.Iterable = var1;
         val var5: ArrayList = new ArrayList(CollectionsKt.w(var1, 10));

         for (RGBAColorModel var3 : var7) {
            var5.add(Color.argb((int)(var3.getA() * (float)255), (int)var3.getR(), (int)var3.getG(), (int)var3.getB()));
         }

         val var6: IntArray = CollectionsKt.g1(var5);
         val var9: GradientDrawable = new GradientDrawable();
         var9.setColors(var6);
         var9.setCornerRadius((float)SizeUtilsKt.getDpToPx(12));
         var9.setOrientation(Orientation.BL_TR);
         this.binding.gradientBackground.setBackground(var9);
      } else {
         val var4: View = this.binding.gradientBackground;
         var4.setVisibility(8);
      }
   }

   private fun setCoverImage(coverImageUrl: String?) {
      val var4: SimpleDraweeView = this.binding.coverImage;
      var var2: Boolean;
      if (var1 != null) {
         var2 = 1;
      } else {
         var2 = 0;
      }

      if (var2) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var4.setVisibility(var2);
      if (var1 != null) {
         this.binding.coverImage.setImageURI(f.r(var1));
      }
   }

   private fun setPartyAvatars(avatarURIs: List<String>?, maxPartySize: Int) {
      var var4: java.util.List = var1;
      if (var1 == null) {
         var4 = CollectionsKt.l();
      }

      if (var4.isEmpty()) {
         val var8: OverlappingCirclesView = this.binding.partyAvatars;
         var8.setVisibility(8);
      } else {
         val var3: Int = Math.max(0, var2 - var4.size());
         val var5: ArrayList = new ArrayList(CollectionsKt.w(var4, 10));
         val var11: java.util.Iterator = var4.iterator();

         while (var11.hasNext()) {
            var5.add(new OverlappingItem(var11.next() as java.lang.String));
         }

         val var12: Array<OverlappingItem> = new OverlappingItem[var3];

         for (int var9 = 0; var9 < var3; var9++) {
            var12[var9] = new OverlappingItem(null);
         }

         this.binding.partyAvatars.setItems(CollectionsKt.N0(var5, var12));
         val var7: OverlappingCirclesView = this.binding.partyAvatars;
         var7.setVisibility(0);
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
      coverImageUrl: String?,
      subtitle: String?,
      title: String?
   ) {
      val var20: Context = this.getContext();
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(
         this,
         ColorUtilsKt.getColorCompat(var20, ThemeManagerKt.getTheme().getColorRes(color.primary_130, color.primary_630)),
         SizeUtilsKt.getDpToPx(12),
         null,
         0,
         12,
         null
      );
      if (!var8 && var9) {
         val var58: SimpleDraweeView = this.binding.activityIcon;
         ReactAssetUtilsKt.setReactAsset(var58, ReactAsset.SpotifyBrandNeutral);
         val var59: SimpleDraweeView = this.binding.activityIcon;
         var59.setVisibility(0);
      } else if (var7 != null) {
         this.binding.activityIcon.setImageURI(f.r(var7));
         val var56: SimpleDraweeView = this.binding.activityIcon;
         var56.setVisibility(0);
      } else {
         val var57: SimpleDraweeView = this.binding.activityIcon;
         var57.setVisibility(8);
      }

      val var60: TextView = this.binding.headerText;
      ViewUtilsKt.setOptionalText(var60, var6);
      val var43: TextView = this.binding.title;
      ViewUtilsKt.setOptionalText(var43, var17);
      val var44: TextView = this.binding.subtitle;
      ViewUtilsKt.setOptionalText(var44, var16);
      if (var8) {
         if (var9) {
            val var45: SimpleDraweeView = this.binding.subtitleIcon;
            ReactAssetUtilsKt.setReactAsset(var45, ReactAsset.Music);
         } else {
            val var46: SimpleDraweeView = this.binding.subtitleIcon;
            ReactAssetUtilsKt.setReactAsset(var46, ReactAsset.GameController);
         }

         val var47: SimpleDraweeView = this.binding.subtitleIcon;
         var47.setVisibility(0);
         val var48: SimpleDraweeView = this.binding.subtitleIcon;
         ColorUtilsKt.setTintColor(var48, whiteAlpha70);
      } else {
         val var49: SimpleDraweeView = this.binding.subtitleIcon;
         var49.setVisibility(8);
      }

      this.setPartyAvatars(var12, var10);
      if (var13 != null) {
         val var50: TextView = this.binding.partySizeText;
         ViewUtilsKt.setOptionalText(var50, var13);
         val var51: TextView = this.binding.partySizeText;
         var51.setVisibility(0);
      } else {
         val var52: TextView = this.binding.partySizeText;
         var52.setVisibility(8);
      }

      val var53: ConstraintLayout = this.binding.partyContainer;
      val var62: Byte;
      if (var8) {
         var62 = 0;
      } else {
         var62 = 8;
      }

      var53.setVisibility(var62);
      if (var2 != null) {
         val var54: DCDButton = this.binding.button;
         var54.setVisibility(0);
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

         val var18: Float;
         if (var1) {
            var18 = 1.0F;
         } else {
            var18 = 0.5F;
         }

         this.binding.button.setAlpha(var18);
         this.binding.button.setLoading(var3, true);
      } else {
         this.binding.button.setOnClickButtonListener(null);
         val var23: DCDButton = this.binding.button;
         var23.setVisibility(8);
      }

      if (var4 != null && var4.length() > 0) {
         val var29: ConstraintLayout = this.binding.footerContainer;
         var29.setVisibility(0);
         val var30: TextView = this.binding.footerLabel;
         ViewUtilsKt.setOptionalText(var30, var4);
         if (var14 != null && var14.contains("xbox")) {
            val var32: SimpleDraweeView = this.binding.xboxIcon;
            ReactAssetUtilsKt.setReactAsset(var32, ReactAsset.XboxNeutral);
            val var33: SimpleDraweeView = this.binding.xboxIcon;
            ColorUtilsKt.setTintColor(var33, whiteAlpha70);
            val var34: SimpleDraweeView = this.binding.xboxIcon;
            var34.setVisibility(0);
         } else {
            val var31: SimpleDraweeView = this.binding.xboxIcon;
            var31.setVisibility(8);
         }

         if (var14 != null && var14.contains("playstation")) {
            val var36: SimpleDraweeView = this.binding.playstationIcon;
            ReactAssetUtilsKt.setReactAsset(var36, ReactAsset.PlaystationNeutral);
            val var37: SimpleDraweeView = this.binding.playstationIcon;
            ColorUtilsKt.setTintColor(var37, whiteAlpha70);
            val var38: SimpleDraweeView = this.binding.playstationIcon;
            var38.setVisibility(0);
         } else {
            val var35: SimpleDraweeView = this.binding.playstationIcon;
            var35.setVisibility(8);
         }

         if (var14 != null && var14.contains("desktop")) {
            val var40: SimpleDraweeView = this.binding.desktopIcon;
            ReactAssetUtilsKt.setReactAsset(var40, ReactAsset.Screen);
            val var41: SimpleDraweeView = this.binding.desktopIcon;
            ColorUtilsKt.setTintColor(var41, whiteAlpha70);
            val var42: SimpleDraweeView = this.binding.desktopIcon;
            var42.setVisibility(0);
         } else {
            val var39: SimpleDraweeView = this.binding.desktopIcon;
            var39.setVisibility(8);
         }
      } else {
         val var24: ConstraintLayout = this.binding.footerContainer;
         var24.setVisibility(8);
         val var25: TextView = this.binding.footerLabel;
         var25.setVisibility(8);
         val var26: SimpleDraweeView = this.binding.xboxIcon;
         var26.setVisibility(8);
         val var27: SimpleDraweeView = this.binding.playstationIcon;
         var27.setVisibility(8);
         val var28: SimpleDraweeView = this.binding.desktopIcon;
         var28.setVisibility(8);
      }

      this.setCoverImage(var15);
      this.applyGradientBackground(var5);
      val var63: Float;
      if (var8) {
         var63 = 1.0F;
      } else {
         var63 = 0.6F;
      }

      this.setAlpha(var63);
   }

   public companion object {
      public final val whiteAlpha70: Int
   }
}
