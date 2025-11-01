package com.discord.chat.presentation.message;

import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class q1 implements Function1 {
   public final ChatEventHandler d;

   public final Object invoke(Object var1) {
      return MessageViewReplyPreview.k(this.d, (CommandMentionContentNode)var1);
   }
}
