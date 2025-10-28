package com.discord.chat.presentation.message;

import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class N implements Function1 {
   public final MessageAccessoriesAdapter d;
   public final MessageAccessory e;

   public final Object invoke(Object var1) {
      return MessageAccessoriesAdapter.F(this.d, this.e, (Sticker)var1);
   }
}
