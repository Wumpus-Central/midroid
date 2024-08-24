package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.voiceinviteembed.VoiceInviteEmbed
import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

public data class VoiceInviteMessageAccessory(messageId: MessageId, embed: VoiceInviteEmbed) : VoiceInviteMessageAccessory(var1, var2) {
   public final val embed: VoiceInviteEmbed
   public open val messageId: MessageId

   fun VoiceInviteMessageAccessory(var1: java.lang.String, var2: VoiceInviteEmbed) {
      super(var1, "safety policy notice embed", false, 4, null);
      this.messageId = var1;
      this.embed = var2;
   }

   public operator fun component1(): MessageId {
      return this.getMessageId-3Eiw7ao();
   }

   public operator fun component2(): VoiceInviteEmbed {
      return this.embed;
   }

   public fun copy(messageId: MessageId = ..., embed: VoiceInviteEmbed = ...): VoiceInviteMessageAccessory {
      r.h(var1, "messageId");
      r.h(var2, "embed");
      return new VoiceInviteMessageAccessory(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is VoiceInviteMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.getMessageId-3Eiw7ao(), var1.getMessageId-3Eiw7ao())) {
            return false;
         } else {
            return r.c(this.embed, var1.embed);
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.getMessageId-3Eiw7ao()) * 31 + this.embed.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.getMessageId-3Eiw7ao());
      val var2: VoiceInviteEmbed = this.embed;
      val var3: StringBuilder = new StringBuilder();
      var3.append("VoiceInviteMessageAccessory(messageId=");
      var3.append(var1);
      var3.append(", embed=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }
}
