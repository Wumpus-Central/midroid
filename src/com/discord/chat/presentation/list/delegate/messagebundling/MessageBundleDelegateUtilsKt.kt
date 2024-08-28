package com.discord.chat.presentation.list.delegate.messagebundling

import android.content.Context
import com.discord.chat.presentation.list.item.MessageItem
import com.discord.chat.reactevents.ChatViewEventHandler
import com.discord.reactevents.ReactEvents
import kotlin.jvm.functions.Function0
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function6
import kotlin.jvm.internal.q

private final val reactEvents: ReactEvents

internal fun MessageItem.getEventHandler(context: Context): ChatViewEventHandler {
   q.h(var0, "<this>");
   q.h(var1, "context");
   return new ChatViewEventHandler(var1, reactEvents, new Function0(var0) {
      final MessageItem $this_getEventHandler;

      {
         super(0);
         this.$this_getEventHandler = var1;
      }

      public final Integer invoke() {
         val var1: Int = this.$this_getEventHandler.getReactTag();
         q.e(var1);
         return var1;
      }
   }) {
      private final Function6 onMessageLongPressed;
      private final Function2 onMessageTapped;

      {
         super(var1, var2, var3);
      }

      @Override
      public Function6 getOnMessageLongPressed() {
         return this.onMessageLongPressed;
      }

      @Override
      public Function2 getOnMessageTapped() {
         return this.onMessageTapped;
      }
   };
}
