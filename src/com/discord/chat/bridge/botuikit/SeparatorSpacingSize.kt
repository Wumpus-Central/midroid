package com.discord.chat.bridge.botuikit

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import ea.f
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.G
import kotlinx.serialization.KSerializer
import l8.l
import l8.o
import t8.a

@f(with = SeparatorSpacingSize.Serializer::class)
public enum class SeparatorSpacingSize(serialNumber: Int) : IntEnum {
   LARGE(2),
   SMALL(1),
   UNKNOWN(0)
   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private SeparatorSpacingSize[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.b(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public SeparatorSpacingSize.Companion Companion = new SeparatorSpacingSize.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<SeparatorSpacingSize> = $values();
      $VALUES = var0;
      $ENTRIES = a.a(var0);
   }

   init {
      this.serialNumber = var3;
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   public companion object {
      public fun serializer(): KSerializer<SeparatorSpacingSize> {
         return this.get$cachedSerializer();
      }
   }

   public object Serializer : IntEnumSerializer(G.b(SeparatorSpacingSize.class), SeparatorSpacingSize.UNKNOWN)
}
