package com.discord.chat.presentation.message.viewholder

import com.discord.chat.presentation.message.messagepart.GiftMessageAccessory
import com.discord.chat.presentation.message.view.GiftView

public class GiftViewHolder(giftView: GiftView) : MessagePartViewHolder(var1) {
   private final val giftView: GiftView

   init {
      this.giftView = var1;
   }

   public fun bind(accessory: GiftMessageAccessory, onTapEmbed: (String) -> Unit, onTapAccept: (String) -> Unit) {
      this.giftView.bind(var1, var2, var3);
   }
}
