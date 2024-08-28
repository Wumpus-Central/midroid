package com.discord.chat.presentation.message.viewholder

import com.discord.chat.presentation.message.messagepart.ForwardBreadcrumbMessageAccessory
import com.discord.chat.presentation.message.view.ForwardBreadcrumbView
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId

public class ForwardBreadcrumbViewHolder(breadcrumbView: ForwardBreadcrumbView) : MessagePartViewHolder {
   private final val breadcrumbView: ForwardBreadcrumbView

   init {
      kotlin.jvm.internal.q.h(var1, "breadcrumbView");
      super(var1, null);
      this.breadcrumbView = var1;
   }

   public fun bind(accessory: ForwardBreadcrumbMessageAccessory, onTapForwardFooter: (Int, ChannelId, MessageId) -> Unit) {
      kotlin.jvm.internal.q.h(var1, "accessory");
      kotlin.jvm.internal.q.h(var2, "onTapForwardFooter");
      this.breadcrumbView.configure-JjTCmh4(var1.getChannelId-o4g7jtM(), var1.getMessageId-3Eiw7ao(), var1.getForwardInfo(), var2);
   }
}
