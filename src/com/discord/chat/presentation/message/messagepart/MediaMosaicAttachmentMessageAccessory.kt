package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.MessageState
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

public data class MediaMosaicAttachmentMessageAccessory(messageId: MessageId,
   channelId: ChannelId,
   attachments: List<MessageAttachmentAccessory>,
   constrainedWidth: Int,
   isForwardedContent: Boolean,
   messageState: MessageState,
   shouldAutoPlayGif: Boolean
) : MediaMosaicAttachmentMessageAccessory(var1, var2, var4, var5, var6, var7, var8) {
   public open val messageId: MessageId
   public final val channelId: ChannelId
   public final val attachments: List<MessageAttachmentAccessory>
   public final val constrainedWidth: Int
   public final val isForwardedContent: Boolean
   public final val messageState: MessageState
   public final val shouldAutoPlayGif: Boolean

   fun MediaMosaicAttachmentMessageAccessory(
      var1: java.lang.String, var2: Long, var4: MutableList<MessageAttachmentAccessory>, var5: Int, var6: Boolean, var7: MessageState, var8: Boolean
   ) {
      q.h(var1, "messageId");
      q.h(var4, "attachments");
      q.h(var7, "messageState");
      super(var1, "multimedia attachment", false, 4, null);
      this.messageId = var1;
      this.channelId = var2;
      this.attachments = var4;
      this.constrainedWidth = var5;
      this.isForwardedContent = var6;
      this.messageState = var7;
      this.shouldAutoPlayGif = var8;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): ChannelId {
      return this.channelId;
   }

   public operator fun component3(): List<MessageAttachmentAccessory> {
      return this.attachments;
   }

   public operator fun component4(): Int {
      return this.constrainedWidth;
   }

   public operator fun component5(): Boolean {
      return this.isForwardedContent;
   }

   public operator fun component6(): MessageState {
      return this.messageState;
   }

   public operator fun component7(): Boolean {
      return this.shouldAutoPlayGif;
   }

   public fun copy(
      messageId: MessageId = ...,
      channelId: ChannelId = ...,
      attachments: List<MessageAttachmentAccessory> = ...,
      constrainedWidth: Int = ...,
      isForwardedContent: Boolean = ...,
      messageState: MessageState = ...,
      shouldAutoPlayGif: Boolean = ...
   ): MediaMosaicAttachmentMessageAccessory {
      q.h(var1, "messageId");
      q.h(var4, "attachments");
      q.h(var7, "messageState");
      return new MediaMosaicAttachmentMessageAccessory(var1, var2, var4, var5, var6, var7, var8, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MediaMosaicAttachmentMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!q.c(this.attachments, var1.attachments)) {
            return false;
         } else if (this.constrainedWidth != var1.constrainedWidth) {
            return false;
         } else if (this.isForwardedContent != var1.isForwardedContent) {
            return false;
         } else if (this.messageState != var1.messageState) {
            return false;
         } else {
            return this.shouldAutoPlayGif == var1.shouldAutoPlayGif;
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               (
                        (
                                 ((MessageId.hashCode-impl(this.messageId) * 31 + ChannelId.hashCode-impl(this.channelId)) * 31 + this.attachments.hashCode())
                                       * 31
                                    + Integer.hashCode(this.constrainedWidth)
                              )
                              * 31
                           + java.lang.Boolean.hashCode(this.isForwardedContent)
                     )
                     * 31
                  + this.messageState.hashCode()
            )
            * 31
         + java.lang.Boolean.hashCode(this.shouldAutoPlayGif);
   }

   public override fun toString(): String {
      val var5: java.lang.String = MessageId.toString-impl(this.messageId);
      val var7: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var8: java.util.List = this.attachments;
      val var1: Int = this.constrainedWidth;
      val var3: Boolean = this.isForwardedContent;
      val var4: MessageState = this.messageState;
      val var2: Boolean = this.shouldAutoPlayGif;
      val var6: StringBuilder = new StringBuilder();
      var6.append("MediaMosaicAttachmentMessageAccessory(messageId=");
      var6.append(var5);
      var6.append(", channelId=");
      var6.append(var7);
      var6.append(", attachments=");
      var6.append(var8);
      var6.append(", constrainedWidth=");
      var6.append(var1);
      var6.append(", isForwardedContent=");
      var6.append(var3);
      var6.append(", messageState=");
      var6.append(var4);
      var6.append(", shouldAutoPlayGif=");
      var6.append(var2);
      var6.append(")");
      return var6.toString();
   }
}
