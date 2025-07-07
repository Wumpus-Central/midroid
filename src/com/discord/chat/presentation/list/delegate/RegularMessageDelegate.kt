package com.discord.chat.presentation.list.delegate

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.ChatListAdapter
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate.Metadata
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.list.item.MessageItem
import com.discord.chat.presentation.message.MessageView
import com.discord.chat.presentation.message.MessageView.ChainPart
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import kotlin.jvm.internal.r

public class RegularMessageDelegate(eventHandlerProvider: () -> ChatEventHandler,
      messageComponentProvider: () -> ComponentProvider,
      messageAccessoriesRecycledViewPool: RecycledViewPool
   )
   : BaseChatListItemDelegate<MessageItem, MessageView> {
   private final val messageComponentProvider: () -> ComponentProvider
   private final val messageAccessoriesRecycledViewPool: RecycledViewPool

   private final val componentProvider: ComponentProvider
      private final get() {
         return this.messageComponentProvider.invoke() as ComponentProvider;
      }


   init {
      r.h(var1, "eventHandlerProvider");
      r.h(var2, "messageComponentProvider");
      r.h(var3, "messageAccessoriesRecycledViewPool");
      super(var1, null, 2, null);
      this.messageComponentProvider = var2;
      this.messageAccessoriesRecycledViewPool = var3;
   }

   @JvmStatic
   fun `bindView$lambda$1`(var0: RegularMessageDelegate, var1: MessageItem, var2: BaseChatListItemDelegate.Metadata): MessageView.ChainPart {
      return var0.getChainPart(var1, var2);
   }

   private fun getChainPart(item: MessageItem, metadata: Metadata<MessageView>): ChainPart {
      val var5: RecyclerView.Adapter = var2.getHolder().getBindingAdapter();
      r.f(var5, "null cannot be cast to non-null type com.discord.chat.presentation.list.ChatListAdapter");
      val var9: ChatListAdapter = var5 as ChatListAdapter;
      val var3: Int = var2.getHolder().getBindingAdapterPosition();
      var var4: Boolean = true;
      val var7: ChatListItem = i.k0(var9.getChatListItems(), var3 - 1) as ChatListItem;
      val var8: Boolean;
      if (var1.getMessage().getTimestamp() == null) {
         var8 = true;
      } else {
         var8 = false;
      }

      if (var7 !is MessageItem || (var7 as MessageItem).getMessage().getTimestamp() != null) {
         var4 = false;
      }

      val var6: MessageView.ChainPart;
      if (var4 && !var8) {
         var6 = MessageView.ChainPart.START;
      } else if (var4 && var8) {
         var6 = MessageView.ChainPart.MIDDLE;
      } else if (!var4 && var8) {
         var6 = MessageView.ChainPart.END;
      } else {
         var6 = MessageView.ChainPart.ONLY;
      }

      return var6;
   }

   public open fun bindView(view: MessageView, item: MessageItem, metadata: Metadata<MessageView>) {
      r.h(var1, "view");
      r.h(var2, "item");
      r.h(var3, "metadata");
      var1.setMessage(
         var2.getMessage(),
         var2.getMessageContext(),
         var2.getMessageFrame(),
         this.getEventHandler(),
         this.getComponentProvider(),
         new e(this, var2, var3),
         var2.getAllowChildGestures(),
         var2.getRenderContentOnly()
      );
   }

   public open fun createView(parent: ViewGroup): MessageView {
      r.h(var1, "parent");
      val var2: Context = var1.getContext();
      r.g(var2, "getContext(...)");
      val var3: MessageView = new MessageView(var2, null, 2, null);
      var3.setAccessoriesRecycledViewPool(this.messageAccessoriesRecycledViewPool);
      return var3;
   }

   public override fun isForItem(item: ChatListItem, position: Int): Boolean {
      r.h(var1, "item");
      return var1 is MessageItem;
   }

   protected open fun onViewRecycled(holder: ViewHolder) {
      r.h(var1, "holder");
      val var2: View = var1.itemView;
      r.f(var1.itemView, "null cannot be cast to non-null type com.discord.chat.presentation.message.MessageView");
      (var2 as MessageView).onRecycledHint();
      super.onViewRecycled(var1);
   }
}
