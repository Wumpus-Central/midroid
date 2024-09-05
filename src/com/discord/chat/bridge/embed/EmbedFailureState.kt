package com.discord.chat.bridge.embed

import ck.a
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.g0
import kotlinx.serialization.KSerializer
import nn.f
import vj.l
import vj.o

@f(with = EmbedFailureState.Serializer::class)
public enum class EmbedFailureState(serialNumber: Int) : IntEnum {
   AUTO_MODERATION_BLOCKED_MESSAGE(2),
   UNSPECIFIED(0),
   UPLOAD_FAILED(1)
   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private EmbedFailureState[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.b(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public EmbedFailureState.Companion Companion = new EmbedFailureState.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<EmbedFailureState> = $values();
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
      public fun serializer(): KSerializer<EmbedFailureState> {
         return this.get$cachedSerializer();
      }
   }

   public object Serializer : IntEnumSerializer(g0.b(EmbedFailureState.class), null, 2)
}
