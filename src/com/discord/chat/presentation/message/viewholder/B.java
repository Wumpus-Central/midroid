package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.message.messagepart.MessageContentAccessory;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class B implements Function1 {
   public final Function2 j;
   public final MessageContentAccessory k;

   public final Object invoke(Object var1) {
      return MessageContentViewHolder.c(this.j, this.k, (LinkContentNode)var1);
   }
}
