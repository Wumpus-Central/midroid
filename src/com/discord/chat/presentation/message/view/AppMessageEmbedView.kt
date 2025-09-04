package com.discord.chat.presentation.message.view

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.GradientDrawable.Orientation
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.codedlinks.AppMessageActionImpl
import com.discord.chat.bridge.codedlinks.AppMessageEmbedImpl
import com.discord.chat.databinding.AppMessageEmbedViewBinding
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.media.MediaContainingViewResizer
import com.discord.chat.presentation.message.MessageAccessoriesView
import com.discord.core.DCDButton
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.overlapping_circles.OverlappingCirclesView
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.R
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import java.util.Locale
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nAppMessageEmbedView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppMessageEmbedView.kt\ncom/discord/chat/presentation/message/view/AppMessageEmbedView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,290:1\n257#2,2:291\n257#2,2:293\n257#2,2:295\n257#2,2:297\n257#2,2:299\n257#2,2:301\n257#2,2:303\n257#2,2:305\n257#2,2:307\n257#2,2:309\n257#2,2:311\n257#2,2:313\n257#2,2:315\n257#2,2:317\n257#2,2:322\n257#2,2:324\n1872#3,3:319\n*S KotlinDebug\n*F\n+ 1 AppMessageEmbedView.kt\ncom/discord/chat/presentation/message/view/AppMessageEmbedView\n*L\n90#1:291,2\n91#1:293,2\n101#1:295,2\n104#1:297,2\n107#1:299,2\n108#1:301,2\n112#1:303,2\n128#1:305,2\n135#1:307,2\n142#1:309,2\n149#1:311,2\n150#1:313,2\n154#1:315,2\n159#1:317,2\n221#1:322,2\n223#1:324,2\n175#1:319,3\n*E\n"])
public class AppMessageEmbedView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout(var1, var2, var3) {
   public final var view: AppMessageEmbedViewBinding
      internal set

   private final var gradientDrawable: GradientDrawable?
   private final val textColor: Int

   fun AppMessageEmbedView(var1: Context) {
      this(var1, null, 0, 6, null);
   }

   fun AppMessageEmbedView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   init {
      val var4: AppMessageEmbedViewBinding = AppMessageEmbedViewBinding.inflate(LayoutInflater.from(var1), this);
      this.view = var4;
      this.textColor = ColorUtilsKt.getColorCompat(var1, R.color.primary_230);
      this.setDefaultBackground(this);
   }

   private fun handleTap(eventHandler: ChatEventHandler, data: AppMessageEmbedImpl, actionId: String) {
      val var5: java.lang.String = var2.getMessageId();
      val var6: java.lang.String = var2.getAppId();
      val var4: java.lang.String = var2.getEmbedUrl();
      var var7: java.lang.String = var4;
      if (var4 == null) {
         var7 = "";
      }

      var1.onTapAppMessageEmbed(var5, var3, var6, var7);
   }

   @JvmStatic
   fun `initView$lambda$10`(var0: AppMessageEmbedView, var1: ChatEventHandler, var2: AppMessageEmbedImpl, var3: View) {
      var0.handleTap(var1, var2, "link_copied");
   }

   @JvmStatic
   fun `initView$lambda$13$lambda$12`(var0: AppMessageEmbedView, var1: ChatEventHandler, var2: AppMessageEmbedImpl, var3: java.lang.String, var4: View) {
      var0.handleTap(var1, var2, var3);
   }

   @JvmStatic
   fun `initView$lambda$9`(var0: AppMessageEmbedView, var1: ChatEventHandler, var2: AppMessageEmbedImpl, var3: View) {
      var0.handleTap(var1, var2, "link_copied");
   }

   private fun rgbToColorInt(map: Map<String, Int>): Int? {
      val var3: Int = var1.get("r") as Int;
      val var2: Int = var1.get("g") as Int;
      val var4: Int = var1.get("b") as Int;
      if (var3 == null || var2 == null || var4 == null) {
         return null;
      } else {
         return if (var3 == 0 && var2 == 0 && var4 == 0) null else Color.rgb(var3, var2, var4);
      }
   }

