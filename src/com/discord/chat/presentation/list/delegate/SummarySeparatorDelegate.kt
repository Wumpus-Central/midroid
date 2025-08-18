package com.discord.chat.presentation.list.delegate

import android.content.Context
import android.view.View
import android.view.ViewGroup
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.list.delegate.BaseChatListItemDelegate.Metadata
import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.list.item.SummarySeparatorChatListItem
import com.discord.chat.presentation.separator.SummarySeparatorView

public class SummarySeparatorDelegate(eventHandlerProvider: () -> ChatEventHandler) : BaseChatListItemDelegate(var1, null, 2) {
   @JvmStatic
   fun `bindView$lambda$2$lambda$0`(var0: SummarySeparatorDelegate, var1: SummarySeparatorChatListItem, var2: View) {
      var0.getEventHandler().onTapSummary-sekaTiM(var1.getSummary().getChannelId-o4g7jtM(), var1.getCurrentMsgId-3Eiw7ao(), var1.getSummary().getId());
   }

   @JvmStatic
   fun `bindView$lambda$2$lambda$1`(var0: SummarySeparatorDelegate, var1: SummarySeparatorChatListItem, var2: View) {
      var0.getEventHandler().onTapSummaryJump-sekaTiM(var1.getSummary().getChannelId-o4g7jtM(), var1.getJumpToMsgId-3Eiw7ao(), var1.getSummary().getId());
   }

   public open fun bindView(view: SummarySeparatorView, item: SummarySeparatorChatListItem, metadata: Metadata<SummarySeparatorView>) {
      var1.setDividerColor(var2.getColor());
      var1.setText(var2.getText());
      var1.setIsBeforeContent(var2.isBeforeContent());
      var1.setMoreActionsHandler(new f(this, var2));
      var1.setJumpToBottomHandler(new g(this, var2));
   }

   public open fun createView(parent: ViewGroup): SummarySeparatorView {
      val var2: Context = var1.getContext();
      return new SummarySeparatorView(var2, null, 2, null);
   }

   public override fun isForItem(item: ChatListItem, position: Int): Boolean {
      return var1 is SummarySeparatorChatListItem;
   }
}
