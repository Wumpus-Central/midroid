package com.discord.chat.presentation.list.item

import com.discord.misc.utilities.ids.IdUtilsKt
import x1.a
import z9.j
import z9.m

public sealed class ChatListItem protected constructor(id: String) {
   public open val id: String

   public final val recyclerItemId: Long
      public final get() {
         return (this.recyclerItemId$delegate.getValue() as java.lang.Number).longValue();
      }


   init {
      this.id = var1;
      this.recyclerItemId$delegate = j.b(m.l, new a(this));
   }

   @JvmStatic
   fun `recyclerItemId_delegate$lambda$0`(var0: ChatListItem): Long {
      return IdUtilsKt.convertToId(var0.getId());
   }
}
