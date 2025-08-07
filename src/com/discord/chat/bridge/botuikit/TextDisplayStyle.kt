package com.discord.chat.bridge.botuikit

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.H
import kotlinx.serialization.KSerializer
import tb.g

@g(with = TextDisplayStyle.Serializer::class)
public enum class TextDisplayStyle(serialNumber: Int) : IntEnum {
   CONTEXT(2),
   NORMAL(1),
   UNKNOWN(0)
   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private TextDisplayStyle[] $VALUES;
   @JvmStatic
   public TextDisplayStyle.Companion Companion = new TextDisplayStyle.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<TextDisplayStyle> = $values();
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
      public fun serializer(): KSerializer<TextDisplayStyle> {
         return TextDisplayStyle.Serializer.INSTANCE;
      }
   }

   public object Serializer : IntEnumSerializer(H.b(TextDisplayStyle.class), TextDisplayStyle.UNKNOWN)
}
