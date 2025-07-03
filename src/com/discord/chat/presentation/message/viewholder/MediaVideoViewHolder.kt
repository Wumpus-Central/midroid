package com.discord.chat.presentation.message.viewholder

import android.view.View.OnClickListener
import android.view.View.OnLongClickListener
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.presentation.message.view.MediaVideoView
import com.discord.chat.presentation.message.view.UploadItemProps
import com.discord.media_player.MediaPlayer.PlayerSettings
import com.discord.media_player.reactevents.MediaPlayFinishedAnalytics
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.react_asset_fetcher.ReactAsset

public open class MediaVideoViewHolder(view: MediaVideoView) : MessagePartViewHolder {
   private final val view: MediaVideoView

   init {
      kotlin.jvm.internal.r.h(var1, "view");
      super(var1, null);
      this.view = var1;
   }

   public fun bind(
      channelId: ChannelId?,
      messageId: MessageId?,
      attachmentIndex: Int?,
      url: String,
      previewUrl: String,
      height: Int,
      width: Int,
      placeholder: String?,
      placeholderVersion: Int?,
      isSpoiler: Boolean,
      spoilerConfig: SpoilerConfig?,
      isObscure: Boolean,
      isObscureAwaitingScan: Boolean,
      obscureHideControls: Boolean,
      obscureIsOpaque: Boolean,
      showDescription: Boolean,
      description: String?,
      descriptionHint: String?,
      useNewAltTextButton: Boolean,
      onAltTextButtonClicked: ((String) -> Unit)?,
      radiusPx: Int,
      isPartOfMosaic: Boolean,
      uploadItemProps: UploadItemProps?,
      canPlayInline: Boolean,
      hideMediaPlayButton: Boolean,
      overlayTagText: String?,
      overlayTagIcon: ReactAsset?,
      overlayTagBackgroundColor: Int?,
      overlayTagTextColor: Int?,
      accessibilityRole: String?,
      portal: Double,
      onClicked: OnClickListener,
      onLongClicked: OnLongClickListener?,
      onMediaPlayFinishedAnalytics: (MediaPlayFinishedAnalytics) -> Unit,
      playerSettings: PlayerSettings
   ) {
      kotlin.jvm.internal.r.h(var4, "url");
      kotlin.jvm.internal.r.h(var5, "previewUrl");
      kotlin.jvm.internal.r.h(var33, "onClicked");
      kotlin.jvm.internal.r.h(var35, "onMediaPlayFinishedAnalytics");
      kotlin.jvm.internal.r.h(var36, "playerSettings");
      this.view
         .setContent-w--JTRs(
            var1,
            var2,
            var3,
            var4,
            var5,
            var7,
            var6,
            var8,
            var9,
            var21,
            var22,
            var10,
            var11,
            var12,
            var13,
            var14,
            var15,
            var23,
            var24,
            var25,
            var26,
            var27,
            var28,
            var29,
            var31,
            var36
         );
      this.view.setDescription(var17, var18);
      if (var19 && var16) {
         var10 = true;
      } else {
         var10 = false;
      }

      this.view.showAltTextButton(var10, var17, var20);
      var10 = false;
      if (!var19) {
         var10 = false;
         if (var16) {
            var10 = true;
         }
      }

      this.view.showDescription(var10, var17);
      this.view.setRole(var30);
      this.view.setOnMediaClickListeners(var33, var34);
      this.view.setMediaAnalyticsListener(var35);
   }
}
