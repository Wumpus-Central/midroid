package com.discord.chat.presentation.list.item

public sealed class MessageBundleItem protected constructor(id: String) : ChatListItem(var1) {
   public open val id: String

   init {
      this.id = var1;
   }
}
