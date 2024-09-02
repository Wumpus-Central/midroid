package com.discord.chat.reactevents

import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import dn.f
import dn.n
import gn.g0
import gn.o1
import gn.g0.a
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
internal data class InitiateEditData(messageId: MessageId, channelId: ChannelId) : InitiateEditData(var1, var2), ReactEvent {
   public final val channelId: ChannelId
   public final val messageId: MessageId

   fun InitiateEditData(var1: Int, var2: java.lang.String, var3: ChannelId, var4: SerializationConstructorMarker) {
      if (3 != (var1 and 3)) {
         o1.b(var1, 3, InitiateEditData.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.messageId = var2;
      this.channelId = var3.unbox-impl();
   }

   fun InitiateEditData(var1: java.lang.String, var2: Long) {
      q.h(var1, "messageId");
      super();
      this.messageId = var1;
      this.channelId = var2;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): ChannelId {
      return this.channelId;
   }

   public fun copy(messageId: MessageId = ..., channelId: ChannelId = ...): InitiateEditData {
      q.h(var1, "messageId");
      return new InitiateEditData(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is InitiateEditData) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else {
            return ChannelId.equals-impl0(this.channelId, var1.channelId);
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.messageId) * 31 + ChannelId.hashCode-impl(this.channelId);
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var2: java.lang.String = MessageId.toString-impl(this.messageId);
      val var3: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var1: StringBuilder = new StringBuilder();
      var1.append("InitiateEditData(messageId=");
      var1.append(var2);
      var1.append(", channelId=");
      var1.append(var3);
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
         val var0: InitiateEditData.$serializer = new InitiateEditData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.InitiateEditData", var0, 2);
         var1.l("messageId", false);
         var1.l("channelId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{MessageId.$serializer.INSTANCE, ChannelId.$serializer.INSTANCE};
      }

      public open fun deserialize(decoder: Decoder): InitiateEditData {
         q.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.b(var7);
         var var2: Int;
         val var6: ChannelId;
         val var10: java.lang.String;
         if (var8.p()) {
            val var9: MessageId = var8.y(var7, 0, MessageId.$serializer.INSTANCE, null) as MessageId;
            if (var9 != null) {
               var10 = var9.unbox-impl();
            } else {
               var10 = null;
            }

            val var5: ChannelId = var8.y(var7, 1, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var2 = 3;
            var6 = var5;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var var12: java.lang.String = null;
            var var11: ChannelId = null;

            while (var3) {
               val var4: Int = var8.o(var7);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var11 = var8.y(var7, 1, ChannelId.$serializer.INSTANCE, var11) as ChannelId;
                     var2 |= 2;
                  } else {
                     val var13: MessageId;
                     if (var12 != null) {
                        var13 = MessageId.box-impl(var12);
                     } else {
                        var13 = null;
                     }

                     val var14: MessageId = var8.y(var7, 0, MessageId.$serializer.INSTANCE, var13) as MessageId;
                     if (var14 != null) {
                        var12 = var14.unbox-impl();
                     } else {
                        var12 = null;
                     }

                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var6 = var11;
            var10 = var12;
         }

         var8.c(var7);
         return new InitiateEditData(var2, var10, var6, null, null);
      }

      public open fun serialize(encoder: Encoder, value: InitiateEditData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         InitiateEditData.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<InitiateEditData> {
         return InitiateEditData.$serializer.INSTANCE;
      }
   }
}
