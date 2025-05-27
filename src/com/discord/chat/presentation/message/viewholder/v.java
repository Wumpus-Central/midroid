package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class v implements Function2 {
   public final ChatEventHandler j;
   public final String k;

   public final Object invoke(Object var1, Object var2) {
      return MessageComponentsViewHolder.f(this.j, this.k, (String)var1, (String)var2);
   }
}
