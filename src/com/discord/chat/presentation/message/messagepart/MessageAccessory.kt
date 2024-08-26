package com.discord.chat.presentation.message.messagepart

import com.discord.misc.utilities.ids.IdUtilsKt
import com.discord.primitives.MessageId
import com.discord.recycler_view.utils.ItemDiffableType

public sealed class MessageAccessory protected constructor(messageId: MessageId, accessoryDescription: String, isForwardInner: Boolean = ...) : ItemDiffableType {
   public final val accessoryDescription: String
   public final val isForwardInner: Boolean

   public open val itemId: Long
      public open get() {
         val var3: java.lang.String = MessageId.toString_impl(this.getMessageId_3Eiw7ao());
         val var1: java.lang.String = this.accessoryDescription;
         val var2: StringBuilder = new StringBuilder();
         var2.append(var3);
         var2.append(" - ");
         var2.append(var1);
         return IdUtilsKt.convertToId(var2.toString());
      }


   public open val messageId: MessageId

   init {
      this.messageId = var1;
      this.accessoryDescription = var2;
      this.isForwardInner = var3;
   }

   open fun getMessageId_3Eiw7ao(): java.lang.String {
      return this.messageId;
   }
}
