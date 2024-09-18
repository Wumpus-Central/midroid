package com.discord.chat.presentation.list.delegate.messagebundling

import android.content.Context
import android.view.View
import com.discord.chat.presentation.list.item.MessageBundleConversationItem
import com.discord.chat.presentation.list.item.MessageBundleItem
import com.discord.chat.presentation.list.item.MessageItem
import com.discord.chat.presentation.list.messagebundling.MessageBundleConversationView
import com.discord.primitives.MessageId
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import kotlin.jvm.internal.q

public class MessageBundleConversationDelegate(onMeasured: (View, Int, Int) -> Unit) : MessageBundleBaseDelegate {
   public final var onTapReply: (MessageId) -> Unit

   init {
      q.h(var1, "onMeasured");
      super(var1);
      this.onTapReply = <unrepresentable>.INSTANCE;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$0`(var0: MessageBundleConversationDelegate, var1: MessageBundleItem, var2: View) {
      q.h(var0, "this$0");
      q.h(var1, "$item");
      var0.onTapReply.invoke(MessageId.box-impl((var1 as MessageBundleConversationItem).getMessageItem().getMessage().getId-3Eiw7ao()));
   }

   public open fun createView(context: Context): MessageBundleConversationView {
      q.h(var1, "context");
      return new MessageBundleConversationView(var1, null, 0, 6, null);
   }

   protected open fun isForViewType(items: List<MessageBundleItem>, position: Int): Boolean {
      q.h(var1, "items");
      return var1.get(var2) is MessageBundleConversationItem;
   }

   public override fun onBindViewHolder(view: View, item: MessageBundleItem, items: List<MessageBundleItem>, position: Int) {
      q.h(var1, "view");
      q.h(var2, "item");
      q.h(var3, "items");
      if (var1 is MessageBundleConversationView) {
         if (var2 is MessageBundleConversationItem) {
            val var5: MessageBundleConversationView = var1 as MessageBundleConversationView;
            val var8: MessageItem = (var2 as MessageBundleConversationItem).getMessageItem();
            val var7: MessageItem = (var2 as MessageBundleConversationItem).getMessageItem();
            val var9: Context = var5.getContext();
            q.g(var9, "getContext(...)");
            var5.configure(var8, MessageBundleDelegateUtilsKt.getEventHandler(var7, var9));
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var1, false, new a(this, var2), 1, null);
         }
      }
   }
}
