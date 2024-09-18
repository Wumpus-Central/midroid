package com.discord.chat.presentation.list.delegate

import android.content.Context
import android.view.ViewGroup
import com.discord.chat.presentation.blockedmessage.BlockedMessageGroupView
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate.Metadata
import com.discord.chat.presentation.list.item.BlockedGroupChatListItem
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import kotlin.jvm.internal.q

public class BlockedGroupDelegate(eventHandlerProvider: () -> ChatEventHandler, messageComponentProvider: () -> ComponentProvider)
   : BaseChatListItemDelegate<BlockedGroupChatListItem, BlockedMessageGroupView> {
   private final val eventHandlerProvider: () -> ChatEventHandler
   private final val messageComponentProvider: () -> ComponentProvider

   init {
      q.h(var1, "eventHandlerProvider");
      q.h(var2, "messageComponentProvider");
      super(var1, <unrepresentable>.INSTANCE);
      this.eventHandlerProvider = var1;
      this.messageComponentProvider = var2;
   }

   public open fun bindView(view: BlockedMessageGroupView, item: BlockedGroupChatListItem, metadata: Metadata<BlockedMessageGroupView>) {
      q.h(var1, "view");
      q.h(var2, "item");
      q.h(var3, "metadata");
      var1.bind(var2, this.getEventHandler());
   }

   public open fun createView(parent: ViewGroup): BlockedMessageGroupView {
      q.h(var1, "parent");
      val var2: Context = var1.getContext();
      q.g(var2, "getContext(...)");
      val var3: BlockedMessageGroupView = new BlockedMessageGroupView(var2, null, 2, null);
      var3.setupUI(this.eventHandlerProvider, this.messageComponentProvider);
      return var3;
   }

   public override fun isForItem(item: ChatListItem, position: Int): Boolean {
      q.h(var1, "item");
      return var1 is BlockedGroupChatListItem;
   }
}
