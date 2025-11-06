package com.discord.chat.presentation.message;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.executedcommand.ExecutedCommand;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class r1 implements Function1 {
   public final ExecutedCommand d;

   public final Object invoke(Object var1) {
      return MessageViewReplyPreview.l(this.d, (LinkContentNode)var1);
   }
}
