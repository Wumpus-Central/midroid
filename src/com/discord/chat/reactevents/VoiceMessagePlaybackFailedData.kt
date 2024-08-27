package com.discord.chat.reactevents

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
public data class VoiceMessagePlaybackFailedData(messageId: MessageId, errorMessage: String?) : VoiceMessagePlaybackFailedData(var1, var2), ReactEvent {
   public final val errorMessage: String?
   public final val messageId: MessageId

   fun VoiceMessagePlaybackFailedData(var1: Int, var2: java.lang.String, var3: java.lang.String, var4: SerializationConstructorMarker) {
      if (3 != (var1 and 3)) {
         n1.b(var1, 3, VoiceMessagePlaybackFailedData.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.messageId = var2;
      this.errorMessage = var3;
   }

   fun VoiceMessagePlaybackFailedData(var1: java.lang.String, var2: java.lang.String) {
      super();
      this.messageId = var1;
      this.errorMessage = var2;
   }

   @JvmStatic
   public fun `write$Self`(self: VoiceMessagePlaybackFailedData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, com.discord.primitives.MessageId..serializer.INSTANCE, MessageId.box-impl(var0.messageId));
      var1.m(var2, 1, a2.a, var0.errorMessage);
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): String? {
      return this.errorMessage;
   }

   public fun copy(messageId: MessageId = ..., errorMessage: String? = ...): VoiceMessagePlaybackFailedData {
      r.h(var1, "messageId");
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
            return r.c(this.errorMessage, var1.errorMessage);
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

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var3: java.lang.String = MessageId.toString-impl(this.messageId);
      val var2: java.lang.String = this.errorMessage;
      val var1: StringBuilder = new StringBuilder();
      var1.append("VoiceMessagePlaybackFailedData(messageId=");
      var1.append(var3);
      var1.append(", errorMessage=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }

   public object `$serializer` : f0<VoiceMessagePlaybackFailedData> {
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
         return new KSerializer[]{com.discord.primitives.MessageId..serializer.INSTANCE, a.u(a2.a)};
      }

      public open fun deserialize(decoder: Decoder): VoiceMessagePlaybackFailedData {
         r.h(var1, "decoder");
         val var8: SerialDescriptor = this.getDescriptor();
         val var9: c = var1.b(var8);
         var var2: Int;
         var var6: Any;
         var var10: Any;
         if (var9.p()) {
            var10 = var9.y(var8, 0, com.discord.primitives.MessageId..serializer.INSTANCE, null);
            var6 = var9.n(var8, 1, a2.a, null);
            var2 = 3;
         } else {
            var var3: Boolean = true;
            var2 = 0;
            var10 = null;
            var6 = null;

            while (var3) {
               val var4: Int = var9.o(var8);
               if (var4 != -1) {
                  if (var4 != 0) {
                     if (var4 != 1) {
                        throw new n(var4);
                     }

                     var6 = var9.n(var8, 1, a2.a, var6);
                     var2 |= 2;
                  } else {
                     var10 = var9.y(var8, 0, com.discord.primitives.MessageId..serializer.INSTANCE, var10);
                     var2 |= 1;
                  }
               } else {
                  var3 = false;
               }
            }
         }

         var9.c(var8);
         val var12: MessageId = var10 as MessageId;
         var10 = null;
         if (var12 != null) {
            var10 = var12.unbox-impl();
         }

         return new VoiceMessagePlaybackFailedData(var2, (java.lang.String)var10, var6 as java.lang.String, null, null);
      }

      public open fun serialize(encoder: Encoder, value: VoiceMessagePlaybackFailedData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         VoiceMessagePlaybackFailedData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return xk.f0.a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<VoiceMessagePlaybackFailedData> {
         return VoiceMessagePlaybackFailedData.$serializer.INSTANCE;
      }
   }
}
