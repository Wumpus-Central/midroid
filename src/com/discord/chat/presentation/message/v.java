package com.discord.chat.presentation.message;

import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

// $VF: synthetic class
public final class v implements Function2 {
   public final Function4 d;
   public final MessageAccessory e;

   public final Object invoke(Object var1, Object var2) {
      return MessageAccessoriesAdapter.m(this.d, this.e, (String)var1, (Integer)var2);
   }
}
