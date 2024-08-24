package com.discord.chat.reactevents

import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.CompositeEncoder
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.encoding.c
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor
import kotlinx.serialization.internal.SerializationConstructorMarker
import uk.f
import uk.n
import vk.a
import xk.a2
import xk.f0
import xk.n1

@f
public data class TapTagData(messageId: MessageId, channelId: ChannelId, tagType: String?) : TapTagData(var1, var2, var4), ReactEvent {
   public final val channelId: ChannelId
   public final val messageId: MessageId
   public final val tagType: String?

   fun TapTagData(var1: Int, var2: java.lang.String, var3: ChannelId, var4: java.lang.String, var5: SerializationConstructorMarker) {
      if (7 != (var1 and 7)) {
         n1.b(var1, 7, TapTagData.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.messageId = var2;
      this.channelId = var3.unbox-impl();
      this.tagType = var4;
   }

   fun TapTagData(var1: java.lang.String, var2: Long, var4: java.lang.String) {
      super();
      this.messageId = var1;
      this.channelId = var2;
      this.tagType = var4;
   }

   @JvmStatic
   public fun `write$Self`(self: TapTagData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, com.discord.primitives.MessageId..serializer.INSTANCE, MessageId.box-impl(var0.messageId));
      var1.y(var2, 1, com.discord.primitives.ChannelId..serializer.INSTANCE, ChannelId.box-impl(var0.channelId));
      var1.m(var2, 2, a2.a, var0.tagType);
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
      r.h(var1, "messageId");
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
            return r.c(this.tagType, var1.tagType);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = MessageId.hashCode-impl(this.messageId);
      val var3: Int = ChannelId.hashCode-impl(this.channelId);
      val var1: Int;
      if (this.tagType == null) {
         var1 = 0;
      } else {
         var1 = this.tagType.hashCode();
      }

      return (var2 * 31 + var3) * 31 + var1;
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = MessageId.toString-impl(this.messageId);
      val var4: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var1: java.lang.String = this.tagType;
      val var2: StringBuilder = new StringBuilder();
      var2.append("TapTagData(messageId=");
      var2.append(var3);
      var2.append(", channelId=");
      var2.append(var4);
      var2.append(", tagType=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }

   public object `$serializer` : f0<TapTagData> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: TapTagData.$serializer = new TapTagData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.TapTagData", var0, 3);
         var1.l("messageId", false);
         var1.l("channelId", false);
         var1.l("tagType", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{com.discord.primitives.MessageId..serializer.INSTANCE, com.discord.primitives.ChannelId..serializer.INSTANCE, a.u(a2.a)};
      }

      public open fun deserialize(decoder: Decoder): TapTagData {
         r.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         var var2: Int;
         var var6: Any;
         var var7: Any;
         var var12: Any;
         if (var11.p()) {
            var12 = var11.y(var10, 0, com.discord.primitives.MessageId..serializer.INSTANCE, null);
            var7 = var11.y(var10, 1, com.discord.primitives.ChannelId..serializer.INSTANCE, null);
            var6 = var11.n(var10, 2, a2.a, null);
            var2 = 7;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var12 = null;
            var7 = null;
            var6 = null;

            while (var3) {
               val var4: Int = var11.o(var10);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        if (var4 != 2) {
                           throw new n(var4);
                        }

                        var7 = var11.n(var10, 2, a2.a, var7);
                        var2 |= 4;
                     } else {
                        var6 = var11.y(var10, 1, com.discord.primitives.ChannelId..serializer.INSTANCE, var6);
                        var2 |= 2;
                     }
                  } else {
                     var12 = var11.y(var10, 0, com.discord.primitives.MessageId..serializer.INSTANCE, var12);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var7 = var6;
            var6 = var7;
         }

         var11.c(var10);
         val var16: MessageId = var12 as MessageId;
         var12 = null;
         if (var16 != null) {
            var12 = var16.unbox-impl();
         }

         return new TapTagData(var2, (java.lang.String)var12, var7 as ChannelId, var6 as java.lang.String, null, null);
      }

      public open fun serialize(encoder: Encoder, value: TapTagData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         TapTagData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<TapTagData> {
         return TapTagData.$serializer.INSTANCE;
      }
   }
}
