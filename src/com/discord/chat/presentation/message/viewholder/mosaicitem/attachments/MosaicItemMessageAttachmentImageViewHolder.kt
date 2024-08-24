package com.discord.chat.presentation.message.viewholder.mosaicitem.attachments

import android.view.View.OnClickListener
import android.view.View.OnLongClickListener
import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.bridge.spoiler.SpoilerAttributes
import com.discord.chat.bridge.spoiler.SpoilerConfig
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.media.MediaContainingViewResizer
import com.discord.chat.presentation.message.messagepart.ImageAttachmentMessageAccessory
import com.discord.chat.presentation.message.view.MediaImageView
import com.discord.chat.presentation.message.view.UploadItemProps
import com.discord.chat.presentation.message.view.mosaic.MediaMosaicImageViewHolder
import com.discord.chat.presentation.message.view.mosaic.MosaicMediaItem
import com.discord.chat.presentation.message.viewholder.MediaImageViewHolder
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2
import kotlin.jvm.internal.r

public class MosaicItemMessageAttachmentImageViewHolder(view: MediaImageView, eventHandler: ChatEventHandler)
   : MediaImageViewHolder,
   MediaMosaicImageViewHolder<ImageAttachmentMessageAccessory> {
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
      item: MosaicMediaItem<ImageAttachmentMessageAccessory>,
      maxWidthPx: Int,
      maxHeightPx: Int,
      isSingleItemMosaic: Boolean,
      onClicked: OnClickListener,
      onLongClicked: OnLongClickListener?,
      onTapSpoiler: () -> Unit,
      shouldAutoPlayGif: Boolean
   ) {
      r.h(var1, "containerId");
      r.h(var2, "mosaicId");
      r.h(var3, "item");
      r.h(var7, "onClicked");
      r.h(var9, "onTapSpoiler");
      val var21: ImageAttachmentMessageAccessory = var3.getOriginalItem() as ImageAttachmentMessageAccessory;
      val var17: Attachment = var21.getAttachment();
      val var20: UploadItemProps = var21.getUploadItemProps(new Function2<java.lang.String, java.lang.String, Unit>(this.eventHandler) {
         {
            super(2, var1, ChatEventHandler::class.java, "onTapCancelUploadItem", "onTapCancelUploadItem(Ljava/lang/String;Ljava/lang/String;)V", 0);
         }

         public final void invoke(java.lang.String var1, java.lang.String var2) {
            r.h(var1, "p0");
            r.h(var2, "p1");
            (super.receiver as ChatEventHandler).onTapCancelUploadItem(var1, var2);
         }
      });
      val var18: java.lang.String = var17.getUrl();
      val var12: Int = var17.getWidth();
      val var13: Int = var17.getHeight();
      val var19: java.lang.String = var17.getPlaceholder();
      val var25: Int = var17.getPlaceholderVersion();
      val var11: Int = var21.getRadiusPx();
      val var22: MediaContainingViewResizer.ResizeMode;
      if (var6) {
         var22 = MediaContainingViewResizer.ResizeMode.Fill;
      } else {
         var22 = MediaContainingViewResizer.ResizeMode.Cover;
      }

      val var16: Boolean = var17.isSpoiler();
      val var23: SpoilerAttributes = var21.getSpoilerAttributes();
      val var24: SpoilerConfig;
      if (var23 != null) {
         var24 = var23.configure(var9);
      } else {
         var24 = null;
      }

      val var26: java.lang.Boolean = var17.getObscure();
      val var14: Boolean;
      if (var26 != null) {
         var14 = var26;
      } else {
         var14 = false;
      }

      val var27: java.lang.Boolean = var17.getObscureAwaitingScan();
      val var15: Boolean;
      if (var27 != null) {
         var15 = var27;
      } else {
         var15 = false;
      }

      super.bind(
         var18,
         var12,
         var13,
         var19,
         var25,
         var16,
         var24,
         var14,
         var15,
         var17.getShowDescription(),
         var17.getDescription(),
         var17.getHint(),
         var21.getUseNewAltTextButton(),
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
         var11,
         var22,
         var6 xor true,
         var7,
         var8,
         var20,
         var17.getRole(),
         var10,
         var17.getFilename()
      );
   }
}
