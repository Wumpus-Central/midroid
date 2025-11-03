package com.discord.chat.presentation.separator

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.widget.FrameLayout
import android.widget.TextView
import com.discord.SetTextSizeSpKt
import com.discord.chat.R.dimen
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
import k8.a
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nSummarySeparatorView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SummarySeparatorView.kt\ncom/discord/chat/presentation/separator/SummarySeparatorView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,113:1\n146#2,8:114\n255#2:122\n255#2:123\n*S KotlinDebug\n*F\n+ 1 SummarySeparatorView.kt\ncom/discord/chat/presentation/separator/SummarySeparatorView\n*L\n34#1:114,8\n57#1:122\n59#1:123\n*E\n"])
public class SummarySeparatorView  public constructor(context: Context, attrs: AttributeSet? = null) : ChatListConstraintLayout(var1, var2) {
   private final val binding: SeparatorSummaryViewBinding

   fun SummarySeparatorView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      val var15: SeparatorSummaryViewBinding = SeparatorSummaryViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var15;
      val var5: View = var15.getRoot();
      var5.setPaddingRelative(
         var1.getResources().getDimensionPixelSize(dimen.message_divider_margin_horiz),
         var5.getPaddingTop(),
         var1.getResources().getDimensionPixelSize(dimen.message_divider_margin_horiz),
         var5.getPaddingBottom()
      );
      val var6: TextView = var15.middleText;
      ViewClippingUtilsKt.clipToRoundedRectangle(var6, SizeUtilsKt.getDpToPx(4));
      DiscordFontUtilsKt.setDiscordFont(var6, DiscordFont.PrimarySemibold);
      SetTextSizeSpKt.setTextSizeSp(var6, 12.0F);
      val var7: SimpleDraweeView = var15.indicatorTop;
      ReactAssetUtilsKt.setReactAsset(var7, ReactAsset.SummaryIndicatorStart);
      val var8: SimpleDraweeView = var15.indicatorBottom;
      ReactAssetUtilsKt.setReactAsset(var8, ReactAsset.SummaryIndicatorEnd);
      val var9: SimpleDraweeView = var15.icon;
      ReactAssetUtilsKt.setReactAsset(var9, ReactAsset.Summary);
      val var10: SimpleDraweeView = var15.jumpButton;
      ReactAssetUtilsKt.setReactAsset(var10, ReactAsset.JumpToBottom);
      val var11: SimpleDraweeView = var15.jumpButton;
      ColorUtilsKt.setTintColor(var11, ThemeManagerKt.getTheme().getInteractiveNormal());
      val var12: SimpleDraweeView = var15.moreButton;
      ReactAssetUtilsKt.setReactAsset(var12, ReactAsset.More);
      val var13: SimpleDraweeView = var15.moreButton;
      ColorUtilsKt.setTintColor(var13, ThemeManagerKt.getTheme().getInteractiveNormal());
      val var14: FrameLayout = var15.buttonWrapper;
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var14, false, new a(var15), 1, null);
   }

   @JvmStatic
   fun h(var0: SeparatorSummaryViewBinding, var1: View) {
      val var2: SimpleDraweeView = var0.jumpButton;
      if (var2.getVisibility() == 0) {
         var0.jumpButton.performClick();
      } else {
         val var3: SimpleDraweeView = var0.moreButton;
         if (var3.getVisibility() == 0) {
            var0.moreButton.performClick();
         }
      }
   }

   public fun setDividerColor(color: Int) {
      val var2: SeparatorSummaryViewBinding = this.binding;
      var var3: SimpleDraweeView = this.binding.indicatorTop;
      ColorUtilsKt.setTintColor(var3, var1);
      var3 = var2.indicatorBottom;
      ColorUtilsKt.setTintColor(var3, var1);
      var2.rightBar.setBackgroundColor(var1);
      var3 = var2.icon;
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
      val var2: SimpleDraweeView = this.binding.jumpButton;
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var2, false, var1, 1, null);
   }

   public fun setMoreActionsHandler(onMoreActions: OnClickListener) {
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(this, false, var1, 1, null);
      val var2: SimpleDraweeView = this.binding.moreButton;
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var2, false, var1, 1, null);
   }

   public fun setText(text: CharSequence) {
      this.binding.middleText.setText(var1);
   }
}
