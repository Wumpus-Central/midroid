package com.discord.chat.bridge

import ca.f
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import j8.l
import j8.o
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.E
import kotlinx.serialization.KSerializer
import q8.a

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
   private Lazy $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
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
         return this.get$cachedSerializer();
      }
   }

   public object Serializer : IntEnumSerializer(E.b(SwipeActionsType.class), null, 2)
}
