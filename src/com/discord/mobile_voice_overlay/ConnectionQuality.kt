package com.discord.mobile_voice_overlay

import fa.f
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import m8.l
import m8.o

@f
public enum class ConnectionQuality {
   Average,
   Bad,
   Fine,
   Unknown   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private ConnectionQuality[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.b(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public ConnectionQuality.Companion Companion = new ConnectionQuality.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<ConnectionQuality> = $values();
      $VALUES = var0;
      $ENTRIES = u8.a.a(var0);
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   public companion object {
      public fun serializer(): KSerializer<ConnectionQuality> {
         return this.get$cachedSerializer();
      }
   }
}
