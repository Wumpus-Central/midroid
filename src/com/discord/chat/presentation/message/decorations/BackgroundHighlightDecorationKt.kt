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
   val var1: BackgroundHighlight;
   if (var0 is MessageItem) {
      var1 = (var0 as MessageItem).getBackgroundHighlight();
   } else if (var0 is SystemMessageItem) {
      var1 = (var0 as SystemMessageItem).getBackgroundHighlight();
   } else {
      var1 = null;
   }

   return var1;
}
