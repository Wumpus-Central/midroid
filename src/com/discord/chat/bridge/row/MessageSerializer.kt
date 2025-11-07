package com.discord.chat.bridge.row

import com.discord.chat.bridge.ErrorMessage
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageBase
import com.discord.crash_reporting.CrashReporting
import com.discord.primitives.MessageId
import ht.e
import java.util.UUID
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import zu.j
import zu.e.i

public object MessageSerializer : KSerializer {
   public open val descriptor: SerialDescriptor
      public open get() {
         return j.b("Message", i.a);
      }


   public open fun deserialize(decoder: Decoder): MessageBase {
      try {
         return var1.G(Message.Companion.serializer()) as MessageBase;
      } catch (var4: Exception) {
         CrashReporting.captureException$default(CrashReporting.INSTANCE, var4, false, 2, null);
         val var2: UUID = UUID.randomUUID();
         val var5: StringBuilder = new StringBuilder();
         var5.append("RENDERING_ERROR_");
         var5.append(var2);
         return new ErrorMessage(MessageId.constructor-impl(var5.toString()), e.b(var4), null);
      }
   }

   public open fun serialize(encoder: Encoder, value: MessageBase) {
      throw new UnsupportedOperationException();
   }
}
