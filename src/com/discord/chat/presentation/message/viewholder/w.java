package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.jvm.functions.Function2;

// $VF: synthetic class
public final class w implements Function2 {
   public final ChatEventHandler d;
   public final String e;

   public final Object invoke(Object var1, Object var2) {
      return MessageComponentsViewHolder.f(this.d, this.e, (String)var1, (String)var2);
   }
}
