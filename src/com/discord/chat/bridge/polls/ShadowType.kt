package com.discord.chat.bridge.polls

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import eh.l
import eh.o
import kotlin.jvm.internal.h0
import kotlinx.serialization.KSerializer
import uk.f

@f(with = ShadowType.Serializer::class)
public enum class ShadowType(serialNumber: Int, elevationDp: Int) : IntEnum {
   HIGH(2, 20),
   LOW(1, 4),
   NONE(0, 0)
   public final val elevationDp: Int
   public open val serialNumber: Int
   @JvmStatic
   private ShadowType[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public ShadowType.Companion Companion = new ShadowType.Companion(null);

   init {
      this.serialNumber = var3;
      this.elevationDp = var4;
   }

   public companion object {
      public fun serializer(): KSerializer<ShadowType> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<ShadowType>;
      }
   }

   public object Serializer : IntEnumSerializer(h0.b(ShadowType.class), ShadowType.NONE)
}
