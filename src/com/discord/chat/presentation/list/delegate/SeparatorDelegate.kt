package com.discord.chat.presentation.list.delegate

import android.content.Context
import android.view.ViewGroup
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate.Metadata
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.list.item.SeparatorChatListItem
import com.discord.chat.presentation.separator.SeparatorView
import kotlin.jvm.internal.r

public class SeparatorDelegate(eventHandlerProvider: () -> ChatEventHandler) : BaseChatListItemDelegate<SeparatorChatListItem, SeparatorView> {
   init {
      r.h(var1, "eventHandlerProvider");
      super(var1, null, 2, null);
   }

   public open fun bindView(view: SeparatorView, item: SeparatorChatListItem, metadata: Metadata<SeparatorView>) {
      r.h(var1, "view");
      r.h(var2, "item");
      r.h(var3, "metadata");
      var1.setColor(var2.getColor());
      var1.setText(var2.getText());
   }

   public open fun createView(parent: ViewGroup): SeparatorView {
      r.h(var1, "parent");
      val var2: Context = var1.getContext();
      r.g(var2, "parent.context");
      return new SeparatorView(var2, null, 2, null);
   }

   public override fun isForItem(item: ChatListItem, position: Int): Boolean {
      r.h(var1, "item");
      return var1 is SeparatorChatListItem;
   }
}
