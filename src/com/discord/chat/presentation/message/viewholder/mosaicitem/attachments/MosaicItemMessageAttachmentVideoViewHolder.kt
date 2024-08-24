package com.discord.chat.presentation.message.viewholder.mosaicitem.attachments

import android.view.View.OnClickListener
import android.view.View.OnLongClickListener
import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.bridge.spoiler.SpoilerAttributes
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory
import com.discord.chat.presentation.message.view.MediaVideoView
import com.discord.chat.presentation.message.view.UploadItemProps
import com.discord.chat.presentation.message.view.mosaic.MediaMosaicVideoViewHolder
import com.discord.chat.presentation.message.view.mosaic.MosaicMediaItem
import com.discord.chat.presentation.message.viewholder.MediaVideoViewHolder
import com.discord.media_player.MediaSource
import com.discord.media_player.MediaType
import com.discord.media_player.reactevents.MediaPlayFinishedAnalytics
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.r

public class MosaicItemMessageAttachmentVideoViewHolder(view: MediaVideoView, eventHandler: ChatEventHandler)
   : MediaVideoViewHolder,
   MediaMosaicVideoViewHolder<VideoAttachmentMessageAccessory> {
   private final val eventHandler: ChatEventHandler

   init {
      r.h(var1, "view");
      r.h(var2, "eventHandler");
      super(var1);
      this.eventHandler = var2;
   }

   public override fun bind(
      containerId: String,
      mosaicId: String,
      item: MosaicMediaItem<VideoAttachmentMessageAccessory>,
      maxWidthPx: Int,
      maxHeightPx: Int,
      isSingleItemMosaic: Boolean,
      onClicked: OnClickListener,
      onLongClicked: OnLongClickListener?,
      onTapSpoiler: () -> Unit
   ) {
      r.h(var1, "containerId");
      r.h(var2, "mosaicId");
      r.h(var3, "item");
      r.h(var7, "onClicked");
      r.h(var9, "onTapSpoiler");
      val var16: VideoAttachmentMessageAccessory = var3.getOriginalItem() as VideoAttachmentMessageAccessory;
      val var25: Attachment = var16.getAttachment();
      val var26: UploadItemProps = var16.getUploadItemProps(new Function2<java.lang.String, java.lang.String, Unit>(this.eventHandler) {
         {
            super(2, var1, ChatEventHandler::class.java, "onTapCancelUploadItem", "onTapCancelUploadItem(Ljava/lang/String;Ljava/lang/String;)V", 0);
         }

         public final void invoke(java.lang.String var1, java.lang.String var2) {
            r.h(var1, "p0");
            r.h(var2, "p1");
            (super.receiver as ChatEventHandler).onTapCancelUploadItem(var1, var2);
         }
      });
      val var19: java.lang.String = var25.getVideoUrl();
      r.e(var19);
      val var20: java.lang.String = var25.getUrl();
      val var18: java.lang.String = var25.getPlaceholder();
      val var22: Int = var25.getPlaceholderVersion();
      val var21: java.lang.String = var25.getVideoUrl();
      val var17: StringBuilder = new StringBuilder();
      var17.append("video attachment: ");
      var17.append(var21);
      val var29: MediaSource = new MediaSource(var19, var20, var18, var22, var17.toString(), MediaType.VIDEO, false, null, null, var16.getPortal(), 448, null);
      val var12: Int = var25.getWidth();
      val var11: Int = var25.getHeight();
      val var10: Int = var16.getRadiusPx();
      val var15: Boolean = var25.isSpoiler();
      val var23: SpoilerAttributes = var16.getSpoilerAttributes();
      val var24: SpoilerConfig;
      if (var23 != null) {
         var24 = var23.configure(var9);
      } else {
         var24 = null;
      }

      val var27: java.lang.Boolean = var25.getObscure();
      val var13: Boolean;
      if (var27 != null) {
         var13 = var27;
      } else {
         var13 = false;
      }

      val var28: java.lang.Boolean = var25.getObscureAwaitingScan();
      val var14: Boolean;
      if (var28 != null) {
         var14 = var28;
      } else {
         var14 = false;
      }

      super.bind(
         var29,
         var11,
         var12,
         var15,
         var24,
         var13,
         var14,
         var25.getShowDescription(),
         var25.getDescription(),
         var25.getHint(),
         var16.getUseNewAltTextButton(),
         new Function1<java.lang.String, Unit>(this.eventHandler) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapShowAltText", "onTapShowAltText(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapShowAltText(var1);
            }
         },
         var4,
         var5,
         var10,
         var6 xor true,
         var26,
         var6,
         var16.getHideMediaPlayButton(),
         var25.getAttachmentTagText(),
         var25.getAttachmentTagIcon(),
         var25.getAttachmentTagBackgroundColor(),
         var25.getAttachmentTagTextColor(),
         var25.getRole(),
         var7,
         var8,
         new Function1<MediaPlayFinishedAnalytics, Unit>(this.eventHandler) {
            {
               super(
                  1,
                  var1,
                  ChatEventHandler::class.java,
                  "onMediaPlayFinishedAnalytics",
                  "onMediaPlayFinishedAnalytics(Lcom/discord/media_player/reactevents/MediaPlayFinishedAnalytics;)V",
                  0
               );
            }

            public final void invoke(MediaPlayFinishedAnalytics var1) {
               r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onMediaPlayFinishedAnalytics(var1);
            }
         },
         var25.getPlayerSettings()
      );
   }
}
