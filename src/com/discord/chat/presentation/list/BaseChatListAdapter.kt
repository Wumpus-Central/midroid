package com.discord.chat.presentation.list

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.message.MessageAccessoriesAdapter
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.hannesdorfmann.adapterdelegates4.AdapterDelegatesManager

public open class BaseChatListAdapter(eventHandlerProvider: () -> ChatEventHandler, messageComponentProvider: () -> ComponentProvider)
   : com.hannesdorfmann.adapterdelegates4.c,
   ChatListAdapter {
   private final val messageAccessoriesRecycledViewPool: AccessoriesViewPool
   internal final var chatListItems: List<ChatListItem>
   public final val delegateViewTypes: Map<Class<out BaseChatListItemDelegate<out ChatListItem, out View>>, Int>

   init {
      kotlin.jvm.internal.r.h(var1, "eventHandlerProvider");
      kotlin.jvm.internal.r.h(var2, "messageComponentProvider");
      super();
      val var4: AccessoriesViewPool = new AccessoriesViewPool();
      this.messageAccessoriesRecycledViewPool = var4;
      this.chatListItems = kotlin.collections.i.k();
      val var3: AdapterDelegatesManager = this.delegatesManager;
      kotlin.jvm.internal.r.g(this.delegatesManager, "delegatesManager");
      this.delegateViewTypes = ChatListAdapterConfiguratorKt.chatListAdapterConfigurator(var3, var1, var2, var4);
      this.setHasStableIds(true);
   }

   public fun fillAdapter(recyclerView: RecyclerView) {
      kotlin.jvm.internal.r.h(var1, "recyclerView");
      val var3: java.util.Map = this.delegateViewTypes;
      val var2: RecyclerView.RecycledViewPool = var1.getRecycledViewPool();
      kotlin.jvm.internal.r.g(var2, "getRecycledViewPool(...)");
      ChatListViewFactoryKt.fillChatList(var1, this, var3, var2);
      ChatListViewFactoryKt.fillAccessories(var1, new MessageAccessoriesAdapter(null, 1, null), this.messageAccessoriesRecycledViewPool);
   }

   public override fun getChatListItem(position: Int): ChatListItem? {
      return kotlin.collections.i.k0(this.chatListItems, var1) as ChatListItem;
   }

   public override fun getChatListItems(): List<ChatListItem> {
      val var1: Any = this.items;
      kotlin.jvm.internal.r.g(this.items, "items");
      return var1 as MutableList<ChatListItem>;
   }

   public open fun getItemId(position: Int): Long {
      return ((this.items as java.util.List).get(var1) as ChatListItem).getRecyclerItemId();
   }
}
