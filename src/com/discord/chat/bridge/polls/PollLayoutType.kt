package com.discord.chat.bridge.polls

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import eh.l
import eh.o
import kotlin.jvm.internal.h0
import kotlinx.serialization.KSerializer
import uk.f

@f(with = PollLayoutType.Serializer::class)
public enum class PollLayoutType(serialNumber: Int) : IntEnum {
   IMAGE_ONLY(2),
   TEXT_AND_IMAGE(1),
   UNKNOWN(0)
   public open val serialNumber: Int
   @JvmStatic
   private PollLayoutType[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public PollLayoutType.Companion Companion = new PollLayoutType.Companion(null);

   init {
      this.serialNumber = var3;
   }

   public companion object {
      public fun serializer(): KSerializer<PollLayoutType> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<PollLayoutType>;
      }
   }

   public object Serializer : IntEnumSerializer(h0.b(PollLayoutType.class), PollLayoutType.UNKNOWN)
}
