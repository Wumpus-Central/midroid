package com.discord.chat.presentation.message;

import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.jvm.functions.Function0;

// $VF: synthetic class
public final class f1 implements Function0 {
   public final ChatEventHandler d;
   public final Message e;

   public final Object invoke() {
      return MessageView.n(this.d, this.e);
   }
}
