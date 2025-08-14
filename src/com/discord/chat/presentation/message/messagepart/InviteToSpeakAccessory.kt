package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.Message

public data class InviteToSpeakAccessory(message: Message) : MessageAccessory(var1.getId-3Eiw7ao(), "invite to speak", false, 4) {
   public final val message: Message

   init {
      this.message = var1;
   }

   public operator fun component1(): Message {
      return this.message;
   }

   public fun copy(message: Message = var0.message): InviteToSpeakAccessory {
      return new InviteToSpeakAccessory(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is InviteToSpeakAccessory) {
         return false;
      } else {
         return this.message == (var1 as InviteToSpeakAccessory).message;
      }
   }

   public override fun hashCode(): Int {
      return this.message.hashCode();
   }

   public override fun toString(): String {
      val var2: Message = this.message;
      val var1: StringBuilder = new StringBuilder();
      var1.append("InviteToSpeakAccessory(message=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }
}
