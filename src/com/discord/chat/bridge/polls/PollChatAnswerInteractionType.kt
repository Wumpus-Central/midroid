package com.discord.chat.bridge.polls

import B9.a
import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.G
import kotlinx.serialization.KSerializer
import mb.f

@f(with = PollChatAnswerInteractionType.Serializer::class)
public enum class PollChatAnswerInteractionType(serialNumber: Int) : IntEnum {
   CHECKBOXES(2),
   LIST(1),
   RADIO_BUTTONS(3)
   public open val serialNumber: Int
   @JvmStatic
   private EnumEntries $ENTRIES;
   @JvmStatic
   private PollChatAnswerInteractionType[] $VALUES;
   @JvmStatic
   public PollChatAnswerInteractionType.Companion Companion = new PollChatAnswerInteractionType.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<PollChatAnswerInteractionType> = $values();
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
      public fun serializer(): KSerializer<PollChatAnswerInteractionType> {
         return PollChatAnswerInteractionType.Serializer.INSTANCE;
      }
   }

   public object Serializer : IntEnumSerializer(G.b(PollChatAnswerInteractionType.class), PollChatAnswerInteractionType.LIST)
}
