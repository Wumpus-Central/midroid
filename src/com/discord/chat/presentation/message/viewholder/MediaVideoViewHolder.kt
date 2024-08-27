package com.discord.chat.presentation.message.viewholder

import android.view.View.OnClickListener
import android.view.View.OnLongClickListener
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.presentation.message.view.MediaVideoView
import com.discord.chat.presentation.message.view.UploadItemProps
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
      kotlin.jvm.internal.r.h(var1, "url");
      kotlin.jvm.internal.r.h(var2, "previewUrl");
      kotlin.jvm.internal.r.h(var28, "onClicked");
      kotlin.jvm.internal.r.h(var30, "onMediaPlayFinishedAnalytics");
      kotlin.jvm.internal.r.h(var31, "playerSettings");
      this.view
         .setContent(var1, var2, var4, var3, var5, var6, var16, var17, var7, var8, var9, var10, var18, var19, var20, var21, var22, var23, var24, var26, var31);
      this.view.setDescription(var12, var13);
      if (var14 && var11) {
         var7 = true;
      } else {
         var7 = false;
      }

      this.view.showAltTextButton(var7, var12, var15);
      if (!var14 && var11) {
         var7 = true;
      } else {
         var7 = false;
      }

      this.view.showDescription(var7, var12);
      this.view.setRole(var25);
      this.view.setOnMediaClickListeners(var28, var29);
      this.view.setMediaAnalyticsListener(var30);
   }
}
