package com.discord.chat.bridge.polls

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import eh.l
import eh.o
import kotlin.jvm.internal.h0
import kotlinx.serialization.KSerializer
import uk.f

@f(with = PollRadioStyle.Serializer::class)
public enum class PollRadioStyle(serialNumber: Int) : IntEnum {
   CHECKMARK(3),
   FILLED(2),
   HOLLOW(1),
   NONE(0)
   public open val serialNumber: Int
   @JvmStatic
   private PollRadioStyle[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public PollRadioStyle.Companion Companion = new PollRadioStyle.Companion(null);

   init {
      this.serialNumber = var3;
   }

   public companion object {
      public fun serializer(): KSerializer<PollRadioStyle> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<PollRadioStyle>;
      }
   }

   public object Serializer : IntEnumSerializer(h0.b(PollRadioStyle.class), PollRadioStyle.NONE)
}
