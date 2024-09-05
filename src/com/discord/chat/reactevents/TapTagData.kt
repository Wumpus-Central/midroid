package com.discord.chat.reactevents

import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
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
import kotlinx.serialization.internal.SerializationConstructorMarker
import nn.f
import nn.n
import on.a
import qn.b2
import qn.g0
import qn.o1

@f
public data class TapTagData(messageId: MessageId, channelId: ChannelId, tagType: String?) : TapTagData(var1, var2, var4), ReactEvent {
   public final val channelId: ChannelId
   public final val messageId: MessageId
   public final val tagType: String?

   fun TapTagData(var1: Int, var2: java.lang.String, var3: ChannelId, var4: java.lang.String, var5: SerializationConstructorMarker) {
      if (7 != (var1 and 7)) {
         o1.b(var1, 7, TapTagData.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.messageId = var2;
      this.channelId = var3.unbox-impl();
      this.tagType = var4;
   }

   fun TapTagData(var1: java.lang.String, var2: Long, var4: java.lang.String) {
      q.h(var1, "messageId");
      super();
      this.messageId = var1;
      this.channelId = var2;
      this.tagType = var4;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): ChannelId {
      return this.channelId;
   }

   public operator fun component3(): String? {
      return this.tagType;
   }

   public fun copy(messageId: MessageId = ..., channelId: ChannelId = ..., tagType: String? = ...): TapTagData {
      q.h(var1, "messageId");
      return new TapTagData(var1, var2, var4, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is TapTagData) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else {
            return q.c(this.tagType, var1.tagType);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = MessageId.hashCode-impl(this.messageId);
      val var2: Int = ChannelId.hashCode-impl(this.channelId);
      val var1: Int;
      if (this.tagType == null) {
         var1 = 0;
      } else {
         var1 = this.tagType.hashCode();
      }

      return (var3 * 31 + var2) * 31 + var1;
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.messageId);
      val var4: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var3: java.lang.String = this.tagType;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapTagData(messageId=");
      var2.append(var1);
      var2.append(", channelId=");
      var2.append(var4);
      var2.append(", tagType=");
      var2.append(var3);
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
         val var0: TapTagData.$serializer = new TapTagData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapTagData", var0, 3);
         var1.c("messageId", false);
         var1.c("channelId", false);
         var1.c("tagType", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{com.discord.primitives.MessageId..serializer.INSTANCE, com.discord.primitives.ChannelId..serializer.INSTANCE, a.u(b2.a)};
      }

      public open fun deserialize(decoder: Decoder): TapTagData {
         q.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var2: Int;
         val var12: java.lang.String;
         var var14: Any;
         var var16: java.lang.String;
         if (var9.p()) {
            val var10: MessageId = var9.y(var8, 0, com.discord.primitives.MessageId..serializer.INSTANCE, null) as MessageId;
            val var11: java.lang.String;
            if (var10 != null) {
               var11 = var10.unbox-impl();
            } else {
               var11 = null;
            }

            val var7: ChannelId = var9.y(var8, 1, com.discord.primitives.ChannelId..serializer.INSTANCE, null) as ChannelId;
            var12 = var9.n(var8, 2, b2.a, null) as java.lang.String;
            var2 = 7;
            var16 = var11;
            var14 = var7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var16 = null;
            var14 = null;
            var var13: Any = null;

            while (var3) {
               val var4: Int = var9.o(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var14 = var9.n(var8, 2, b2.a, var14) as java.lang.String;
                        var2 |= 4;
                     } else {
                        var13 = var9.y(var8, 1, com.discord.primitives.ChannelId..serializer.INSTANCE, var13) as ChannelId;
                        var2 |= 2;
                     }
                  } else {
                     val var17: MessageId;
                     if (var16 != null) {
                        var17 = MessageId.box-impl(var16);
                     } else {
                        var17 = null;
                     }

                     val var18: MessageId = var9.y(var8, 0, com.discord.primitives.MessageId..serializer.INSTANCE, var17) as MessageId;
                     if (var18 != null) {
                        var16 = var18.unbox-impl();
                     } else {
                        var16 = null;
                     }

                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var12 = (java.lang.String)var14;
            var14 = var13;
         }

         var9.c(var8);
         return new TapTagData(var2, var16, (ChannelId)var14, var12, null, null);
      }

      public open fun serialize(encoder: Encoder, value: TapTagData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapTagData.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return qn.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapTagData> {
         return TapTagData.$serializer.INSTANCE;
      }
   }
}
