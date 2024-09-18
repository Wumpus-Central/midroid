package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.View.OnClickListener
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.automod.AutoModerationContext
import com.discord.chat.bridge.automod.AutoModerationNotification
import com.discord.chat.databinding.AutoModerationNotificationEmbedViewBinding
import com.discord.core.DCDButton
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.react.FontManager
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.recycler_view.decorations.VerticalSpacingItemDecoration
import com.discord.ripple.RippleUtilsKt
import com.discord.theme.ThemeManagerKt
import com.discord.theme.utils.ColorUtilsKt
import com.facebook.drawee.view.SimpleDraweeView

public class AutoModerationNotificationEmbedView  public constructor(context: Context, attrs: AttributeSet? = null)
   : ConstraintLayout,
   VerticalSpacingItemDecoration.SpacingProviderView {
   private final var allowChildGestures: Boolean
   private final val binding: AutoModerationNotificationEmbedViewBinding

   fun AutoModerationNotificationEmbedView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2);
      val var9: AutoModerationNotificationEmbedViewBinding = AutoModerationNotificationEmbedViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var9, "inflate(...)");
      this.binding = var9;
      this.allowChildGestures = true;
      RippleUtilsKt.addRipple$default(this, false, SizeUtilsKt.getDpToPx(8), 1, null);
      val var4: View = var9.getRoot();
      var4.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
      kotlin.jvm.internal.q.e(var4);
      ViewClippingUtilsKt.clipToRoundedRectangle(var4, SizeUtilsKt.getDpToPx(8));
      var var5: TextView = var9.header;
      var9.header.setTextColor(ThemeManagerKt.getTheme().getTextDanger());
      kotlin.jvm.internal.q.e(var5);
      val var10: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimarySemibold);
      var var3: Float = 16.0F;
      SetTextSizeSpKt.setTextSizeSp(var5, 16.0F, 20.0F);
      var5.setLineSpacing(0.0F, 1.05F);
      val var12: ImageView = var9.subtitleDivider;
      var9.subtitleDivider.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModifierAccent());
      kotlin.jvm.internal.q.e(var12);
      ViewClippingUtilsKt.clipToRoundedRectangle(var12, SizeUtilsKt.getDpToPx(4));
      var5 = var9.subtitleLeft;
      var9.subtitleLeft.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      kotlin.jvm.internal.q.e(var5);
      DiscordFontUtilsKt.setDiscordFont(var5, var10);
      SetTextSizeSpKt.setTextSizeSp(var5, 12.0F, 20.0F);
      var5 = var9.subtitleRight;
      var9.subtitleRight.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      kotlin.jvm.internal.q.e(var5);
      DiscordFontUtilsKt.setDiscordFont(var5, var10);
      SetTextSizeSpKt.setTextSizeSp(var5, 12.0F, 20.0F);
      var5 = var9.subtitleLeftAuthor;
      var9.subtitleLeftAuthor.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      kotlin.jvm.internal.q.e(var5);
      DiscordFontUtilsKt.setDiscordFont(var5, var10);
      SetTextSizeSpKt.setTextSizeSp(var5, 12.0F, 20.0F);
      var5 = var9.body;
      var9.body.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      kotlin.jvm.internal.q.e(var5);
      val var11: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryMedium);
      if (FontManager.INSTANCE.getIsClassicChatFontScaleEnabled(var1)) {
         var3 = 14.0F;
      }

      SetTextSizeSpKt.setTextSizeSp(var5, var3);
      var9.actions.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondaryAlt());
      val var6: ImageView = var9.separatorDot;
      var9.separatorDot.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModifierAccent());
      kotlin.jvm.internal.q.e(var6);
      ViewClippingUtilsKt.clipToRoundedRectangle(var6, SizeUtilsKt.getDpToPx(4));
      val var7: DCDButton = var9.actionsButton;
      var9.actionsButton.setTextSizeSp(12.0F);
      var7.setTextColor(ThemeManagerKt.getTheme().getTextLink());
      var7.setDiscordFont(var11);
      var7.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondaryAlt());
      val var8: DCDButton = var9.feedbackButton;
      var9.feedbackButton.setTextSizeSp(12.0F);
      var8.setTextColor(ThemeManagerKt.getTheme().getTextLink());
      var8.setDiscordFont(var11);
      var8.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondaryAlt());
   }

   public fun configure(moderationContext: AutoModerationContext, onTapAutoModerationActions: OnClickListener, onTapAutoModerationFeedback: OnClickListener) {
      kotlin.jvm.internal.q.h(var1, "moderationContext");
      kotlin.jvm.internal.q.h(var2, "onTapAutoModerationActions");
      kotlin.jvm.internal.q.h(var3, "onTapAutoModerationFeedback");
      val var6: AutoModerationNotification = var1.getNotification();
      var var7: TextView = this.binding.header;
      kotlin.jvm.internal.q.g(this.binding.header, "header");
      var var5: Byte = 8;
      var7.setVisibility(8);
      val var13: SimpleDraweeView = this.binding.headerIcon;
      kotlin.jvm.internal.q.g(this.binding.headerIcon, "headerIcon");
      var13.setVisibility(8);
      var7 = this.binding.subtitleLeft;
      kotlin.jvm.internal.q.g(this.binding.subtitleLeft, "subtitleLeft");
      var7.setVisibility(8);
      var7 = this.binding.subtitleRight;
      kotlin.jvm.internal.q.g(this.binding.subtitleRight, "subtitleRight");
      var7.setVisibility(8);
      val var16: SimpleDraweeView = this.binding.subtitleLeftAvatar;
      kotlin.jvm.internal.q.g(this.binding.subtitleLeftAvatar, "subtitleLeftAvatar");
      var16.setVisibility(8);
      var7 = this.binding.subtitleLeftAuthor;
      kotlin.jvm.internal.q.g(this.binding.subtitleLeftAuthor, "subtitleLeftAuthor");
      var7.setVisibility(8);
      var7 = this.binding.body;
      kotlin.jvm.internal.q.g(this.binding.body, "body");
      var7.setVisibility(8);
      if (var6 != null) {
         var7 = this.binding.header;
         kotlin.jvm.internal.q.g(this.binding.header, "header");
         var7.setVisibility(0);
         this.binding.header.setText(var6.getHeader());
         this.binding.header.setTextColor(var6.getHeaderColor());
         val var20: SimpleDraweeView = this.binding.headerIcon;
         kotlin.jvm.internal.q.g(this.binding.headerIcon, "headerIcon");
         var20.setVisibility(0);
         this.binding.headerIcon.setImageURI(var6.getHeaderIconURL());
         val var21: SimpleDraweeView = this.binding.headerIcon;
         kotlin.jvm.internal.q.g(this.binding.headerIcon, "headerIcon");
         ColorUtilsKt.setTintColor(var21, var6.getHeaderIconColor());
         var7 = this.binding.body;
         kotlin.jvm.internal.q.g(this.binding.body, "body");
         var7.setVisibility(0);
         val var23: LinearLayout = this.binding.actions;
         kotlin.jvm.internal.q.g(this.binding.actions, "actions");
         val var4: Byte;
         if (var6.getShouldShowActions()) {
            var4 = 0;
         } else {
            var4 = 8;
         }

         var23.setVisibility(var4);
         val var24: ImageView = this.binding.subtitleDivider;
         kotlin.jvm.internal.q.g(this.binding.subtitleDivider, "subtitleDivider");
         val var11: Boolean;
         if (var6.getSubtitleLeft() != null && var6.getSubtitleRight() != null) {
            var11 = true;
         } else {
            var11 = false;
         }

         if (var11) {
            var5 = 0;
         }

         var24.setVisibility(var5);
         if (var6.getBody() != null) {
            this.binding.body.setText(var6.getBody());
            var7 = this.binding.body;
            kotlin.jvm.internal.q.g(this.binding.body, "body");
            var7.setVisibility(0);
         }

         if (var6.getSubtitleLeft() != null) {
            this.binding.subtitleLeft.setText(var6.getSubtitleLeft());
            var7 = this.binding.subtitleLeft;
            kotlin.jvm.internal.q.g(this.binding.subtitleLeft, "subtitleLeft");
            var7.setVisibility(0);
         } else if (var6.getSeverity() != null) {
            this.binding.subtitleLeft.setText(var6.getSeverity());
            var7 = this.binding.subtitleLeft;
            kotlin.jvm.internal.q.g(this.binding.subtitleLeft, "subtitleLeft");
            var7.setVisibility(0);
         }

         if (var6.getSubtitleRight() != null) {
            this.binding.subtitleRight.setText(var6.getSubtitleRight());
            var7 = this.binding.subtitleRight;
            kotlin.jvm.internal.q.g(this.binding.subtitleRight, "subtitleRight");
            var7.setVisibility(0);
         } else if (var6.getStartTime() != null) {
            this.binding.subtitleLeft.setText(var6.getStartTime());
            var7 = this.binding.subtitleLeft;
            kotlin.jvm.internal.q.g(this.binding.subtitleLeft, "subtitleLeft");
            var7.setVisibility(0);
         }

         if (var6.getEnabledByUsername() != null) {
            var7 = this.binding.subtitleLeftAuthor;
            kotlin.jvm.internal.q.g(this.binding.subtitleLeftAuthor, "subtitleLeftAuthor");
            var7.setVisibility(0);
            this.binding.subtitleLeftAuthor.setText(var6.getEnabledByUsername());
         }

         if (var6.getEnabledByColor() != null) {
            this.binding.subtitleLeftAuthor.setTextColor(var6.getEnabledByColor());
         }

         if (var6.getEnabledByAvatarURL() != null) {
            val var31: SimpleDraweeView = this.binding.subtitleLeftAvatar;
            kotlin.jvm.internal.q.g(this.binding.subtitleLeftAvatar, "subtitleLeftAvatar");
            var31.setVisibility(0);
            val var32: SimpleDraweeView = this.binding.subtitleLeftAvatar;
            kotlin.jvm.internal.q.g(this.binding.subtitleLeftAvatar, "subtitleLeftAvatar");
            ReactAssetUtilsKt.setReactImageUrl(var32, var6.getEnabledByAvatarURL());
         }
      }

      val var12: java.lang.String = var1.getActionsIconURL();
      val var8: java.lang.String = var1.getActionsText();
      val var33: DCDButton = this.binding.actionsButton;
      if (var12 != null) {
         this.binding.actionsButton.setIcon(var12, SizeUtilsKt.getDpToPx(16));
      }

      this.binding.actionsButton.setText(var8);
      var33.setOnClickButtonListener(var2);
      val var10: java.lang.String = var1.getFeedbackText();
      val var9: DCDButton = this.binding.feedbackButton;
      this.binding.feedbackButton.setText(var10);
      var9.setOnClickButtonListener(var3);
   }

   public open fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
      kotlin.jvm.internal.q.h(var1, "ev");
      return this.allowChildGestures xor true;
   }

   public override fun spacingPxOverride(): Int {
      return SizeUtilsKt.getDpToPx(4);
   }
}
