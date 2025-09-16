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

public class MosaicItemMessageAttachmentImageViewHolder(view: MediaImageView) : MediaImageViewHolder(var1) {
   public fun bindAttachment(
      eventHandler: ChatEventHandler,
      imageAttachmentMessageAccessory: ImageAttachmentMessageAccessory,
      isSingleItemMosaic: Boolean,
      onClicked: OnClickListener,
      onLongClicked: OnLongClickListener?,
      onTapSpoiler: () -> Unit,
      onTapObscureToggle: (Boolean) -> Unit,
      shouldAutoPlayGif: Boolean
   ) {
      val var25: Attachment = var2.getAttachment();
      val var21: UploadItemProps = var2.getUploadItemProps(new Function2<java.lang.String, java.lang.String, Unit>(var1) {
         {
            super(2, var1, ChatEventHandler::class.java, "onTapCancelUploadItem", "onTapCancelUploadItem(Ljava/lang/String;Ljava/lang/String;)V", 0);
         }

         public final void invoke(java.lang.String var1, java.lang.String var2) {
            (super.receiver as ChatEventHandler).onTapCancelUploadItem(var1, var2);
         }
      });
      val var23: java.lang.String = var25.getUrl();
      val var11: Int = var25.getWidth();
      val var9: Int = var25.getHeight();
      val var24: java.lang.String = var25.getPlaceholder();
      val var22: Int = var25.getPlaceholderVersion();
      val var10: Int = var2.getRadiusPx();
      val var20: MediaContainingViewResizer.ResizeMode;
      if (var3) {
         var20 = MediaContainingViewResizer.ResizeMode.Fill;
      } else {
         var20 = MediaContainingViewResizer.ResizeMode.Cover;
      }

      val var17: Boolean = var25.isSpoiler();
      val var26: SpoilerAttributes = var2.getSpoilerAttributes();
      val var30: SpoilerConfig;
      if (var26 != null) {
         var30 = var26.configure(var6, var7);
      } else {
         var30 = null;
      }

      val var31: java.lang.Boolean = var25.getObscure();
      val var12: Boolean;
      if (var31 != null) {
         var12 = var31;
      } else {
         var12 = false;
      }

      val var32: java.lang.Boolean = var25.getObscureAwaitingScan();
      val var13: Boolean;
      if (var32 != null) {
         var13 = var32;
      } else {
         var13 = false;
      }

      val var33: java.lang.Boolean = var25.getObscureHideControls();
      val var14: Boolean;
      if (var33 != null) {
         var14 = var33;
      } else {
         var14 = false;
      }

      val var34: java.lang.Boolean = var25.getObscureIsOpaque();
      val var15: Boolean;
      if (var34 != null) {
         var15 = var34;
      } else {
         var15 = false;
      }

      val var18: Boolean = var25.getShowDescription();
      val var35: java.lang.String = var25.getDescription();
      val var37: java.lang.String = var25.getHint();
      val var19: Boolean = var2.getUseNewAltTextButton();
      val var28: Function1 = new Function1<java.lang.String, Unit>(var1) {
         {
            super(1, var1, ChatEventHandler::class.java, "onTapShowAltText", "onTapShowAltText(Ljava/lang/String;)V", 0);
         }

         public final void invoke(java.lang.String var1) {
            (super.receiver as ChatEventHandler).onTapShowAltText(var1);
         }
      };
      val var29: java.lang.String = var25.getRole();
      val var27: java.lang.String = var25.getFilename();
      val var36: java.lang.Boolean = var25.getSrcIsAnimated();
      val var16: Boolean;
      if (var36 != null) {
         var16 = var36;
      } else {
         var16 = false;
      }

      super.bind(
         var23,
         var11,
         var9,
         var24,
         var22,
         var17,
         var30,
         var12,
         var13,
         var14,
         var15,
         var18,
         var35,
         var37,
         var19,
         var28,
         var10,
         var20,
         var3 xor true,
         var4,
         var5,
         var21,
         var29,
         var8,
         var27,
         var16
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
      onAltTextButtonClicked: (String) -> Unit,
      shouldAutoPlayGif: Boolean
   ) {
      val var17: UnfurledMediaItem = var3.getMedia();
      val var16: SpoilerAttributes.Companion = SpoilerAttributes.Companion;
      val var15: StringBuilder = new StringBuilder();
      var15.append("MediaGalleryDisplayComponent(");
      var15.append(var2);
      var15.append(").item[image]");
      val var21: SpoilerAttributes = var16.forGenericMedia(var3, var1, var15.toString(), var3.getMedia().getProxyUrl(), var3.getVerifyAge());
      val var23: java.lang.String = var17.getProxyUrl();
      val var18: Int = var17.getWidth();
      var var12: Int = 0;
      val var11: Int;
      if (var18 != null) {
         var11 = var18;
      } else {
         var11 = 0;
      }

      val var19: Int = var17.getHeight();
      if (var19 != null) {
         var12 = var19;
      }

      val var24: java.lang.String = var17.getPlaceholder();
      val var25: Int = var17.getPlaceholderVersion();
      val var13: Int = this.itemView.getContext().getResources().getDimensionPixelSize(R.dimen.message_media_grid_inner_radius);
      val var20: MediaContainingViewResizer.ResizeMode;
      if (var4) {
         var20 = MediaContainingViewResizer.ResizeMode.Fill;
      } else {
         var20 = MediaContainingViewResizer.ResizeMode.Cover;
      }

      val var14: Boolean = var3.isSpoiler();
      val var22: SpoilerConfig;
      if (var21 != null) {
         var22 = var21.configure(var7, var8);
      } else {
         var22 = null;
      }

      super.bind(
         var23,
         var11,
         var12,
         var24,
         var25,
         var14,
         var22,
         var3.isObscure(),
         var3.isObscureAwaitingScan(),
         var3.getObscureHideControls(),
         var3.getObscureIsOpaque(),
         var3.getShowDescription(),
         var3.getDescription(),
         var3.getDescriptionHint(),
         var3.getShowDescription(),
         var9,
         var13,
         var20,
         var4 xor true,
         var5,
         var6,
         null,
         var3.getAccessibilityRole(),
         var10,
         null,
         var3.getMedia().getSrcIsAnimated()
      );
   }
}
