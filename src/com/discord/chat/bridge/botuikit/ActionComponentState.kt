package com.discord.chat.bridge.botuikit

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import eh.l
import eh.o
import kotlin.jvm.internal.h0
import kotlinx.serialization.KSerializer
import uk.f

@f(with = ActionComponentState.Serializer::class)
public enum class ActionComponentState(serialNumber: Int) : IntEnum {
   DISABLED(2),
   LOADING(1),
   NORMAL(0),
   UNKNOWN(-1)
   public open val serialNumber: Int
   @JvmStatic
   private ActionComponentState[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public ActionComponentState.Companion Companion = new ActionComponentState.Companion(null);

   init {
      this.serialNumber = var3;
   }

   public companion object {
      public fun serializer(): KSerializer<ActionComponentState> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<ActionComponentState>;
      }
   }

   public object Serializer : IntEnumSerializer(h0.b(ActionComponentState.class), ActionComponentState.UNKNOWN)
}
