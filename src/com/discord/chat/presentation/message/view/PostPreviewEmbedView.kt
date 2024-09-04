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

public class PostPreviewEmbedView  public constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : ConstraintLayout {
   private final val binding: PostPreviewEmbedViewBinding

   fun PostPreviewEmbedView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 0, 6, null);
   }

   fun PostPreviewEmbedView(var1: Context, var2: AttributeSet) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, var2, 0, 4, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2, var3);
      val var5: PostPreviewEmbedViewBinding = PostPreviewEmbedViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var5, "inflate(LayoutInflater.from(context), this)");
      this.binding = var5;
      this.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundSecondary());
      ViewClippingUtilsKt.clipToRoundedRectangle(this, SizeUtilsKt.getDpToPx(8));
      val var7: TextView = var5.title;
      var5.title.setTextColor(ThemeManagerKt.getTheme().getTextNormal());
      kotlin.jvm.internal.r.g(var7, "_init_$lambda$0");
      SetTextSizeSpKt.setTextSizeSp(var7, 16.0F);
      DiscordFontUtilsKt.setDiscordFont(var7, DiscordFont.PrimarySemibold);
      val var4: TextView = var5.subtitle;
      var5.subtitle.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      kotlin.jvm.internal.r.g(var4, "_init_$lambda$1");
      SetTextSizeSpKt.setTextSizeSp(var4, 14.0F);
      val var8: DiscordFont = DiscordFont.PrimaryNormal;
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryNormal);
      val var9: SimpleDraweeSpanTextView = var5.footer;
      var5.footer.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      kotlin.jvm.internal.r.g(var9, "_init_$lambda$2");
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
      if (var1 != null && !kotlin.text.f.x(var1)) {
         var4 = false;
      } else {
         var4 = true;
      }

      label92: {
         if (var4) {
            if (var2 != null && !kotlin.text.f.x(var2)) {
               var4 = false;
            } else {
               var4 = true;
            }

            if (var4) {
               var4 = false;
               break label92;
            }
         }

         var4 = true;
      }

      var var9: SimpleDraweeView = this.binding.coverImage;
      kotlin.jvm.internal.r.g(this.binding.coverImage, "binding.coverImage");
      var var5: Byte;
      if (var4) {
         var5 = 0;
      } else {
         var5 = 8;
      }

      label81: {
         var9.setVisibility(var5);
         var9 = this.binding.backgroundImage;
         kotlin.jvm.internal.r.g(this.binding.backgroundImage, "binding.backgroundImage");
         if (var4) {
            if (var3 != null && !kotlin.text.f.x(var3)) {
               var4 = false;
            } else {
               var4 = true;
            }

            if (!var4) {
               var4 = true;
               break label81;
            }
         }

         var4 = false;
      }

      var5 = 8;
      if (var4) {
         var5 = 0;
      }

      var9.setVisibility(var5);
      if (var1 != null && !kotlin.text.f.x(var1)) {
         var4 = false;
      } else {
         var4 = true;
      }

      if (!var4) {
         var4 = true;
         if (var3 != null) {
            if (kotlin.text.f.x(var3)) {
               var4 = true;
            } else {
               var4 = false;
            }
         }

         if (!var4) {
            (this.binding.coverImage.getHierarchy() as GenericDraweeHierarchy).t(ScaleType.e);
            this.binding.backgroundImage.setImageURI(var3);
         } else {
            (this.binding.coverImage.getHierarchy() as GenericDraweeHierarchy).t(ScaleType.i);
         }

         this.binding.coverImage.setImageURI(var1);
      } else {
         var4 = true;
         if (var2 != null) {
            if (kotlin.text.f.x(var2)) {
               var4 = true;
            } else {
               var4 = false;
            }
         }

         if (!var4) {
            val var10: SimpleDraweeView = this.binding.coverImage;
            kotlin.jvm.internal.r.g(this.binding.coverImage, "binding.coverImage");
            ReactAssetUtilsKt.setOptionalReactImageUrl(var10, var2);
         }
      }
   }

   private fun setCoverImageButtonText(coverImageOverlayText: String?) {
      val var4: DCDButton = this.binding.coverImageOverlayButton;
      kotlin.jvm.internal.r.g(this.binding.coverImageOverlayButton, "setCoverImageButtonText$lambda$5");
      var var2: Boolean;
      if (var1 != null && !kotlin.text.f.x(var1)) {
         var2 = 0;
      } else {
         var2 = 1;
      }

      if (true xor var2) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      var4.setVisibility(var2);
      var4.setText(var1);
   }

   private fun setFooter(footer: StructurableText, messageId: MessageId) {
      val var5: SimpleDraweeSpanTextView = this.binding.footer;
      kotlin.jvm.internal.r.g(this.binding.footer, "setFooter_Ayv7vGE$lambda$4");
      val var4: Context = var5.getContext();
      val var6: FontMetrics = var5.getPaint().getFontMetrics();
      kotlin.jvm.internal.r.g(var6, "paint.fontMetrics");
      val var3: Float = TextUtilsKt.getBaselineHeightPx(var6);
      val var7: TextPaint = var5.getPaint();
      kotlin.jvm.internal.r.g(var4, "context");
      kotlin.jvm.internal.r.g(var7, "paint");
      ViewUtilsKt.setOptionalText(
         var5,
         TextUtilsKt.toSpannable$default(
            var1,
            var4,
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
            true,
            null,
            var3,
            null,
            11534208,
            null
         )
      );
      NestedScrollOnTouchUtilsKt.enableNestedSpanClickListener$default(var5, false, 1, null);
   }

   private fun setSubtitle(subtitle: CharSequence?) {
      val var4: TextView = this.binding.subtitle;
      kotlin.jvm.internal.r.g(this.binding.subtitle, "binding.subtitle");
      var var2: Boolean;
      if (var1 != null && !kotlin.text.f.x(var1)) {
         var2 = 0;
      } else {
         var2 = 1;
      }

      if (true xor var2) {
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

   private fun setupSpoilerView(spoilerConfig: SpoilerConfig?, isSpoiler: Boolean, isObscureAwaitingScan: Boolean) {
      this.binding.spoiler.configure(var1, this);
      val var5: SpoilerView = this.binding.spoiler;
      kotlin.jvm.internal.r.g(this.binding.spoiler, "binding.spoiler");
      val var4: Boolean;
      if (var5.getVisibility() == 0) {
         var4 = true;
      } else {
         var4 = false;
      }

      if (var4) {
         this.binding.spoiler.handleObscureAwaitingScan(var3);
         val var6: FrameLayout = this.binding.imageBlurBg;
         kotlin.jvm.internal.r.g(this.binding.imageBlurBg, "binding.imageBlurBg");
         var6.setVisibility(0);
         this.binding.coverImage.setImportantForAccessibility(4);
      } else {
         val var7: FrameLayout = this.binding.imageBlurBg;
         kotlin.jvm.internal.r.g(this.binding.imageBlurBg, "binding.imageBlurBg");
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
      spoilerConfig: SpoilerConfig?
   ) {
      kotlin.jvm.internal.r.h(var1, "title");
      kotlin.jvm.internal.r.h(var3, "ctaCopy");
      kotlin.jvm.internal.r.h(var5, "footer");
      kotlin.jvm.internal.r.h(var6, "messageId");
      kotlin.jvm.internal.r.h(var11, "onButtonClickListener");
      this.setButtonText(var3);
      this.setButtonColor(var4);
      this.setTitle(var1);
      this.setSubtitle(var2);
      this.setFooter-Ayv7vGE(var5, var6);
      this.setCoverImage(var7, var8, var10);
      this.setCoverImageButtonText(var9);
      this.binding.cta.setOnClickButtonListener(var11);
      val var15: SimpleDraweeView = this.binding.coverImage;
      kotlin.jvm.internal.r.g(this.binding.coverImage, "binding.coverImage");
      NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var15, false, var11, 1, null);
      this.binding.coverImageOverlayButton.setOnClickButtonListener(var11);
      this.setupSpoilerView(var14, var12, var13);
   }
}
