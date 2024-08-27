package com.discord.chat.presentation.message.viewholder

import com.discord.chat.bridge.MessageState
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.MessageAccessory
import com.discord.chat.presentation.message.messagepart.MessageAttachmentAccessory
import com.discord.chat.presentation.message.view.mosaic.AttachmentMediaMosaicContainerView

public class AttachmentMediaMosaicViewHolder(view: AttachmentMediaMosaicContainerView, eventHandler: ChatEventHandler) : MessagePartViewHolder {
   private final val view: AttachmentMediaMosaicContainerView
   private final val eventHandler: ChatEventHandler

   init {
      kotlin.jvm.internal.r.h(var1, "view");
      kotlin.jvm.internal.r.h(var2, "eventHandler");
      super(var1, null);
      this.view = var1;
      this.eventHandler = var2;
   }

   public fun bind(
      attachments: List<MessageAttachmentAccessory>,
      onAttachmentClicked: (Int, MessageAccessory, MessagePartViewHolder) -> Unit,
      onAttachmentLongClicked: ((Int) -> Unit)?,
      onAttachmentSpoilerClicked: () -> Unit,
      onTapInlineForward: () -> Unit,
      isShowingInlineForward: Boolean,
      isForwardedContent: Boolean,
      messageState: MessageState,
      shouldAutoPlayGif: Boolean,
      useOldForwardIcon: Boolean,
      constrainedWidth: Int
   ) {
      kotlin.jvm.internal.r.h(var1, "attachments");
      kotlin.jvm.internal.r.h(var2, "onAttachmentClicked");
      kotlin.jvm.internal.r.h(var4, "onAttachmentSpoilerClicked");
      kotlin.jvm.internal.r.h(var5, "onTapInlineForward");
      kotlin.jvm.internal.r.h(var8, "messageState");
      this.view.setAttachments(var1, this.eventHandler, var2, var3, var4, var5, var6, var7, var11, var8, var9, var10);
   }
}
