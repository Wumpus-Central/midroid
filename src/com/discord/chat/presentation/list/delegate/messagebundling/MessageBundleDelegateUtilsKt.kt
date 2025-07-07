package com.discord.chat.presentation.list.delegate.messagebundling

import android.content.Context
import com.discord.chat.presentation.list.item.MessageItem
import com.discord.chat.reactevents.ChatViewEventHandler
import com.discord.reactevents.ReactEvents
import kotlin.jvm.functions.Function2
import kotlin.jvm.functions.Function6
import kotlin.jvm.internal.r

private final val reactEvents: ReactEvents

@JvmSynthetic
fun a(var0: MessageItem): Int {
   return getEventHandler$lambda$1(var0);
}

internal fun MessageItem.getEventHandler(context: Context): ChatViewEventHandler {
   r.h(var0, "<this>");
   r.h(var1, "context");
   return new ChatViewEventHandler(var1, reactEvents, new b(var0)) {
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

fun `getEventHandler$lambda$1`(var0: MessageItem): Int {
   val var1: Int = var0.getReactTag();
   r.e(var1);
   return var1;
}
