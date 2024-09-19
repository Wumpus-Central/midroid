package com.discord.chat.bridge.interaction

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import fh.l
import fh.o
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.g0
import kotlinx.serialization.KSerializer
import mh.a
import xk.f

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

   public object Serializer : IntEnumSerializer(g0.b(InteractionStatusViewState.class), InteractionStatusViewState.UNKNOWN)
}
