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
public data class AudioFilePlaybackEndedData(messageId: MessageId,
      totalDurationSecs: Float,
      endDurationSecs: Float,
      senderUserId: UserId,
      durationListeningSecs: Float,
      isVoiceMessage: Boolean
   ) : AudioFilePlaybackEndedData(var1, var2, var3, var4, var6, var7),
   ReactEvent {
   public final val durationListeningSecs: Float
   public final val endDurationSecs: Float
   public final val isVoiceMessage: Boolean
   public final val messageId: MessageId
   public final val senderUserId: UserId
   public final val totalDurationSecs: Float

   fun AudioFilePlaybackEndedData(
      var1: Int, var2: java.lang.String, var3: Float, var4: Float, var5: UserId, var6: Float, var7: Boolean, var8: SerializationConstructorMarker
   ) {
      if (63 != (var1 and 63)) {
         n1.b(var1, 63, AudioFilePlaybackEndedData.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.messageId = var2;
      this.totalDurationSecs = var3;
      this.endDurationSecs = var4;
      this.senderUserId = var5.unbox-impl();
      this.durationListeningSecs = var6;
      this.isVoiceMessage = var7;
   }

   fun AudioFilePlaybackEndedData(var1: java.lang.String, var2: Float, var3: Float, var4: Long, var6: Float, var7: Boolean) {
      super();
      this.messageId = var1;
      this.totalDurationSecs = var2;
      this.endDurationSecs = var3;
      this.senderUserId = var4;
      this.durationListeningSecs = var6;
      this.isVoiceMessage = var7;
   }

   @JvmStatic
   public fun `write$Self`(self: AudioFilePlaybackEndedData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, com.discord.primitives.MessageId..serializer.INSTANCE, MessageId.box-impl(var0.messageId));
      var1.r(var2, 1, var0.totalDurationSecs);
      var1.r(var2, 2, var0.endDurationSecs);
      var1.y(var2, 3, com.discord.primitives.UserId..serializer.INSTANCE, UserId.box-impl(var0.senderUserId));
      var1.r(var2, 4, var0.durationListeningSecs);
      var1.x(var2, 5, var0.isVoiceMessage);
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): Float {
      return this.totalDurationSecs;
   }

   public operator fun component3(): Float {
      return this.endDurationSecs;
   }

   public operator fun component4(): UserId {
      return this.senderUserId;
   }

   public operator fun component5(): Float {
      return this.durationListeningSecs;
   }

   public operator fun component6(): Boolean {
      return this.isVoiceMessage;
   }

   public fun copy(
      messageId: MessageId = ...,
      totalDurationSecs: Float = ...,
      endDurationSecs: Float = ...,
      senderUserId: UserId = ...,
      durationListeningSecs: Float = ...,
      isVoiceMessage: Boolean = ...
   ): AudioFilePlaybackEndedData {
      r.h(var1, "messageId");
      return new AudioFilePlaybackEndedData(var1, var2, var3, var4, var6, var7, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AudioFilePlaybackEndedData) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (java.lang.Float.compare(this.totalDurationSecs, var1.totalDurationSecs) != 0) {
            return false;
         } else if (java.lang.Float.compare(this.endDurationSecs, var1.endDurationSecs) != 0) {
            return false;
         } else if (!UserId.equals-impl0(this.senderUserId, var1.senderUserId)) {
            return false;
         } else if (java.lang.Float.compare(this.durationListeningSecs, var1.durationListeningSecs) != 0) {
            return false;
         } else {
            return this.isVoiceMessage == var1.isVoiceMessage;
         }
      }
   }

   public override fun hashCode(): Int {
      val var4: Int = MessageId.hashCode-impl(this.messageId);
      val var7: Int = java.lang.Float.hashCode(this.totalDurationSecs);
      val var5: Int = java.lang.Float.hashCode(this.endDurationSecs);
      val var3: Int = UserId.hashCode-impl(this.senderUserId);
      val var6: Int = java.lang.Float.hashCode(this.durationListeningSecs);
      var var1: Byte = this.isVoiceMessage;
      if (this.isVoiceMessage != 0) {
         var1 = 1;
      }

      return ((((var4 * 31 + var7) * 31 + var5) * 31 + var3) * 31 + var6) * 31 + var1;
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var6: java.lang.String = MessageId.toString-impl(this.messageId);
      val var3: Float = this.totalDurationSecs;
      val var2: Float = this.endDurationSecs;
      val var7: java.lang.String = UserId.toString-impl(this.senderUserId);
      val var1: Float = this.durationListeningSecs;
      val var4: Boolean = this.isVoiceMessage;
      val var5: StringBuilder = new StringBuilder();
      var5.append("AudioFilePlaybackEndedData(messageId=");
      var5.append(var6);
      var5.append(", totalDurationSecs=");
      var5.append(var3);
      var5.append(", endDurationSecs=");
      var5.append(var2);
      var5.append(", senderUserId=");
      var5.append(var7);
      var5.append(", durationListeningSecs=");
      var5.append(var1);
      var5.append(", isVoiceMessage=");
      var5.append(var4);
      var5.append(")");
      return var5.toString();
   }

   public object `$serializer` : f0<AudioFilePlaybackEndedData> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: AudioFilePlaybackEndedData.$serializer = new AudioFilePlaybackEndedData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.discord.chat.reactevents.AudioFilePlaybackEndedData", var0, 6);
         var1.l("messageId", false);
         var1.l("totalDurationSecs", false);
         var1.l("endDurationSecs", false);
         var1.l("senderUserId", false);
         var1.l("durationListeningSecs", false);
         var1.l("isVoiceMessage", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{
            com.discord.primitives.MessageId..serializer.INSTANCE, e0.a, e0.a, com.discord.primitives.UserId..serializer.INSTANCE, e0.a, h.a
         };
      }

      public open fun deserialize(decoder: Decoder): AudioFilePlaybackEndedData {
         r.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         var var2: Float;
         var var3: Float;
         val var5: Float;
         var var6: Int;
         var var9: Boolean;
         var var10: Any;
         var var13: Any;
         if (var12.p()) {
            var10 = (MessageId)var12.y(var11, 0, com.discord.primitives.MessageId..serializer.INSTANCE, null);
            var5 = var12.u(var11, 1);
            var3 = var12.u(var11, 2);
            var13 = var12.y(var11, 3, com.discord.primitives.UserId..serializer.INSTANCE, null);
            var2 = var12.u(var11, 4);
            var9 = var12.C(var11, 5);
            var6 = 63;
         } else {
            var var4: Float = 0.0F;
            var3 = 0.0F;
            var2 = 0.0F;
            var var7: Boolean = true;
            var9 = false;
            var6 = 0;
            var10 = null;
            var13 = null;

            while (var7) {
               val var8: Int = var12.o(var11);
               switch (var8) {
                  case -1:
                     var7 = false;
                     break;
                  case 0:
                     var10 = (MessageId)var12.y(var11, 0, com.discord.primitives.MessageId..serializer.INSTANCE, var10);
                     var6 |= 1;
                     break;
                  case 1:
                     var2 = var12.u(var11, 1);
                     var6 |= 2;
                     break;
                  case 2:
                     var3 = var12.u(var11, 2);
                     var6 |= 4;
                     break;
                  case 3:
                     var13 = var12.y(var11, 3, com.discord.primitives.UserId..serializer.INSTANCE, var13);
                     var6 |= 8;
                     break;
                  case 4:
                     var4 = var12.u(var11, 4);
                     var6 |= 16;
                     break;
                  case 5:
                     var9 = var12.C(var11, 5);
                     var6 |= 32;
                     break;
                  default:
                     throw new n(var8);
               }
            }

            var5 = var2;
            var2 = var4;
         }

         var12.c(var11);
         var10 = var10;
         val var16: java.lang.String;
         if (var10 != null) {
            var16 = var10.unbox-impl();
         } else {
            var16 = null;
         }

         return new AudioFilePlaybackEndedData(var6, var16, var5, var3, var13 as UserId, var2, var9, null, null);
      }

      public open fun serialize(encoder: Encoder, value: AudioFilePlaybackEndedData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         AudioFilePlaybackEndedData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<AudioFilePlaybackEndedData> {
         return AudioFilePlaybackEndedData.$serializer.INSTANCE;
      }
   }
}
