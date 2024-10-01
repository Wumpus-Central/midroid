package com.discord.chat.presentation.list.delegate

import android.content.Context
import android.view.View
import android.view.ViewGroup
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate.Metadata
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.list.item.SummarySeparatorChatListItem
import com.discord.chat.presentation.separator.SummarySeparatorView
import kotlin.jvm.internal.q

public class SummarySeparatorDelegate(eventHandlerProvider: () -> ChatEventHandler)
   : BaseChatListItemDelegate<SummarySeparatorChatListItem, SummarySeparatorView> {
   init {
      q.h(var1, "eventHandlerProvider");
      super(var1, null, 2, null);
   }

   @JvmStatic
   fun `bindView$lambda$2$lambda$0`(var0: SummarySeparatorDelegate, var1: SummarySeparatorChatListItem, var2: View) {
      q.h(var0, "this$0");
      q.h(var1, "$item");
      var0.getEventHandler().onTapSummary-sekaTiM(var1.getSummary().getChannelId-o4g7jtM(), var1.getCurrentMsgId-3Eiw7ao(), var1.getSummary().getId());
   }

   @JvmStatic
   fun `bindView$lambda$2$lambda$1`(var0: SummarySeparatorDelegate, var1: SummarySeparatorChatListItem, var2: View) {
      q.h(var0, "this$0");
      q.h(var1, "$item");
      var0.getEventHandler().onTapSummaryJump-sekaTiM(var1.getSummary().getChannelId-o4g7jtM(), var1.getJumpToMsgId-3Eiw7ao(), var1.getSummary().getId());
   }

   public open fun bindView(view: SummarySeparatorView, item: SummarySeparatorChatListItem, metadata: Metadata<SummarySeparatorView>) {
      q.h(var1, "view");
      q.h(var2, "item");
      q.h(var3, "metadata");
      var1.setDividerColor(var2.getColor());
      var1.setText(var2.getText());
      var1.setIsBeforeContent(var2.isBeforeContent());
      var1.setMoreActionsHandler(new a(this, var2));
      var1.setJumpToBottomHandler(new b(this, var2));
   }

   public open fun createView(parent: ViewGroup): SummarySeparatorView {
      q.h(var1, "parent");
      val var2: Context = var1.getContext();
      q.g(var2, "getContext(...)");
      return new SummarySeparatorView(var2, null, 2, null);
   }

   public override fun isForItem(item: ChatListItem, position: Int): Boolean {
      q.h(var1, "item");
      return var1 is SummarySeparatorChatListItem;
   }
}
