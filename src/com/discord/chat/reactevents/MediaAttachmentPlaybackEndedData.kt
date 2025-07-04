package com.discord.chat.reactevents

import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.r
import kotlinx.serialization.KSerializer
import sb.f

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
   public final val messageId: MessageId
   public final val totalDurationSecs: Float
   public final val endDurationSecs: Float
   public final val senderUserId: UserId
   public final val durationListeningSecs: Float
   public final val isVoiceMessage: Boolean
   public final val attachmentId: String

   fun MediaAttachmentPlaybackEndedData(var1: java.lang.String, var2: Float, var3: Float, var4: Long, var6: Float, var7: Boolean, var8: java.lang.String) {
      r.h(var1, "messageId");
      r.h(var8, "attachmentId");
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
      val var6: java.lang.String = MessageId.toString-impl(this.messageId);
      val var2: Float = this.totalDurationSecs;
      val var3: Float = this.endDurationSecs;
      val var8: java.lang.String = UserId.toString-impl(this.senderUserId);
      val var1: Float = this.durationListeningSecs;
      val var4: Boolean = this.isVoiceMessage;
      val var7: java.lang.String = this.attachmentId;
      val var5: StringBuilder = new StringBuilder();
      var5.append("MediaAttachmentPlaybackEndedData(messageId=");
      var5.append(var6);
      var5.append(", totalDurationSecs=");
      var5.append(var2);
      var5.append(", endDurationSecs=");
      var5.append(var3);
      var5.append(", senderUserId=");
      var5.append(var8);
      var5.append(", durationListeningSecs=");
      var5.append(var1);
      var5.append(", isVoiceMessage=");
      var5.append(var4);
      var5.append(", attachmentId=");
      var5.append(var7);
      var5.append(")");
      return var5.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<MediaAttachmentPlaybackEndedData> {
         return MediaAttachmentPlaybackEndedData.$serializer.INSTANCE;
      }
   }
}