   public fun initView(data: AppMessageEmbedImpl, eventHandler: ChatEventHandler, constrainedWidth: Int) {
      val var13: AppMessageEmbedViewBinding = this.view;
      var var14: TextView = this.view.title;
      this.view.title.setTextColor(this.textColor);
      SetTextSizeSpKt.setTextSizeSp(var14, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var14, DiscordFont.PrimaryExtraBold);
      var14 = var13.header;
      var13.header.setTextColor(this.textColor);
      SetTextSizeSpKt.setTextSizeSp(var14, 16.0F);
      DiscordFontUtilsKt.setDiscordFont(var14, DiscordFont.PrimarySemibold);
      var14 = var13.info;
      var13.info.setTextColor(this.textColor);
      SetTextSizeSpKt.setTextSizeSp(var14, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var14, DiscordFont.PrimaryMedium);
      var var15: TextView = var13.tagline;
      var13.tagline.setTextColor(this.textColor);
      SetTextSizeSpKt.setTextSizeSp(var15, 12.0F);
      val var51: DiscordFont = DiscordFont.PrimaryNormal;
      DiscordFontUtilsKt.setDiscordFont(var15, DiscordFont.PrimaryNormal);
      var var16: DCDButton = var13.linkIcon;
      val var56: Context = var13.linkIcon.getContext();
      var16.setBackgroundColor(ColorUtilsKt.getColorCompat(var56, R.color.transparent));
      val var57: ReactAsset = ReactAsset.Link;
      var var17: Context = var16.getContext();
      var16.setIcon(var57.getUri(var17), SizeUtilsKt.getDpToPx(16));
      var16.setTextColor(this.textColor);
      var16 = var13.linkIconTitle;
      var17 = var13.linkIconTitle.getContext();
      var16.setBackgroundColor(ColorUtilsKt.getColorCompat(var17, R.color.transparent));
      var17 = var16.getContext();
      var16.setIcon(var57.getUri(var17), SizeUtilsKt.getDpToPx(16));
      var16.setTextColor(this.textColor);
      val var58: SimpleDraweeView = var13.playerIcon;
      ReactAssetUtilsKt.setReactAsset(var58, ReactAsset.Members);
      ColorUtilsKt.setTintColor(var58, this.textColor);
      val var59: OverlappingCirclesView = var13.participants;
      var59.setVisibility(8);
      var15 = var13.participantsText;
      var15.setVisibility(8);
      val var32: TextView = var13.participantsText;
      var13.participantsText.setTextColor(this.textColor);
      SetTextSizeSpKt.setTextSizeSp(var32, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var32, var51);
      this.view.header.setText(var1.getHeader());
      val var33: TextView = this.view.header;
      var var8: Boolean;
      if (var1.getHeader() != null) {
         var8 = 1;
      } else {
         var8 = 0;
      }

      if (var8) {
         var8 = 0;
      } else {
         var8 = 8;
      }

      var33.setVisibility(var8);
      this.view.info.setText(var1.getInfo());
      val var34: TextView = this.view.info;
      var var24: Boolean;
      if (var1.getInfo() != null) {
         var24 = 1;
      } else {
         var24 = 0;
      }

      if (var24) {
         var24 = 0;
      } else {
         var24 = 8;
      }

      var34.setVisibility(var24);
      this.view.tagline.setText(var1.getTagline());
      val var35: TextView = this.view.tagline;
      var var26: Boolean;
      if (var1.getTagline() != null) {
         var26 = 1;
      } else {
         var26 = 0;
      }

      if (var26) {
         var26 = 0;
      } else {
         var26 = 8;
      }

      var35.setVisibility(var26);
      val var36: SimpleDraweeView = this.view.playerIcon;
      var var28: Boolean;
      if (var1.getTagline() != null) {
         var28 = 1;
      } else {
         var28 = 0;
      }

      if (var28) {
         var28 = 0;
      } else {
         var28 = 8;
      }

      var36.setVisibility(var28);
      if (var1.getStaticBannerSrc() != null) {
         val var37: SimpleDraweeView = this.view.banner;
         var37.setVisibility(0);
         this.view.banner.setImageURI(var1.getStaticBannerSrc());
         var3 = MessageAccessoriesView.Companion.getWidth(var3, false);
         var var4: Double;
         if (var1.getBannerRatio() == "activity") {
            var4 = 1.7777777777777777;
         } else {
            var4 = 2.8333333333333335;
         }

         var4 = var3 / var4;
         val var38: MediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
         val var52: SimpleDraweeView = this.view.banner;
         var38.resizeLayoutParams(var52, var3, (int)var4, var3, (int)var4, MediaContainingViewResizer.ResizeMode.Fill);
      } else {
         val var39: SimpleDraweeView = this.view.banner;
         var39.setVisibility(8);
      }

      if (var1.getTitle() != null) {
         var14 = this.view.title;
         val var40: java.lang.String = var1.getTitle().toUpperCase(Locale.ROOT);
         var14.setText(var40);
      } else {
         val var41: TextView = this.view.title;
         var41.setVisibility(8);
      }

      if (var1.getIconSrc() != null) {
         this.view.appIcon.setImageURI(var1.getIconSrc());
      } else {
         val var42: SimpleDraweeView = this.view.appIcon;
         var42.setVisibility(8);
      }

      this.setBackgroundGradient(this, var1);
      val var43: DCDButton = this.view.linkIcon;
      var43.setVisibility(8);
      val var44: DCDButton = this.view.linkIconTitle;
      var44.setVisibility(8);
      if (var1.getEmbedUrl() != null) {
         if (var1.getTitle() != null) {
            val var45: DCDButton = this.view.linkIconTitle;
            var45.setVisibility(0);
            this.view.linkIconTitle.setOnClickButtonListener(new b(this, var2, var1));
         } else {
            val var46: DCDButton = this.view.linkIcon;
            var46.setVisibility(0);
            this.view.linkIcon.setOnClickButtonListener(new c(this, var2, var1));
         }
      }

      val var47: java.util.List = var1.getActions();
      if (var47 != null && !var47.isEmpty()) {
         this.view.actionsContainer.removeAllViews();
         val var6: Float = 1.0F / var1.getActions().size();
         val var48: java.util.Iterator = CollectionsKt.D0(var1.getActions()).iterator();

         for (int var21 = 0; var48.hasNext(); var21++) {
            var14 = (TextView)var48.next();
            if (var21 < 0) {
               CollectionsKt.u();
            }

            val var63: AppMessageActionImpl = var14 as AppMessageActionImpl;
            val var31: Boolean;
            if (var21 == var1.getActions().size() - 1) {
               var31 = true;
            } else {
               var31 = false;
            }

            val var61: java.lang.String = var63.getLabel();
            val var55: java.lang.String = var63.getId();
            val var64: java.lang.Boolean = var63.getDisabled();
            val var12: Boolean;
            if (var64 != null) {
               var12 = var64;
            } else {
               var12 = false;
            }

            val var65: Context = this.getContext();
            var var9: Int = ColorUtilsKt.getColorCompat(var65, R.color.white_500);
            val var66: Context = this.getContext();
            val var11: Int = ColorUtilsKt.getColorCompat(var66, R.color.black_500);
            val var10: Int;
            if (var31) {
               var10 = var9;
            } else {
               var10 = y.c.k(var9, 30);
            }

            if (var31) {
               var9 = var11;
            }

            val var67: android.widget.LinearLayout.LayoutParams = new android.widget.LinearLayout.LayoutParams(0, -2);
            var67.weight = var6;
            if (var21 > 0) {
               var67.setMarginStart(SizeUtilsKt.getDpToPx(8));
            }

            var17 = this.getContext();
            val var71: DCDButton = new DCDButton(var17, null, 2, null);
            val var7: Float;
            if (var12) {
               var7 = 0.5F;
            } else {
               var7 = 1.0F;
            }

            var71.setAlpha(var7);
            var71.setText(var61);
            var71.setBackgroundColor(var10);
            var71.setTextColor(var9);
            var71.setTextSizeSp(14.0F);
            var71.setDiscordFont(DiscordFont.PrimaryMedium);
            var71.setCornerRadius(SizeUtilsKt.getDpToPx(8));
            var71.setLayoutParams(var67);
            var71.setOnClickButtonListener(new d(this, var2, var1, var55));
            this.view.actionsContainer.addView(var71);
         }

         val var19: LinearLayout = this.view.actionsContainer;
         var19.setVisibility(0);
      } else {
         val var18: LinearLayout = this.view.actionsContainer;
         var18.setVisibility(8);
      }
   }

