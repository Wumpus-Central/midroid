package com.discord.chat.presentation.list.delegate

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import com.discord.chat.bridge.Message
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate.Metadata
import com.discord.chat.presentation.list.item.CallSystemMessageItem
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.message.system.CallSystemMessageView
import com.discord.misc.utilities.size.SizeUtilsKt
import com.discord.react_gesture_handler.nested_touch.NestedScrollOnTouchUtilsKt
import kotlin.jvm.internal.r

public class CallSystemMessageDelegate(eventHandlerProvider: () -> ChatEventHandler) : BaseChatListItemDelegate<CallSystemMessageItem, CallSystemMessageView> {
   init {
      r.h(var1, "eventHandlerProvider");
      super(var1, null, 2, null);
   }

   private fun bindViewInternal(view: CallSystemMessageView, item: CallSystemMessageItem) {
      val var3: LayoutParams = var1.getLayoutParams();
      if (var3 != null) {
         val var4: androidx.recyclerview.widget.RecyclerView.LayoutParams = var3 as androidx.recyclerview.widget.RecyclerView.LayoutParams;
         (var3 as androidx.recyclerview.widget.RecyclerView.LayoutParams).leftMargin = SizeUtilsKt.getDpToPx(12);
         var4.rightMargin = SizeUtilsKt.getDpToPx(12);
         var1.setLayoutParams(var4);
         var1.setMessage(var2.getMessage());
         NestedScrollOnTouchUtilsKt.setOnClickListenerNested$default(var1, false, new a(this, var2), 1, null);
      } else {
         throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
      }
   }

   @JvmStatic
   fun `bindViewInternal$lambda$2`(var0: CallSystemMessageDelegate, var1: CallSystemMessageItem, var2: View) {
      r.h(var0, "this$0");
      r.h(var1, "$item");
      var0.getEventHandler().onTapCall_pfaIj0E(var1.getMessage().getId_3Eiw7ao(), var1.getMessage().getChannelId_o4g7jtM());
   }

   public open fun bindView(view: CallSystemMessageView, item: CallSystemMessageItem, metadata: Metadata<CallSystemMessageView>) {
      r.h(var1, "view");
      r.h(var2, "item");
      r.h(var3, "metadata");
      this.bindViewInternal(var1, var2);
   }

   public fun createAndBindStandaloneView(parent: ViewGroup, message: Message): CallSystemMessageView {
      r.h(var1, "parent");
      r.h(var2, "message");
      val var3: CallSystemMessageView = this.createView(var1);
      this.bindViewInternal(var3, new CallSystemMessageItem(var2));
      return var3;
   }

   public open fun createView(parent: ViewGroup): CallSystemMessageView {
      r.h(var1, "parent");
      val var2: Context = var1.getContext();
      r.g(var2, "parent.context");
      return new CallSystemMessageView(var2, null, 2, null);
   }

   public override fun isForItem(item: ChatListItem, position: Int): Boolean {
      r.h(var1, "item");
      return var1 is CallSystemMessageItem;
   }
}
