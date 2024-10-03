package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.activities.ActivityInstanceEmbed
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

public data class ActivityInstanceEmbedMessageAccessory(messageId: MessageId, activityInstanceEmbed: ActivityInstanceEmbed, constrainedWidth: Int) : ActivityInstanceEmbedMessageAccessory(
      var1, var2, var3
   ) {
   public final val activityInstanceEmbed: ActivityInstanceEmbed
   public final val constrainedWidth: Int
   public open val messageId: MessageId

   fun ActivityInstanceEmbedMessageAccessory(var1: java.lang.String, var2: ActivityInstanceEmbed, var3: Int) {
      q.h(var1, "messageId");
      q.h(var2, "activityInstanceEmbed");
      val var5: java.lang.String = var2.getInstanceId();
      val var4: StringBuilder = new StringBuilder();
      var4.append("activity instance ");
      var4.append(var5);
      super(var1, var4.toString(), false, 4, null);
      this.messageId = var1;
      this.activityInstanceEmbed = var2;
      this.constrainedWidth = var3;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): ActivityInstanceEmbed {
      return this.activityInstanceEmbed;
   }

   public operator fun component3(): Int {
      return this.constrainedWidth;
   }

   public fun copy(messageId: MessageId = ..., activityInstanceEmbed: ActivityInstanceEmbed = ..., constrainedWidth: Int = ...): ActivityInstanceEmbedMessageAccessory {
      q.h(var1, "messageId");
      q.h(var2, "activityInstanceEmbed");
      return new ActivityInstanceEmbedMessageAccessory(var1, var2, var3, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ActivityInstanceEmbedMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!q.c(this.activityInstanceEmbed, var1.activityInstanceEmbed)) {
            return false;
         } else {
            return this.constrainedWidth == var1.constrainedWidth;
         }
      }
   }

   public override fun hashCode(): Int {
      return (MessageId.hashCode-impl(this.messageId) * 31 + this.activityInstanceEmbed.hashCode()) * 31 + Integer.hashCode(this.constrainedWidth);
   }

   public override fun toString(): String {
      val var3: java.lang.String = MessageId.toString-impl(this.messageId);
      val var4: ActivityInstanceEmbed = this.activityInstanceEmbed;
      val var1: Int = this.constrainedWidth;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ActivityInstanceEmbedMessageAccessory(messageId=");
      var2.append(var3);
      var2.append(", activityInstanceEmbed=");
      var2.append(var4);
      var2.append(", constrainedWidth=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }
}
