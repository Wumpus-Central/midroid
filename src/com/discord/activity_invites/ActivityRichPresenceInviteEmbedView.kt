package com.discord.activity_invites

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
import kotlin.jvm.internal.SourceDebugExtension
import z2.f

@SourceDebugExtension(["SMAP\nActivityRichPresenceInviteEmbedView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityRichPresenceInviteEmbedView.kt\ncom/discord/activity_invites/ActivityRichPresenceInviteEmbedView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,204:1\n257#2,2:205\n257#2,2:207\n257#2,2:209\n257#2,2:211\n257#2,2:213\n257#2,2:215\n257#2,2:217\n257#2,2:223\n257#2,2:225\n257#2,2:227\n1557#3:219\n1628#3,3:220\n1557#3:229\n1628#3,3:230\n*S KotlinDebug\n*F\n+ 1 ActivityRichPresenceInviteEmbedView.kt\ncom/discord/activity_invites/ActivityRichPresenceInviteEmbedView\n*L\n118#1:205,2\n125#1:207,2\n132#1:209,2\n139#1:211,2\n141#1:213,2\n150#1:215,2\n154#1:217,2\n173#1:223,2\n179#1:225,2\n183#1:227,2\n169#1:219\n169#1:220,3\n186#1:229\n186#1:230,3\n*E\n"])
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
      label34: {
         if (var1 != null) {
            val var5: java.util.List = CollectionsKt.e0(var1);
            var1 = var5;
            if (var5 != null) {
               break label34;
            }
         }

         var1 = CollectionsKt.k();
      }

      if (!var1.isEmpty()) {
         val var12: Int = Math.max(0, var2 - var1.size());
         val var13: ArrayList = new ArrayList(CollectionsKt.v(var1, 10));
         val var7: java.util.Iterator = var1.iterator();

         while (var7.hasNext()) {
            var13.add(new OverlappingItem(var7.next() as java.lang.String));
         }

         val var8: Array<OverlappingItem> = new OverlappingItem[var12];

         for (int var11 = 0; var11 < var12; var11++) {
            var8[var11] = new OverlappingItem(null);
         }

         this.binding.partyAvatars.setItems(CollectionsKt.C0(var13, var8));
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
      ViewUtilsKt.setOptionalText(var15, var1);
      val var16: TextView = this.binding.title;
      ViewUtilsKt.setOptionalText(var16, var2);
      val var17: TextView = this.binding.subtitle;
      ViewUtilsKt.setOptionalText(var17, var3);
      if (var5) {
         val var18: SimpleDraweeView = this.binding.subtitleIcon;
         ReactAssetUtilsKt.setReactAsset(var18, ReactAsset.Music);
      } else {
         val var19: SimpleDraweeView = this.binding.subtitleIcon;
         ReactAssetUtilsKt.setReactAsset(var19, ReactAsset.GameController);
      }

      val var20: SimpleDraweeView = this.binding.subtitleIcon;
      val var14: Int = whiteAlpha70;
      ColorUtilsKt.setTintColor(var20, whiteAlpha70);
      val var21: TextView = this.binding.footerLabel;
      ViewUtilsKt.setOptionalText(var21, var6);
      if (var10 != null && var10.contains("xbox")) {
         val var23: SimpleDraweeView = this.binding.xboxIcon;
         ReactAssetUtilsKt.setReactAsset(var23, ReactAsset.XboxNeutral);
         val var24: SimpleDraweeView = this.binding.xboxIcon;
         ColorUtilsKt.setTintColor(var24, var14);
      } else {
         val var22: SimpleDraweeView = this.binding.xboxIcon;
         var22.setVisibility(8);
      }

      if (var10 != null && var10.contains("playstation")) {
         val var26: SimpleDraweeView = this.binding.playstationIcon;
         ReactAssetUtilsKt.setReactAsset(var26, ReactAsset.PlaystationNeutral);
         val var27: SimpleDraweeView = this.binding.playstationIcon;
         ColorUtilsKt.setTintColor(var27, var14);
      } else {
         val var25: SimpleDraweeView = this.binding.playstationIcon;
         var25.setVisibility(8);
      }

      if (var10 != null && var10.contains("desktop")) {
         val var29: SimpleDraweeView = this.binding.desktopIcon;
         ReactAssetUtilsKt.setReactAsset(var29, ReactAsset.Screen);
         val var30: SimpleDraweeView = this.binding.desktopIcon;
         ColorUtilsKt.setTintColor(var30, var14);
      } else {
         val var28: SimpleDraweeView = this.binding.desktopIcon;
         var28.setVisibility(8);
      }

      if (var4 != null) {
         this.binding.activityIcon.setImageURI(f.r(var4));
         val var32: SimpleDraweeView = this.binding.activityIcon;
         var32.setVisibility(0);
      } else {
         val var33: SimpleDraweeView = this.binding.activityIcon;
         var33.setVisibility(8);
      }

      this.setPartyAvatars(var9, var7);
      if (var8 != null) {
         val var34: TextView = this.binding.partySizeText;
         ViewUtilsKt.setOptionalText(var34, var8);
      } else {
         val var35: TextView = this.binding.partySizeText;
         var35.setVisibility(8);
      }

      if (!var12) {
         val var36: ConstraintLayout = this.binding.partyContainer;
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
