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
public data class MediaAttachmentPlaybackStartedData(messageId: MessageId,
      totalDurationSecs: Float,
      startDurationSecs: Float,
      senderUserId: UserId,
      isVoiceMessage: Boolean,
      attachmentId: String
   ) : MediaAttachmentPlaybackStartedData(var1, var2, var3, var4, var6, var7),
   ReactEvent {
   public final val attachmentId: String
   public final val isVoiceMessage: Boolean
   public final val messageId: MessageId
   public final val senderUserId: UserId
   public final val startDurationSecs: Float
   public final val totalDurationSecs: Float

   fun MediaAttachmentPlaybackStartedData(
      var1: Int, var2: java.lang.String, var3: Float, var4: Float, var5: UserId, var6: Boolean, var7: java.lang.String, var8: SerializationConstructorMarker
   ) {
      if (63 != (var1 and 63)) {
         n1.b(var1, 63, MediaAttachmentPlaybackStartedData.$serializer.INSTANCE.getDescriptor());
      }

      super();
      this.messageId = var2;
      this.totalDurationSecs = var3;
      this.startDurationSecs = var4;
      this.senderUserId = var5.unbox-impl();
      this.isVoiceMessage = var6;
      this.attachmentId = var7;
   }

   fun MediaAttachmentPlaybackStartedData(var1: java.lang.String, var2: Float, var3: Float, var4: Long, var6: Boolean, var7: java.lang.String) {
      super();
      this.messageId = var1;
      this.totalDurationSecs = var2;
      this.startDurationSecs = var3;
      this.senderUserId = var4;
      this.isVoiceMessage = var6;
      this.attachmentId = var7;
   }

   @JvmStatic
   public fun `write$Self`(self: MediaAttachmentPlaybackStartedData, output: CompositeEncoder, serialDesc: SerialDescriptor) {
      r.h(var0, "self");
      r.h(var1, "output");
      r.h(var2, "serialDesc");
      var1.y(var2, 0, com.discord.primitives.MessageId..serializer.INSTANCE, MessageId.box-impl(var0.messageId));
      var1.r(var2, 1, var0.totalDurationSecs);
      var1.r(var2, 2, var0.startDurationSecs);
      var1.y(var2, 3, com.discord.primitives.UserId..serializer.INSTANCE, UserId.box-impl(var0.senderUserId));
      var1.x(var2, 4, var0.isVoiceMessage);
      var1.z(var2, 5, var0.attachmentId);
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

   public operator fun component6(): String {
      return this.attachmentId;
   }

   public fun copy(
      messageId: MessageId = ...,
      totalDurationSecs: Float = ...,
      startDurationSecs: Float = ...,
      senderUserId: UserId = ...,
      isVoiceMessage: Boolean = ...,
      attachmentId: String = ...
   ): MediaAttachmentPlaybackStartedData {
      r.h(var1, "messageId");
      r.h(var7, "attachmentId");
      return new MediaAttachmentPlaybackStartedData(var1, var2, var3, var4, var6, var7, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaAttachmentPlaybackStartedData) {
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
         } else if (this.isVoiceMessage != var1.isVoiceMessage) {
            return false;
         } else {
            return r.c(this.attachmentId, var1.attachmentId);
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = MessageId.hashCode-impl(this.messageId);
      val var4: Int = java.lang.Float.hashCode(this.totalDurationSecs);
      val var3: Int = java.lang.Float.hashCode(this.startDurationSecs);
      val var6: Int = UserId.hashCode-impl(this.senderUserId);
      var var1: Byte = this.isVoiceMessage;
      if (this.isVoiceMessage != 0) {
         var1 = 1;
      }

      return ((((var5 * 31 + var4) * 31 + var3) * 31 + var6) * 31 + var1) * 31 + this.attachmentId.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var6: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: Float = this.totalDurationSecs;
      val var2: Float = this.startDurationSecs;
      val var4: java.lang.String = UserId.toString-impl(this.senderUserId);
      val var3: Boolean = this.isVoiceMessage;
      val var5: java.lang.String = this.attachmentId;
      val var7: StringBuilder = new StringBuilder();
      var7.append("MediaAttachmentPlaybackStartedData(messageId=");
      var7.append(var6);
      var7.append(", totalDurationSecs=");
      var7.append(var1);
      var7.append(", startDurationSecs=");
      var7.append(var2);
      var7.append(", senderUserId=");
      var7.append(var4);
      var7.append(", isVoiceMessage=");
      var7.append(var3);
      var7.append(", attachmentId=");
      var7.append(var5);
      var7.append(")");
      return var7.toString();
   }

   public object `$serializer` : f0<MediaAttachmentPlaybackStartedData> {
      public open val descriptor: SerialDescriptor
         public open get() {
            return descriptor;
         }


      @JvmStatic
      fun {
         val var0: MediaAttachmentPlaybackStartedData.$serializer = new MediaAttachmentPlaybackStartedData.$serializer();
         INSTANCE = var0;
         val var1: PluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor(
            "com.discord.chat.reactevents.MediaAttachmentPlaybackStartedData", var0, 6
         );
         var1.l("messageId", false);
         var1.l("totalDurationSecs", false);
         var1.l("startDurationSecs", false);
         var1.l("senderUserId", false);
         var1.l("isVoiceMessage", false);
         var1.l("attachmentId", false);
         descriptor = var1;
      }

      public open fun childSerializers(): Array<KSerializer<*>> {
         return new KSerializer[]{
            com.discord.primitives.MessageId..serializer.INSTANCE, e0.a, e0.a, com.discord.primitives.UserId..serializer.INSTANCE, h.a, a2.a
         };
      }

      public open fun deserialize(decoder: Decoder): MediaAttachmentPlaybackStartedData {
         r.h(var1, "decoder");
         val var11: SerialDescriptor = this.getDescriptor();
         val var12: c = var1.b(var11);
         var var3: Float;
         val var4: Float;
         var var5: Int;
         var var8: Boolean;
         var var9: Any;
         var var10: java.lang.String;
         var var13: Any;
         if (var12.p()) {
            var13 = (MessageId)var12.y(var11, 0, com.discord.primitives.MessageId..serializer.INSTANCE, null);
            var3 = var12.u(var11, 1);
            val var2: Float = var12.u(var11, 2);
            var9 = var12.y(var11, 3, com.discord.primitives.UserId..serializer.INSTANCE, null);
            var8 = var12.C(var11, 4);
            var10 = var12.m(var11, 5);
            var5 = 63;
            var4 = var2;
         } else {
            var3 = 0.0F;
            var var16: Float = 0.0F;
            var var6: Boolean = true;
            var8 = false;
            var5 = 0;
            var13 = null;
            var10 = null;
            var9 = null;

            while (var6) {
               val var7: Int = var12.o(var11);
               switch (var7) {
                  case -1:
                     var6 = false;
                     break;
                  case 0:
                     var13 = (MessageId)var12.y(var11, 0, com.discord.primitives.MessageId..serializer.INSTANCE, var13);
                     var5 |= 1;
                     break;
                  case 1:
                     var16 = var12.u(var11, 1);
                     var5 |= 2;
                     break;
                  case 2:
                     var3 = var12.u(var11, 2);
                     var5 |= 4;
                     break;
                  case 3:
                     var9 = var12.y(var11, 3, com.discord.primitives.UserId..serializer.INSTANCE, var9);
                     var5 |= 8;
                     break;
                  case 4:
                     var8 = var12.C(var11, 4);
                     var5 |= 16;
                     break;
                  case 5:
                     var10 = var12.m(var11, 5);
                     var5 |= 32;
                     break;
                  default:
                     throw new n(var7);
               }
            }

            var4 = var3;
            var3 = var16;
         }

         var12.c(var11);
         var13 = var13;
         val var15: java.lang.String;
         if (var13 != null) {
            var15 = var13.unbox-impl();
         } else {
            var15 = null;
         }

         return new MediaAttachmentPlaybackStartedData(var5, var15, var3, var4, var9 as UserId, var8, var10, null, null);
      }

      public open fun serialize(encoder: Encoder, value: MediaAttachmentPlaybackStartedData) {
         r.h(var1, "encoder");
         r.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MediaAttachmentPlaybackStartedData.write$Self(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer<?>> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaAttachmentPlaybackStartedData> {
         return MediaAttachmentPlaybackStartedData.$serializer.INSTANCE;
      }
   }
}
