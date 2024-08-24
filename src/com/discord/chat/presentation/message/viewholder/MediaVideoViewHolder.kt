package com.discord.chat.presentation.message.viewholder

import android.view.View.OnClickListener
import android.view.View.OnLongClickListener
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.presentation.message.view.MediaVideoView
import com.discord.chat.presentation.message.view.UploadItemProps
import com.discord.media_player.MediaSource
import com.discord.media_player.MediaPlayer.PlayerSettings
import com.discord.media_player.reactevents.MediaPlayFinishedAnalytics
import com.discord.react_asset_fetcher.ReactAsset

public open class MediaVideoViewHolder(view: MediaVideoView) : MessagePartViewHolder {
   private final val view: MediaVideoView

   init {
      kotlin.jvm.internal.r.h(var1, "view");
      super(var1, null);
      this.view = var1;
   }

   public fun bind(
      mediaSource: MediaSource,
      height: Int,
      width: Int,
      isSpoiler: Boolean,
      spoilerConfig: SpoilerConfig?,
      isObscure: Boolean,
      isObscureAwaitingScan: Boolean,
      showDescription: Boolean,
      description: String?,
      descriptionHint: String?,
      useNewAltTextButton: Boolean,
      onAltTextButtonClicked: ((String) -> Unit)?,
      maxWidthPx: Int,
      maxHeightPx: Int,
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
      onClicked: OnClickListener,
      onLongClicked: OnLongClickListener?,
      onMediaPlayFinishedAnalytics: (MediaPlayFinishedAnalytics) -> Unit,
      playerSettings: PlayerSettings
   ) {
      kotlin.jvm.internal.r.h(var1, "mediaSource");
      kotlin.jvm.internal.r.h(var25, "onClicked");
      kotlin.jvm.internal.r.h(var27, "onMediaPlayFinishedAnalytics");
      kotlin.jvm.internal.r.h(var28, "playerSettings");
      this.view.setContent(var1, var3, var2, var13, var14, var15, var16, var4, var5, var6, var7, var17, var18, var19, var20, var21, var22, var23, var28);
      this.view.setDescription(var9, var10);
      if (var11 && var8) {
         var4 = true;
      } else {
         var4 = false;
      }

      this.view.showAltTextButton(var4, var9, var12);
      if (!var11 && var8) {
         var4 = true;
      } else {
         var4 = false;
      }

      this.view.showDescription(var4, var9);
      this.view.setRole(var24);
      this.view.setOnMediaClickListeners(var25, var26);
      this.view.setMediaAnalyticsListener(var27);
   }
}
