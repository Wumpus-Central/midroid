package com.discord.chat.presentation.message.viewholder

import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.EphemeralIndicationMessageAccessory
import com.discord.chat.presentation.message.view.EphemeralIndicationView
import com.discord.primitives.MessageId
import kotlin.jvm.functions.Function1
import kotlin.jvm.functions.Function2

public class EphemeralIndicationViewHolder(ephemeralIndicationView: EphemeralIndicationView, eventHandler: ChatEventHandler) : MessagePartViewHolder {
   private final val ephemeralIndicationView: EphemeralIndicationView
   private final val eventHandler: ChatEventHandler

   init {
      kotlin.jvm.internal.r.h(var1, "ephemeralIndicationView");
      kotlin.jvm.internal.r.h(var2, "eventHandler");
      super(var1, null);
      this.ephemeralIndicationView = var1;
      this.eventHandler = var2;
   }

   public fun bind(ephemeralAccessory: EphemeralIndicationMessageAccessory) {
      kotlin.jvm.internal.r.h(var1, "ephemeralAccessory");
      this.ephemeralIndicationView
         .setEphemeralIndication_AFFcxXc(
            var1.getMessageId_3Eiw7ao(),
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

               public final void invoke_ntcYbpo(java.lang.String var1, LinkContentNode var2) {
                  kotlin.jvm.internal.r.h(var1, "p0");
                  kotlin.jvm.internal.r.h(var2, "p1");
                  (super.receiver as ChatEventHandler).onLinkClicked_ntcYbpo(var1, var2);
               }
            },
            new Function1<java.lang.String, Unit>(this, var1) {
               final EphemeralIndicationMessageAccessory $ephemeralAccessory;
               final EphemeralIndicationViewHolder this$0;

               {
                  super(1);
                  this.this$0 = var1;
                  this.$ephemeralAccessory = var2;
               }

               public final void invoke(java.lang.String var1) {
                  kotlin.jvm.internal.r.h(var1, "it");
                  ChatEventHandler.DefaultImpls.onLinkClicked_u7_MRrM$default(
                     EphemeralIndicationViewHolder.access$getEventHandler$p(this.this$0), this.$ephemeralAccessory.getMessageId_3Eiw7ao(), var1, null, 4, null
                  );
               }
            }
         );
   }
}
