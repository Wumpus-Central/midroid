package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.codedlinks.EmbeddedActivityInviteEmbedImpl
import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

public data class EmbeddedActivityInviteMessageAccessory(messageId: MessageId,
   codedLinkIndex: Int,
   embeddedActivityInviteEmbed: EmbeddedActivityInviteEmbedImpl,
   constrainedWidth: Int
) : EmbeddedActivityInviteMessageAccessory(var1, var2, var3, var4) {
   public final val codedLinkIndex: Int
   public final val constrainedWidth: Int
   public final val embeddedActivityInviteEmbed: EmbeddedActivityInviteEmbedImpl
   public open val messageId: MessageId

   fun EmbeddedActivityInviteMessageAccessory(var1: java.lang.String, var2: Int, var3: EmbeddedActivityInviteEmbedImpl, var4: Int) {
      val var5: StringBuilder = new StringBuilder();
      var5.append("embedded activity invite ");
      var5.append(var2);
      super(var1, var5.toString(), false, 4, null);
      this.messageId = var1;
      this.codedLinkIndex = var2;
      this.embeddedActivityInviteEmbed = var3;
      this.constrainedWidth = var4;
   }

   public operator fun component1(): MessageId {
      return this.getMessageId-3Eiw7ao();
   }

   public operator fun component2(): Int {
      return this.codedLinkIndex;
   }

   public operator fun component3(): EmbeddedActivityInviteEmbedImpl {
      return this.embeddedActivityInviteEmbed;
   }

   public operator fun component4(): Int {
      return this.constrainedWidth;
   }

   public fun copy(
      messageId: MessageId = ...,
      codedLinkIndex: Int = ...,
      embeddedActivityInviteEmbed: EmbeddedActivityInviteEmbedImpl = ...,
      constrainedWidth: Int = ...
   ): EmbeddedActivityInviteMessageAccessory {
      r.h(var1, "messageId");
      r.h(var3, "embeddedActivityInviteEmbed");
      return new EmbeddedActivityInviteMessageAccessory(var1, var2, var3, var4, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EmbeddedActivityInviteMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.getMessageId-3Eiw7ao(), var1.getMessageId-3Eiw7ao())) {
            return false;
         } else if (this.codedLinkIndex != var1.codedLinkIndex) {
            return false;
         } else if (!r.c(this.embeddedActivityInviteEmbed, var1.embeddedActivityInviteEmbed)) {
            return false;
         } else {
            return this.constrainedWidth == var1.constrainedWidth;
         }
      }
   }

   public override fun hashCode(): Int {
      return (
               (MessageId.hashCode-impl(this.getMessageId-3Eiw7ao()) * 31 + Integer.hashCode(this.codedLinkIndex)) * 31
                  + this.embeddedActivityInviteEmbed.hashCode()
            )
            * 31
         + Integer.hashCode(this.constrainedWidth);
   }

   public override fun toString(): String {
      val var5: java.lang.String = MessageId.toString-impl(this.getMessageId-3Eiw7ao());
      val var1: Int = this.codedLinkIndex;
      val var4: EmbeddedActivityInviteEmbedImpl = this.embeddedActivityInviteEmbed;
      val var2: Int = this.constrainedWidth;
      val var3: StringBuilder = new StringBuilder();
      var3.append("EmbeddedActivityInviteMessageAccessory(messageId=");
      var3.append(var5);
      var3.append(", codedLinkIndex=");
      var3.append(var1);
      var3.append(", embeddedActivityInviteEmbed=");
      var3.append(var4);
      var3.append(", constrainedWidth=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }
}
