package com.discord.chat.reactevents

import com.discord.primitives.MessageId
import com.discord.primitives.UserId
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
import xk.e0
import xk.f0
import xk.h
import xk.n1
import xk.f0.a

@f
public data class AudioFilePlaybackStartedData(messageId: MessageId,
      totalDurationSecs: Float,
      startDurationSecs: Float,
      senderUserId: UserId,
      isVoiceMessage: Boolean
   ) : AudioFilePlaybackStartedData(var1, var2, var3, var4, var6),
   ReactEvent {
   public final val isVoiceMessage: Boolean
   public final val messageId: MessageId
   public final val senderUserId: UserId
   public final val startDurationSecs: Float
   public final val totalDurationSecs: Float

   fun AudioFilePlaybackStartedData(
      var1: Int, var2: java.lang.String, var3: Float, var4: Float, var5: UserId, var6: Boolean, var7: SerializationConstructorMarker
   ) {
      if (31 != (var1 and 31)) {
         n1.b(var1, 31, AudioFilePlaybackStartedData.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.messageId = var2;
      this.totalDurationSecs = var3;
      this.startDurationSecs = var4;
      this.senderUserId = var5.unbox-impl();
      this.isVoiceMessage = var6;
   }

   fun AudioFilePlaybackStartedData(var1: java.lang.String, var2: Float, var3: Float, var4: Long, var6: Boolean) {
      super();
      this.messageId = var1;
      this.totalDurationSecs = var2;
      this.startDurationSecs = var3;
      this.senderUserId = var4;
      this.isVoiceMessage = var6;
   }

   @JvmStatic
   public fun `write$Self`(self: AudioFilePlaybackStartedData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, com.discord.primitives.MessageId..serializer.INSTANCE, MessageId.box-impl(var0.messageId));
      var1.r(var2, 1, var0.totalDurationSecs);
      var1.r(var2, 2, var0.startDurationSecs);
      var1.y(var2, 3, com.discord.primitives.UserId..serializer.INSTANCE, UserId.box-impl(var0.senderUserId));
      var1.x(var2, 4, var0.isVoiceMessage);
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): Float {
      return this.totalDurationSecs;
   }

   public operator fun component3(): Float {
      return this.startDurationSecs;
   }

   public operator fun component4(): UserId {
      return this.senderUserId;
   }

   public operator fun component5(): Boolean {
      return this.isVoiceMessage;
   }

   public fun copy(
      messageId: MessageId = ...,
      totalDurationSecs: Float = ...,
      startDurationSecs: Float = ...,
      senderUserId: UserId = ...,
      isVoiceMessage: Boolean = ...
   ): AudioFilePlaybackStartedData {
      r.h(var1, "messageId");
      return new AudioFilePlaybackStartedData(var1, var2, var3, var4, var6, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AudioFilePlaybackStartedData) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (java.lang.Float.compare(this.totalDurationSecs, var1.totalDurationSecs) != 0) {
            return false;
         } else if (java.lang.Float.compare(this.startDurationSecs, var1.startDurationSecs) != 0) {
            return false;
         } else if (!UserId.equals-impl0(this.senderUserId, var1.senderUserId)) {
            return false;
         } else {
            return this.isVoiceMessage == var1.isVoiceMessage;
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = MessageId.hashCode-impl(this.messageId);
      val var6: Int = java.lang.Float.hashCode(this.totalDurationSecs);
      val var5: Int = java.lang.Float.hashCode(this.startDurationSecs);
      val var3: Int = UserId.hashCode-impl(this.senderUserId);
      var var1: Byte = this.isVoiceMessage;
      if (this.isVoiceMessage != 0) {
         var1 = 1;
      }

      return (((var4 * 31 + var6) * 31 + var5) * 31 + var3) * 31 + var1;
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var6: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: Float = this.totalDurationSecs;
      val var2: Float = this.startDurationSecs;
      val var5: java.lang.String = UserId.toString-impl(this.senderUserId);
      val var3: Boolean = this.isVoiceMessage;
      val var4: StringBuilder = new StringBuilder();
      var4.append("AudioFilePlaybackStartedData(messageId=");
      var4.append(var6);
      var4.append(", totalDurationSecs=");
      var4.append(var1);
      var4.append(", startDurationSecs=");
      var4.append(var2);
      var4.append(", senderUserId=");
      var4.append(var5);
      var4.append(", isVoiceMessage=");
      var4.append(var3);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : f0<AudioFilePlaybackStartedData> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: AudioFilePlaybackStartedData.$serializer = new AudioFilePlaybackStartedData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.AudioFilePlaybackStartedData", var0, 5);
         var1.l("messageId", false);
         var1.l("totalDurationSecs", false);
         var1.l("startDurationSecs", false);
         var1.l("senderUserId", false);
         var1.l("isVoiceMessage", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{com.discord.primitives.MessageId..serializer.INSTANCE, e0.a, e0.a, com.discord.primitives.UserId..serializer.INSTANCE, h.a};
      }

      public open fun deserialize(decoder: Decoder): AudioFilePlaybackStartedData {
         r.h(var1, "decoder");
         val var10: SerialDescriptor = this.getDescriptor();
         val var11: c = var1.b(var10);
         var var2: Float;
         var var3: Float;
         var var5: Int;
         var var8: Boolean;
         var var9: Any;
         var var12: Any;
         if (var11.p()) {
            var12 = (MessageId)var11.y(var10, 0, com.discord.primitives.MessageId..serializer.INSTANCE, null);
            var3 = var11.u(var10, 1);
            var2 = var11.u(var10, 2);
            var9 = var11.y(var10, 3, com.discord.primitives.UserId..serializer.INSTANCE, null);
            var8 = var11.C(var10, 4);
            var5 = 31;
         } else {
            var3 = 0.0F;
            var2 = 0.0F;
            var var6: Boolean = true;
            var8 = false;
            var5 = 0;
            var12 = null;
            var9 = null;

            while (var6) {
               val var7: Int = var11.o(var10);
               if (var7 != -1) {
                  if (var7 != 0) {
                     if (var7 != 1) {
                        if (var7 != 2) {
                           if (var7 != 3) {
                              if (var7 != 4) {
                                 throw new n(var7);
                              }

                              var8 = var11.C(var10, 4);
                              var5 |= 16;
                           } else {
                              var9 = var11.y(var10, 3, com.discord.primitives.UserId..serializer.INSTANCE, var9);
                              var5 |= 8;
                           }
                        } else {
                           var3 = var11.u(var10, 2);
                           var5 |= 4;
                        }
                     } else {
                        var2 = var11.u(var10, 1);
                        var5 |= 2;
                     }
                  } else {
                     var12 = (MessageId)var11.y(var10, 0, com.discord.primitives.MessageId..serializer.INSTANCE, var12);
                     var5 |= 1;
                  }
               } else {
                  var6 = false;
               }
            }

            var3 = var2;
            var2 = var3;
         }

         var11.c(var10);
         var12 = var12;
         val var14: java.lang.String;
         if (var12 != null) {
            var14 = var12.unbox-impl();
         } else {
            var14 = null;
         }

         return new AudioFilePlaybackStartedData(var5, var14, var3, var2, var9 as UserId, var8, null, null);
      }

      public open fun serialize(encoder: Encoder, value: AudioFilePlaybackStartedData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         AudioFilePlaybackStartedData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<AudioFilePlaybackStartedData> {
         return AudioFilePlaybackStartedData.$serializer.INSTANCE;
      }
   }
}
