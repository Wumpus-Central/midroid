package com.discord.chat.presentation.message;

import com.discord.chat.bridge.sticker.Sticker;
import com.discord.chat.presentation.message.messagepart.MessageAccessory;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class P implements Function1 {
   public final MessageAccessoriesAdapter j;
   public final MessageAccessory k;

   public final Object invoke(Object var1) {
      return MessageAccessoriesAdapter.F(this.j, this.k, (Sticker)var1);
   }
}
