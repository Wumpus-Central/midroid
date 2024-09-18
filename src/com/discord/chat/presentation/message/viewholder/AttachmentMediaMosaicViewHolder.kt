package com.discord.chat.presentation.message.viewholder

import com.discord.chat.bridge.MessageState
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.MessageAccessory
import com.discord.chat.presentation.message.messagepart.MessageAttachmentAccessory
import com.discord.chat.presentation.message.view.mosaic.AttachmentMediaMosaicContainerView

public class AttachmentMediaMosaicViewHolder(view: AttachmentMediaMosaicContainerView) : MessagePartViewHolder {
   private final val view: AttachmentMediaMosaicContainerView

   init {
      kotlin.jvm.internal.q.h(var1, "view");
      super(var1, null);
      this.view = var1;
   }

   public fun bind(
      eventHandler: ChatEventHandler,
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
      kotlin.jvm.internal.q.h(var1, "eventHandler");
      kotlin.jvm.internal.q.h(var2, "attachments");
      kotlin.jvm.internal.q.h(var3, "onAttachmentClicked");
      kotlin.jvm.internal.q.h(var5, "onAttachmentSpoilerClicked");
      kotlin.jvm.internal.q.h(var6, "onTapInlineForward");
      kotlin.jvm.internal.q.h(var9, "messageState");
      this.view.setAttachments(var2, var1, var3, var4, var5, var6, var7, var8, var12, var9, var10, var11);
   }
}
