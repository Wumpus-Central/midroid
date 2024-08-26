package com.discord.chat.presentation.message.viewholder

import com.discord.chat.presentation.message.messagepart.ForwardBreadcrumbMessageAccessory
import com.discord.chat.presentation.message.view.ForwardBreadcrumbView
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId

public class ForwardBreadcrumbViewHolder(breadcrumbView: ForwardBreadcrumbView) : MessagePartViewHolder {
   private final val breadcrumbView: ForwardBreadcrumbView

   init {
      kotlin.jvm.internal.r.h(var1, "breadcrumbView");
      super(var1, null);
      this.breadcrumbView = var1;
   }

   public fun bind(accessory: ForwardBreadcrumbMessageAccessory, onTapForwardFooter: (Int, ChannelId, MessageId) -> Unit) {
      kotlin.jvm.internal.r.h(var1, "accessory");
      kotlin.jvm.internal.r.h(var2, "onTapForwardFooter");
      this.breadcrumbView.configure_JjTCmh4(var1.getChannelId_o4g7jtM(), var1.getMessageId_3Eiw7ao(), var1.getForwardInfo(), var2);
   }
}
