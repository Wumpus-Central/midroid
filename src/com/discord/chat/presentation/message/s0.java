package com.discord.chat.presentation.message;

import com.discord.chat.bridge.contentnode.CommandMentionContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class s0 implements Function1 {
   public final ChatEventHandler j;

   public final Object invoke(Object var1) {
      return MessageViewReplyPreview.j(this.j, (CommandMentionContentNode)var1);
   }
}
