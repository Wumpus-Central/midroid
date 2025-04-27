package com.discord.chat.presentation.message.viewholder

import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.presentation.message.messagepart.ReferralMessageAccessory
import com.discord.chat.presentation.message.view.ReferralView
import com.discord.primitives.MessageId

public class ReferralViewHolder(referralView: ReferralView) : MessagePartViewHolder {
   private final val referralView: ReferralView

   init {
      kotlin.jvm.internal.q.h(var1, "referralView");
      super(var1, null);
      this.referralView = var1;
   }

   public fun bind(accessory: ReferralMessageAccessory, onTapAccept: (String?) -> Unit, onTapLink: (MessageId, LinkContentNode) -> Unit) {
      kotlin.jvm.internal.q.h(var1, "accessory");
      kotlin.jvm.internal.q.h(var2, "onTapAccept");
      kotlin.jvm.internal.q.h(var3, "onTapLink");
      this.referralView.bind(var1, var2, var3);
   }
}
