package com.discord.chat.bridge.polls

import ch.l
import ch.o
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import jh.a
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.g0
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
   private EnumEntries $ENTRIES;
   @JvmStatic
   private ShadowType[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public ShadowType.Companion Companion = new ShadowType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<ShadowType> = $values();
      $VALUES = var0;
      $ENTRIES = a.a(var0);
   }

   init {
      this.serialNumber = var3;
      this.elevationDp = var4;
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   public companion object {
      public fun serializer(): KSerializer<ShadowType> {
         return this.get$cachedSerializer();
      }
   }

   public object Serializer : IntEnumSerializer(g0.b(ShadowType.class), ShadowType.NONE)
}
