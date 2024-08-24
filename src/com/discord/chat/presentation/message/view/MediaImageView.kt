package com.discord.chat.presentation.message.view

import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.f1
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.databinding.MediaImageViewBinding
import com.discord.chat.presentation.media.MediaContainingViewResizer
import com.discord.chat.presentation.media.MediaContainingViewResizer.ResizeMode
import com.discord.chat.presentation.message.utils.GetMediaImagePlaceholderStatesListenerKt
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.image.fresco.SetOptionalImageUrlKt
import com.discord.image.fresco.R.integer
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.react_asset_fetcher.ReactAssetUtilsKt
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.view.SimpleDraweeView

public class MediaImageView  public constructor(context: Context, attrs: AttributeSet? = null) : ConstraintLayout {
   public final val binding: MediaImageViewBinding
   private final val imageFadeDuration: Int
   private final lateinit var targetSize: com.discord.chat.presentation.message.view.MediaImageView.TargetSize
   private final lateinit var targetUrl: String

   fun MediaImageView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2);
      val var5: MediaImageViewBinding = MediaImageViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var5, "inflate(LayoutInflater.from(context), this)");
      this.binding = var5;
      this.imageFadeDuration = this.getResources().getInteger(integer.image_fade_duration);
      (var5.image.getHierarchy() as GenericDraweeHierarchy).z(new ColorDrawable(ThemeManagerKt.getTheme().getBackgroundSecondaryAlt()));
      val var3: TextView = var5.imageAltText;
      var5.imageAltText.setImportantForAccessibility(4);
      kotlin.jvm.internal.r.g(var3, "_init_$lambda$0");
      DiscordFontUtilsKt.setDiscordFont(var3, DiscordFont.PrimaryNormal);
      var3.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      SetTextSizeSpKt.setTextSizeSp(var3, 12.0F);
      var5.imageBlurBg.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundMobilePrimary());
      val var4: SimpleDraweeView = var5.gifIndicator;
      kotlin.jvm.internal.r.g(var5.gifIndicator, "binding.gifIndicator");
      ReactAssetUtilsKt.setReactAsset(var4, ReactAsset.Gif);
   }

   private fun configureGifIndicator(shouldAutoPlayGif: Boolean, filename: String?) {
      val var4: SimpleDraweeView = this.binding.gifIndicator;
      kotlin.jvm.internal.r.g(this.binding.gifIndicator, "binding.gifIndicator");
      val var3: Byte;
      if (this.shouldShowGifIndicator(var1, var2)) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      var4.setVisibility(var3);
   }

   private fun getHeight(isEligibleForMinConstraints: Boolean, height: Int): Int {
      return if (var1 && var2 <= 212) SizeUtilsKt.getDpToPx(212) else var2;
   }

   private fun getWidth(isEligibleForMinConstraints: Boolean, width: Int): Int {
      return if (var1 && var2 <= 146) SizeUtilsKt.getDpToPx(146) else var2;
   }

   private fun setUploadProps(uploadItemProps: UploadItemProps?) {
      if (var1 == null) {
         this.binding.getRoot().setAlpha(1.0F);
         this.binding.uploadOverlay.setProgress(null);
         this.binding.uploadOverlay.setUploadCancel(null);
      } else {
         this.binding.getRoot().setAlpha(var1.getUploadOpacity());
         this.binding.uploadOverlay.setProgress(var1);
         this.binding.uploadOverlay.setUploadCancel(var1);
      }
   }

   private fun shouldShowGifIndicator(shouldAutoPlayGif: Boolean, filename: String?): Boolean {
      if (var1) {
         return false;
      } else {
         val var3: Int = GIF_INDICATOR_PADDING;
         var1 = false;
         if (this.getLayoutParams().height > GIF_INDICATOR_HEIGHT + GIF_INDICATOR_PADDING * 2) {
            if (this.getLayoutParams().width <= GIF_INDICATOR_WIDTH + var3 * 2) {
               var1 = false;
            } else {
               if (var2 == null) {
                  return false;
               }

               if (!kotlin.text.f.s(var2, ".gif", true) && !kotlin.text.f.s(var2, ".gifv", true)) {
                  return false;
               }

               var1 = true;
            }
         }

         return var1;
      }
   }

   public fun setContent(
      url: String,
      width: Int,
      height: Int,
      maxHeightPx: Int,
      maxWidthPx: Int,
      resizeMode: ResizeMode,
      placeholder: String?,
      placeholderVersion: Int?,
      isSpoiler: Boolean,
      spoilerConfig: SpoilerConfig?,
      radiusPx: Int,
      uploadItemProps: UploadItemProps?,
      isObscure: Boolean,
      isObscureAwaitingScan: Boolean,
      isPartOfMosaic: Boolean,
      shouldAutoPlayGif: Boolean,
      filename: String?
   ) {
      label87: {
         kotlin.jvm.internal.r.h(var1, "url");
         kotlin.jvm.internal.r.h(var6, "resizeMode");
         if (this.targetUrl != null) {
            var var21: java.lang.String = this.targetUrl;
            if (this.targetUrl == null) {
               kotlin.jvm.internal.r.y("targetUrl");
               var21 = null;
            }

            if (kotlin.jvm.internal.r.c(var21, var1)) {
               break label87;
            }
         }

         this.targetUrl = var1;
         val var42: GenericDraweeHierarchy = this.binding.image.getHierarchy() as GenericDraweeHierarchy;
         val var18: Int;
         if (var13) {
            var18 = 0;
         } else {
            var18 = this.imageFadeDuration;
         }

         var42.w(var18);
         val var43: SimpleDraweeView = this.binding.image;
         kotlin.jvm.internal.r.g(this.binding.image, "binding.image");
         val var44: java.lang.Boolean = java.lang.Boolean.TRUE;
         val var24: SimpleDraweeView = this.binding.image;
         kotlin.jvm.internal.r.g(this.binding.image, "binding.image");
         SetOptionalImageUrlKt.setOptionalImageUrl(
            var43, var1, var44, GetMediaImagePlaceholderStatesListenerKt.getMediaImagePlaceholderStatesListener(var24, var7, var8)
         );
      }

      val var41: Boolean;
      if (!var13 && !var14) {
         var41 = false;
      } else {
         var41 = true;
      }

      val var19: Boolean;
      if (var41 && !var15) {
         var19 = true;
      } else {
         var19 = false;
      }

      label88: {
         val var39: MediaImageView.TargetSize = new MediaImageView.TargetSize(this.getWidth(var19, var2), this.getHeight(var19, var3), var4, var6);
         if (this.targetSize != null) {
            var var25: MediaImageView.TargetSize = this.targetSize;
            if (this.targetSize == null) {
               kotlin.jvm.internal.r.y("targetSize");
               var25 = null;
            }

            if (kotlin.jvm.internal.r.c(var25, var39)) {
               break label88;
            }
         }

         this.targetSize = var39;
         val var38: MediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
         var3 = var39.getWidth();
         var var26: MediaImageView.TargetSize = this.targetSize;
         if (this.targetSize == null) {
            kotlin.jvm.internal.r.y("targetSize");
            var26 = null;
         }

         var2 = var26.getHeight();
         var var27: MediaImageView.TargetSize = this.targetSize;
         if (this.targetSize == null) {
            kotlin.jvm.internal.r.y("targetSize");
            var27 = null;
         }

         var38.resizeLayoutParams(this, var3, var2, var5, var4, var27.getResizeMode());
      }

      val var28: SimpleDraweeView = this.binding.image;
      kotlin.jvm.internal.r.g(this.binding.image, "binding.image");
      ViewClippingUtilsKt.clipToRoundedRectangle(var28, var11);
      val var29: SpoilerView = this.binding.spoiler;
      kotlin.jvm.internal.r.g(this.binding.spoiler, "binding.spoiler");
      ViewClippingUtilsKt.clipToRoundedRectangle(var29, var11);
      val var30: FrameLayout = this.binding.imageBlurBg;
      kotlin.jvm.internal.r.g(this.binding.imageBlurBg, "binding.imageBlurBg");
      ViewClippingUtilsKt.clipToRoundedRectangle(var30, var11);
      this.binding.spoiler.configure(var10, this);
      if ((var9 || var13) && this.binding.spoiler.isOverlayVisible()) {
         val var32: FrameLayout = this.binding.imageBlurBg;
         kotlin.jvm.internal.r.g(this.binding.imageBlurBg, "binding.imageBlurBg");
         var32.setVisibility(0);
         var9 = false;
         if (var13) {
            var9 = false;
            if (!var15) {
               var9 = true;
            }
         }

         this.binding.spoiler.setObscureLabelVisible(var9);
         this.binding.spoiler.handleObscureAwaitingScan(var14);
         this.binding.image.setImportantForAccessibility(4);
         this.binding.image.clearFocus();
      } else {
         val var31: FrameLayout = this.binding.imageBlurBg;
         kotlin.jvm.internal.r.g(this.binding.imageBlurBg, "binding.imageBlurBg");
         var31.setVisibility(8);
         this.binding.image.setImportantForAccessibility(0);
         if (var9 || var13) {
            this.binding.spoiler.clearFocus();
            this.binding.image.requestFocus();
         }
      }

      this.setUploadProps(var12);
      this.configureGifIndicator(var16, var17);
   }

   public fun setDescription(description: String?, hint: String?) {
      if (var1 != null) {
         val var4: SimpleDraweeView = this.binding.image;
         var var3: java.lang.String = var2;
         if (var2 == null) {
            var3 = "";
         }

         val var5: StringBuilder = new StringBuilder();
         var5.append(var1);
         var5.append(" ");
         var5.append(var3);
         var4.setContentDescription(var5.toString());
      }
   }

   public fun setRole(role: String?) {
      if (var1 != null) {
         f1.q0(this.binding.image, new androidx.core.view.a(var1) {
            final java.lang.String $role;

            {
               this.$role = var1;
            }

            public void onInitializeAccessibilityNodeInfo(View var1, AccessibilityNodeInfoCompat var2) {
               kotlin.jvm.internal.r.h(var1, "host");
               kotlin.jvm.internal.r.h(var2, "info");
               super.onInitializeAccessibilityNodeInfo(var1, var2);
               var2.L0(this.$role);
            }
         });
      }
   }

   public fun showAltTextButton(show: Boolean, description: String?, onAltTextButtonClicked: ((String) -> Unit)?) {
      if (!var1) {
         var2 = null;
      }

      this.binding.mediaViewAltTextButton.configure(var2, var3);
   }

   public fun showDescription(show: Boolean, description: String?) {
      val var5: TextView = this.binding.imageAltText;
      kotlin.jvm.internal.r.g(this.binding.imageAltText, "showDescription$lambda$1");
      ViewUtilsKt.setOptionalText(var5, var2);
      var var3: Boolean;
      if (var2 != null && var1) {
         var3 = 1;
      } else {
         var3 = 0;
      }

      if (var3) {
         var3 = 0;
      } else {
         var3 = 8;
      }

      var5.setVisibility(var3);
   }

   public companion object {
      public final val GIF_INDICATOR_HEIGHT: Int
      public final val GIF_INDICATOR_PADDING: Int
      public final val GIF_INDICATOR_WIDTH: Int
   }

   public data class TargetSize(width: Int, height: Int, maxHeightPx: Int, resizeMode: ResizeMode) {
      public final val height: Int
      public final val maxHeightPx: Int
      public final val resizeMode: ResizeMode
      public final val width: Int

      init {
         kotlin.jvm.internal.r.h(var4, "resizeMode");
         super();
         this.width = var1;
         this.height = var2;
         this.maxHeightPx = var3;
         this.resizeMode = var4;
      }

      public operator fun component1(): Int {
         return this.width;
      }

      public operator fun component2(): Int {
         return this.height;
      }

      public operator fun component3(): Int {
         return this.maxHeightPx;
      }

      public operator fun component4(): ResizeMode {
         return this.resizeMode;
      }

      public fun copy(width: Int = var0.width, height: Int = var0.height, maxHeightPx: Int = var0.maxHeightPx, resizeMode: ResizeMode = var0.resizeMode): com.discord.chat.presentation.message.view.MediaImageView.TargetSize {
         kotlin.jvm.internal.r.h(var4, "resizeMode");
         return new MediaImageView.TargetSize(var1, var2, var3, var4);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is MediaImageView.TargetSize) {
            return false;
         } else {
            var1 = var1;
            if (this.width != var1.width) {
               return false;
            } else if (this.height != var1.height) {
               return false;
            } else if (this.maxHeightPx != var1.maxHeightPx) {
               return false;
            } else {
               return this.resizeMode === var1.resizeMode;
            }
         }
      }

      public override fun hashCode(): Int {
         return ((Integer.hashCode(this.width) * 31 + Integer.hashCode(this.height)) * 31 + Integer.hashCode(this.maxHeightPx)) * 31
            + this.resizeMode.hashCode();
      }

      public override fun toString(): String {
         val var1: Int = this.width;
         val var3: Int = this.height;
         val var2: Int = this.maxHeightPx;
         val var5: MediaContainingViewResizer.ResizeMode = this.resizeMode;
         val var4: StringBuilder = new StringBuilder();
         var4.append("TargetSize(width=");
         var4.append(var1);
         var4.append(", height=");
         var4.append(var3);
         var4.append(", maxHeightPx=");
         var4.append(var2);
         var4.append(", resizeMode=");
         var4.append(var5);
         var4.append(")");
         return var4.toString();
      }
   }
}
