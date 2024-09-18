package com.discord.chat.bridge.polls

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import gh.l
import gh.o
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.g0
import kotlinx.serialization.KSerializer
import nh.a
import yk.f

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
   private Lazy $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
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
         return this.get$cachedSerializer();
      }
   }

   public object Serializer : IntEnumSerializer(g0.b(PollRadioStyle.class), PollRadioStyle.NONE)
}
