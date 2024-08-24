package com.discord.chat.presentation.message.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.View.OnLongClickListener
import android.view.ViewGroup.LayoutParams
import android.widget.FrameLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.f1
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import com.discord.SetTextSizeSpKt
import com.discord.chat.R
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.databinding.VideoAttachmentViewBinding
import com.discord.chat.presentation.message.view.mosaic_recycler.MosaicView
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.media_player.MediaSource
import com.discord.media_player.MediaType
import com.discord.media_player.MediaPlayer.PlayerSettings
import com.discord.media_player.reactevents.MediaPlayFinishedAnalytics
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.discord.react_asset_fetcher.ReactAsset
import com.discord.theme.ThemeManagerKt
import kotlin.jvm.functions.Function0

public class MediaVideoView  public constructor(context: Context, attrs: AttributeSet? = null) : FrameLayout, MosaicView {
   private final lateinit var targetSize: com.discord.chat.presentation.message.view.MediaVideoView.TargetSize
   private final lateinit var targetUrl: com.discord.chat.presentation.message.view.MediaVideoView.TargetUrl
   private final val binding: VideoAttachmentViewBinding
   private final val spoilerViewManager: SpoilerViewManager
   private final val attachmentUploadOverlay: AttachmentUploadOverlayViewManager
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
      this.spoilerViewManager = new SpoilerViewManager();
      this.attachmentUploadOverlay = new AttachmentUploadOverlayViewManager();
      this.thumbnailFadeDuration = this.getResources().getInteger(R.integer.image_fade_duration);
      val var4: TextView = var3.mediaViewAltText;
      var3.mediaViewAltText.setImportantForAccessibility(4);
      kotlin.jvm.internal.r.g(var4, "_init_$lambda$0");
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryNormal);
      var4.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      SetTextSizeSpKt.setTextSizeSp(var4, 12.0F);
   }

   public override fun getSingleAspectRatio(): Float {
      var var2: MediaVideoView.TargetSize = this.targetSize;
      if (this.targetSize == null) {
         kotlin.jvm.internal.r.y("targetSize");
         var2 = null;
      }

      val var1: Float = var2.getWidth();
      var2 = this.targetSize;
      if (this.targetSize == null) {
         kotlin.jvm.internal.r.y("targetSize");
         var2 = null;
      }

      return var1 / var2.getHeight();
   }

   public fun setContent(
      sourceUrl: String,
      previewUrl: String,
      width: Int,
      height: Int,
      placeholder: String?,
      placeholderVersion: Int?,
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
      portal: Double,
      playerSettings: PlayerSettings
   ) {
      label56: {
         kotlin.jvm.internal.r.h(var1, "sourceUrl");
         kotlin.jvm.internal.r.h(var2, "previewUrl");
         kotlin.jvm.internal.r.h(var22, "playerSettings");
         val var26: MediaVideoView.TargetUrl = new MediaVideoView.TargetUrl(var1, var2);
         if (this.targetUrl != null) {
            var var24: MediaVideoView.TargetUrl = this.targetUrl;
            if (this.targetUrl == null) {
               kotlin.jvm.internal.r.y("targetUrl");
               var24 = null;
            }

            if (kotlin.jvm.internal.r.c(var24, var26)) {
               break label56;
            }
         }

         this.targetUrl = var26;
         val var40: MediaView = this.binding.mediaView;
         kotlin.jvm.internal.r.g(this.binding.mediaView, "binding.mediaView");
         val var41: StringBuilder = new StringBuilder();
         var41.append("video attachment: ");
         var41.append(var1);
         val var27: MediaSource = new MediaSource(var1, var2, var5, var6, var41.toString(), MediaType.VIDEO, false, null, null, var20, 448, null);
         val var23: Int;
         if (var11) {
            var23 = 0;
         } else {
            var23 = this.thumbnailFadeDuration;
         }

         MediaView.setMediaData$default(
            var40, var27, false, false, false, null, false, null, null, var14, false, var15, var23, new Function0<Unit>(var11, this) {
               final boolean $isObscure;
               final MediaVideoView this$0;

               {
                  super(0);
                  this.$isObscure = var1;
                  this.this$0 = var2;
               }

               public final void invoke() {
                  if (this.$isObscure) {
                     val var1: SpoilerView = MediaVideoView.access$getSpoilerViewManager$p(this.this$0).getSpoilerView();
                     if (var1 != null) {
                        var1.makeObscureHideButtonHidden();
                     }
                  }
               }
            }, var16, var17, var18, var19, var22, 766, null
         );
      }

      label47: {
         val var35: MediaVideoView.TargetSize = new MediaVideoView.TargetSize(var3, var4);
         if (this.targetSize != null) {
            var var28: MediaVideoView.TargetSize = this.targetSize;
            if (this.targetSize == null) {
               kotlin.jvm.internal.r.y("targetSize");
               var28 = null;
            }

            if (kotlin.jvm.internal.r.c(var28, var35)) {
               break label47;
            }
         }

         this.targetSize = var35;
      }

      val var29: MediaView = this.binding.mediaView;
      kotlin.jvm.internal.r.g(this.binding.mediaView, "binding.mediaView");
      ViewClippingUtilsKt.clipToRoundedRectangle(var29, var7);
      val var36: SpoilerViewManager = this.spoilerViewManager;
      val var33: ConstraintLayout = this.binding.container;
      kotlin.jvm.internal.r.g(this.binding.container, "binding.container");
      val var30: ConstraintLayout = this.binding.container;
      kotlin.jvm.internal.r.g(this.binding.container, "binding.container");
      val var37: MediaView = this.binding.mediaView;
      kotlin.jvm.internal.r.g(this.binding.mediaView, "binding.mediaView");
      if (var11 && !var8) {
         var8 = true;
      } else {
         var8 = false;
      }

      if (!var9 && !var11) {
         var9 = false;
      } else {
         var9 = true;
      }

      var36.configureSpoiler(var10, var33, var30, var37, null, var8, var12, var9, var7);
      val var31: AttachmentUploadOverlayViewManager = this.attachmentUploadOverlay;
      val var34: ConstraintLayout = this.binding.container;
      kotlin.jvm.internal.r.g(this.binding.container, "binding.container");
      var31.configureAttachmentOverlay(this, var34, var7, var13);
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

   public override fun setMosaicSize(width: Int, height: Int) {
      val var4: ConstraintLayout = this.binding.container;
      kotlin.jvm.internal.r.g(this.binding.container, "binding.container");
      val var3: LayoutParams = var4.getLayoutParams();
      if (var3 != null) {
         var3.width = var1;
         var3.height = var2;
         var4.setLayoutParams(var3);
      } else {
         throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
      }
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

   public data class TargetSize(width: Int, height: Int) {
      public final val height: Int
      public final val width: Int

      init {
         this.width = var1;
         this.height = var2;
      }

      public operator fun component1(): Int {
         return this.width;
      }

      public operator fun component2(): Int {
         return this.height;
      }

      public fun copy(width: Int = var0.width, height: Int = var0.height): com.discord.chat.presentation.message.view.MediaVideoView.TargetSize {
         return new MediaVideoView.TargetSize(var1, var2);
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
            } else {
               return this.height == var1.height;
            }
         }
      }

      public override fun hashCode(): Int {
         return Integer.hashCode(this.width) * 31 + Integer.hashCode(this.height);
      }

      public override fun toString(): String {
         val var2: Int = this.width;
         val var1: Int = this.height;
         val var3: StringBuilder = new StringBuilder();
         var3.append("TargetSize(width=");
         var3.append(var2);
         var3.append(", height=");
         var3.append(var1);
         var3.append(")");
         return var3.toString();
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
         val var2: java.lang.String = this.previewUrl;
         val var3: StringBuilder = new StringBuilder();
         var3.append("TargetUrl(sourceUrl=");
         var3.append(var1);
         var3.append(", previewUrl=");
         var3.append(var2);
         var3.append(")");
         return var3.toString();
      }
   }
}
