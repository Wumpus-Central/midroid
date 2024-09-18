package com.discord.chat.bridge

import ch.l
import ch.o
import jh.a
import kotlin.enums.EnumEntries
import kotlin.jvm.internal.q
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
   private EnumEntries $ENTRIES;
   @JvmStatic
   private MessageState[] $VALUES;
   @JvmStatic
   private Lazy $cachedSerializer$delegate = l.a(o.k, <unrepresentable>.INSTANCE);
   @JvmStatic
   public MessageState.Companion Companion = new MessageState.Companion(null);

   @JvmStatic
   fun {
      val var0: Array<MessageState> = $values();
      $VALUES = var0;
      $ENTRIES = a.a(var0);
   }

   init {
      this.key = var3;
   }

   @JvmStatic
   fun getEntries(): EnumEntries {
      return $ENTRIES;
   }

   public companion object {
      public fun fromValue(key: String): MessageState {
         q.h(var1, "key");
         val var5: Array<MessageState> = MessageState.values();
         val var3: Int = var5.length;
         var var2: Int = 0;

         while (true) {
            if (var2 >= var3) {
               var6 = null;
               break;
            }

            val var4: MessageState = var5[var2];
            if (q.c(var5[var2].getKey(), var1)) {
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
         return this.get$cachedSerializer();
      }
   }

   public object Serializer : KSerializer {
      public open val descriptor: SerialDescriptor
         public open get() {
            return g.a("MessageState", i.a);
         }


      public open fun deserialize(decoder: Decoder): MessageState {
         q.h(var1, "decoder");
         return MessageState.Companion.fromValue(var1.n());
      }

      public open fun serialize(encoder: Encoder, value: MessageState) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         throw new UnsupportedOperationException();
      }
   }
}
