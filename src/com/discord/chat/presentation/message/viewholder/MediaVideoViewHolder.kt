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
      kotlin.jvm.internal.r.h(var31, "onClicked");
      kotlin.jvm.internal.r.h(var33, "onMediaPlayFinishedAnalytics");
      kotlin.jvm.internal.r.h(var34, "playerSettings");
      this.view
         .setContent-eqgJMyY(
            var1,
            var2,
            var3,
            var4,
            var5,
            var7,
            var6,
            var8,
            var9,
            var19,
            var20,
            var10,
            var11,
            var12,
            var13,
            var21,
            var22,
            var23,
            var24,
            var25,
            var26,
            var27,
            var29,
            var34
         );
      this.view.setDescription(var15, var16);
      if (var17 && var14) {
         var10 = true;
      } else {
         var10 = false;
      }

      this.view.showAltTextButton(var10, var15, var18);
      if (!var17 && var14) {
         var10 = true;
      } else {
         var10 = false;
      }

      this.view.showDescription(var10, var15);
      this.view.setRole(var28);
      this.view.setOnMediaClickListeners(var31, var32);
      this.view.setMediaAnalyticsListener(var33);
   }
}
