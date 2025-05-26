package com.discord.chat.reactevents

import Ka.f
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import com.discord.reactevents.ReactEvent
import com.facebook.react.bridge.WritableMap
import kotlin.jvm.internal.q
import kotlinx.serialization.KSerializer

@f
public data class MediaAttachmentPlaybackStartedData(messageId: MessageId,
      totalDurationSecs: Float,
      startDurationSecs: Float,
      senderUserId: UserId,
      isVoiceMessage: Boolean,
      attachmentId: String
   ) : MediaAttachmentPlaybackStartedData(var1, var2, var3, var4, var6, var7),
   ReactEvent {
   public final val messageId: MessageId
   public final val totalDurationSecs: Float
   public final val startDurationSecs: Float
   public final val senderUserId: UserId
   public final val isVoiceMessage: Boolean
   public final val attachmentId: String

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

   override fun serialize(): WritableMap {
      return ReactEvent.DefaultImpls.serialize(this);
   }

   public override fun toString(): String {
      val var4: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: Float = this.totalDurationSecs;
      val var2: Float = this.startDurationSecs;
      val var5: java.lang.String = UserId.toString-impl(this.senderUserId);
      val var3: Boolean = this.isVoiceMessage;
      val var7: java.lang.String = this.attachmentId;
      val var6: StringBuilder = new StringBuilder();
      var6.append("MediaAttachmentPlaybackStartedData(messageId=");
      var6.append(var4);
      var6.append(", totalDurationSecs=");
      var6.append(var1);
      var6.append(", startDurationSecs=");
      var6.append(var2);
      var6.append(", senderUserId=");
      var6.append(var5);
      var6.append(", isVoiceMessage=");
      var6.append(var3);
      var6.append(", attachmentId=");
      var6.append(var7);
      var6.append(")");
      return var6.toString();
   }

   public companion object {
      public fun serializer(): KSerializer<MediaAttachmentPlaybackStartedData> {
         return MediaAttachmentPlaybackStartedData.$serializer.INSTANCE;
      }
   }
}
