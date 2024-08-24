package com.discord.chat.bridge.botuikit

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import eh.l
import eh.o
import kotlin.jvm.internal.h0
import kotlinx.serialization.KSerializer
import uk.f

@f(with = TextDisplayStyle.Serializer::class)
public enum class TextDisplayStyle(serialNumber: Int) : IntEnum {
   CONTEXT(2),
   NORMAL(1),
   UNKNOWN(0)
   public open val serialNumber: Int
   @JvmStatic
   private TextDisplayStyle[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public TextDisplayStyle.Companion Companion = new TextDisplayStyle.Companion(null);

   init {
      this.serialNumber = var3;
   }

   public companion object {
      public fun serializer(): KSerializer<TextDisplayStyle> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<TextDisplayStyle>;
      }
   }

   public object Serializer : IntEnumSerializer(h0.b(TextDisplayStyle.class), TextDisplayStyle.UNKNOWN)
}
