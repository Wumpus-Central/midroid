package com.discord.chat.presentation.list.delegate

import android.content.Context
import android.view.ViewGroup
import com.discord.chat.presentation.blockedmessage.BlockedMessageGroupView
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate.Metadata
import com.discord.chat.presentation.list.item.BlockedGroupChatListItem
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider

public class BlockedGroupDelegate(eventHandlerProvider: () -> ChatEventHandler, messageComponentProvider: () -> ComponentProvider) : BaseChatListItemDelegate(
      var1, new b()
   ) {
   private final val eventHandlerProvider: () -> ChatEventHandler
   private final val messageComponentProvider: () -> ComponentProvider

   init {
      this.eventHandlerProvider = var1;
      this.messageComponentProvider = var2;
   }

   @JvmStatic
   fun `_init_$lambda$0`(var0: BlockedMessageGroupView): Unit {
      BlockedGroupDelegateKt.access$setupLayout(var0);
      return Unit.a;
   }

   public open fun bindView(view: BlockedMessageGroupView, item: BlockedGroupChatListItem, metadata: Metadata<BlockedMessageGroupView>) {
      var1.bind(var2, this.getEventHandler());
   }

   public open fun createView(parent: ViewGroup): BlockedMessageGroupView {
      val var2: Context = var1.getContext();
      val var3: BlockedMessageGroupView = new BlockedMessageGroupView(var2, null, 2, null);
      var3.setupUI(this.eventHandlerProvider, this.messageComponentProvider);
      return var3;
   }

   public override fun isForItem(item: ChatListItem, position: Int): Boolean {
      return var1 is BlockedGroupChatListItem;
   }
}
