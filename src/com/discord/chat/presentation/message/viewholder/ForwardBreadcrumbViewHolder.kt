package com.discord.chat.presentation.message.viewholder

import com.discord.chat.presentation.message.messagepart.ForwardBreadcrumbMessageAccessory
import com.discord.chat.presentation.message.view.ForwardBreadcrumbView
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId

public class ForwardBreadcrumbViewHolder(breadcrumbView: ForwardBreadcrumbView) : MessagePartViewHolder(var1) {
   private final val breadcrumbView: ForwardBreadcrumbView

   init {
      this.breadcrumbView = var1;
   }

   public fun bind(accessory: ForwardBreadcrumbMessageAccessory, onTapForwardFooter: (Int, ChannelId, MessageId) -> Unit) {
      this.breadcrumbView.configure-JjTCmh4(var1.getChannelId-o4g7jtM(), var1.getMessageId-3Eiw7ao(), var1.getForwardInfo(), var2);
   }
}
