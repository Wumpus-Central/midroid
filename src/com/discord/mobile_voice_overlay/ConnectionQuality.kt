package com.discord.mobile_voice_overlay

import eh.l
import eh.o
import kotlinx.serialization.KSerializer
import uk.f

@f
public enum class ConnectionQuality {
   Average,
   Bad,
   Fine,
   Unknown   @JvmStatic
   private ConnectionQuality[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public ConnectionQuality.Companion Companion = new ConnectionQuality.Companion(null);

   public companion object {
      public fun serializer(): KSerializer<ConnectionQuality> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<ConnectionQuality>;
      }
   }
}
