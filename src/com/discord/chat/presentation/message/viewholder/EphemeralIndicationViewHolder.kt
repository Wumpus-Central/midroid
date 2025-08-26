package com.discord.chat.presentation.message.viewholder

import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.EphemeralIndicationMessageAccessory
import com.discord.chat.presentation.message.view.EphemeralIndicationView
import com.discord.primitives.MessageId
import kotlin.jvm.functions.Function2

public class EphemeralIndicationViewHolder(ephemeralIndicationView: EphemeralIndicationView, eventHandler: ChatEventHandler) : MessagePartViewHolder(var1) {
   private final val ephemeralIndicationView: EphemeralIndicationView
   private final val eventHandler: ChatEventHandler

   init {
      this.ephemeralIndicationView = var1;
      this.eventHandler = var2;
   }

   @JvmStatic
   fun `bind$lambda$1$lambda$0`(var0: EphemeralIndicationViewHolder, var1: EphemeralIndicationMessageAccessory, var2: java.lang.String): Unit {
      ChatEventHandler.DefaultImpls.onLinkClicked-u7_MRrM$default(var0.eventHandler, var1.getMessageId-3Eiw7ao(), var2, null, 4, null);
      return Unit.a;
   }

   public fun bind(ephemeralAccessory: EphemeralIndicationMessageAccessory) {
      this.ephemeralIndicationView
         .setEphemeralIndication-AFFcxXc(
            var1.getMessageId-3Eiw7ao(),
            var1.getEphemeralIndication(),
            new Function2<MessageId, LinkContentNode, Unit>(this.eventHandler) {
               {
                  super(
                     2,
                     var1,
                     ChatEventHandler::class.java,
                     "onLinkClicked",
                     "onLinkClicked-ntcYbpo(Ljava/lang/String;Lcom/discord/chat/bridge/contentnode/LinkContentNode;)V",
                     0
                  );
               }

               public final void invoke_ntcYbpo/* $VF was: invoke-ntcYbpo*/(java.lang.String var1, LinkContentNode var2) {
                  (super.receiver as ChatEventHandler).onLinkClicked-ntcYbpo(var1, var2);
               }
            },
            new l(this, var1)
         );
   }
}
