package com.discord.chat.presentation.message.viewholder

import com.discord.chat.bridge.contentnode.LinkContentNode
import com.discord.chat.presentation.events.ChatEventHandler
import com.discord.chat.presentation.message.messagepart.SurveyIndicationMessageAccessory
import com.discord.chat.presentation.message.view.SurveyIndicationView
import com.discord.primitives.MessageId
import kotlin.jvm.functions.Function2

public class SurveyIndicationViewHolder(surveyIndicationView: SurveyIndicationView, eventHandler: ChatEventHandler) : MessagePartViewHolder {
   private final val eventHandler: ChatEventHandler
   private final val surveyIndicationView: SurveyIndicationView

   init {
      kotlin.jvm.internal.r.h(var1, "surveyIndicationView");
      kotlin.jvm.internal.r.h(var2, "eventHandler");
      super(var1, null);
      this.surveyIndicationView = var1;
      this.eventHandler = var2;
   }

   public fun bind(surveyAccessory: SurveyIndicationMessageAccessory) {
      kotlin.jvm.internal.r.h(var1, "surveyAccessory");
      this.surveyIndicationView
         .setSurveyIndication_u7_MRrM(
            var1.getMessageId_3Eiw7ao(),
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

               public final void invoke_ntcYbpo(java.lang.String var1, LinkContentNode var2) {
                  kotlin.jvm.internal.r.h(var1, "p0");
                  kotlin.jvm.internal.r.h(var2, "p1");
                  (super.receiver as ChatEventHandler).onLinkClicked_ntcYbpo(var1, var2);
               }
            }
         );
   }
}
