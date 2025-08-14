package com.discord.chat.bridge.spoiler

import java.util.LinkedHashSet

public object SpoilerManager {
   private final val revealedSpoilers: MutableSet<SpoilerIdentifier> = new LinkedHashSet()

   public fun isNotRevealed(id: SpoilerIdentifier): Boolean {
      return this.isRevealed-V2PEE7g(var1) xor true;
   }

   public fun isRevealed(id: SpoilerIdentifier): Boolean {
      return revealedSpoilers.contains(SpoilerIdentifier.box-impl(var1));
   }

   public fun markHidden(id: SpoilerIdentifier) {
      revealedSpoilers.remove(SpoilerIdentifier.box-impl(var1));
   }

   public fun markRevealed(id: SpoilerIdentifier) {
      revealedSpoilers.add(SpoilerIdentifier.box-impl(var1));
   }

   public fun reset() {
      revealedSpoilers.clear();
   }
}
