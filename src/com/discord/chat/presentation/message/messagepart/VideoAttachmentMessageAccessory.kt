package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.attachment.Attachment
import com.discord.chat.bridge.spoiler.SpoilerAttributes
import com.discord.chat.presentation.media.PortalUiModel
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

public data class VideoAttachmentMessageAccessory(channelId: ChannelId,
      messageId: MessageId,
      index: Int,
      attachment: Attachment,
      attachmentsOpacity: Float?,
      constrainedWidth: Int,
      radiusPx: Int,
      spoilerAttributes: SpoilerAttributes?,
      useNewAltTextButton: Boolean,
      hideMediaPlayButton: Boolean
   ) : VideoAttachmentMessageAccessory(var1, var3, var4, var5, var6, var7, var8, var9, var10, var11),
   PortalUiModel {
   public open val attachment: Attachment
   public open val attachmentsOpacity: Float?
   public final val channelId: ChannelId
   public final val constrainedWidth: Int
   public final val hideMediaPlayButton: Boolean
   public open val index: Int
   public open val messageId: MessageId
   public final val radiusPx: Int
   public final val spoilerAttributes: SpoilerAttributes?
   public final val useNewAltTextButton: Boolean

   fun VideoAttachmentMessageAccessory(
      var1: Long,
      var3: java.lang.String,
      var4: Int,
      var5: Attachment,
      var6: java.lang.Float,
      var7: Int,
      var8: Int,
      var9: SpoilerAttributes,
      var10: Boolean,
      var11: Boolean
   ) {
      q.h(var3, "messageId");
      q.h(var5, "attachment");
      super(var3, var5, var4, var6, null);
      this.channelId = var1;
      this.messageId = var3;
      this.index = var4;
      this.attachment = var5;
      this.attachmentsOpacity = var6;
      this.constrainedWidth = var7;
      this.radiusPx = var8;
      this.spoilerAttributes = var9;
      this.useNewAltTextButton = var10;
      this.hideMediaPlayButton = var11;
   }

   public operator fun component1(): ChannelId {
      return this.channelId;
   }

   public operator fun component10(): Boolean {
      return this.hideMediaPlayButton;
   }

   public operator fun component2(): MessageId {
      return this.messageId;
   }

   public operator fun component3(): Int {
      return this.index;
   }

   public operator fun component4(): Attachment {
      return this.attachment;
   }

   public operator fun component5(): Float? {
      return this.attachmentsOpacity;
   }

   public operator fun component6(): Int {
      return this.constrainedWidth;
   }

   public operator fun component7(): Int {
      return this.radiusPx;
   }

   public operator fun component8(): SpoilerAttributes? {
      return this.spoilerAttributes;
   }

   public operator fun component9(): Boolean {
      return this.useNewAltTextButton;
   }

   public fun copy(
      channelId: ChannelId = ...,
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
      q.h(var3, "messageId");
      q.h(var5, "attachment");
      return new VideoAttachmentMessageAccessory(var1, var3, var4, var5, var6, var7, var8, var9, var10, var11, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is VideoAttachmentMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!ChannelId.equals-impl0(this.channelId, var1.channelId)) {
            return false;
         } else if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (this.index != var1.index) {
            return false;
         } else if (!q.c(this.attachment, var1.attachment)) {
            return false;
         } else if (!q.c(this.attachmentsOpacity, var1.attachmentsOpacity)) {
            return false;
         } else if (this.constrainedWidth != var1.constrainedWidth) {
            return false;
         } else if (this.radiusPx != var1.radiusPx) {
            return false;
         } else if (!q.c(this.spoilerAttributes, var1.spoilerAttributes)) {
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
      val var6: Int = ChannelId.hashCode-impl(this.channelId);
      val var5: Int = MessageId.hashCode-impl(this.messageId);
      val var4: Int = Integer.hashCode(this.index);
      val var3: Int = this.attachment.hashCode();
      var var2: Int = 0;
      val var1: Int;
      if (this.attachmentsOpacity == null) {
         var1 = 0;
      } else {
         var1 = this.attachmentsOpacity.hashCode();
      }

      val var7: Int = Integer.hashCode(this.constrainedWidth);
      val var8: Int = Integer.hashCode(this.radiusPx);
      if (this.spoilerAttributes != null) {
         var2 = this.spoilerAttributes.hashCode();
      }

      return (
               (((((((var6 * 31 + var5) * 31 + var4) * 31 + var3) * 31 + var1) * 31 + var7) * 31 + var8) * 31 + var2) * 31
                  + java.lang.Boolean.hashCode(this.useNewAltTextButton)
            )
            * 31
         + java.lang.Boolean.hashCode(this.hideMediaPlayButton);
   }

   public override fun toString(): String {
      val var8: java.lang.String = ChannelId.toString-impl(this.channelId);
      val var11: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: Int = this.index;
      val var10: Attachment = this.attachment;
      val var6: java.lang.Float = this.attachmentsOpacity;
      val var3: Int = this.constrainedWidth;
      val var2: Int = this.radiusPx;
      val var9: SpoilerAttributes = this.spoilerAttributes;
      val var4: Boolean = this.useNewAltTextButton;
      val var5: Boolean = this.hideMediaPlayButton;
      val var7: StringBuilder = new StringBuilder();
      var7.append("VideoAttachmentMessageAccessory(channelId=");
      var7.append(var8);
      var7.append(", messageId=");
      var7.append(var11);
      var7.append(", index=");
      var7.append(var1);
      var7.append(", attachment=");
      var7.append(var10);
      var7.append(", attachmentsOpacity=");
      var7.append(var6);
      var7.append(", constrainedWidth=");
      var7.append(var3);
      var7.append(", radiusPx=");
      var7.append(var2);
      var7.append(", spoilerAttributes=");
      var7.append(var9);
      var7.append(", useNewAltTextButton=");
      var7.append(var4);
      var7.append(", hideMediaPlayButton=");
      var7.append(var5);
      var7.append(")");
      return var7.toString();
   }
}
