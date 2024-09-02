package com.discord.chat.presentation.message.viewholder

import android.view.View
import com.discord.chat.presentation.message.messagepart.PollMessageAccessory
import com.discord.chat.presentation.message.view.polls.PollPresenter
import com.discord.chat.reactevents.ViewResizeMode
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId

public class PollViewHolder(pollView: PollPresenter) : MessagePartViewHolder, PollPresenter {
   private final val pollView: PollPresenter

   init {
      kotlin.jvm.internal.q.h(var1, "pollView");
      super(var1 as View, null);
      this.pollView = var1;
   }

   public override fun bind(
      accessory: PollMessageAccessory,
      onTapAnswer: (ChannelId, MessageId, String) -> Unit,
      onTapPollAction: (ChannelId, MessageId, String) -> Unit,
      onLongPressImage: (ChannelId, MessageId, String, Int, Int, Int, Int, ViewResizeMode) -> Unit
   ) {
      kotlin.jvm.internal.q.h(var1, "accessory");
      kotlin.jvm.internal.q.h(var2, "onTapAnswer");
      kotlin.jvm.internal.q.h(var3, "onTapPollAction");
      kotlin.jvm.internal.q.h(var4, "onLongPressImage");
      this.pollView.bind(var1, var2, var3, var4);
   }
}
