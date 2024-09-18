package com.discord.chat.reactevents

import cl.f
import cl.n
import com.discord.primitives.MessageId
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import dl.a
import fl.b2
import fl.g0
import fl.o1
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
public data class VoiceMessagePlaybackFailedData(messageId: MessageId, errorMessage: String?) : VoiceMessagePlaybackFailedData(var1, var2), ReactEvent {
   public final val errorMessage: String?
   public final val messageId: MessageId

   fun VoiceMessagePlaybackFailedData(var1: Int, var2: java.lang.String, var3: java.lang.String, var4: SerializationConstructorMarker) {
      if (3 != (var1 and 3)) {
         o1.b(var1, 3, VoiceMessagePlaybackFailedData.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.messageId = var2;
      this.errorMessage = var3;
   }

   fun VoiceMessagePlaybackFailedData(var1: java.lang.String, var2: java.lang.String) {
      q.h(var1, "messageId");
      super();
      this.messageId = var1;
      this.errorMessage = var2;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): String? {
      return this.errorMessage;
   }

   public fun copy(messageId: MessageId = ..., errorMessage: String? = ...): VoiceMessagePlaybackFailedData {
      q.h(var1, "messageId");
      return new VoiceMessagePlaybackFailedData(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is VoiceMessagePlaybackFailedData) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else {
            return q.c(this.errorMessage, var1.errorMessage);
         }
      }
   }

   public override fun hashCode(): Int {
      val var2: Int = MessageId.hashCode-impl(this.messageId);
      val var1: Int;
      if (this.errorMessage == null) {
         var1 = 0;
      } else {
         var1 = this.errorMessage.hashCode();
      }

      return var2 * 31 + var1;
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.messageId);
      val var2: java.lang.String = this.errorMessage;
      val var3: StringBuilder = new StringBuilder();
      var3.append("VoiceMessagePlaybackFailedData(messageId=");
      var3.append(var1);
      var3.append(", errorMessage=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }

   public object `$serializer` : g0 {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: VoiceMessagePlaybackFailedData.$serializer = new VoiceMessagePlaybackFailedData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.VoiceMessagePlaybackFailedData", var0, 2);
         var1.l("messageId", false);
         var1.l("errorMessage", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{MessageId.$serializer.INSTANCE, a.u(b2.a)};
      }

      public open fun deserialize(decoder: Decoder): VoiceMessagePlaybackFailedData {
         q.h(var1, "decoder");
         val var7: SerialDescriptor = this.getDescriptor();
         val var8: c = var1.c(var7);
         var var2: Int;
         var var5: java.lang.String;
         var var11: java.lang.String;
         if (var8.y()) {
            val var9: MessageId = var8.m(var7, 0, MessageId.$serializer.INSTANCE, null) as MessageId;
            val var10: java.lang.String;
            if (var9 != null) {
               var10 = var9.unbox-impl();
            } else {
               var10 = null;
            }

            val var6: java.lang.String = var8.v(var7, 1, b2.a, null) as java.lang.String;
            var2 = 3;
            var5 = var10;
            var11 = var6;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var5 = null;
            var11 = null;

            while (var3) {
               val var4: Int = var8.x(var7);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var11 = var8.v(var7, 1, b2.a, var11) as java.lang.String;
                     var2 |= 2;
                  } else {
                     val var12: MessageId;
                     if (var5 != null) {
                        var12 = MessageId.box-impl(var5);
                     } else {
                        var12 = null;
                     }

                     val var13: MessageId = var8.m(var7, 0, MessageId.$serializer.INSTANCE, var12) as MessageId;
                     if (var13 != null) {
                        var5 = var13.unbox-impl();
                     } else {
                        var5 = null;
                     }

                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var8.b(var7);
         return new VoiceMessagePlaybackFailedData(var2, var5, var11, null, null);
      }

      public open fun serialize(encoder: Encoder, value: VoiceMessagePlaybackFailedData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         VoiceMessagePlaybackFailedData.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return fl.g0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<VoiceMessagePlaybackFailedData> {
         return VoiceMessagePlaybackFailedData.$serializer.INSTANCE;
      }
   }
}
