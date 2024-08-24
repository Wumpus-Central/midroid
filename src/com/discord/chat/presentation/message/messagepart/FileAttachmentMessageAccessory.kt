package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.bridge.spoiler.SpoilerAttributes
import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

public data class FileAttachmentMessageAccessory(messageId: MessageId,
   attachment: Attachment,
   attachmentIndex: Int,
   attachmentsOpacity: Float?,
   spoilerAttributes: SpoilerAttributes?,
   uploaderId: String?,
   uploaderItemId: String?
) : FileAttachmentMessageAccessory(var1, var2, var3, var4, var5, var6, var7) {
   public open val attachment: Attachment
   public open val attachmentIndex: Int
   public open val attachmentsOpacity: Float?
   public open val messageId: MessageId
   public final val spoilerAttributes: SpoilerAttributes?
   public final val uploaderId: String?
   public final val uploaderItemId: String?

   fun FileAttachmentMessageAccessory(
      var1: java.lang.String, var2: Attachment, var3: Int, var4: java.lang.Float, var5: SpoilerAttributes, var6: java.lang.String, var7: java.lang.String
   ) {
      super(var1, var2, var3, var4, null);
      this.messageId = var1;
      this.attachment = var2;
      this.attachmentIndex = var3;
      this.attachmentsOpacity = var4;
      this.spoilerAttributes = var5;
      this.uploaderId = var6;
      this.uploaderItemId = var7;
   }

   public operator fun component1(): MessageId {
      return this.getMessageId-3Eiw7ao();
   }

   public operator fun component2(): Attachment {
      return this.getAttachment();
   }

   public operator fun component3(): Int {
      return this.getAttachmentIndex();
   }

   public operator fun component4(): Float? {
      return this.getAttachmentsOpacity();
   }

   public operator fun component5(): SpoilerAttributes? {
      return this.spoilerAttributes;
   }

   public operator fun component6(): String? {
      return this.uploaderId;
   }

   public operator fun component7(): String? {
      return this.uploaderItemId;
   }

   public fun copy(
      messageId: MessageId = ...,
      attachment: Attachment = ...,
      attachmentIndex: Int = ...,
      attachmentsOpacity: Float? = ...,
      spoilerAttributes: SpoilerAttributes? = ...,
      uploaderId: String? = ...,
      uploaderItemId: String? = ...
   ): FileAttachmentMessageAccessory {
      r.h(var1, "messageId");
      r.h(var2, "attachment");
      return new FileAttachmentMessageAccessory(var1, var2, var3, var4, var5, var6, var7, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is FileAttachmentMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.getMessageId-3Eiw7ao(), var1.getMessageId-3Eiw7ao())) {
            return false;
         } else if (!r.c(this.getAttachment(), var1.getAttachment())) {
            return false;
         } else if (this.getAttachmentIndex() != var1.getAttachmentIndex()) {
            return false;
         } else if (!r.c(this.getAttachmentsOpacity(), var1.getAttachmentsOpacity())) {
            return false;
         } else if (!r.c(this.spoilerAttributes, var1.spoilerAttributes)) {
            return false;
         } else if (!r.c(this.uploaderId, var1.uploaderId)) {
            return false;
         } else {
            return r.c(this.uploaderItemId, var1.uploaderItemId);
         }
      }
   }

   public override fun hashCode(): Int {
      val var7: Int = MessageId.hashCode-impl(this.getMessageId-3Eiw7ao());
      val var6: Int = this.getAttachment().hashCode();
      val var5: Int = Integer.hashCode(this.getAttachmentIndex());
      val var8: java.lang.Float = this.getAttachmentsOpacity();
      var var4: Int = 0;
      val var1: Int;
      if (var8 == null) {
         var1 = 0;
      } else {
         var1 = this.getAttachmentsOpacity().hashCode();
      }

      val var2: Int;
      if (this.spoilerAttributes == null) {
         var2 = 0;
      } else {
         var2 = this.spoilerAttributes.hashCode();
      }

      val var3: Int;
      if (this.uploaderId == null) {
         var3 = 0;
      } else {
         var3 = this.uploaderId.hashCode();
      }

      if (this.uploaderItemId != null) {
         var4 = this.uploaderItemId.hashCode();
      }

      return (((((var7 * 31 + var6) * 31 + var5) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4;
   }

   public override fun toString(): String {
      val var5: java.lang.String = MessageId.toString-impl(this.getMessageId-3Eiw7ao());
      val var4: Attachment = this.getAttachment();
      val var1: Int = this.getAttachmentIndex();
      val var2: java.lang.Float = this.getAttachmentsOpacity();
      val var7: SpoilerAttributes = this.spoilerAttributes;
      val var3: java.lang.String = this.uploaderId;
      val var6: java.lang.String = this.uploaderItemId;
      val var8: StringBuilder = new StringBuilder();
      var8.append("FileAttachmentMessageAccessory(messageId=");
      var8.append(var5);
      var8.append(", attachment=");
      var8.append(var4);
      var8.append(", attachmentIndex=");
      var8.append(var1);
      var8.append(", attachmentsOpacity=");
      var8.append(var2);
      var8.append(", spoilerAttributes=");
      var8.append(var7);
      var8.append(", uploaderId=");
      var8.append(var3);
      var8.append(", uploaderItemId=");
      var8.append(var6);
      var8.append(")");
      return var8.toString();
   }
}
