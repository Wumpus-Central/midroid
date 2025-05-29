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

   @JvmStatic
   fun `bindGalleryItem$lambda$0`(var0: MediaPlayFinishedAnalytics): Unit {
      q.h(var0, "it");
      return Unit.a;
   }

   public fun bindAttachment(
      eventHandler: ChatEventHandler,
      item: VideoAttachmentMessageAccessory,
      isSingleItemMosaic: Boolean,
      onClicked: OnClickListener,
      onLongClicked: OnLongClickListener?,
      onTapSpoiler: () -> Unit,
      onTapObscureToggle: (Boolean) -> Unit
   ) {
      q.h(var1, "eventHandler");
      q.h(var2, "item");
      q.h(var4, "onClicked");
      q.h(var6, "onTapSpoiler");
      q.h(var7, "onTapObscureToggle");
      val var30: Attachment = var2.getAttachment();
      val var29: UploadItemProps = var2.getUploadItemProps(new Function2(var1) {
         {
            super(2, var1, ChatEventHandler::class.java, "onTapCancelUploadItem", "onTapCancelUploadItem(Ljava/lang/String;Ljava/lang/String;)V", 0);
         }

         public final void invoke(java.lang.String var1, java.lang.String var2) {
            q.h(var1, "p0");
            q.h(var2, "p1");
            (super.receiver as ChatEventHandler).onTapCancelUploadItem(var1, var2);
         }
      });
      val var22: Long = var2.getChannelId-o4g7jtM();
      val var27: java.lang.String = var2.getMessageId-3Eiw7ao();
      val var12: Int = var2.getAttachmentIndex();
      val var25: java.lang.String = var30.getVideoUrl();
      q.e(var25);
      val var26: java.lang.String = var30.getUrl();
      val var11: Int = var30.getWidth();
      val var13: Int = var30.getHeight();
      val var24: java.lang.String = var30.getPlaceholder();
      val var28: Int = var30.getPlaceholderVersion();
      val var10: Int = var2.getRadiusPx();
      val var18: Boolean = var30.isSpoiler();
      val var31: SpoilerAttributes = var2.getSpoilerAttributes();
      val var40: SpoilerConfig;
      if (var31 != null) {
         var40 = var31.configure(var6, var7);
      } else {
         var40 = null;
      }

      val var41: java.lang.Boolean = var30.getObscure();
      val var14: Boolean;
      if (var41 != null) {
         var14 = var41;
      } else {
         var14 = false;
      }

      val var42: java.lang.Boolean = var30.getObscureAwaitingScan();
      val var15: Boolean;
      if (var42 != null) {
         var15 = var42;
      } else {
         var15 = false;
      }

      val var43: java.lang.Boolean = var30.getObscureHideControls();
      val var16: Boolean;
      if (var43 != null) {
         var16 = var43;
      } else {
         var16 = false;
      }

      val var44: java.lang.Boolean = var30.getObscureIsOpaque();
      val var17: Boolean;
      if (var44 != null) {
         var17 = var44;
      } else {
         var17 = false;
      }

      super.bind-l_cVQvE(
         ChannelId.box-impl(var22),
         var27,
         var12,
         var25,
         var26,
         var13,
         var11,
         var24,
         var28,
         var18,
         var40,
         var14,
         var15,
         var16,
         var17,
         var30.getShowDescription(),
         var30.getDescription(),
         var30.getHint(),
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
         var10,
         var3 xor true,
         var29,
         var3,
         var2.getHideMediaPlayButton(),
         var30.getAttachmentTagText(),
         var30.getAttachmentTagIcon(),
         var30.getAttachmentTagBackgroundColor(),
         var30.getAttachmentTagTextColor(),
         var30.getRole(),
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
         var30.getPlayerSettings()
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
      onTapObscureToggle: (Boolean) -> Unit,
      onAltTextButtonClicked: (String) -> Unit
   ) {
      q.h(var1, "containerId");
      q.h(var2, "componentId");
      q.h(var3, "mediaGalleryItem");
      q.h(var5, "onClicked");
      q.h(var7, "onTapSpoiler");
      q.h(var8, "onTapObscureToggle");
      q.h(var9, "onAltTextButtonClicked");
      val var24: UnfurledMediaItem = var3.getMedia();
      val var23: SpoilerAttributes.Companion = SpoilerAttributes.Companion;
      val var22: StringBuilder = new StringBuilder();
      var22.append("MediaGalleryDisplayComponent(");
      var22.append(var2);
      var22.append(").item[image]");
      val var26: SpoilerAttributes = var23.forGenericMedia(var3, var1, var22.toString(), var3.getMedia().getProxyUrl(), var3.getVerifyAge());
      var2 = var24.getProxyUrl();
      val var33: java.lang.String = var3.getVideoPreviewUrl();
      q.e(var33);
      val var34: Int = var24.getWidth();
      val var12: Int;
      if (var34 != null) {
         var12 = var34;
      } else {
         var12 = 0;
      }

      val var35: Int = var24.getHeight();
      val var13: Int;
      if (var35 != null) {
         var13 = var35;
      } else {
         var13 = 0;
      }

      val var36: java.lang.String = var24.getPlaceholder();
      val var37: Int = var24.getPlaceholderVersion();
      val var14: Int = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_grid_inner_radius);
      val var15: Boolean = var3.isSpoiler();
      val var27: SpoilerConfig;
      if (var26 != null) {
         var27 = var26.configure(var7, var8);
      } else {
         var27 = null;
      }

      val var19: Boolean = var3.isObscure();
      val var18: Boolean = var3.isObscureAwaitingScan();
      val var16: Boolean = var3.getObscureHideControls();
      val var20: Boolean = var3.getObscureIsOpaque();
      val var21: Boolean = var3.getShowDescription();
      val var32: java.lang.String = var3.getDescription();
      val var25: java.lang.String = var3.getDescriptionHint();
      val var17: Boolean = var3.getShowDescription();
      val var31: java.lang.String = var3.getAccessibilityRole();
      val var29: java.lang.Double = var3.getPortalId();
      q.e(var29);
      super.bind-l_cVQvE(
         null,
         null,
         null,
         var2,
         var33,
         var13,
         var12,
         var36,
         var37,
         var15,
         var27,
         var19,
         var18,
         var16,
         var20,
         var21,
         var32,
         var25,
         var17,
         var9,
         var14,
         var4 xor true,
         null,
         var4,
         false,
         null,
         null,
         null,
         null,
         var31,
         var29,
         var5,
         var6,
         new a(),
         MediaPlayer.Factory.getDefaultSettings()
      );
   }
}
