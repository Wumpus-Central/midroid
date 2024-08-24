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
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun FlaggedMessageActionBarView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2, var3);
      val var7: FlaggedMessageActionBarViewBinding = FlaggedMessageActionBarViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var7, "inflate(LayoutInflater.from(context), this)");
      this.binding = var7;
      val var5: ImageView = var7.separatorDot;
      var7.separatorDot.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModifierAccent());
      kotlin.jvm.internal.r.g(var5, "_init_$lambda$0");
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
      kotlin.jvm.internal.r.h(var1, "autoModerationContext");
      kotlin.jvm.internal.r.h(var2, "onTapAutoModerationActions");
      kotlin.jvm.internal.r.h(var3, "onTapAutoModerationFeedback");
      val var6: java.lang.String = var1.getActionsIconURL();
      val var5: java.lang.String = var1.getActionsText();
      val var4: DCDButton = this.binding.actionsButton;
      if (var6 != null) {
         this.binding.actionsButton.setIcon(var6, SizeUtilsKt.getDpToPx(16));
      }

      this.binding.actionsButton.setText(var5);
      var4.setOnClickButtonListener(var2);
      val var7: java.lang.String = var1.getFeedbackText();
      val var8: DCDButton = this.binding.feedbackButton;
      this.binding.feedbackButton.setText(var7);
      var8.setOnClickButtonListener(var3);
   }

   public open fun spacingPxOverride(): Int {
      return SizeUtilsKt.getDpToPx(4);
   }
}
