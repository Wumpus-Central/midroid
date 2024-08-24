package com.discord.chat.bridge.polls

import eh.l
import eh.o
import kotlinx.serialization.KSerializer
import uk.f

@f
public enum class PollActionPresentation {
   BUTTON,
   SECONDARY_BUTTON,
   TEXT,
   TEXT_BUTTON   @JvmStatic
   private PollActionPresentation[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public PollActionPresentation.Companion Companion = new PollActionPresentation.Companion(null);

   public companion object {
      public fun serializer(): KSerializer<PollActionPresentation> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<PollActionPresentation>;
      }
   }
}
