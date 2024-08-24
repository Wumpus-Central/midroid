package com.discord.chat.bridge

import eh.l
import eh.o
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import uk.f
import wk.g
import wk.e.i

@f(with = MessageState.Serializer::class)
public enum class MessageState(key: String) {
   SendFailed("SEND_FAILED"),
   Sending("SENDING"),
   Sent("SENT"),
   Unknown("UNKNOWN")
   public final val key: String
   @JvmStatic
   private MessageState[] $VALUES = $values();
   @JvmStatic
   private Lazy<KSerializer<Object>> $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public MessageState.Companion Companion = new MessageState.Companion(null);

   init {
      this.key = var3;
   }

   public companion object {
      public fun fromValue(key: String): MessageState {
         r.h(var1, "key");
         val var5: Array<MessageState> = MessageState.values();
         val var3: Int = var5.length;
         var var2: Int = 0;

         while (true) {
            if (var2 >= var3) {
               var6 = null;
               break;
            }

            val var4: MessageState = var5[var2];
            if (r.c(var5[var2].getKey(), var1)) {
               var6 = var4;
               break;
            }

            var2++;
         }

         var var7: MessageState = var6;
         if (var6 == null) {
            var7 = MessageState.Unknown;
         }

         return var7;
      }

      public fun serializer(): KSerializer<MessageState> {
         return this.get$cachedSerializer$delegate().getValue() as KSerializer<MessageState>;
      }
   }

   public object Serializer : KSerializer<MessageState> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return g.a("MessageState", i.a);
         }


      public open fun deserialize(decoder: Decoder): MessageState {
         r.h(var1, "decoder");
         return MessageState.Companion.fromValue(var1.z());
      }

      public open fun serialize(encoder: Encoder, value: MessageState) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         throw new UnsupportedOperationException();
      }
   }
}
