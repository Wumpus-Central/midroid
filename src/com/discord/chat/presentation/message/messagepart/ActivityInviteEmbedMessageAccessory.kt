package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.activities.ActivityInviteEmbed
import com.discord.primitives.MessageId

public data class ActivityInviteEmbedMessageAccessory(messageId: MessageId, activityInviteEmbed: ActivityInviteEmbed) : ActivityInviteEmbedMessageAccessory(
      var1, var2
   ) {
   public open val messageId: MessageId
   public final val activityInviteEmbed: ActivityInviteEmbed

   fun ActivityInviteEmbedMessageAccessory(var1: java.lang.String, var2: ActivityInviteEmbed) {
      super(var1, "activity invite embed message", false, 4, null);
      this.messageId = var1;
      this.activityInviteEmbed = var2;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): ActivityInviteEmbed {
      return this.activityInviteEmbed;
   }

   public fun copy(messageId: MessageId = ..., activityInviteEmbed: ActivityInviteEmbed = ...): ActivityInviteEmbedMessageAccessory {
      return new ActivityInviteEmbedMessageAccessory(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ActivityInviteEmbedMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else {
            return this.activityInviteEmbed == var1.activityInviteEmbed;
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.messageId) * 31 + this.activityInviteEmbed.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: ActivityInviteEmbed = this.activityInviteEmbed;
      val var3: StringBuilder = new StringBuilder();
      var3.append("ActivityInviteEmbedMessageAccessory(messageId=");
      var3.append(var2);
      var3.append(", activityInviteEmbed=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }
}
