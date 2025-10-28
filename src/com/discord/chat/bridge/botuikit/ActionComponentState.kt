package com.discord.chat.bridge.botuikit

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import wc.m

@m(with = ActionComponentState.Serializer::class)
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
   public ActionComponentState.Companion Companion = new ActionComponentState.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<ActionComponentState> = $values();
      $VALUES = var0;
      $ENTRIES = Pa.a.a(var0);
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
         return ActionComponentState.Serializer.INSTANCE;
      }
   }

   public object Serializer : IntEnumSerializer(ActionComponentState::class, ActionComponentState.UNKNOWN)
}
