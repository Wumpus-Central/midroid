package com.discord.chat.presentation.message;

import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import kotlin.jvm.functions.Function3;

// $VF: synthetic class
public final class e0 implements Function3 {
   public final MessageAccessoriesAdapter d;

   public final Object invoke(Object var1, Object var2, Object var3) {
      return MessageAccessoriesAdapter.A(this.d, (Integer)var1, (MessageAccessory)var2, (MessagePartViewHolder)var3);
   }
}
