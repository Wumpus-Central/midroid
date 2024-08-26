package com.discord.chat.presentation.list.delegate.messagebundling

import android.content.Context
import android.view.View
import com.discord.chat.presentation.list.item.MessageBundleConversationItem
import com.discord.chat.presentation.list.item.MessageBundleItem
import com.discord.chat.presentation.list.item.MessageItem
import com.discord.chat.presentation.list.messagebundling.MessageBundleConversationView
import com.discord.primitives.MessageId
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import kotlin.jvm.internal.r

public class MessageBundleConversationDelegate(onMeasured: (View, Int, Int) -> Unit) : MessageBundleBaseDelegate {
   public final var onTapReply: (MessageId) -> Unit

   init {
      r.h(var1, "onMeasured");
      super(var1);
      this.onTapReply = <unrepresentable>.INSTANCE;
   }

   @JvmStatic
   fun `onBindViewHolder$lambda$0`(var0: MessageBundleConversationDelegate, var1: MessageBundleItem, var2: View) {
      r.h(var0, "this$0");
      r.h(var1, "$item");
      var0.onTapReply.invoke(MessageId.box_impl((var1 as MessageBundleConversationItem).getMessageItem().getMessage().getId_3Eiw7ao()));
   }

   public open fun createView(context: Context): MessageBundleConversationView {
      r.h(var1, "context");
      return new MessageBundleConversationView(var1, null, 0, 6, null);
   }

   protected open fun isForViewType(items: List<MessageBundleItem>, position: Int): Boolean {
      r.h(var1, "items");
      return var1.get(var2) is MessageBundleConversationItem;
   }

   public override fun onBindViewHolder(view: View, item: MessageBundleItem, items: List<MessageBundleItem>, position: Int) {
      r.h(var1, "view");
      r.h(var2, "item");
      r.h(var3, "items");
      if (var1 is MessageBundleConversationView) {
         if (var2 is MessageBundleConversationItem) {
            val var5: MessageBundleConversationView = var1 as MessageBundleConversationView;
            val var8: MessageItem = (var2 as MessageBundleConversationItem).getMessageItem();
            val var9: MessageItem = (var2 as MessageBundleConversationItem).getMessageItem();
            val var7: Context = var5.getContext();
            r.g(var7, "view.context");
            var5.configure(var8, MessageBundleDelegateUtilsKt.getEventHandler(var9, var7));
            NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var1, false, new a(this, var2), 1, null);
         }
      }
   }
}
