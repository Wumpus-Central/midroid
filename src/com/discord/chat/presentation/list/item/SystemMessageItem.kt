package com.discord.chat.presentation.list.item

import com.discord.chat.bridge.BackgroundHighlight
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageKt
import com.discord.chat.presentation.root.MessageContext
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nSystemMessageItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemMessageItem.kt\ncom/discord/chat/presentation/list/item/SystemMessageItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,17:1\n1#2:18\n*E\n"])
public data class SystemMessageItem(message: Message, messageContext: MessageContext, backgroundHighlight: BackgroundHighlight? = null) : ChatListItem(
      var1.getId-3Eiw7ao()
   ) {
   public final val message: Message
   public final val messageContext: MessageContext
   public final val backgroundHighlight: BackgroundHighlight?

   init {
      this.message = var1;
      this.messageContext = var2;
      this.backgroundHighlight = var3;
      if (!MessageKt.isSystemMessage(var1)) {
         throw new IllegalArgumentException("Only system messages are allowed");
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
      return new SystemMessageItem(var1, var2, var3);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SystemMessageItem) {
         return false;
      } else {
         var1 = var1;
         if (!(this.message == var1.message)) {
            return false;
         } else if (!(this.messageContext == var1.messageContext)) {
            return false;
         } else {
            return this.backgroundHighlight == var1.backgroundHighlight;
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
      val var1: Message = this.message;
      val var4: MessageContext = this.messageContext;
      val var2: BackgroundHighlight = this.backgroundHighlight;
      val var3: StringBuilder = new StringBuilder();
      var3.append("SystemMessageItem(message=");
      var3.append(var1);
      var3.append(", messageContext=");
      var3.append(var4);
      var3.append(", backgroundHighlight=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }
}
