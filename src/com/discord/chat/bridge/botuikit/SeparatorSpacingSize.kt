package com.discord.chat.bridge.botuikit

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import eh.l
import eh.o
import kotlin.jvm.internal.h0
import kotlinx.serialization.KSerializer
import uk.f

@f(with = SeparatorSpacingSize.Serializer::class)
public enum class SeparatorSpacingSize(serialNumber: Int) : IntEnum {
   LARGE(2),
   SMALL(1),
   UNKNOWN(0)
   public open val serialNumber: Int
   @JvmStatic
   private SeparatorSpacingSize[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public SeparatorSpacingSize.Companion Companion = new SeparatorSpacingSize.Companion(null);

   init {
      this.serialNumber = var3;
   }

   public companion object {
      public fun serializer(): KSerializer<SeparatorSpacingSize> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<SeparatorSpacingSize>;
      }
   }

   public object Serializer : IntEnumSerializer(h0.b(SeparatorSpacingSize.class), SeparatorSpacingSize.UNKNOWN)
}
