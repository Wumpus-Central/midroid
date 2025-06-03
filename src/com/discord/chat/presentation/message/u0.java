package com.discord.chat.presentation.message;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class u0 implements Function1 {
   public final ChatEventHandler j;
   public final String k;

   public final Object invoke(Object var1) {
      return MessageViewReplyPreview.h(this.j, this.k, (LinkContentNode)var1);
   }
}
