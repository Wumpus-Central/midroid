package com.discord.chat.bridge.botuikit

import cl.f
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import kh.l
import kh.o
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.g0
import kotlinx.serialization.KSerializer
import rh.a

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
   private EnumEntries $ENTRIES;
   @JvmStatic
   private ButtonStyle[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public ButtonStyle.Companion Companion = new ButtonStyle.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<ButtonStyle> = $values();
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
      public fun serializer(): KSerializer<ButtonStyle> {
         return this.get$cachedSerializer();
      }
   }

   public object Serializer : IntEnumSerializer(g0.b(ButtonStyle.class), ButtonStyle.UNKNOWN)
}
