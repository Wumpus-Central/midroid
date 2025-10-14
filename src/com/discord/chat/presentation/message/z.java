package com.discord.chat.presentation.message;

import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class z implements Function2 {
   public final MessagePartViewHolder d;
   public final MessageAccessory e;
   public final MessageAccessoriesAdapter i;

   public final Object invoke(Object var1, Object var2) {
      return MessageAccessoriesAdapter.o(this.d, this.e, this.i, (Double)var1, (Integer)var2);
   }
}
