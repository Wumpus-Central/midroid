package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.activities.ActivityRichPresenceInviteEmbed
import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

public data class ActivityRichPresenceInviteEmbedMessageAccessory(messageId: MessageId, activityRichPresenceInviteEmbed: ActivityRichPresenceInviteEmbed) : ActivityRichPresenceInviteEmbedMessageAccessory(
      var1, var2
   ) {
   public open val messageId: MessageId
   public final val activityRichPresenceInviteEmbed: ActivityRichPresenceInviteEmbed

   fun ActivityRichPresenceInviteEmbedMessageAccessory(var1: java.lang.String, var2: ActivityRichPresenceInviteEmbed) {
      r.h(var1, "messageId");
      r.h(var2, "activityRichPresenceInviteEmbed");
      super(var1, "activity rich presence invite embed message", false, 4, null);
      this.messageId = var1;
      this.activityRichPresenceInviteEmbed = var2;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): ActivityRichPresenceInviteEmbed {
      return this.activityRichPresenceInviteEmbed;
   }

   public fun copy(messageId: MessageId = ..., activityRichPresenceInviteEmbed: ActivityRichPresenceInviteEmbed = ...): ActivityRichPresenceInviteEmbedMessageAccessory {
      r.h(var1, "messageId");
      r.h(var2, "activityRichPresenceInviteEmbed");
      return new ActivityRichPresenceInviteEmbedMessageAccessory(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ActivityRichPresenceInviteEmbedMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else {
            return r.c(this.activityRichPresenceInviteEmbed, var1.activityRichPresenceInviteEmbed);
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.messageId) * 31 + this.activityRichPresenceInviteEmbed.hashCode();
   }

   public override fun toString(): String {
      val var3: java.lang.String = MessageId.toString-impl(this.messageId);
      val var2: ActivityRichPresenceInviteEmbed = this.activityRichPresenceInviteEmbed;
      val var1: StringBuilder = new StringBuilder();
      var1.append("ActivityRichPresenceInviteEmbedMessageAccessory(messageId=");
      var1.append(var3);
      var1.append(", activityRichPresenceInviteEmbed=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }
}
