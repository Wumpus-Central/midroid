package com.discord.chat.presentation.list.delegate

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate.Metadata
import com.discord.chat.presentation.list.item.AutomodSystemMessageItem
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.message.system.AutomodSystemMessageView
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import kotlin.jvm.internal.r

public class AutomodSystemMessageDelegate(eventHandlerProvider: () -> ChatEventHandler,
      messageComponentProvider: () -> ComponentProvider,
      messageAccessoriesRecycledViewPool: RecycledViewPool
   )
   : BaseChatListItemDelegate<AutomodSystemMessageItem, AutomodSystemMessageView> {
   private final val componentProvider: ComponentProvider
      private final get() {
         return this.messageComponentProvider.invoke() as ComponentProvider;
      }


   private final val messageAccessoriesRecycledViewPool: RecycledViewPool
   private final val messageComponentProvider: () -> ComponentProvider

   init {
      r.h(var1, "eventHandlerProvider");
      r.h(var2, "messageComponentProvider");
      r.h(var3, "messageAccessoriesRecycledViewPool");
      super(var1, null, 2, null);
      this.messageComponentProvider = var2;
      this.messageAccessoriesRecycledViewPool = var3;
   }

   public open fun bindView(view: AutomodSystemMessageView, item: AutomodSystemMessageItem, metadata: Metadata<AutomodSystemMessageView>) {
      r.h(var1, "view");
      r.h(var2, "item");
      r.h(var3, "metadata");
      var1.setMessage(var2.getMessage(), var2.getMessageContext(), this.getEventHandler(), this.getComponentProvider(), var2.getAllowChildGestures());
   }

   public open fun createView(parent: ViewGroup): AutomodSystemMessageView {
      r.h(var1, "parent");
      val var2: Context = var1.getContext();
      r.g(var2, "parent.context");
      val var3: AutomodSystemMessageView = new AutomodSystemMessageView(var2, null, 2, null);
      var3.setAccessoriesRecycledViewPool(this.messageAccessoriesRecycledViewPool);
      return var3;
   }

   public override fun isForItem(item: ChatListItem, position: Int): Boolean {
      r.h(var1, "item");
      return var1 is AutomodSystemMessageItem;
   }
}
