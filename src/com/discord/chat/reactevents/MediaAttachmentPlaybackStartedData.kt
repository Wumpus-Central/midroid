package com.discord.chat.reactevents

import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import com.discord.reactevents.ReactEvent
import com.discord.reactevents.ReactEvent.DefaultImpls
import com.facebook.react.bridge.WritableMap
import dn.f
import dn.n
import gn.b2
import gn.f0
import gn.g0
import gn.h
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
         o1.b(var1, 63, MediaAttachmentPlaybackStartedData.$serializer.INSTANCE.getDescriptor());
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
      q.h(var1, "messageId");
      q.h(var7, "attachmentId");
      super();
      this.messageId = var1;
      this.totalDurationSecs = var2;
      this.startDurationSecs = var3;
      this.senderUserId = var4;
      this.isVoiceMessage = var6;
      this.attachmentId = var7;
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
      q.h(var1, "messageId");
      q.h(var7, "attachmentId");
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
            return q.c(this.attachmentId, var1.attachmentId);
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 (MessageId.hashCode-impl(this.messageId) * 31 + java.lang.Float.hashCode(this.totalDurationSecs)) * 31
                                    + java.lang.Float.hashCode(this.startDurationSecs)
                              )
                              * 31
                           + UserId.hashCode-impl(this.senderUserId)
                     )
                     * 31
                  + java.lang.Boolean.hashCode(this.isVoiceMessage)
            )
            * 31
         + this.attachmentId.hashCode();
   }

   fun serialize(): WritableMap {
      return DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var6: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: Float = this.totalDurationSecs;
      val var2: Float = this.startDurationSecs;
      val var7: java.lang.String = UserId.toString-impl(this.senderUserId);
      val var3: Boolean = this.isVoiceMessage;
      val var5: java.lang.String = this.attachmentId;
      val var4: StringBuilder = new StringBuilder();
      var4.append("MediaAttachmentPlaybackStartedData(messageId=");
      var4.append(var6);
      var4.append(", totalDurationSecs=");
      var4.append(var1);
      var4.append(", startDurationSecs=");
      var4.append(var2);
      var4.append(", senderUserId=");
      var4.append(var7);
      var4.append(", isVoiceMessage=");
      var4.append(var3);
      var4.append(", attachmentId=");
      var4.append(var5);
      var4.append(")");
      return var4.toString();
   }

   public object `$serializer` : g0 {
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
         return new KSerializer[]{MessageId.$serializer.INSTANCE, f0.a, f0.a, UserId.$serializer.INSTANCE, h.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): MediaAttachmentPlaybackStartedData {
         q.h(var1, "decoder");
         val var12: SerialDescriptor = this.getDescriptor();
         val var13: c = var1.b(var12);
         var var3: Float;
         val var4: Float;
         var var5: Int;
         var var8: Boolean;
         val var16: java.lang.String;
         var var20: Any;
         var var22: java.lang.String;
         if (var13.p()) {
            val var14: MessageId = var13.y(var12, 0, MessageId.$serializer.INSTANCE, null) as MessageId;
            val var15: java.lang.String;
            if (var14 != null) {
               var15 = var14.unbox-impl();
            } else {
               var15 = null;
            }

            var3 = var13.u(var12, 1);
            val var2: Float = var13.u(var12, 2);
            val var11: UserId = var13.y(var12, 3, UserId.$serializer.INSTANCE, null) as UserId;
            var8 = var13.C(var12, 4);
            var16 = var13.m(var12, 5);
            var5 = 63;
            var22 = var15;
            var4 = var2;
            var20 = var11;
         } else {
            var3 = 0.0F;
            var var18: Float = 0.0F;
            var var6: Boolean = true;
            var8 = false;
            var5 = 0;
            var22 = null;
            var20 = null;
            var var17: Any = null;

            while (var6) {
               val var7: Int = var13.o(var12);
               switch (var7) {
                  case -1:
                     var6 = false;
                     break;
                  case 0:
                     val var23: MessageId;
                     if (var22 != null) {
                        var23 = MessageId.box-impl(var22);
                     } else {
                        var23 = null;
                     }

                     val var24: MessageId = var13.y(var12, 0, MessageId.$serializer.INSTANCE, var23) as MessageId;
                     if (var24 != null) {
                        var22 = var24.unbox-impl();
                     } else {
                        var22 = null;
                     }

                     var5 |= 1;
                     break;
                  case 1:
                     var18 = var13.u(var12, 1);
                     var5 |= 2;
                     break;
                  case 2:
                     var3 = var13.u(var12, 2);
                     var5 |= 4;
                     break;
                  case 3:
                     var17 = var13.y(var12, 3, UserId.$serializer.INSTANCE, var17) as UserId;
                     var5 |= 8;
                     break;
                  case 4:
                     var8 = var13.C(var12, 4);
                     var5 |= 16;
                     break;
                  case 5:
                     var20 = var13.m(var12, 5);
                     var5 |= 32;
                     break;
                  default:
                     throw new n(var7);
               }
            }

            var16 = (java.lang.String)var20;
            var20 = var17;
            var4 = var3;
            var3 = var18;
         }

         var13.c(var12);
         return new MediaAttachmentPlaybackStartedData(var5, var22, var3, var4, (UserId)var20, var8, var16, null, null);
      }

      public open fun serialize(encoder: Encoder, value: MediaAttachmentPlaybackStartedData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.b(var3);
         MediaAttachmentPlaybackStartedData.write$Self$chat_release(var2, var4, var3);
         var4.c(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaAttachmentPlaybackStartedData> {
         return MediaAttachmentPlaybackStartedData.$serializer.INSTANCE;
      }
   }
}
