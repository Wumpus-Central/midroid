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
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.r

public class MosaicItemMessageAttachmentVideoViewHolder(view: MediaVideoView) : MediaVideoViewHolder {
   init {
      r.h(var1, "view");
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
      r.h(var1, "eventHandler");
      r.h(var2, "item");
      r.h(var4, "onClicked");
      r.h(var6, "onTapSpoiler");
      val var13: Attachment = var2.getAttachment();
      val var15: UploadItemProps = var2.getUploadItemProps(new Function2<java.lang.String, java.lang.String, Unit>(var1) {
         {
            super(2, var1, ChatEventHandler::class.java, "onTapCancelUploadItem", "onTapCancelUploadItem(Ljava/lang/String;Ljava/lang/String;)V", 0);
         }

         public final void invoke(java.lang.String var1, java.lang.String var2) {
            r.h(var1, "p0");
            r.h(var2, "p1");
            (super.receiver as ChatEventHandler).onTapCancelUploadItem(var1, var2);
         }
      });
      val var17: java.lang.String = var13.getVideoUrl();
      r.e(var17);
      val var14: java.lang.String = var13.getUrl();
      val var8: Int = var13.getWidth();
      val var9: Int = var13.getHeight();
      val var16: java.lang.String = var13.getPlaceholder();
      val var18: Int = var13.getPlaceholderVersion();
      val var7: Int = var2.getRadiusPx();
      val var12: Boolean = var13.isSpoiler();
      val var19: SpoilerAttributes = var2.getSpoilerAttributes();
      val var20: SpoilerConfig;
      if (var19 != null) {
         var20 = var19.configure(var6);
      } else {
         var20 = null;
      }

      val var21: java.lang.Boolean = var13.getObscure();
      val var10: Boolean;
      if (var21 != null) {
         var10 = var21;
      } else {
         var10 = false;
      }

      val var22: java.lang.Boolean = var13.getObscureAwaitingScan();
      val var11: Boolean;
      if (var22 != null) {
         var11 = var22;
      } else {
         var11 = false;
      }

      super.bind(
         var17,
         var14,
         var9,
         var8,
         var16,
         var18,
         var12,
         var20,
         var10,
         var11,
         var13.getShowDescription(),
         var13.getDescription(),
         var13.getHint(),
         var2.getUseNewAltTextButton(),
         new Function1<java.lang.String, Unit>(var1) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapShowAltText", "onTapShowAltText(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               r.h(var1, "p0");
               (super.receiver as ChatEventHandler).onTapShowAltText(var1);
            }
         },
         var7,
         var3 xor true,
         var15,
         var3,
         var2.getHideMediaPlayButton(),
         var13.getAttachmentTagText(),
         var13.getAttachmentTagIcon(),
         var13.getAttachmentTagBackgroundColor(),
         var13.getAttachmentTagTextColor(),
         var13.getRole(),
         var2.getPortal(),
         var4,
         var5,
         new Function1<MediaPlayFinishedAnalytics, Unit>(var1) {
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
         var13.getPlayerSettings()
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
      r.h(var1, "containerId");
      r.h(var2, "componentId");
      r.h(var3, "mediaGalleryItem");
      r.h(var5, "onClicked");
      r.h(var7, "onTapSpoiler");
      r.h(var8, "onAltTextButtonClicked");
      val var21: UnfurledMediaItem = var3.getMedia();
      val var19: SpoilerAttributes.Companion = SpoilerAttributes.Companion;
      val var20: StringBuilder = new StringBuilder();
      var20.append("MediaGalleryDisplayComponent(");
      var20.append(var2);
      var20.append(").item[image]");
      val var24: SpoilerAttributes = var19.forGenericMedia(var3, var1, var20.toString(), var3.getMedia().getProxyUrl());
      val var31: java.lang.String = var21.getProxyUrl();
      var2 = var3.getVideoPreviewUrl();
      r.e(var2);
      val var12: Int = var21.getWidth();
      val var11: Int = var21.getHeight();
      val var30: java.lang.String = var21.getPlaceholder();
      val var32: Int = var21.getPlaceholderVersion();
      val var13: Int = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_grid_inner_radius);
      val var15: Boolean = var3.isSpoiler();
      val var25: SpoilerConfig;
      if (var24 != null) {
         var25 = var24.configure(var7);
      } else {
         var25 = null;
      }

      val var14: Boolean = var3.isObscure();
      val var18: Boolean = var3.isObscureAwaitingScan();
      val var17: Boolean = var3.getShowDescription();
      val var22: java.lang.String = var3.getDescription();
      val var29: java.lang.String = var3.getDescriptionHint();
      val var16: Boolean = var3.getShowDescription();
      val var23: java.lang.String = var3.getAccessibilityRole();
      val var27: java.lang.Double = var3.getPortalId();
      r.e(var27);
      super.bind(
         var31,
         var2,
         var11,
         var12,
         var30,
         var32,
         var15,
         var25,
         var14,
         var18,
         var17,
         var22,
         var29,
         var16,
         var8,
         var13,
         var4 xor true,
         null,
         var4,
         false,
         null,
         null,
         null,
         null,
         var23,
         var27,
         var5,
         var6,
         <unrepresentable>.INSTANCE,
         MediaPlayer.Factory.getDefaultSettings()
      );
   }
}
