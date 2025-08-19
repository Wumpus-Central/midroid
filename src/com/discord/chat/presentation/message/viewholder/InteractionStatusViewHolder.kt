package com.discord.chat.presentation.message.viewholder

import com.discord.chat.presentation.message.messagepart.InteractionStatusMessageAccessory
import com.discord.chat.presentation.message.view.InteractionStatusView

public class InteractionStatusViewHolder(interactionStatusView: InteractionStatusView) : MessagePartViewHolder(var1) {
   private final val interactionStatusView: InteractionStatusView

   init {
      this.interactionStatusView = var1;
   }

   public fun bind(accessory: InteractionStatusMessageAccessory) {
      this.interactionStatusView.setInteractionStatus-ntcYbpo(var1.getMessageId-3Eiw7ao(), var1.getInteractionStatus());
   }
}
