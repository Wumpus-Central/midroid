package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.bridge.spoiler.SpoilerAttributes
import com.discord.chat.presentation.media.PortalUiModel
import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

public data class VideoAttachmentMessageAccessory(messageId: MessageId,
      index: Int,
      attachment: Attachment,
      attachmentsOpacity: Float?,
      constrainedWidth: Int,
      radiusPx: Int,
      spoilerAttributes: SpoilerAttributes?,
      useNewAltTextButton: Boolean,
      hideMediaPlayButton: Boolean
   ) : VideoAttachmentMessageAccessory(var1, var2, var3, var4, var5, var6, var7, var8, var9),
   PortalUiModel {
   public open val attachment: Attachment
   public open val attachmentsOpacity: Float?
   public final val constrainedWidth: Int
   public final val hideMediaPlayButton: Boolean
   public open val index: Int
   public open val messageId: MessageId
   public final val radiusPx: Int
   public final val spoilerAttributes: SpoilerAttributes?
   public final val useNewAltTextButton: Boolean

   fun VideoAttachmentMessageAccessory(
      var1: java.lang.String, var2: Int, var3: Attachment, var4: java.lang.Float, var5: Int, var6: Int, var7: SpoilerAttributes, var8: Boolean, var9: Boolean
   ) {
      super(var1, var3, var2, var4, null);
      this.messageId = var1;
      this.index = var2;
      this.attachment = var3;
      this.attachmentsOpacity = var4;
      this.constrainedWidth = var5;
      this.radiusPx = var6;
      this.spoilerAttributes = var7;
      this.useNewAltTextButton = var8;
      this.hideMediaPlayButton = var9;
   }

   public operator fun component1(): MessageId {
      return this.getMessageId-3Eiw7ao();
   }

   public operator fun component2(): Int {
      return this.getIndex();
   }

   public operator fun component3(): Attachment {
      return this.getAttachment();
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

   public operator fun component9(): Boolean {
      return this.hideMediaPlayButton;
   }

   public fun copy(
      messageId: MessageId = ...,
      index: Int = ...,
      attachment: Attachment = ...,
      attachmentsOpacity: Float? = ...,
      constrainedWidth: Int = ...,
      radiusPx: Int = ...,
      spoilerAttributes: SpoilerAttributes? = ...,
      useNewAltTextButton: Boolean = ...,
      hideMediaPlayButton: Boolean = ...
   ): VideoAttachmentMessageAccessory {
      r.h(var1, "messageId");
      r.h(var3, "attachment");
      return new VideoAttachmentMessageAccessory(var1, var2, var3, var4, var5, var6, var7, var8, var9, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is VideoAttachmentMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.getMessageId-3Eiw7ao(), var1.getMessageId-3Eiw7ao())) {
            return false;
         } else if (this.getIndex() != var1.getIndex()) {
            return false;
         } else if (!r.c(this.getAttachment(), var1.getAttachment())) {
            return false;
         } else if (!r.c(this.getAttachmentsOpacity(), var1.getAttachmentsOpacity())) {
            return false;
         } else if (this.constrainedWidth != var1.constrainedWidth) {
            return false;
         } else if (this.radiusPx != var1.radiusPx) {
            return false;
         } else if (!r.c(this.spoilerAttributes, var1.spoilerAttributes)) {
            return false;
         } else if (this.useNewAltTextButton != var1.useNewAltTextButton) {
            return false;
         } else {
            return this.hideMediaPlayButton == var1.hideMediaPlayButton;
         }
      }
   }

   override fun getPortal(): Double {
      return PortalUiModel.DefaultImpls.getPortal(this);
   }

   public override fun hashCode(): Int {
      val var7: Int = MessageId.hashCode-impl(this.getMessageId-3Eiw7ao());
      val var6: Int = Integer.hashCode(this.getIndex());
      val var8: Int = this.getAttachment().hashCode();
      val var11: java.lang.Float = this.getAttachmentsOpacity();
      var var2: Int = 0;
      val var1: Int;
      if (var11 == null) {
         var1 = 0;
      } else {
         var1 = this.getAttachmentsOpacity().hashCode();
      }

      val var10: Int = Integer.hashCode(this.constrainedWidth);
      val var9: Int = Integer.hashCode(this.radiusPx);
      if (this.spoilerAttributes != null) {
         var2 = this.spoilerAttributes.hashCode();
      }

      var var4: Byte = 1;
      var var3: Byte = this.useNewAltTextButton;
      if (this.useNewAltTextButton != 0) {
         var3 = 1;
      }

      if (this.hideMediaPlayButton == 0) {
         var4 = this.hideMediaPlayButton;
      }

      return (((((((var7 * 31 + var6) * 31 + var8) * 31 + var1) * 31 + var10) * 31 + var9) * 31 + var2) * 31 + var3) * 31 + var4;
   }

   public override fun toString(): String {
      val var9: java.lang.String = MessageId.toString-impl(this.getMessageId-3Eiw7ao());
      val var3: Int = this.getIndex();
      val var8: Attachment = this.getAttachment();
      val var6: java.lang.Float = this.getAttachmentsOpacity();
      val var1: Int = this.constrainedWidth;
      val var2: Int = this.radiusPx;
      val var10: SpoilerAttributes = this.spoilerAttributes;
      val var4: Boolean = this.useNewAltTextButton;
      val var5: Boolean = this.hideMediaPlayButton;
      val var7: StringBuilder = new StringBuilder();
      var7.append("VideoAttachmentMessageAccessory(messageId=");
      var7.append(var9);
      var7.append(", index=");
      var7.append(var3);
      var7.append(", attachment=");
      var7.append(var8);
      var7.append(", attachmentsOpacity=");
      var7.append(var6);
      var7.append(", constrainedWidth=");
      var7.append(var1);
      var7.append(", radiusPx=");
      var7.append(var2);
      var7.append(", spoilerAttributes=");
      var7.append(var10);
      var7.append(", useNewAltTextButton=");
      var7.append(var4);
      var7.append(", hideMediaPlayButton=");
      var7.append(var5);
      var7.append(")");
      return var7.toString();
   }
}
