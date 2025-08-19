package com.discord.chat.presentation.message;

import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class K implements Function1 {
   public final MessageAccessoriesAdapter d;
   public final MessageAccessory e;

   public final Object invoke(Object var1) {
      return MessageAccessoriesAdapter.d(this.d, this.e, (Boolean)var1);
   }
}
