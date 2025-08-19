package com.discord.chat.presentation.message.viewholder

import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.MessageAccessory
import com.discord.chat.presentation.message.messagepart.MessageAttachmentAccessory
import com.discord.chat.presentation.message.view.mosaic.AttachmentMediaMosaicContainerView

public class AttachmentMediaMosaicViewHolder(view: AttachmentMediaMosaicContainerView) : MessagePartViewHolder(var1) {
   private final val view: AttachmentMediaMosaicContainerView

   init {
      this.view = var1;
   }

   public fun bind(
      eventHandler: ChatEventHandler,
      attachments: List<MessageAttachmentAccessory>,
      onAttachmentClicked: (Int, MessageAccessory, MessagePartViewHolder) -> Unit,
      onAttachmentLongClicked: ((Int) -> Unit)?,
      onAttachmentSpoilerClicked: () -> Unit,
      onAttachmentObscureToggle: (Boolean) -> Unit,
      isForwardedContent: Boolean,
      shouldAutoPlayGif: Boolean,
      constrainedWidth: Int
   ) {
      this.view.setAttachments(var2, var1, var3, var4, var5, var6, var7, var9, var8);
   }
}
