package com.discord.chat.presentation.message.viewholder

import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.presentation.message.messagepart.ReferralMessageAccessory
import com.discord.chat.presentation.message.view.ReferralView
import com.discord.primitives.MessageId

public class ReferralViewHolder(referralView: ReferralView) : MessagePartViewHolder(var1) {
   private final val referralView: ReferralView

   init {
      this.referralView = var1;
   }

   public fun bind(accessory: ReferralMessageAccessory, onTapAccept: (String?) -> Unit, onTapLink: (MessageId, LinkContentNode) -> Unit) {
      this.referralView.bind(var1, var2, var3);
   }
}
