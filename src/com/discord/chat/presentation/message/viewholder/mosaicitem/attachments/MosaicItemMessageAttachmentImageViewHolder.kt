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
import com.discord.chat.presentation.media.MediaContainingViewResizer
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory
import com.discord.chat.presentation.message.view.MediaImageView
import com.discord.chat.presentation.message.view.UploadItemProps
import com.discord.chat.presentation.message.viewholder.MediaImageViewHolder
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.q

public class MosaicItemMessageAttachmentImageViewHolder(view: MediaImageView) : MediaImageViewHolder {
   init {
      q.h(var1, "view");
      super(var1);
   }

   public fun bindAttachment(
      eventHandler: ChatEventHandler,
      imageAttachmentMessageAccessory: ImageAttachmentMessageAccessory,
      isSingleItemMosaic: Boolean,
      onClicked: OnClickListener,
      onLongClicked: OnLongClickListener?,
      onTapSpoiler: () -> Unit,
      shouldAutoPlayGif: Boolean
   ) {
      q.h(var1, "eventHandler");
      q.h(var2, "imageAttachmentMessageAccessory");
      q.h(var4, "onClicked");
      q.h(var6, "onTapSpoiler");
      val var19: Attachment = var2.getAttachment();
      val var15: UploadItemProps = var2.getUploadItemProps(new Function2(var1) {
         {
            super(2, var1, ChatEventHandler::class.java, "onTapCancelUploadItem", "onTapCancelUploadItem(Ljava/lang/String;Ljava/lang/String;)V", 0);
         }

         public final void invoke(java.lang.String var1, java.lang.String var2) {
            q.h(var1, "p0");
            q.h(var2, "p1");
            (super.receiver as ChatEventHandler).onTapCancelUploadItem(var1, var2);
         }
      });
      val var18: java.lang.String = var19.getUrl();
      val var9: Int = var19.getWidth();
      val var10: Int = var19.getHeight();
      val var17: java.lang.String = var19.getPlaceholder();
      val var16: Int = var19.getPlaceholderVersion();
      val var8: Int = var2.getRadiusPx();
      val var14: MediaContainingViewResizer.ResizeMode;
      if (var3) {
         var14 = MediaContainingViewResizer.ResizeMode.Fill;
      } else {
         var14 = MediaContainingViewResizer.ResizeMode.Cover;
      }

      val var13: Boolean = var19.isSpoiler();
      val var20: SpoilerAttributes = var2.getSpoilerAttributes();
      val var21: SpoilerConfig;
      if (var20 != null) {
         var21 = var20.configure(var6);
      } else {
         var21 = null;
      }

      val var22: java.lang.Boolean = var19.getObscure();
      val var11: Boolean;
      if (var22 != null) {
         var11 = var22;
      } else {
         var11 = false;
      }

      val var23: java.lang.Boolean = var19.getObscureAwaitingScan();
      val var12: Boolean;
      if (var23 != null) {
         var12 = var23;
      } else {
         var12 = false;
      }

      super.bind(
         var18,
         var9,
         var10,
         var17,
         var16,
         var13,
         var21,
         var11,
         var12,
         var19.getShowDescription(),
         var19.getDescription(),
         var19.getHint(),
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
         var8,
         var14,
         var3 xor true,
         var4,
         var5,
         var15,
         var19.getRole(),
         var7,
         var19.getFilename()
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
      onAltTextButtonClicked: (String) -> Unit,
      shouldAutoPlayGif: Boolean
   ) {
      q.h(var1, "containerId");
      q.h(var2, "componentId");
      q.h(var3, "mediaGalleryItem");
      q.h(var5, "onClicked");
      q.h(var7, "onTapSpoiler");
      q.h(var8, "onAltTextButtonClicked");
      val var16: UnfurledMediaItem = var3.getMedia();
      val var15: SpoilerAttributes.Companion = SpoilerAttributes.Companion;
      val var14: StringBuilder = new StringBuilder();
      var14.append("MediaGalleryDisplayComponent(");
      var14.append(var2);
      var14.append(").item[image]");
      val var18: SpoilerAttributes = var15.forGenericMedia(var3, var1, var14.toString(), var3.getMedia().getProxyUrl());
      val var21: java.lang.String = var16.getProxyUrl();
      val var11: Int = var16.getWidth();
      val var10: Int = var16.getHeight();
      val var20: java.lang.String = var16.getPlaceholder();
      val var22: Int = var16.getPlaceholderVersion();
      val var12: Int = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_grid_inner_radius);
      val var17: MediaContainingViewResizer.ResizeMode;
      if (var4) {
         var17 = MediaContainingViewResizer.ResizeMode.Fill;
      } else {
         var17 = MediaContainingViewResizer.ResizeMode.Cover;
      }

      val var13: Boolean = var3.isSpoiler();
      val var19: SpoilerConfig;
      if (var18 != null) {
         var19 = var18.configure(var7);
      } else {
         var19 = null;
      }

      super.bind(
         var21,
         var11,
         var10,
         var20,
         var22,
         var13,
         var19,
         var3.isObscure(),
         var3.isObscureAwaitingScan(),
         var3.getShowDescription(),
         var3.getDescription(),
         var3.getDescriptionHint(),
         var3.getShowDescription(),
         var8,
         var12,
         var17,
         var4 xor true,
         var5,
         var6,
         null,
         var3.getAccessibilityRole(),
         var9,
         null
      );
   }
}
