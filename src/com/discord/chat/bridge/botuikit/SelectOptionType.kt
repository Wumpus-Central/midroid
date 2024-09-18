package com.discord.chat.bridge.botuikit

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import dh.l
import dh.o
import kh.a
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.g0
import kotlinx.serialization.KSerializer
import vk.f

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
   private Lazy $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
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

   public object Serializer : IntEnumSerializer(g0.b(SelectOptionType.class), SelectOptionType.UNKNOWN)
}
