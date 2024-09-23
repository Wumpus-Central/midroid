package com.discord.chat.presentation.message.view

import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup.LayoutParams
import android.widget.FrameLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.databinding.MediaImageViewBinding
import com.discord.chat.presentation.media.MediaContainingViewResizer
import com.discord.chat.presentation.media.MediaContainingViewResizer.ResizeMode
import com.discord.chat.presentation.message.utils.GetMediaImagePlaceholderStatesListenerKt
import com.discord.chat.presentation.message.view.mosaic_recycler.MosaicView
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.image.fresco.R
import com.discord.image.fresco.SetOptionalImageUrlKt
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.discord.theme.ThemeManagerKt
import com.facebook.drawee.generic.GenericDraweeHierarchy
import com.facebook.drawee.view.SimpleDraweeView

public class MediaImageView  public constructor(context: Context, attrs: AttributeSet? = null) : FrameLayout, MosaicView {
   public final val binding: MediaImageViewBinding
   private final val spoiler: SpoilerViewManager
   private final val attachmentUploadOverlay: AttachmentUploadOverlayViewManager
   private final val imageFadeDuration: Int
   private final lateinit var targetSize: com.discord.chat.presentation.message.view.MediaImageView.TargetSize
   private final lateinit var targetUrl: String

   fun MediaImageView(var1: Context) {
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2);
      val var3: MediaImageViewBinding = MediaImageViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var3, "inflate(...)");
      this.binding = var3;
      this.spoiler = new SpoilerViewManager();
      this.attachmentUploadOverlay = new AttachmentUploadOverlayViewManager();
      this.imageFadeDuration = this.getResources().getInteger(R.integer.image_fade_duration);
      (var3.image.getHierarchy() as GenericDraweeHierarchy).A(new ColorDrawable(ThemeManagerKt.getTheme().getBackgroundSecondaryAlt()));
      val var4: TextView = var3.imageAltText;
      var3.imageAltText.setImportantForAccessibility(4);
      kotlin.jvm.internal.q.e(var4);
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryNormal);
      var4.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      SetTextSizeSpKt.setTextSizeSp(var4, 12.0F);
      var3.imageBlurBg.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundMobilePrimary());
   }

   private fun configureGifIndicator(shouldAutoPlayGif: Boolean, filename: String?) {
      val var4: SimpleDraweeView = this.binding.gifIndicator;
      kotlin.jvm.internal.q.g(this.binding.gifIndicator, "gifIndicator");
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

   private fun shouldShowGifIndicator(shouldAutoPlayGif: Boolean, filename: String?): Boolean {
      if (var1) {
         return false;
      } else {
         val var4: Int = GIF_INDICATOR_PADDING;
         var1 = false;
         if (this.getLayoutParams().height > GIF_INDICATOR_HEIGHT + GIF_INDICATOR_PADDING * 2) {
            if (this.getLayoutParams().width <= GIF_INDICATOR_WIDTH + var4 * 2) {
               var1 = false;
            } else {
               if (var2 == null) {
                  return false;
               }

               if (!kotlin.text.h.s(var2, ".gif", true) && !kotlin.text.h.s(var2, ".gifv", true)) {
                  return false;
               }

               var1 = true;
            }
         }

         return var1;
      }
   }

   public override fun getSingleAspectRatio(): Float {
      var var2: MediaImageView.TargetSize = this.targetSize;
      if (this.targetSize == null) {
         kotlin.jvm.internal.q.y("targetSize");
         var2 = null;
      }

      val var1: Float = var2.getWidth();
      var2 = this.targetSize;
      if (this.targetSize == null) {
         kotlin.jvm.internal.q.y("targetSize");
         var2 = null;
      }

      return var1 / var2.getHeight();
   }

   public fun setContent(
      url: String,
      width: Int,
      height: Int,
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
      label67: {
         kotlin.jvm.internal.q.h(var1, "url");
         kotlin.jvm.internal.q.h(var4, "resizeMode");
         if (this.targetUrl != null) {
            var var18: java.lang.String = this.targetUrl;
            if (this.targetUrl == null) {
               kotlin.jvm.internal.q.y("targetUrl");
               var18 = null;
            }

            if (kotlin.jvm.internal.q.c(var18, var1)) {
               break label67;
            }
         }

         this.targetUrl = var1;
         val var34: GenericDraweeHierarchy = this.binding.image.getHierarchy() as GenericDraweeHierarchy;
         val var16: Int;
         if (var11) {
            var16 = 0;
         } else {
            var16 = this.imageFadeDuration;
         }

         var34.x(var16);
         val var35: SimpleDraweeView = this.binding.image;
         kotlin.jvm.internal.q.g(this.binding.image, "image");
         val var21: java.lang.Boolean = java.lang.Boolean.TRUE;
         val var36: SimpleDraweeView = this.binding.image;
         kotlin.jvm.internal.q.g(this.binding.image, "image");
         SetOptionalImageUrlKt.setOptionalImageUrl(
            var35, var1, var21, GetMediaImagePlaceholderStatesListenerKt.getMediaImagePlaceholderStatesListener(var36, var5, var6)
         );
      }

      val var17: Boolean;
      if ((var11 || var12) && !var13) {
         var17 = true;
      } else {
         var17 = false;
      }

      label50: {
         val var27: MediaImageView.TargetSize = new MediaImageView.TargetSize(this.getWidth(var17, var2), this.getHeight(var17, var3), var4);
         var var22: MediaImageView.TargetSize = this.targetSize;
         if (this.targetSize != null) {
            if (this.targetSize == null) {
               kotlin.jvm.internal.q.y("targetSize");
               var22 = null;
            }

            if (kotlin.jvm.internal.q.c(var22, var27)) {
               break label50;
            }
         }

         this.targetSize = var27;
      }

      val var23: SimpleDraweeView = this.binding.image;
      kotlin.jvm.internal.q.g(this.binding.image, "image");
      ViewClippingUtilsKt.clipToRoundedRectangle(var23, var9);
      val var24: FrameLayout = this.binding.imageBlurBg;
      kotlin.jvm.internal.q.g(this.binding.imageBlurBg, "imageBlurBg");
      ViewClippingUtilsKt.clipToRoundedRectangle(var24, var9);
      val var30: SpoilerViewManager = this.spoiler;
      val var28: ConstraintLayout = this.binding.container;
      kotlin.jvm.internal.q.g(this.binding.container, "container");
      val var25: SimpleDraweeView = this.binding.image;
      kotlin.jvm.internal.q.g(this.binding.image, "image");
      if (var11 && !var13) {
         var13 = true;
      } else {
         var13 = false;
      }

      if (!var7 && !var11) {
         var7 = false;
      } else {
         var7 = true;
      }

      var30.configureSpoiler(var8, this, var28, var25, this.binding.imageBlurBg, var13, var12, var7, var9);
      val var26: AttachmentUploadOverlayViewManager = this.attachmentUploadOverlay;
      val var29: ConstraintLayout = this.binding.container;
      kotlin.jvm.internal.q.g(this.binding.container, "container");
      var26.configureAttachmentOverlay(this, var29, var9, var10);
      this.configureGifIndicator(var14, var15);
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

   public override fun setMosaicSize(width: Int, height: Int) {
      val var3: ConstraintLayout = this.binding.container;
      kotlin.jvm.internal.q.g(this.binding.container, "container");
      val var4: LayoutParams = var3.getLayoutParams();
      if (var4 != null) {
         var4.width = var1;
         var4.height = var2;
         var3.setLayoutParams(var4);
      } else {
         throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
      }
   }

   public fun setRole(role: String?) {
      if (var1 != null) {
         androidx.core.view.r0.q0(this.binding.image, new androidx.core.view.a(var1) {
            final java.lang.String $role;

            {
               this.$role = var1;
            }

            @Override
            public void onInitializeAccessibilityNodeInfo(View var1, AccessibilityNodeInfoCompat var2) {
               kotlin.jvm.internal.q.h(var1, "host");
               kotlin.jvm.internal.q.h(var2, "info");
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
      kotlin.jvm.internal.q.e(this.binding.imageAltText);
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

   public data class TargetSize(width: Int, height: Int, resizeMode: ResizeMode) {
      public final val height: Int
      public final val resizeMode: ResizeMode
      public final val width: Int

      init {
         kotlin.jvm.internal.q.h(var3, "resizeMode");
         super();
         this.width = var1;
         this.height = var2;
         this.resizeMode = var3;
      }

      public operator fun component1(): Int {
         return this.width;
      }

      public operator fun component2(): Int {
         return this.height;
      }

      public operator fun component3(): ResizeMode {
         return this.resizeMode;
      }

      public fun copy(width: Int = var0.width, height: Int = var0.height, resizeMode: ResizeMode = var0.resizeMode): com.discord.chat.presentation.message.view.MediaImageView.TargetSize {
         kotlin.jvm.internal.q.h(var3, "resizeMode");
         return new MediaImageView.TargetSize(var1, var2, var3);
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
            } else {
               return this.resizeMode === var1.resizeMode;
            }
         }
      }

      public override fun hashCode(): Int {
         return (Integer.hashCode(this.width) * 31 + Integer.hashCode(this.height)) * 31 + this.resizeMode.hashCode();
      }

      public override fun toString(): String {
         val var1: Int = this.width;
         val var2: Int = this.height;
         val var3: MediaContainingViewResizer.ResizeMode = this.resizeMode;
         val var4: StringBuilder = new StringBuilder();
         var4.append("TargetSize(width=");
         var4.append(var1);
         var4.append(", height=");
         var4.append(var2);
         var4.append(", resizeMode=");
         var4.append(var3);
         var4.append(")");
         return var4.toString();
      }
   }
}
