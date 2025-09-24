package com.discord.chat.presentation.list.item

import B9.j
import B9.m
import com.discord.misc.utilities.ids.IdUtilsKt
import w1.a

public sealed class ChatListItem protected constructor(id: String) {
   public open val id: String

   public final val recyclerItemId: Long
      public final get() {
         return (this.recyclerItemId$delegate.getValue() as java.lang.Number).longValue();
      }


   init {
      this.id = var1;
      this.recyclerItemId$delegate = j.a(m.i, new a(this));
   }

   @JvmStatic
   fun `recyclerItemId_delegate$lambda$0`(var0: ChatListItem): Long {
      return IdUtilsKt.convertToId(var0.getId());
   }
}
