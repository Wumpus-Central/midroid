package com.discord.chat.presentation.message.decorations

import com.discord.chat.bridge.BackgroundHighlight
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.list.item.MessageItem
import com.discord.chat.presentation.list.item.SystemMessageItem

@JvmSynthetic
fun `access$getBackgroundHighlight`(var0: ChatListItem): BackgroundHighlight {
   return getBackgroundHighlight(var0);
}

private fun ChatListItem.getBackgroundHighlight(): BackgroundHighlight? {
   if (var0 is MessageItem) {
      return (var0 as MessageItem).getBackgroundHighlight();
   } else {
      return if (var0 is SystemMessageItem) (var0 as SystemMessageItem).getBackgroundHighlight() else null;
   }
}
