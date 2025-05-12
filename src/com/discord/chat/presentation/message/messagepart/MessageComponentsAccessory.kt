package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.Message
import com.discord.chat.bridge.botuikit.Component
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

public data class MessageComponentsAccessory(messageId: MessageId, message: Message, messageComponents: List<Component>, constrainedWidth: Int) : MessageComponentsAccessory(
      var1, var2, var3, var4
   ) {
   public final val constrainedWidth: Int
   public final val message: Message
   public final val messageComponents: List<Component>
   public open val messageId: MessageId

   fun MessageComponentsAccessory(var1: java.lang.String, var2: Message, var3: MutableList<Component>, var4: Int) {
      q.h(var1, "messageId");
      q.h(var2, "message");
      q.h(var3, "messageComponents");
      super(var1, "bot component", false, 4, null);
      this.messageId = var1;
      this.message = var2;
      this.messageComponents = var3;
      this.constrainedWidth = var4;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): Message {
      return this.message;
   }

   public operator fun component3(): List<Component> {
      return this.messageComponents;
   }

   public operator fun component4(): Int {
      return this.constrainedWidth;
   }

   public fun copy(messageId: MessageId = ..., message: Message = ..., messageComponents: List<Component> = ..., constrainedWidth: Int = ...): MessageComponentsAccessory {
      q.h(var1, "messageId");
      q.h(var2, "message");
      q.h(var3, "messageComponents");
      return new MessageComponentsAccessory(var1, var2, var3, var4, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is MessageComponentsAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else if (!q.c(this.message, var1.message)) {
            return false;
         } else if (!q.c(this.messageComponents, var1.messageComponents)) {
            return false;
         } else {
            return this.constrainedWidth == var1.constrainedWidth;
         }
      }
   }

   public override fun hashCode(): Int {
      return ((MessageId.hashCode-impl(this.messageId) * 31 + this.message.hashCode()) * 31 + this.messageComponents.hashCode()) * 31
         + Integer.hashCode(this.constrainedWidth);
   }

   public override fun toString(): String {
      val var2: java.lang.String = MessageId.toString-impl(this.messageId);
      val var4: Message = this.message;
      val var3: java.util.List = this.messageComponents;
      val var1: Int = this.constrainedWidth;
      val var5: StringBuilder = new StringBuilder();
      var5.append("MessageComponentsAccessory(messageId=");
      var5.append(var2);
      var5.append(", message=");
      var5.append(var4);
      var5.append(", messageComponents=");
      var5.append(var3);
      var5.append(", constrainedWidth=");
      var5.append(var1);
      var5.append(")");
      return var5.toString();
   }
}
