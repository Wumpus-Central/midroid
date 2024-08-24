package com.discord.chat.presentation.list

import com.discord.chat.presentation.list.item.ChatListItem

public interface ChatListAdapter {
   public abstract fun getChatListItem(position: Int): ChatListItem? {
   }

   public abstract fun getChatListItems(): List<ChatListItem> {
   }
}
