package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.UserId;
import kotlin.jvm.functions.Function3;

// $VF: synthetic class
public final class A implements Function3 {
   public final ChatEventHandler d;
   public final String e;

   public final Object invoke(Object var1, Object var2, Object var3) {
      return MessageComponentsViewHolder.c(this.d, this.e, (UserId)var1, (String)var2, (String)var3);
   }
}
