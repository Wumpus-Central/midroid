package com.discord.chat.presentation.list.item

import com.discord.misc.utilities.ids.IdUtilsKt
import eh.l
import eh.o
import kotlin.jvm.functions.Function0

public sealed class ChatListItem protected constructor(id: String) {
   public open val id: String

   public final val recyclerItemId: Long
      public final get() {
         return (this.recyclerItemId$delegate.getValue() as java.lang.Number).longValue();
      }


   init {
      this.id = var1;
      this.recyclerItemId$delegate = l.a(o.l, new Function0<java.lang.Long>(this) {
         final ChatListItem this$0;

         {
            super(0);
            this.this$0 = var1;
         }

         public final java.lang.Long invoke() {
            return IdUtilsKt.convertToId(this.this$0.getId());
         }
      });
   }
}
