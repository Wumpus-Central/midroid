package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.ephemeral.EphemeralIndication
import com.discord.primitives.MessageId
import kotlin.jvm.internal.r

public data class EphemeralIndicationMessageAccessory(messageId: MessageId, ephemeralIndication: EphemeralIndication) : EphemeralIndicationMessageAccessory(
      var1, var2
   ) {
   public final val ephemeralIndication: EphemeralIndication
   public open val messageId: MessageId

   fun EphemeralIndicationMessageAccessory(var1: java.lang.String, var2: EphemeralIndication) {
      super(var1, "ephemeral indication", false, 4, null);
      this.messageId = var1;
      this.ephemeralIndication = var2;
   }

   public operator fun component1(): MessageId {
      return this.getMessageId-3Eiw7ao();
   }

   public operator fun component2(): EphemeralIndication {
      return this.ephemeralIndication;
   }

   public fun copy(messageId: MessageId = ..., ephemeralIndication: EphemeralIndication = ...): EphemeralIndicationMessageAccessory {
      r.h(var1, "messageId");
      r.h(var2, "ephemeralIndication");
      return new EphemeralIndicationMessageAccessory(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EphemeralIndicationMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.getMessageId-3Eiw7ao(), var1.getMessageId-3Eiw7ao())) {
            return false;
         } else {
            return r.c(this.ephemeralIndication, var1.ephemeralIndication);
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.getMessageId-3Eiw7ao()) * 31 + this.ephemeralIndication.hashCode();
   }

   public override fun toString(): String {
      val var2: java.lang.String = MessageId.toString-impl(this.getMessageId-3Eiw7ao());
      val var3: EphemeralIndication = this.ephemeralIndication;
      val var1: StringBuilder = new StringBuilder();
      var1.append("EphemeralIndicationMessageAccessory(messageId=");
      var1.append(var2);
      var1.append(", ephemeralIndication=");
      var1.append(var3);
      var1.append(")");
      return var1.toString();
   }
}
