package com.discord.chat.bridge.row

import com.discord.chat.bridge.ErrorMessage
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageBase
import com.discord.crash_reporting.CrashReporting
import com.discord.primitives.MessageId
import eh.e
import java.util.UUID
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import wk.g
import wk.e.i

public object MessageSerializer : KSerializer<MessageBase> {
   public open val descriptor: SerialDescriptor
      public open get() {
         return g.a("Message", i.a);
      }


   public open fun deserialize(decoder: Decoder): MessageBase {
      r.h(var1, "decoder");

      try {
         var5 = var1.G(Message.Companion.serializer()) as MessageBase;
      } catch (var4: Exception) {
         CrashReporting.captureException$default(CrashReporting.INSTANCE, var4, false, 2, null);
         val var3: UUID = UUID.randomUUID();
         val var2: StringBuilder = new StringBuilder();
         var2.append("RENDERING_ERROR_");
         var2.append(var3);
         var5 = new ErrorMessage(MessageId.constructor-impl(var2.toString()), e.b(var4), null);
      }

      return (MessageBase)var5;
   }

   public open fun serialize(encoder: Encoder, value: MessageBase) {
      r.h(var1, "encoder");
      r.h(var2, "value");
      throw new UnsupportedOperationException();
   }
}
