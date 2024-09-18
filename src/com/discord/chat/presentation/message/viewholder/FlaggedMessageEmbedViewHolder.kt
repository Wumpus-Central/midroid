package com.discord.chat.presentation.message.viewholder

import com.discord.chat.bridge.Message
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.FlaggedMessageEmbedAccessory
import com.discord.chat.presentation.message.view.FlaggedMessageEmbedView

public class FlaggedMessageEmbedViewHolder(embeddedMessageView: FlaggedMessageEmbedView, eventHandler: ChatEventHandler? = null) : MessagePartViewHolder {
   private final val embeddedMessageView: FlaggedMessageEmbedView
   private final val eventHandler: ChatEventHandler?

   init {
      kotlin.jvm.internal.q.h(var1, "embeddedMessageView");
      super(var1, null);
      this.embeddedMessageView = var1;
      this.eventHandler = var2;
   }

   public fun bind(messageEmbedAccessory: FlaggedMessageEmbedAccessory) {
      kotlin.jvm.internal.q.h(var1, "messageEmbedAccessory");
      val var3: FlaggedMessageEmbedView = this.embeddedMessageView;
      val var4: Message = var1.getMessage();
      var var5: Any = this.eventHandler;
      if (this.eventHandler == null) {
         var5 = ChatEventHandler.Empty.INSTANCE;
      }

      FlaggedMessageEmbedView.setMessage$default(var3, var4, (ChatEventHandler)var5, false, 4, null);
   }
}
