package com.discord.chat.bridge.threads

import al.g0
import al.g0.a
import com.discord.chat.bridge.Message
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import xk.f
import xk.n

@f
public data class ThreadEmbedMessage(message: Message) {
   public final val message: Message

   init {
      q.h(var1, "message");
      super();
      this.message = var1;
   }

   public operator fun component1(): Message {
      return this.message;
   }

   public fun copy(message: Message = var0.message): ThreadEmbedMessage {
      q.h(var1, "message");
      return new ThreadEmbedMessage(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ThreadEmbedMessage) {
         return false;
      } else {
         return q.c(this.message, (var1 as ThreadEmbedMessage).message);
      }
   }

   public override fun hashCode(): Int {
      return this.message.hashCode();
   }

   public override fun toString(): String {
      val var1: Message = this.message;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ThreadEmbedMessage(message=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: ThreadEmbedMessage.$serializer = new ThreadEmbedMessage.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.threads.ThreadEmbedMessage", var0, 1);
         var1.l("message", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{Message.$serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): ThreadEmbedMessage {
         q.h(var1, "decoder");
         val var6: SerialDescriptor = this.getDescriptor();
         val var7: c = var1.c(var6);
         val var5: Boolean = var7.y();
         var var2: Int = 1;
         var var3: Boolean = true;
         var var8: Message;
         if (var5) {
            var8 = var7.m(var6, 0, Message.$serializer.INSTANCE, null) as Message;
         } else {
            var2 = 0;
            var8 = null;

            while (var3) {
               val var4: Int = var7.x(var6);
               if (var4 != -1) {
                  if (var4 != 0) {
                     throw new n(var4);
                  }

                  var8 = var7.m(var6, 0, Message.$serializer.INSTANCE, var8) as Message;
                  var2 |= 1;
               } else {
                  var3 = false;
               }
            }
         }

         var7.b(var6);
         return new ThreadEmbedMessage(var2, var8, null);
      }

      public open fun serialize(encoder: Encoder, value: ThreadEmbedMessage) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         ThreadEmbedMessage.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<ThreadEmbedMessage> {
         return ThreadEmbedMessage.$serializer.INSTANCE;
      }
   }
}
