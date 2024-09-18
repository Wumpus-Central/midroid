package com.discord.chat.bridge.row

import ch.e
import com.discord.chat.bridge.ErrorMessage
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageBase
import com.discord.crash_reporting.CrashReporting
import com.discord.primitives.MessageId
import java.util.UUID
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import wk.g
import wk.e.i

public object MessageSerializer : KSerializer {
   public open val descriptor: SerialDescriptor
      public open get() {
         return g.a("Message", i.a);
      }


   public open fun deserialize(decoder: Decoder): MessageBase {
      q.h(var1, "decoder");

      try {
         var6 = var1.C(Message.Companion.serializer()) as MessageBase;
      } catch (var4: Exception) {
         CrashReporting.captureException$default(CrashReporting.INSTANCE, var4, false, 2, null);
         val var3: UUID = UUID.randomUUID();
         val var5: StringBuilder = new StringBuilder();
         var5.append("RENDERING_ERROR_");
         var5.append(var3);
         var6 = new ErrorMessage(MessageId.constructor-impl(var5.toString()), e.b(var4), null);
      }

      return (MessageBase)var6;
   }

   public open fun serialize(encoder: Encoder, value: MessageBase) {
      q.h(var1, "encoder");
      q.h(var2, "value");
      throw new UnsupportedOperationException();
   }
}
