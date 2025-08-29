package com.discord.chat.presentation.list.delegate

import android.content.Context
import android.view.ViewGroup
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate.Metadata
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.list.item.SeparatorChatListItem
import com.discord.chat.presentation.separator.SeparatorView

public class SeparatorDelegate(eventHandlerProvider: () -> ChatEventHandler) : BaseChatListItemDelegate(var1, null, 2) {
   public open fun bindView(view: SeparatorView, item: SeparatorChatListItem, metadata: Metadata<SeparatorView>) {
      var1.setColor(var2.getColor());
      var1.setText(var2.getText());
   }

   public open fun createView(parent: ViewGroup): SeparatorView {
      val var2: Context = var1.getContext();
      return new SeparatorView(var2, null, 2, null);
   }

   public override fun isForItem(item: ChatListItem, position: Int): Boolean {
      return var1 is SeparatorChatListItem;
   }
}
