package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.Message
import kotlin.jvm.internal.r

public data class InviteToSpeakAccessory(message: Message) : MessageAccessory {
   public final val message: Message

   init {
      r.h(var1, "message");
      super(var1.getId-3Eiw7ao(), "invite to speak", false, 4, null);
      this.message = var1;
   }

   public operator fun component1(): Message {
      return this.message;
   }

   public fun copy(message: Message = var0.message): InviteToSpeakAccessory {
      r.h(var1, "message");
      return new InviteToSpeakAccessory(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is InviteToSpeakAccessory) {
         return false;
      } else {
         return r.c(this.message, (var1 as InviteToSpeakAccessory).message);
      }
   }

   public override fun hashCode(): Int {
      return this.message.hashCode();
   }

   public override fun toString(): String {
      val var1: Message = this.message;
      val var2: StringBuilder = new StringBuilder();
      var2.append("InviteToSpeakAccessory(message=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }
}
