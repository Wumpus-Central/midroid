package com.discord.chat.bridge.polls

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import fh.l
import fh.o
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.g0
import kotlinx.serialization.KSerializer
import mh.a
import xk.f

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
   private Lazy $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
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
         return this.get$cachedSerializer();
      }
   }

   public object Serializer : IntEnumSerializer(g0.b(PollLayoutType.class), PollLayoutType.UNKNOWN)
}
