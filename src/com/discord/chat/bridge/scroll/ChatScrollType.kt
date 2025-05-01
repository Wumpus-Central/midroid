package com.discord.chat.bridge.scroll

import aa.f
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import h8.l
import h8.o
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.E
import kotlinx.serialization.KSerializer
import o8.a

@f(with = ChatScrollType.Serializer::class)
public enum class ChatScrollType(serialNumber: Int) : IntEnum {
   FOCUS_ONLY(1),
   SCROLL(0)
   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private ChatScrollType[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public ChatScrollType.Companion Companion = new ChatScrollType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<ChatScrollType> = $values();
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
      public fun serializer(): KSerializer<ChatScrollType> {
         return this.get$cachedSerializer();
      }
   }

   public object Serializer : IntEnumSerializer(E.b(ChatScrollType.class), null, 2)
}
