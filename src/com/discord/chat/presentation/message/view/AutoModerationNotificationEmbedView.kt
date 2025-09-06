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
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nAutoModerationNotificationEmbedView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoModerationNotificationEmbedView.kt\ncom/discord/chat/presentation/message/view/AutoModerationNotificationEmbedView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,191:1\n257#2,2:192\n257#2,2:194\n257#2,2:196\n257#2,2:198\n257#2,2:200\n257#2,2:202\n257#2,2:204\n257#2,2:206\n257#2,2:208\n257#2,2:210\n257#2,2:212\n257#2,2:214\n257#2,2:216\n257#2,2:218\n257#2,2:220\n257#2,2:222\n257#2,2:224\n257#2,2:226\n257#2,2:228\n*S KotlinDebug\n*F\n+ 1 AutoModerationNotificationEmbedView.kt\ncom/discord/chat/presentation/message/view/AutoModerationNotificationEmbedView\n*L\n114#1:192,2\n115#1:194,2\n116#1:196,2\n117#1:198,2\n118#1:200,2\n119#1:202,2\n120#1:204,2\n124#1:206,2\n128#1:208,2\n132#1:210,2\n133#1:212,2\n135#1:214,2\n141#1:216,2\n145#1:218,2\n149#1:220,2\n153#1:222,2\n157#1:224,2\n160#1:226,2\n167#1:228,2\n*E\n"])
public class AutoModerationNotificationEmbedView  public constructor(context: Context, attrs: AttributeSet? = null) : ConstraintLayout(var1, var2),
   VerticalSpacingItemDecoration.SpacingProviderView {
   private final val binding: AutoModerationNotificationEmbedViewBinding
   private final var allowChildGestures: Boolean

   fun AutoModerationNotificationEmbedView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      val var9: AutoModerationNotificationEmbedViewBinding = AutoModerationNotificationEmbedViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var9;
      this.allowChildGestures = true;
      RippleUtilsKt.addRipple$default(this, false, SizeUtilsKt.getDpToPx(8), 1, null);
      val var4: View = var9.getRoot();
      var4.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
      ViewClippingUtilsKt.clipToRoundedRectangle(var4, SizeUtilsKt.getDpToPx(8));
      var var5: TextView = var9.header;
      var9.header.setTextColor(ThemeManagerKt.getTheme().getTextDanger());
      val var10: DiscordFont = DiscordFont.PrimarySemibold;
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimarySemibold);
      var var3: Float = 16.0F;
      SetTextSizeSpKt.setTextSizeSp(var5, 16.0F, 20.0F);
      var5.setLineSpacing(0.0F, 1.05F);
      val var12: ImageView = var9.subtitleDivider;
      var9.subtitleDivider.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModifierAccent());
      ViewClippingUtilsKt.clipToRoundedRectangle(var12, SizeUtilsKt.getDpToPx(4));
      var5 = var9.subtitleLeft;
      var9.subtitleLeft.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      DiscordFontUtilsKt.setDiscordFont(var5, var10);
      SetTextSizeSpKt.setTextSizeSp(var5, 12.0F, 20.0F);
      var5 = var9.subtitleRight;
      var9.subtitleRight.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      DiscordFontUtilsKt.setDiscordFont(var5, var10);
      SetTextSizeSpKt.setTextSizeSp(var5, 12.0F, 20.0F);
      var5 = var9.subtitleLeftAuthor;
      var9.subtitleLeftAuthor.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      DiscordFontUtilsKt.setDiscordFont(var5, var10);
      SetTextSizeSpKt.setTextSizeSp(var5, 12.0F, 20.0F);
      var5 = var9.body;
      var9.body.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      val var11: DiscordFont = DiscordFont.PrimaryMedium;
      DiscordFontUtilsKt.setDiscordFont(var5, DiscordFont.PrimaryMedium);
      if (FontManager.INSTANCE.getIsClassicChatFontScaleEnabled(var1)) {
         var3 = 14.0F;
      }

      SetTextSizeSpKt.setTextSizeSp(var5, var3);
      var9.actions.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondaryAlt());
      val var6: ImageView = var9.separatorDot;
      var9.separatorDot.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundModifierAccent());
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
      val var6: AutoModerationNotification = var1.getNotification();
      var var7: TextView = this.binding.header;
      var var5: Byte = 8;
      var7.setVisibility(8);
      val var13: SimpleDraweeView = this.binding.headerIcon;
      var13.setVisibility(8);
      var7 = this.binding.subtitleLeft;
      var7.setVisibility(8);
      var7 = this.binding.subtitleRight;
      var7.setVisibility(8);
      val var16: SimpleDraweeView = this.binding.subtitleLeftAvatar;
      var16.setVisibility(8);
      var7 = this.binding.subtitleLeftAuthor;
      var7.setVisibility(8);
      var7 = this.binding.body;
      var7.setVisibility(8);
      if (var6 != null) {
         var7 = this.binding.header;
         var7.setVisibility(0);
         this.binding.header.setText(var6.getHeader());
         this.binding.header.setTextColor(var6.getHeaderColor());
         val var20: SimpleDraweeView = this.binding.headerIcon;
         var20.setVisibility(0);
         this.binding.headerIcon.setImageURI(var6.getHeaderIconURL());
         val var21: SimpleDraweeView = this.binding.headerIcon;
         ColorUtilsKt.setTintColor(var21, var6.getHeaderIconColor());
         var7 = this.binding.body;
         var7.setVisibility(0);
         val var23: LinearLayout = this.binding.actions;
         val var4: Byte;
         if (var6.getShouldShowActions()) {
            var4 = 0;
         } else {
            var4 = 8;
         }

         var23.setVisibility(var4);
         val var24: ImageView = this.binding.subtitleDivider;
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
            var7.setVisibility(0);
         }

         if (var6.getSubtitleLeft() != null) {
            this.binding.subtitleLeft.setText(var6.getSubtitleLeft());
            var7 = this.binding.subtitleLeft;
            var7.setVisibility(0);
         } else if (var6.getSeverity() != null) {
            this.binding.subtitleLeft.setText(var6.getSeverity());
            var7 = this.binding.subtitleLeft;
            var7.setVisibility(0);
         }

         if (var6.getSubtitleRight() != null) {
            this.binding.subtitleRight.setText(var6.getSubtitleRight());
            var7 = this.binding.subtitleRight;
            var7.setVisibility(0);
         } else if (var6.getStartTime() != null) {
            this.binding.subtitleLeft.setText(var6.getStartTime());
            var7 = this.binding.subtitleLeft;
            var7.setVisibility(0);
         }

         if (var6.getEnabledByUsername() != null) {
            var7 = this.binding.subtitleLeftAuthor;
            var7.setVisibility(0);
            this.binding.subtitleLeftAuthor.setText(var6.getEnabledByUsername());
         }

         if (var6.getEnabledByColor() != null) {
            this.binding.subtitleLeftAuthor.setTextColor(var6.getEnabledByColor());
         }

         if (var6.getEnabledByAvatarURL() != null) {
            val var31: SimpleDraweeView = this.binding.subtitleLeftAvatar;
            var31.setVisibility(0);
            val var32: SimpleDraweeView = this.binding.subtitleLeftAvatar;
            ReactAssetUtilsKt.setReactImageUrl(var32, var6.getEnabledByAvatarURL());
         }
      }

      val var33: java.lang.String = var1.getActionsIconURL();
      val var8: java.lang.String = var1.getActionsText();
      val var12: DCDButton = this.binding.actionsButton;
      if (var33 != null) {
         this.binding.actionsButton.setIcon(var33, SizeUtilsKt.getDpToPx(16));
      }

      this.binding.actionsButton.setText(var8);
      var12.setOnClickButtonListener(var2);
      val var9: java.lang.String = var1.getFeedbackText();
      val var10: DCDButton = this.binding.feedbackButton;
      this.binding.feedbackButton.setText(var9);
      var10.setOnClickButtonListener(var3);
   }

   public open fun onInterceptTouchEvent(ev: MotionEvent): Boolean {
      return this.allowChildGestures xor true;
   }

   public override fun spacingPxOverride(): Int {
      return SizeUtilsKt.getDpToPx(4);
   }
}
