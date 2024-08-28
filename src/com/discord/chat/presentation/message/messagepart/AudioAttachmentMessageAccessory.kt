package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.attachment.Attachment
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.primitives.UserId
import kotlin.jvm.internal.r

public data class AudioAttachmentMessageAccessory(channelId: ChannelId,
   messageId: MessageId,
   attachment: Attachment,
   attachmentIndex: Int,
   attachmentsOpacity: Float?,
   authorId: UserId?,
   color: Int?,
   isVoiceMessage: Boolean
) : AudioAttachmentMessageAccessory(var1, var3, var4, var5, var6, var7, var8, var9) {
   public open val attachment: Attachment
   public open val attachmentIndex: Int
   public open val attachmentsOpacity: Float?
   public final val authorId: UserId?
   public final val channelId: ChannelId
   public final val color: Int?
   public final val isVoiceMessage: Boolean
   public open val messageId: MessageId

   fun AudioAttachmentMessageAccessory(
      var1: Long, var3: java.lang.String, var4: Attachment, var5: Int, var6: java.lang.Float, var7: UserId, var8: Int, var9: Boolean
   ) {
      super(var3, var4, var5, var6, null);
      this.channelId = var1;
      this.messageId = var3;
      this.attachment = var4;
      this.attachmentIndex = var5;
      this.attachmentsOpacity = var6;
      this.authorId = var7;
      this.color = var8;
      this.isVoiceMessage = var9;
   }

   public operator fun component1(): ChannelId {
      return this.channelId;
   }

   public operator fun component2(): MessageId {
      return this.getMessageId-3Eiw7ao();
   }

   public operator fun component3(): Attachment {
      return this.getAttachment();
   }

   public operator fun component4(): Int {
      return this.getAttachmentIndex();
   }

   public operator fun component5(): Float? {
      return this.getAttachmentsOpacity();
   }

   public operator fun component6(): UserId? {
      return this.authorId;
   }

   public operator fun component7(): Int? {
      return this.color;
   }

   public operator fun component8(): Boolean {
      return this.isVoiceMessage;
   }

   public fun copy(
      channelId: ChannelId = ...,
      messageId: MessageId = ...,
      attachment: Attachment = ...,
      attachmentIndex: Int = ...,
      attachmentsOpacity: Float? = ...,
      authorId: UserId? = ...,
      color: Int? = ...,
      isVoiceMessage: Boolean = ...
   ): AudioAttachmentMessageAccessory {
      r.h(var3, "messageId");
      r.h(var4, "attachment");
      return new AudioAttachmentMessageAccessory(var1, var3, var4, var5, var6, var7, var8, var9, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AudioAttachmentMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!MessageId.equals-impl0(this.getMessageId-3Eiw7ao(), var1.getMessageId-3Eiw7ao())) {
            return false;
         } else if (!r.c(this.getAttachment(), var1.getAttachment())) {
            return false;
         } else if (this.getAttachmentIndex() != var1.getAttachmentIndex()) {
            return false;
         } else if (!r.c(this.getAttachmentsOpacity(), var1.getAttachmentsOpacity())) {
            return false;
         } else if (!r.c(this.authorId, var1.authorId)) {
            return false;
         } else if (!r.c(this.color, var1.color)) {
            return false;
         } else {
            return this.isVoiceMessage == var1.isVoiceMessage;
         }
      }
   }

   public override fun hashCode(): Int {
      val var8: Int = ChannelId.hashCode-impl(this.channelId);
      val var9: Int = MessageId.hashCode-impl(this.getMessageId-3Eiw7ao());
      val var6: Int = this.getAttachment().hashCode();
      val var7: Int = Integer.hashCode(this.getAttachmentIndex());
      val var10: java.lang.Float = this.getAttachmentsOpacity();
      var var3: Int = 0;
      val var1: Int;
      if (var10 == null) {
         var1 = 0;
      } else {
         var1 = this.getAttachmentsOpacity().hashCode();
      }

      val var2: Int;
      if (this.authorId == null) {
         var2 = 0;
      } else {
         var2 = UserId.hashCode-impl(this.authorId.unbox-impl());
      }

      if (this.color != null) {
         var3 = this.color.hashCode();
      }

      var var4: Byte = this.isVoiceMessage;
      if (this.isVoiceMessage != 0) {
         var4 = 1;
      }

      return ((((((var8 * 31 + var9) * 31 + var6) * 31 + var7) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4;
   }

   public override fun toString(): String {
      val var3: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var4: java.lang.String = MessageId.toString-impl(this.getMessageId-3Eiw7ao());
      val var8: Attachment = this.getAttachment();
      val var1: Int = this.getAttachmentIndex();
      val var9: java.lang.Float = this.getAttachmentsOpacity();
      val var6: UserId = this.authorId;
      val var5: Int = this.color;
      val var2: Boolean = this.isVoiceMessage;
      val var7: StringBuilder = new StringBuilder();
      var7.append("AudioAttachmentMessageAccessory(channelId=");
      var7.append(var3);
      var7.append(", messageId=");
      var7.append(var4);
      var7.append(", attachment=");
      var7.append(var8);
      var7.append(", attachmentIndex=");
      var7.append(var1);
      var7.append(", attachmentsOpacity=");
      var7.append(var9);
      var7.append(", authorId=");
      var7.append(var6);
      var7.append(", color=");
      var7.append(var5);
      var7.append(", isVoiceMessage=");
      var7.append(var2);
      var7.append(")");
      return var7.toString();
   }
}
