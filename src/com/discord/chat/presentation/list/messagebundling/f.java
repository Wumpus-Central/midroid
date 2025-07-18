package com.discord.chat.presentation.list.messagebundling;

import com.discord.chat.bridge.Message;
import com.discord.chat.presentation.events.ChatEventHandler;
import com.discord.reactions.ReactionView;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class f implements Function1 {
   public final ChatEventHandler j;
   public final Message k;

   public final Object invoke(Object var1) {
      return MessageBundleConversationView.h(this.j, this.k, (ReactionView.Reaction)var1);
   }
}
