package com.discord.chat.bridge.botuikit

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import eh.l
import eh.o
import kotlin.jvm.internal.h0
import kotlinx.serialization.KSerializer
import uk.f

@f(with = SelectOptionType.Serializer::class)
public enum class SelectOptionType(serialNumber: Int) : IntEnum {
   CHANNEL(4),
   ROLE(3),
   STRING(1),
   UNKNOWN(0),
   USER(2)
   public open val serialNumber: Int
   @JvmStatic
   private SelectOptionType[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public SelectOptionType.Companion Companion = new SelectOptionType.Companion(null);

   init {
      this.serialNumber = var3;
   }

   public companion object {
      public fun serializer(): KSerializer<SelectOptionType> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<SelectOptionType>;
      }
   }

   public object Serializer : IntEnumSerializer(h0.b(SelectOptionType.class), SelectOptionType.UNKNOWN)
}
