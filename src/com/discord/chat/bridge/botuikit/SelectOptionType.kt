package com.discord.chat.bridge.botuikit

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.H
import kotlinx.serialization.KSerializer
import sb.g

@g(with = SelectOptionType.Serializer::class)
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
   public SelectOptionType.Companion Companion = new SelectOptionType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<SelectOptionType> = $values();
      $VALUES = var0;
      $ENTRIES = H9.a.a(var0);
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
         return SelectOptionType.Serializer.INSTANCE;
      }
   }

   public object Serializer : IntEnumSerializer(H.b(SelectOptionType.class), SelectOptionType.UNKNOWN)
}
