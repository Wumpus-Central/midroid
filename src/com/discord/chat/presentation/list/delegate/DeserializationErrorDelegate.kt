package com.discord.chat.presentation.list.delegate

import android.content.Context
import android.view.ViewGroup
import com.discord.chat.presentation.deserializationerror.DeserializationErrorView
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate.Metadata
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.list.item.DeserializationErrorChatListItem
import kotlin.jvm.internal.q

public class DeserializationErrorDelegate(eventHandlerProvider: () -> ChatEventHandler)
   : BaseChatListItemDelegate<DeserializationErrorChatListItem, DeserializationErrorView> {
   init {
      q.h(var1, "eventHandlerProvider");
      super(var1, null, 2, null);
   }

   public open fun bindView(view: DeserializationErrorView, item: DeserializationErrorChatListItem, metadata: Metadata<DeserializationErrorView>) {
      q.h(var1, "view");
      q.h(var2, "item");
      q.h(var3, "metadata");
      var1.configure(var2.getJson(), var2.getCauseMessage());
   }

   public open fun createView(parent: ViewGroup): DeserializationErrorView {
      q.h(var1, "parent");
      val var2: Context = var1.getContext();
      q.g(var2, "getContext(...)");
      return new DeserializationErrorView(var2, null, 2, null);
   }

   public override fun isForItem(item: ChatListItem, position: Int): Boolean {
      q.h(var1, "item");
      return var1 is DeserializationErrorChatListItem;
   }
}
