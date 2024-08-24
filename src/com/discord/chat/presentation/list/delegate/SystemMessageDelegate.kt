package com.discord.chat.presentation.list.delegate

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.discord.chat.bridge.Message
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate.Metadata
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.list.item.SystemMessageItem
import com.discord.chat.presentation.message.system.SystemMessageView
import com.discord.chat.presentation.root.MessageContext
import kotlin.jvm.internal.r

public class SystemMessageDelegate(eventHandlerProvider: () -> ChatEventHandler, messageAccessoriesRecycledViewPool: RecycledViewPool)
   : BaseChatListItemDelegate<SystemMessageItem, SystemMessageView> {
   private final val messageAccessoriesRecycledViewPool: RecycledViewPool

   init {
      r.h(var1, "eventHandlerProvider");
      r.h(var2, "messageAccessoriesRecycledViewPool");
      super(var1, null, 2, null);
      this.messageAccessoriesRecycledViewPool = var2;
   }

   public open fun bindView(view: SystemMessageView, item: SystemMessageItem, metadata: Metadata<SystemMessageView>) {
      r.h(var1, "view");
      r.h(var2, "item");
      r.h(var3, "metadata");
      var1.setMessage(var2.getMessage(), var2.getMessageContext(), this.getEventHandler());
   }

   public fun createAndBindStandaloneView(parent: ViewGroup, message: Message, messageContext: MessageContext): SystemMessageView {
      r.h(var1, "parent");
      r.h(var2, "message");
      r.h(var3, "messageContext");
      val var4: SystemMessageView = this.createView(var1);
      val var5: SystemMessageItem = new SystemMessageItem(var2, var3, null, 4, null);
      var4.setMessage(var5.getMessage(), var5.getMessageContext(), this.getEventHandler());
      return var4;
   }

   public open fun createView(parent: ViewGroup): SystemMessageView {
      r.h(var1, "parent");
      val var2: Context = var1.getContext();
      r.g(var2, "parent.context");
      val var3: SystemMessageView = new SystemMessageView(var2, null, 2, null);
      var3.setAccessoriesRecycledViewPool(this.messageAccessoriesRecycledViewPool);
      return var3;
   }

   public override fun isForItem(item: ChatListItem, position: Int): Boolean {
      r.h(var1, "item");
      return var1 is SystemMessageItem;
   }
}
