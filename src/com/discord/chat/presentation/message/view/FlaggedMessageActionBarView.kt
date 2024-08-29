package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.widget.ImageView
import android.widget.LinearLayout
import com.discord.chat.bridge.automod.AutoModerationContext
import com.discord.chat.databinding.FlaggedMessageActionBarViewBinding
import com.discord.core.DCDButton
import com.discord.fonts.DiscordFont
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration.SpacingProviderView
import com.discord.theme.ThemeManagerKt

public class FlaggedMessageActionBarView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0)
   : LinearLayout,
   SpacingProviderView {
   private final val binding: FlaggedMessageActionBarViewBinding

   fun FlaggedMessageActionBarView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun FlaggedMessageActionBarView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2, var3);
      val var7: FlaggedMessageActionBarViewBinding = FlaggedMessageActionBarViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var7, "inflate(...)");
      this.binding = var7;
      val var5: ImageView = var7.separatorDot;
      var7.separatorDot.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModifierAccent());
      kotlin.jvm.internal.q.e(var5);
      ViewClippingUtilsKt.clipToRoundedRectangle(var5, SizeUtilsKt.getDpToPx(4));
      val var4: DCDButton = var7.actionsButton;
      var7.actionsButton.setCornerRadius(SizeUtilsKt.getDpToPx(8));
      var4.setTextSizeSp(12.0F);
      var4.setTextColor(ThemeManagerKt.getTheme().getTextBrand());
      val var6: DiscordFont = DiscordFont.PrimaryMedium;
      var4.setDiscordFont(DiscordFont.PrimaryMedium);
      var4.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundPrimary());
      val var8: DCDButton = var7.feedbackButton;
      var7.feedbackButton.setCornerRadius(SizeUtilsKt.getDpToPx(8));
      var8.setTextSizeSp(12.0F);
      var8.setTextColor(ThemeManagerKt.getTheme().getTextBrand());
      var8.setDiscordFont(var6);
      var8.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundPrimary());
   }

   public fun setActions(
      autoModerationContext: AutoModerationContext,
      onTapAutoModerationActions: OnClickListener,
      onTapAutoModerationFeedback: OnClickListener
   ) {
      kotlin.jvm.internal.q.h(var1, "autoModerationContext");
      kotlin.jvm.internal.q.h(var2, "onTapAutoModerationActions");
      kotlin.jvm.internal.q.h(var3, "onTapAutoModerationFeedback");
      val var6: java.lang.String = var1.getActionsIconURL();
      val var4: java.lang.String = var1.getActionsText();
      val var5: DCDButton = this.binding.actionsButton;
      if (var6 != null) {
         this.binding.actionsButton.setIcon(var6, SizeUtilsKt.getDpToPx(16));
      }

      this.binding.actionsButton.setText(var4);
      var5.setOnClickButtonListener(var2);
      val var8: java.lang.String = var1.getFeedbackText();
      val var7: DCDButton = this.binding.feedbackButton;
      this.binding.feedbackButton.setText(var8);
      var7.setOnClickButtonListener(var3);
   }

   public open fun spacingPxOverride(): Int {
      return SizeUtilsKt.getDpToPx(4);
   }
}
