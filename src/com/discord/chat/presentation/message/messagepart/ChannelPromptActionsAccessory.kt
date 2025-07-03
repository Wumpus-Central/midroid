package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.Message
import kotlin.jvm.internal.r

public data class ChannelPromptActionsAccessory(message: Message) : MessageAccessory {
   public final val message: Message

   init {
      r.h(var1, "message");
      super(var1.getId-3Eiw7ao(), "channel deadchat prompt actions", false, 4, null);
      this.message = var1;
   }

   public operator fun component1(): Message {
      return this.message;
   }

   public fun copy(message: Message = var0.message): ChannelPromptActionsAccessory {
      r.h(var1, "message");
      return new ChannelPromptActionsAccessory(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ChannelPromptActionsAccessory) {
         return false;
      } else {
         return r.c(this.message, (var1 as ChannelPromptActionsAccessory).message);
      }
   }

   public override fun hashCode(): Int {
      return this.message.hashCode();
   }

   public override fun toString(): String {
      val var1: Message = this.message;
      val var2: StringBuilder = new StringBuilder();
      var2.append("ChannelPromptActionsAccessory(message=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }
}
