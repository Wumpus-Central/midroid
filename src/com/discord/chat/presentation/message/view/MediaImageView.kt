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
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nMediaImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaImageView.kt\ncom/discord/chat/presentation/message/view/MediaImageView\n+ 2 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,258:1\n27#2:259\n311#3:260\n327#3,4:261\n312#3:265\n257#3,2:266\n257#3,2:268\n*S KotlinDebug\n*F\n+ 1 MediaImageView.kt\ncom/discord/chat/presentation/message/view/MediaImageView\n*L\n61#1:259\n155#1:260\n155#1:261,4\n155#1:265\n189#1:266,2\n249#1:268,2\n*E\n"])
public open class MediaImageView  public constructor(context: Context, attrs: AttributeSet? = null) : FrameLayout(var1, var2), MosaicView {
   public final val binding: MediaImageViewBinding
   private final val spoilerViewManager: SpoilerViewManager
   private final val attachmentUploadOverlay: AttachmentUploadOverlayViewManager
   private final val imageFadeDuration: Int
   private final lateinit var targetSize: com.discord.chat.presentation.message.view.MediaImageView.TargetSize
   private final lateinit var targetUrl: String

   open fun MediaImageView(var1: Context) {
      this(var1, null, 2, null);
   }

   init {
      val var3: MediaImageViewBinding = MediaImageViewBinding.inflate(LayoutInflater.from(var1), this);
      this.binding = var3;
      this.spoilerViewManager = new SpoilerViewManager();
      this.attachmentUploadOverlay = new AttachmentUploadOverlayViewManager();
      this.imageFadeDuration = this.getResources().getInteger(R.integer.image_fade_duration);
      (var3.image.getHierarchy() as GenericDraweeHierarchy).A(new ColorDrawable(ThemeManagerKt.getTheme().getBackgroundSecondaryAlt()));
      val var4: TextView = var3.imageAltText;
      var3.imageAltText.setImportantForAccessibility(4);
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryNormal);
      var4.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      SetTextSizeSpKt.setTextSizeSp(var4, 12.0F);
      var3.imageBlurBg.setBackgroundColor(ThemeManagerKt.getTheme().getBackgroundMobilePrimary());
   }

   private fun configureGifIndicator(shouldAutoPlayGif: Boolean, filename: String?, srcIsAnimated: Boolean) {
      val var5: SimpleDraweeView = this.binding.gifIndicator;
      val var4: Byte;
      if (this.shouldShowGifIndicator(var1, var2, var3)) {
         var4 = 0;
      } else {
         var4 = 8;
      }

      var5.setVisibility(var4);
   }

   private fun getHeight(isEligibleForMinConstraints: Boolean, height: Int): Int {
      return if (var1 && var2 <= 212) SizeUtilsKt.getDpToPx(212) else var2;
   }

   private fun getWidth(isEligibleForMinConstraints: Boolean, width: Int): Int {
      return if (var1 && var2 <= 146) SizeUtilsKt.getDpToPx(146) else var2;
   }

   private fun shouldShowGifIndicator(shouldAutoPlayGif: Boolean, filename: String?, srcIsAnimated: Boolean): Boolean {
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

               if (!StringsKt.s(var2, ".gif", true) && !StringsKt.s(var2, ".gifv", true) && (!StringsKt.s(var2, ".webp", false) || !var3)) {
                  if (!StringsKt.s(var2, ".avif", false)) {
                     return false;
                  }

                  if (!var3) {
                     return false;
                  }
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
         Intrinsics.throwUninitializedPropertyAccessException("targetSize");
         var2 = null;
      }

      val var1: Float = var2.getWidth();
      var2 = this.targetSize;
      if (this.targetSize == null) {
         Intrinsics.throwUninitializedPropertyAccessException("targetSize");
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
      obscureHideControls: Boolean,
      obscureIsOpaque: Boolean,
      isPartOfMosaic: Boolean,
      shouldAutoPlayGif: Boolean,
      filename: String?,
      srcIsAnimated: Boolean
   ) {
      label67: {
         if (this.targetUrl != null) {
            var var21: java.lang.String = this.targetUrl;
            if (this.targetUrl == null) {
               Intrinsics.throwUninitializedPropertyAccessException("targetUrl");
               var21 = null;
            }

            if (var21 == var1) {
               break label67;
            }
         }

         this.targetUrl = var1;
         val var37: GenericDraweeHierarchy = this.binding.image.getHierarchy() as GenericDraweeHierarchy;
         val var19: Int;
         if (var11) {
            var19 = 0;
         } else {
            var19 = this.imageFadeDuration;
         }

         var37.x(var19);
         val var39: SimpleDraweeView = this.binding.image;
         val var38: java.lang.Boolean = java.lang.Boolean.TRUE;
         val var24: SimpleDraweeView = this.binding.image;
         SetOptionalImageUrlKt.setOptionalImageUrl(
            var39, var1, var38, var18, GetMediaImagePlaceholderStatesListenerKt.getMediaImagePlaceholderStatesListener(var24, var5, var6)
         );
      }

      val var20: Boolean;
      if ((var11 || var12) && !var15) {
         var20 = true;
      } else {
         var20 = false;
      }

      label50: {
         val var30: MediaImageView.TargetSize = new MediaImageView.TargetSize(this.getWidth(var20, var2), this.getHeight(var20, var3), var4);
         var var25: MediaImageView.TargetSize = this.targetSize;
         if (this.targetSize != null) {
            if (this.targetSize == null) {
               Intrinsics.throwUninitializedPropertyAccessException("targetSize");
               var25 = null;
            }

            if (var25 == var30) {
               break label50;
            }
         }

         this.targetSize = var30;
      }

      this.binding.image.setBackgroundColor(0);
      val var26: SimpleDraweeView = this.binding.image;
      ViewClippingUtilsKt.clipToRoundedRectangle(var26, var9);
      this.binding.imageBlurBg.setBackgroundColor(0);
      val var27: FrameLayout = this.binding.imageBlurBg;
      ViewClippingUtilsKt.clipToRoundedRectangle(var27, var9);
      val var28: SpoilerViewManager = this.spoilerViewManager;
      val var33: ConstraintLayout = this.binding.container;
      val var34: SimpleDraweeView = this.binding.image;
      if (var11 && !var15) {
         var15 = true;
      } else {
         var15 = false;
      }

      if (!var7 && !var11) {
         var7 = false;
      } else {
         var7 = true;
      }

      var28.configureSpoiler(var8, this, var33, var34, this.binding.imageBlurBg, var15, var12, var7, var9, var13, var14);
      val var29: AttachmentUploadOverlayViewManager = this.attachmentUploadOverlay;
      val var32: ConstraintLayout = this.binding.container;
      var29.configureAttachmentOverlay(this, var32, var9, var10);
      this.configureGifIndicator(var16, var17, var18);
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
         var5.append(", ");
         var5.append(var3);
         var4.setContentDescription(var5.toString());
      }
   }

   public override fun setMosaicSize(width: Int, height: Int) {
      val var4: ConstraintLayout = this.binding.container;
      val var3: LayoutParams = var4.getLayoutParams();
      if (var3 != null) {
         var3.width = var1;
         var3.height = var2;
         var4.setLayoutParams(var3);
      } else {
         throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
      }
   }

   public fun setRole(role: String?) {
      if (var1 != null) {
         androidx.core.view.Z.o0(this.binding.image, new androidx.core.view.a(var1) {
            final java.lang.String $role;

            {
               this.$role = var1;
            }

            @Override
            public void onInitializeAccessibilityNodeInfo(View var1, AccessibilityNodeInfoCompat var2) {
               super.onInitializeAccessibilityNodeInfo(var1, var2);
               var2.S0(this.$role);
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
      public final val GIF_INDICATOR_WIDTH: Int
      public final val GIF_INDICATOR_PADDING: Int
   }

   public data class TargetSize(width: Int, height: Int, resizeMode: ResizeMode) {
      public final val width: Int
      public final val height: Int
      public final val resizeMode: ResizeMode

      init {
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
         val var2: Int = this.width;
         val var1: Int = this.height;
         val var4: MediaContainingViewResizer.ResizeMode = this.resizeMode;
         val var3: StringBuilder = new StringBuilder();
         var3.append("TargetSize(width=");
         var3.append(var2);
         var3.append(", height=");
         var3.append(var1);
         var3.append(", resizeMode=");
         var3.append(var4);
         var3.append(")");
         return var3.toString();
      }
   }
}
