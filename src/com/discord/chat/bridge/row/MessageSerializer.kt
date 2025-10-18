package com.discord.chat.bridge.row

import Da.e
import com.discord.chat.bridge.ErrorMessage
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageBase
import com.discord.crash_reporting.CrashReporting
import com.discord.primitives.MessageId
import java.util.UUID
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import sc.j
import sc.e.i

public object MessageSerializer : KSerializer {
   public open val descriptor: SerialDescriptor
      public open get() {
         return j.b("Message", i.a);
      }


   public open fun deserialize(decoder: Decoder): MessageBase {
      try {
         var6 = var1.G(Message.Companion.serializer()) as MessageBase;
      } catch (var4: Exception) {
         CrashReporting.captureException$default(CrashReporting.INSTANCE, var4, false, 2, null);
         val var5: UUID = UUID.randomUUID();
         val var2: StringBuilder = new StringBuilder();
         var2.append("RENDERING_ERROR_");
         var2.append(var5);
         var6 = new ErrorMessage(MessageId.constructor-impl(var2.toString()), e.b(var4), null);
      }

      return (MessageBase)var6;
   }

   public open fun serialize(encoder: Encoder, value: MessageBase) {
      throw new UnsupportedOperationException();
   }
}
