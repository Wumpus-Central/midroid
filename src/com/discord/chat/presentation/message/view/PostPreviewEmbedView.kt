package com.discord.chat.presentation.message.view

import android.content.Context
import android.graphics.Paint.FontMetrics
import android.text.TextPaint
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View.OnClickListener
import android.widget.FrameLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.bridge.structurabletext.StructurableText
import com.discord.chat.databinding.PostPreviewEmbedViewBinding
import com.discord.chat.presentation.textutils.TextUtilsKt
import com.discord.core.DCDButton
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.discord.primitives.MessageId
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.drawable.ScalingUtils.ScaleType
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.span.SimpleDraweeSpanTextView
import com.facebook.drawee.view.SimpleDraweeView
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nPostPreviewEmbedView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostPreviewEmbedView.kt\ncom/discord/chat/presentation/message/view/PostPreviewEmbedView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,172:1\n257#2,2:173\n257#2,2:175\n257#2,2:177\n257#2,2:179\n255#2:181\n257#2,2:182\n257#2,2:184\n*S KotlinDebug\n*F\n+ 1 PostPreviewEmbedView.kt\ncom/discord/chat/presentation/message/view/PostPreviewEmbedView\n*L\n100#1:173,2\n125#1:175,2\n126#1:177,2\n144#1:179,2\n157#1:181\n161#1:182,2\n164#1:184,2\n*E\n"])
public class PostPreviewEmbedView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout(var1, var2, var3) {
   private final val binding: PostPreviewEmbedViewBinding

   fun PostPreviewEmbedView(var1: Context) {
      this(var1, null, 0, 6, null);
   }

   fun PostPreviewEmbedView(var1: Context, var2: AttributeSet) {
      this(var1, var2, 0, 4, null);
   }

