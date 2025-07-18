package com.discord.chat.presentation.message;

import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import com.discord.chat.presentation.message.viewholder.MessagePartViewHolder;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class E implements Function2 {
   public final MessagePartViewHolder j;
   public final MessageAccessory k;
   public final MessageAccessoriesAdapter l;

   public final Object invoke(Object var1, Object var2) {
      return MessageAccessoriesAdapter.p(this.j, this.k, this.l, (Double)var1, (Integer)var2);
   }
}
