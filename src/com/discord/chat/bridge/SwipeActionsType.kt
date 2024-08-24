package com.discord.chat.bridge

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import eh.l
import eh.o
import kotlin.jvm.internal.h0
import kotlinx.serialization.KSerializer
import uk.f

@f(with = SwipeActionsType.Serializer::class)
public enum class SwipeActionsType(serialNumber: Int) : IntEnum {
   NONE(0),
   REPLY(1),
   REPLY_EDIT(2)
   public open val serialNumber: Int
   @JvmStatic
   private SwipeActionsType[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public SwipeActionsType.Companion Companion = new SwipeActionsType.Companion(null);

   init {
      this.serialNumber = var3;
   }

   public companion object {
      public fun serializer(): KSerializer<SwipeActionsType> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<SwipeActionsType>;
      }
   }

   public object Serializer : IntEnumSerializer(h0.b(SwipeActionsType.class), null, 2)
}
