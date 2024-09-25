package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.activities.ActivityInviteEmbed
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

public data class ActivityInviteEmbedMessageAccessory(messageId: MessageId, activityInviteEmbed: ActivityInviteEmbed) : ActivityInviteEmbedMessageAccessory(
      var1, var2
   ) {
   public final val activityInviteEmbed: ActivityInviteEmbed
   public open val messageId: MessageId

   fun ActivityInviteEmbedMessageAccessory(var1: java.lang.String, var2: ActivityInviteEmbed) {
      q.h(var1, "messageId");
      q.h(var2, "activityInviteEmbed");
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
      q.h(var1, "messageId");
      q.h(var2, "activityInviteEmbed");
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
            return q.c(this.activityInviteEmbed, var1.activityInviteEmbed);
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.messageId) * 31 + this.activityInviteEmbed.hashCode();
   }

   public override fun toString(): String {
      val var3: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: ActivityInviteEmbed = this.activityInviteEmbed;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ActivityInviteEmbedMessageAccessory(messageId=");
      var2.append(var3);
      var2.append(", activityInviteEmbed=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }
}
