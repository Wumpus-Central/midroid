package com.discord.chat.presentation.list.item

import com.discord.chat.bridge.BackgroundHighlight
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageKt
import com.discord.chat.presentation.root.MessageContext
import kotlin.jvm.internal.r

public data class SystemMessageItem(message: Message, messageContext: MessageContext, backgroundHighlight: BackgroundHighlight? = null) : ChatListItem {
   public final val backgroundHighlight: BackgroundHighlight?
   public final val message: Message
   public final val messageContext: MessageContext

   init {
      r.h(var1, "message");
      r.h(var2, "messageContext");
      super(var1.getId_3Eiw7ao(), null);
      this.message = var1;
      this.messageContext = var2;
      this.backgroundHighlight = var3;
      if (!MessageKt.isSystemMessage(var1)) {
         throw new IllegalArgumentException("Only system messages are allowed".toString());
      }
   }

   public operator fun component1(): Message {
      return this.message;
   }

   public operator fun component2(): MessageContext {
      return this.messageContext;
   }

   public operator fun component3(): BackgroundHighlight? {
      return this.backgroundHighlight;
   }

   public fun copy(
      message: Message = var0.message,
      messageContext: MessageContext = var0.messageContext,
      backgroundHighlight: BackgroundHighlight? = var0.backgroundHighlight
   ): SystemMessageItem {
      r.h(var1, "message");
      r.h(var2, "messageContext");
      return new SystemMessageItem(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SystemMessageItem) {
         return false;
      } else {
         var1 = var1;
         if (!r.c(this.message, var1.message)) {
            return false;
         } else if (!r.c(this.messageContext, var1.messageContext)) {
            return false;
         } else {
            return r.c(this.backgroundHighlight, var1.backgroundHighlight);
         }
      }
   }

   public override fun hashCode(): Int {
      val var3: Int = this.message.hashCode();
      val var2: Int = this.messageContext.hashCode();
      val var1: Int;
      if (this.backgroundHighlight == null) {
         var1 = 0;
      } else {
         var1 = this.backgroundHighlight.hashCode();
      }

      return (var3 * 31 + var2) * 31 + var1;
   }

   public override fun toString(): String {
      val var2: Message = this.message;
      val var3: MessageContext = this.messageContext;
      val var1: BackgroundHighlight = this.backgroundHighlight;
      val var4: StringBuilder = new StringBuilder();
      var4.append("SystemMessageItem(message=");
      var4.append(var2);
      var4.append(", messageContext=");
      var4.append(var3);
      var4.append(", backgroundHighlight=");
      var4.append(var1);
      var4.append(")");
      return var4.toString();
   }
}
