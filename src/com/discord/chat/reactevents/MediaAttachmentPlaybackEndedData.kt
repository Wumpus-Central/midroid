package com.discord.chat.reactevents

import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import fl.f
import fl.n
import il.b2
import il.f0
import il.g0
import il.h
import il.o1
import il.g0.a
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
         o1.b(var1, 127, MediaAttachmentPlaybackEndedData.$serializer.INSTANCE.getDescriptor());
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
      q.h(var1, "messageId");
      q.h(var8, "attachmentId");
      super();
      this.messageId = var1;
      this.totalDurationSecs = var2;
      this.endDurationSecs = var3;
      this.senderUserId = var4;
      this.durationListeningSecs = var6;
      this.isVoiceMessage = var7;
      this.attachmentId = var8;
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
      q.h(var1, "messageId");
      q.h(var8, "attachmentId");
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
            return q.c(this.attachmentId, var1.attachmentId);
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 (
                                          (MessageId.hashCode-impl(this.messageId) * 31 + java.lang.Float.hashCode(this.totalDurationSecs)) * 31
                                             + java.lang.Float.hashCode(this.endDurationSecs)
                                       )
                                       * 31
                                    + UserId.hashCode-impl(this.senderUserId)
                              )
                              * 31
                           + java.lang.Float.hashCode(this.durationListeningSecs)
                     )
                     * 31
                  + java.lang.Boolean.hashCode(this.isVoiceMessage)
            )
            * 31
         + this.attachmentId.hashCode();
   }

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var5: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: Float = this.totalDurationSecs;
      val var2: Float = this.endDurationSecs;
      val var7: java.lang.String = UserId.toString-impl(this.senderUserId);
      val var3: Float = this.durationListeningSecs;
      val var4: Boolean = this.isVoiceMessage;
      val var8: java.lang.String = this.attachmentId;
      val var6: StringBuilder = new StringBuilder();
      var6.append("MediaAttachmentPlaybackEndedData(messageId=");
      var6.append(var5);
      var6.append(", totalDurationSecs=");
      var6.append(var1);
      var6.append(", endDurationSecs=");
      var6.append(var2);
      var6.append(", senderUserId=");
      var6.append(var7);
      var6.append(", durationListeningSecs=");
      var6.append(var3);
      var6.append(", isVoiceMessage=");
      var6.append(var4);
      var6.append(", attachmentId=");
      var6.append(var8);
      var6.append(")");
      return var6.toString();
   }

   public object `$serializer` : g0 {
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
         return new KSerializer[]{MessageId.$serializer.INSTANCE, f0.a, f0.a, UserId.$serializer.INSTANCE, f0.a, h.a, b2.a};
      }

      public open fun deserialize(decoder: Decoder): MediaAttachmentPlaybackEndedData {
         q.h(var1, "decoder");
         val var13: SerialDescriptor = this.getDescriptor();
         val var14: c = var1.c(var13);
         var var2: Float;
         var var3: Float;
         val var5: Float;
         var var6: Int;
         var var9: Boolean;
         val var17: java.lang.String;
         var var24: Any;
         var var26: java.lang.String;
         if (var14.y()) {
            val var15: MessageId = var14.m(var13, 0, MessageId.$serializer.INSTANCE, null) as MessageId;
            val var16: java.lang.String;
            if (var15 != null) {
               var16 = var15.unbox-impl();
            } else {
               var16 = null;
            }

            var3 = var14.G(var13, 1);
            val var4: Float = var14.G(var13, 2);
            val var12: UserId = var14.m(var13, 3, UserId.$serializer.INSTANCE, null) as UserId;
            var2 = var14.G(var13, 4);
            var9 = var14.s(var13, 5);
            var17 = var14.t(var13, 6);
            var6 = 127;
            var26 = var16;
            var5 = var4;
            var24 = var12;
         } else {
            var var21: Float = 0.0F;
            var3 = 0.0F;
            var2 = 0.0F;
            var var7: Boolean = true;
            var9 = false;
            var6 = 0;
            var26 = null;
            var24 = null;
            var var18: Any = null;

            while (var7) {
               val var8: Int = var14.x(var13);
               switch (var8) {
                  case -1:
                     var7 = false;
                     break;
                  case 0:
                     val var27: MessageId;
                     if (var26 != null) {
                        var27 = MessageId.box-impl(var26);
                     } else {
                        var27 = null;
                     }

                     val var28: MessageId = var14.m(var13, 0, MessageId.$serializer.INSTANCE, var27) as MessageId;
                     if (var28 != null) {
                        var26 = var28.unbox-impl();
                     } else {
                        var26 = null;
                     }

                     var6 |= 1;
                     break;
                  case 1:
                     var2 = var14.G(var13, 1);
                     var6 |= 2;
                     break;
                  case 2:
                     var3 = var14.G(var13, 2);
                     var6 |= 4;
                     break;
                  case 3:
                     var18 = var14.m(var13, 3, UserId.$serializer.INSTANCE, var18) as UserId;
                     var6 |= 8;
                     break;
                  case 4:
                     var21 = var14.G(var13, 4);
                     var6 |= 16;
                     break;
                  case 5:
                     var9 = var14.s(var13, 5);
                     var6 |= 32;
                     break;
                  case 6:
                     var24 = var14.t(var13, 6);
                     var6 |= 64;
                     break;
                  default:
                     throw new n(var8);
               }
            }

            var17 = (java.lang.String)var24;
            var2 = var21;
            var24 = var18;
            var5 = var3;
            var3 = var2;
         }

         var14.b(var13);
         return new MediaAttachmentPlaybackEndedData(var6, var26, var3, var5, (UserId)var24, var2, var9, var17, null, null);
      }

      public open fun serialize(encoder: Encoder, value: MediaAttachmentPlaybackEndedData) {
         q.h(var1, "encoder");
         q.h(var2, "value");
         val var3: SerialDescriptor = this.getDescriptor();
         val var4: CompositeEncoder = var1.c(var3);
         MediaAttachmentPlaybackEndedData.write$Self$chat_release(var2, var4, var3);
         var4.b(var3);
      }

      fun typeParametersSerializers(): Array<KSerializer> {
         return a.a(this);
      }
   }

   public companion object {
      public fun serializer(): KSerializer<MediaAttachmentPlaybackEndedData> {
         return MediaAttachmentPlaybackEndedData.$serializer.INSTANCE;
      }
   }
}
