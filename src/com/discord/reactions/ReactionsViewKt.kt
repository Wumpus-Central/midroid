package com.discord.reactions

import com.discord.reactions.ReactionView.Reaction
import java.util.ArrayList
import kotlin.jvm.internal.r

public fun copyReactionWithoutCount(reaction: Reaction, isBurstReaction: Boolean): Reaction {
   r.h(var0, "reaction");
   return new ReactionView.Reaction(var1, var0) {
      private final int burstCount;
      private final int count;
      private final ReactionView.Emoji emoji;
      private final boolean isMe;
      private final boolean isMeBurst;
      private final BurstReactionView.ThemedBurstColorPalette themedBurstColors;

      {
         var var3: Int;
         if (var1) {
            var3 = 0;
         } else {
            var3 = var2.getCount();
         }

         this.count = var3;
         var3 = 0;
         if (var1) {
            var3 = var2.getBurstCount();
         }

         this.burstCount = var3;
         this.isMe = var2.isMe();
         this.isMeBurst = var2.isMeBurst();
         this.emoji = var2.getEmoji();
         this.themedBurstColors = var2.getThemedBurstColors();
      }

      @Override
      public int getBurstCount() {
         return this.burstCount;
      }

      @Override
      public int getCount() {
         return this.count;
      }

      @Override
      public ReactionView.Emoji getEmoji() {
         return this.emoji;
      }

      @Override
      public java.lang.Long getItemId() {
         return ReactionView.Reaction.DefaultImpls.getItemId(this);
      }

      @Override
      public BurstReactionView.ThemedBurstColorPalette getThemedBurstColors() {
         return this.themedBurstColors;
      }

      @Override
      public boolean isBurstReaction() {
         return ReactionView.Reaction.DefaultImpls.isBurstReaction(this);
      }

      @Override
      public boolean isMe() {
         return this.isMe;
      }

      @Override
      public boolean isMeBurst() {
         return this.isMeBurst;
      }
   };
}

public fun separateAndSortDuplicateReactions(reactions: List<Reaction>?): List<Reaction> {
   val var1: ArrayList = new ArrayList();
   if (var0 == null) {
      return var1;
   } else {
      for (ReactionView.Reaction var2 : var0) {
         if (var2.getBurstCount() > 0 && var2.getCount() > 0) {
            var1.add(copyReactionWithoutCount(var2, true));
            var1.add(copyReactionWithoutCount(var2, false));
         } else {
            var1.add(var2);
         }
      }

      return var1;
   }
}
