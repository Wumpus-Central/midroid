package com.discord.chat.presentation.list.item

import com.discord.chat.bridge.ErrorMessage
import kotlin.jvm.internal.q

public data class DeserializationErrorMessageItem(message: ErrorMessage) : ChatListItem {
   public final val message: ErrorMessage

   init {
      q.h(var1, "message");
      super(var1.getId-3Eiw7ao(), null);
      this.message = var1;
   }

   public operator fun component1(): ErrorMessage {
      return this.message;
   }

   public fun copy(message: ErrorMessage = var0.message): DeserializationErrorMessageItem {
      q.h(var1, "message");
      return new DeserializationErrorMessageItem(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is DeserializationErrorMessageItem) {
         return false;
      } else {
         return q.c(this.message, (var1 as DeserializationErrorMessageItem).message);
      }
   }

   public override fun hashCode(): Int {
      return this.message.hashCode();
   }

   public override fun toString(): String {
      val var2: ErrorMessage = this.message;
      val var1: StringBuilder = new StringBuilder();
      var1.append("DeserializationErrorMessageItem(message=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }
}
