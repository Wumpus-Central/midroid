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
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat
import com.discord.SetTextSizeSpKt
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.databinding.VideoAttachmentViewBinding
import com.discord.chat.presentation.message.view.mosaic_recycler.MosaicView
import com.discord.fonts.DiscordFont
import com.discord.fonts.DiscordFontUtilsKt
import com.discord.image.fresco.R
import com.discord.media_player.MediaSource
import com.discord.media_player.MediaType
import com.discord.media_player.MediaPlayer.PlayerSettings
import com.discord.media_player.reactevents.MediaPlayFinishedAnalytics
import com.discord.misc.utilities.view.ViewClippingUtilsKt
import com.discord.misc.utilities.view.ViewUtilsKt
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
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
      kotlin.jvm.internal.q.h(var1, "context");
      this(var1, null, 2, null);
   }

   init {
      kotlin.jvm.internal.q.h(var1, "context");
      super(var1, var2);
      val var3: VideoAttachmentViewBinding = VideoAttachmentViewBinding.inflate(LayoutInflater.from(var1), this);
      kotlin.jvm.internal.q.g(var3, "inflate(...)");
      this.binding = var3;
      this.spoilerViewManager = new SpoilerViewManager();
      this.attachmentUploadOverlay = new AttachmentUploadOverlayViewManager();
      this.thumbnailFadeDuration = this.getResources().getInteger(R.integer.image_fade_duration);
      val var4: TextView = var3.mediaViewAltText;
      var3.mediaViewAltText.setImportantForAccessibility(4);
      kotlin.jvm.internal.q.e(var4);
      DiscordFontUtilsKt.setDiscordFont(var4, DiscordFont.PrimaryNormal);
      var4.setTextColor(ThemeManagerKt.getTheme().getTextMuted());
      SetTextSizeSpKt.setTextSizeSp(var4, 12.0F);
   }

   public override fun getSingleAspectRatio(): Float {
      var var2: MediaVideoView.TargetSize = this.targetSize;
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
      channelId: ChannelId?,
      messageId: MessageId?,
      attachmentIndex: Int?,
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
         kotlin.jvm.internal.q.h(var4, "sourceUrl");
         kotlin.jvm.internal.q.h(var5, "previewUrl");
         kotlin.jvm.internal.q.h(var25, "playerSettings");
         val var29: MediaVideoView.TargetUrl = new MediaVideoView.TargetUrl(var4, var5);
         if (this.targetUrl != null) {
            var var27: MediaVideoView.TargetUrl = this.targetUrl;
            if (this.targetUrl == null) {
               kotlin.jvm.internal.q.y("targetUrl");
               var27 = null;
            }

            if (kotlin.jvm.internal.q.c(var27, var29)) {
               break label56;
            }
         }

         this.targetUrl = var29;
         val var43: MediaView = this.binding.mediaView;
         kotlin.jvm.internal.q.g(this.binding.mediaView, "mediaView");
         val var44: StringBuilder = new StringBuilder();
         var44.append("video attachment: ");
         var44.append(var4);
         val var30: MediaSource = new MediaSource(var4, var5, var8, var9, var44.toString(), MediaType.VIDEO, false, var1, var2, var3, var23, 64, null);
         val var26: Int;
         if (var14) {
            var26 = 0;
         } else {
            var26 = this.thumbnailFadeDuration;
         }

         MediaView.setMediaData$default(var43, var30, false, false, false, null, false, null, null, var17, false, var18, var26, new Function0(var14, this) {
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
         }, var19, var20, var21, var22, var25, 766, null);
      }

      label47: {
         val var38: MediaVideoView.TargetSize = new MediaVideoView.TargetSize(var6, var7);
         if (this.targetSize != null) {
            var var31: MediaVideoView.TargetSize = this.targetSize;
            if (this.targetSize == null) {
               kotlin.jvm.internal.q.y("targetSize");
               var31 = null;
            }

            if (kotlin.jvm.internal.q.c(var31, var38)) {
               break label47;
            }
         }

         this.targetSize = var38;
      }

      val var32: MediaView = this.binding.mediaView;
      kotlin.jvm.internal.q.g(this.binding.mediaView, "mediaView");
      ViewClippingUtilsKt.clipToRoundedRectangle(var32, var10);
      val var40: SpoilerViewManager = this.spoilerViewManager;
      val var39: ConstraintLayout = this.binding.container;
      kotlin.jvm.internal.q.g(this.binding.container, "container");
      val var33: ConstraintLayout = this.binding.container;
      kotlin.jvm.internal.q.g(this.binding.container, "container");
      val var36: MediaView = this.binding.mediaView;
      kotlin.jvm.internal.q.g(this.binding.mediaView, "mediaView");
      if (var14 && !var11) {
         var11 = true;
      } else {
         var11 = false;
      }

      if (!var12 && !var14) {
         var12 = false;
      } else {
         var12 = true;
      }

      var40.configureSpoiler(var13, var39, var33, var36, null, var11, var15, var12, var10);
      val var34: AttachmentUploadOverlayViewManager = this.attachmentUploadOverlay;
      val var37: ConstraintLayout = this.binding.container;
      kotlin.jvm.internal.q.g(this.binding.container, "container");
      var34.configureAttachmentOverlay(this, var37, var10, var16);
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
      kotlin.jvm.internal.q.h(var1, "onMediaPlayFinishedAnalytics");
      this.binding.mediaView.setAnalyticsListener(var1);
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

   public fun setOnMediaClickListeners(onClickListener: OnClickListener, onLongClickListener: OnLongClickListener?) {
      kotlin.jvm.internal.q.h(var1, "onClickListener");
      this.binding.mediaView.setOnMediaClickListeners(var1, var2);
   }

   public fun setRole(role: String?) {
      if (var1 != null) {
         androidx.core.view.r0.q0(this.binding.mediaView, new androidx.core.view.a(var1) {
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
      val var5: TextView = this.binding.mediaViewAltText;
      kotlin.jvm.internal.q.e(this.binding.mediaViewAltText);
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
         val var1: Int = this.width;
         val var2: Int = this.height;
         val var3: StringBuilder = new StringBuilder();
         var3.append("TargetSize(width=");
         var3.append(var1);
         var3.append(", height=");
         var3.append(var2);
         var3.append(")");
         return var3.toString();
      }
   }

   public data class TargetUrl(sourceUrl: String, previewUrl: String) {
      public final val previewUrl: String
      public final val sourceUrl: String

      init {
         kotlin.jvm.internal.q.h(var1, "sourceUrl");
         kotlin.jvm.internal.q.h(var2, "previewUrl");
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
         kotlin.jvm.internal.q.h(var1, "sourceUrl");
         kotlin.jvm.internal.q.h(var2, "previewUrl");
         return new MediaVideoView.TargetUrl(var1, var2);
      }

      public override operator fun equals(other: Any?): Boolean {
         if (this === var1) {
            return true;
         } else if (var1 !is MediaVideoView.TargetUrl) {
            return false;
         } else {
            var1 = var1;
            if (!kotlin.jvm.internal.q.c(this.sourceUrl, var1.sourceUrl)) {
               return false;
            } else {
               return kotlin.jvm.internal.q.c(this.previewUrl, var1.previewUrl);
            }
         }
      }

      public override fun hashCode(): Int {
         return this.sourceUrl.hashCode() * 31 + this.previewUrl.hashCode();
      }

      public override fun toString(): String {
         val var3: java.lang.String = this.sourceUrl;
         val var2: java.lang.String = this.previewUrl;
         val var1: StringBuilder = new StringBuilder();
         var1.append("TargetUrl(sourceUrl=");
         var1.append(var3);
         var1.append(", previewUrl=");
         var1.append(var2);
         var1.append(")");
         return var1.toString();
      }
   }
}
