package com.discord.chat.presentation.message.viewholder

import com.discord.chat.bridge.ctabutton.CtaButton
import com.discord.chat.presentation.message.view.CtaButtonView
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId

public class CtaButtonViewHolder(ctaButtonView: CtaButtonView) : MessagePartViewHolder {
   private final val ctaButtonView: CtaButtonView

   init {
      kotlin.jvm.internal.r.h(var1, "ctaButtonView");
      super(var1, null);
      this.ctaButtonView = var1;
   }

   public fun bind(channelId: ChannelId, messageId: MessageId, accessory: CtaButton, onTapCtaButton: (ChannelId, MessageId, String) -> Unit) {
      kotlin.jvm.internal.r.h(var3, "messageId");
      kotlin.jvm.internal.r.h(var4, "accessory");
      kotlin.jvm.internal.r.h(var5, "onTapCtaButton");
      this.ctaButtonView.setContent-P6jPPyA(var1, var3, var4.getText(), var4.getTextColor(), var4.getBackgroundColor(), var4.getCallback(), var5);
   }
}
