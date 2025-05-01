package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.voiceinviteembed.VoiceInviteEmbed
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

public data class VoiceInviteMessageAccessory(messageId: MessageId, embed: VoiceInviteEmbed) : VoiceInviteMessageAccessory(var1, var2) {
   public final val embed: VoiceInviteEmbed
   public open val messageId: MessageId

   fun VoiceInviteMessageAccessory(var1: java.lang.String, var2: VoiceInviteEmbed) {
      q.h(var1, "messageId");
      q.h(var2, "embed");
      super(var1, "safety policy notice embed", false, 4, null);
      this.messageId = var1;
      this.embed = var2;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): VoiceInviteEmbed {
      return this.embed;
   }

   public fun copy(messageId: MessageId = ..., embed: VoiceInviteEmbed = ...): VoiceInviteMessageAccessory {
      q.h(var1, "messageId");
      q.h(var2, "embed");
      return new VoiceInviteMessageAccessory(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is VoiceInviteMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else {
            return q.c(this.embed, var1.embed);
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.messageId) * 31 + this.embed.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.messageId);
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
