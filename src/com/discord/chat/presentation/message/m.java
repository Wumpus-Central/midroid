package com.discord.chat.presentation.message;

import com.discord.reactions.ReactionView;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class m implements Function1 {
   public final MessageAccessoriesAdapter d;

   public final Object invoke(Object var1) {
      return MessageAccessoriesAdapter.K(this.d, (ReactionView.Reaction)var1);
   }
}
