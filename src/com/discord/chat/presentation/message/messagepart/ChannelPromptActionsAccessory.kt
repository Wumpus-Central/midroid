package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.Message
import kotlin.jvm.internal.q

public data class ChannelPromptActionsAccessory(message: Message) : MessageAccessory {
   public final val message: Message

   init {
      q.h(var1, "message");
      super(var1.getId-3Eiw7ao(), "channel deadchat prompt actions", false, 4, null);
      this.message = var1;
   }

   public operator fun component1(): Message {
      return this.message;
   }

   public fun copy(message: Message = var0.message): ChannelPromptActionsAccessory {
      q.h(var1, "message");
      return new ChannelPromptActionsAccessory(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ChannelPromptActionsAccessory) {
         return false;
      } else {
         return q.c(this.message, (var1 as ChannelPromptActionsAccessory).message);
      }
   }

   public override fun hashCode(): Int {
      return this.message.hashCode();
   }

   public override fun toString(): String {
      val var2: Message = this.message;
      val var1: StringBuilder = new StringBuilder();
      var1.append("ChannelPromptActionsAccessory(message=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }
}
