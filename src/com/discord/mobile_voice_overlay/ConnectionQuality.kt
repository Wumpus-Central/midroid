package com.discord.mobile_voice_overlay

import gh.l
import gh.o
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import yk.f

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
   private Lazy $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public ConnectionQuality.Companion Companion = new ConnectionQuality.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<ConnectionQuality> = $values();
      $VALUES = var0;
      $ENTRIES = nh.a.a(var0);
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
