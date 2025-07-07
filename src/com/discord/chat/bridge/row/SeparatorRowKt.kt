package com.discord.chat.bridge.row

import com.discord.chat.presentation.list.item.ChatListItem
import com.discord.chat.presentation.list.item.SeparatorChatListItem
import com.discord.chat.presentation.list.item.SummarySeparatorChatListItem
import kotlin.jvm.internal.r

public fun SeparatorRow.toSeparatorChatListItem(): ChatListItem {
   r.h(var0, "<this>");
   return (ChatListItem)(if (var0.getSummary() != null)
      new SummarySeparatorChatListItem(var0.getColor(), var0.getSummary(), r.c(var0.isBeforeContent(), java.lang.Boolean.TRUE))
      else
      new SeparatorChatListItem(var0.getColor(), var0.getText()));
}
