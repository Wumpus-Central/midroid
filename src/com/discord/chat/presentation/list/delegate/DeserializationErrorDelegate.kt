package com.discord.chat.presentation.list.delegate

import android.content.Context
import android.view.ViewGroup
import com.discord.chat.presentation.deserializationerror.DeserializationErrorView
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate.Metadata
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.list.item.DeserializationErrorChatListItem

public class DeserializationErrorDelegate(eventHandlerProvider: () -> ChatEventHandler) : BaseChatListItemDelegate(var1, null, 2) {
   public open fun bindView(view: DeserializationErrorView, item: DeserializationErrorChatListItem, metadata: Metadata<DeserializationErrorView>) {
      var1.configure(var2.getJson(), var2.getCauseMessage());
   }

   public open fun createView(parent: ViewGroup): DeserializationErrorView {
      val var2: Context = var1.getContext();
      return new DeserializationErrorView(var2, null, 2, null);
   }

   public override fun isForItem(item: ChatListItem, position: Int): Boolean {
      return var1 is DeserializationErrorChatListItem;
   }
}
