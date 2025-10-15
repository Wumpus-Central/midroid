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
   internal final var chatListItems: List<ChatListItem> = CollectionsKt.k()
   public final val delegateViewTypes: Map<Class<out BaseChatListItemDelegate<out ChatListItem, out View>>, Int>

   init {
      val var3: AdapterDelegatesManager = this.delegatesManager;
      this.delegateViewTypes = ChatListAdapterConfiguratorKt.chatListAdapterConfigurator(
         var3, var1, var2, SharedRecycledViewPools.INSTANCE.getAccessoriesViewPool()
      );
      this.setHasStableIds(true);
   }

   public fun fillAdapter(recyclerView: RecyclerView) {
      val var2: SharedRecycledViewPools = SharedRecycledViewPools.INSTANCE;
      SharedRecycledViewPools.INSTANCE.configureChatListViewPoolSizes(this.delegateViewTypes);
      ChatListViewFactoryKt.fillChatList(var1, this, this.delegateViewTypes, var2.getChatListViewPool());
      ChatListViewFactoryKt.fillAccessories(var1, new MessageAccessoriesAdapter(null, 1, null), var2.getAccessoriesViewPool());
   }

   public override fun getChatListItem(position: Int): ChatListItem? {
      return CollectionsKt.j0(this.chatListItems, var1) as ChatListItem;
   }

   public override fun getChatListItems(): List<ChatListItem> {
      val var1: Any = this.items;
      return var1 as MutableList<ChatListItem>;
   }

   public open fun getItemId(position: Int): Long {
      return ((this.items as java.util.List).get(var1) as ChatListItem).getRecyclerItemId();
   }
}
