package com.discord.chat.presentation.message.view.polls

import com.discord.chat.presentation.message.messagepart.PollMessageAccessory
import com.discord.chat.reactevents.ViewResizeMode
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId

public interface PollPresenter {
   public abstract fun bind(
      accessory: PollMessageAccessory,
      onTapAnswer: (ChannelId, MessageId, String) -> Unit,
      onTapPollAction: (ChannelId, MessageId, String) -> Unit,
      onLongPressImage: (ChannelId, MessageId, String, Int, Int, Int, Int, ViewResizeMode) -> Unit
   ) {
   }
}
