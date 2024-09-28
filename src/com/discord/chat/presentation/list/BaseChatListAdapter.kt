package com.discord.chat.presentation.list

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.message.MessageAccessoriesAdapter
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.hannesdorfmann.adapterdelegates4.AdapterDelegatesManager
import kotlin.jvm.internal.q

public open class BaseChatListAdapter(eventHandlerProvider: () -> ChatEventHandler, messageComponentProvider: () -> ComponentProvider)
   : com.hannesdorfmann.adapterdelegates4.c,
   ChatListAdapter {
   private final val messageAccessoriesRecycledViewPool: AccessoriesViewPool
   internal final var chatListItems: List<ChatListItem>
   public final val delegateViewTypes: Map<Class<out BaseChatListItemDelegate<out ChatListItem, out View>>, Int>

   init {
      q.h(var1, "eventHandlerProvider");
      q.h(var2, "messageComponentProvider");
      super();
      val var4: AccessoriesViewPool = new AccessoriesViewPool();
      this.messageAccessoriesRecycledViewPool = var4;
      this.chatListItems = i.k();
      val var3: AdapterDelegatesManager = this.delegatesManager;
      q.g(this.delegatesManager, "delegatesManager");
      this.delegateViewTypes = ChatListAdapterConfiguratorKt.chatListAdapterConfigurator(var3, var1, var2, var4);
      this.setHasStableIds(true);
   }

   public fun fillAdapter(recyclerView: RecyclerView) {
      q.h(var1, "recyclerView");
      val var2: java.util.Map = this.delegateViewTypes;
      val var3: RecyclerView.RecycledViewPool = var1.getRecycledViewPool();
      q.g(var3, "getRecycledViewPool(...)");
      ChatListViewFactoryKt.fillChatList(var1, this, var2, var3);
      ChatListViewFactoryKt.fillAccessories(var1, new MessageAccessoriesAdapter(null, 1, null), this.messageAccessoriesRecycledViewPool);
   }

   public override fun getChatListItem(position: Int): ChatListItem? {
      return i.h0(this.chatListItems, var1) as ChatListItem;
   }

   public override fun getChatListItems(): List<ChatListItem> {
      val var1: Any = this.items;
      q.g(this.items, "items");
      return var1 as MutableList<ChatListItem>;
   }

   public open fun getItemId(position: Int): Long {
      return ((this.items as java.util.List).get(var1) as ChatListItem).getRecyclerItemId();
   }
}
