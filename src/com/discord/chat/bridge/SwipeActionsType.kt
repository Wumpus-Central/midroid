package com.discord.chat.bridge

import H9.a
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.G
import kotlinx.serialization.KSerializer
import sb.f

@f(with = SwipeActionsType.Serializer::class)
public enum class SwipeActionsType(serialNumber: Int) : IntEnum {
   NONE(0),
   REPLY(1),
   REPLY_EDIT(2)
   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private SwipeActionsType[] $VALUES;
   @JvmStatic
   public SwipeActionsType.Companion Companion = new SwipeActionsType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<SwipeActionsType> = $values();
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
      public fun serializer(): KSerializer<SwipeActionsType> {
         return SwipeActionsType.Serializer.INSTANCE;
      }
   }

   public object Serializer : IntEnumSerializer(G.b(SwipeActionsType.class), null, 2)
}
