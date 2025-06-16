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

   @JvmStatic
   fun `onBindViewHolder$lambda$0`(var0: MessageBundleMessageDelegate, var1: java.util.List, var2: Int): MessageView.ChainPart {
      return var0.getChainPart(var1, var2);
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
            val var11: MessageView = var1 as MessageView;
            val var12: MessageBundleMessageItem = var2 as MessageBundleMessageItem;
            val var8: Message = (var2 as MessageBundleMessageItem).getMessageItem().getMessage();
            val var6: MessageContext = (var2 as MessageBundleMessageItem).getMessageItem().getMessageContext();
            val var7: MessageFrame = var12.getMessageItem().getMessageFrame();
            val var10: MessageItem = var12.getMessageItem();
            val var9: Context = var11.getContext();
            q.g(var9, "getContext(...)");
            MessageView.setMessage$default(
               var11,
               var8,
               var6,
               var7,
               MessageBundleDelegateUtilsKt.getEventHandler(var10, var9),
               null,
               new c(this, var3, var4),
               false,
               var12.getMessageItem().getRenderContentOnly(),
               80,
               null
            );
            if (this.messageAccessoriesViewPool != null) {
               var11.setAccessoriesRecycledViewPool(this.messageAccessoriesViewPool);
            }
         }
      }
   }
}
