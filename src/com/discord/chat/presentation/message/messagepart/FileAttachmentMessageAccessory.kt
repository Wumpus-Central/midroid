package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.bridge.spoiler.SpoilerAttributes
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

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
      q.h(var1, "messageId");
      q.h(var2, "attachment");
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
      return this.messageId;
   }

   public operator fun component2(): Attachment {
      return this.attachment;
   }

   public operator fun component3(): Int {
      return this.attachmentIndex;
   }

   public operator fun component4(): Float? {
      return this.attachmentsOpacity;
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
      q.h(var1, "messageId");
      q.h(var2, "attachment");
      return new FileAttachmentMessageAccessory(var1, var2, var3, var4, var5, var6, var7, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is FileAttachmentMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!q.c(this.attachment, var1.attachment)) {
            return false;
         } else if (this.attachmentIndex != var1.attachmentIndex) {
            return false;
         } else if (!q.c(this.attachmentsOpacity, var1.attachmentsOpacity)) {
            return false;
         } else if (!q.c(this.spoilerAttributes, var1.spoilerAttributes)) {
            return false;
         } else if (!q.c(this.uploaderId, var1.uploaderId)) {
            return false;
         } else {
            return q.c(this.uploaderItemId, var1.uploaderItemId);
         }
      }
   }

   public override fun hashCode(): Int {
      val var5: Int = MessageId.hashCode-impl(this.messageId);
      val var6: Int = this.attachment.hashCode();
      val var7: Int = Integer.hashCode(this.attachmentIndex);
      var var4: Int = 0;
      val var1: Int;
      if (this.attachmentsOpacity == null) {
         var1 = 0;
      } else {
         var1 = this.attachmentsOpacity.hashCode();
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

      return (((((var5 * 31 + var6) * 31 + var7) * 31 + var1) * 31 + var2) * 31 + var3) * 31 + var4;
   }

   public override fun toString(): String {
      val var3: java.lang.String = MessageId.toString-impl(this.messageId);
      val var2: Attachment = this.attachment;
      val var1: Int = this.attachmentIndex;
      val var5: java.lang.Float = this.attachmentsOpacity;
      val var7: SpoilerAttributes = this.spoilerAttributes;
      val var8: java.lang.String = this.uploaderId;
      val var6: java.lang.String = this.uploaderItemId;
      val var4: StringBuilder = new StringBuilder();
      var4.append("FileAttachmentMessageAccessory(messageId=");
      var4.append(var3);
      var4.append(", attachment=");
      var4.append(var2);
      var4.append(", attachmentIndex=");
      var4.append(var1);
      var4.append(", attachmentsOpacity=");
      var4.append(var5);
      var4.append(", spoilerAttributes=");
      var4.append(var7);
      var4.append(", uploaderId=");
      var4.append(var8);
      var4.append(", uploaderItemId=");
      var4.append(var6);
      var4.append(")");
      return var4.toString();
   }
}
