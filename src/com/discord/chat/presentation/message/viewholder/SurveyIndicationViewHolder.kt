package com.discord.chat.presentation.message.viewholder

import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.SurveyIndicationMessageAccessory
import com.discord.chat.presentation.message.view.SurveyIndicationView
import com.discord.primitives.MessageId
import kotlin.jvm.functions.Function2

public class SurveyIndicationViewHolder(surveyIndicationView: SurveyIndicationView, eventHandler: ChatEventHandler) : MessagePartViewHolder(var1) {
   private final val surveyIndicationView: SurveyIndicationView
   private final val eventHandler: ChatEventHandler

   init {
      this.surveyIndicationView = var1;
      this.eventHandler = var2;
   }

   public fun bind(surveyAccessory: SurveyIndicationMessageAccessory) {
      this.surveyIndicationView
         .setSurveyIndication-u7_MRrM(
            var1.getMessageId-3Eiw7ao(),
            var1.getSurveyIndication(),
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
            }
         );
   }
}
