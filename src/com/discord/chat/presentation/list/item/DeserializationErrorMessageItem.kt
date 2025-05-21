package com.discord.chat.presentation.list.item

import com.discord.chat.bridge.ErrorMessage
import kotlin.jvm.internal.q

public data class DeserializationErrorMessageItem(message: ErrorMessage, isExpanded: Boolean = false) : ChatListItem {
   public final val message: ErrorMessage
   public final val isExpanded: Boolean

   init {
      q.h(var1, "message");
      super(var1.getId-3Eiw7ao(), null);
      this.message = var1;
      this.isExpanded = var2;
   }

   public operator fun component1(): ErrorMessage {
      return this.message;
   }

   public operator fun component2(): Boolean {
      return this.isExpanded;
   }

   public fun copy(message: ErrorMessage = var0.message, isExpanded: Boolean = var0.isExpanded): DeserializationErrorMessageItem {
      q.h(var1, "message");
      return new DeserializationErrorMessageItem(var1, var2);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is DeserializationErrorMessageItem) {
         return false;
      } else {
         var1 = var1;
         if (!q.c(this.message, var1.message)) {
            return false;
         } else {
            return this.isExpanded == var1.isExpanded;
         }
      }
   }

   public override fun hashCode(): Int {
      return this.message.hashCode() * 31 + java.lang.Boolean.hashCode(this.isExpanded);
   }

   public override fun toString(): String {
      val var2: ErrorMessage = this.message;
      val var1: Boolean = this.isExpanded;
      val var3: StringBuilder = new StringBuilder();
      var3.append("DeserializationErrorMessageItem(message=");
      var3.append(var2);
      var3.append(", isExpanded=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }
}
