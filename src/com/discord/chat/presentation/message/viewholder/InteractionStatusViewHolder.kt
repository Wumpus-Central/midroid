package com.discord.chat.presentation.message.viewholder

import com.discord.chat.presentation.message.messagepart.InteractionStatusMessageAccessory
import com.discord.chat.presentation.message.view.InteractionStatusView

public class InteractionStatusViewHolder(interactionStatusView: InteractionStatusView) : MessagePartViewHolder {
   private final val interactionStatusView: InteractionStatusView

   init {
      kotlin.jvm.internal.q.h(var1, "interactionStatusView");
      super(var1, null);
      this.interactionStatusView = var1;
   }

   public fun bind(accessory: InteractionStatusMessageAccessory) {
      kotlin.jvm.internal.q.h(var1, "accessory");
      this.interactionStatusView.setInteractionStatus-ntcYbpo(var1.getMessageId-3Eiw7ao(), var1.getInteractionStatus());
   }
}
