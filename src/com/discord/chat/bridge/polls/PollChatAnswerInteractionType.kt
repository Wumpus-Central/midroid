package com.discord.chat.bridge.polls

import com.discord.serialization.IntEnum
import com.discord.serialization.IntEnumSerializer
import eh.l
import eh.o
import kotlin.jvm.internal.h0
import kotlinx.serialization.KSerializer
import uk.f

@f(with = PollChatAnswerInteractionType.Serializer::class)
public enum class PollChatAnswerInteractionType(serialNumber: Int) : IntEnum {
   CHECKBOXES(2),
   LIST(1),
   RADIO_BUTTONS(3)
   public open val serialNumber: Int
   @JvmStatic
   private PollChatAnswerInteractionType[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public PollChatAnswerInteractionType.Companion Companion = new PollChatAnswerInteractionType.Companion(null);

   init {
      this.serialNumber = var3;
   }

   public companion object {
      public fun serializer(): KSerializer<PollChatAnswerInteractionType> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<PollChatAnswerInteractionType>;
      }
   }

   public object Serializer : IntEnumSerializer(h0.b(PollChatAnswerInteractionType.class), PollChatAnswerInteractionType.LIST)
}
