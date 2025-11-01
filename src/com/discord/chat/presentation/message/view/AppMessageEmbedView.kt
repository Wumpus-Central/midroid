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
import android.widget.LinearLayout.LayoutParams
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
      val var14: AppMessageEmbedViewBinding = this.view;
      var var15: TextView = this.view.title;
      this.view.title.setTextColor(this.textColor);
      SetTextSizeSpKt.setTextSizeSp(var15, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var15, DiscordFont.PrimaryExtraBold);
      var15 = var14.header;
      var14.header.setTextColor(this.textColor);
      SetTextSizeSpKt.setTextSizeSp(var15, 16.0F);
      DiscordFontUtilsKt.setDiscordFont(var15, DiscordFont.PrimarySemibold);
      var15 = var14.info;
      var14.info.setTextColor(this.textColor);
      SetTextSizeSpKt.setTextSizeSp(var15, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var15, DiscordFont.PrimaryMedium);
      var var16: TextView = var14.tagline;
      var14.tagline.setTextColor(this.textColor);
      SetTextSizeSpKt.setTextSizeSp(var16, 12.0F);
      val var53: DiscordFont = DiscordFont.PrimaryNormal;
      DiscordFontUtilsKt.setDiscordFont(var16, DiscordFont.PrimaryNormal);
      var var17: DCDButton = var14.linkIcon;
      val var58: Context = var14.linkIcon.getContext();
      var17.setBackgroundColor(ColorUtilsKt.getColorCompat(var58, R.color.transparent));
      val var59: ReactAsset = ReactAsset.Link;
      var var18: Context = var17.getContext();
      var17.setIcon(var59.getUri(var18), SizeUtilsKt.getDpToPx(16));
      var17.setTextColor(this.textColor);
      var17 = var14.linkIconTitle;
      var18 = var14.linkIconTitle.getContext();
      var17.setBackgroundColor(ColorUtilsKt.getColorCompat(var18, R.color.transparent));
      var18 = var17.getContext();
      var17.setIcon(var59.getUri(var18), SizeUtilsKt.getDpToPx(16));
      var17.setTextColor(this.textColor);
      val var60: SimpleDraweeView = var14.playerIcon;
      ReactAssetUtilsKt.setReactAsset(var60, ReactAsset.Members);
      ColorUtilsKt.setTintColor(var60, this.textColor);
      val var61: OverlappingCirclesView = var14.participants;
      var61.setVisibility(8);
      var16 = var14.participantsText;
      var16.setVisibility(8);
      val var34: TextView = var14.participantsText;
      var14.participantsText.setTextColor(this.textColor);
      SetTextSizeSpKt.setTextSizeSp(var34, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var34, var53);
      this.view.header.setText(var1.getHeader());
      val var35: TextView = this.view.header;
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

      var35.setVisibility(var8);
      this.view.info.setText(var1.getInfo());
      val var36: TextView = this.view.info;
      var var25: Boolean;
      if (var1.getInfo() != null) {
         var25 = 1;
      } else {
         var25 = 0;
      }

      if (var25) {
         var25 = 0;
      } else {
         var25 = 8;
      }

      var36.setVisibility(var25);
      this.view.tagline.setText(var1.getTagline());
      val var37: TextView = this.view.tagline;
      var var27: Boolean;
      if (var1.getTagline() != null) {
         var27 = 1;
      } else {
         var27 = 0;
      }

      if (var27) {
         var27 = 0;
      } else {
         var27 = 8;
      }

      var37.setVisibility(var27);
      val var38: SimpleDraweeView = this.view.playerIcon;
      var var29: Boolean;
      if (var1.getTagline() != null) {
         var29 = 1;
      } else {
         var29 = 0;
      }

      if (var29) {
         var29 = (byte)0;
      } else {
         var29 = (byte)8;
      }

      var38.setVisibility(var29);
      if (var1.getStaticBannerSrc() != null) {
         val var39: SimpleDraweeView = this.view.banner;
         var39.setVisibility(0);
         this.view.banner.setImageURI(var1.getStaticBannerSrc());
         var29 = MessageAccessoriesView.Companion.getWidth(var3, false);
         var var4: Double;
         if (var1.getBannerRatio() == "activity") {
            var4 = 1.7777777777777777;
         } else {
            var4 = 2.8333333333333335;
         }

         var4 = var29 / var4;
         val var40: MediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
         val var54: SimpleDraweeView = this.view.banner;
         var40.resizeLayoutParams(var54, var29, (int)var4, var29, (int)var4, MediaContainingViewResizer.ResizeMode.Fill);
      } else {
         val var41: SimpleDraweeView = this.view.banner;
         var41.setVisibility(8);
      }

      if (var1.getTitle() != null) {
         val var42: TextView = this.view.title;
         val var55: java.lang.String = var1.getTitle().toUpperCase(Locale.ROOT);
         var42.setText(var55);
      } else {
         val var43: TextView = this.view.title;
         var43.setVisibility(8);
      }

      if (var1.getIconSrc() != null) {
         this.view.appIcon.setImageURI(var1.getIconSrc());
      } else {
         val var44: SimpleDraweeView = this.view.appIcon;
         var44.setVisibility(8);
      }

      this.setBackgroundGradient(this, var1);
      val var45: DCDButton = this.view.linkIcon;
      var45.setVisibility(8);
      val var46: DCDButton = this.view.linkIconTitle;
      var46.setVisibility(8);
      if (var1.getEmbedUrl() != null) {
         if (var1.getTitle() != null) {
            val var47: DCDButton = this.view.linkIconTitle;
            var47.setVisibility(0);
            this.view.linkIconTitle.setOnClickButtonListener(new b(this, var2, var1));
         } else {
            val var48: DCDButton = this.view.linkIcon;
            var48.setVisibility(0);
            this.view.linkIcon.setOnClickButtonListener(new c(this, var2, var1));
         }
      }

      val var49: java.util.Collection = var1.getActions();
      if (var49 != null && !var49.isEmpty()) {
         this.view.actionsContainer.removeAllViews();
         val var6: Float = 1.0F / var1.getActions().size();
         val var50: java.util.Iterator = CollectionsKt.O0(var1.getActions()).iterator();
         var3 = 0;

         for (byte var32 = 8; var50.hasNext(); var3++) {
            var15 = (TextView)var50.next();
            if (var3 < 0) {
               CollectionsKt.v();
            }

            val var65: AppMessageActionImpl = var15 as AppMessageActionImpl;
            val var33: Boolean;
            if (var3 == var1.getActions().size() - 1) {
               var33 = true;
            } else {
               var33 = false;
            }

            val var57: java.lang.String = var65.getLabel();
            val var63: java.lang.String = var65.getId();
            val var66: java.lang.Boolean = var65.getDisabled();
            val var13: Boolean;
            if (var66 != null) {
               var13 = var66;
            } else {
               var13 = false;
            }

            val var67: Context = this.getContext();
            var var11: Int = ColorUtilsKt.getColorCompat(var67, R.color.white_500);
            val var68: Context = this.getContext();
            val var12: Int = ColorUtilsKt.getColorCompat(var68, R.color.black_500);
            val var10: Int;
            if (var33) {
               var10 = var11;
            } else {
               var10 = x2.c.l(var11, 30);
            }

            if (var33) {
               var11 = var12;
            }

            val var69: LayoutParams = new LayoutParams(0, -2);
            var69.weight = var6;
            if (var3 > 0) {
               var69.setMarginStart(SizeUtilsKt.getDpToPx((int)var32));
            }

            var18 = this.getContext();
            val var73: DCDButton = new DCDButton(var18, null, 2, null);
            val var7: Float;
            if (var13) {
               var7 = 0.5F;
            } else {
               var7 = 1.0F;
            }

            var73.setAlpha(var7);
            var73.setText(var57);
            var73.setBackgroundColor(var10);
            var73.setTextColor(var11);
            var73.setTextSizeSp(14.0F);
            var73.setDiscordFont(DiscordFont.PrimaryMedium);
            var73.setCornerRadius(SizeUtilsKt.getDpToPx((int)var32));
            var73.setLayoutParams(var69);
            var73.setOnClickButtonListener(new d(this, var2, var1, var63));
            this.view.actionsContainer.addView(var73);
         }

         val var20: LinearLayout = this.view.actionsContainer;
         var20.setVisibility(0);
      } else {
         val var19: LinearLayout = this.view.actionsContainer;
         var19.setVisibility(8);
      }
   }

   public fun setBackgroundGradient(view: View, data: AppMessageEmbedImpl) {
      if (var2.getGradientColors() != null && var2.getGradientColors().size() == 2) {
         val var3: Int = this.rgbToColorInt(var2.getGradientColors().get(0) as MutableMap<java.lang.String, Int>);
         val var5: Int = this.rgbToColorInt(var2.getGradientColors().get(1) as MutableMap<java.lang.String, Int>);
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
