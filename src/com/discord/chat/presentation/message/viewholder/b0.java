package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.message.messagepart.MessageContentAccessory;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class b0 implements Function1 {
   public final Function2 d;
   public final MessageContentAccessory e;

   public final Object invoke(Object var1) {
      return MessageContentViewHolder.d(this.d, this.e, (LinkContentNode)var1);
   }
}
