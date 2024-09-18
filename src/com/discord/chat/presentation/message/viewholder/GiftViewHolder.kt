package com.discord.chat.presentation.message.viewholder

import com.discord.chat.presentation.message.messagepart.GiftMessageAccessory
import com.discord.chat.presentation.message.view.GiftView

public class GiftViewHolder(giftView: GiftView) : MessagePartViewHolder {
   private final val giftView: GiftView

   init {
      kotlin.jvm.internal.q.h(var1, "giftView");
      super(var1, null);
      this.giftView = var1;
   }

   public fun bind(accessory: GiftMessageAccessory, onTapEmbed: (String) -> Unit, onTapAccept: (String) -> Unit) {
      kotlin.jvm.internal.q.h(var1, "accessory");
      kotlin.jvm.internal.q.h(var2, "onTapEmbed");
      kotlin.jvm.internal.q.h(var3, "onTapAccept");
      this.giftView.bind(var1, var2, var3);
   }
}
