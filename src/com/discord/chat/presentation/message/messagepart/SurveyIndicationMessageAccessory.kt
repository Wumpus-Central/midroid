package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.feedback.SurveyIndication
import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

public data class SurveyIndicationMessageAccessory(messageId: MessageId, surveyIndication: SurveyIndication) : SurveyIndicationMessageAccessory(var1, var2) {
   public open val messageId: MessageId
   public final val surveyIndication: SurveyIndication

   fun SurveyIndicationMessageAccessory(var1: java.lang.String, var2: SurveyIndication) {
      super(var1, "survey indication message", false, 4, null);
      this.messageId = var1;
      this.surveyIndication = var2;
   }

   public operator fun component1(): MessageId {
      return this.getMessageId-3Eiw7ao();
   }

   public operator fun component2(): SurveyIndication {
      return this.surveyIndication;
   }

   public fun copy(messageId: MessageId = ..., surveyIndication: SurveyIndication = ...): SurveyIndicationMessageAccessory {
      r.h(var1, "messageId");
      r.h(var2, "surveyIndication");
      return new SurveyIndicationMessageAccessory(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SurveyIndicationMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.getMessageId-3Eiw7ao(), var1.getMessageId-3Eiw7ao())) {
            return false;
         } else {
            return r.c(this.surveyIndication, var1.surveyIndication);
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.getMessageId-3Eiw7ao()) * 31 + this.surveyIndication.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.getMessageId-3Eiw7ao());
      val var2: SurveyIndication = this.surveyIndication;
      val var3: StringBuilder = new StringBuilder();
      var3.append("SurveyIndicationMessageAccessory(messageId=");
      var3.append(var1);
      var3.append(", surveyIndication=");
      var3.append(var2);
      var3.append(")");
      return var3.toString();
   }
}
