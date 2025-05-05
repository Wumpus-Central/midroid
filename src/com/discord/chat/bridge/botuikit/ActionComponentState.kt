package com.discord.chat.bridge.botuikit

import aa.f
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import h8.l
import h8.o
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.E
import kotlinx.serialization.KSerializer
import o8.a

@f(with = ActionComponentState.Serializer::class)
public enum class ActionComponentState(serialNumber: Int) : IntEnum {
   DISABLED(2),
   LOADING(1),
   NORMAL(0),
   UNKNOWN(-1)
   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private ActionComponentState[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public ActionComponentState.Companion Companion = new ActionComponentState.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<ActionComponentState> = $values();
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
      public fun serializer(): KSerializer<ActionComponentState> {
         return this.get$cachedSerializer();
      }
   }

   public object Serializer : IntEnumSerializer(E.b(ActionComponentState.class), ActionComponentState.UNKNOWN)
}