   init {
      val var5: PostPreviewEmbedViewBinding = PostPreviewEmbedViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var5;
      this.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
      ViewClippingUtilsKt.clipToRoundedRectangle(this, SizeUtilsKt.getDpToPx(8));
      val var7: TextView = var5.title;
      var5.title.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      SetTextSizeSpKt.setTextSizeSp(var7, 16.0F);
      DiscordFontUtilsKt.setDiscordFont(var7, DiscordFont.PrimarySemibold);
      val var4: TextView = var5.subtitle;
      var5.subtitle.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      SetTextSizeSpKt.setTextSizeSp(var4, 14.0F);
      val var8: DiscordFont = DiscordFont.PrimaryNormal;
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryNormal);
      val var9: SimpleDraweeSpanTextView = var5.footer;
      var5.footer.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      SetTextSizeSpKt.setTextSizeSp(var9, 12.0F);
      DiscordFontUtilsKt.setDiscordFont(var9, var8);
      val var6: DCDButton = var5.coverImageOverlayButton;
      var5.coverImageOverlayButton.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundMobilePrimary());
      var6.setAlpha(0.7F);
      var6.setTextSizeSp(12.0F);
      var6.setCornerRadius(SizeUtilsKt.getDpToPx(64));
   }

   private fun setButtonColor(ctaButtonColor: Int) {
      this.binding.cta.setBackgroundColor(var1);
   }

   private fun setButtonText(cta: CharSequence) {
      this.binding.cta.setText(var1);
   }

   private fun setCoverImage(url: String?, blurredThumbnailUrl: String?, backgroundImageUrl: String?) {
      var var4: Boolean;
      if ((var1 == null || StringsKt.c0(var1)) && (var2 == null || StringsKt.c0(var2))) {
         var4 = 0;
      } else {
         var4 = 1;
      }

      var var8: SimpleDraweeView = this.binding.coverImage;
      val var5: Byte;
      if (var4) {
         var5 = 0;
      } else {
         var5 = 8;
      }

      label53: {
         var8.setVisibility(var5);
         var8 = this.binding.backgroundImage;
         if (var4 && var3 != null) {
            var4 = (boolean)1;
            if (!StringsKt.c0(var3)) {
               break label53;
            }
         }

         var4 = (boolean)0;
      }

      if (var4) {
         var4 = 0;
      } else {
         var4 = 8;
      }

      var8.setVisibility(var4);
      if (var1 != null && !StringsKt.c0(var1)) {
         if (var3 != null && !StringsKt.c0(var3)) {
            (this.binding.coverImage.getHierarchy() as GenericDraweeHierarchy).t(ScaleType.e);
            this.binding.backgroundImage.setImageURI(var3);
         } else {
            (this.binding.coverImage.getHierarchy() as GenericDraweeHierarchy).t(ScaleType.i);
         }

         this.binding.coverImage.setImageURI(var1);
      } else {
         if (var2 != null && !StringsKt.c0(var2)) {
            val var9: SimpleDraweeView = this.binding.coverImage;
            ReactAssetUtilsKt.setOptionalReactImageUrl(var9, var2);
         }
      }
   }

   private fun setCoverImageButtonText(coverImageOverlayText: String?) {
      val var4: DCDButton = this.binding.coverImageOverlayButton;
      var var2: Boolean;
      if (var1 != null && !StringsKt.c0(var1)) {
         var2 = 0;
      } else {
         var2 = 1;
      }

      if (!var2) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var4.setVisibility(var2);
      var4.setText(var1);
   }

   private fun setFooter(footer: StructurableText, messageId: MessageId) {
      val var4: SimpleDraweeSpanTextView = this.binding.footer;
      val var5: Context = var4.getContext();
      val var6: FontMetrics = var4.getPaint().getFontMetrics();
      val var3: Float = TextUtilsKt.getBaselineHeightPx(var6);
      val var7: TextPaint = var4.getPaint();
      ViewUtilsKt.setOptionalText(
         var4,
         TextUtilsKt.toSpannable$default(
            var1,
            var5,
            var2,
            false,
            false,
            false,
            true,
            var7,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            null,
            true,
            null,
            var3,
            null,
            46137216,
            null
         )
      );
      NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener$default(var4, false, 1, null);
   }

   private fun setSubtitle(subtitle: CharSequence?) {
      val var4: TextView = this.binding.subtitle;
      var var2: Boolean;
      if (var1 != null && !StringsKt.c0(var1)) {
         var2 = 0;
      } else {
         var2 = 1;
      }

      if (!var2) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var4.setVisibility(var2);
      this.binding.subtitle.setText(var1);
   }

   private fun setTitle(title: CharSequence) {
      this.binding.title.setText(var1);
   }

   private fun setupSpoilerView(
      spoilerConfig: SpoilerConfig?,
      isSpoiler: Boolean,
      isObscureAwaitingScan: Boolean,
      obscureHideControls: Boolean,
      obscureIsOpaque: Boolean
   ) {
      this.binding.spoiler.configure(var1, this);
      val var6: SpoilerView = this.binding.spoiler;
      if (var6.getVisibility() == 0) {
         this.binding.spoiler.handleObscureAwaitingScan(var3);
         this.binding.spoiler.setRevealButtonVisible(var4 xor true);
         this.binding.spoiler.setOpaqueBackgroundVisible(var5);
         val var8: FrameLayout = this.binding.imageBlurBg;
         var8.setVisibility(0);
         this.binding.coverImage.setImportantForAccessibility(4);
      } else {
         val var7: FrameLayout = this.binding.imageBlurBg;
         var7.setVisibility(8);
         this.binding.coverImage.setImportantForAccessibility(0);
         if (var2) {
            this.binding.coverImage.requestFocus();
         }
      }
   }

   public fun setPostPreviewEmbed(
      title: String,
      subtitle: String?,
      ctaCopy: String,
      ctaButtonColor: Int,
      footer: StructurableText,
      messageId: MessageId,
      thumbnailUrl: String?,
      blurredThumbnailUrl: String?,
      coverImageOverlayText: String?,
      backgroundImageUrl: String?,
      onButtonClickListener: OnClickListener,
      isSpoiler: Boolean,
      isObscureAwaitingScan: Boolean,
      obscureHideControls: Boolean,
      obscureIsOpaque: Boolean,
      spoilerConfig: SpoilerConfig?
   ) {
      this.setButtonText(var3);
      this.setButtonColor(var4);
      this.setTitle(var1);
      this.setSubtitle(var2);
      this.setFooter-Ayv7vGE(var5, var6);
      this.setCoverImage(var7, var8, var10);
      this.setCoverImageButtonText(var9);
      this.binding.cta.setOnClickButtonListener(var11);
      val var17: SimpleDraweeView = this.binding.coverImage;
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var17, false, var11, 1, null);
      this.binding.coverImageOverlayButton.setOnClickButtonListener(var11);
      this.setupSpoilerView(var16, var12, var13, var14, var15);
   }
}
