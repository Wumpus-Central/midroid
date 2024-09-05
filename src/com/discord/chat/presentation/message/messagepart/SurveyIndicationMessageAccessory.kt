package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.feedback.SurveyIndication
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

public data class SurveyIndicationMessageAccessory(messageId: MessageId, surveyIndication: SurveyIndication) : SurveyIndicationMessageAccessory(var1, var2) {
   public open val messageId: MessageId
   public final val surveyIndication: SurveyIndication

   fun SurveyIndicationMessageAccessory(var1: java.lang.String, var2: SurveyIndication) {
      q.h(var1, "messageId");
      q.h(var2, "surveyIndication");
      super(var1, "survey indication message", false, 4, null);
      this.messageId = var1;
      this.surveyIndication = var2;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): SurveyIndication {
      return this.surveyIndication;
   }

   public fun copy(messageId: MessageId = ..., surveyIndication: SurveyIndication = ...): SurveyIndicationMessageAccessory {
      q.h(var1, "messageId");
      q.h(var2, "surveyIndication");
      return new SurveyIndicationMessageAccessory(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is SurveyIndicationMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else {
            return q.c(this.surveyIndication, var1.surveyIndication);
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.messageId) * 31 + this.surveyIndication.hashCode();
   }

   public override fun toString(): String {
      val var3: java.lang.String = MessageId.toString-impl(this.messageId);
      val var1: SurveyIndication = this.surveyIndication;
      val var2: StringBuilder = new StringBuilder();
      var2.append("SurveyIndicationMessageAccessory(messageId=");
      var2.append(var3);
      var2.append(", surveyIndication=");
      var2.append(var1);
      var2.append(")");
      return var2.toString();
   }
}
