package com.discord.chat.presentation.list

public sealed class ChannelChatListAdapterUpdate protected constructor(updateId: Int, preCommit: (Boolean) -> Unit, postCommit: () -> Unit) {
   public open val updateId: Int
   public open val preCommit: (Boolean) -> Unit
   public open val postCommit: () -> Unit

   init {
      this.updateId = var1;
      this.preCommit = var2;
      this.postCommit = var3;
   }
}
