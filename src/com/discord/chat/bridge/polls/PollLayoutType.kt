package com.discord.chat.bridge.polls

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import kb.f
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.G
import kotlinx.serialization.KSerializer
import z9.a

@f(with = PollLayoutType.Serializer::class)
public enum class PollLayoutType(serialNumber: Int) : IntEnum {
   IMAGE_ONLY(2),
   TEXT_AND_IMAGE(1),
   UNKNOWN(0)
   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private PollLayoutType[] $VALUES;
   @JvmStatic
   public PollLayoutType.Companion Companion = new PollLayoutType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<PollLayoutType> = $values();
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
      public fun serializer(): KSerializer<PollLayoutType> {
         return PollLayoutType.Serializer.INSTANCE;
      }
   }

   public object Serializer : IntEnumSerializer(G.b(PollLayoutType.class), PollLayoutType.UNKNOWN)
}
