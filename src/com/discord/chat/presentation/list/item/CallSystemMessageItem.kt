package com.discord.chat.presentation.list.item

import com.discord.chat.bridge.Message
import com.discord.chat.bridge.MessageKt
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nCallSystemMessageItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallSystemMessageItem.kt\ncom/discord/chat/presentation/list/item/CallSystemMessageItem\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,13:1\n1#2:14\n*E\n"])
public data class CallSystemMessageItem(message: Message) : ChatListItem(var1.getId-3Eiw7ao()) {
   public final val message: Message

   init {
      this.message = var1;
      if (!MessageKt.isCallMessage(var1)) {
         throw new IllegalArgumentException("Only \"call\" system messages are allowed");
      }
   }

   public operator fun component1(): Message {
      return this.message;
   }

   public fun copy(message: Message = var0.message): CallSystemMessageItem {
      return new CallSystemMessageItem(var1);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is CallSystemMessageItem) {
         return false;
      } else {
         return this.message == (var1 as CallSystemMessageItem).message;
      }
   }

   public override fun hashCode(): Int {
      return this.message.hashCode();
   }

   public override fun toString(): String {
      val var2: Message = this.message;
      val var1: StringBuilder = new StringBuilder();
      var1.append("CallSystemMessageItem(message=");
      var1.append(var2);
      var1.append(")");
      return var1.toString();
   }
}
