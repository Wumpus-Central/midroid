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
      onTapObscureToggle: (Boolean) -> Unit,
      shouldAutoPlayGif: Boolean
   ) {
      q.h(var1, "eventHandler");
      q.h(var2, "imageAttachmentMessageAccessory");
      q.h(var4, "onClicked");
      q.h(var6, "onTapSpoiler");
      q.h(var7, "onTapObscureToggle");
      val var25: Attachment = var2.getAttachment();
      val var22: UploadItemProps = var2.getUploadItemProps(new Function2(var1) {
         {
            super(2, var1, ChatEventHandler::class.java, "onTapCancelUploadItem", "onTapCancelUploadItem(Ljava/lang/String;Ljava/lang/String;)V", 0);
         }

         public final void invoke(java.lang.String var1, java.lang.String var2) {
            q.h(var1, "p0");
            q.h(var2, "p1");
            (super.receiver as ChatEventHandler).onTapCancelUploadItem(var1, var2);
         }
      });
      val var24: java.lang.String = var25.getUrl();
      val var9: Int = var25.getWidth();
      val var10: Int = var25.getHeight();
      val var21: java.lang.String = var25.getPlaceholder();
      val var23: Int = var25.getPlaceholderVersion();
      val var11: Int = var2.getRadiusPx();
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

      val var19: Boolean = var25.getShowDescription();
      val var35: java.lang.String = var25.getDescription();
      val var37: java.lang.String = var25.getHint();
      val var18: Boolean = var2.getUseNewAltTextButton();
      val var27: Function1 = new Function1(var1) {
         {
            super(1, var1, ChatEventHandler::class.java, "onTapShowAltText", "onTapShowAltText(Ljava/lang/String;)V", 0);
         }

         public final void invoke(java.lang.String var1) {
            q.h(var1, "p0");
            (super.receiver as ChatEventHandler).onTapShowAltText(var1);
         }
      };
      val var28: java.lang.String = var25.getRole();
      val var29: java.lang.String = var25.getFilename();
      val var36: java.lang.Boolean = var25.getSrcIsAnimated();
      val var16: Boolean;
      if (var36 != null) {
         var16 = var36;
      } else {
         var16 = false;
      }

      super.bind(
         var24,
         var9,
         var10,
         var21,
         var23,
         var17,
         var30,
         var12,
         var13,
         var14,
         var15,
         var19,
         var35,
         var37,
         var18,
         var27,
         var11,
         var20,
         var3 xor true,
         var4,
         var5,
         var22,
         var28,
         var8,
         var29,
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
      q.h(var1, "containerId");
      q.h(var2, "componentId");
      q.h(var3, "mediaGalleryItem");
      q.h(var5, "onClicked");
      q.h(var7, "onTapSpoiler");
      q.h(var8, "onTapObscureToggle");
      q.h(var9, "onAltTextButtonClicked");
      val var17: UnfurledMediaItem = var3.getMedia();
      val var15: SpoilerAttributes.Companion = SpoilerAttributes.Companion;
      val var16: StringBuilder = new StringBuilder();
      var16.append("MediaGalleryDisplayComponent(");
      var16.append(var2);
      var16.append(").item[image]");
      val var21: SpoilerAttributes = var15.forGenericMedia(var3, var1, var16.toString(), var3.getMedia().getProxyUrl(), var3.getVerifyAge());
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
         false
      );
   }
}
