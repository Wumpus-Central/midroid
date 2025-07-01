package com.discord.chat.bridge.polls

import I9.a
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.G
import kotlinx.serialization.KSerializer
import tb.f

@f(with = PollRadioStyle.Serializer::class)
public enum class PollRadioStyle(serialNumber: Int) : IntEnum {
   CHECKMARK(3),
   FILLED(2),
   HOLLOW(1),
   NONE(0)
   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private PollRadioStyle[] $VALUES;
   @JvmStatic
   public PollRadioStyle.Companion Companion = new PollRadioStyle.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<PollRadioStyle> = $values();
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
      public fun serializer(): KSerializer<PollRadioStyle> {
         return PollRadioStyle.Serializer.INSTANCE;
      }
   }

   public object Serializer : IntEnumSerializer(G.b(PollRadioStyle.class), PollRadioStyle.NONE)
}
