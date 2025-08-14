package com.discord.chat.presentation.list.delegate;

import com.discord.chat.presentation.list.item.DeserializationErrorMessageItem;
import kotlin.jvm.functions.Function1;

// $VF: synthetic class
public final class c implements Function1 {
   public final BaseChatListItemDelegate.Metadata d;
   public final DeserializationErrorMessageItem e;

   public final Object invoke(Object var1) {
      return DeserializationErrorMessageDelegate.b(this.d, this.e, (Boolean)var1);
   }
}
