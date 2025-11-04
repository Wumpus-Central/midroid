package com.discord.chat.presentation.message.viewholder;

import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.primitives.UserId;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class b0 implements Function1 {
   public final ChatEventHandler d;
   public final String e;

   public final Object invoke(Object var1) {
      return MessageComponentsViewHolder.e(this.d, this.e, (UserId)var1);
   }
}
