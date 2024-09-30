package com.discord.chat.presentation.list.delegate.messagebundling

import android.content.Context
import android.view.View
import androidx.recyclerview.widget.RecyclerView.RecycledViewPool
import com.discord.chat.bridge.Message
import com.discord.chat.bridge.messageframe.MessageFrame
import com.discord.chat.presentation.list.item.MessageBundleItem
import com.discord.chat.presentation.list.item.MessageBundleMessageItem
import com.discord.chat.presentation.list.item.MessageItem
import com.discord.chat.presentation.message.MessageView
import com.discord.chat.presentation.message.MessageView.ChainPart
import com.discord.chat.presentation.root.MessageContext
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.q

public class MessageBundleMessageDelegate(onMeasured: (View, Int, Int) -> Unit) : MessageBundleBaseDelegate {
   public final var messageAccessoriesViewPool: RecycledViewPool?

   init {
      q.h(var1, "onMeasured");
      super(var1);
   }

   private fun List<*>.getChainPart(position: Int): ChainPart {
      val var3: Int = var1.size();
      val var4: MessageView.ChainPart;
      if (var3 == 0 || var3 == 1) {
         var4 = MessageView.ChainPart.ONLY;
      } else if (var2 == 0) {
         var4 = MessageView.ChainPart.START;
      } else if (var2 == var3 - 1) {
         var4 = MessageView.ChainPart.END;
      } else {
         var4 = MessageView.ChainPart.MIDDLE;
      }

      return var4;
   }

   public open fun createView(context: Context): MessageView {
      q.h(var1, "context");
      return new MessageView(var1, null, 2, null);
   }

   protected open fun isForViewType(items: List<MessageBundleItem>, position: Int): Boolean {
      q.h(var1, "items");
      return var1.get(var2) is MessageBundleMessageItem;
   }

   public override fun onBindViewHolder(view: View, item: MessageBundleItem, items: List<MessageBundleItem>, position: Int) {
      q.h(var1, "view");
      q.h(var2, "item");
      q.h(var3, "items");
      if (var1 is MessageView) {
         if (var2 is MessageBundleMessageItem) {
            val var12: MessageView = var1 as MessageView;
            val var7: MessageBundleMessageItem = var2 as MessageBundleMessageItem;
            val var8: Message = (var2 as MessageBundleMessageItem).getMessageItem().getMessage();
            val var13: MessageContext = (var2 as MessageBundleMessageItem).getMessageItem().getMessageContext();
            val var9: MessageFrame = var7.getMessageItem().getMessageFrame();
            val var10: MessageItem = var7.getMessageItem();
            val var11: Context = var12.getContext();
            q.g(var11, "getContext(...)");
            MessageView.setMessage$default(
               var12, var8, var13, var9, MessageBundleDelegateUtilsKt.getEventHandler(var10, var11), null, new Function0(this, var3, var4) {
                  final java.util.List<MessageBundleItem> $items;
                  final int $position;
                  final MessageBundleMessageDelegate this$0;

                  {
                     super(0);
                     this.this$0 = var1;
                     this.$items = var2;
                     this.$position = var3;
                  }

                  public final MessageView.ChainPart invoke() {
                     return MessageBundleMessageDelegate.access$getChainPart(this.this$0, this.$items, this.$position);
                  }
               }, false, var7.getMessageItem().isHighlight(), var7.getMessageItem().getRenderContentOnly(), 80, null
            );
            if (this.messageAccessoriesViewPool != null) {
               var12.setAccessoriesRecycledViewPool(this.messageAccessoriesViewPool);
            }
         }
      }
   }
}
