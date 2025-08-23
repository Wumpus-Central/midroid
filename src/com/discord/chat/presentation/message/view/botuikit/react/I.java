package com.discord.chat.presentation.message.view.botuikit.react;

import com.discord.chat.bridge.contentnode.EmojiContentNode;
import com.discord.chat.presentation.message.view.botuikit.components.TextDisplayComponentView;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class I implements Function1 {
   public final TextDisplayComponentViewManager d;
   public final TextDisplayComponentView e;

   public final Object invoke(Object var1) {
      return TextDisplayComponentViewManager.c(this.d, this.e, (EmojiContentNode)var1);
   }
}
