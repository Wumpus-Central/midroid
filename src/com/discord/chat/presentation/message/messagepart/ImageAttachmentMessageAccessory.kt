package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.bridge.spoiler.SpoilerAttributes
import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

public data class ImageAttachmentMessageAccessory(messageId: MessageId,
   attachment: Attachment,
   attachmentIndex: Int,
   attachmentsOpacity: Float?,
   constrainedWidth: Int,
   radiusPx: Int,
   spoilerAttributes: SpoilerAttributes?,
   useNewAltTextButton: Boolean
) : ImageAttachmentMessageAccessory(var1, var2, var3, var4, var5, var6, var7, var8) {
   public open val attachment: Attachment
   public open val attachmentIndex: Int
   public open val attachmentsOpacity: Float?
   public final val constrainedWidth: Int
   public open val messageId: MessageId
   public final val radiusPx: Int
   public final val spoilerAttributes: SpoilerAttributes?
   public final val useNewAltTextButton: Boolean

   fun ImageAttachmentMessageAccessory(
      var1: java.lang.String, var2: Attachment, var3: Int, var4: java.lang.Float, var5: Int, var6: Int, var7: SpoilerAttributes, var8: Boolean
   ) {
      super(var1, var2, var3, var4, null);
      this.messageId = var1;
      this.attachment = var2;
      this.attachmentIndex = var3;
      this.attachmentsOpacity = var4;
      this.constrainedWidth = var5;
      this.radiusPx = var6;
      this.spoilerAttributes = var7;
      this.useNewAltTextButton = var8;
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

   public operator fun component5(): Int {
      return this.constrainedWidth;
   }

   public operator fun component6(): Int {
      return this.radiusPx;
   }

   public operator fun component7(): SpoilerAttributes? {
      return this.spoilerAttributes;
   }

   public operator fun component8(): Boolean {
      return this.useNewAltTextButton;
   }

   public fun copy(
      messageId: MessageId = ...,
      attachment: Attachment = ...,
      attachmentIndex: Int = ...,
      attachmentsOpacity: Float? = ...,
      constrainedWidth: Int = ...,
      radiusPx: Int = ...,
      spoilerAttributes: SpoilerAttributes? = ...,
      useNewAltTextButton: Boolean = ...
   ): ImageAttachmentMessageAccessory {
      r.h(var1, "messageId");
      r.h(var2, "attachment");
      return new ImageAttachmentMessageAccessory(var1, var2, var3, var4, var5, var6, var7, var8, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ImageAttachmentMessageAccessory) {
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
         } else if (this.constrainedWidth != var1.constrainedWidth) {
            return false;
         } else if (this.radiusPx != var1.radiusPx) {
            return false;
         } else if (!r.c(this.spoilerAttributes, var1.spoilerAttributes)) {
            return false;
         } else {
            return this.useNewAltTextButton == var1.useNewAltTextButton;
         }
      }
   }

   public override fun hashCode(): Int {
      val var7: Int = MessageId.hashCode-impl(this.getMessageId-3Eiw7ao());
      val var6: Int = this.getAttachment().hashCode();
      val var5: Int = Integer.hashCode(this.getAttachmentIndex());
      val var10: java.lang.Float = this.getAttachmentsOpacity();
      var var2: Int = 0;
      val var1: Int;
      if (var10 == null) {
         var1 = 0;
      } else {
         var1 = this.getAttachmentsOpacity().hashCode();
      }

      val var9: Int = Integer.hashCode(this.constrainedWidth);
      val var8: Int = Integer.hashCode(this.radiusPx);
      if (this.spoilerAttributes != null) {
         var2 = this.spoilerAttributes.hashCode();
      }

      var var3: Byte = this.useNewAltTextButton;
      if (this.useNewAltTextButton != 0) {
         var3 = 1;
      }

      return ((((((var7 * 31 + var6) * 31 + var5) * 31 + var1) * 31 + var9) * 31 + var8) * 31 + var2) * 31 + var3;
   }

   public override fun toString(): String {
      val var6: java.lang.String = MessageId.toString-impl(this.getMessageId-3Eiw7ao());
      val var7: Attachment = this.getAttachment();
      val var2: Int = this.getAttachmentIndex();
      val var5: java.lang.Float = this.getAttachmentsOpacity();
      val var1: Int = this.constrainedWidth;
      val var3: Int = this.radiusPx;
      val var9: SpoilerAttributes = this.spoilerAttributes;
      val var4: Boolean = this.useNewAltTextButton;
      val var8: StringBuilder = new StringBuilder();
      var8.append("ImageAttachmentMessageAccessory(messageId=");
      var8.append(var6);
      var8.append(", attachment=");
      var8.append(var7);
      var8.append(", attachmentIndex=");
      var8.append(var2);
      var8.append(", attachmentsOpacity=");
      var8.append(var5);
      var8.append(", constrainedWidth=");
      var8.append(var1);
      var8.append(", radiusPx=");
      var8.append(var3);
      var8.append(", spoilerAttributes=");
      var8.append(var9);
      var8.append(", useNewAltTextButton=");
      var8.append(var4);
      var8.append(")");
      return var8.toString();
   }
}
