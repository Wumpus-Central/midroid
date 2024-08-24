package com.discord.chat.bridge.interaction

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import eh.l
import eh.o
import kotlin.jvm.internal.h0
import kotlinx.serialization.KSerializer
import uk.f

@f(with = InteractionStatusViewState.Serializer::class)
public enum class InteractionStatusViewState(serialNumber: Int) : IntEnum {
   FAILED(1),
   LOADING(0),
   UNKNOWN(-1)
   public open val serialNumber: Int
   @JvmStatic
   private InteractionStatusViewState[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public InteractionStatusViewState.Companion Companion = new InteractionStatusViewState.Companion(null);

   init {
      this.serialNumber = var3;
   }

   public companion object {
      public fun serializer(): KSerializer<InteractionStatusViewState> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<InteractionStatusViewState>;
      }
   }

   public object Serializer : IntEnumSerializer(h0.b(InteractionStatusViewState.class), InteractionStatusViewState.UNKNOWN)
}
