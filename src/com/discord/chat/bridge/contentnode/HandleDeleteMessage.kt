package com.discord.chat.bridge.contentnode

import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import fl.f
import fl.n
import gl.a
import il.b2
import il.g0
import il.o1
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker

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
      val var3: Int = MessageId.hashCode-impl(this.id);
      val var2: Int = ChannelId.hashCode-impl(this.channelId);
      val var1: Int;
      if (this.loggingName == null) {
         var1 = 0;
      } else {
         var1 = this.loggingName.hashCode();
      }

      return ((var3 * 31 + var2) * 31 + var1) * 31 + this.author.hashCode();
   }

   public override fun toString(): String {
      val var3: java.lang.String = MessageId.toString-impl(this.id);
      val var5: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var2: java.lang.String = this.loggingName;
      val var1: HandleDeleteMessageAuthor = this.author;
      val var4: StringBuilder = new StringBuilder();
      var4.append("HandleDeleteMessage(id=");
      var4.append(var3);
      var4.append(", channelId=");
      var4.append(var5);
      var4.append(", loggingName=");
      var4.append(var2);
      var4.append(", author=");
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
         val var0: HandleDeleteMessage.$serializer = new HandleDeleteMessage.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.bridge.contentnode.HandleDeleteMessage", var0, 4);
         var1.l("id", false);
         var1.l("channel_id", false);
         var1.l("loggingName", true);
         var1.l("author", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{MessageId.$serializer.INSTANCE, ChannelId.$serializer.INSTANCE, a.u(b2.a), HandleDeleteMessageAuthor.$serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): HandleDeleteMessage {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.c(var9);
         var var2: Int;
         var var6: Any;
         val var13: HandleDeleteMessageAuthor;
         var var15: Any;
         var var18: java.lang.String;
         if (var10.y()) {
            val var11: MessageId = var10.m(var9, 0, MessageId.$serializer.INSTANCE, null) as MessageId;
            val var12: java.lang.String;
            if (var11 != null) {
               var12 = var11.unbox-impl();
            } else {
               var12 = null;
            }

            val var8: ChannelId = var10.m(var9, 1, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var6 = var10.v(var9, 2, b2.a, null) as java.lang.String;
            var13 = var10.m(var9, 3, HandleDeleteMessageAuthor.$serializer.INSTANCE, null) as HandleDeleteMessageAuthor;
            var2 = 15;
            var18 = var12;
            var15 = var8;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var18 = null;
            var6 = null;
            var15 = null;
            var var14: Any = null;

            while (var3) {
               val var4: Int = var10.x(var9);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           if (var4 != 3) {
                              throw new n(var4);
                           }

                           var6 = var10.m(var9, 3, HandleDeleteMessageAuthor.$serializer.INSTANCE, var6) as HandleDeleteMessageAuthor;
                           var2 |= 8;
                        } else {
                           var15 = var10.v(var9, 2, b2.a, var15) as java.lang.String;
                           var2 |= 4;
                        }
                     } else {
                        var14 = var10.m(var9, 1, ChannelId.$serializer.INSTANCE, var14) as ChannelId;
                        var2 |= 2;
                     }
                  } else {
                     val var19: MessageId;
                     if (var18 != null) {
                        var19 = MessageId.box-impl(var18);
                     } else {
                        var19 = null;
                     }

                     val var20: MessageId = var10.m(var9, 0, MessageId.$serializer.INSTANCE, var19) as MessageId;
                     if (var20 != null) {
                        var18 = var20.unbox-impl();
                     } else {
                        var18 = null;
                     }

                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var6 = var15;
            var15 = var14;
            var13 = (HandleDeleteMessageAuthor)var6;
         }

         var10.b(var9);
         return new HandleDeleteMessage(var2, var18, (ChannelId)var15, (java.lang.String)var6, var13, null, null);
      }

      public open fun serialize(encoder: Encoder, value: HandleDeleteMessage) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         HandleDeleteMessage.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return il.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<HandleDeleteMessage> {
         return HandleDeleteMessage.$serializer.INSTANCE;
      }
   }
}
