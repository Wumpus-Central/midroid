package com.discord.chat.presentation.message;

import com.discord.reactions.ReactionView;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class T implements Function1 {
   public final MessageAccessoriesAdapter j;

   public final Object invoke(Object var1) {
      return MessageAccessoriesAdapter.m(this.j, (ReactionView.Reaction)var1);
   }
}
