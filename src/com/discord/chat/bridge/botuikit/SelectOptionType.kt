package com.discord.chat.bridge.botuikit

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import fa.f
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.G
import kotlinx.serialization.KSerializer
import m8.l
import m8.o
import u8.a

@f(with = SelectOptionType.Serializer::class)
public enum class SelectOptionType(serialNumber: Int) : IntEnum {
   CHANNEL(4),
   ROLE(3),
   STRING(1),
   UNKNOWN(0),
   USER(2)
   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private SelectOptionType[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.b(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public SelectOptionType.Companion Companion = new SelectOptionType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<SelectOptionType> = $values();
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
      public fun serializer(): KSerializer<SelectOptionType> {
         return this.get$cachedSerializer();
      }
   }

   public object Serializer : IntEnumSerializer(G.b(SelectOptionType.class), SelectOptionType.UNKNOWN)
}
