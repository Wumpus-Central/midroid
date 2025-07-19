package com.discord.chat.presentation.message;

import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import kotlin.jvm.functions.Function3;

// $VF: synthetic class
public final class G implements Function3 {
   public final MessageAccessoriesAdapter j;

   public final Object invoke(Object var1, Object var2, Object var3) {
      return MessageAccessoriesAdapter.f(this.j, (Integer)var1, (MessageAccessory)var2, (MessagePartViewHolder)var3);
   }
}
