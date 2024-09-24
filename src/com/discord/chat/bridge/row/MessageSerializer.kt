package com.discord.chat.bridge.row

import com.discord.chat.bridge.ErrorMessage
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageBase
import com.discord.crash_reporting.CrashReporting
import com.discord.primitives.MessageId
import el.g
import el.e.i
import java.util.UUID
import kh.e
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

public object MessageSerializer : KSerializer {
   public open val descriptor: SerialDescriptor
      public open get() {
         return g.a("Message", i.a);
      }


   public open fun deserialize(decoder: Decoder): MessageBase {
      q.h(var1, "decoder");

      try {
         var5 = var1.C(Message.Companion.serializer()) as MessageBase;
      } catch (var4: Exception) {
         CrashReporting.captureException$default(CrashReporting.INSTANCE, var4, false, 2, null);
         val var2: UUID = UUID.randomUUID();
         val var3: StringBuilder = new StringBuilder();
         var3.append("RENDERING_ERROR_");
         var3.append(var2);
         var5 = new ErrorMessage(MessageId.constructor-impl(var3.toString()), e.b(var4), null);
      }

      return (MessageBase)var5;
   }

   public open fun serialize(encoder: Encoder, value: MessageBase) {
      q.h(var1, "encoder");
      q.h(var2, "value");
      throw new UnsupportedOperationException();
   }
}
