package com.discord.chat.presentation.list.delegate

import android.content.Context
import android.view.ViewGroup
import com.discord.chat.presentation.deserializationerror.DeserializationErrorView
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate.Metadata
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.list.item.DeserializationErrorChatListItem
import kotlin.jvm.internal.r

public class DeserializationErrorDelegate(eventHandlerProvider: () -> ChatEventHandler)
   : BaseChatListItemDelegate<DeserializationErrorChatListItem, DeserializationErrorView> {
   init {
      r.h(var1, "eventHandlerProvider");
      super(var1, null, 2, null);
   }

   public open fun bindView(view: DeserializationErrorView, item: DeserializationErrorChatListItem, metadata: Metadata<DeserializationErrorView>) {
      r.h(var1, "view");
      r.h(var2, "item");
      r.h(var3, "metadata");
      var1.configure(var2.getJson(), var2.getCauseMessage());
   }

   public open fun createView(parent: ViewGroup): DeserializationErrorView {
      r.h(var1, "parent");
      val var2: Context = var1.getContext();
      r.g(var2, "parent.context");
      return new DeserializationErrorView(var2, null, 2, null);
   }

   public override fun isForItem(item: ChatListItem, position: Int): Boolean {
      r.h(var1, "item");
      return var1 is DeserializationErrorChatListItem;
   }
}
