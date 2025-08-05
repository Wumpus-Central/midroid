package com.discord.chat.bridge.interaction

import I9.a
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.H
import kotlinx.serialization.KSerializer
import tb.g

@g(with = InteractionStatusViewState.Serializer::class)
public enum class InteractionStatusViewState(serialNumber: Int) : IntEnum {
   FAILED(1),
   LOADING(0),
   UNKNOWN(-1)
   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private InteractionStatusViewState[] $VALUES;
   @JvmStatic
   public InteractionStatusViewState.Companion Companion = new InteractionStatusViewState.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<InteractionStatusViewState> = $values();
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
      public fun serializer(): KSerializer<InteractionStatusViewState> {
         return InteractionStatusViewState.Serializer.INSTANCE;
      }
   }

   public object Serializer : IntEnumSerializer(H.b(InteractionStatusViewState.class), InteractionStatusViewState.UNKNOWN)
}
