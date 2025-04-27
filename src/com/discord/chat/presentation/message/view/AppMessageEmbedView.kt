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
import com.discord.chat.presentation.message.messagepart.AppMessageEmbedAccessory
import com.discord.core.DCDButton
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewBackgroundUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.R
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView

public class AppMessageEmbedView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout {
   private final var gradientDrawable: GradientDrawable?
   private final val textColor: Int
   private final val view: AppMessageEmbedViewBinding

   fun AppMessageEmbedView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun AppMessageEmbedView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2, var3);
      val var6: AppMessageEmbedViewBinding = AppMessageEmbedViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var6, "inflate(...)");
      this.view = var6;
      var3 = ColorUtilsKt.getColorCompat(var1, R.color.primary_230);
      this.textColor = var3;
      var var4: TextView = var6.header;
      var6.header.setTextColor(var3);
      kotlin.jvm.internal.q.e(var4);
      SetTextSizeSpKt.setTextSizeSp(var4, 16.0F);
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimarySemibold);
      var4 = var6.info;
      var6.info.setTextColor(var3);
      kotlin.jvm.internal.q.e(var4);
      SetTextSizeSpKt.setTextSizeSp(var4, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryMedium);
      var4 = var6.tagline;
      var6.tagline.setTextColor(var3);
      kotlin.jvm.internal.q.e(var4);
      SetTextSizeSpKt.setTextSizeSp(var4, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryNormal);
      val var10: DCDButton = var6.linkIcon;
      var6.linkIcon.setBackgroundColor(ColorUtilsKt.getColorCompat(var1, R.color.transparent));
      var10.setIcon(ReactAsset.Link.getUri(var1), SizeUtilsKt.getDpToPx(16));
      var10.setTextColor(var3);
      val var5: SimpleDraweeView = var6.playerIcon;
      kotlin.jvm.internal.q.e(var6.playerIcon);
      ReactAssetUtilsKt.setReactAsset(var5, ReactAsset.Members);
      ColorUtilsKt.setTintColor(var5, var3);
      this.setDefaultBackground();
   }

   private fun handleTap(eventHandler: ChatEventHandler, data: AppMessageEmbedImpl, actionId: String) {
      val var6: java.lang.String = var2.getMessageId();
      val var5: java.lang.String = var2.getAppId();
      val var4: java.lang.String = var2.getEmbedUrl();
      var var7: java.lang.String = var4;
      if (var4 == null) {
         var7 = "";
      }

      var1.onTapAppMessageEmbed(var6, var3, var5, var7);
   }

   @JvmStatic
   fun `initView$lambda$6`(var0: AppMessageEmbedView, var1: ChatEventHandler, var2: AppMessageEmbedImpl, var3: View) {
      kotlin.jvm.internal.q.h(var0, "this$0");
      kotlin.jvm.internal.q.h(var1, "$eventHandler");
      kotlin.jvm.internal.q.h(var2, "$data");
      var0.handleTap(var1, var2, "link_copied");
   }

   @JvmStatic
   fun `initView$lambda$9$lambda$8`(var0: AppMessageEmbedView, var1: ChatEventHandler, var2: AppMessageEmbedImpl, var3: java.lang.String, var4: View) {
      kotlin.jvm.internal.q.h(var0, "this$0");
      kotlin.jvm.internal.q.h(var1, "$eventHandler");
      kotlin.jvm.internal.q.h(var2, "$data");
      kotlin.jvm.internal.q.h(var3, "$id");
      var0.handleTap(var1, var2, var3);
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

   private fun setBackgroundGradient(startColor: Int, endColor: Int) {
      if (this.gradientDrawable == null) {
         val var3: GradientDrawable = new GradientDrawable();
         var3.setCornerRadius((float)SizeUtilsKt.getDpToPx(12));
         var3.setOrientation(Orientation.BL_TR);
         this.gradientDrawable = var3;
      }

      if (this.gradientDrawable != null) {
         this.gradientDrawable.setColors(new int[]{var1, var2});
      }

      this.setBackground(this.gradientDrawable);
   }

   private fun setDefaultBackground() {
      val var1: Context = this.getContext();
      kotlin.jvm.internal.q.g(var1, "getContext(...)");
      ViewBackgroundUtilsKt.setBackgroundRectangle$default(
         this,
         ColorUtilsKt.getColorCompat(var1, ThemeManagerKt.getTheme().getColorRes(R.color.primary_130, R.color.primary_630)),
         SizeUtilsKt.getDpToPx(12),
         null,
         0,
         12,
         null
      );
   }

   public fun initView(acc: AppMessageEmbedAccessory, eventHandler: ChatEventHandler) {
      kotlin.jvm.internal.q.h(var1, "acc");
      kotlin.jvm.internal.q.h(var2, "eventHandler");
      val var13: AppMessageEmbedImpl = var1.getAppMessageEmbed();
      this.view.header.setText(var13.getHeader());
      var var14: TextView = this.view.header;
      kotlin.jvm.internal.q.g(this.view.header, "header");
      var var7: Boolean;
      if (var13.getHeader() != null) {
         var7 = 1;
      } else {
         var7 = 0;
      }

      if (var7) {
         var7 = 0;
      } else {
         var7 = 8;
      }

      var14.setVisibility(var7);
      this.view.info.setText(var13.getInfo());
      var14 = this.view.info;
      kotlin.jvm.internal.q.g(this.view.info, "info");
      var var30: Boolean;
      if (var13.getInfo() != null) {
         var30 = 1;
      } else {
         var30 = 0;
      }

      if (var30) {
         var30 = 0;
      } else {
         var30 = 8;
      }

      var14.setVisibility(var30);
      this.view.tagline.setText(var13.getTagline());
      var14 = this.view.tagline;
      kotlin.jvm.internal.q.g(this.view.tagline, "tagline");
      var var32: Boolean;
      if (var13.getTagline() != null) {
         var32 = 1;
      } else {
         var32 = 0;
      }

      if (var32) {
         var32 = (byte)0;
      } else {
         var32 = (byte)8;
      }

      var14.setVisibility(var32);
      if (var13.getStaticBannerSrc() != null) {
         val var39: SimpleDraweeView = this.view.banner;
         kotlin.jvm.internal.q.g(this.view.banner, "banner");
         var39.setVisibility(0);
         this.view.banner.setImageURI(var13.getStaticBannerSrc());
         var32 = MessageAccessoriesView.Companion.getWidth(var1.getConstrainedWidth(), false);
         var var3: Double;
         if (kotlin.jvm.internal.q.c(var13.getBannerRatio(), "activity")) {
            var3 = 1.7777777777777777;
         } else {
            var3 = 2.8333333333333335;
         }

         var3 = var32 / var3;
         val var40: MediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
         val var18: SimpleDraweeView = this.view.banner;
         kotlin.jvm.internal.q.g(this.view.banner, "banner");
         var40.resizeLayoutParams(var18, var32, (int)var3, var32, (int)var3, MediaContainingViewResizer.ResizeMode.Fill);
      } else {
         val var19: SimpleDraweeView = this.view.banner;
         kotlin.jvm.internal.q.g(this.view.banner, "banner");
         var19.setVisibility(8);
      }

      if (var13.getIconSrc() != null) {
         this.view.appIcon.setImageURI(var13.getIconSrc());
      } else {
         val var20: SimpleDraweeView = this.view.appIcon;
         kotlin.jvm.internal.q.g(this.view.appIcon, "appIcon");
         var20.setVisibility(8);
      }

      if (var13.getGradientColors() != null && var13.getGradientColors().size() == 2) {
         val var21: Int = this.rgbToColorInt(var13.getGradientColors().get(0));
         val var41: Int = this.rgbToColorInt(var13.getGradientColors().get(1));
         if (var21 != null && var41 != null) {
            this.setBackgroundGradient(var21, var41);
         }
      }

      if (var13.getEmbedUrl() != null) {
         val var22: DCDButton = this.view.linkIcon;
         kotlin.jvm.internal.q.g(this.view.linkIcon, "linkIcon");
         var22.setVisibility(0);
         this.view.linkIcon.setOnClickButtonListener(new b(this, var2, var13));
      } else {
         val var23: DCDButton = this.view.linkIcon;
         kotlin.jvm.internal.q.g(this.view.linkIcon, "linkIcon");
         var23.setVisibility(8);
      }

      val var24: java.util.List = var13.getActions();
      if (var24 != null && !var24.isEmpty()) {
         this.view.actionsContainer.removeAllViews();
         val var6: Float = 1.0F / var13.getActions().size();
         val var26: java.util.Iterator = kotlin.collections.i.B0(var13.getActions()).iterator();

         for (int var35 = 0; var26.hasNext(); var35++) {
            var var42: Any = var26.next();
            if (var35 < 0) {
               kotlin.collections.i.u();
            }

            val var16: AppMessageActionImpl = var42 as AppMessageActionImpl;
            val var36: Boolean;
            if (var35 == var13.getActions().size() - 1) {
               var36 = true;
            } else {
               var36 = false;
            }

            var42 = var16.getLabel();
            val var15: java.lang.String = var16.getId();
            val var44: java.lang.Boolean = var16.getDisabled();
            val var12: Boolean;
            if (var44 != null) {
               var12 = var44;
            } else {
               var12 = false;
            }

            val var45: Context = this.getContext();
            kotlin.jvm.internal.q.g(var45, "getContext(...)");
            var var9: Int = ColorUtilsKt.getColorCompat(var45, R.color.white_500);
            val var46: Context = this.getContext();
            kotlin.jvm.internal.q.g(var46, "getContext(...)");
            val var11: Int = ColorUtilsKt.getColorCompat(var46, R.color.black_500);
            val var10: Int;
            if (var36) {
               var10 = var9;
            } else {
               var10 = androidx.core.graphics.c.k(var9, 30);
            }

            if (var36) {
               var9 = var11;
            }

            val var47: android.widget.LinearLayout.LayoutParams = new android.widget.LinearLayout.LayoutParams(0, -2);
            var47.weight = var6;
            if (var35 > 0) {
               var47.setMarginStart(SizeUtilsKt.getDpToPx(8));
            }

            val var17: Context = this.getContext();
            kotlin.jvm.internal.q.g(var17, "getContext(...)");
            val var48: DCDButton = new DCDButton(var17, null, 2, null);
            val var5: Float;
            if (var12) {
               var5 = 0.5F;
            } else {
               var5 = 1.0F;
            }

            var48.setAlpha(var5);
            var48.setText((java.lang.CharSequence)var42);
            var48.setBackgroundColor(var10);
            var48.setTextColor(var9);
            var48.setTextSizeSp(14.0F);
            var48.setDiscordFont(DiscordFont.PrimaryMedium);
            var48.setCornerRadius(SizeUtilsKt.getDpToPx(8));
            var48.setLayoutParams(var47);
            var48.setOnClickButtonListener(new c(this, var2, var13, var15));
            this.view.actionsContainer.addView(var48);
         }

         val var27: LinearLayout = this.view.actionsContainer;
         kotlin.jvm.internal.q.g(this.view.actionsContainer, "actionsContainer");
         var27.setVisibility(0);
      } else {
         val var25: LinearLayout = this.view.actionsContainer;
         kotlin.jvm.internal.q.g(this.view.actionsContainer, "actionsContainer");
         var25.setVisibility(8);
      }
   }
}
