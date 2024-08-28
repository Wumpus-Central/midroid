package com.discord.chat.presentation.message.messagepart

import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

public data class ForwardHeaderMessageAccessory(messageId: MessageId, useOldIcon: Boolean) : ForwardHeaderMessageAccessory(var1, var2) {
   public open val messageId: MessageId
   public final val useOldIcon: Boolean

   fun ForwardHeaderMessageAccessory(var1: java.lang.String, var2: Boolean) {
      super(var1, "forwarded message header", false, 4, null);
      this.messageId = var1;
      this.useOldIcon = var2;
   }

   public operator fun component1(): MessageId {
      return this.getMessageId-3Eiw7ao();
   }

   public operator fun component2(): Boolean {
      return this.useOldIcon;
   }

   public fun copy(messageId: MessageId = ..., useOldIcon: Boolean = ...): ForwardHeaderMessageAccessory {
      r.h(var1, "messageId");
      return new ForwardHeaderMessageAccessory(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is ForwardHeaderMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.getMessageId-3Eiw7ao(), var1.getMessageId-3Eiw7ao())) {
            return false;
         } else {
            return this.useOldIcon == var1.useOldIcon;
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = MessageId.hashCode-impl(this.getMessageId-3Eiw7ao());
      var var1: Byte = this.useOldIcon;
      if (this.useOldIcon != 0) {
         var1 = 1;
      }

      return var3 * 31 + var1;
   }

   public override fun toString(): String {
      val var2: java.lang.String = MessageId.toString-impl(this.getMessageId-3Eiw7ao());
      val var1: Boolean = this.useOldIcon;
      val var3: StringBuilder = new StringBuilder();
      var3.append("ForwardHeaderMessageAccessory(messageId=");
      var3.append(var2);
      var3.append(", useOldIcon=");
      var3.append(var1);
      var3.append(")");
      return var3.toString();
   }
}
