package com.discord.chat.presentation.message.messagepart

import com.discord.chat.bridge.ephemeral.EphemeralIndication
import com.discord.primitives.MessageId
import kotlin.jvm.internal.q

public data class EphemeralIndicationMessageAccessory(messageId: MessageId, ephemeralIndication: EphemeralIndication) : EphemeralIndicationMessageAccessory(
      var1, var2
   ) {
   public final val ephemeralIndication: EphemeralIndication
   public open val messageId: MessageId

   fun EphemeralIndicationMessageAccessory(var1: java.lang.String, var2: EphemeralIndication) {
      q.h(var1, "messageId");
      q.h(var2, "ephemeralIndication");
      super(var1, "ephemeral indication", false, 4, null);
      this.messageId = var1;
      this.ephemeralIndication = var2;
   }

   public operator fun component1(): MessageId {
      return this.messageId;
   }

   public operator fun component2(): EphemeralIndication {
      return this.ephemeralIndication;
   }

   public fun copy(messageId: MessageId = ..., ephemeralIndication: EphemeralIndication = ...): EphemeralIndicationMessageAccessory {
      q.h(var1, "messageId");
      q.h(var2, "ephemeralIndication");
      return new EphemeralIndicationMessageAccessory(var1, var2, null);
   }

   public override operator fun equals(other: Any?): Boolean {
      if (this === var1) {
         return true;
      } else if (var1 !is EphemeralIndicationMessageAccessory) {
         return false;
      } else {
         var1 = var1;
         if (!MessageId.equals-impl0(this.messageId, var1.messageId)) {
            return false;
         } else {
            return q.c(this.ephemeralIndication, var1.ephemeralIndication);
         }
      }
   }

   public override fun hashCode(): Int {
      return MessageId.hashCode-impl(this.messageId) * 31 + this.ephemeralIndication.hashCode();
   }

   public override fun toString(): String {
      val var1: java.lang.String = MessageId.toString-impl(this.messageId);
      val var3: EphemeralIndication = this.ephemeralIndication;
      val var2: StringBuilder = new StringBuilder();
      var2.append("EphemeralIndicationMessageAccessory(messageId=");
      var2.append(var1);
      var2.append(", ephemeralIndication=");
      var2.append(var3);
      var2.append(")");
      return var2.toString();
   }
}
