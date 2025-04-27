package com.discord.chat.reactevents

import Y9.f
import Y9.n
import Z9.a
import ba.C0
import ba.G
import ba.h
import ba.p0
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.reactevents.ReactEvent
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

@f
internal data class InitiateReplyData(messageId: MessageId, channelId: ChannelId, triggerHaptic: Boolean? = ..., location: String?) : InitiateReplyData(
         var1, var2, var4, var5
      ),
   ReactEvent {
   public final val channelId: ChannelId
   public final val location: String?
   public final val messageId: MessageId
   public final val triggerHaptic: Boolean?

   fun InitiateReplyData(
      var1: Int, var2: java.lang.String, var3: ChannelId, var4: java.lang.Boolean, var5: java.lang.String, var6: SerializationConstructorMarker
   ) {
      if (11 != (var1 and 11)) {
         p0.b(var1, 11, InitiateReplyData.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.messageId = var2;
      this.channelId = var3.unbox-impl();
      if ((var1 and 4) == 0) {
         this.triggerHaptic = java.lang.Boolean.FALSE;
      } else {
         this.triggerHaptic = var4;
      }

      this.location = var5;
   }

   fun InitiateReplyData(var1: java.lang.String, var2: Long, var4: java.lang.Boolean, var5: java.lang.String) {
      q.h(var1, "messageId");
      super();
      this.messageId = var1;
      this.channelId = var2;
      this.triggerHaptic = var4;
      this.location = var5;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): ChannelId {
      return this.channelId;
   }

   public operator fun component3(): Boolean? {
      return this.triggerHaptic;
   }

   public operator fun component4(): String? {
      return this.location;
   }

   public fun copy(messageId: MessageId = ..., channelId: ChannelId = ..., triggerHaptic: Boolean? = ..., location: String? = ...): InitiateReplyData {
      q.h(var1, "messageId");
      return new InitiateReplyData(var1, var2, var4, var5, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is InitiateReplyData) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.triggerHaptic, var1.triggerHaptic)) {
            return false;
         } else {
            return q.c(this.location, var1.location);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = MessageId.hashCode-impl(this.messageId);
      val var4: Int = ChannelId.hashCode-impl(this.channelId);
      var var2: Int = 0;
      val var1: Int;
      if (this.triggerHaptic == null) {
         var1 = 0;
      } else {
         var1 = this.triggerHaptic.hashCode();
      }

      if (this.location != null) {
         var2 = this.location.hashCode();
      }

      return ((var3 * 31 + var4) * 31 + var1) * 31 + var2;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = MessageId.toString-impl(this.messageId);
      val var4: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var5: java.lang.Boolean = this.triggerHaptic;
      val var2: java.lang.String = this.location;
      val var1: StringBuilder = new StringBuilder();
      var1.append("InitiateReplyData(messageId=");
      var1.append(var3);
      var1.append(", channelId=");
      var1.append(var4);
      var1.append(", triggerHaptic=");
      var1.append(var5);
      var1.append(", location=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : G {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: InitiateReplyData.$serializer = new InitiateReplyData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.InitiateReplyData", var0, 4);
         var1.l("messageId", false);
         var1.l("channelId", false);
         var1.l("triggerHaptic", true);
         var1.l("location", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{MessageId.$serializer.INSTANCE, ChannelId.$serializer.INSTANCE, a.u(h.a), a.u(C0.a)};
      }

      public open fun deserialize(decoder: Decoder): InitiateReplyData {
         q.h(var1, "decoder");
         val var9: SerialDescriptor = this.getDescriptor();
         val var10: c = var1.c(var9);
         var var2: Int;
         var var5: Any;
         var var6: Any;
         var var7: java.lang.String;
         val var13: java.lang.String;
         if (var10.y()) {
            val var11: MessageId = var10.m(var9, 0, MessageId.$serializer.INSTANCE, null) as MessageId;
            val var12: java.lang.String;
            if (var11 != null) {
               var12 = var11.unbox-impl();
            } else {
               var12 = null;
            }

            var6 = var10.m(var9, 1, ChannelId.$serializer.INSTANCE, null) as ChannelId;
            var5 = var10.v(var9, 2, h.a, null) as java.lang.Boolean;
            val var8: java.lang.String = var10.v(var9, 3, C0.a, null) as java.lang.String;
            var7 = var12;
            var13 = var8;
            var2 = 15;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var7 = null;
            var6 = null;
            var5 = null;
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

                           var6 = var10.v(var9, 3, C0.a, var6) as java.lang.String;
                           var2 |= 8;
                        } else {
                           var5 = var10.v(var9, 2, h.a, var5) as java.lang.Boolean;
                           var2 |= 4;
                        }
                     } else {
                        var14 = var10.m(var9, 1, ChannelId.$serializer.INSTANCE, var14) as ChannelId;
                        var2 |= 2;
                     }
                  } else {
                     val var16: MessageId;
                     if (var7 != null) {
                        var16 = MessageId.box-impl(var7);
                     } else {
                        var16 = null;
                     }

                     val var17: MessageId = var10.m(var9, 0, MessageId.$serializer.INSTANCE, var16) as MessageId;
                     if (var17 != null) {
                        var7 = var17.unbox-impl();
                     } else {
                        var7 = null;
                     }

                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }

            var13 = (java.lang.String)var6;
            var6 = var14;
         }

         var10.b(var9);
         return new InitiateReplyData(var2, var7, (ChannelId)var6, (java.lang.Boolean)var5, var13, null, null);
      }

      public open fun serialize(encoder: Encoder, value: InitiateReplyData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         InitiateReplyData.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return ba.G.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<InitiateReplyData> {
         return InitiateReplyData.$serializer.INSTANCE;
      }
   }
}
