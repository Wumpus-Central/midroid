package com.discord.chat.bridge.embed

import I9.a
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.H
import kotlinx.serialization.KSerializer
import tb.g

@g(with = EmbedFailureState.Serializer::class)
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
         return EmbedFailureState.Serializer.INSTANCE;
      }
   }

   public object Serializer : IntEnumSerializer(H.b(EmbedFailureState.class), null, 2)
}
