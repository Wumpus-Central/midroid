package com.discord.chat.presentation.list.delegate

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.discord.chat.bridge.Message
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate.Metadata
import com.discord.chat.presentation.list.item.AutomodSystemMessageItem
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.message.system.AutomodSystemMessageView
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import com.discord.chat.presentation.root.MessageContext
import kotlin.jvm.internal.q

public class AutomodSystemMessageDelegate(eventHandlerProvider: () -> ChatEventHandler,
      messageComponentProvider: () -> ComponentProvider,
      messageAccessoriesRecycledViewPool: RecycledViewPool
   )
   : BaseChatListItemDelegate<AutomodSystemMessageItem, AutomodSystemMessageView> {
   private final val messageComponentProvider: () -> ComponentProvider
   private final val messageAccessoriesRecycledViewPool: RecycledViewPool

   private final val componentProvider: ComponentProvider
      private final get() {
         return this.messageComponentProvider.invoke() as ComponentProvider;
      }


   init {
      q.h(var1, "eventHandlerProvider");
      q.h(var2, "messageComponentProvider");
      q.h(var3, "messageAccessoriesRecycledViewPool");
      super(var1, null, 2, null);
      this.messageComponentProvider = var2;
      this.messageAccessoriesRecycledViewPool = var3;
   }

   public open fun bindView(view: AutomodSystemMessageView, item: AutomodSystemMessageItem, metadata: Metadata<AutomodSystemMessageView>) {
      q.h(var1, "view");
      q.h(var2, "item");
      q.h(var3, "metadata");
      var1.setMessage(var2.getMessage(), var2.getMessageContext(), this.getEventHandler(), this.getComponentProvider(), var2.getAllowChildGestures());
   }

   public fun createAndBindStandaloneView(parent: ViewGroup, message: Message, messageContext: MessageContext): AutomodSystemMessageView {
      q.h(var1, "parent");
      q.h(var2, "message");
      q.h(var3, "messageContext");
      val var4: AutomodSystemMessageView = this.createView(var1);
      val var5: AutomodSystemMessageItem = new AutomodSystemMessageItem(var2, var3, false, 4, null);
      AutomodSystemMessageView.setMessage$default(var4, var5.getMessage(), var5.getMessageContext(), this.getEventHandler(), null, false, 24, null);
      return var4;
   }

   public open fun createView(parent: ViewGroup): AutomodSystemMessageView {
      q.h(var1, "parent");
      val var2: Context = var1.getContext();
      q.g(var2, "getContext(...)");
      val var3: AutomodSystemMessageView = new AutomodSystemMessageView(var2, null, 2, null);
      var3.setAccessoriesRecycledViewPool(this.messageAccessoriesRecycledViewPool);
      return var3;
   }

   public override fun isForItem(item: ChatListItem, position: Int): Boolean {
      q.h(var1, "item");
      return var1 is AutomodSystemMessageItem;
   }
}