   public fun setBackgroundGradient(view: View, data: AppMessageEmbedImpl) {
      if (var2.getGradientColors() != null) {
         if (var2.getGradientColors().size() == 2) {
            val var3: Int = this.rgbToColorInt(var2.getGradientColors().get(0));
            val var5: Int = this.rgbToColorInt(var2.getGradientColors().get(1));
            if (var3 != null && var5 != null && var3 != 0 && var5 != 0) {
               if (this.gradientDrawable == null) {
                  val var4: GradientDrawable = new GradientDrawable();
                  var4.setCornerRadius((float)SizeUtilsKt.getDpToPx(12));
                  var4.setOrientation(Orientation.BL_TR);
                  this.gradientDrawable = var4;
               }

               if (this.gradientDrawable != null) {
                  this.gradientDrawable.setColors(new int[]{var3, var5});
               }

               var1.setBackground(this.gradientDrawable);
            }
         }
      }
   }

   public fun setDefaultBackground(view: View) {
      val var2: Context = this.getContext();
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(
         var1,
         ColorUtilsKt.getColorCompat(var2, ThemeManagerKt.getTheme().getColorRes(R.color.primary_130, R.color.primary_630)),
         SizeUtilsKt.getDpToPx(12),
         null,
         0,
         12,
         null
      );
   }
}
