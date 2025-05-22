package com.discord.chat.bridge

import Za.f
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.G
import kotlinx.serialization.KSerializer
import o9.a

@f(with = ChangeType.Serializer::class)
public enum class ChangeType(serialNumber: Int) : IntEnum {
   DELETE(3),
   INSERT(1),
   NOOP(0),
   UPDATE(2)
   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private ChangeType[] $VALUES;
   @JvmStatic
   public ChangeType.Companion Companion = new ChangeType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<ChangeType> = $values();
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
      public fun serializer(): KSerializer<ChangeType> {
         return ChangeType.Serializer.INSTANCE;
      }
   }

   public object Serializer : IntEnumSerializer(G.b(ChangeType.class), null, 2)
}
