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

public class MosaicItemMessageAttachmentVideoViewHolder(view: MediaVideoView) : MediaVideoViewHolder(var1) {
   @JvmStatic
   fun `bindGalleryItem$lambda$0`(var0: MediaPlayFinishedAnalytics): Unit {
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
      val var30: Attachment = var2.getAttachment();
      val var28: UploadItemProps = var2.getUploadItemProps(new Function2<java.lang.String, java.lang.String, Unit>(var1) {
         {
            super(2, var1, ChatEventHandler::class.java, "onTapCancelUploadItem", "onTapCancelUploadItem(Ljava/lang/String;Ljava/lang/String;)V", 0);
         }

         public final void invoke(java.lang.String var1, java.lang.String var2) {
            (super.receiver as ChatEventHandler).onTapCancelUploadItem(var1, var2);
         }
      });
      val var14: Long = var2.getChannelId-o4g7jtM();
      val var29: java.lang.String = var2.getMessageId-3Eiw7ao();
      val var12: Int = var2.getAttachmentIndex();
      val var24: java.lang.String = var30.getVideoUrl();
      val var27: java.lang.String = var30.getUrl();
      val var13: Int = var30.getWidth();
      val var10: Int = var30.getHeight();
      val var25: java.lang.String = var30.getPlaceholder();
      val var26: Int = var30.getPlaceholderVersion();
      val var11: Int = var2.getRadiusPx();
      val var20: Boolean = var30.isSpoiler();
      val var31: SpoilerAttributes = var2.getSpoilerAttributes();
      val var40: SpoilerConfig;
      if (var31 != null) {
         var40 = var31.configure(var6, var7);
      } else {
         var40 = null;
      }

      val var41: java.lang.Boolean = var30.getObscure();
      var var19: Boolean = false;
      val var16: Boolean;
      if (var41 != null) {
         var16 = var41;
      } else {
         var16 = false;
      }

      val var42: java.lang.Boolean = var30.getObscureAwaitingScan();
      val var17: Boolean;
      if (var42 != null) {
         var17 = var42;
      } else {
         var17 = false;
      }

      val var43: java.lang.Boolean = var30.getObscureHideControls();
      val var18: Boolean;
      if (var43 != null) {
         var18 = var43;
      } else {
         var18 = false;
      }

      val var44: java.lang.Boolean = var30.getObscureIsOpaque();
      if (var44 != null) {
         var19 = var44;
      }

      super.bind-l_cVQvE(
         ChannelId.box-impl(var14),
         var29,
         var12,
         var24,
         var27,
         var10,
         var13,
         var25,
         var26,
         var20,
         var40,
         var16,
         var17,
         var18,
         var19,
         var30.getShowDescription(),
         var30.getDescription(),
         var30.getHint(),
         var2.getUseNewAltTextButton(),
         new Function1<java.lang.String, Unit>(var1) {
            {
               super(1, var1, ChatEventHandler::class.java, "onTapShowAltText", "onTapShowAltText(Ljava/lang/String;)V", 0);
            }

            public final void invoke(java.lang.String var1) {
               (super.receiver as ChatEventHandler).onTapShowAltText(var1);
            }
         },
         var11,
         var3 xor true,
         var28,
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
      val var24: UnfurledMediaItem = var3.getMedia();
      val var23: SpoilerAttributes.Companion = SpoilerAttributes.Companion;
      val var22: StringBuilder = new StringBuilder();
      var22.append("MediaGalleryDisplayComponent(");
      var22.append(var2);
      var22.append(").item[image]");
      val var26: SpoilerAttributes = var23.forGenericMedia(var3, var1, var22.toString(), var3.getMedia().getProxyUrl(), var3.getVerifyAge());
      var2 = var24.getProxyUrl();
      val var33: java.lang.String = var3.getVideoPreviewUrl();
      val var34: Int = var24.getWidth();
      var var13: Int = 0;
      val var12: Int;
      if (var34 != null) {
         var12 = var34;
      } else {
         var12 = 0;
      }

      val var35: Int = var24.getHeight();
      if (var35 != null) {
         var13 = var35;
      }

      val var36: java.lang.String = var24.getPlaceholder();
      val var37: Int = var24.getPlaceholderVersion();
      val var14: Int = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_grid_inner_radius);
      val var17: Boolean = var3.isSpoiler();
      val var27: SpoilerConfig;
      if (var26 != null) {
         var27 = var26.configure(var7, var8);
      } else {
         var27 = null;
      }

      val var16: Boolean = var3.isObscure();
      val var18: Boolean = var3.isObscureAwaitingScan();
      val var21: Boolean = var3.getObscureHideControls();
      val var19: Boolean = var3.getObscureIsOpaque();
      val var15: Boolean = var3.getShowDescription();
      val var25: java.lang.String = var3.getDescription();
      val var31: java.lang.String = var3.getDescriptionHint();
      val var20: Boolean = var3.getShowDescription();
      val var32: java.lang.String = var3.getAccessibilityRole();
      val var29: java.lang.Double = var3.getPortalId();
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
         var17,
         var27,
         var16,
         var18,
         var21,
         var19,
         var15,
         var25,
         var31,
         var20,
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
         var32,
         var29,
         var5,
         var6,
         new a(),
         MediaPlayer.Factory.getDefaultSettings()
      );
   }
}
