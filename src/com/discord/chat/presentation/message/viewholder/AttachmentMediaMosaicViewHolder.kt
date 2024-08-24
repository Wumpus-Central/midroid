package com.discord.chat.presentation.message.viewholder

import com.discord.chat.bridge.MessageState
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.MessageAccessory
import com.discord.chat.presentation.message.view.mosaic.AttachmentMediaMosaicContainerView
import com.discord.primitives.MessageId

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
      messageId: MessageId,
      attachments: List<MessageAccessory>,
      constrainedWidth: Int,
      onAttachmentClicked: (Int, MessageAccessory, MessagePartViewHolder) -> Unit,
      onAttachmentLongClicked: ((Int) -> Unit)?,
      onAttachmentSpoilerClicked: () -> Unit,
      onTapInlineForward: () -> Unit,
      isForwardedContent: Boolean,
      isShowingInlineForward: Boolean,
      messageState: MessageState,
      shouldAutoPlayGif: Boolean,
      useOldForwardIcon: Boolean
   ) {
      kotlin.jvm.internal.r.h(var1, "messageId");
      kotlin.jvm.internal.r.h(var2, "attachments");
      kotlin.jvm.internal.r.h(var4, "onAttachmentClicked");
      kotlin.jvm.internal.r.h(var6, "onAttachmentSpoilerClicked");
      kotlin.jvm.internal.r.h(var7, "onTapInlineForward");
      kotlin.jvm.internal.r.h(var10, "messageState");
      this.view.setAttachments-JJXpD5M(var1, var2, var3, this.eventHandler, var4, var5, var6, var7, var8, var9, var10, var11, var12);
   }
}
