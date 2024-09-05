package com.discord.chat.bridge.contentnode

import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import nn.f
import nn.n
import on.a
import qn.b2
import qn.g0
import qn.o1

@f
public data class HandleDeleteMessage(id: MessageId, channelId: ChannelId, loggingName: String? = ..., author: HandleDeleteMessageAuthor) : HandleDeleteMessage(
      var1, var2, var4, var5
   ) {
   public final val author: HandleDeleteMessageAuthor
   public final val channelId: ChannelId
   public final val id: MessageId
   public final val loggingName: String?

   fun HandleDeleteMessage(
      var1: Int, var2: java.lang.String, var3: ChannelId, var4: java.lang.String, var5: HandleDeleteMessageAuthor, var6: SerializationConstructorMarker
   ) {
      if (11 != (var1 and 11)) {
         o1.b(var1, 11, HandleDeleteMessage.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.id = var2;
      this.channelId = var3.unbox-impl();
      if ((var1 and 4) == 0) {
         this.loggingName = null;
      } else {
         this.loggingName = var4;
      }

      this.author = var5;
   }

   fun HandleDeleteMessage(var1: java.lang.String, var2: Long, var4: java.lang.String, var5: HandleDeleteMessageAuthor) {
      q.h(var1, "id");
      q.h(var5, "author");
      super();
      this.id = var1;
      this.channelId = var2;
      this.loggingName = var4;
      this.author = var5;
   }

   public operator fun component1(): MessageId {
      return this.id;
   }

   public operator fun component2(): ChannelId {
      return this.channelId;
   }

   public operator fun component3(): String? {
      return this.loggingName;
   }

   public operator fun component4(): HandleDeleteMessageAuthor {
      return this.author;
   }

   public fun copy(id: MessageId = ..., channelId: ChannelId = ..., loggingName: String? = ..., author: HandleDeleteMessageAuthor = ...): HandleDeleteMessage {
      q.h(var1, "id");
      q.h(var5, "author");
      return new HandleDeleteMessage(var1, var2, var4, var5, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is HandleDeleteMessage) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.id, var1.id)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.loggingName, var1.loggingName)) {
            return false;
         } else {
            return q.c(this.author, var1.author);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = MessageId.hashCode-impl(this.id);
      val var3: Int = ChannelId.hashCode-impl(this.channelId);
      val var1: Int;
      if (this.loggingName == null) {
         var1 = 0;
      } else {
         var1 = this.loggingName.hashCode();
      }

      return ((var2 * 31 + var3) * 31 + var1) * 31 + this.author.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = MessageId.toString-impl(this.id);
      val var4: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var3: java.lang.String = this.loggingName;
      val var5: HandleDeleteMessageAuthor = this.author;
      val var1: StringBuilder = new StringBuilder();
      var1.append("HandleDeleteMessage(id=");
      var1.append(var2);
      var1.append(", channelId=");
      var1.append(var4);
      var1.append(", loggingName=");
      var1.append(var3);
      var1.append(", author=");
      var1.append(var5);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: HandleDeleteMessage.$serializer = new HandleDeleteMessage.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.HandleDeleteMessage", var0, 4);
         var1.c("id", false);
         var1.c("channel_id", false);
         var1.c("loggingName", true);
         var1.c("author", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{MessageId.$serializer.INSTANCE, ChannelId.$serializer.INSTANCE, a.u(b2.a), HandleDeleteMessageAuthor.$serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): HandleDeleteMessage {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.b(var9);
         var var2: Int;
         var var6: Any;
         val var13: HandleDeleteMessageAuthor;
         var var15: Any;
         var var17: java.lang.String;
         if (var10.p()) {
            val var11: MessageId = var10.y(var9, 0, MessageId.$serializer.INSTANCE, null) as MessageId;
            val var12: java.lang.String;
            if (var11 != null) {
               var12 = var11.unbox-impl();
            } else {
               var12 = null;
            }

            var6 = var10.y(var9, 1, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            val var8: java.lang.String = var10.n(var9, 2, b2.a, null) as java.lang.String;
            var13 = var10.y(var9, 3, HandleDeleteMessageAuthor.$serializer.INSTANCE, null) as HandleDeleteMessageAuthor;
            var2 = 15;
            var17 = var12;
            var15 = var8;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var17 = null;
            var6 = null;
            var15 = null;
            var var14: Any = null;

            while (var3) {
               val var4: Int = var10.o(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var6 = var10.y(var9, 3, HandleDeleteMessageAuthor.$serializer.INSTANCE, var6) as HandleDeleteMessageAuthor;
                           var2 |= 8;
                        } else {
                           var15 = var10.n(var9, 2, b2.a, var15) as java.lang.String;
                           var2 |= 4;
                        }
                     } else {
                        var14 = var10.y(var9, 1, ChannelId.$serializer.INSTANCE, var14) as ChannelId;
                        var2 |= 2;
                     }
                  } else {
                     val var18: MessageId;
                     if (var17 != null) {
                        var18 = MessageId.box-impl(var17);
                     } else {
                        var18 = null;
                     }

                     val var19: MessageId = var10.y(var9, 0, MessageId.$serializer.INSTANCE, var18) as MessageId;
                     if (var19 != null) {
                        var17 = var19.unbox-impl();
                     } else {
                        var17 = null;
                     }

                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var13 = (HandleDeleteMessageAuthor)var6;
            var6 = var14;
         }

         var10.c(var9);
         return new HandleDeleteMessage(var2, var17, (ChannelId)var6, (java.lang.String)var15, var13, null, null);
      }

      public open fun serialize(encoder: Encoder, value: HandleDeleteMessage) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         HandleDeleteMessage.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<HandleDeleteMessage> {
         return HandleDeleteMessage.$serializer.INSTANCE;
      }
   }
}
