package com.discord.chat.presentation.list.delegate.messagebundling

import android.content.Context
import com.discord.chat.bridge.MediaType
import com.discord.chat.presentation.list.item.MessageItem
import com.discord.chat.reactevents.ChatViewEventHandler
import com.discord.primitives.ChannelId
import com.discord.primitives.MessageId
import com.discord.reactevents.ReactEvents
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function6
import kotlin.jvm.internal.r

private final val reactEvents: ReactEvents

internal fun MessageItem.getEventHandler(context: Context): ChatViewEventHandler {
   r.h(var0, "<this>");
   r.h(var1, "context");
   return new ChatViewEventHandler(var1, reactEvents, new Function0<Integer>(var0) {
      final MessageItem $this_getEventHandler;

      {
         super(0);
         this.$this_getEventHandler = var1;
      }

      public final Integer invoke() {
         val var1: Int = this.$this_getEventHandler.getReactTag();
         r.e(var1);
         return var1;
      }
   }) {
      private final Function6<MessageId, ChannelId, Integer, MediaType, java.lang.String, Integer, Unit> onMessageLongPressed;
      private final Function2<MessageId, ChannelId, Unit> onMessageTapped;

      {
         super(var1, var2, var3);
      }

      @Override
      public Function6<MessageId, ChannelId, Integer, MediaType, java.lang.String, Integer, Unit> getOnMessageLongPressed() {
         return this.onMessageLongPressed;
      }

      @Override
      public Function2<MessageId, ChannelId, Unit> getOnMessageTapped() {
         return this.onMessageTapped;
      }
   };
}
