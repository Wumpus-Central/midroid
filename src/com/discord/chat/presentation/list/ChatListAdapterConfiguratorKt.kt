package com.discord.chat.presentation.list

import android.view.View
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.delegate.AutomodSystemMessageDelegate
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate
import com.discord.chat.presentation.list.delegate.BlockedGroupDelegate
import com.discord.chat.presentation.list.delegate.CallSystemMessageDelegate
import com.discord.chat.presentation.list.delegate.DeserializationErrorDelegate
import com.discord.chat.presentation.list.delegate.DeserializationErrorMessageDelegate
import com.discord.chat.presentation.list.delegate.LoadingDelegate
import com.discord.chat.presentation.list.delegate.PortalViewDelegate
import com.discord.chat.presentation.list.delegate.RegularMessageDelegate
import com.discord.chat.presentation.list.delegate.SeparatorDelegate
import com.discord.chat.presentation.list.delegate.SummarySeparatorDelegate
import com.discord.chat.presentation.list.delegate.SystemMessageDelegate
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.hannesdorfmann.adapterdelegates4.AdapterDelegatesManager
import java.util.HashMap
import kotlin.jvm.internal.q

public fun chatListAdapterConfigurator(
   delegatesManager: AdapterDelegatesManager<List<ChatListItem>>,
   eventHandlerProvider: () -> ChatEventHandler,
   messageComponentProvider: () -> ComponentProvider,
   messageAccessoriesRecycledViewPool: RecycledViewPool
): Map<Class<out BaseChatListItemDelegate<out ChatListItem, out View>>, Int> {
   q.h(var0, "delegatesManager");
   q.h(var1, "eventHandlerProvider");
   q.h(var2, "messageComponentProvider");
   q.h(var3, "messageAccessoriesRecycledViewPool");
   val var4: HashMap = new HashMap();

   for (BaseChatListItemDelegate var5 : i.n(
      new BaseChatListItemDelegate[]{
         new RegularMessageDelegate(var1, var2, var3),
         new SystemMessageDelegate(var1, var3),
         new AutomodSystemMessageDelegate(var1, var2, var3),
         new CallSystemMessageDelegate(var1),
         new SeparatorDelegate(var1),
         new SummarySeparatorDelegate(var1),
         new LoadingDelegate(var1),
         new BlockedGroupDelegate(var1, var2),
         new PortalViewDelegate(var1),
         new DeserializationErrorMessageDelegate(var1),
         new DeserializationErrorDelegate(var1)
      }
   )) {
      var0.c(var5);
      var4.put(var5.getClass(), var0.f(var5));
   }

   return var4;
}
