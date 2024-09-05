package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.Message
import com.discord.chat.bridge.automod.AutoModerationContext
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

public data class FlaggedMessageActionBarAccessory(messageId: MessageId, message: Message, autoModerationContext: AutoModerationContext) : FlaggedMessageActionBarAccessory(
      var1, var2, var3
   ) {
   public final val autoModerationContext: AutoModerationContext
   public final val message: Message
   public open val messageId: MessageId

   fun FlaggedMessageActionBarAccessory(var1: java.lang.String, var2: Message, var3: AutoModerationContext) {
      q.h(var1, "messageId");
      q.h(var2, "message");
      q.h(var3, "autoModerationContext");
      super(var1, "flagged message actions", false, 4, null);
      this.messageId = var1;
      this.message = var2;
      this.autoModerationContext = var3;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): Message {
      return this.message;
   }

   public operator fun component3(): AutoModerationContext {
      return this.autoModerationContext;
   }

   public fun copy(messageId: MessageId = ..., message: Message = ..., autoModerationContext: AutoModerationContext = ...): FlaggedMessageActionBarAccessory {
      q.h(var1, "messageId");
      q.h(var2, "message");
      q.h(var3, "autoModerationContext");
      return new FlaggedMessageActionBarAccessory(var1, var2, var3, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is FlaggedMessageActionBarAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!q.c(this.message, var1.message)) {
            return false;
         } else {
            return q.c(this.autoModerationContext, var1.autoModerationContext);
         }
      }
   }

   public override fun hashCode(): Int {
      return (MessageId.hashCode-impl(this.messageId) * 31 + this.message.hashCode()) * 31 + this.autoModerationContext.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: Message = this.message;
      val var4: AutoModerationContext = this.autoModerationContext;
      val var3: StringBuilder = new StringBuilder();
      var3.append("FlaggedMessageActionBarAccessory(messageId=");
      var3.append(var2);
      var3.append(", message=");
      var3.append(var1);
      var3.append(", autoModerationContext=");
      var3.append(var4);
      var3.append(")");
      return var3.toString();
   }
}
