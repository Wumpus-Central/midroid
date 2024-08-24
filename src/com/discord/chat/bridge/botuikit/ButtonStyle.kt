package com.discord.chat.bridge.botuikit

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import eh.l
import eh.o
import kotlin.jvm.internal.h0
import kotlinx.serialization.KSerializer
import uk.f

@f(with = ButtonStyle.Serializer::class)
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
   private ButtonStyle[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public ButtonStyle.Companion Companion = new ButtonStyle.Companion(null);

   init {
      this.serialNumber = var3;
   }

   public companion object {
      public fun serializer(): KSerializer<ButtonStyle> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<ButtonStyle>;
      }
   }

   public object Serializer : IntEnumSerializer(h0.b(ButtonStyle.class), ButtonStyle.UNKNOWN)
}
