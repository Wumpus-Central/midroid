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

public class RegularMessageDelegate(eventHandlerProvider: () -> ChatEventHandler,
   messageComponentProvider: () -> ComponentProvider,
   messageAccessoriesRecycledViewPool: RecycledViewPool
) : BaseChatListItemDelegate(var1, null, 2) {
   private final val messageComponentProvider: () -> ComponentProvider
   private final val messageAccessoriesRecycledViewPool: RecycledViewPool

   private final val componentProvider: ComponentProvider
      private final get() {
         return this.messageComponentProvider.invoke() as ComponentProvider;
      }


   init {
      this.messageComponentProvider = var2;
      this.messageAccessoriesRecycledViewPool = var3;
   }

   @JvmStatic
   fun `bindView$lambda$1`(var0: RegularMessageDelegate, var1: MessageItem, var2: BaseChatListItemDelegate.Metadata): MessageView.ChainPart {
      return var0.getChainPart(var1, var2);
   }

   private fun getChainPart(item: MessageItem, metadata: Metadata<MessageView>): ChainPart {
      val var5: RecyclerView.Adapter = var2.getHolder().getBindingAdapter();
      val var8: ChatListAdapter = var5 as ChatListAdapter;
      val var3: Int = var2.getHolder().getBindingAdapterPosition();
      var var4: Boolean = true;
      val var6: ChatListItem = CollectionsKt.l0(var8.getChatListItems(), var3 - 1) as ChatListItem;
      val var7: Boolean;
      if (var1.getMessage().getTimestamp() == null) {
         var7 = true;
      } else {
         var7 = false;
      }

      if (var6 !is MessageItem || (var6 as MessageItem).getMessage().getTimestamp() != null) {
         var4 = false;
      }

      if (var4 && !var7) {
         return MessageView.ChainPart.START;
      } else if (var4 && var7) {
         return MessageView.ChainPart.MIDDLE;
      } else {
         return if (!var4 && var7) MessageView.ChainPart.END else MessageView.ChainPart.ONLY;
      }
   }

   public open fun bindView(view: MessageView, item: MessageItem, metadata: Metadata<MessageView>) {
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
      val var2: Context = var1.getContext();
      val var3: MessageView = new MessageView(var2, null, 2, null);
      var3.setAccessoriesRecycledViewPool(this.messageAccessoriesRecycledViewPool);
      return var3;
   }

   public override fun isForItem(item: ChatListItem, position: Int): Boolean {
      return var1 is MessageItem;
   }

   protected open fun onViewRecycled(holder: ViewHolder) {
      val var2: View = var1.itemView;
      (var2 as MessageView).onRecycledHint();
      super.onViewRecycled(var1);
   }
}
