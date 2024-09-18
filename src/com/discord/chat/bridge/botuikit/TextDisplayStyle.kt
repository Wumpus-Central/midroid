package com.discord.chat.bridge.botuikit

import ch.l
import ch.o
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import jh.a
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.g0
import kotlinx.serialization.KSerializer
import uk.f

@f(with = TextDisplayStyle.Serializer::class)
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
   private Lazy $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public TextDisplayStyle.Companion Companion = new TextDisplayStyle.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<TextDisplayStyle> = $values();
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
      public fun serializer(): KSerializer<TextDisplayStyle> {
         return this.get$cachedSerializer();
      }
   }

   public object Serializer : IntEnumSerializer(g0.b(TextDisplayStyle.class), TextDisplayStyle.UNKNOWN)
}
