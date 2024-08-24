package com.discord.chat.presentation.separator

import android.content.Context
import android.content.res.Resources
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.widget.FrameLayout
import android.widget.TextView
import com.discord.SetTextSizeSpKt
import com.discord.chat.R
import com.discord.chat.databinding.SeparatorSummaryViewBinding
import com.discord.chat.presentation.list.ChatListConstraintLayout
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView
import h3.a
import kotlin.jvm.internal.r

public class SummarySeparatorView  public constructor(context: Context, attrs: AttributeSet? = null) : ChatListConstraintLayout {
   private final val binding: SeparatorSummaryViewBinding

   fun SummarySeparatorView(var1: Context) {
      r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      r.h(var1, "context");
      super(var1, var2);
      val var16: SeparatorSummaryViewBinding = SeparatorSummaryViewBinding.inflate(LayoutInflater.from(var1), this);
      r.g(var16, "inflate(\n        LayoutI…ext),\n        this,\n    )");
      this.binding = var16;
      val var5: View = var16.getRoot();
      r.g(var5, "root");
      val var6: Resources = var1.getResources();
      val var4: Int = R.dimen.message_divider_margin_horiz;
      var5.setPaddingRelative(
         var6.getDimensionPixelSize(R.dimen.message_divider_margin_horiz),
         var5.getPaddingTop(),
         var1.getResources().getDimensionPixelSize(var4),
         var5.getPaddingBottom()
      );
      val var7: TextView = var16.middleText;
      r.g(var16.middleText, "lambda$2$lambda$0");
      ViewClippingUtilsKt.clipToRoundedRectangle(var7, SizeUtilsKt.getDpToPx(4));
      DiscordFontUtilsKt.setDiscordFont(var7, DiscordFont.PrimarySemibold);
      SetTextSizeSpKt.setTextSizeSp(var7, 12.0F);
      val var8: SimpleDraweeView = var16.indicatorTop;
      r.g(var16.indicatorTop, "indicatorTop");
      ReactAssetUtilsKt.setReactAsset(var8, ReactAsset.SummaryIndicatorStart);
      val var9: SimpleDraweeView = var16.indicatorBottom;
      r.g(var16.indicatorBottom, "indicatorBottom");
      ReactAssetUtilsKt.setReactAsset(var9, ReactAsset.SummaryIndicatorEnd);
      val var10: SimpleDraweeView = var16.icon;
      r.g(var16.icon, "icon");
      ReactAssetUtilsKt.setReactAsset(var10, ReactAsset.Summary);
      val var11: SimpleDraweeView = var16.jumpButton;
      r.g(var16.jumpButton, "jumpButton");
      ReactAssetUtilsKt.setReactAsset(var11, ReactAsset.JumpToBottom);
      val var12: SimpleDraweeView = var16.jumpButton;
      r.g(var16.jumpButton, "jumpButton");
      ColorUtilsKt.setTintColor(var12, ThemeManagerKt.getTheme().getInteractiveNormal());
      val var13: SimpleDraweeView = var16.moreButton;
      r.g(var16.moreButton, "moreButton");
      ReactAssetUtilsKt.setReactAsset(var13, ReactAsset.More);
      val var14: SimpleDraweeView = var16.moreButton;
      r.g(var16.moreButton, "moreButton");
      ColorUtilsKt.setTintColor(var14, ThemeManagerKt.getTheme().getInteractiveNormal());
      val var15: FrameLayout = var16.buttonWrapper;
      r.g(var16.buttonWrapper, "buttonWrapper");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var15, false, new a(var16), 1, null);
   }

   @JvmStatic
   fun `lambda$2$lambda$1`(var0: SeparatorSummaryViewBinding, var1: View) {
      r.h(var0, "$this_with");
      val var4: SimpleDraweeView = var0.jumpButton;
      r.g(var0.jumpButton, "jumpButton");
      var var6: Boolean;
      if (var4.getVisibility() == 0) {
         var6 = true;
      } else {
         var6 = false;
      }

      if (var6) {
         var0.jumpButton.performClick();
      } else {
         val var5: SimpleDraweeView = var0.moreButton;
         r.g(var0.moreButton, "moreButton");
         if (var5.getVisibility() == 0) {
            var6 = true;
         } else {
            var6 = false;
         }

         if (var6) {
            var0.moreButton.performClick();
         }
      }
   }

   public fun setDividerColor(color: Int) {
      val var2: SeparatorSummaryViewBinding = this.binding;
      var var3: SimpleDraweeView = this.binding.indicatorTop;
      r.g(this.binding.indicatorTop, "indicatorTop");
      ColorUtilsKt.setTintColor(var3, var1);
      var3 = var2.indicatorBottom;
      r.g(var2.indicatorBottom, "indicatorBottom");
      ColorUtilsKt.setTintColor(var3, var1);
      var2.rightBar.setBackgroundColor(var1);
      var3 = var2.icon;
      r.g(var2.icon, "icon");
      ColorUtilsKt.setTintColor(var3, var1);
      var2.middleText.setTextColor(var1);
   }

   public fun setIsBeforeContent(isBeforeContent: Boolean) {
      val var2: SeparatorSummaryViewBinding = this.binding;
      if (var1) {
         this.binding.indicatorTop.setVisibility(0);
         var2.indicatorBottom.setVisibility(8);
         var2.jumpButton.setVisibility(0);
         var2.moreButton.setVisibility(8);
         var2.topGuideline.setGuidelineBegin(SizeUtilsKt.getDpToPx(4));
         var2.bottomGuideline.setGuidelineEnd(0);
      } else {
         this.binding.indicatorTop.setVisibility(8);
         var2.indicatorBottom.setVisibility(0);
         var2.jumpButton.setVisibility(8);
         var2.moreButton.setVisibility(0);
         var2.topGuideline.setGuidelineBegin(0);
         var2.bottomGuideline.setGuidelineEnd(SizeUtilsKt.getDpToPx(4));
      }
   }

   public fun setJumpToBottomHandler(onJumpToBottom: OnClickListener) {
      r.h(var1, "onJumpToBottom");
      val var2: SimpleDraweeView = this.binding.jumpButton;
      r.g(this.binding.jumpButton, "binding.jumpButton");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var2, false, var1, 1, null);
   }

   public fun setMoreActionsHandler(onMoreActions: OnClickListener) {
      r.h(var1, "onMoreActions");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, var1, 1, null);
      val var2: SimpleDraweeView = this.binding.moreButton;
      r.g(this.binding.moreButton, "binding.moreButton");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var2, false, var1, 1, null);
   }

   public fun setText(text: CharSequence) {
      r.h(var1, "text");
      this.binding.middleText.setText(var1);
   }
}
