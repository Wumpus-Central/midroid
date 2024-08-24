package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.View.OnLongClickListener
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.f1
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.databinding.VideoAttachmentViewBinding
import com.discord.chat.presentation.media.MediaContainingViewResizer
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.image.fresco.R.integer
import com.discord.media_player.MediaSource
import com.discord.media_player.MediaPlayer.PlayerSettings
import com.discord.media_player.reactevents.MediaPlayFinishedAnalytics
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.theme.ThemeManagerKt
import kotlin.jvm.functions.Function0

public class MediaVideoView  public constructor(context: Context, attrs: AttributeSet? = null) : ConstraintLayout {
   private final lateinit var targetSize: com.discord.chat.presentation.message.view.MediaVideoView.TargetSize
   private final lateinit var targetUrl: com.discord.chat.presentation.message.view.MediaVideoView.TargetUrl
   private final val binding: VideoAttachmentViewBinding
   private final val thumbnailFadeDuration: Int

   fun MediaVideoView(var1: Context) {
      kotlin.jvm.internal.r.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.r.h(var1, "context");
      super(var1, var2);
      val var3: VideoAttachmentViewBinding = VideoAttachmentViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.r.g(var3, "inflate(LayoutInflater.from(context), this)");
      this.binding = var3;
      this.thumbnailFadeDuration = this.getResources().getInteger(integer.image_fade_duration);
      val var4: TextView = var3.mediaViewAltText;
      var3.mediaViewAltText.setImportantForAccessibility(4);
      kotlin.jvm.internal.r.g(var4, "_init_$lambda$0");
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryNormal);
      var4.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      SetTextSizeSpKt.setTextSizeSp(var4, 12.0F);
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

   public fun setContent(
      mediaSource: MediaSource,
      width: Int,
      height: Int,
      maxWidthPx: Int,
      maxHeightPx: Int,
      radiusPx: Int,
      isPartOfMosaic: Boolean,
      isSpoiler: Boolean,
      spoilerConfig: SpoilerConfig?,
      isObscure: Boolean,
      isObscureAwaitingScan: Boolean,
      uploadItemProps: UploadItemProps?,
      canPlayInline: Boolean,
      hideMediaPlayButton: Boolean,
      overlayTagText: String?,
      overlayTagIcon: ReactAsset?,
      overlayTagBackgroundColor: Int?,
      overlayTagTextColor: Int?,
      playerSettings: PlayerSettings
   ) {
      kotlin.jvm.internal.r.h(var1, "mediaSource");
      kotlin.jvm.internal.r.h(var19, "playerSettings");
      val var21: java.lang.String = var1.getSourceUrl();
      if (var21 != null) {
         val var22: java.lang.String = var1.getPreviewUrl();
         if (var22 != null) {
            label77: {
               val var24: MediaVideoView.TargetUrl = new MediaVideoView.TargetUrl(var21, var22);
               if (this.targetUrl != null) {
                  var var35: MediaVideoView.TargetUrl = this.targetUrl;
                  if (this.targetUrl == null) {
                     kotlin.jvm.internal.r.y("targetUrl");
                     var35 = null;
                  }

                  if (kotlin.jvm.internal.r.c(var35, var24)) {
                     break label77;
                  }
               }

               this.targetUrl = var24;
               val var36: MediaView = this.binding.mediaView;
               kotlin.jvm.internal.r.g(this.binding.mediaView, "binding.mediaView");
               val var20: Int;
               if (var10) {
                  var20 = 0;
               } else {
                  var20 = this.thumbnailFadeDuration;
               }

               MediaView.setMediaData$default(
                  var36, var1, false, false, false, null, false, null, null, var13, false, var14, var20, new Function0<Unit>(var10, this) {
                     final boolean $isObscure;
                     final MediaVideoView this$0;

                     {
                        super(0);
                        this.$isObscure = var1;
                        this.this$0 = var2;
                     }

                     public final void invoke() {
                        if (this.$isObscure) {
                           MediaVideoView.access$getBinding$p(this.this$0).spoiler.makeObscureHideButtonHidden();
                        }
                     }
                  }, var15, var16, var17, var18, var19, 766, null
               );
            }

            label78: {
               val var34: MediaVideoView.TargetSize = new MediaVideoView.TargetSize(var2, var3, var5);
               if (this.targetSize != null) {
                  var var25: MediaVideoView.TargetSize = this.targetSize;
                  if (this.targetSize == null) {
                     kotlin.jvm.internal.r.y("targetSize");
                     var25 = null;
                  }

                  if (kotlin.jvm.internal.r.c(var25, var34)) {
                     break label78;
                  }
               }

               this.targetSize = var34;
               val var33: MediaContainingViewResizer = MediaContainingViewResizer.INSTANCE;
               var2 = var34.getWidth();
               var var26: MediaVideoView.TargetSize = this.targetSize;
               if (this.targetSize == null) {
                  kotlin.jvm.internal.r.y("targetSize");
                  var26 = null;
               }

               MediaContainingViewResizer.resizeLayoutParams$default(var33, this, var2, var26.getHeight(), var4, var5, null, 16, null);
            }

            val var27: MediaView = this.binding.mediaView;
            kotlin.jvm.internal.r.g(this.binding.mediaView, "binding.mediaView");
            ViewClippingUtilsKt.clipToRoundedRectangle(var27, var6);
            val var28: SpoilerView = this.binding.spoiler;
            kotlin.jvm.internal.r.g(this.binding.spoiler, "binding.spoiler");
            ViewClippingUtilsKt.clipToRoundedRectangle(var28, var6);
            this.binding.spoiler.configure(var9, this);
            if ((var8 || var10) && this.binding.spoiler.isOverlayVisible()) {
               if (var10 && !var7) {
                  var7 = true;
               } else {
                  var7 = false;
               }

               this.binding.spoiler.setObscureLabelVisible(var7);
               this.binding.spoiler.handleObscureAwaitingScan(var11);
               this.binding.mediaView.setImportantForAccessibility(4);
               this.binding.mediaView.clearFocus();
            } else {
               this.binding.mediaView.setImportantForAccessibility(0);
               if (var8 || var10) {
                  this.binding.mediaView.requestFocus();
               }
            }

            this.setUploadProps(var12);
         }
      }
   }

