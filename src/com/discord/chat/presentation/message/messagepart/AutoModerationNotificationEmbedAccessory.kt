package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.Message
import com.discord.chat.bridge.automod.AutoModerationContext
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

public data class AutoModerationNotificationEmbedAccessory(messageId: MessageId, message: Message, moderationContext: AutoModerationContext) : AutoModerationNotificationEmbedAccessory(
      var1, var2, var3
   ) {
   public final val message: Message
   public open val messageId: MessageId
   public final val moderationContext: AutoModerationContext

   fun AutoModerationNotificationEmbedAccessory(var1: java.lang.String, var2: Message, var3: AutoModerationContext) {
      q.h(var1, "messageId");
      q.h(var2, "message");
      q.h(var3, "moderationContext");
      super(var1, "auto moderation notification message", false, 4, null);
      this.messageId = var1;
      this.message = var2;
      this.moderationContext = var3;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): Message {
      return this.message;
   }

   public operator fun component3(): AutoModerationContext {
      return this.moderationContext;
   }

   public fun copy(messageId: MessageId = ..., message: Message = ..., moderationContext: AutoModerationContext = ...): AutoModerationNotificationEmbedAccessory {
      q.h(var1, "messageId");
      q.h(var2, "message");
      q.h(var3, "moderationContext");
      return new AutoModerationNotificationEmbedAccessory(var1, var2, var3, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AutoModerationNotificationEmbedAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!q.c(this.message, var1.message)) {
            return false;
         } else {
            return q.c(this.moderationContext, var1.moderationContext);
         }
      }
   }

   public override fun hashCode(): Int {
      return (MessageId.hashCode-impl(this.messageId) * 31 + this.message.hashCode()) * 31 + this.moderationContext.hashCode();
   }

   public override fun toString(): String {
      val var3: java.lang.String = MessageId.toString-impl(this.messageId);
      val var2: Message = this.message;
      val var4: AutoModerationContext = this.moderationContext;
      val var1: StringBuilder = new StringBuilder();
      var1.append("AutoModerationNotificationEmbedAccessory(messageId=");
      var1.append(var3);
      var1.append(", message=");
      var1.append(var2);
      var1.append(", moderationContext=");
      var1.append(var4);
      var1.append(")");
      return var1.toString();
   }
}
