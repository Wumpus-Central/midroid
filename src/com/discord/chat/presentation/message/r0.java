package com.discord.chat.presentation.message;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.presentation.events.ChatEventHandler;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class r0 implements Function1 {
   public final ChatEventHandler d;
   public final String e;

   public final Object invoke(Object var1) {
      return MessageViewReplyPreview.g(this.d, this.e, (LinkContentNode)var1);
   }
}
