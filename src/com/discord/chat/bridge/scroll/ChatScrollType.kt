package com.discord.chat.bridge.scroll

import Pa.a
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import kotlin.enums.EnumEntries
import kotlinx.serialization.KSerializer
import wc.m

@m(with = ChatScrollType.Serializer::class)
public enum class ChatScrollType(serialNumber: Int) : IntEnum {
   FOCUS_ONLY(1),
   SCROLL(0)
   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private ChatScrollType[] $VALUES;
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
         return ChatScrollType.Serializer.INSTANCE;
      }
   }

   public object Serializer : IntEnumSerializer(ChatScrollType::class, null, 2)
}
