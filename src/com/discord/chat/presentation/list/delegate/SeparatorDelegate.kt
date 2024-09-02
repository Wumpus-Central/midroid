package com.discord.chat.presentation.list.delegate

import android.content.Context
import android.view.ViewGroup
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate.Metadata
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.list.item.SeparatorChatListItem
import com.discord.chat.presentation.separator.SeparatorView
import kotlin.jvm.internal.q

public class SeparatorDelegate(eventHandlerProvider: () -> ChatEventHandler) : BaseChatListItemDelegate<SeparatorChatListItem, SeparatorView> {
   init {
      q.h(var1, "eventHandlerProvider");
      super(var1, null, 2, null);
   }

   public open fun bindView(view: SeparatorView, item: SeparatorChatListItem, metadata: Metadata<SeparatorView>) {
      q.h(var1, "view");
      q.h(var2, "item");
      q.h(var3, "metadata");
      var1.setColor(var2.getColor());
      var1.setText(var2.getText());
   }

   public open fun createView(parent: ViewGroup): SeparatorView {
      q.h(var1, "parent");
      val var2: Context = var1.getContext();
      q.g(var2, "getContext(...)");
      return new SeparatorView(var2, null, 2, null);
   }

   public override fun isForItem(item: ChatListItem, position: Int): Boolean {
      q.h(var1, "item");
      return var1 is SeparatorChatListItem;
   }
}
