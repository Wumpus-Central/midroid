package com.discord.chat.presentation.message.messagepart

import com.discord.misc.utilities.ids.IdUtilsKt
import com.discord.primitives.MessageId
import com.discord.recycler_view.utils.ItemDiffableType
import kotlin.jvm.internal.q

public sealed class MessageAccessory protected constructor(messageId: MessageId, accessoryDescription: String, isForwardInner: Boolean = ...) : ItemDiffableType {
   public final val accessoryDescription: String
   public final val isForwardInner: Boolean

   public open val itemId: Long
      public open get() {
         val var3: java.lang.String = MessageId.toString-impl(this.getMessageId-3Eiw7ao());
         val var1: java.lang.String = this.accessoryDescription;
         val var2: StringBuilder = new StringBuilder();
         var2.append(var3);
         var2.append(" - ");
         var2.append(var1);
         return IdUtilsKt.convertToId(var2.toString());
      }


   public open val messageId: MessageId

   init {
      q.h(var1, "messageId");
      q.h(var2, "accessoryDescription");
      super();
      this.messageId = var1;
      this.accessoryDescription = var2;
      this.isForwardInner = var3;
   }
}
