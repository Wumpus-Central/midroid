package com.discord.chat.bridge.spoiler

import java.util.LinkedHashSet
import kotlin.jvm.internal.r

public object SpoilerManager {
   private final val revealedSpoilers: MutableSet<SpoilerIdentifier> = new LinkedHashSet()

   public fun isNotRevealed(id: SpoilerIdentifier): Boolean {
      r.h(var1, "id");
      return this.isRevealed-V2PEE7g(var1) xor true;
   }

   public fun isRevealed(id: SpoilerIdentifier): Boolean {
      r.h(var1, "id");
      return revealedSpoilers.contains(SpoilerIdentifier.box-impl(var1));
   }

   public fun markHidden(id: SpoilerIdentifier) {
      r.h(var1, "id");
      revealedSpoilers.remove(SpoilerIdentifier.box-impl(var1));
   }

   public fun markRevealed(id: SpoilerIdentifier) {
      r.h(var1, "id");
      revealedSpoilers.add(SpoilerIdentifier.box-impl(var1));
   }

   public fun reset() {
      revealedSpoilers.clear();
   }
}
