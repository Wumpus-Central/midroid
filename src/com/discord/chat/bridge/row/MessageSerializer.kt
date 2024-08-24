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
         var6 = var1.G(Message.Companion.serializer()) as MessageBase;
      } catch (var4: Exception) {
         CrashReporting.captureException$default(CrashReporting.INSTANCE, var4, false, 2, null);
         val var5: UUID = UUID.randomUUID();
         val var3: StringBuilder = new StringBuilder();
         var3.append("RENDERING_ERROR_");
         var3.append(var5);
         var6 = new ErrorMessage(MessageId.constructor-impl(var3.toString()), e.b(var4), null);
      }

      return (MessageBase)var6;
   }

   public open fun serialize(encoder: Encoder, value: MessageBase) {
      r.h(var1, "encoder");
      r.h(var2, "value");
      throw new UnsupportedOperationException();
   }
}
