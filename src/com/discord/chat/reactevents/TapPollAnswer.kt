package com.discord.chat.reactevents

import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import nn.f
import nn.n
import qn.b2
import qn.g0
import qn.g0.a

@f
public data class TapPollAnswer(channelId: String, messageId: String, answerId: String) : ReactEvent {
   public final val answerId: String
   public final val channelId: String
   public final val messageId: String

   init {
      q.h(var1, "channelId");
      q.h(var2, "messageId");
      q.h(var3, "answerId");
      super();
      this.channelId = var1;
      this.messageId = var2;
      this.answerId = var3;
   }

   public operator fun component1(): String {
      return this.channelId;
   }

   public operator fun component2(): String {
      return this.messageId;
   }

   public operator fun component3(): String {
      return this.answerId;
   }

   public fun copy(channelId: String = var0.channelId, messageId: String = var0.messageId, answerId: String = var0.answerId): TapPollAnswer {
      q.h(var1, "channelId");
      q.h(var2, "messageId");
      q.h(var3, "answerId");
      return new TapPollAnswer(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapPollAnswer) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.messageId, var1.messageId)) {
            return false;
         } else {
            return q.c(this.answerId, var1.answerId);
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.channelId.hashCode() * 31 + this.messageId.hashCode()) * 31 + this.answerId.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = this.channelId;
      val var2: java.lang.String = this.messageId;
      val var1: java.lang.String = this.answerId;
      val var4: StringBuilder = new StringBuilder();
      var4.append("TapPollAnswer(channelId=");
      var4.append(var3);
      var4.append(", messageId=");
      var4.append(var2);
      var4.append(", answerId=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapPollAnswer.$serializer = new TapPollAnswer.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapPollAnswer", var0, 3);
         var1.c("channelId", false);
         var1.c("messageId", false);
         var1.c("answerId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{b2.a, b2.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): TapPollAnswer {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var2: Int;
         var var5: java.lang.String;
         val var7: java.lang.String;
         val var10: java.lang.String;
         if (var9.p()) {
            var5 = var9.m(var8, 0);
            var7 = var9.m(var8, 1);
            var10 = var9.m(var8, 2);
            var2 = 7;
         } else {
            var var6: java.lang.String = null;
            var5 = null;
            var var11: java.lang.String = null;
            var var3: Boolean = true;
            var2 = 0;

            while (var3) {
               val var4: Int = var9.o(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var5 = var9.m(var8, 2);
                        var2 |= 4;
                     } else {
                        var11 = var9.m(var8, 1);
                        var2 |= 2;
                     }
                  } else {
                     var6 = var9.m(var8, 0);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var7 = var11;
            var10 = var5;
            var5 = var6;
         }

         var9.c(var8);
         return new TapPollAnswer(var2, var5, var7, var10, null);
      }

      public open fun serialize(encoder: Encoder, value: TapPollAnswer) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapPollAnswer.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapPollAnswer> {
         return TapPollAnswer.$serializer.INSTANCE;
      }
   }
}