   public fun setDescription(description: String?, hint: String?) {
      val var4: MediaView = this.binding.mediaView;
      var var3: java.lang.String = var1;
      if (var1 == null) {
         var3 = "";
      }

      var1 = var2;
      if (var2 == null) {
         var1 = "";
      }

      val var6: StringBuilder = new StringBuilder();
      var6.append(var3);
      var6.append(" ");
      var6.append(var1);
      var4.setContentDescription(var6.toString());
   }

   public fun setMediaAnalyticsListener(onMediaPlayFinishedAnalytics: (MediaPlayFinishedAnalytics) -> Unit) {
      kotlin.jvm.internal.r.h(var1, "onMediaPlayFinishedAnalytics");
      this.binding.mediaView.setAnalyticsListener(var1);
   }

   public fun setOnMediaClickListeners(onClickListener: OnClickListener, onLongClickListener: OnLongClickListener?) {
      kotlin.jvm.internal.r.h(var1, "onClickListener");
      this.binding.mediaView.setOnMediaClickListeners(var1, var2);
   }

   public fun setRole(role: String?) {
      if (var1 != null) {
         f1.q0(this.binding.mediaView, new androidx.core.view.a(var1) {
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
      val var5: TextView = this.binding.mediaViewAltText;
      kotlin.jvm.internal.r.g(this.binding.mediaViewAltText, "showDescription$lambda$1");
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

   public data class TargetSize(width: Int, height: Int, maxHeightPx: Int) {
      public final val height: Int
      public final val maxHeightPx: Int
      public final val width: Int

      init {
         this.width = var1;
         this.height = var2;
         this.maxHeightPx = var3;
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

      public fun copy(width: Int = var0.width, height: Int = var0.height, maxHeightPx: Int = var0.maxHeightPx): com.discord.chat.presentation.message.view.MediaVideoView.TargetSize {
         return new MediaVideoView.TargetSize(var1, var2, var3);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is MediaVideoView.TargetSize) {
            return false;
         } else {
            var1 = var1;
            if (this.width != var1.width) {
               return false;
            } else if (this.height != var1.height) {
               return false;
            } else {
               return this.maxHeightPx == var1.maxHeightPx;
            }
         }
      }

      public override fun hashCode(): Int {
         return (Integer.hashCode(this.width) * 31 + Integer.hashCode(this.height)) * 31 + Integer.hashCode(this.maxHeightPx);
      }

      public override fun toString(): String {
         val var3: Int = this.width;
         val var2: Int = this.height;
         val var1: Int = this.maxHeightPx;
         val var4: StringBuilder = new StringBuilder();
         var4.append("TargetSize(width=");
         var4.append(var3);
         var4.append(", height=");
         var4.append(var2);
         var4.append(", maxHeightPx=");
         var4.append(var1);
         var4.append(")");
         return var4.toString();
      }
   }

   public data class TargetUrl(sourceUrl: String, previewUrl: String) {
      public final val previewUrl: String
      public final val sourceUrl: String

      init {
         kotlin.jvm.internal.r.h(var1, "sourceUrl");
         kotlin.jvm.internal.r.h(var2, "previewUrl");
         super();
         this.sourceUrl = var1;
         this.previewUrl = var2;
      }

      public operator fun component1(): String {
         return this.sourceUrl;
      }

      public operator fun component2(): String {
         return this.previewUrl;
      }

      public fun copy(sourceUrl: String = var0.sourceUrl, previewUrl: String = var0.previewUrl): com.discord.chat.presentation.message.view.MediaVideoView.TargetUrl {
         kotlin.jvm.internal.r.h(var1, "sourceUrl");
         kotlin.jvm.internal.r.h(var2, "previewUrl");
         return new MediaVideoView.TargetUrl(var1, var2);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is MediaVideoView.TargetUrl) {
            return false;
         } else {
            var1 = var1;
            if (!kotlin.jvm.internal.r.c(this.sourceUrl, var1.sourceUrl)) {
               return false;
            } else {
               return kotlin.jvm.internal.r.c(this.previewUrl, var1.previewUrl);
            }
         }
      }

      public override fun hashCode(): Int {
         return this.sourceUrl.hashCode() * 31 + this.previewUrl.hashCode();
      }

      public override fun toString(): String {
         val var1: java.lang.String = this.sourceUrl;
         val var3: java.lang.String = this.previewUrl;
         val var2: StringBuilder = new StringBuilder();
         var2.append("TargetUrl(sourceUrl=");
         var2.append(var1);
         var2.append(", previewUrl=");
         var2.append(var3);
         var2.append(")");
         return var2.toString();
      }
   }
}
