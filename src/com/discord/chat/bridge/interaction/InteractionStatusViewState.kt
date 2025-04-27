package com.discord.chat.bridge.interaction

import Y9.f
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import f8.l
import f8.o
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.E
import kotlinx.serialization.KSerializer
import m8.a

@f(with = InteractionStatusViewState.Serializer::class)
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
   private Lazy $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
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
         return this.get$cachedSerializer();
      }
   }

   public object Serializer : IntEnumSerializer(E.b(InteractionStatusViewState.class), InteractionStatusViewState.UNKNOWN)
}
