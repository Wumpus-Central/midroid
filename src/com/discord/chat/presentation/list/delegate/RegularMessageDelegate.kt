package com.discord.chat.presentation.list.delegate

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.ChatListAdapter
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate.Metadata
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.list.item.MessageItem
import com.discord.chat.presentation.message.MessageView
import com.discord.chat.presentation.message.MessageView.ChainPart
import com.discord.chat.presentation.message.view.botuikit.ComponentProvider
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.q

public class RegularMessageDelegate(eventHandlerProvider: () -> ChatEventHandler,
      messageComponentProvider: () -> ComponentProvider,
      messageAccessoriesRecycledViewPool: RecycledViewPool
   )
   : BaseChatListItemDelegate<MessageItem, MessageView> {
   private final val componentProvider: ComponentProvider
      private final get() {
         return this.messageComponentProvider.invoke() as ComponentProvider;
      }


   private final val messageAccessoriesRecycledViewPool: RecycledViewPool
   private final val messageComponentProvider: () -> ComponentProvider

   init {
      q.h(var1, "eventHandlerProvider");
      q.h(var2, "messageComponentProvider");
      q.h(var3, "messageAccessoriesRecycledViewPool");
      super(var1, null, 2, null);
      this.messageComponentProvider = var2;
      this.messageAccessoriesRecycledViewPool = var3;
   }

   private fun getChainPart(item: MessageItem, metadata: Metadata<MessageView>): ChainPart {
      val var5: RecyclerView.Adapter = var2.getHolder().getBindingAdapter();
      q.f(var5, "null cannot be cast to non-null type com.discord.chat.presentation.list.ChatListAdapter");
      val var9: ChatListAdapter = var5 as ChatListAdapter;
      val var3: Int = var2.getHolder().getBindingAdapterPosition();
      var var4: Boolean = true;
      val var7: ChatListItem = i.g0(var9.getChatListItems(), var3 - 1) as ChatListItem;
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
      q.h(var1, "view");
      q.h(var2, "item");
      q.h(var3, "metadata");
      var1.setMessage(
         var2.getMessage(),
         var2.getMessageContext(),
         var2.getMessageFrame(),
         this.getEventHandler(),
         this.getComponentProvider(),
         new Function0(this, var2, var3) {
            final MessageItem $item;
            final BaseChatListItemDelegate.Metadata<MessageView> $metadata;
            final RegularMessageDelegate this$0;

            {
               super(0);
               this.this$0 = var1;
               this.$item = var2;
               this.$metadata = var3;
            }

            public final MessageView.ChainPart invoke() {
               return RegularMessageDelegate.access$getChainPart(this.this$0, this.$item, this.$metadata);
            }
         },
         var2.getAllowChildGestures(),
         var2.isHighlight(),
         var2.getRenderContentOnly()
      );
   }

   public open fun createView(parent: ViewGroup): MessageView {
      q.h(var1, "parent");
      val var2: Context = var1.getContext();
      q.g(var2, "getContext(...)");
      val var3: MessageView = new MessageView(var2, null, 2, null);
      var3.setAccessoriesRecycledViewPool(this.messageAccessoriesRecycledViewPool);
      return var3;
   }

   public override fun isForItem(item: ChatListItem, position: Int): Boolean {
      q.h(var1, "item");
      return var1 is MessageItem;
   }
}
