package com.discord.chat.presentation.message;

import com.discord.chat.bridge.contentnode.LinkContentNode;
import com.discord.chat.bridge.executedcommand.ExecutedCommand;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class w0 implements Function1 {
   public final ExecutedCommand j;

   public final Object invoke(Object var1) {
      return MessageViewReplyPreview.k(this.j, (LinkContentNode)var1);
   }
}
