package com.discord.chat.presentation.list.delegate

import android.content.Context
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import com.discord.chat.bridge.Message
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate.Metadata
import com.discord.chat.presentation.list.item.CallSystemMessageItem
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.message.system.CallSystemMessageView
import com.discord.misc.utilities.size.SizeUtilsKt
import kotlin.jvm.internal.SourceDebugExtension

@SourceDebugExtension(["SMAP\nCallSystemMessageDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CallSystemMessageDelegate.kt\ncom/discord/chat/presentation/list/delegate/CallSystemMessageDelegate\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,46:1\n327#2,4:47\n*S KotlinDebug\n*F\n+ 1 CallSystemMessageDelegate.kt\ncom/discord/chat/presentation/list/delegate/CallSystemMessageDelegate\n*L\n38#1:47,4\n*E\n"])
public class CallSystemMessageDelegate(eventHandlerProvider: () -> ChatEventHandler) : BaseChatListItemDelegate(var1, null, 2) {
   private fun bindViewInternal(view: CallSystemMessageView, item: CallSystemMessageItem) {
      val var3: LayoutParams = var1.getLayoutParams();
      if (var3 != null) {
         val var4: androidx.recyclerview.widget.RecyclerView.LayoutParams = var3 as androidx.recyclerview.widget.RecyclerView.LayoutParams;
         (var3 as androidx.recyclerview.widget.RecyclerView.LayoutParams).leftMargin = SizeUtilsKt.getDpToPx(12);
         var4.rightMargin = SizeUtilsKt.getDpToPx(12);
         var1.setLayoutParams(var4);
         var1.setMessage(var2.getMessage(), this.getEventHandler());
      } else {
         throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
      }
   }

   public open fun bindView(view: CallSystemMessageView, item: CallSystemMessageItem, metadata: Metadata<CallSystemMessageView>) {
      this.bindViewInternal(var1, var2);
   }

   public fun createAndBindStandaloneView(parent: ViewGroup, message: Message): CallSystemMessageView {
      val var3: CallSystemMessageView = this.createView(var1);
      this.bindViewInternal(var3, new CallSystemMessageItem(var2));
      return var3;
   }

   public open fun createView(parent: ViewGroup): CallSystemMessageView {
      val var2: Context = var1.getContext();
      return new CallSystemMessageView(var2, null, 2, null);
   }

   public override fun isForItem(item: ChatListItem, position: Int): Boolean {
      return var1 is CallSystemMessageItem;
   }
}
