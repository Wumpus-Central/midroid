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
import xk.a2
import xk.e0
import xk.f0
import xk.h
import xk.n1
import xk.f0.a

@f
public data class MediaAttachmentPlaybackEndedData(messageId: MessageId,
      totalDurationSecs: Float,
      endDurationSecs: Float,
      senderUserId: UserId,
      durationListeningSecs: Float,
      isVoiceMessage: Boolean,
      attachmentId: String
   ) : MediaAttachmentPlaybackEndedData(var1, var2, var3, var4, var6, var7, var8),
   ReactEvent {
   public final val attachmentId: String
   public final val durationListeningSecs: Float
   public final val endDurationSecs: Float
   public final val isVoiceMessage: Boolean
   public final val messageId: MessageId
   public final val senderUserId: UserId
   public final val totalDurationSecs: Float

   fun MediaAttachmentPlaybackEndedData(
      var1: Int,
      var2: java.lang.String,
      var3: Float,
      var4: Float,
      var5: UserId,
      var6: Float,
      var7: Boolean,
      var8: java.lang.String,
      var9: SerializationConstructorMarker
   ) {
      if (127 != (var1 and 127)) {
         n1.b(var1, 127, MediaAttachmentPlaybackEndedData.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.messageId = var2;
      this.totalDurationSecs = var3;
      this.endDurationSecs = var4;
      this.senderUserId = var5.unbox-impl();
      this.durationListeningSecs = var6;
      this.isVoiceMessage = var7;
      this.attachmentId = var8;
   }

   fun MediaAttachmentPlaybackEndedData(var1: java.lang.String, var2: Float, var3: Float, var4: Long, var6: Float, var7: Boolean, var8: java.lang.String) {
      super();
      this.messageId = var1;
      this.totalDurationSecs = var2;
      this.endDurationSecs = var3;
      this.senderUserId = var4;
      this.durationListeningSecs = var6;
      this.isVoiceMessage = var7;
      this.attachmentId = var8;
   }

   @JvmStatic
   public fun `write$Self`(self: MediaAttachmentPlaybackEndedData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, com.discord.primitives.MessageId..serializer.INSTANCE, MessageId.box-impl(var0.messageId));
      var1.r(var2, 1, var0.totalDurationSecs);
      var1.r(var2, 2, var0.endDurationSecs);
      var1.y(var2, 3, com.discord.primitives.UserId..serializer.INSTANCE, UserId.box-impl(var0.senderUserId));
      var1.r(var2, 4, var0.durationListeningSecs);
      var1.x(var2, 5, var0.isVoiceMessage);
      var1.z(var2, 6, var0.attachmentId);
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

   public operator fun component7(): String {
      return this.attachmentId;
   }

   public fun copy(
      messageId: MessageId = ...,
      totalDurationSecs: Float = ...,
      endDurationSecs: Float = ...,
      senderUserId: UserId = ...,
      durationListeningSecs: Float = ...,
      isVoiceMessage: Boolean = ...,
      attachmentId: String = ...
   ): MediaAttachmentPlaybackEndedData {
      r.h(var1, "messageId");
      r.h(var8, "attachmentId");
      return new MediaAttachmentPlaybackEndedData(var1, var2, var3, var4, var6, var7, var8, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaAttachmentPlaybackEndedData) {
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
         } else if (this.isVoiceMessage != var1.isVoiceMessage) {
            return false;
         } else {
            return r.c(this.attachmentId, var1.attachmentId);
         }
      }
   }

   public override fun hashCode(): Int {
      val var6: Int = MessageId.hashCode-impl(this.messageId);
      val var7: Int = java.lang.Float.hashCode(this.totalDurationSecs);
      val var3: Int = java.lang.Float.hashCode(this.endDurationSecs);
      val var4: Int = UserId.hashCode-impl(this.senderUserId);
      val var5: Int = java.lang.Float.hashCode(this.durationListeningSecs);
      var var1: Byte = this.isVoiceMessage;
      if (this.isVoiceMessage != 0) {
         var1 = 1;
      }

      return (((((var6 * 31 + var7) * 31 + var3) * 31 + var4) * 31 + var5) * 31 + var1) * 31 + this.attachmentId.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var8: java.lang.String = MessageId.toString-impl(this.messageId);
      val var2: Float = this.totalDurationSecs;
      val var3: Float = this.endDurationSecs;
      val var7: java.lang.String = UserId.toString-impl(this.senderUserId);
      val var1: Float = this.durationListeningSecs;
      val var4: Boolean = this.isVoiceMessage;
      val var5: java.lang.String = this.attachmentId;
      val var6: StringBuilder = new StringBuilder();
      var6.append("MediaAttachmentPlaybackEndedData(messageId=");
      var6.append(var8);
      var6.append(", totalDurationSecs=");
      var6.append(var2);
      var6.append(", endDurationSecs=");
      var6.append(var3);
      var6.append(", senderUserId=");
      var6.append(var7);
      var6.append(", durationListeningSecs=");
      var6.append(var1);
      var6.append(", isVoiceMessage=");
      var6.append(var4);
      var6.append(", attachmentId=");
      var6.append(var5);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : f0<MediaAttachmentPlaybackEndedData> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MediaAttachmentPlaybackEndedData.$serializer = new MediaAttachmentPlaybackEndedData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.chat.reactevents.MediaAttachmentPlaybackEndedData", var0, 7
         );
         var1.l("messageId", false);
         var1.l("totalDurationSecs", false);
         var1.l("endDurationSecs", false);
         var1.l("senderUserId", false);
         var1.l("durationListeningSecs", false);
         var1.l("isVoiceMessage", false);
         var1.l("attachmentId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{
            com.discord.primitives.MessageId..serializer.INSTANCE, e0.a, e0.a, com.discord.primitives.UserId..serializer.INSTANCE, e0.a, h.a, a2.a
         };
      }

      public open fun deserialize(decoder: Decoder): MediaAttachmentPlaybackEndedData {
         r.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: c = var1.b(var12);
         var var2: Float;
         var var3: Float;
         var var4: Float;
         var var6: Int;
         var var9: Boolean;
         var var10: Any;
         var var11: java.lang.String;
         var var14: Any;
         if (var13.p()) {
            var14 = (MessageId)var13.y(var12, 0, com.discord.primitives.MessageId..serializer.INSTANCE, null);
            var3 = var13.u(var12, 1);
            var4 = var13.u(var12, 2);
            var10 = var13.y(var12, 3, com.discord.primitives.UserId..serializer.INSTANCE, null);
            var2 = var13.u(var12, 4);
            var9 = var13.C(var12, 5);
            var11 = var13.m(var12, 6);
            var6 = 127;
         } else {
            var4 = 0.0F;
            var3 = 0.0F;
            var2 = 0.0F;
            var var7: Boolean = true;
            var9 = false;
            var6 = 0;
            var14 = null;
            var11 = null;
            var10 = null;

            while (var7) {
               val var8: Int = var13.o(var12);
               switch (var8) {
                  case -1:
                     var7 = false;
                     break;
                  case 0:
                     var14 = (MessageId)var13.y(var12, 0, com.discord.primitives.MessageId..serializer.INSTANCE, var14);
                     var6 |= 1;
                     break;
                  case 1:
                     var2 = var13.u(var12, 1);
                     var6 |= 2;
                     break;
                  case 2:
                     var3 = var13.u(var12, 2);
                     var6 |= 4;
                     break;
                  case 3:
                     var10 = var13.y(var12, 3, com.discord.primitives.UserId..serializer.INSTANCE, var10);
                     var6 |= 8;
                     break;
                  case 4:
                     var4 = var13.u(var12, 4);
                     var6 |= 16;
                     break;
                  case 5:
                     var9 = var13.C(var12, 5);
                     var6 |= 32;
                     break;
                  case 6:
                     var11 = var13.m(var12, 6);
                     var6 |= 64;
                     break;
                  default:
                     throw new n(var8);
               }
            }

            var3 = var2;
            var2 = var4;
            var4 = var3;
         }

         var13.c(var12);
         var14 = var14;
         val var16: java.lang.String;
         if (var14 != null) {
            var16 = var14.unbox-impl();
         } else {
            var16 = null;
         }

         return new MediaAttachmentPlaybackEndedData(var6, var16, var3, var4, var10 as UserId, var2, var9, var11, null, null);
      }

      public open fun serialize(encoder: Encoder, value: MediaAttachmentPlaybackEndedData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MediaAttachmentPlaybackEndedData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaAttachmentPlaybackEndedData> {
         return MediaAttachmentPlaybackEndedData.$serializer.INSTANCE;
      }
   }
}
