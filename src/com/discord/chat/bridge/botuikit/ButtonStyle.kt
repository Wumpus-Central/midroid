package com.discord.chat.bridge.botuikit

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.H
import kotlinx.serialization.KSerializer
import tb.g

@g(with = ButtonStyle.Serializer::class)
public enum class ButtonStyle(serialNumber: Int) : IntEnum {
   DANGER(4),
   LINK(5),
   PREMIUM(6),
   PRIMARY(1),
   SECONDARY(2),
   SUCCESS(3),
   UNKNOWN(0)
   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private ButtonStyle[] $VALUES;
   @JvmStatic
   public ButtonStyle.Companion Companion = new ButtonStyle.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<ButtonStyle> = $values();
      $VALUES = var0;
      $ENTRIES = I9.a.a(var0);
   }

   init {
      this.serialNumber = var3;
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   public companion object {
      public fun serializer(): KSerializer<ButtonStyle> {
         return ButtonStyle.Serializer.INSTANCE;
      }
   }

   public object Serializer : IntEnumSerializer(H.b(ButtonStyle.class), ButtonStyle.UNKNOWN)
}
