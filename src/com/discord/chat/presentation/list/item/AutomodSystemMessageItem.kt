package com.discord.chat.presentation.list.item

import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageKt
import com.discord.chat.presentation.root.MessageContext
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

public data class AutomodSystemMessageItem(message: Message,
      messageContext: MessageContext = new MessageContext(
            false, false, null, null, null, null, false, null, false, false, false, false, false, null, null, 32767, null
         ),
      allowChildGestures: Boolean = true
   )
   : ChatListItem {
   public final val allowChildGestures: Boolean
   public final val message: Message
   public final val messageContext: MessageContext

   init {
      q.h(var1, "message");
      q.h(var2, "messageContext");
      super(MessageId.toString-impl(var1.getId-3Eiw7ao()), null);
      this.message = var1;
      this.messageContext = var2;
      this.allowChildGestures = var3;
      if (!MessageKt.isAutomodSystemMessage(var1)) {
         throw new IllegalArgumentException("Only automod system messages are allowed".toString());
      }
   }

   public operator fun component1(): Message {
      return this.message;
   }

   public operator fun component2(): MessageContext {
      return this.messageContext;
   }

   public operator fun component3(): Boolean {
      return this.allowChildGestures;
   }

   public fun copy(message: Message = var0.message, messageContext: MessageContext = var0.messageContext, allowChildGestures: Boolean = var0.allowChildGestures): AutomodSystemMessageItem {
      q.h(var1, "message");
      q.h(var2, "messageContext");
      return new AutomodSystemMessageItem(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is AutomodSystemMessageItem) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.message, var1.message)) {
            return false;
         } else if (!q.c(this.messageContext, var1.messageContext)) {
            return false;
         } else {
            return this.allowChildGestures == var1.allowChildGestures;
         }
      }
   }

   public override fun hashCode(): Int {
      return (this.message.hashCode() * 31 + this.messageContext.hashCode()) * 31 + java.lang.Boolean.hashCode(this.allowChildGestures);
   }

   public override fun toString(): String {
      val var3: Message = this.message;
      val var4: MessageContext = this.messageContext;
      val var1: Boolean = this.allowChildGestures;
      val var2: StringBuilder = new StringBuilder();
      var2.append("AutomodSystemMessageItem(message=");
      var2.append(var3);
      var2.append(", messageContext=");
      var2.append(var4);
      var2.append(", allowChildGestures=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }
}
