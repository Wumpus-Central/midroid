package com.discord.chat.presentation.message.viewholder.mosaicitem.attachments

import android.view.View.OnClickListener
import android.view.View.OnLongClickListener
import com.discord.chat.R
import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.bridge.botuikit.MediaGalleryItem
import com.discord.chat.bridge.media.UnfurledMediaItem
import com.discord.chat.bridge.spoiler.SpoilerAttributes
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.VideoAttachmentMessageAccessory
import com.discord.chat.presentation.message.view.MediaVideoView
import com.discord.chat.presentation.message.view.UploadItemProps
import com.discord.chat.presentation.message.viewholder.MediaVideoViewHolder
import com.discord.media_player.MediaPlayer
import com.discord.media_player.reactevents.MediaPlayFinishedAnalytics
import com.discord.primitives.ChannelId
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q

public class MosaicItemMessageAttachmentVideoViewHolder(view: MediaVideoView) : MediaVideoViewHolder {
   init {
      q.h(var1, "view");
      super(var1);
   }

   public fun bindAttachment(
      eventHandler: ChatEventHandler,
      item: VideoAttachmentMessageAccessory,
      isSingleItemMosaic: Boolean,
      onClicked: OnClickListener,
      onLongClicked: OnLongClickListener?,
      onTapSpoiler: () -> Unit
   ) {
      q.h(var1, "eventHandler");
      q.h(var2, "item");
      q.h(var4, "onClicked");
      q.h(var6, "onTapSpoiler");
      val var27: Attachment = var2.getAttachment();
      val var24: UploadItemProps = var2.getUploadItemProps(new Function2(var1) {
         {
            super(2, var1, ChatEventHandler::class.java, "onTapCancelUploadItem", "onTapCancelUploadItem(Ljava/lang/String;Ljava/lang/String;)V", 0);
         }

         public final void invoke(java.lang.String var1, java.lang.String var2) {
            q.h(var1, "p0");
            q.h(var2, "p1");
            (super.receiver as ChatEventHandler).onTapCancelUploadItem(var1, var2);
         }
      });
      val var19: Long = var2.getChannelId-o4g7jtM();
      val var21: java.lang.String = var2.getMessageId-3Eiw7ao();
      val var11: Int = var2.getAttachmentIndex();
      val var26: java.lang.String = var27.getVideoUrl();
      q.e(var26);
      val var22: java.lang.String = var27.getUrl();
      val var10: Int = var27.getWidth();
      val var9: Int = var27.getHeight();
      val var25: java.lang.String = var27.getPlaceholder();
      val var23: Int = var27.getPlaceholderVersion();
      val var12: Int = var2.getRadiusPx();
      val var15: Boolean = var27.isSpoiler();
      val var28: SpoilerAttributes = var2.getSpoilerAttributes();
      val var38: SpoilerConfig;
      if (var28 != null) {
         var38 = var28.configure(var6);
      } else {
         var38 = null;
      }

      val var39: java.lang.Boolean = var27.getObscure();
      var var14: Boolean = false;
      val var13: Boolean;
      if (var39 != null) {
         var13 = var39;
      } else {
         var13 = false;
      }

      val var40: java.lang.Boolean = var27.getObscureAwaitingScan();
      if (var40 != null) {
         var14 = var40;
      }

      super.bind-kIVcwaw(
         ChannelId.box-impl(var19),
         var21,
         var11,
         var26,
         var22,
         var9,
         var10,
         var25,
         var23,
         var15,
         var38,
         var13,
         var14,
         var27.getShowDescription(),
         var27.getDescription(),
         var27.getHint(),
         var2.getUseNewAltTextButton(),
         new Function1(var1) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapShowAltText", "onTapShowAltText(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapShowAltText(var1);
            }
         },
         var12,
         var3 xor true,
         var24,
         var3,
         var2.getHideMediaPlayButton(),
         var27.getAttachmentTagText(),
         var27.getAttachmentTagIcon(),
         var27.getAttachmentTagBackgroundColor(),
         var27.getAttachmentTagTextColor(),
         var27.getRole(),
         var2.getPortal(),
         var4,
         var5,
         new Function1(var1) {
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
               q.h(var1, "p0");
               (super.receiver as ChatEventHandler).onMediaPlayFinishedAnalytics(var1);
            }
         },
         var27.getPlayerSettings()
      );
   }

   public fun bindGalleryItem(
      containerId: String,
      componentId: String,
      mediaGalleryItem: MediaGalleryItem,
      isSingleItemMosaic: Boolean,
      onClicked: OnClickListener,
      onLongClicked: OnLongClickListener?,
      onTapSpoiler: () -> Unit,
      onAltTextButtonClicked: (String) -> Unit
   ) {
      q.h(var1, "containerId");
      q.h(var2, "componentId");
      q.h(var3, "mediaGalleryItem");
      q.h(var5, "onClicked");
      q.h(var7, "onTapSpoiler");
      q.h(var8, "onAltTextButtonClicked");
      val var21: UnfurledMediaItem = var3.getMedia();
      val var20: SpoilerAttributes.Companion = SpoilerAttributes.Companion;
      val var19: StringBuilder = new StringBuilder();
      var19.append("MediaGalleryDisplayComponent(");
      var19.append(var2);
      var19.append(").item[image]");
      val var24: SpoilerAttributes = var20.forGenericMedia(var3, var1, var19.toString(), var3.getMedia().getProxyUrl());
      var2 = var21.getProxyUrl();
      val var31: java.lang.String = var3.getVideoPreviewUrl();
      q.e(var31);
      val var13: Int = var21.getWidth();
      val var11: Int = var21.getHeight();
      val var30: java.lang.String = var21.getPlaceholder();
      val var32: Int = var21.getPlaceholderVersion();
      val var12: Int = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_grid_inner_radius);
      val var14: Boolean = var3.isSpoiler();
      val var25: SpoilerConfig;
      if (var24 != null) {
         var25 = var24.configure(var7);
      } else {
         var25 = null;
      }

      val var16: Boolean = var3.isObscure();
      val var17: Boolean = var3.isObscureAwaitingScan();
      val var18: Boolean = var3.getShowDescription();
      val var29: java.lang.String = var3.getDescription();
      val var23: java.lang.String = var3.getDescriptionHint();
      val var15: Boolean = var3.getShowDescription();
      val var22: java.lang.String = var3.getAccessibilityRole();
      val var27: java.lang.Double = var3.getPortalId();
      q.e(var27);
      super.bind-kIVcwaw(
         null,
         null,
         null,
         var2,
         var31,
         var11,
         var13,
         var30,
         var32,
         var14,
         var25,
         var16,
         var17,
         var18,
         var29,
         var23,
         var15,
         var8,
         var12,
         var4 xor true,
         null,
         var4,
         false,
         null,
         null,
         null,
         null,
         var22,
         var27,
         var5,
         var6,
         <unrepresentable>.INSTANCE,
         MediaPlayer.Factory.getDefaultSettings()
      );
   }
}
